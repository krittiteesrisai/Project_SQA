package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import com.fasterxml.jackson.core.io.SerializedString;
import java.lang.reflect.Field;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.util.HashMap;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.CharArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.util.NameTransformer.Chained;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.BeanProperty;
import java.util.HashSet;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.lang.reflect.Type;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.DateKeySerializer;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.annotation.JsonFormat.Features;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import java.util.Locale;
import java.util.TimeZone;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_ser_BeanPropertyWriterTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getName()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.SerializedString#getValue()}
 * @utbot.returnsFrom {@code return _name.getValue();}
 *  */
    @Test
    public void testGetName_SerializedStringGetValue() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        String actual = beanPropertyWriter.getName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getName()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getName()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.SerializedString#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: /*
 *     /**********************************************************
 *     /* BeanProperty impl
 *     /**********************************************************
 *      */
 * // Note: also part of 'PropertyWriter'
 * @Override
 * public String getName() {
 *     return _name.getValue();
 * }
 *  */
    @Test
    public void testGetName_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName(BeanPropertyWriter.java:466) */
        beanPropertyWriter.getName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.get
    
    ///region Errors report for get
    
    public void testGet_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        
        String actual = beanPropertyWriter.toString();
        
        String expected = "property 'null' (virtual, static serializer of type com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer)";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000";
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        String actual = beanPropertyWriter.toString();
        
        String expected = "property '\u0000\u0000\u0000' (virtual, no static serializer)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_member == null)): False}
 * @utbot.returnsFrom {@code return (_member == null) ? null : _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__memberNotEqualsNull_4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        VirtualAnnotatedMember _member = ((VirtualAnnotatedMember) createInstance("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Annotation actual = beanPropertyWriter.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_member == null)): True}
 * @utbot.returnsFrom {@code return (_member == null) ? null : _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__memberEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        Annotation actual = beanPropertyWriter.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_member == null)): False}
 * @utbot.returnsFrom {@code return (_member == null) ? null : _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__memberNotEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Annotation actual = beanPropertyWriter.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_member == null)): False}
 * @utbot.returnsFrom {@code return (_member == null) ? null : _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__memberNotEqualsNull_2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Annotation actual = beanPropertyWriter.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_member == null)): False}
 * @utbot.returnsFrom {@code return (_member == null) ? null : _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__memberNotEqualsNull_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        AnnotationMap _annotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations", _annotations);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Annotation actual = beanPropertyWriter.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_member == null)): False}
 * @utbot.returnsFrom {@code return (_member == null) ? null : _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__memberNotEqualsNull_3() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        AnnotationMap _annotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations", _annotations);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Annotation actual = beanPropertyWriter.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_member == null)): False}
 * @utbot.returnsFrom {@code return (_member == null) ? null : _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation__memberNotEqualsNull_5() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        AnnotationMap _annotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations", _annotations);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Annotation actual = beanPropertyWriter.getAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getType()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getType()}
 * @utbot.returnsFrom {@code return _declaredType;}
 *  */
    @Test
    public void testGetType_Return_declaredType() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        JavaType actual = beanPropertyWriter.getType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.readResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#readResolve()}
 * @utbot.executesCondition {@code (_member instanceof AnnotatedField): False}
 * @utbot.executesCondition {@code (_member instanceof AnnotatedMethod): False}
 * @utbot.executesCondition {@code (_serializer == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve_Not_memberNotInstanceOfAnnotatedMethod() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        StdKeySerializer _serializer = ((StdKeySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        
        BeanPropertyWriter actual = ((BeanPropertyWriter) beanPropertyWriter.readResolve());
        
        SerializedString actual_name = actual._name;
        assertNull(actual_name);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        JavaType actual_declaredType = actual._declaredType;
        assertNull(actual_declaredType);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        PropertyMetadata actual_metadata = actual._metadata;
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = actual._format;
        assertNull(actual_format);
        
        AnnotatedMember actual_member = actual._member;
        assertNull(actual_member);
        
        Method actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        JsonSerializer beanPropertyWriter_serializer = beanPropertyWriter._serializer;
        JsonSerializer actual_serializer = actual._serializer;
        Class actual_serializer_handledType = ((Class) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_serializer_handledType);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        HashMap actual_internalSettings = actual._internalSettings;
        assertNull(actual_internalSettings);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#readResolve()}
 * @utbot.executesCondition {@code (_member instanceof AnnotatedField): True}
 * @utbot.executesCondition {@code (_serializer == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap#emptyForProperties()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve__serializerEqualsNull() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Object prevFOR_PROPERTIES = getStaticFieldValue(emptyClazz, "FOR_PROPERTIES");
        try {
            Object forProperties = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
            setStaticField(emptyClazz, "FOR_PROPERTIES", forProperties);
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
            
            PropertySerializerMap initialBeanPropertyWriter_dynamicSerializers = beanPropertyWriter._dynamicSerializers;
            
            BeanPropertyWriter actual = ((BeanPropertyWriter) beanPropertyWriter.readResolve());
            
            SerializedString actual_name = actual._name;
            assertNull(actual_name);
            
            PropertyName actual_wrapperName = actual._wrapperName;
            assertNull(actual_wrapperName);
            
            JavaType actual_declaredType = actual._declaredType;
            assertNull(actual_declaredType);
            
            JavaType actual_cfgSerializationType = actual._cfgSerializationType;
            assertNull(actual_cfgSerializationType);
            
            JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
            assertNull(actual_nonTrivialBaseType);
            
            Annotations actual_contextAnnotations = actual._contextAnnotations;
            assertNull(actual_contextAnnotations);
            
            PropertyMetadata actual_metadata = actual._metadata;
            assertNull(actual_metadata);
            
            JsonFormat.Value actual_format = actual._format;
            assertNull(actual_format);
            
            AnnotatedMember beanPropertyWriter_member = beanPropertyWriter._member;
            AnnotatedMember actual_member = actual._member;
            Field actual_member_field = ((Field) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedField", "_field"));
            assertNull(actual_member_field);
            
            Object actual_member_serialization = getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedField", "_serialization");
            assertNull(actual_member_serialization);
            
            AnnotatedClass actual_member_context = ((AnnotatedClass) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_context"));
            assertNull(actual_member_context);
            
            AnnotationMap actual_member_annotations = ((AnnotationMap) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
            assertNull(actual_member_annotations);
            
            Method actual_accessorMethod = actual._accessorMethod;
            assertNull(actual_accessorMethod);
            
            Field actual_field = actual._field;
            assertNull(actual_field);
            
            JsonSerializer actual_serializer = actual._serializer;
            assertNull(actual_serializer);
            
            JsonSerializer actual_nullSerializer = actual._nullSerializer;
            assertNull(actual_nullSerializer);
            
            TypeSerializer actual_typeSerializer = actual._typeSerializer;
            assertNull(actual_typeSerializer);
            
            PropertySerializerMap beanPropertyWriter_dynamicSerializers = beanPropertyWriter._dynamicSerializers;
            PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
            boolean actual_dynamicSerializers_resetWhenFull = ((Boolean) getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "_resetWhenFull"));
            assertFalse(actual_dynamicSerializers_resetWhenFull);
            
            boolean actual_suppressNulls = actual._suppressNulls;
            assertFalse(actual_suppressNulls);
            
            Object actual_suppressableValue = actual._suppressableValue;
            assertNull(actual_suppressableValue);
            
            java.lang.Class[] actual_includeInViews = actual._includeInViews;
            assertNull(actual_includeInViews);
            
            HashMap actual_internalSettings = actual._internalSettings;
            assertNull(actual_internalSettings);
            
            PropertySerializerMap finalBeanPropertyWriter_dynamicSerializers = beanPropertyWriter._dynamicSerializers;
            
            assertFalse(initialBeanPropertyWriter_dynamicSerializers == finalBeanPropertyWriter_dynamicSerializers);
        } finally {
            setStaticField(emptyClazz, "FOR_PROPERTIES", prevFOR_PROPERTIES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#readResolve()}
 * @utbot.executesCondition {@code (_member instanceof AnnotatedField): False}
 * @utbot.executesCondition {@code (_member instanceof AnnotatedMethod): True}
 * @utbot.executesCondition {@code (_serializer == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMember#getMember()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve__memberInstanceOfAnnotatedMethod() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        Method _method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method", _method);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        Method _accessorMethod = ((Method) createInstance("java.lang.reflect.Method"));
        beanPropertyWriter._accessorMethod = _accessorMethod;
        StdArraySerializers.CharArraySerializer _serializer = ((StdArraySerializers.CharArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$CharArraySerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        
        BeanPropertyWriter actual = ((BeanPropertyWriter) beanPropertyWriter.readResolve());
        
        SerializedString actual_name = actual._name;
        assertNull(actual_name);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        JavaType actual_declaredType = actual._declaredType;
        assertNull(actual_declaredType);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        PropertyMetadata actual_metadata = actual._metadata;
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = actual._format;
        assertNull(actual_format);
        
        AnnotatedMember beanPropertyWriter_member = beanPropertyWriter._member;
        AnnotatedMember actual_member = actual._member;
        Method beanPropertyWriter_member_method = ((Method) getFieldValue(beanPropertyWriter_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method"));
        Method actual_member_method = ((Method) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method"));
        // java.lang.reflect.Method has overridden equals method
        assertEquals(beanPropertyWriter_member_method, actual_member_method);
        
        java.lang.Class[] actual_member_paramClasses = ((java.lang.Class[]) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses"));
        assertNull(actual_member_paramClasses);
        
        Object actual_member_serialization = getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_serialization");
        assertNull(actual_member_serialization);
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual_member_paramAnnotations = ((com.fasterxml.jackson.databind.introspect.AnnotationMap[]) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "_paramAnnotations"));
        assertNull(actual_member_paramAnnotations);
        
        AnnotatedClass actual_member_context = ((AnnotatedClass) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_context"));
        assertNull(actual_member_context);
        
        AnnotationMap actual_member_annotations = ((AnnotationMap) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
        assertNull(actual_member_annotations);
        
        Method beanPropertyWriter_accessorMethod = beanPropertyWriter._accessorMethod;
        Method actual_accessorMethod = actual._accessorMethod;
        // java.lang.reflect.Method has overridden equals method
        assertEquals(beanPropertyWriter_accessorMethod, actual_accessorMethod);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        JsonSerializer beanPropertyWriter_serializer = beanPropertyWriter._serializer;
        JsonSerializer actual_serializer = actual._serializer;
        Class actual_serializer_handledType = ((Class) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_serializer_handledType);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        HashMap actual_internalSettings = actual._internalSettings;
        assertNull(actual_internalSettings);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#readResolve()}
 * @utbot.executesCondition {@code (_member instanceof AnnotatedField): True}
 * @utbot.executesCondition {@code (_serializer == null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve__serializerNotEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        BeanSerializer _serializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        
        BeanPropertyWriter actual = ((BeanPropertyWriter) beanPropertyWriter.readResolve());
        
        SerializedString actual_name = actual._name;
        assertNull(actual_name);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        JavaType actual_declaredType = actual._declaredType;
        assertNull(actual_declaredType);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        PropertyMetadata actual_metadata = actual._metadata;
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = actual._format;
        assertNull(actual_format);
        
        AnnotatedMember beanPropertyWriter_member = beanPropertyWriter._member;
        AnnotatedMember actual_member = actual._member;
        Field actual_member_field = ((Field) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedField", "_field"));
        assertNull(actual_member_field);
        
        Object actual_member_serialization = getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedField", "_serialization");
        assertNull(actual_member_serialization);
        
        AnnotatedClass actual_member_context = ((AnnotatedClass) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_context"));
        assertNull(actual_member_context);
        
        AnnotationMap actual_member_annotations = ((AnnotationMap) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
        assertNull(actual_member_annotations);
        
        Method actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        JsonSerializer beanPropertyWriter_serializer = beanPropertyWriter._serializer;
        JsonSerializer actual_serializer = actual._serializer;
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_serializer_props = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_props"));
        assertNull(actual_serializer_props);
        
        com.fasterxml.jackson.databind.ser.BeanPropertyWriter[] actual_serializer_filteredProps = ((com.fasterxml.jackson.databind.ser.BeanPropertyWriter[]) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_filteredProps"));
        assertNull(actual_serializer_filteredProps);
        
        AnyGetterWriter actual_serializer_anyGetterWriter = ((AnyGetterWriter) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_anyGetterWriter"));
        assertNull(actual_serializer_anyGetterWriter);
        
        Object actual_serializer_propertyFilterId = getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_propertyFilterId");
        assertNull(actual_serializer_propertyFilterId);
        
        AnnotatedMember actual_serializer_typeId = ((AnnotatedMember) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_typeId"));
        assertNull(actual_serializer_typeId);
        
        ObjectIdWriter actual_serializer_objectIdWriter = ((ObjectIdWriter) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_objectIdWriter"));
        assertNull(actual_serializer_objectIdWriter);
        
        JsonFormat.Shape actual_serializer_serializationShape = ((JsonFormat.Shape) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase", "_serializationShape"));
        assertNull(actual_serializer_serializationShape);
        
        Class actual_serializer_handledType = ((Class) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_serializer_handledType);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        HashMap actual_internalSettings = actual._internalSettings;
        assertNull(actual_internalSettings);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rename(com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#rename(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.SerializedString#getValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.NameTransformer#transform(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.SerializedString#toString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testRename_StringEquals() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = " ";
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        
        Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class nopTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Method renameMethod = beanPropertyWriterClazz.getDeclaredMethod("rename", nopTransformerType);
        renameMethod.setAccessible(true);
        java.lang.Object[] renameMethodArguments = new java.lang.Object[1];
        renameMethodArguments[0] = nopTransformer;
        BeanPropertyWriter actual = ((BeanPropertyWriter) renameMethod.invoke(beanPropertyWriter, renameMethodArguments));
        
        SerializedString beanPropertyWriter_name = beanPropertyWriter._name;
        SerializedString actual_name = actual._name;
        // com.fasterxml.jackson.core.io.SerializedString has overridden equals method
        assertEquals(beanPropertyWriter_name, actual_name);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        JavaType actual_declaredType = actual._declaredType;
        assertNull(actual_declaredType);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        PropertyMetadata actual_metadata = actual._metadata;
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = actual._format;
        assertNull(actual_format);
        
        AnnotatedMember actual_member = actual._member;
        assertNull(actual_member);
        
        Method actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        JsonSerializer actual_serializer = actual._serializer;
        assertNull(actual_serializer);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        HashMap actual_internalSettings = actual._internalSettings;
        assertNull(actual_internalSettings);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rename(com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#rename(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String newName = transformer.transform(_name.getValue());
 *  */
    @Test
    public void testRename_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:366) */
        beanPropertyWriter.rename(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#rename(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: newName.equals(_name.toString())
 *  */
    @Test
    public void testRename_ThrowNullPointerException_2() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:367) */
        Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class nopTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Method renameMethod = beanPropertyWriterClazz.getDeclaredMethod("rename", nopTransformerType);
        renameMethod.setAccessible(true);
        java.lang.Object[] renameMethodArguments = new java.lang.Object[1];
        renameMethodArguments[0] = nopTransformer;
        try {
            renameMethod.invoke(beanPropertyWriter, renameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#rename(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String newName = transformer.transform(_name.getValue());
 *  */
    @Test
    public void testRename_ThrowNullPointerException_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:366) */
        beanPropertyWriter.rename(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#rename(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: newName.equals(_name.toString())
 *  */
    @Test
    public void testRename_ThrowNullPointerException_3() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class nopTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(nopTransformerType, nopTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = nopTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = chained;
        chainedConstructorArguments1[1] = nopTransformer;
        NameTransformer.Chained chained1 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:367) */
        beanPropertyWriter.rename(chained1);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#rename(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: newName.equals(_name.toString())
 *  */
    @Test
    public void testRename_ThrowNullPointerException_4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class nopTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(nopTransformerType, nopTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = nopTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = nopTransformer;
        chainedConstructorArguments1[1] = chained;
        NameTransformer.Chained chained1 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:367) */
        beanPropertyWriter.rename(chained1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method rename(com.fasterxml.jackson.databind.util.NameTransformer)
    
    @Test
    public void testRename1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class nopTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(nopTransformerType, nopTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = nopTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = chained;
        chainedConstructorArguments1[1] = nopTransformer;
        NameTransformer.Chained chained1 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        NameTransformer.Chained chained2 = new NameTransformer.Chained(chained1, chained);
        
        BeanPropertyWriter actual = beanPropertyWriter.rename(chained2);
        
        SerializedString beanPropertyWriter_name = beanPropertyWriter._name;
        SerializedString actual_name = actual._name;
        // com.fasterxml.jackson.core.io.SerializedString has overridden equals method
        assertEquals(beanPropertyWriter_name, actual_name);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        JavaType actual_declaredType = actual._declaredType;
        assertNull(actual_declaredType);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        PropertyMetadata actual_metadata = actual._metadata;
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = actual._format;
        assertNull(actual_format);
        
        AnnotatedMember actual_member = actual._member;
        assertNull(actual_member);
        
        Method actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        JsonSerializer actual_serializer = actual._serializer;
        assertNull(actual_serializer);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        HashMap actual_internalSettings = actual._internalSettings;
        assertNull(actual_internalSettings);
        
    }
    
    @Test
    public void testRename2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class nopTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(nopTransformerType, nopTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = nopTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = chained;
        chainedConstructorArguments1[1] = nopTransformer;
        NameTransformer.Chained chained1 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        java.lang.Object[] chainedConstructorArguments2 = new java.lang.Object[2];
        chainedConstructorArguments2[0] = nopTransformer;
        chainedConstructorArguments2[1] = chained1;
        NameTransformer.Chained chained2 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments2));
        java.lang.Object[] chainedConstructorArguments3 = new java.lang.Object[2];
        chainedConstructorArguments3[0] = nopTransformer;
        chainedConstructorArguments3[1] = chained2;
        NameTransformer.Chained chained3 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments3));
        
        BeanPropertyWriter actual = beanPropertyWriter.rename(chained3);
        
        SerializedString beanPropertyWriter_name = beanPropertyWriter._name;
        SerializedString actual_name = actual._name;
        // com.fasterxml.jackson.core.io.SerializedString has overridden equals method
        assertEquals(beanPropertyWriter_name, actual_name);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        JavaType actual_declaredType = actual._declaredType;
        assertNull(actual_declaredType);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        PropertyMetadata actual_metadata = actual._metadata;
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = actual._format;
        assertNull(actual_format);
        
        AnnotatedMember actual_member = actual._member;
        assertNull(actual_member);
        
        Method actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        JsonSerializer actual_serializer = actual._serializer;
        assertNull(actual_serializer);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        HashMap actual_internalSettings = actual._internalSettings;
        assertNull(actual_internalSettings);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method rename(com.fasterxml.jackson.databind.util.NameTransformer)
    
    @Test(expected = StackOverflowError.class)
    public void testRename3() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        NameTransformer.Chained chained = ((NameTransformer.Chained) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        setField(chained, "com.fasterxml.jackson.databind.util.NameTransformer$Chained", "_t1", chained);
        Object _t2 = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        setField(chained, "com.fasterxml.jackson.databind.util.NameTransformer$Chained", "_t2", _t2);
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class chainedType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(chainedType, chainedType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = chained;
        chainedConstructorArguments[1] = _t2;
        NameTransformer.Chained chained1 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = _t2;
        chainedConstructorArguments1[1] = _t2;
        NameTransformer.Chained chained2 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        NameTransformer.Chained chained3 = new NameTransformer.Chained(chained1, chained2);
        
        beanPropertyWriter.rename(chained3);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testRename4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        NameTransformer.Chained chained = ((NameTransformer.Chained) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        setField(chained, "com.fasterxml.jackson.databind.util.NameTransformer$Chained", "_t2", chained);
        NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
        NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class nopTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(nopTransformerType, nopTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = nopTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained3 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = chained3;
        chainedConstructorArguments1[1] = nopTransformer;
        NameTransformer.Chained chained4 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        NameTransformer.Chained chained5 = new NameTransformer.Chained(chained2, chained4);
        
        beanPropertyWriter.rename(chained5);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testRename5() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        NameTransformer.Chained chained = ((NameTransformer.Chained) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        setField(chained, "com.fasterxml.jackson.databind.util.NameTransformer$Chained", "_t1", chained);
        Object _t2 = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        setField(chained, "com.fasterxml.jackson.databind.util.NameTransformer$Chained", "_t2", _t2);
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class chainedType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(chainedType, chainedType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = chained;
        chainedConstructorArguments[1] = _t2;
        NameTransformer.Chained chained1 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
        NameTransformer.Chained chained3 = new NameTransformer.Chained(null, chained2);
        NameTransformer.Chained chained4 = new NameTransformer.Chained(null, chained3);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = chained4;
        chainedConstructorArguments1[1] = nopTransformer;
        NameTransformer.Chained chained5 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        
        beanPropertyWriter.rename(chained5);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testRename6() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        NameTransformer.Chained chained = ((NameTransformer.Chained) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        setField(chained, "com.fasterxml.jackson.databind.util.NameTransformer$Chained", "_t1", chained);
        Object _t2 = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        setField(chained, "com.fasterxml.jackson.databind.util.NameTransformer$Chained", "_t2", _t2);
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class chainedType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(chainedType, chainedType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = chained;
        chainedConstructorArguments[1] = _t2;
        NameTransformer.Chained chained1 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
        NameTransformer.Chained chained3 = new NameTransformer.Chained(null, chained2);
        NameTransformer.Chained chained4 = new NameTransformer.Chained(null, chained3);
        NameTransformer.Chained chained5 = new NameTransformer.Chained(null, chained4);
        
        beanPropertyWriter.rename(chained5);
    }
    
    @Test
    public void testRename7() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class nopTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(nopTransformerType, nopTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = nopTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        NameTransformer.Chained chained1 = new NameTransformer.Chained(chained, chained);
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = nopTransformer;
        chainedConstructorArguments1[1] = chained1;
        NameTransformer.Chained chained2 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:367) */
        beanPropertyWriter.rename(chained2);
    }
    
    @Test
    public void testRename8() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class nopTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(nopTransformerType, nopTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = nopTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = nopTransformer;
        chainedConstructorArguments1[1] = chained;
        NameTransformer.Chained chained1 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        java.lang.Object[] chainedConstructorArguments2 = new java.lang.Object[2];
        chainedConstructorArguments2[0] = chained1;
        chainedConstructorArguments2[1] = nopTransformer;
        NameTransformer.Chained chained2 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments2));
        NameTransformer.Chained chained3 = new NameTransformer.Chained(null, chained2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:130)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:366) */
        beanPropertyWriter.rename(chained3);
    }
    
    @Test
    public void testRename9() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class nopTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(nopTransformerType, nopTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = nopTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = chained1;
        chainedConstructorArguments1[1] = nopTransformer;
        NameTransformer.Chained chained2 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        java.lang.Object[] chainedConstructorArguments2 = new java.lang.Object[2];
        chainedConstructorArguments2[0] = chained2;
        chainedConstructorArguments2[1] = nopTransformer;
        NameTransformer.Chained chained3 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments2));
        NameTransformer.Chained chained4 = new NameTransformer.Chained(null, chained3);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException] */
        beanPropertyWriter.rename(chained4);
    }
    
    @Test
    public void testRename10() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        NameTransformer.Chained chained = new NameTransformer.Chained(null, anonymousNameTransformer);
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class chainedType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(chainedType, chainedType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = chained;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained1 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = chained2;
        chainedConstructorArguments1[1] = nopTransformer;
        NameTransformer.Chained chained3 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException] */
        beanPropertyWriter.rename(chained3);
    }
    
    @Test
    public void testRename11() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class anonymousNameTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(anonymousNameTransformerType, anonymousNameTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = anonymousNameTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
        NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
        NameTransformer.Chained chained3 = new NameTransformer.Chained(null, chained2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:130)
            com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:130)
            com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:130)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:366) */
        beanPropertyWriter.rename(chained3);
    }
    
    @Test
    public void testRename12() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class anonymousNameTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(anonymousNameTransformerType, anonymousNameTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = anonymousNameTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
        NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
        Object nopTransformer1 = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = nopTransformer1;
        chainedConstructorArguments1[1] = nopTransformer1;
        NameTransformer.Chained chained3 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        java.lang.Object[] chainedConstructorArguments2 = new java.lang.Object[2];
        chainedConstructorArguments2[0] = nopTransformer1;
        chainedConstructorArguments2[1] = chained3;
        NameTransformer.Chained chained4 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments2));
        NameTransformer.Chained chained5 = new NameTransformer.Chained(chained2, chained4);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException] */
        beanPropertyWriter.rename(chained5);
    }
    
    @Test
    public void testRename13() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        Object nopTransformer = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        Class chainedClazz = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained");
        Class anonymousNameTransformerType = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Constructor chainedConstructor = chainedClazz.getDeclaredConstructor(anonymousNameTransformerType, anonymousNameTransformerType);
        chainedConstructor.setAccessible(true);
        java.lang.Object[] chainedConstructorArguments = new java.lang.Object[2];
        chainedConstructorArguments[0] = anonymousNameTransformer;
        chainedConstructorArguments[1] = nopTransformer;
        NameTransformer.Chained chained = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments));
        NameTransformer.Chained chained1 = new NameTransformer.Chained(null, chained);
        NameTransformer.Chained chained2 = new NameTransformer.Chained(null, chained1);
        java.lang.Object[] chainedConstructorArguments1 = new java.lang.Object[2];
        chainedConstructorArguments1[0] = chained2;
        chainedConstructorArguments1[1] = nopTransformer;
        NameTransformer.Chained chained3 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments1));
        NameTransformer.Chained chained4 = new NameTransformer.Chained(null, chained3);
        Object nopTransformer1 = createInstance("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer");
        java.lang.Object[] chainedConstructorArguments2 = new java.lang.Object[2];
        chainedConstructorArguments2[0] = chained4;
        chainedConstructorArguments2[1] = nopTransformer1;
        NameTransformer.Chained chained5 = ((NameTransformer.Chained) chainedConstructor.newInstance(chainedConstructorArguments2));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:130)
            com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:130)
            com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:130)
            com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:130)
            com.fasterxml.jackson.databind.util.NameTransformer$Chained.transform(NameTransformer.java:130)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:366) */
        beanPropertyWriter.rename(chained5);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getFullName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFullName()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getFullName()}
 * @utbot.returnsFrom {@code return new PropertyName(_name.getValue());}
 *  */
    @Test
    public void testGetFullName_Return() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        PropertyName actual = beanPropertyWriter.getFullName();
        
        PropertyName expected = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(expected, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _value);
        
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getFullName()}
 * @utbot.returnsFrom {@code return new PropertyName(_name.getValue());}
 *  */
    @Test
    public void testGetFullName_Return_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        PropertyName actual = beanPropertyWriter.getFullName();
        
        PropertyName expected = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(expected, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFullName()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getFullName()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.SerializedString#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new PropertyName(_name.getValue());
 *  */
    @Test
    public void testGetFullName_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getFullName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getFullName(BeanPropertyWriter.java:470) */
        beanPropertyWriter.getFullName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.isVirtual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVirtual()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#isVirtual()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsVirtual_ReturnFalse() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        
        boolean actual = beanPropertyWriter.isVirtual();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getMetadata
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMetadata()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getMetadata()}
 * @utbot.returnsFrom {@code return _metadata;}
 *  */
    @Test
    public void testGetMetadata_Return_metadata() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        PropertyMetadata actual = beanPropertyWriter.getMetadata();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getWrapperName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWrapperName()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getWrapperName()}
 * @utbot.returnsFrom {@code return _wrapperName;}
 *  */
    @Test
    public void testGetWrapperName_Return_wrapperName() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        PropertyName actual = beanPropertyWriter.getWrapperName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getMember
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMember()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getMember()}
 * @utbot.returnsFrom {@code return _member;}
 *  */
    @Test
    public void testGetMember_Return_member() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        AnnotatedMember actual = beanPropertyWriter.getMember();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.assignSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assignSerializer(com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#assignSerializer(com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (_serializer != null): True}
 * @utbot.executesCondition {@code (_serializer != ser): False}
 *  */
    @Test
    public void testAssignSerializer__serializerEqualsSer() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _serializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._serializer = _serializer;
        
        beanPropertyWriter.assignSerializer(_serializer);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#assignSerializer(com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (_serializer != null): False}
 *  */
    @Test
    public void testAssignSerializer__serializerEqualsNull() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._serializer = null;
        
        beanPropertyWriter.assignSerializer(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method assignSerializer(com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#assignSerializer(com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (_serializer != null): True}
 * @utbot.executesCondition {@code (_serializer != ser): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: _serializer != null && _serializer != ser
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAssignSerializer_ThrowIllegalStateException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NumberSerializers.IntegerSerializer _serializer = ((NumberSerializers.IntegerSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer"));
        beanPropertyWriter._serializer = _serializer;
        
        beanPropertyWriter.assignSerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.unwrappingWriter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unwrappingWriter(com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#unwrappingWriter(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new UnwrappingBeanPropertyWriter(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingWriter_Return() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        UnwrappingBeanPropertyWriter actual = ((UnwrappingBeanPropertyWriter) beanPropertyWriter.unwrappingWriter(null));
        
        UnwrappingBeanPropertyWriter expected = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        
        NameTransformer actual_nameTransformer = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", "_nameTransformer"));
        assertNull(actual_nameTransformer);
        
        SerializedString actual_name = actual._name;
        assertNull(actual_name);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        JavaType actual_declaredType = actual._declaredType;
        assertNull(actual_declaredType);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        PropertyMetadata actual_metadata = actual._metadata;
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = actual._format;
        assertNull(actual_format);
        
        AnnotatedMember actual_member = actual._member;
        assertNull(actual_member);
        
        Method actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        JsonSerializer actual_serializer = actual._serializer;
        assertNull(actual_serializer);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        HashMap actual_internalSettings = actual._internalSettings;
        assertNull(actual_internalSettings);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unwrappingWriter(com.fasterxml.jackson.databind.util.NameTransformer)
    
    @Test
    public void testUnwrappingWriter1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        MapSerializer _serializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        HashMap _internalSettings = new HashMap();
        beanPropertyWriter._internalSettings = _internalSettings;
        NameTransformer anonymousNameTransformer = ((NameTransformer) createInstance("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        
        UnwrappingBeanPropertyWriter actual = ((UnwrappingBeanPropertyWriter) beanPropertyWriter.unwrappingWriter(anonymousNameTransformer));
        
        UnwrappingBeanPropertyWriter expected = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        setField(expected, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", "_nameTransformer", anonymousNameTransformer);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        HashMap _internalSettings1 = new HashMap();
        expected._internalSettings = _internalSettings1;
        
        NameTransformer expected_nameTransformer = ((NameTransformer) getFieldValue(expected, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", "_nameTransformer"));
        NameTransformer actual_nameTransformer = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", "_nameTransformer"));
        String actual_nameTransformerVal$prefix = ((String) getFieldValue(actual_nameTransformer, "com.fasterxml.jackson.databind.util.NameTransformer$1", "val$prefix"));
        assertNull(actual_nameTransformerVal$prefix);
        
        String actual_nameTransformerVal$suffix = ((String) getFieldValue(actual_nameTransformer, "com.fasterxml.jackson.databind.util.NameTransformer$1", "val$suffix"));
        assertNull(actual_nameTransformerVal$suffix);
        
        SerializedString actual_name = actual._name;
        assertNull(actual_name);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        JavaType actual_declaredType = actual._declaredType;
        assertNull(actual_declaredType);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        PropertyMetadata actual_metadata = actual._metadata;
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = actual._format;
        assertNull(actual_format);
        
        AnnotatedMember expected_member = expected._member;
        AnnotatedMember actual_member = actual._member;
        Method actual_member_method = ((Method) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_method"));
        assertNull(actual_member_method);
        
        java.lang.Class[] actual_member_paramClasses = ((java.lang.Class[]) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_paramClasses"));
        assertNull(actual_member_paramClasses);
        
        Object actual_member_serialization = getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMethod", "_serialization");
        assertNull(actual_member_serialization);
        
        com.fasterxml.jackson.databind.introspect.AnnotationMap[] actual_member_paramAnnotations = ((com.fasterxml.jackson.databind.introspect.AnnotationMap[]) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", "_paramAnnotations"));
        assertNull(actual_member_paramAnnotations);
        
        AnnotatedClass actual_member_context = ((AnnotatedClass) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_context"));
        assertNull(actual_member_context);
        
        AnnotationMap actual_member_annotations = ((AnnotationMap) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
        assertNull(actual_member_annotations);
        
        Method actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        JsonSerializer expected_serializer = expected._serializer;
        JsonSerializer actual_serializer = actual._serializer;
        BeanProperty actual_serializer_property = ((BeanProperty) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_property"));
        assertNull(actual_serializer_property);
        
        HashSet actual_serializer_ignoredEntries = ((HashSet) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_ignoredEntries"));
        assertNull(actual_serializer_ignoredEntries);
        
        boolean actual_serializer_valueTypeIsStatic = ((Boolean) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeIsStatic"));
        assertFalse(actual_serializer_valueTypeIsStatic);
        
        JavaType actual_serializer_keyType = ((JavaType) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keyType"));
        assertNull(actual_serializer_keyType);
        
        JavaType actual_serializer_valueType = ((JavaType) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueType"));
        assertNull(actual_serializer_valueType);
        
        JsonSerializer actual_serializer_keySerializer = ((JsonSerializer) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_keySerializer"));
        assertNull(actual_serializer_keySerializer);
        
        JsonSerializer actual_serializer_valueSerializer = ((JsonSerializer) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueSerializer"));
        assertNull(actual_serializer_valueSerializer);
        
        TypeSerializer actual_serializer_valueTypeSerializer = ((TypeSerializer) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_valueTypeSerializer"));
        assertNull(actual_serializer_valueTypeSerializer);
        
        PropertySerializerMap actual_serializer_dynamicValueSerializers = ((PropertySerializerMap) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_dynamicValueSerializers"));
        assertNull(actual_serializer_dynamicValueSerializers);
        
        Object actual_serializer_filterId = getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_filterId");
        assertNull(actual_serializer_filterId);
        
        boolean actual_serializer_sortKeys = ((Boolean) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_sortKeys"));
        assertFalse(actual_serializer_sortKeys);
        
        Object actual_serializer_suppressableValue = getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.MapSerializer", "_suppressableValue");
        assertNull(actual_serializer_suppressableValue);
        
        Class actual_serializer_handledType = ((Class) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_serializer_handledType);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        HashMap expected_internalSettings = expected._internalSettings;
        HashMap actual_internalSettings = actual._internalSettings;
        assertTrue(deepEquals(expected_internalSettings, actual_internalSettings));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter._new
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _new(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_new(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.returnsFrom {@code return new BeanPropertyWriter(this, newName);}
 *  */
    @Test
    public void test_new_Return() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        BeanPropertyWriter actual = beanPropertyWriter._new(propertyName);
        
        BeanPropertyWriter expected = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _simpleName);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        SerializedString expected_name = expected._name;
        SerializedString actual_name = actual._name;
        // com.fasterxml.jackson.core.io.SerializedString has overridden equals method
        assertEquals(expected_name, actual_name);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        JavaType actual_declaredType = actual._declaredType;
        assertNull(actual_declaredType);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        PropertyMetadata actual_metadata = actual._metadata;
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = actual._format;
        assertNull(actual_format);
        
        AnnotatedMember actual_member = actual._member;
        assertNull(actual_member);
        
        Method actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        JsonSerializer actual_serializer = actual._serializer;
        assertNull(actual_serializer);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        HashMap actual_internalSettings = actual._internalSettings;
        assertNull(actual_internalSettings);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _new(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_new(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return new BeanPropertyWriter(this, newName);
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_new_ThrowIllegalStateException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        beanPropertyWriter._new(propertyName);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _new(com.fasterxml.jackson.databind.PropertyName)
    
    @Test
    public void test_new1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        CollectionLikeType _declaredType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        AnnotationMap _contextAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_contextAnnotations", _contextAnnotations);
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        Method _accessorMethod = ((Method) createInstance("java.lang.reflect.Method"));
        beanPropertyWriter._accessorMethod = _accessorMethod;
        Field _field = ((Field) createInstance("java.lang.reflect.Field"));
        beanPropertyWriter._field = _field;
        StdDelegatingSerializer _serializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        HashMap _internalSettings = new HashMap();
        Integer integer = 0;
        _internalSettings.put(integer, beanPropertyWriter);
        _internalSettings.put(null, beanPropertyWriter);
        beanPropertyWriter._internalSettings = _internalSettings;
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        BeanPropertyWriter actual = beanPropertyWriter._new(propertyName);
        
        BeanPropertyWriter expected = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _simpleName);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_contextAnnotations", _contextAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        expected._accessorMethod = _accessorMethod;
        expected._field = _field;
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        HashMap _internalSettings1 = new HashMap();
        _internalSettings1.put(integer, beanPropertyWriter);
        _internalSettings1.put(null, beanPropertyWriter);
        expected._internalSettings = _internalSettings1;
        
        SerializedString expected_name = expected._name;
        SerializedString actual_name = actual._name;
        // com.fasterxml.jackson.core.io.SerializedString has overridden equals method
        assertEquals(expected_name, actual_name);
        
        PropertyName expected_wrapperName = expected._wrapperName;
        PropertyName actual_wrapperName = actual._wrapperName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_wrapperName, actual_wrapperName);
        
        JavaType expected_declaredType = expected._declaredType;
        JavaType actual_declaredType = actual._declaredType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_declaredType, actual_declaredType);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        Annotations expected_contextAnnotations = expected._contextAnnotations;
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        HashMap actual_contextAnnotations_annotations = ((HashMap) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_contextAnnotations_annotations);
        
        PropertyMetadata actual_metadata = actual._metadata;
        assertNull(actual_metadata);
        
        JsonFormat.Value actual_format = actual._format;
        assertNull(actual_format);
        
        AnnotatedMember expected_member = expected._member;
        AnnotatedMember actual_member = actual._member;
        AnnotatedWithParams actual_member_owner = ((AnnotatedWithParams) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "_owner"));
        assertNull(actual_member_owner);
        
        Type actual_member_type = ((Type) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "_type"));
        assertNull(actual_member_type);
        
        int expected_member_index = ((Integer) getFieldValue(expected_member, "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "_index"));
        int actual_member_index = ((Integer) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "_index"));
        assertEquals(expected_member_index, actual_member_index);
        
        AnnotatedClass actual_member_context = ((AnnotatedClass) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_context"));
        assertNull(actual_member_context);
        
        AnnotationMap actual_member_annotations = ((AnnotationMap) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
        assertNull(actual_member_annotations);
        
        Method expected_accessorMethod = expected._accessorMethod;
        Method actual_accessorMethod = actual._accessorMethod;
        // java.lang.reflect.Method has overridden equals method
        assertEquals(expected_accessorMethod, actual_accessorMethod);
        
        Field expected_field = expected._field;
        Field actual_field = actual._field;
        // java.lang.reflect.Field has overridden equals method
        assertEquals(expected_field, actual_field);
        
        JsonSerializer expected_serializer = expected._serializer;
        JsonSerializer actual_serializer = actual._serializer;
        Converter actual_serializer_converter = ((Converter) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_converter"));
        assertNull(actual_serializer_converter);
        
        JavaType actual_serializer_delegateType = ((JavaType) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType"));
        assertNull(actual_serializer_delegateType);
        
        JsonSerializer actual_serializer_delegateSerializer = ((JsonSerializer) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer"));
        assertNull(actual_serializer_delegateSerializer);
        
        Class actual_serializer_handledType = ((Class) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_serializer_handledType);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        HashMap expected_internalSettings = expected._internalSettings;
        HashMap actual_internalSettings = actual._internalSettings;
        assertTrue(deepEquals(expected_internalSettings, actual_internalSettings));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.isRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRequired()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#isRequired()}
 * @utbot.returnsFrom {@code return _metadata.isRequired();}
 *  */
    @Test
    public void testIsRequired_Return_metadataIsRequired() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        
        boolean actual = beanPropertyWriter.isRequired();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#isRequired()}
 * @utbot.returnsFrom {@code return _metadata.isRequired();}
 *  */
    @Test
    public void testIsRequired_Return_metadataIsRequired_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        
        boolean actual = beanPropertyWriter.isRequired();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#isRequired()}
 * @utbot.returnsFrom {@code return _metadata.isRequired();}
 *  */
    @Test
    public void testIsRequired_Return_metadataIsRequired_2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        
        boolean actual = beanPropertyWriter.isRequired();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isRequired()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#isRequired()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyMetadata#isRequired()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: @Override
 * public boolean isRequired() {
 *     return _metadata.isRequired();
 * }
 *  */
    @Test
    public void testIsRequired_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.isRequired] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.isRequired(BeanPropertyWriter.java:475) */
        beanPropertyWriter.isRequired();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getTypeSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeSerializer()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getTypeSerializer()}
 * @utbot.returnsFrom {@code return _typeSerializer;}
 *  */
    @Test
    public void testGetTypeSerializer_Return_typeSerializer() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._typeSerializer = null;
        
        TypeSerializer actual = beanPropertyWriter.getTypeSerializer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getSerializedName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSerializedName()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getSerializedName()}
 * @utbot.returnsFrom {@code return _name;}
 *  */
    @Test
    public void testGetSerializedName_Return_name() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        SerializableString actual = beanPropertyWriter.getSerializedName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField
    
    ///region Errors report for serializeAsField
    
    public void testSerializeAsField_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 19 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.isUnwrapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUnwrapping()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#isUnwrapping()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsUnwrapping_ReturnFalse() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        
        boolean actual = beanPropertyWriter.isUnwrapping();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap, java.lang.Class, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap#findAndAddPrimarySerializer(java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result = map.findAndAddPrimarySerializer(type, provider, this);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        Object empty = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Class class1 = Object.class;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 2);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", -127);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1063876993 out of bounds for length 2]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:119)
            com.fasterxml.jackson.databind.SerializerProvider.findPrimaryPropertySerializer(SerializerProvider.java:628)
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.findAndAddPrimarySerializer(PropertySerializerMap.java:64)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:854) */
        Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class emptyType = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap");
        Class class1Type = Class.forName("java.lang.Class");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Method _findAndAddDynamicMethod = beanPropertyWriterClazz.getDeclaredMethod("_findAndAddDynamic", emptyType, class1Type, implType);
        _findAndAddDynamicMethod.setAccessible(true);
        java.lang.Object[] _findAndAddDynamicMethodArguments = new java.lang.Object[3];
        _findAndAddDynamicMethodArguments[0] = empty;
        _findAndAddDynamicMethodArguments[1] = class1;
        _findAndAddDynamicMethodArguments[2] = impl;
        try {
            _findAndAddDynamicMethod.invoke(beanPropertyWriter, _findAndAddDynamicMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap#findAndAddPrimarySerializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result = map.findAndAddPrimarySerializer(t, provider, this);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        ReferenceType _nonTrivialBaseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_nonTrivialBaseType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        beanPropertyWriter._nonTrivialBaseType = _nonTrivialBaseType;
        Object empty = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 1073741824);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:102)
            com.fasterxml.jackson.databind.SerializerProvider.findPrimaryPropertySerializer(SerializerProvider.java:602)
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.findAndAddPrimarySerializer(PropertySerializerMap.java:72)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:852) */
        Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class emptyType = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap");
        Class classType = Class.forName("java.lang.Class");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Method _findAndAddDynamicMethod = beanPropertyWriterClazz.getDeclaredMethod("_findAndAddDynamic", emptyType, classType, implType);
        _findAndAddDynamicMethod.setAccessible(true);
        java.lang.Object[] _findAndAddDynamicMethodArguments = new java.lang.Object[3];
        _findAndAddDynamicMethodArguments[0] = empty;
        _findAndAddDynamicMethodArguments[1] = ((Object) null);
        _findAndAddDynamicMethodArguments[2] = impl;
        try {
            _findAndAddDynamicMethod.invoke(beanPropertyWriter, _findAndAddDynamicMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap#findAndAddPrimarySerializer(java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = map.findAndAddPrimarySerializer(type, provider, this);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowNullPointerException() throws JsonMappingException  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:854) */
        beanPropertyWriter._findAndAddDynamic(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#constructSpecializedType(com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType t = provider.constructSpecializedType(_nonTrivialBaseType, type);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowNullPointerException_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        CollectionLikeType _nonTrivialBaseType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        beanPropertyWriter._nonTrivialBaseType = _nonTrivialBaseType;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:851) */
        beanPropertyWriter._findAndAddDynamic(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = map.findAndAddPrimarySerializer(t, provider, this);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowNullPointerException_2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        ReferenceType _nonTrivialBaseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        beanPropertyWriter._nonTrivialBaseType = _nonTrivialBaseType;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:852) */
        beanPropertyWriter._findAndAddDynamic(null, null, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSerializer()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getSerializer()}
 * @utbot.returnsFrom {@code return _serializer;}
 *  */
    @Test
    public void testGetSerializer_Return_serializer() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._serializer = null;
        
        JsonSerializer actual = beanPropertyWriter.getSerializer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.hasSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasSerializer()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#hasSerializer()}
 * @utbot.returnsFrom {@code return _serializer != null;}
 *  */
    @Test
    public void testHasSerializer_Return_serializerEqualsNull() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._serializer = null;
        
        boolean actual = beanPropertyWriter.hasSerializer();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#hasSerializer()}
 * @utbot.returnsFrom {@code return _serializer != null;}
 *  */
    @Test
    public void testHasSerializer_Return_serializerEqualsNull_1() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        StdKeySerializers.DateKeySerializer _serializer = new StdKeySerializers.DateKeySerializer();
        beanPropertyWriter._serializer = _serializer;
        
        boolean actual = beanPropertyWriter.hasSerializer();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getPropertyType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyType()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getPropertyType()}
 * @utbot.executesCondition {@code ((_accessorMethod != null)): True}
 * @utbot.invokes {@link java.lang.reflect.Method#getReturnType()}
 * @utbot.returnsFrom {@code return (_accessorMethod != null) ? _accessorMethod.getReturnType() : _field.getType();}
 *  */
    @Test
    public void testGetPropertyType__accessorMethodNotEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        Method _accessorMethod = ((Method) createInstance("java.lang.reflect.Method"));
        beanPropertyWriter._accessorMethod = _accessorMethod;
        
        Class actual = beanPropertyWriter.getPropertyType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getPropertyType()}
 * @utbot.executesCondition {@code ((_accessorMethod != null)): False}
 * @utbot.invokes {@link java.lang.reflect.Field#getType()}
 * @utbot.returnsFrom {@code return (_accessorMethod != null) ? _accessorMethod.getReturnType() : _field.getType();}
 *  */
    @Test
    public void testGetPropertyType__accessorMethodEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._accessorMethod = null;
        Field _field = ((Field) createInstance("java.lang.reflect.Field"));
        beanPropertyWriter._field = _field;
        
        Class actual = beanPropertyWriter.getPropertyType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyType()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getPropertyType()}
 * @utbot.executesCondition {@code ((_accessorMethod != null)): False}
 * @utbot.invokes {@link java.lang.reflect.Field#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _field.getType()
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._accessorMethod = null;
        beanPropertyWriter._field = null;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getPropertyType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getPropertyType(BeanPropertyWriter.java:617) */
        beanPropertyWriter.getPropertyType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.hasNullSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasNullSerializer()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#hasNullSerializer()}
 * @utbot.returnsFrom {@code return _nullSerializer != null;}
 *  */
    @Test
    public void testHasNullSerializer_Return_nullSerializerEqualsNull() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        
        boolean actual = beanPropertyWriter.hasNullSerializer();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#hasNullSerializer()}
 * @utbot.returnsFrom {@code return _nullSerializer != null;}
 *  */
    @Test
    public void testHasNullSerializer_Return_nullSerializerEqualsNull_1() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        StdKeySerializers.DateKeySerializer _nullSerializer = new StdKeySerializers.DateKeySerializer();
        beanPropertyWriter._nullSerializer = _nullSerializer;
        
        boolean actual = beanPropertyWriter.hasNullSerializer();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getViews
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getViews()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getViews()}
 * @utbot.returnsFrom {@code return _includeInViews;}
 *  */
    @Test
    public void testGetViews_Return_includeInViews() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        java.lang.Class[] actual = beanPropertyWriter.getViews();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getInternalSetting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInternalSetting(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getInternalSetting(java.lang.Object)}
 * @utbot.executesCondition {@code ((_internalSettings == null)): True}
 * @utbot.returnsFrom {@code return (_internalSettings == null) ? null : _internalSettings.get(key);}
 *  */
    @Test
    public void testGetInternalSetting__internalSettingsEqualsNull() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        
        Object actual = beanPropertyWriter.getInternalSetting(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getInternalSetting(java.lang.Object)}
 * @utbot.executesCondition {@code ((_internalSettings == null)): False}
 * @utbot.invokes {@link java.util.HashMap#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return (_internalSettings == null) ? null : _internalSettings.get(key);}
 *  */
    @Test
    public void testGetInternalSetting__internalSettingsNotEqualsNull() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        HashMap _internalSettings = new HashMap();
        beanPropertyWriter._internalSettings = _internalSettings;
        byte[] byteArray = {};
        
        Object actual = beanPropertyWriter.getInternalSetting(byteArray);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.setInternalSetting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setInternalSetting(java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#setInternalSetting(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (_internalSettings == null): True}
 * @utbot.returnsFrom {@code return _internalSettings.put(key, value);}
 *  */
    @Test
    public void testSetInternalSetting__internalSettingsEqualsNull() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        byte[] byteArray = {};
        
        Object actual = beanPropertyWriter.setInternalSetting(byteArray, null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#setInternalSetting(java.lang.Object,java.lang.Object)}
 * @utbot.executesCondition {@code (_internalSettings == null): False}
 * @utbot.returnsFrom {@code return _internalSettings.put(key, value);}
 *  */
    @Test
    public void testSetInternalSetting__internalSettingsNotEqualsNull() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        HashMap _internalSettings = new HashMap();
        beanPropertyWriter._internalSettings = _internalSettings;
        
        Object actual = beanPropertyWriter.setInternalSetting(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsElement
    
    ///region Errors report for serializeAsElement
    
    public void testSerializeAsElement_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.willSuppressNulls
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method willSuppressNulls()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#willSuppressNulls()}
 * @utbot.returnsFrom {@code return _suppressNulls;}
 *  */
    @Test
    public void testWillSuppressNulls_Return_suppressNulls() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        boolean actual = beanPropertyWriter.willSuppressNulls();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)}
 * @utbot.executesCondition {@code (v != null): False}
 *  */
    @Test
    public void testDepositSchemaProperty_VEqualsNull() throws JsonMappingException  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        
        beanPropertyWriter.depositSchemaProperty(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)}
 * @utbot.executesCondition {@code (v != null): True}
 * @utbot.executesCondition {@code (isRequired()): False}
 *  */
    @Test
    public void testDepositSchemaProperty_NotIsRequired() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        JsonObjectFormatVisitor.Base base = new JsonObjectFormatVisitor.Base();
        
        beanPropertyWriter.depositSchemaProperty(base);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)}
 * @utbot.executesCondition {@code (v != null): True}
 * @utbot.executesCondition {@code (isRequired()): False}
 *  */
    @Test
    public void testDepositSchemaProperty_NotIsRequired_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = false;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        JsonObjectFormatVisitor.Base base = new JsonObjectFormatVisitor.Base();
        
        beanPropertyWriter.depositSchemaProperty(base);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)}
 * @utbot.executesCondition {@code (v != null): True}
 * @utbot.executesCondition {@code (isRequired()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor#property(com.fasterxml.jackson.databind.BeanProperty)}
 *  */
    @Test
    public void testDepositSchemaProperty_IsRequired() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        JsonObjectFormatVisitor.Base base = new JsonObjectFormatVisitor.Base();
        
        beanPropertyWriter.depositSchemaProperty(base);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ser = provider.findValueSerializer(getType(), this);
 *  */
    @Test
    public void testDepositSchemaProperty_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ReferenceType _cfgSerializationType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _cfgSerializationType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:829) */
        beanPropertyWriter.depositSchemaProperty(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getGenericPropertyType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ser = provider.findValueSerializer(getType(), this);
 *  */
    @Test
    public void testDepositSchemaProperty_ThrowNullPointerException_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:829) */
        beanPropertyWriter.depositSchemaProperty(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test
    public void testDepositSchemaProperty1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ReferenceType _declaredType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _declaredType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 9);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", -1);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 9]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:102)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:513)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:829) */
        beanPropertyWriter.depositSchemaProperty(null, impl);
    }
    
    @Test
    public void testDepositSchemaProperty2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ReferenceType _declaredType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        ObjectNode objectNode = new ObjectNode(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 39);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 1073741862);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741862 out of bounds for length 39]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:102)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:513)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:829) */
        beanPropertyWriter.depositSchemaProperty(objectNode, impl);
    }
    
    @Test
    public void testDepositSchemaProperty3() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        MapLikeType _declaredType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        ReferenceType _cfgSerializationType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_cfgSerializationType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _cfgSerializationType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        _buckets[38] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 38);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:515)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:829) */
        beanPropertyWriter.depositSchemaProperty(null, impl);
    }
    
    @Test
    public void testDepositSchemaProperty4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        CollectionType _declaredType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        ArrayType _cfgSerializationType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_cfgSerializationType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _cfgSerializationType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_type", _type);
        _buckets[38] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 38);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:515)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:829) */
        beanPropertyWriter.depositSchemaProperty(null, impl);
    }
    
    @Test
    public void testDepositSchemaProperty5() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ReferenceType _cfgSerializationType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _cfgSerializationType);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName(BeanPropertyWriter.java:466)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._depositSchemaProperty(BeanPropertyWriter.java:505)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:837) */
        beanPropertyWriter.depositSchemaProperty(null, null);
    }
    
    @Test
    public void testDepositSchemaProperty6() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ReferenceType _declaredType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _declaredType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_isTyped", true);
        _buckets[38] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 38);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:515)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:829) */
        beanPropertyWriter.depositSchemaProperty(null, impl);
    }
    
    @Test
    public void testDepositSchemaProperty7() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ReferenceType _cfgSerializationType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _cfgSerializationType);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        StdDelegatingSerializer _serializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        BeanSerializer _delegateSerializer = ((BeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.BeanSerializer"));
        setField(_serializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.getSchema(BeanSerializerBase.java:750)
            com.fasterxml.jackson.databind.ser.std.StdSerializer.getSchema(StdSerializer.java:115)
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer.getSchema(StdDelegatingSerializer.java:224)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:833) */
        beanPropertyWriter.depositSchemaProperty(null, null);
    }
    
    @Test
    public void testDepositSchemaProperty8() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        CollectionLikeType _declaredType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_hash", 16384);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        ReferenceType _cfgSerializationType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _cfgSerializationType);
        ObjectNode objectNode = new ObjectNode(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 1);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        EnumSerializer value = ((EnumSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.EnumSerializer"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "value", value);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_type", _declaredType);
        _buckets[0] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.getAnnotationIntrospector(SerializerProvider.java:331)
            com.fasterxml.jackson.databind.ser.std.EnumSerializer.createContextual(EnumSerializer.java:101)
            com.fasterxml.jackson.databind.SerializerProvider.handleSecondaryContextualization(SerializerProvider.java:936)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:527)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:829) */
        beanPropertyWriter.depositSchemaProperty(objectNode, impl);
    }
    
    @Test
    public void testDepositSchemaProperty9() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ReferenceType _cfgSerializationType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_cfgSerializationType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _cfgSerializationType);
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        StdDelegatingSerializer _serializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        ObjectNode objectNode = new ObjectNode(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName(BeanPropertyWriter.java:466)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._depositSchemaProperty(BeanPropertyWriter.java:505)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:837) */
        beanPropertyWriter.depositSchemaProperty(objectNode, impl);
    }
    
    @Test
    public void testDepositSchemaProperty10() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyMetadata _metadata = ((PropertyMetadata) createInstance("com.fasterxml.jackson.databind.PropertyMetadata"));
        Boolean _required = true;
        setField(_metadata, "com.fasterxml.jackson.databind.PropertyMetadata", "_required", _required);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_metadata", _metadata);
        StdDelegatingSerializer _serializer = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        NullSerializer _delegateSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(_serializer, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateSerializer", _delegateSerializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName(BeanPropertyWriter.java:466)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._depositSchemaProperty(BeanPropertyWriter.java:505)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:837) */
        beanPropertyWriter.depositSchemaProperty(null, null);
    }
    
    @Test
    public void testDepositSchemaProperty11() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        CollectionLikeType _declaredType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        ObjectNode objectNode = new ObjectNode(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        UnwrappingBeanSerializer value = ((UnwrappingBeanSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "value", value);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_type", _declaredType);
        _buckets[38] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 38);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.getAnnotationIntrospector(SerializerProvider.java:331)
            com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.createContextual(BeanSerializerBase.java:386)
            com.fasterxml.jackson.databind.SerializerProvider.handleSecondaryContextualization(SerializerProvider.java:936)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:527)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty(BeanPropertyWriter.java:829) */
        beanPropertyWriter.depositSchemaProperty(objectNode, impl);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(expected = NullPointerException.class)
    public void testDepositSchemaProperty12() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ReferenceType _declaredType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        ObjectNode objectNode = new ObjectNode(null);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_isTyped", true);
        _buckets[38] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 38);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        beanPropertyWriter.depositSchemaProperty(objectNode, impl);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(timeout = 1000L)
    public void testDepositSchemaProperty13() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ReferenceType _declaredType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_declaredType, "com.fasterxml.jackson.databind.JavaType", "_hash", Integer.MIN_VALUE);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _declaredType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", 39);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket");
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "next", bucket);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap$Bucket", "_isTyped", true);
        _buckets[38] = bucket;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_mask", 38);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        beanPropertyWriter.depositSchemaProperty(null, impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _handleSelfReference(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_handleSelfReference_NotProvIsEnabled() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -255);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        boolean actual = beanPropertyWriter._handleSelfReference(null, null, impl, null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)): True}
 * @utbot.executesCondition {@code (!ser.usesObjectId()): True}
 * @utbot.executesCondition {@code (ser instanceof BeanSerializerBase): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_handleSelfReference_NotSerNotInstanceOfBeanSerializerBase() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -247);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, null);
        
        boolean actual = beanPropertyWriter._handleSelfReference(null, null, impl, typeWrappedSerializer);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)): True}
 * @utbot.executesCondition {@code (!ser.usesObjectId()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void test_handleSelfReference_SerUsesObjectId() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -247);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ObjectIdWriter objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(null, objectIdWriter, null);
        
        boolean actual = beanPropertyWriter._handleSelfReference(null, null, impl, unwrappingBeanSerializer);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleSelfReference(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#isEnabled(com.fasterxml.jackson.databind.SerializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES) && !ser.usesObjectId()
 *  */
    @Test
    public void test_handleSelfReference_ThrowNullPointerException() throws JsonMappingException  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(BeanPropertyWriter.java:890) */
        beanPropertyWriter._handleSelfReference(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#isEnabled(com.fasterxml.jackson.databind.SerializationFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializer#usesObjectId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !ser.usesObjectId()
 *  */
    @Test
    public void test_handleSelfReference_ThrowNullPointerException_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -247);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(BeanPropertyWriter.java:891) */
        beanPropertyWriter._handleSelfReference(null, null, impl, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _handleSelfReference(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_handleSelfReference(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (prov.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)): True}
 * @utbot.executesCondition {@code (!ser.usesObjectId()): True}
 * @utbot.executesCondition {@code (ser instanceof BeanSerializerBase): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializerProvider#isEnabled(com.fasterxml.jackson.databind.SerializationFeature)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializer#usesObjectId()}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} when: ser instanceof BeanSerializerBase
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_handleSelfReference_ThrowJsonMappingException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -247);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        UnwrappingBeanSerializer unwrappingBeanSerializer = new UnwrappingBeanSerializer(null, null, null);
        
        beanPropertyWriter._handleSelfReference(null, null, impl, unwrappingBeanSerializer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method serializeAsPlaceholder(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 *  */
    @Test
    public void testSerializeAsPlaceholder() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 11);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        beanPropertyWriter.serializeAsPlaceholder(null, writerBasedJsonGenerator, null);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 11));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 12));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer13 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 13));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer14 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 14));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer13);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer14);
        
        assertEquals(15, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(0, finalWriterBasedJsonGenerator_writeContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 *  */
    @Test
    public void testSerializeAsPlaceholder_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 11);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 16);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        beanPropertyWriter.serializeAsPlaceholder(null, writerBasedJsonGenerator, null);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 11));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 12));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer13 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 13));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer14 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 14));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer13);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer14);
        
        assertEquals(15, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(1, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeAsPlaceholder(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeNull();
 *  */
    @Test
    public void testSerializeAsPlaceholder_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000', '\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741823);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:796)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:754)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:783) */
        beanPropertyWriter.serializeAsPlaceholder(null, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeNull();
 *  */
    @Test
    public void testSerializeAsPlaceholder_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 1073741824);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1073741824);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:796)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:754)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:783) */
        beanPropertyWriter.serializeAsPlaceholder(null, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeNull();
 *  */
    @Test
    public void testSerializeAsPlaceholder_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:796)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:754)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:783) */
        beanPropertyWriter.serializeAsPlaceholder(null, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeNull();
 *  */
    @Test
    public void testSerializeAsPlaceholder_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 4);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:783) */
        beanPropertyWriter.serializeAsPlaceholder(null, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gen.writeNull();
 *  */
    @Test
    public void testSerializeAsPlaceholder_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", 6);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 6);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 10);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1626)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:783) */
        beanPropertyWriter.serializeAsPlaceholder(null, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gen.writeNull();
 *  */
    @Test
    public void testSerializeAsPlaceholder_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:783) */
        beanPropertyWriter.serializeAsPlaceholder(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method serializeAsPlaceholder(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test
    public void testSerializeAsPlaceholder1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[13];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 9);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 14);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
        
        char[] writerBasedJsonGenerator_outputBuffer = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer9 = ((Character) get(writerBasedJsonGenerator_outputBuffer, 9));
        char[] writerBasedJsonGenerator_outputBuffer1 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer10 = ((Character) get(writerBasedJsonGenerator_outputBuffer1, 10));
        char[] writerBasedJsonGenerator_outputBuffer2 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer11 = ((Character) get(writerBasedJsonGenerator_outputBuffer2, 11));
        char[] writerBasedJsonGenerator_outputBuffer3 = ((char[]) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer"));
        char finalWriterBasedJsonGenerator_outputBuffer12 = ((Character) get(writerBasedJsonGenerator_outputBuffer3, 12));
        int finalWriterBasedJsonGenerator_outputTail = ((Integer) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail"));
        JsonWriteContext writerBasedJsonGenerator_writeContext = ((JsonWriteContext) getFieldValue(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext"));
        int finalWriterBasedJsonGenerator_writeContext_index = ((Integer) getFieldValue(writerBasedJsonGenerator_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals('n', finalWriterBasedJsonGenerator_outputBuffer9);
        
        assertEquals('u', finalWriterBasedJsonGenerator_outputBuffer10);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer11);
        
        assertEquals('l', finalWriterBasedJsonGenerator_outputBuffer12);
        
        assertEquals(13, finalWriterBasedJsonGenerator_outputTail);
        
        assertEquals(-2147483647, finalWriterBasedJsonGenerator_writeContext_index);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method serializeAsPlaceholder(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test
    public void testSerializeAsPlaceholder2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = new char[15];
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 13);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 18);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1625)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:783) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder3() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 5);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1624)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:783) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:479)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:813)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:769)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:754)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:781) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder5() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:781) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder6() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:781) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder7() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:781) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder8() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:781) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder9() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:781) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder10() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_gotName", true);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1888)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:794)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:754)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:781) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder11() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:479)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:354)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:810)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:769)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:754)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:783) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder12() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:783) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder13() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:30)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:781) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder14() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        TypeWrappedSerializer _nullSerializer = new TypeWrappedSerializer(null, typeWrappedSerializer);
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:802)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:769)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:754)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serializeWithType(NullSerializer.java:44)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:42)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:32)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:781) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder15() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        TypeWrappedSerializer _nullSerializer = new TypeWrappedSerializer(null, typeWrappedSerializer);
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1623)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:755)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serializeWithType(NullSerializer.java:44)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:42)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:32)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:781) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method serializeAsPlaceholder(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(expected = JsonGenerationException.class)
    public void testSerializeAsPlaceholder16() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testSerializeAsPlaceholder17() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testSerializeAsPlaceholder18() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test(expected = JsonGenerationException.class)
    public void testSerializeAsPlaceholder19() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, nullSerializer);
        TypeWrappedSerializer _nullSerializer = new TypeWrappedSerializer(null, typeWrappedSerializer);
        beanPropertyWriter._nullSerializer = _nullSerializer;
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.setNonTrivialBaseType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setNonTrivialBaseType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#setNonTrivialBaseType(com.fasterxml.jackson.databind.JavaType)}
 *  */
    @Test
    public void testSetNonTrivialBaseType() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        
        beanPropertyWriter.setNonTrivialBaseType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsOmittedField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method serializeAsOmittedField(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsOmittedField(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (!gen.canOmitFields()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#canOmitFields()}
 *  */
    @Test
    public void testSerializeAsOmittedField_GenCanOmitFields() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        UTF8JsonGenerator uTF8JsonGenerator = ((UTF8JsonGenerator) createInstance("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        
        beanPropertyWriter.serializeAsOmittedField(null, uTF8JsonGenerator, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeAsOmittedField(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsOmittedField(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#canOmitFields()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !gen.canOmitFields()
 *  */
    @Test
    public void testSerializeAsOmittedField_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsOmittedField] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsOmittedField(BeanPropertyWriter.java:707) */
        beanPropertyWriter.serializeAsOmittedField(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getSerializationType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSerializationType()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getSerializationType()}
 * @utbot.returnsFrom {@code return _cfgSerializationType;}
 *  */
    @Test
    public void testGetSerializationType_Return_cfgSerializationType() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        JavaType actual = beanPropertyWriter.getSerializationType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.removeInternalSetting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeInternalSetting(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#removeInternalSetting(java.lang.Object)}
 * @utbot.executesCondition {@code (_internalSettings != null): False}
 * @utbot.returnsFrom {@code return removed;}
 *  */
    @Test
    public void testRemoveInternalSetting__internalSettingsEqualsNull() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        
        Object actual = beanPropertyWriter.removeInternalSetting(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#removeInternalSetting(java.lang.Object)}
 * @utbot.executesCondition {@code (_internalSettings != null): True}
 * @utbot.executesCondition {@code (_internalSettings.size() == 0): True}
 * @utbot.returnsFrom {@code return removed;}
 *  */
    @Test
    public void testRemoveInternalSetting__internalSettingsSizeEqualsZero() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        HashMap _internalSettings = new HashMap();
        beanPropertyWriter._internalSettings = _internalSettings;
        byte[] byteArray = {};
        
        Object actual = beanPropertyWriter.removeInternalSetting(byteArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#removeInternalSetting(java.lang.Object)}
 * @utbot.executesCondition {@code (_internalSettings != null): True}
 * @utbot.executesCondition {@code (_internalSettings.size() == 0): False}
 * @utbot.returnsFrom {@code return removed;}
 *  */
    @Test
    public void testRemoveInternalSetting__internalSettingsSizeNotEqualsZero() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        HashMap _internalSettings = new HashMap();
        _internalSettings.put(null, null);
        beanPropertyWriter._internalSettings = _internalSettings;
        Integer integer = 0;
        
        Object actual = beanPropertyWriter.removeInternalSetting(integer);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getContextAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContextAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getContextAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_contextAnnotations == null)): True}
 * @utbot.returnsFrom {@code return (_contextAnnotations == null) ? null : _contextAnnotations.get(acls);}
 *  */
    @Test
    public void testGetContextAnnotation__contextAnnotationsEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        Annotation actual = beanPropertyWriter.getContextAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getContextAnnotation(java.lang.Class)}
 * @utbot.executesCondition {@code ((_contextAnnotations == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.Annotations#get(java.lang.Class)}
 * @utbot.returnsFrom {@code return (_contextAnnotations == null) ? null : _contextAnnotations.get(acls);}
 *  */
    @Test
    public void testGetContextAnnotation__contextAnnotationsNotEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotationMap _contextAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_contextAnnotations", _contextAnnotations);
        
        Annotation actual = beanPropertyWriter.getContextAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.wouldConflictWithName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): True}
 * @utbot.returnsFrom {@code return _wrapperName.equals(name);}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameNotEqualsNull_4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(_wrapperName);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): True}
 * @utbot.returnsFrom {@code return _wrapperName.equals(name);}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameNotEqualsNull_5() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): True}
 * @utbot.returnsFrom {@code return _wrapperName.equals(name);}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameNotEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(propertyName);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): True}
 * @utbot.returnsFrom {@code return _wrapperName.equals(name);}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameNotEqualsNull_6() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_wrapperName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(propertyName);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): False}
 * @utbot.returnsFrom {@code return name.hasSimpleName(_name.getValue()) && !name.hasNamespace();}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(propertyName);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): False}
 * @utbot.returnsFrom {@code return name.hasSimpleName(_name.getValue()) && !name.hasNamespace();}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameEqualsNull_3() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = " ";
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(propertyName);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): True}
 * @utbot.returnsFrom {@code return _wrapperName.equals(name);}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameNotEqualsNull_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(propertyName);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): True}
 * @utbot.returnsFrom {@code return _wrapperName.equals(name);}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameNotEqualsNull_2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(propertyName);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): True}
 * @utbot.returnsFrom {@code return _wrapperName.equals(name);}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameNotEqualsNull_3() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "";
        setField(_wrapperName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(propertyName);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): False}
 * @utbot.returnsFrom {@code return name.hasSimpleName(_name.getValue()) && !name.hasNamespace();}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameEqualsNull_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(propertyName);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): False}
 * @utbot.returnsFrom {@code return name.hasSimpleName(_name.getValue()) && !name.hasNamespace();}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameEqualsNull_2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _namespace = "";
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_namespace", _namespace);
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(propertyName);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.executesCondition {@code (_wrapperName != null): True}
 * @utbot.returnsFrom {@code return _wrapperName.equals(name);}
 *  */
    @Test
    public void testWouldConflictWithName__wrapperNameNotEqualsNull_7() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        String _simpleName = "";
        setField(_wrapperName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        PropertyName propertyName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(propertyName, "com.fasterxml.jackson.databind.PropertyName", "_simpleName", _simpleName);
        
        boolean actual = beanPropertyWriter.wouldConflictWithName(propertyName);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return name.hasSimpleName(_name.getValue()) && !name.hasNamespace();
 *  */
    @Test
    public void testWouldConflictWithName_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.wouldConflictWithName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.wouldConflictWithName(BeanPropertyWriter.java:603) */
        beanPropertyWriter.wouldConflictWithName(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#wouldConflictWithName(com.fasterxml.jackson.databind.PropertyName)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.SerializedString#getValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.PropertyName#hasSimpleName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return name.hasSimpleName(_name.getValue()) && !name.hasNamespace();
 *  */
    @Test
    public void testWouldConflictWithName_ThrowNullPointerException_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.wouldConflictWithName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.wouldConflictWithName(BeanPropertyWriter.java:603) */
        beanPropertyWriter.wouldConflictWithName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter._depositSchemaProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode, com.fasterxml.jackson.databind.JsonNode)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode)}
 *  */
    @Test
    public void test_depositSchemaProperty() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_name, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ObjectNode objectNode = new ObjectNode(null, linkedHashMap);
        BooleanNode booleanNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        
        beanPropertyWriter._depositSchemaProperty(objectNode, booleanNode);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode)}
 *  */
    @Test
    public void test_depositSchemaProperty_1() throws Exception  {
        NullNode prevInstance = NullNode.instance;
        try {
            NullNode instance = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
            Class nullNodeClazz = Class.forName("com.fasterxml.jackson.databind.node.NullNode");
            setStaticField(nullNodeClazz, "instance", instance);
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
            JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ObjectNode objectNode = new ObjectNode(jsonNodeFactory, linkedHashMap);
            
            beanPropertyWriter._depositSchemaProperty(objectNode, null);
        } finally {
            setStaticField(NullNode.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode, com.fasterxml.jackson.databind.JsonNode)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_depositSchemaProperty(com.fasterxml.jackson.databind.node.ObjectNode,com.fasterxml.jackson.databind.JsonNode)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.ObjectNode#set(java.lang.String,com.fasterxml.jackson.databind.JsonNode)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: propertiesNode.set(getName(), schemaNode);
 *  */
    @Test
    public void test_depositSchemaProperty_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._depositSchemaProperty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._depositSchemaProperty(BeanPropertyWriter.java:505) */
        beanPropertyWriter._depositSchemaProperty(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getRawSerializationType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRawSerializationType()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getRawSerializationType()}
 * @utbot.executesCondition {@code ((_cfgSerializationType == null)): True}
 * @utbot.returnsFrom {@code return (_cfgSerializationType == null) ? null : _cfgSerializationType.getRawClass();}
 *  */
    @Test
    public void testGetRawSerializationType__cfgSerializationTypeEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        Class actual = beanPropertyWriter.getRawSerializationType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getRawSerializationType()}
 * @utbot.executesCondition {@code ((_cfgSerializationType == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code return (_cfgSerializationType == null) ? null : _cfgSerializationType.getRawClass();}
 *  */
    @Test
    public void testGetRawSerializationType__cfgSerializationTypeNotEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ReferenceType _cfgSerializationType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _cfgSerializationType);
        
        Class actual = beanPropertyWriter.getRawSerializationType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.findFormatOverrides
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findFormatOverrides(com.fasterxml.jackson.databind.AnnotationIntrospector)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#findFormatOverrides(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.executesCondition {@code (f == null): True}
 * @utbot.executesCondition {@code (((intr == null) || (_member == null))): False}
 * @utbot.executesCondition {@code ((f == null)): True}
 *  */
    @Test
    public void testFindFormatOverrides_IntrEqualsNullOr_memberEqualsNull() throws Exception  {
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        JsonFormat.Value prevNO_FORMAT = BeanPropertyWriter.NO_FORMAT;
        try {
            JsonFormat.Features empty = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty);
            JsonFormat.Value noFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String pattern = "";
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "pattern", pattern);
            JsonFormat.Shape shape = JsonFormat.Shape.ANY;
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "shape", shape);
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "features", empty);
            Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
            setStaticField(beanPropertyWriterClazz, "NO_FORMAT", noFormat);
            BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
            
            JsonFormat.Value initialBeanPropertyWriter_format = beanPropertyWriter._format;
            
            JsonFormat.Value actual = beanPropertyWriter.findFormatOverrides(null);
            
            assertNull(actual);
            
            JsonFormat.Value finalBeanPropertyWriter_format = beanPropertyWriter._format;
            
            assertFalse(initialBeanPropertyWriter_format == finalBeanPropertyWriter_format);
        } finally {
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY);
            setStaticField(BeanPropertyWriter.class, "NO_FORMAT", prevNO_FORMAT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#findFormatOverrides(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.executesCondition {@code (f == null): True}
 * @utbot.executesCondition {@code (((intr == null) || (_member == null))): True}
 * @utbot.executesCondition {@code (((intr == null) || (_member == null))): False}
 * @utbot.executesCondition {@code ((f == null)): True}
 *  */
    @Test
    public void testFindFormatOverrides_FEqualsNull() throws Exception  {
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        JsonFormat.Value prevNO_FORMAT = BeanPropertyWriter.NO_FORMAT;
        try {
            JsonFormat.Features empty = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty);
            JsonFormat.Value noFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String pattern = "";
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "pattern", pattern);
            JsonFormat.Shape shape = JsonFormat.Shape.ANY;
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "shape", shape);
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "features", empty);
            Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
            setStaticField(beanPropertyWriterClazz, "NO_FORMAT", noFormat);
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            AnnotatedMethod _member = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
            NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            
            JsonFormat.Value initialBeanPropertyWriter_format = beanPropertyWriter._format;
            
            JsonFormat.Value actual = beanPropertyWriter.findFormatOverrides(anonymousNopAnnotationIntrospector);
            
            assertNull(actual);
            
            JsonFormat.Value finalBeanPropertyWriter_format = beanPropertyWriter._format;
            
            assertFalse(initialBeanPropertyWriter_format == finalBeanPropertyWriter_format);
        } finally {
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY);
            setStaticField(BeanPropertyWriter.class, "NO_FORMAT", prevNO_FORMAT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#findFormatOverrides(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.executesCondition {@code (f == null): True}
 * @utbot.executesCondition {@code (((intr == null) || (_member == null))): True}
 * @utbot.executesCondition {@code (((intr == null) || (_member == null))): True}
 * @utbot.executesCondition {@code ((f == null)): True}
 *  */
    @Test
    public void testFindFormatOverrides_IntrEqualsNullOr_memberEqualsNull_1() throws Exception  {
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        JsonFormat.Value prevNO_FORMAT = BeanPropertyWriter.NO_FORMAT;
        try {
            JsonFormat.Features empty = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty);
            JsonFormat.Value noFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String pattern = "";
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "pattern", pattern);
            JsonFormat.Shape shape = JsonFormat.Shape.ANY;
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "shape", shape);
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "features", empty);
            Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
            setStaticField(beanPropertyWriterClazz, "NO_FORMAT", noFormat);
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
            
            JsonFormat.Value initialBeanPropertyWriter_format = beanPropertyWriter._format;
            
            JsonFormat.Value actual = beanPropertyWriter.findFormatOverrides(jacksonAnnotationIntrospector);
            
            assertNull(actual);
            
            JsonFormat.Value finalBeanPropertyWriter_format = beanPropertyWriter._format;
            
            assertFalse(initialBeanPropertyWriter_format == finalBeanPropertyWriter_format);
        } finally {
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY);
            setStaticField(BeanPropertyWriter.class, "NO_FORMAT", prevNO_FORMAT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#findFormatOverrides(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.executesCondition {@code (f == null): True}
 * @utbot.executesCondition {@code (((intr == null) || (_member == null))): True}
 * @utbot.executesCondition {@code (((intr == null) || (_member == null))): False}
 * @utbot.executesCondition {@code ((f == null)): True}
 *  */
    @Test
    public void testFindFormatOverrides_FEqualsNull_1() throws Exception  {
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        JsonFormat.Value prevNO_FORMAT = BeanPropertyWriter.NO_FORMAT;
        try {
            JsonFormat.Features empty = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty);
            JsonFormat.Value noFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String pattern = "";
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "pattern", pattern);
            JsonFormat.Shape shape = JsonFormat.Shape.ANY;
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "shape", shape);
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "features", empty);
            Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
            setStaticField(beanPropertyWriterClazz, "NO_FORMAT", noFormat);
            BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
            AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
            setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
            NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            NopAnnotationIntrospector anonymousNopAnnotationIntrospector1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
            AnnotationIntrospectorPair annotationIntrospectorPair = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, anonymousNopAnnotationIntrospector1);
            
            JsonFormat.Value initialBeanPropertyWriter_format = beanPropertyWriter._format;
            
            JsonFormat.Value actual = beanPropertyWriter.findFormatOverrides(annotationIntrospectorPair);
            
            assertNull(actual);
            
            JsonFormat.Value finalBeanPropertyWriter_format = beanPropertyWriter._format;
            
            assertFalse(initialBeanPropertyWriter_format == finalBeanPropertyWriter_format);
        } finally {
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY);
            setStaticField(BeanPropertyWriter.class, "NO_FORMAT", prevNO_FORMAT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#findFormatOverrides(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.executesCondition {@code (f == null): False}
 *  */
    @Test
    public void testFindFormatOverrides_FNotEqualsNull_1() throws Exception  {
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        JsonFormat.Value prevNO_FORMAT = BeanPropertyWriter.NO_FORMAT;
        try {
            JsonFormat.Features empty = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty);
            JsonFormat.Value noFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String pattern = "";
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "pattern", pattern);
            JsonFormat.Shape shape = JsonFormat.Shape.ANY;
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "shape", shape);
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "features", empty);
            Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
            setStaticField(beanPropertyWriterClazz, "NO_FORMAT", noFormat);
            BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
            beanPropertyWriter._format = noFormat;
            
            JsonFormat.Value actual = beanPropertyWriter.findFormatOverrides(null);
            
            assertNull(actual);
        } finally {
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY);
            setStaticField(BeanPropertyWriter.class, "NO_FORMAT", prevNO_FORMAT);
        }
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#findFormatOverrides(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.executesCondition {@code (f == null): False}
 *  */
    @Test
    public void testFindFormatOverrides_FNotEqualsNull() throws Exception  {
        Class featuresClazz = Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Features");
        JsonFormat.Features prevEMPTY = ((JsonFormat.Features) getStaticFieldValue(featuresClazz, "EMPTY"));
        JsonFormat.Value prevNO_FORMAT = BeanPropertyWriter.NO_FORMAT;
        try {
            JsonFormat.Features empty = ((JsonFormat.Features) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Features"));
            setStaticField(featuresClazz, "EMPTY", empty);
            JsonFormat.Value noFormat = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            String pattern = "";
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "pattern", pattern);
            JsonFormat.Shape shape = JsonFormat.Shape.ANY;
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "shape", shape);
            setField(noFormat, "com.fasterxml.jackson.annotation.JsonFormat$Value", "features", empty);
            Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
            setStaticField(beanPropertyWriterClazz, "NO_FORMAT", noFormat);
            BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
            JsonFormat.Value _format = ((JsonFormat.Value) createInstance("com.fasterxml.jackson.annotation.JsonFormat$Value"));
            beanPropertyWriter._format = _format;
            
            JsonFormat.Value actual = beanPropertyWriter.findFormatOverrides(null);
            
            String actualPattern = actual.getPattern();
            assertNull(actualPattern);
            
            JsonFormat.Shape actualShape = actual.getShape();
            assertNull(actualShape);
            
            Locale actualLocale = actual.getLocale();
            assertNull(actualLocale);
            
            String actualTimezoneStr = ((String) getFieldValue(actual, "com.fasterxml.jackson.annotation.JsonFormat$Value", "timezoneStr"));
            assertNull(actualTimezoneStr);
            
            JsonFormat.Features actualFeatures = ((JsonFormat.Features) getFieldValue(actual, "com.fasterxml.jackson.annotation.JsonFormat$Value", "features"));
            assertNull(actualFeatures);
            
            TimeZone actual_timezone = ((TimeZone) getFieldValue(actual, "com.fasterxml.jackson.annotation.JsonFormat$Value", "_timezone"));
            assertNull(actual_timezone);
            
        } finally {
            setStaticField(JsonFormat.Features.class, "EMPTY", prevEMPTY);
            setStaticField(BeanPropertyWriter.class, "NO_FORMAT", prevNO_FORMAT);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findFormatOverrides(com.fasterxml.jackson.databind.AnnotationIntrospector)
    
    @Test(expected = StackOverflowError.class)
    public void testFindFormatOverrides1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        AnnotationIntrospectorPair annotationIntrospectorPair = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotationIntrospectorPair, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", annotationIntrospectorPair);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(annotationIntrospectorPair, null);
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair1);
        
        beanPropertyWriter.findFormatOverrides(annotationIntrospectorPair2);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindFormatOverrides2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        AnnotationIntrospectorPair annotationIntrospectorPair = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotationIntrospectorPair, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", anonymousNopAnnotationIntrospector);
        setField(annotationIntrospectorPair, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", annotationIntrospectorPair);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair);
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(annotationIntrospectorPair1, null);
        AnnotationIntrospectorPair annotationIntrospectorPair3 = new AnnotationIntrospectorPair(annotationIntrospectorPair2, null);
        AnnotationIntrospectorPair annotationIntrospectorPair4 = new AnnotationIntrospectorPair(annotationIntrospectorPair3, null);
        
        beanPropertyWriter.findFormatOverrides(annotationIntrospectorPair4);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindFormatOverrides3() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        AnnotationIntrospectorPair annotationIntrospectorPair = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotationIntrospectorPair, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", annotationIntrospectorPair);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(annotationIntrospectorPair, null);
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair1);
        AnnotationIntrospectorPair annotationIntrospectorPair3 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair2);
        AnnotationIntrospectorPair annotationIntrospectorPair4 = new AnnotationIntrospectorPair(annotationIntrospectorPair3, null);
        AnnotationIntrospectorPair annotationIntrospectorPair5 = new AnnotationIntrospectorPair(annotationIntrospectorPair4, null);
        AnnotationIntrospectorPair annotationIntrospectorPair6 = new AnnotationIntrospectorPair(annotationIntrospectorPair5, null);
        AnnotationIntrospectorPair annotationIntrospectorPair7 = new AnnotationIntrospectorPair(annotationIntrospectorPair6, null);
        
        beanPropertyWriter.findFormatOverrides(annotationIntrospectorPair7);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindFormatOverrides4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        AnnotationIntrospectorPair annotationIntrospectorPair = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", anonymousNopAnnotationIntrospector);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", annotationIntrospectorPair);
        setField(_primary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(annotationIntrospectorPair, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(annotationIntrospectorPair, null);
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair1);
        AnnotationIntrospectorPair annotationIntrospectorPair3 = new AnnotationIntrospectorPair(annotationIntrospectorPair2, null);
        AnnotationIntrospectorPair annotationIntrospectorPair4 = new AnnotationIntrospectorPair(annotationIntrospectorPair3, null);
        AnnotationIntrospectorPair annotationIntrospectorPair5 = new AnnotationIntrospectorPair(annotationIntrospectorPair4, null);
        AnnotationIntrospectorPair annotationIntrospectorPair6 = new AnnotationIntrospectorPair(annotationIntrospectorPair5, null);
        
        beanPropertyWriter.findFormatOverrides(annotationIntrospectorPair6);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindFormatOverrides5() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        AnnotationIntrospectorPair annotationIntrospectorPair = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(annotationIntrospectorPair, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", annotationIntrospectorPair);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(annotationIntrospectorPair, null);
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair1);
        AnnotationIntrospectorPair annotationIntrospectorPair3 = new AnnotationIntrospectorPair(annotationIntrospectorPair2, null);
        AnnotationIntrospectorPair annotationIntrospectorPair4 = new AnnotationIntrospectorPair(annotationIntrospectorPair3, null);
        AnnotationIntrospectorPair annotationIntrospectorPair5 = new AnnotationIntrospectorPair(annotationIntrospectorPair4, null);
        AnnotationIntrospectorPair annotationIntrospectorPair6 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair5);
        AnnotationIntrospectorPair annotationIntrospectorPair7 = new AnnotationIntrospectorPair(annotationIntrospectorPair6, null);
        AnnotationIntrospectorPair annotationIntrospectorPair8 = new AnnotationIntrospectorPair(annotationIntrospectorPair7, null);
        AnnotationIntrospectorPair annotationIntrospectorPair9 = new AnnotationIntrospectorPair(annotationIntrospectorPair8, null);
        AnnotationIntrospectorPair annotationIntrospectorPair10 = new AnnotationIntrospectorPair(annotationIntrospectorPair9, null);
        
        beanPropertyWriter.findFormatOverrides(annotationIntrospectorPair10);
    }
    
    @Test
    public void testFindFormatOverrides6() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        AnnotationIntrospectorPair annotationIntrospectorPair = new AnnotationIntrospectorPair(null, null);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(annotationIntrospectorPair, null);
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(annotationIntrospectorPair1, null);
        AnnotationIntrospectorPair annotationIntrospectorPair3 = new AnnotationIntrospectorPair(annotationIntrospectorPair2, null);
        AnnotationIntrospectorPair annotationIntrospectorPair4 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair3);
        AnnotationIntrospectorPair annotationIntrospectorPair5 = new AnnotationIntrospectorPair(annotationIntrospectorPair4, null);
        AnnotationIntrospectorPair annotationIntrospectorPair6 = new AnnotationIntrospectorPair(annotationIntrospectorPair5, null);
        AnnotationIntrospectorPair annotationIntrospectorPair7 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair6);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.findFormatOverrides] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:428)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:428)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.findFormatOverrides(BeanPropertyWriter.java:495) */
        beanPropertyWriter.findFormatOverrides(annotationIntrospectorPair7);
    }
    
    @Test
    public void testFindFormatOverrides7() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        AnnotationIntrospectorPair annotationIntrospectorPair = new AnnotationIntrospectorPair(jacksonAnnotationIntrospector, null);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(annotationIntrospectorPair, null);
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(annotationIntrospectorPair1, null);
        AnnotationIntrospectorPair annotationIntrospectorPair3 = new AnnotationIntrospectorPair(annotationIntrospectorPair2, null);
        AnnotationIntrospectorPair annotationIntrospectorPair4 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair3);
        AnnotationIntrospectorPair annotationIntrospectorPair5 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair4);
        AnnotationIntrospectorPair annotationIntrospectorPair6 = new AnnotationIntrospectorPair(annotationIntrospectorPair5, null);
        AnnotationIntrospectorPair annotationIntrospectorPair7 = new AnnotationIntrospectorPair(annotationIntrospectorPair6, null);
        AnnotationIntrospectorPair annotationIntrospectorPair8 = new AnnotationIntrospectorPair(annotationIntrospectorPair7, null);
        AnnotationIntrospectorPair annotationIntrospectorPair9 = new AnnotationIntrospectorPair(annotationIntrospectorPair8, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.findFormatOverrides] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:428)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:428)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:428)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.findFormatOverrides(BeanPropertyWriter.java:495) */
        beanPropertyWriter.findFormatOverrides(annotationIntrospectorPair9);
    }
    
    @Test
    public void testFindFormatOverrides8() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        AnnotationIntrospectorPair annotationIntrospectorPair = new AnnotationIntrospectorPair(jacksonAnnotationIntrospector, null);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(annotationIntrospectorPair, null);
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(annotationIntrospectorPair1, null);
        AnnotationIntrospectorPair annotationIntrospectorPair3 = new AnnotationIntrospectorPair(annotationIntrospectorPair2, null);
        AnnotationIntrospectorPair annotationIntrospectorPair4 = new AnnotationIntrospectorPair(annotationIntrospectorPair3, null);
        AnnotationIntrospectorPair annotationIntrospectorPair5 = new AnnotationIntrospectorPair(annotationIntrospectorPair4, null);
        AnnotationIntrospectorPair annotationIntrospectorPair6 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair5);
        AnnotationIntrospectorPair annotationIntrospectorPair7 = new AnnotationIntrospectorPair(annotationIntrospectorPair6, null);
        AnnotationIntrospectorPair annotationIntrospectorPair8 = new AnnotationIntrospectorPair(annotationIntrospectorPair7, null);
        AnnotationIntrospectorPair annotationIntrospectorPair9 = new AnnotationIntrospectorPair(annotationIntrospectorPair8, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.findFormatOverrides] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:428)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:428)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.findFormatOverrides(BeanPropertyWriter.java:495) */
        beanPropertyWriter.findFormatOverrides(annotationIntrospectorPair9);
    }
    
    @Test
    public void testFindFormatOverrides9() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        NopAnnotationIntrospector anonymousNopAnnotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        AnnotationIntrospectorPair annotationIntrospectorPair = new AnnotationIntrospectorPair(null, null);
        AnnotationIntrospectorPair annotationIntrospectorPair1 = new AnnotationIntrospectorPair(annotationIntrospectorPair, null);
        AnnotationIntrospectorPair annotationIntrospectorPair2 = new AnnotationIntrospectorPair(annotationIntrospectorPair1, null);
        AnnotationIntrospectorPair annotationIntrospectorPair3 = new AnnotationIntrospectorPair(annotationIntrospectorPair2, null);
        AnnotationIntrospectorPair annotationIntrospectorPair4 = new AnnotationIntrospectorPair(annotationIntrospectorPair3, null);
        AnnotationIntrospectorPair annotationIntrospectorPair5 = new AnnotationIntrospectorPair(annotationIntrospectorPair4, null);
        AnnotationIntrospectorPair annotationIntrospectorPair6 = new AnnotationIntrospectorPair(annotationIntrospectorPair5, null);
        AnnotationIntrospectorPair annotationIntrospectorPair7 = new AnnotationIntrospectorPair(anonymousNopAnnotationIntrospector, annotationIntrospectorPair6);
        AnnotationIntrospectorPair annotationIntrospectorPair8 = new AnnotationIntrospectorPair(annotationIntrospectorPair7, null);
        AnnotationIntrospectorPair annotationIntrospectorPair9 = new AnnotationIntrospectorPair(annotationIntrospectorPair8, null);
        AnnotationIntrospectorPair annotationIntrospectorPair10 = new AnnotationIntrospectorPair(annotationIntrospectorPair9, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.findFormatOverrides] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:428)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.findFormat(AnnotationIntrospectorPair.java:427)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.findFormatOverrides(BeanPropertyWriter.java:495) */
        beanPropertyWriter.findFormatOverrides(annotationIntrospectorPair10);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.assignNullSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assignNullSerializer(com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#assignNullSerializer(com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (_nullSerializer != null): True}
 * @utbot.executesCondition {@code (_nullSerializer != nullSer): False}
 *  */
    @Test
    public void testAssignNullSerializer__nullSerializerEqualsNullSer() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        beanPropertyWriter._nullSerializer = _nullSerializer;
        
        beanPropertyWriter.assignNullSerializer(_nullSerializer);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#assignNullSerializer(com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (_nullSerializer != null): False}
 *  */
    @Test
    public void testAssignNullSerializer__nullSerializerEqualsNull() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._nullSerializer = null;
        
        beanPropertyWriter.assignNullSerializer(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method assignNullSerializer(com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#assignNullSerializer(com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (_nullSerializer != null): True}
 * @utbot.executesCondition {@code (_nullSerializer != nullSer): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: _nullSerializer != null && _nullSerializer != nullSer
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAssignNullSerializer_ThrowIllegalStateException() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        TypeWrappedSerializer _nullSerializer = new TypeWrappedSerializer(null, null);
        beanPropertyWriter._nullSerializer = _nullSerializer;
        
        beanPropertyWriter.assignNullSerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.assignTypeSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assignTypeSerializer(com.fasterxml.jackson.databind.jsontype.TypeSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#assignTypeSerializer(com.fasterxml.jackson.databind.jsontype.TypeSerializer)}
 *  */
    @Test
    public void testAssignTypeSerializer() {
        BeanPropertyWriter beanPropertyWriter = new BeanPropertyWriter();
        beanPropertyWriter._typeSerializer = null;
        
        beanPropertyWriter.assignTypeSerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getGenericPropertyType
    
    ///region Errors report for getGenericPropertyType
    
    public void testGetGenericPropertyType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.factory.CoreReflectionFactory.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.factory" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Field signature is not declared in class java.lang.reflect.Method
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1069814712572000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1069814712572000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1069814712577099 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069814712572000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069814712577099).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1069814712958900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1069814712958900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1069814712960300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069814712958900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069814712960300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1069814713239300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1069814713239300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1069814713240500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069814713239300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069814713240500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1069814713843300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1069814713843300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1069814713844999 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069814713843300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069814713844999).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

