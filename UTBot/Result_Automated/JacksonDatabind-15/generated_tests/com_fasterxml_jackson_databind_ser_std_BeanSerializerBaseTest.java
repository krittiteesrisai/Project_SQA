package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.util.NameTransformer.Chained;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap;
import com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.SerializeExceptFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import java.lang.reflect.Field;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.FilterExceptFilter;
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolve(com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): False}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 *  */
    @Test
    public void testResolve_PropWillSuppressNulls() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        NumberSerializers.IntegerSerializer _serializer = ((NumberSerializers.IntegerSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer"));
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_suppressNulls", true);
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null, null};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        
        beanAsArraySerializer.resolve(null);
        
        BeanPropertyWriter finalBeanAsArraySerializer_filteredProps0 = beanAsArraySerializer._filteredProps[0];
        BeanPropertyWriter finalBeanAsArraySerializer_filteredProps1 = beanAsArraySerializer._filteredProps[1];
        
        assertNull(finalBeanAsArraySerializer_filteredProps0);
        
        assertNull(finalBeanAsArraySerializer_filteredProps1);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): False}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 *  */
    @Test
    public void testResolve_IGreaterOrEqualFilteredCount() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NumberSerializers.IntegerSerializer _serializer = ((NumberSerializers.IntegerSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        _props[0] = beanPropertyWriter;
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        TypeWrappedSerializer _nullValueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        
        BeanPropertyWriter beanPropertyWriter1 = beanAsArraySerializer._props[0];
        JsonSerializer initialBeanAsArraySerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(beanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        
        beanAsArraySerializer.resolve(impl);
        
        BeanPropertyWriter beanPropertyWriter2 = beanAsArraySerializer._props[0];
        JsonSerializer finalBeanAsArraySerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(beanPropertyWriter2, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        
        assertFalse(initialBeanAsArraySerializer_props0_nullSerializer == finalBeanAsArraySerializer_props0_nullSerializer);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): False}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 *  */
    @Test
    public void testResolve_W2EqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NumberSerializers.IntegerSerializer _serializer = ((NumberSerializers.IntegerSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        _props[0] = beanPropertyWriter;
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        TypeWrappedSerializer _nullValueSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_nullValueSerializer", _nullValueSerializer);
        
        BeanPropertyWriter beanPropertyWriter1 = beanSerializer._props[0];
        JsonSerializer initialBeanSerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(beanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        
        beanSerializer.resolve(impl);
        
        BeanPropertyWriter beanPropertyWriter2 = beanSerializer._props[0];
        JsonSerializer finalBeanSerializer_props0_nullSerializer = ((JsonSerializer) getFieldValue(beanPropertyWriter2, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer"));
        BeanPropertyWriter finalBeanSerializer_filteredProps0 = beanSerializer._filteredProps[0];
        
        assertFalse(initialBeanSerializer_props0_nullSerializer == finalBeanSerializer_props0_nullSerializer);
        
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
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        
        beanSerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): True}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.AnyGetterWriter#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 *  */
    @Test
    public void testResolve__anyGetterWriterNotEqualsNull() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        AnyGetterWriter _anyGetterWriter = ((AnyGetterWriter) createInstance("com.fasterxml.jackson.databind.ser.AnyGetterWriter"));
        StdKeySerializer _serializer = ((StdKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializer"));
        setField(_anyGetterWriter, "com.fasterxml.jackson.databind.ser.AnyGetterWriter", "_serializer", _serializer);
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_anyGetterWriter", _anyGetterWriter);
        
        beanAsArraySerializer.resolve(null);
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
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NumberSerializers.IntegerSerializer _serializer = ((NumberSerializers.IntegerSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        IterableSerializer _nullSerializer = ((IterableSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.IterableSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        _props[0] = beanPropertyWriter;
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
    public void testResolve_NullSerEqualsNull() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        NumberSerializers.IntegerSerializer _serializer = ((NumberSerializers.IntegerSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer"));
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        unwrappingBeanSerializer.resolve(impl);
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
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {null};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve(BeanSerializerBase.java:282) */
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
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve(BeanSerializerBase.java:279) */
        beanAsArraySerializer.resolve(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#resolve(com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code ((_filteredProps == null)): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _props.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonSerializer<Object> nullSer = provider.findNullValueSerializer(prop);
 *  */
    @Test
    public void testResolve_ThrowNullPointerException_3() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        _props[0] = ((BeanPropertyWriter) attributePropertyWriter);
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve(BeanSerializerBase.java:283) */
        beanSerializer.resolve(null);
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
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.resolve(BeanSerializerBase.java:279) */
        beanSerializer.resolve(null);
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
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.executesCondition {@code (props == null): False}
 * @utbot.executesCondition {@code (props.length == 0): False}
 * @utbot.executesCondition {@code (transformer == null): False}
 *  */
    @Test
    public void testRename_TransformerNotEqualsNull() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
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
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method rename([Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;, com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#rename(com.fasterxml.jackson.databind.ser.BeanPropertyWriter[],com.fasterxml.jackson.databind.util.NameTransformer)}
     */
    @Test
    public void testRenameWithNonEmptyObjectArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = {null, null, null};
        
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
        BeanPropertyWriter finalBeanPropertyWriterArray2 = beanPropertyWriterArray[2];
        
        assertNull(finalBeanPropertyWriterArray0);
        
        assertNull(finalBeanPropertyWriterArray1);
        
        assertNull(finalBeanPropertyWriterArray2);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method rename([Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;, com.fasterxml.jackson.databind.util.NameTransformer)
    
    @Test
    public void testRename1() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = anonymousNameTransformer;
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] expected = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            BeanPropertyWriter beanPropertyWriter1 = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name1 = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = "nullnull";
            setField(_name1, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            setField(beanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name1);
            expected[0] = beanPropertyWriter1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename2() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[1] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = anonymousNameTransformer;
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] expected = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter1 = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            NameTransformer.Chained _nameTransformer = ((NameTransformer.Chained) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
            setField(_nameTransformer, "com.fasterxml.jackson.databind.util.NameTransformer$Chained", "_t1", anonymousNameTransformer);
            setField(unwrappingBeanPropertyWriter1, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", "_nameTransformer", _nameTransformer);
            SerializedString _name1 = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = "nullnull";
            setField(_name1, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            setField(unwrappingBeanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name1);
            expected[1] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter1);
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
            
            BeanPropertyWriter finalBeanPropertyWriterArray0 = beanPropertyWriterArray[0];
            
            assertNull(finalBeanPropertyWriterArray0);
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename3() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = anonymousNameTransformer;
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] expected = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter1 = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            NameTransformer.Chained _nameTransformer = ((NameTransformer.Chained) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
            setField(_nameTransformer, "com.fasterxml.jackson.databind.util.NameTransformer$Chained", "_t1", anonymousNameTransformer);
            setField(unwrappingBeanPropertyWriter1, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", "_nameTransformer", _nameTransformer);
            SerializedString _name1 = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = "nullnull";
            setField(_name1, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            setField(unwrappingBeanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name1);
            expected[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter1);
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename4() throws Exception  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = anonymousNameTransformer;
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) renameMethod.invoke(null, renameMethodArguments));
            
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] expected = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            BeanPropertyWriter beanPropertyWriter1 = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name1 = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = "nullnull";
            setField(_name1, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            setField(beanPropertyWriter1, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name1);
            expected[0] = beanPropertyWriter1;
            
            int expectedSize = expected.length;
            assertEquals(expectedSize, actual.length);
            assertTrue(deepEquals(expected, actual));
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method rename([Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;, com.fasterxml.jackson.databind.util.NameTransformer)
    
    @Test
    public void testRename5() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[5];
            Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
            beanPropertyWriterArray[4] = ((BeanPropertyWriter) multiView);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView.rename(FilteredBeanPropertyWriter.java:98)
                com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView.rename(FilteredBeanPropertyWriter.java:83)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = anonymousNameTransformer;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename6() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
            beanPropertyWriterArray[0] = ((BeanPropertyWriter) multiView);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView.rename(FilteredBeanPropertyWriter.java:98)
                com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView.rename(FilteredBeanPropertyWriter.java:83)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = anonymousNameTransformer;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename7() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
            beanPropertyWriterArray[1] = ((BeanPropertyWriter) multiView);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView.rename(FilteredBeanPropertyWriter.java:98)
                com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView.rename(FilteredBeanPropertyWriter.java:83)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = anonymousNameTransformer;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename8() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:54)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:24)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
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
    
    @Test
    public void testRename9() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
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
    
    @Test
    public void testRename10() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[5];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[4] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:54)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:24)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
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
    
    @Test
    public void testRename11() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[1] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:54)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:24)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
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
    
    @Test
    public void testRename12() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[1] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
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
    
    @Test
    public void testRename13() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[1] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
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
    
    @Test
    public void testRename14() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:54)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:24)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
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
    
    @Test
    public void testRename15() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
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
    
    @Test
    public void testRename16() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            String _value = "";
            setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[1] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer anonymousNameTransformer1 = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            NameTransformer.Chained chained = new NameTransformer.Chained(anonymousNameTransformer, anonymousNameTransformer1);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained1;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename17() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[1] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer anonymousNameTransformer1 = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            NameTransformer.Chained chained = new NameTransformer.Chained(anonymousNameTransformer, anonymousNameTransformer1);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained1;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename18() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[4];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[3] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:54)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:24)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained1;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename19() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[5];
            AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(attributePropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[4] = ((BeanPropertyWriter) attributePropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained1;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename20() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[2];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[1] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:54)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:24)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained1;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename21() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:54)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:24)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained1;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename22() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:54)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:24)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained1;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename23() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained1;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename24() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[0] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained1;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename25() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[4];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[3] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
            NameTransformer.Chained chained3 = new NameTransformer.Chained(null, chained2);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained3;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename26() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[3];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[2] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
            NameTransformer.Chained chained3 = new NameTransformer.Chained(null, chained2);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained3;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename27() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[3];
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[2] = beanPropertyWriter;
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
            NameTransformer.Chained chained3 = new NameTransformer.Chained(null, chained2);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:324)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained3;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename28() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[3];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[2] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$3"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
            NameTransformer.Chained chained3 = new NameTransformer.Chained(null, chained2);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:54)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:24)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained3;
            try {
                renameMethod.invoke(null, renameMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameTransformer.class, "NOP", prevNOP);
        }
    }
    
    @Test
    public void testRename29() throws Throwable  {
        NameTransformer prevNOP = NameTransformer.NOP;
        try {
            NameTransformer nop = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
            Class nameTransformerClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
            setStaticField(nameTransformerClazz, "NOP", nop);
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] beanPropertyWriterArray = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[3];
            UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            beanPropertyWriterArray[2] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
            NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$4"));
            NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
            NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
            NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
            NameTransformer.Chained chained3 = new NameTransformer.Chained(null, chained2);
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:120)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:54)
                com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.rename(UnwrappingBeanPropertyWriter.java:24)
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.rename(BeanSerializerBase.java:258) */
            Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
            Class beanPropertyWriterArrayType = Class.forName("[Lcom.fasterxml.jackson.databind.ser.BeanPropertyWriter;");
            Method renameMethod = beanSerializerBaseClazz.getDeclaredMethod("rename", beanPropertyWriterArrayType, nameTransformerClazz);
            renameMethod.setAccessible(true);
            java.lang.Object[] renameMethodArguments = new java.lang.Object[2];
            renameMethodArguments[0] = ((Object) beanPropertyWriterArray);
            renameMethodArguments[1] = chained3;
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
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
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
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_VisitorNotEqualsNull_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        JsonFormatVisitorWrapper.Base base = new JsonFormatVisitorWrapper.Base();
        
        beanSerializer.acceptJsonFormatVisitor(base, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_VisitorNotEqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        
        beanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): False}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} twice
 *  */
    @Test
    public void testAcceptJsonFormatVisitor__propertyFilterIdEqualsNull() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        _props[0] = ((BeanPropertyWriter) singleView);
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        beanAsArraySerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): False}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} twice
 *  */
    @Test
    public void testAcceptJsonFormatVisitor__propertyFilterIdEqualsNull_1() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        _props[0] = ((BeanPropertyWriter) singleView);
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        beanAsArraySerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): False}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} twice
 *  */
    @Test
    public void testAcceptJsonFormatVisitor__propertyFilterIdEqualsNull_2() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(singleView, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        _props[0] = ((BeanPropertyWriter) singleView);
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        beanAsArraySerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): False}
 * @utbot.executesCondition {@code (_propertyFilterId != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} once
 *  */
    @Test
    public void testAcceptJsonFormatVisitor__propertyFilterIdNotEqualsNull() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
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
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        beanAsArraySerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        CollectionType _declaredType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_hash", 58685440);
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 0);
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        setField(val$visitor, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base", "_provider", _provider);
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 58685439 out of bounds for length 0]
            com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap.find(JsonSerializerMap.java:57)
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:70)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:503)
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.depositSchemaProperty(UnwrappingBeanPropertyWriter.java:145)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:791) */
        unwrappingBeanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        CollectionType _declaredType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(unwrappingBeanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 0);
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        setField(val$visitor, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base", "_provider", _provider);
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap.find(JsonSerializerMap.java:57)
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:70)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:503)
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.depositSchemaProperty(UnwrappingBeanPropertyWriter.java:145)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:791) */
        unwrappingBeanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _props[i].depositSchemaProperty(objectVisitor);
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:791) */
        beanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < _props.length; i++)
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:790) */
        beanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException_2() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        setField(val$visitor, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base", "_provider", _provider);
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey.hash(SerializerCache.java:232)
            com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey.<init>(SerializerCache.java:220)
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:66)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:503)
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.depositSchemaProperty(UnwrappingBeanPropertyWriter.java:145)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:791) */
        beanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < _props.length; i++)
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException_3() throws Exception  {
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
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:786) */
        beanAsArraySerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: filter.depositSchemaProperty(_props[i], objectVisitor, visitor.getProvider());
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException_6() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        byte[] _propertyFilterId = {};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_propertyFilterId", _propertyFilterId);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:787) */
        beanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < _props.length; i++)
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException_4() throws Exception  {
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
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:786) */
        beanAsArraySerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_propertyFilterId != null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < _props.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAcceptJsonFormatVisitor_ThrowNullPointerException_5() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = new com.fasterxml.jackson.databind.ser.BeanPropertyWriter[1];
        UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        _props[0] = ((BeanPropertyWriter) unwrappingBeanPropertyWriter);
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        setField(val$visitor, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base", "_provider", _provider);
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey.hash(SerializerCache.java:232)
            com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey.resetUntyped(SerializerCache.java:264)
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:68)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:503)
            com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.depositSchemaProperty(UnwrappingBeanPropertyWriter.java:145)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.acceptJsonFormatVisitor(BeanSerializerBase.java:791) */
        unwrappingBeanSerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): False}
 * @utbot.executesCondition {@code (_propertyFilterId != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#expectObjectFormat(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: PropertyFilter filter = findPropertyFilter(visitor.getProvider(), _propertyFilterId, null);
 *  */
    @Test(expected = JsonMappingException.class)
    public void testAcceptJsonFormatVisitor_ThrowJsonMappingException() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
        beanAsArraySerializer.acceptJsonFormatVisitor(anonymousBase, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#acceptJsonFormatVisitor(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (visitor == null): False}
 * @utbot.executesCondition {@code (_propertyFilterId != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#expectObjectFormat(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper#getProvider()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findPropertyFilter(com.fasterxml.jackson.databind.SerializerProvider,java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: PropertyFilter filter = findPropertyFilter(visitor.getProvider(), _propertyFilterId, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitor_ThrowIllegalArgumentException() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        JsonFormatVisitorWrapper.Base anonymousBase = ((JsonFormatVisitorWrapper.Base) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1"));
        com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base val$visitor = ((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base) createInstance("com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor$Base"));
        setField(anonymousBase, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter$1", "val$visitor", val$visitor);
        DefaultSerializerProvider.Impl _provider = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_cfgFailOnUnknownId", true);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(_provider, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        setField(anonymousBase, "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper$Base", "_provider", _provider);
        
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
        // 12 occurrences of:
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
    public void testGetSchema_ThrowNullPointerException() throws Exception  {
        JsonNodeFactory prevInstance = JsonNodeFactory.instance;
        try {
            JsonNodeFactory instance = new JsonNodeFactory(false);
            Class jsonNodeFactoryClazz = Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory");
            setStaticField(jsonNodeFactoryClazz, "instance", instance);
            BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.getSchema] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.getSchema(BeanSerializerBase.java:740) */
            beanSerializer.getSchema(null, null);
        } finally {
            setStaticField(JsonNodeFactory.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code ((property == null || intr == null)): True}
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
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class managedReferencePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, managedReferencePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = managedReferenceProperty;
        BeanSerializer actual = ((BeanSerializer) createContextualMethod.invoke(beanSerializer, createContextualMethodArguments));
        
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
    public void testCreateContextual_ShapeNotEqualsJsonFormatShapeARRAY_2() throws Exception  {
        NopAnnotationIntrospector prevInstance = NopAnnotationIntrospector.instance;
        try {
            NopAnnotationIntrospector instance = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            Class nopAnnotationIntrospectorClazz = Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector");
            setStaticField(nopAnnotationIntrospectorClazz, "instance", instance);
            UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
            DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
            
            UnwrappingBeanSerializer actual = ((UnwrappingBeanSerializer) unwrappingBeanSerializer.createContextual(impl, null));
            
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
            
            JsonFormat.Shape actual_serializationShape = actual._serializationShape;
            assertNull(actual_serializationShape);
            
            Class actual_handledType = actual._handledType;
            assertNull(actual_handledType);
            
        } finally {
            setStaticField(NopAnnotationIntrospector.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code (shape == JsonFormat.Shape.ARRAY): False}
 * @utbot.returnsFrom {@code return contextual;}
 *  */
    @Test
    public void testCreateContextual_ShapeNotEqualsJsonFormatShapeARRAY() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        UnwrappingBeanSerializer actual = ((UnwrappingBeanSerializer) unwrappingBeanSerializer.createContextual(impl, null));
        
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
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class managedReferencePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, managedReferencePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = managedReferenceProperty;
        BeanSerializer actual = ((BeanSerializer) createContextualMethod.invoke(beanSerializer, createContextualMethodArguments));
        
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
 * @utbot.executesCondition {@code (shape == JsonFormat.Shape.ARRAY): True}
 * @utbot.returnsFrom {@code return contextual.asArraySerializer();}
 *  */
    @Test
    public void testCreateContextual_ShapeEqualsJsonFormatShapeARRAY() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code ((property == null || intr == null)): True}
 * @utbot.executesCondition {@code (shape == JsonFormat.Shape.ARRAY): False}
 * @utbot.returnsFrom {@code return contextual;}
 *  */
    @Test
    public void testCreateContextual_ShapeNotEqualsJsonFormatShapeARRAY_1() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
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
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JsonSerializer<?> ser = provider.findValueSerializer(oiw.idType, property);
 *  */
    @Test
    public void testCreateContextual_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        CollectionType idType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(idType, "com.fasterxml.jackson.databind.JavaType", "_hash", 254);
        setField(_objectIdWriter, "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "idType", idType);
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter", _objectIdWriter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 0);
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_cacheKey, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_hashCode", -255);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.ArrayIndexOutOfBoundsException: Index 253 out of bounds for length 0]
            com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap.find(JsonSerializerMap.java:57)
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:70)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:503)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(BeanSerializerBase.java:493) */
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
        try {
            createContextualMethod.invoke(beanSerializer, createContextualMethodArguments);
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
    public void testCreateContextual_ThrowIndexOutOfBoundsException() throws Throwable  {
        ObjectIdWriter objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        CollectionType idType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(objectIdWriter, "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "idType", idType);
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(null, objectIdWriter, null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 0);
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        Object singleView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$SingleView");
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class singleViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, singleViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = singleView;
        try {
            createContextualMethod.invoke(unwrappingBeanSerializer, createContextualMethodArguments);
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
    public void testCreateContextual_ThrowNullPointerException() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(BeanSerializerBase.java:384) */
        beanSerializer.createContextual(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#createContextual(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.executesCondition {@code ((property == null || intr == null)): True}
 * @utbot.executesCondition {@code (accessor != null): False}
 * @utbot.executesCondition {@code (accessor != null): False}
 * @utbot.executesCondition {@code (oiw != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonSerializer<?> ser = provider.findValueSerializer(oiw.idType, property);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_1() throws Throwable  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        ManagedReferenceProperty managedReferenceProperty = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException] */
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
 * @utbot.executesCondition {@code (accessor != null): False}
 * @utbot.executesCondition {@code (accessor != null): False}
 * @utbot.executesCondition {@code (oiw != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonSerializer<?> ser = provider.findValueSerializer(oiw.idType, property);
 *  */
    @Test
    public void testCreateContextual_ThrowNullPointerException_2() throws Exception  {
        ObjectIdWriter objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(null, objectIdWriter, null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException] */
        unwrappingBeanSerializer.createContextual(impl, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual1() throws Exception  {
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
        ObjectIdValueProperty objectIdValueProperty = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class objectIdValuePropertyType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, objectIdValuePropertyType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = objectIdValueProperty;
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
    public void testCreateContextual2() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        CollectionType idType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(idType, "com.fasterxml.jackson.databind.JavaType", "_hash", 4194304);
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
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 1);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        FailingSerializer value = ((FailingSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.FailingSerializer"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "value", value);
        _buckets[0] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", key);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        
        ReadOnlyClassToSerializerMap impl_knownSerializers = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object impl_knownSerializers_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0 = get(impl_knownSerializers_knownSerializers_map_knownSerializers_map_buckets, 0);
        SerializerCache.TypeKey impl_knownSerializers_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0_knownSerializers_map_buckets0Key = ((SerializerCache.TypeKey) getFieldValue(impl_knownSerializers_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key"));
        JavaType initialImpl_knownSerializers_map_buckets0Key_type = ((JavaType) getFieldValue(impl_knownSerializers_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0_knownSerializers_map_buckets0Key, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_type"));
        
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, multiViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = multiView;
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
        String actual_objectIdWriterSerializer_msg = ((String) getFieldValue(actual_objectIdWriterSerializer, "com.fasterxml.jackson.databind.ser.impl.FailingSerializer", "_msg"));
        assertNull(actual_objectIdWriterSerializer_msg);
        
        Class actual_objectIdWriterSerializer_handledType = ((Class) getFieldValue(actual_objectIdWriterSerializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_objectIdWriterSerializer_handledType);
        
        boolean actual_objectIdWriterAlwaysAsId = actual_objectIdWriter.alwaysAsId;
        assertFalse(actual_objectIdWriterAlwaysAsId);
        
        JsonFormat.Shape actual_serializationShape = actual._serializationShape;
        assertNull(actual_serializationShape);
        
        assertTrue(deepEquals(expected, actual));
        
        ReadOnlyClassToSerializerMap impl_knownSerializers1 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers1_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers1, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers1_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers1_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object impl_knownSerializers1_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0 = get(impl_knownSerializers1_knownSerializers_map_knownSerializers_map_buckets, 0);
        SerializerCache.TypeKey impl_knownSerializers1_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0_knownSerializers_map_buckets0Key = ((SerializerCache.TypeKey) getFieldValue(impl_knownSerializers1_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key"));
        int finalImpl_knownSerializers_map_buckets0Key_hashCode = ((Integer) getFieldValue(impl_knownSerializers1_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0_knownSerializers_map_buckets0Key, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_hashCode"));
        ReadOnlyClassToSerializerMap impl_knownSerializers2 = ((ReadOnlyClassToSerializerMap) getFieldValue(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers"));
        JsonSerializerMap impl_knownSerializers2_knownSerializers_map = ((JsonSerializerMap) getFieldValue(impl_knownSerializers2, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map"));
        Object impl_knownSerializers2_knownSerializers_map_knownSerializers_map_buckets = getFieldValue(impl_knownSerializers2_knownSerializers_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets");
        Object impl_knownSerializers2_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0 = get(impl_knownSerializers2_knownSerializers_map_knownSerializers_map_buckets, 0);
        SerializerCache.TypeKey impl_knownSerializers2_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0_knownSerializers_map_buckets0Key = ((SerializerCache.TypeKey) getFieldValue(impl_knownSerializers2_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key"));
        JavaType finalImpl_knownSerializers_map_buckets0Key_type = ((JavaType) getFieldValue(impl_knownSerializers2_knownSerializers_map_knownSerializers_map_buckets_knownSerializers_map_buckets0_knownSerializers_map_buckets0Key, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_type"));
        
        assertFalse(initialImpl_knownSerializers_map_buckets0Key_type == finalImpl_knownSerializers_map_buckets0Key_type);
        
        assertEquals(4194303, finalImpl_knownSerializers_map_buckets0Key_hashCode);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test
    public void testCreateContextual3() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        CollectionLikeType idType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(key, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_type", idType);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        _buckets[38] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(BeanSerializerBase.java:493) */
        beanSerializer.createContextual(impl, beanPropertyWriter);
    }
    
    @Test
    public void testCreateContextual4() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        CollectionType idType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
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
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(key, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_isTyped", true);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        _buckets[38] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(BeanSerializerBase.java:493) */
        beanSerializer.createContextual(impl, beanPropertyWriter);
    }
    
    @Test
    public void testCreateContextual5() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        CollectionType idType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(idType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
        setField(_objectIdWriter, "com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter", "idType", idType);
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter", _objectIdWriter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(BeanSerializerBase.java:493) */
        beanSerializer.createContextual(impl, null);
    }
    
    @Test
    public void testCreateContextual6() throws Throwable  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        CollectionType idType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
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
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        Object next = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(next, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "next", next);
        _buckets[38] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(BeanSerializerBase.java:493) */
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, attributePropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = attributePropertyWriter;
        try {
            createContextualMethod.invoke(beanSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual7() throws Throwable  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        CollectionLikeType idType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        CollectionType _type = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(key, "com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey", "_type", _type);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        _buckets[38] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        AttributePropertyWriter attributePropertyWriter = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:505)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(BeanSerializerBase.java:493) */
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class attributePropertyWriterType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, attributePropertyWriterType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = attributePropertyWriter;
        try {
            createContextualMethod.invoke(beanSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCreateContextual8() throws Throwable  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        CollectionType idType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(idType, "com.fasterxml.jackson.databind.JavaType", "_hash", 64);
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
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 1);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        MapSerializer value = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "value", value);
        _buckets[0] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", key);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        Object multiView = createInstance("com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter$MultiView");
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findKeySerializer(SerializerProvider.java:740)
            com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(MapSerializer.java:352)
            com.fasterxml.jackson.databind.SerializerProvider.handleSecondaryContextualization(SerializerProvider.java:903)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:517)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(BeanSerializerBase.java:493) */
        Class beanSerializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class multiViewType = Class.forName("com.fasterxml.jackson.databind.BeanProperty");
        Method createContextualMethod = beanSerializerBaseClazz.getDeclaredMethod("createContextual", implType, multiViewType);
        createContextualMethod.setAccessible(true);
        java.lang.Object[] createContextualMethodArguments = new java.lang.Object[2];
        createContextualMethodArguments[0] = impl;
        createContextualMethodArguments[1] = multiView;
        try {
            createContextualMethod.invoke(beanSerializer, createContextualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)
    
    @Test(expected = NullPointerException.class)
    public void testCreateContextual9() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        CollectionType idType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
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
        SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
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
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        beanSerializer.createContextual(impl, beanPropertyWriter);
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._customTypeId
    
    ///region Errors report for _customTypeId
    
    public void test_customTypeId_errors()
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.usesObjectId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method usesObjectId()
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#usesObjectId()}
 * @utbot.returnsFrom {@code return (_objectIdWriter != null);}
 *  */
    @Test
    public void testUsesObjectId__objectIdWriterNotEqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        ObjectIdWriter _objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter", _objectIdWriter);
        
        boolean actual = beanSerializer.usesObjectId();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#usesObjectId()}
 * @utbot.returnsFrom {@code return (_objectIdWriter != null);}
 *  */
    @Test
    public void testUsesObjectId__objectIdWriterEqualsNull() {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        
        boolean actual = beanAsArraySerializer.usesObjectId();
        
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
 * @utbot.executesCondition {@code (provider.getActiveView() != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getActiveView()}
 *  */
    @Test
    public void testSerializeFields_ProviderGetActiveViewNotEqualsNull() throws Exception  {
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getActiveView()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _filteredProps != null && provider.getActiveView() != null
 *  */
    @Test
    public void testSerializeFields_ThrowNullPointerException() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:655) */
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
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:672) */
        beanSerializer.serializeFields(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFields(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.executesCondition {@code (provider.getActiveView() != null): False}
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
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFields(BeanSerializerBase.java:672) */
        beanSerializer.serializeFields(null, null, impl);
    }
    ///endregion
    
    ///region Errors report for serializeFields
    
    public void testSerializeFields_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 38 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.findConvertingSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.BeanPropertyWriter)
    
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
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
            
            JsonSerializer actual = beanAsArraySerializer.findConvertingSerializer(impl, beanPropertyWriter);
            
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
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        JsonSerializer actual = beanAsArraySerializer.findConvertingSerializer(impl, beanPropertyWriter);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter)}
 * @utbot.executesCondition {@code (intr != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindConvertingSerializer_IntrEqualsNull() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        JsonSerializer actual = unwrappingBeanSerializer.findConvertingSerializer(impl, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.ser.BeanPropertyWriter)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#getAnnotationIntrospector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final AnnotationIntrospector intr = provider.getAnnotationIntrospector();
 *  */
    @Test
    public void testFindConvertingSerializer_ThrowNullPointerException() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.findConvertingSerializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.findConvertingSerializer(BeanSerializerBase.java:361) */
        beanSerializer.findConvertingSerializer(null, null);
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
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#findConvertingSerializer(com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.ser.BeanPropertyWriter)}
 * @utbot.executesCondition {@code (intr != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: AnnotatedMember m = prop.getMember();
 *  */
    @Test
    public void testFindConvertingSerializer_ThrowNullPointerException_2() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(((UnwrappingBeanSerializer) null), ((ObjectIdWriter) null));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.findConvertingSerializer] produces [java.lang.NullPointerException] */
        unwrappingBeanSerializer.findConvertingSerializer(impl, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _serializeWithObjectId(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, boolean)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#_serializeWithObjectId(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WritableObjectId objectId = provider.findObjectId(bean, w.generator);
 *  */
    @Test
    public void test_serializeWithObjectId_ThrowNullPointerException() throws IOException  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId] produces [java.lang.NullPointerException] */
        beanAsArraySerializer._serializeWithObjectId(((Object) null), ((JsonGenerator) null), ((SerializerProvider) null), false);
    }
    
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
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId(BeanSerializerBase.java:566) */
        beanSerializer._serializeWithObjectId(((Object) null), ((JsonGenerator) null), ((SerializerProvider) null), false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _serializeWithObjectId(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.jsontype.TypeSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#_serializeWithObjectId(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WritableObjectId objectId = provider.findObjectId(bean, w.generator);
 *  */
    @Test
    public void test_serializeWithObjectId_ThrowNullPointerException1() throws IOException  {
        BeanAsArraySerializer beanAsArraySerializer = new BeanAsArraySerializer(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId] produces [java.lang.NullPointerException] */
        beanAsArraySerializer._serializeWithObjectId(((Object) null), ((JsonGenerator) null), ((SerializerProvider) null), ((TypeSerializer) null));
    }
    
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
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase._serializeWithObjectId(BeanSerializerBase.java:597) */
        beanSerializer._serializeWithObjectId(((Object) null), ((JsonGenerator) null), ((SerializerProvider) null), ((TypeSerializer) null));
    }
    ///endregion
    
    ///region Errors report for _serializeWithObjectId
    
    public void test_serializeWithObjectId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method serializeFieldsFiltered(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.executesCondition {@code (provider.getActiveView() != null): False}
 * @utbot.executesCondition {@code (filter == null): False}
 * @utbot.executesCondition {@code (_anyGetterWriter != null): False}
 *  */
    @Test
    public void testSerializeFieldsFiltered__anyGetterWriterEqualsNull() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null, null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter.FilterExceptFilter _defaultFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        beanSerializer.serializeFieldsFiltered(null, null, impl);
        
        BeanPropertyWriter finalBeanSerializer_filteredProps0 = beanSerializer._filteredProps[0];
        BeanPropertyWriter finalBeanSerializer_filteredProps1 = beanSerializer._filteredProps[1];
        
        assertNull(finalBeanSerializer_filteredProps0);
        
        assertNull(finalBeanSerializer_filteredProps1);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): False}
 * @utbot.executesCondition {@code (filter == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testSerializeFieldsFiltered__filteredPropsEqualsNull() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        beanAsArraySerializer.serializeFieldsFiltered(null, null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.executesCondition {@code (provider.getActiveView() != null): False}
 * @utbot.executesCondition {@code (filter == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testSerializeFieldsFiltered_FilterEqualsNull() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        unwrappingBeanSerializer.serializeFieldsFiltered(null, null, impl);
        
        BeanPropertyWriter finalUnwrappingBeanSerializer_filteredProps0 = unwrappingBeanSerializer._filteredProps[0];
        
        assertNull(finalUnwrappingBeanSerializer_filteredProps0);
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
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered(BeanSerializerBase.java:699) */
        beanSerializer.serializeFieldsFiltered(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.executesCondition {@code (provider.getActiveView() != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final PropertyFilter filter = findPropertyFilter(provider, _propertyFilterId, bean);
 *  */
    @Test
    public void testSerializeFieldsFiltered_ThrowNullPointerException_1() throws Exception  {
        UnwrappingBeanSerializer unwrappingBeanSerializer = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _props = {null};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props", _props);
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(unwrappingBeanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_cfgFailOnUnknownId", true);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider.findPropertyFilter(SimpleFilterProvider.java:182)
            com.fasterxml.jackson.databind.ser.std.StdSerializer.findPropertyFilter(StdSerializer.java:287)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered(BeanSerializerBase.java:704) */
        unwrappingBeanSerializer.serializeFieldsFiltered(null, null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.executesCondition {@code (provider.getActiveView() != null): False}
 * @utbot.executesCondition {@code (filter == null): False}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (i == props.length)
 *  */
    @Test
    public void testSerializeFieldsFiltered_ThrowNullPointerException_2() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter.FilterExceptFilter _defaultFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered(BeanSerializerBase.java:722) */
        beanAsArraySerializer.serializeFieldsFiltered(null, null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): False}
 * @utbot.executesCondition {@code (filter == null): False}
 * @utbot.caughtException {@code Exception e}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (i == props.length)
 *  */
    @Test
    public void testSerializeFieldsFiltered_ThrowNullPointerException_3() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        SimpleFilterProvider _filterProvider = ((SimpleFilterProvider) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider"));
        LinkedHashMap _filtersById = new LinkedHashMap();
        String string = "";
        SimpleBeanPropertyFilter.FilterExceptFilter filterExceptFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        _filtersById.put(string, filterExceptFilter);
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_filtersById", _filtersById);
        SimpleBeanPropertyFilter.FilterExceptFilter _defaultFilter = ((SimpleBeanPropertyFilter.FilterExceptFilter) createInstance("com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter$FilterExceptFilter"));
        setField(_filterProvider, "com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider", "_defaultFilter", _defaultFilter);
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_filterProvider", _filterProvider);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.serializeFieldsFiltered(BeanSerializerBase.java:722) */
        beanAsArraySerializer.serializeFieldsFiltered(null, null, impl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method serializeFieldsFiltered(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.executesCondition {@code (provider.getActiveView() != null): True}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: final PropertyFilter filter = findPropertyFilter(provider, _propertyFilterId, bean);
 *  */
    @Test(expected = JsonMappingException.class)
    public void testSerializeFieldsFiltered_ThrowJsonMappingException_2() throws Exception  {
        BeanAsArraySerializer beanAsArraySerializer = ((BeanAsArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanAsArraySerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        Class _serializationView = Object.class;
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializationView", _serializationView);
        
        beanAsArraySerializer.serializeFieldsFiltered(null, null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): False}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: final PropertyFilter filter = findPropertyFilter(provider, _propertyFilterId, bean);
 *  */
    @Test(expected = JsonMappingException.class)
    public void testSerializeFieldsFiltered_ThrowJsonMappingException() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        beanSerializer.serializeFieldsFiltered(null, null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanSerializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.BeanSerializerBase#serializeFieldsFiltered(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_filteredProps != null): True}
 * @utbot.executesCondition {@code (provider.getActiveView() != null): False}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: final PropertyFilter filter = findPropertyFilter(provider, _propertyFilterId, bean);
 *  */
    @Test(expected = JsonMappingException.class)
    public void testSerializeFieldsFiltered_ThrowJsonMappingException_1() throws Exception  {
        BeanSerializer beanSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] _filteredProps = {null};
        setField(beanSerializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps", _filteredProps);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        beanSerializer.serializeFieldsFiltered(null, null, impl);
    }
    ///endregion
    
    ///region Errors report for serializeFieldsFiltered
    
    public void testSerializeFieldsFiltered_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1066341110481000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1066341110481000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1066341110487000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066341110481000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066341110487000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1066341110832999 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1066341110832999.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1066341110854700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066341110832999.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066341110854700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1066341113399700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1066341113399700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1066341113421600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066341113399700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066341113421600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

