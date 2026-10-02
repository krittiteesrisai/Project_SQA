package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.HashMap;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.lang.reflect.Type;
import com.fasterxml.jackson.databind.BeanProperty;
import java.util.HashSet;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.FloatArraySerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap;
import com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter.FixedSpaceIndenter;
import java.io.PrintWriter;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_databind_ser_BeanPropertyWriterTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.assignSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assignSerializer(com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#assignSerializer(com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (_serializer != null): False}
 *  */
    @Test
    public void testAssignSerializer__serializerEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
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
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        DateSerializer _serializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        
        beanPropertyWriter.assignSerializer(null);
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
        
        AnnotatedMember actual_member = actual._member;
        assertNull(actual_member);
        
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        assertNull(actual_contextAnnotations);
        
        JavaType actual_declaredType = actual._declaredType;
        assertNull(actual_declaredType);
        
        Method actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        Field actual_field = actual._field;
        assertNull(actual_field);
        
        HashMap actual_internalSettings = actual._internalSettings;
        assertNull(actual_internalSettings);
        
        SerializedString actual_name = actual._name;
        assertNull(actual_name);
        
        PropertyName actual_wrapperName = actual._wrapperName;
        assertNull(actual_wrapperName);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
        JsonSerializer actual_serializer = actual._serializer;
        assertNull(actual_serializer);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        assertNull(actual_dynamicSerializers);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        assertNull(actual_typeSerializer);
        
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        assertNull(actual_nonTrivialBaseType);
        
        boolean actual_isRequired = actual._isRequired;
        assertFalse(actual_isRequired);
        
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#unwrappingWriter(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.returnsFrom {@code return new UnwrappingBeanPropertyWriter(this, unwrapper);}
 *  */
    @Test
    public void testUnwrappingWriter_Return_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        AnnotationMap _contextAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_contextAnnotations", _contextAnnotations);
        ArrayType _declaredType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        Field _field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_field", _field);
        HashMap _internalSettings = new HashMap();
        beanPropertyWriter._internalSettings = _internalSettings;
        PropertyName _wrapperName = ((PropertyName) createInstance("com.fasterxml.jackson.databind.PropertyName"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        MapSerializer _serializer = ((MapSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.MapSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        Object _dynamicSerializers = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi");
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_dynamicSerializers", _dynamicSerializers);
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_typeSerializer", _typeSerializer);
        ArrayType _nonTrivialBaseType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nonTrivialBaseType", _nonTrivialBaseType);
        
        UnwrappingBeanPropertyWriter actual = ((UnwrappingBeanPropertyWriter) beanPropertyWriter.unwrappingWriter(null));
        
        UnwrappingBeanPropertyWriter expected = ((UnwrappingBeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter"));
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_contextAnnotations", _contextAnnotations);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_declaredType", _declaredType);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_field", _field);
        HashMap _internalSettings1 = new HashMap();
        expected._internalSettings = _internalSettings1;
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_wrapperName", _wrapperName);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_dynamicSerializers", _dynamicSerializers);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_typeSerializer", _typeSerializer);
        setField(expected, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nonTrivialBaseType", _nonTrivialBaseType);
        
        NameTransformer actual_nameTransformer = ((NameTransformer) getFieldValue(actual, "com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter", "_nameTransformer"));
        assertNull(actual_nameTransformer);
        
        AnnotatedMember expected_member = expected._member;
        AnnotatedMember actual_member = actual._member;
        AnnotatedWithParams actual_member_owner = ((AnnotatedWithParams) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "_owner"));
        assertNull(actual_member_owner);
        
        Type actual_member_type = ((Type) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "_type"));
        assertNull(actual_member_type);
        
        int expected_member_index = ((Integer) getFieldValue(expected_member, "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "_index"));
        int actual_member_index = ((Integer) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedParameter", "_index"));
        assertEquals(expected_member_index, actual_member_index);
        
        AnnotationMap actual_member_annotations = ((AnnotationMap) getFieldValue(actual_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations"));
        assertNull(actual_member_annotations);
        
        Annotations expected_contextAnnotations = expected._contextAnnotations;
        Annotations actual_contextAnnotations = actual._contextAnnotations;
        HashMap actual_contextAnnotations_annotations = ((HashMap) getFieldValue(actual_contextAnnotations, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_contextAnnotations_annotations);
        
        JavaType expected_declaredType = expected._declaredType;
        JavaType actual_declaredType = actual._declaredType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_declaredType, actual_declaredType);
        
        Method actual_accessorMethod = actual._accessorMethod;
        assertNull(actual_accessorMethod);
        
        Field expected_field = expected._field;
        Field actual_field = actual._field;
        // java.lang.reflect.Field has overridden equals method
        assertEquals(expected_field, actual_field);
        
        HashMap expected_internalSettings = expected._internalSettings;
        HashMap actual_internalSettings = actual._internalSettings;
        assertTrue(deepEquals(expected_internalSettings, actual_internalSettings));
        
        SerializedString actual_name = actual._name;
        assertNull(actual_name);
        
        PropertyName expected_wrapperName = expected._wrapperName;
        PropertyName actual_wrapperName = actual._wrapperName;
        // com.fasterxml.jackson.databind.PropertyName has overridden equals method
        assertEquals(expected_wrapperName, actual_wrapperName);
        
        JavaType actual_cfgSerializationType = actual._cfgSerializationType;
        assertNull(actual_cfgSerializationType);
        
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
        
        Class actual_serializer_handledType = ((Class) getFieldValue(actual_serializer, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType"));
        assertNull(actual_serializer_handledType);
        
        JsonSerializer actual_nullSerializer = actual._nullSerializer;
        assertNull(actual_nullSerializer);
        
        PropertySerializerMap expected_dynamicSerializers = expected._dynamicSerializers;
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        Object actual_dynamicSerializers_entries = getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi", "_entries");
        assertNull(actual_dynamicSerializers_entries);
        
        boolean actual_suppressNulls = actual._suppressNulls;
        assertFalse(actual_suppressNulls);
        
        Object actual_suppressableValue = actual._suppressableValue;
        assertNull(actual_suppressableValue);
        
        java.lang.Class[] actual_includeInViews = actual._includeInViews;
        assertNull(actual_includeInViews);
        
        TypeSerializer expected_typeSerializer = expected._typeSerializer;
        TypeSerializer actual_typeSerializer = actual._typeSerializer;
        String actual_typeSerializer_typePropertyName = ((String) getFieldValue(actual_typeSerializer, "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer", "_typePropertyName"));
        assertNull(actual_typeSerializer_typePropertyName);
        
        TypeIdResolver actual_typeSerializer_idResolver = ((TypeIdResolver) getFieldValue(actual_typeSerializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase", "_idResolver"));
        assertNull(actual_typeSerializer_idResolver);
        
        BeanProperty actual_typeSerializer_property = ((BeanProperty) getFieldValue(actual_typeSerializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase", "_property"));
        assertNull(actual_typeSerializer_property);
        
        JavaType expected_nonTrivialBaseType = expected._nonTrivialBaseType;
        JavaType actual_nonTrivialBaseType = actual._nonTrivialBaseType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_nonTrivialBaseType, actual_nonTrivialBaseType);
        
        boolean actual_isRequired = actual._isRequired;
        assertFalse(actual_isRequired);
        
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
        
        SerializedString actual = beanPropertyWriter.getSerializedName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.isRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRequired(com.fasterxml.jackson.databind.AnnotationIntrospector)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#isRequired(com.fasterxml.jackson.databind.AnnotationIntrospector)}
 * @utbot.returnsFrom {@code return _isRequired;}
 *  */
    @Test
    public void testIsRequired_Return_isRequired() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        boolean actual = beanPropertyWriter.isRequired(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.isRequired
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isRequired()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#isRequired()}
 * @utbot.returnsFrom {@code return _isRequired;}
 *  */
    @Test
    public void testIsRequired_Return_isRequired1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        boolean actual = beanPropertyWriter.isRequired();
        
        assertFalse(actual);
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getInternalSetting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getInternalSetting(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getInternalSetting(java.lang.Object)}
 * @utbot.executesCondition {@code (_internalSettings == null): False}
 * @utbot.invokes {@link java.util.HashMap#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return _internalSettings.get(key);}
 *  */
    @Test
    public void testGetInternalSetting__internalSettingsNotEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        HashMap _internalSettings = new HashMap();
        beanPropertyWriter._internalSettings = _internalSettings;
        byte[] byteArray = {};
        
        Object actual = beanPropertyWriter.getInternalSetting(byteArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getInternalSetting(java.lang.Object)}
 * @utbot.executesCondition {@code (_internalSettings == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetInternalSetting__internalSettingsEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        Object actual = beanPropertyWriter.getInternalSetting(null);
        
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
    public void testHasSerializer_Return_serializerEqualsNull_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        StdArraySerializers.FloatArraySerializer _serializer = ((StdArraySerializers.FloatArraySerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdArraySerializers$FloatArraySerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_serializer", _serializer);
        
        boolean actual = beanPropertyWriter.hasSerializer();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#hasSerializer()}
 * @utbot.returnsFrom {@code return _serializer != null;}
 *  */
    @Test
    public void testHasSerializer_Return_serializerEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        boolean actual = beanPropertyWriter.hasSerializer();
        
        assertFalse(actual);
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsField
    
    ///region Errors report for serializeAsField
    
    public void testSerializeAsField_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 21 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
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
    public void testGetSerializer_Return_serializer() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        JsonSerializer actual = beanPropertyWriter.getSerializer();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsColumn
    
    ///region Errors report for serializeAsColumn
    
    public void testSerializeAsColumn_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 21 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
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
    public void testSetInternalSetting__internalSettingsEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
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
    public void testSetInternalSetting__internalSettingsNotEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        HashMap _internalSettings = new HashMap();
        beanPropertyWriter._internalSettings = _internalSettings;
        
        Object actual = beanPropertyWriter.setInternalSetting(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getPropertyType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyType()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getPropertyType()}
 * @utbot.executesCondition {@code (_accessorMethod != null): True}
 * @utbot.invokes {@link java.lang.reflect.Method#getReturnType()}
 * @utbot.returnsFrom {@code return _accessorMethod.getReturnType();}
 *  */
    @Test
    public void testGetPropertyType__accessorMethodNotEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Method _accessorMethod = ((Method) createInstance("java.lang.reflect.Method"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_accessorMethod", _accessorMethod);
        
        Class actual = beanPropertyWriter.getPropertyType();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getPropertyType()}
 * @utbot.executesCondition {@code (_accessorMethod != null): False}
 * @utbot.invokes {@link java.lang.reflect.Field#getType()}
 * @utbot.returnsFrom {@code return _field.getType();}
 *  */
    @Test
    public void testGetPropertyType__accessorMethodEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Field _field = ((Field) createInstance("java.lang.reflect.Field"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_field", _field);
        
        Class actual = beanPropertyWriter.getPropertyType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyType()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getPropertyType()}
 * @utbot.executesCondition {@code (_accessorMethod != null): False}
 * @utbot.invokes {@link java.lang.reflect.Field#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _field.getType();
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getPropertyType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getPropertyType(BeanPropertyWriter.java:442) */
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
    public void testHasNullSerializer_Return_nullSerializerEqualsNull_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        CalendarSerializer _nullSerializer = ((CalendarSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.CalendarSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        
        boolean actual = beanPropertyWriter.hasNullSerializer();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#hasNullSerializer()}
 * @utbot.returnsFrom {@code return _nullSerializer != null;}
 *  */
    @Test
    public void testHasNullSerializer_Return_nullSerializerEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        boolean actual = beanPropertyWriter.hasNullSerializer();
        
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result = map.findAndAddSerializer(type, provider, this);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object multi = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Multi");
        Class class1 = Object.class;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 0);
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        _cacheKey._hashCode = -255;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1063877011 out of bounds for length 0]
            com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap.find(JsonSerializerMap.java:53)
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:86)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:378)
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.findAndAddSerializer(PropertySerializerMap.java:38)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:658) */
        Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class multiType = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap");
        Class class1Type = Class.forName("java.lang.Class");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Method _findAndAddDynamicMethod = beanPropertyWriterClazz.getDeclaredMethod("_findAndAddDynamic", multiType, class1Type, implType);
        _findAndAddDynamicMethod.setAccessible(true);
        java.lang.Object[] _findAndAddDynamicMethodArguments = new java.lang.Object[3];
        _findAndAddDynamicMethodArguments[0] = multi;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType t = provider.constructSpecializedType(_nonTrivialBaseType, type);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowNullPointerException_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SimpleType _nonTrivialBaseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nonTrivialBaseType", _nonTrivialBaseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:655) */
        beanPropertyWriter._findAndAddDynamic(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = map.findAndAddSerializer(type, provider, this);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:658) */
        beanPropertyWriter._findAndAddDynamic(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType t = provider.constructSpecializedType(_nonTrivialBaseType, type);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowNullPointerException_2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SimpleType _nonTrivialBaseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_nonTrivialBaseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nonTrivialBaseType", _nonTrivialBaseType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:656) */
        beanPropertyWriter._findAndAddDynamic(null, _class, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowNullPointerException_6() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object empty = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey.hash(SerializerCache.java:222)
            com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey.<init>(SerializerCache.java:211)
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:82)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:378)
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.findAndAddSerializer(PropertySerializerMap.java:38)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:658) */
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
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType t = provider.constructSpecializedType(_nonTrivialBaseType, type);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowNullPointerException_5() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        CollectionType _nonTrivialBaseType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(_nonTrivialBaseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nonTrivialBaseType", _nonTrivialBaseType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.JavaType._assertSubclass(JavaType.java:427)
            com.fasterxml.jackson.databind.JavaType.narrowBy(JavaType.java:150)
            com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(TypeFactory.java:201)
            com.fasterxml.jackson.databind.cfg.MapperConfig.constructSpecializedType(MapperConfig.java:241)
            com.fasterxml.jackson.databind.DatabindContext.constructSpecializedType(DatabindContext.java:100)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:655) */
        beanPropertyWriter._findAndAddDynamic(null, null, impl);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap,java.lang.Class,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowNullPointerException_3() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object empty = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        Class _class = Object.class;
        _cacheKey._class = _class;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey.hash(SerializerCache.java:222)
            com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey.resetUntyped(SerializerCache.java:248)
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:84)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:378)
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.findAndAddSerializer(PropertySerializerMap.java:38)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:658) */
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
 * @utbot.executesCondition {@code (_nonTrivialBaseType != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap#findAndAddSerializer(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.SerializerProvider,com.fasterxml.jackson.databind.BeanProperty)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result = map.findAndAddSerializer(t, provider, this);
 *  */
    @Test
    public void test_findAndAddDynamic_ThrowNullPointerException_4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        CollectionType _nonTrivialBaseType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nonTrivialBaseType", _nonTrivialBaseType);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:656) */
        beanPropertyWriter._findAndAddDynamic(null, null, impl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap, java.lang.Class, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(expected = StackOverflowError.class)
    public void test_findAndAddDynamic1() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object single = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Single");
        Class class1 = Object.class;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 1);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        Object next = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(next, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        StdDelegatingSerializer value = ((StdDelegatingSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer"));
        SimpleType _delegateType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(value, "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer", "_delegateType", _delegateType);
        setField(next, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "value", value);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "next", next);
        _buckets[0] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", key);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class singleType = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap");
        Class class1Type = Class.forName("java.lang.Class");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Method _findAndAddDynamicMethod = beanPropertyWriterClazz.getDeclaredMethod("_findAndAddDynamic", singleType, class1Type, implType);
        _findAndAddDynamicMethod.setAccessible(true);
        java.lang.Object[] _findAndAddDynamicMethodArguments = new java.lang.Object[3];
        _findAndAddDynamicMethodArguments[0] = single;
        _findAndAddDynamicMethodArguments[1] = class1;
        _findAndAddDynamicMethodArguments[2] = impl;
        try {
            _findAndAddDynamicMethod.invoke(beanPropertyWriter, _findAndAddDynamicMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_findAndAddDynamic2() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object double1 = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Double");
        Class class1 = Object.class;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 1);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        key._class = class1;
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        _buckets[0] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:381)
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.findAndAddSerializer(PropertySerializerMap.java:38)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:658) */
        Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class double1Type = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap");
        Class class1Type = Class.forName("java.lang.Class");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Method _findAndAddDynamicMethod = beanPropertyWriterClazz.getDeclaredMethod("_findAndAddDynamic", double1Type, class1Type, implType);
        _findAndAddDynamicMethod.setAccessible(true);
        java.lang.Object[] _findAndAddDynamicMethodArguments = new java.lang.Object[3];
        _findAndAddDynamicMethodArguments[0] = double1;
        _findAndAddDynamicMethodArguments[1] = class1;
        _findAndAddDynamicMethodArguments[2] = impl;
        try {
            _findAndAddDynamicMethod.invoke(beanPropertyWriter, _findAndAddDynamicMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_findAndAddDynamic3() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SimpleType _nonTrivialBaseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_nonTrivialBaseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nonTrivialBaseType", _nonTrivialBaseType);
        Object single = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Single");
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap.untypedValueSerializer(ReadOnlyClassToSerializerMap.java:76)
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:422)
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.findAndAddSerializer(PropertySerializerMap.java:46)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:656) */
        Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class singleType = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap");
        Class _classType = Class.forName("java.lang.Class");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Method _findAndAddDynamicMethod = beanPropertyWriterClazz.getDeclaredMethod("_findAndAddDynamic", singleType, _classType, implType);
        _findAndAddDynamicMethod.setAccessible(true);
        java.lang.Object[] _findAndAddDynamicMethodArguments = new java.lang.Object[3];
        _findAndAddDynamicMethodArguments[0] = single;
        _findAndAddDynamicMethodArguments[1] = _class;
        _findAndAddDynamicMethodArguments[2] = impl;
        try {
            _findAndAddDynamicMethod.invoke(beanPropertyWriter, _findAndAddDynamicMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_findAndAddDynamic4() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object empty = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Class class1 = Object.class;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 1);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        _buckets[0] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:381)
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.findAndAddSerializer(PropertySerializerMap.java:38)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:658) */
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
    
    @Test
    public void test_findAndAddDynamic5() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object empty = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Class class1 = Object.class;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 1);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        _buckets[0] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", key);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.SerializerProvider.findValueSerializer(SerializerProvider.java:381)
            com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.findAndAddSerializer(PropertySerializerMap.java:38)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._findAndAddDynamic(BeanPropertyWriter.java:658) */
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
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap, java.lang.Class, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(expected = NullPointerException.class)
    public void test_findAndAddDynamic6() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object empty = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Class class1 = Object.class;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 1);
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        _cacheKey._class = class1;
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
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
    
    @Test(expected = NullPointerException.class)
    public void test_findAndAddDynamic7() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object double1 = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Double");
        Class class1 = Object.class;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializerCache _serializerCache = ((SerializerCache) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_serializerCache", _serializerCache);
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 1);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        key._isTyped = true;
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        _buckets[0] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        SerializerCache.TypeKey _cacheKey = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_cacheKey", _cacheKey);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        Class beanPropertyWriterClazz = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class double1Type = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap");
        Class class1Type = Class.forName("java.lang.Class");
        Class implType = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Method _findAndAddDynamicMethod = beanPropertyWriterClazz.getDeclaredMethod("_findAndAddDynamic", double1Type, class1Type, implType);
        _findAndAddDynamicMethod.setAccessible(true);
        java.lang.Object[] _findAndAddDynamicMethodArguments = new java.lang.Object[3];
        _findAndAddDynamicMethodArguments[0] = double1;
        _findAndAddDynamicMethodArguments[1] = class1;
        _findAndAddDynamicMethodArguments[2] = impl;
        try {
            _findAndAddDynamicMethod.invoke(beanPropertyWriter, _findAndAddDynamicMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method _findAndAddDynamic(com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap, java.lang.Class, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(timeout = 1000L)
    public void test_findAndAddDynamic8() throws Throwable  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object empty = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Class class1 = Object.class;
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        ReadOnlyClassToSerializerMap _knownSerializers = ((ReadOnlyClassToSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap"));
        JsonSerializerMap _map = ((JsonSerializerMap) createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap"));
        java.lang.Object[] _buckets = createArray("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", 1);
        Object bucket = createInstance("com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket");
        SerializerCache.TypeKey key = ((SerializerCache.TypeKey) createInstance("com.fasterxml.jackson.databind.ser.SerializerCache$TypeKey"));
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "key", key);
        setField(bucket, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap$Bucket", "next", bucket);
        _buckets[0] = bucket;
        setField(_map, "com.fasterxml.jackson.databind.ser.impl.JsonSerializerMap", "_buckets", _buckets);
        setField(_knownSerializers, "com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap", "_map", _map);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_knownSerializers", _knownSerializers);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
        SimpleType _cfgSerializationType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_cfgSerializationType", _cfgSerializationType);
        
        Class actual = beanPropertyWriter.getRawSerializationType();
        
        assertNull(actual);
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
    public void testSetNonTrivialBaseType() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        beanPropertyWriter.setNonTrivialBaseType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)}
 * @utbot.executesCondition {@code (objectVisitor != null): False}
 *  */
    @Test
    public void testDepositSchemaProperty_ObjectVisitorEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        beanPropertyWriter.depositSchemaProperty(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)}
 * @utbot.executesCondition {@code (objectVisitor != null): True}
 * @utbot.executesCondition {@code (isRequired()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor#optionalProperty(com.fasterxml.jackson.databind.BeanProperty)}
 *  */
    @Test
    public void testDepositSchemaProperty_NotIsRequired() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        JsonObjectFormatVisitor.Base base = new JsonObjectFormatVisitor.Base();
        
        beanPropertyWriter.depositSchemaProperty(base);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#depositSchemaProperty(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor)}
 * @utbot.executesCondition {@code (objectVisitor != null): True}
 * @utbot.executesCondition {@code (isRequired()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor#property(com.fasterxml.jackson.databind.BeanProperty)}
 *  */
    @Test
    public void testDepositSchemaProperty_IsRequired() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_isRequired", true);
        JsonObjectFormatVisitor.Base base = new JsonObjectFormatVisitor.Base();
        
        beanPropertyWriter.depositSchemaProperty(base);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.depositSchemaProperty
    
    ///region Errors report for depositSchemaProperty
    
    public void testDepositSchemaProperty_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Field signature is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _handleSelfReference(java.lang.Object, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_handleSelfReference(java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (ser.usesObjectId()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializer#usesObjectId()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void test_handleSelfReference_SerUsesObjectId() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        ObjectIdWriter objectIdWriter = ((ObjectIdWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter"));
        BeanSerializer beanSerializer = new BeanSerializer(((BeanSerializerBase) null), objectIdWriter);
        
        beanPropertyWriter._handleSelfReference(null, beanSerializer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleSelfReference(java.lang.Object, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_handleSelfReference(java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializer#usesObjectId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ser.usesObjectId()
 *  */
    @Test
    public void test_handleSelfReference_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter._handleSelfReference(BeanPropertyWriter.java:689) */
        beanPropertyWriter._handleSelfReference(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _handleSelfReference(java.lang.Object, com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_handleSelfReference(java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: throw new JsonMappingException("Direct self-reference leading to cycle");
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_handleSelfReference_ThrowJsonMappingException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer typeWrappedSerializer = new TypeWrappedSerializer(null, null);
        
        beanPropertyWriter._handleSelfReference(null, typeWrappedSerializer);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#_handleSelfReference(java.lang.Object,com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: throw new JsonMappingException("Direct self-reference leading to cycle");
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_handleSelfReference_ThrowJsonMappingException_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        BeanSerializer beanSerializer = new BeanSerializer(((BeanSerializerBase) null), ((ObjectIdWriter) null));
        
        beanPropertyWriter._handleSelfReference(null, beanSerializer);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.assignNullSerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assignNullSerializer(com.fasterxml.jackson.databind.JsonSerializer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#assignNullSerializer(com.fasterxml.jackson.databind.JsonSerializer)}
 * @utbot.executesCondition {@code (_nullSerializer != null): False}
 *  */
    @Test
    public void testAssignNullSerializer__nullSerializerEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
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
    public void testAssignNullSerializer_ThrowIllegalStateException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        DateSerializer _nullSerializer = ((DateSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.DateSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        
        beanPropertyWriter.assignNullSerializer(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getContextAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContextAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getContextAnnotation(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.Annotations#get(java.lang.Class)}
 * @utbot.returnsFrom {@code return _contextAnnotations.get(acls);}
 *  */
    @Test
    public void testGetContextAnnotation_AnnotationsGet() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotationMap _contextAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_contextAnnotations", _contextAnnotations);
        
        Annotation actual = beanPropertyWriter.getContextAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContextAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getContextAnnotation(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.Annotations#get(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _contextAnnotations.get(acls);
 *  */
    @Test
    public void testGetContextAnnotation_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getContextAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getContextAnnotation(BeanPropertyWriter.java:338) */
        beanPropertyWriter.getContextAnnotation(null);
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
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Field signature is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method serializeAsPlaceholder(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nullSerializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 *  */
    @Test
    public void testSerializeAsPlaceholder__nullSerializerNotEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendOffset", -2147483647);
        
        beanPropertyWriter.serializeAsPlaceholder(null, tokenBuffer, null);
        
        Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
        int finalTokenBuffer_appendOffset = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendOffset"));
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendOffset);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nullSerializer != null): False}
 *  */
    @Test
    public void testSerializeAsPlaceholder__nullSerializerEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendOffset", 1);
        
        beanPropertyWriter.serializeAsPlaceholder(null, tokenBuffer, null);
        
        Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
        int finalTokenBuffer_appendOffset = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendOffset"));
        
        assertEquals(192L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(2, finalTokenBuffer_appendOffset);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nullSerializer != null): False}
 *  */
    @Test
    public void testSerializeAsPlaceholder__nullSerializerEqualsNull_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendOffset", -2147483647);
        
        beanPropertyWriter.serializeAsPlaceholder(null, tokenBuffer, null);
        
        Object tokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        long finalTokenBuffer_last_tokenTypes = ((Long) getFieldValue(tokenBuffer_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes"));
        int finalTokenBuffer_appendOffset = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendOffset"));
        
        assertEquals(12L, finalTokenBuffer_last_tokenTypes);
        
        assertEquals(-2147483646, finalTokenBuffer_appendOffset);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nullSerializer != null): False}
 *  */
    @Test
    public void testSerializeAsPlaceholder__nullSerializerEqualsNull_2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_next", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendOffset", 16);
        
        Object initialTokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        
        beanPropertyWriter.serializeAsPlaceholder(null, tokenBuffer, null);
        
        Object finalTokenBuffer_last = getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last");
        int finalTokenBuffer_appendOffset = ((Integer) getFieldValue(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendOffset"));
        
        assertFalse(initialTokenBuffer_last == finalTokenBuffer_last);
        
        assertEquals(1, finalTokenBuffer_appendOffset);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serializeAsPlaceholder(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nullSerializer != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonGenerator#writeNull()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jgen.writeNull();
 *  */
    @Test
    public void testSerializeAsPlaceholder_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {'\u0000'};
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:811)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(null, writerBasedJsonGenerator, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nullSerializer != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jgen.writeNull();
 *  */
    @Test
    public void testSerializeAsPlaceholder_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#serializeAsPlaceholder(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.executesCondition {@code (_nullSerializer != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonSerializer#serialize(java.lang.Object,com.fasterxml.jackson.core.JsonGenerator,com.fasterxml.jackson.databind.SerializerProvider)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _nullSerializer.serialize(null, jgen, prov);
 *  */
    @Test
    public void testSerializeAsPlaceholder_ThrowNullPointerException_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.SerializationConfig", "_serFeatures", -251);
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.failForEmpty(UnknownSerializer.java:59)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:39)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(null, null, impl);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method serializeAsPlaceholder(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    /// Actual number of generated tests (51) exceeds per-method limit (50)
    /// The limit can be configured in '{HOME_DIR}/.utbot/settings.properties' with 'maxTestsPerMethod' property
    
    @Test
    public void testSerializeAsPlaceholder1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", 134217728);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 134217729);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 134217728 out of bounds for length 9]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:811)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1643)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder3() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:284)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:825)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1643)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder5() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        DefaultPrettyPrinter.FixedSpaceIndenter _arrayIndenter = ((DefaultPrettyPrinter.FixedSpaceIndenter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_arrayIndenter", _arrayIndenter);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter.writeIndentation(DefaultPrettyPrinter.java:340)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.beforeArrayValues(DefaultPrettyPrinter.java:268)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:836)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder6() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483643);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1639)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder7() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        UnknownSerializer _serializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.TokenBuffer.writeStartObject(TokenBuffer.java:436)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, tokenBuffer, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder8() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        UnknownSerializer _serializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:168)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder9() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:811)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder10() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 268435456);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:284)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:825)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder11() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1639)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder12() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1643)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder13() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:218)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:828)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder14() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries", true);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:494)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:430)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:216)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:828)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder15() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        UnknownSerializer _serializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeStartObject(MinimalPrettyPrinter.java:74)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:163)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder16() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 134217728);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:284)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:825)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder17() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1639)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder18() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        SerializedString _rootSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator", _rootSeparator);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:457)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator(DefaultPrettyPrinter.java:181)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:831)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder19() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483643);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1639)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder20() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1643)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder21() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:484)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:828)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder22() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:218)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:828)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder23() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries", true);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:494)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:430)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:216)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:828)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder24() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:809)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder25() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:811)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder26() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        UnknownSerializer _serializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendOffset", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _child);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase.idFromValue(TypeSerializerBase.java:36)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:49)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, tokenBuffer, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder27() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        com.fasterxml.jackson.core.json.WriterBasedJsonGenerator[] writerBasedJsonGeneratorArray = {};
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeStartObject(MinimalPrettyPrinter.java:74)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:163)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(writerBasedJsonGeneratorArray, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder28() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -12);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 2147483641);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1643)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder29() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:811)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder30() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:801)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.std.NullSerializer.serialize(NullSerializer.java:31)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder31() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483643);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1639)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder32() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        SerializedString _rootSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator", _rootSeparator);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:427)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:457)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator(DefaultPrettyPrinter.java:181)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:831)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder33() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputTail", -12);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 2147483641);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1643)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder34() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        UnknownSerializer _serializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        TokenBuffer tokenBuffer = ((TokenBuffer) createInstance("com.fasterxml.jackson.databind.util.TokenBuffer"));
        Object _last = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(_last, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_tokenTypes", 0L);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_last", _last);
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_appendOffset", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(tokenBuffer, "com.fasterxml.jackson.databind.util.TokenBuffer", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase.idFromValue(TypeSerializerBase.java:36)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:49)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, tokenBuffer, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder35() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeArrayValueSeparator(DefaultPrettyPrinter.java:284)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:825)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:160)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder36() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeStartObject(MinimalPrettyPrinter.java:74)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:163)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder37() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483643);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1639)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder38() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        char[] _outputBuffer = {
            '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
            '\u0000'
        };
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputBuffer", _outputBuffer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeNull(WriterBasedJsonGenerator.java:1639)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:773)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder39() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:427)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:801)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder40() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", 1);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:486)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeObjectFieldValueSeparator(MinimalPrettyPrinter.java:95)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:828)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder41() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        UnknownSerializer _serializer = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:811)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:160)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder42() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        MinimalPrettyPrinter _cfgPrettyPrinter = ((MinimalPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.MinimalPrettyPrinter"));
        String _rootValueSeparator = "";
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.MinimalPrettyPrinter", "_rootValueSeparator", _rootValueSeparator);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:427)
            com.fasterxml.jackson.core.util.MinimalPrettyPrinter.writeRootValueSeparator(MinimalPrettyPrinter.java:66)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:831)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:160)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder43() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_spacesInObjectEntries", true);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRawLong(WriterBasedJsonGenerator.java:494)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:430)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeObjectFieldValueSeparator(DefaultPrettyPrinter.java:216)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:828)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:160)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder44() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultPrettyPrinter _cfgPrettyPrinter = ((DefaultPrettyPrinter) createInstance("com.fasterxml.jackson.core.util.DefaultPrettyPrinter"));
        SerializedString _rootSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(_cfgPrettyPrinter, "com.fasterxml.jackson.core.util.DefaultPrettyPrinter", "_rootSeparator", _rootSeparator);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.JsonGenerator", "_cfgPrettyPrinter", _cfgPrettyPrinter);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:418)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:457)
            com.fasterxml.jackson.core.util.DefaultPrettyPrinter.writeRootValueSeparator(DefaultPrettyPrinter.java:181)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyPrettyValueWrite(WriterBasedJsonGenerator.java:831)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:816)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:160)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder45() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:168)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder46() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        SerializedString _rootValueSeparator = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        String _value = "";
        setField(_rootValueSeparator, "com.fasterxml.jackson.core.io.SerializedString", "_value", _value);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.JsonGeneratorImpl", "_rootValueSeparator", _rootValueSeparator);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            java.base/java.lang.String.getChars(String.java:1681)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeRaw(WriterBasedJsonGenerator.java:427)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:801)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:160)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder47() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:809)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeNull(WriterBasedJsonGenerator.java:772)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:640) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    
    @Test
    public void testSerializeAsPlaceholder48() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_child", _writeContext);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:168)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder49() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:809)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:160)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    
    @Test
    public void testSerializeAsPlaceholder50() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        TypeWrappedSerializer _nullSerializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        AsPropertyTypeSerializer _typeSerializer = ((AsPropertyTypeSerializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer"));
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_typeSerializer", _typeSerializer);
        TypeWrappedSerializer _serializer = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        TypeWrappedSerializer _serializer1 = ((TypeWrappedSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer"));
        UnknownSerializer _serializer2 = ((UnknownSerializer) createInstance("com.fasterxml.jackson.databind.ser.impl.UnknownSerializer"));
        setField(_serializer1, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer2);
        setField(_serializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer1);
        setField(_nullSerializer, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", "_serializer", _serializer);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        PrintWriter _writer = ((PrintWriter) createInstance("java.io.Console$3"));
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_writer", _writer);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputHead", -3);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator", "_outputEnd", -2147483647);
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        setField(_writeContext, "com.fasterxml.jackson.core.json.JsonWriteContext", "_currentName", _currentName);
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.SerializerProvider", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:504)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._flushBuffer(WriterBasedJsonGenerator.java:1908)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(WriterBasedJsonGenerator.java:809)
            com.fasterxml.jackson.core.json.WriterBasedJsonGenerator.writeStartObject(WriterBasedJsonGenerator.java:160)
            com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer.writeTypePrefixForObject(AsPropertyTypeSerializer.java:48)
            com.fasterxml.jackson.databind.ser.impl.UnknownSerializer.serializeWithType(UnknownSerializer.java:41)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serializeWithType(TypeWrappedSerializer.java:46)
            com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer.serialize(TypeWrappedSerializer.java:35)
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.serializeAsPlaceholder(BeanPropertyWriter.java:638) */
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, impl);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method serializeAsPlaceholder(java.lang.Object, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider)
    
    @Test(expected = JsonGenerationException.class)
    public void testSerializeAsPlaceholder51() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        NullSerializer _nullSerializer = ((NullSerializer) createInstance("com.fasterxml.jackson.databind.ser.std.NullSerializer"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_nullSerializer", _nullSerializer);
        Object object = new Object();
        WriterBasedJsonGenerator writerBasedJsonGenerator = ((WriterBasedJsonGenerator) createInstance("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        JsonWriteContext _writeContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_writeContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(writerBasedJsonGenerator, "com.fasterxml.jackson.core.base.GeneratorBase", "_writeContext", _writeContext);
        
        beanPropertyWriter.serializeAsPlaceholder(object, writerBasedJsonGenerator, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.removeInternalSetting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeInternalSetting(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#removeInternalSetting(java.lang.Object)}
 * @utbot.executesCondition {@code (_internalSettings != null): True}
 * @utbot.executesCondition {@code (_internalSettings.size() == 0): True}
 * @utbot.returnsFrom {@code return removed;}
 *  */
    @Test
    public void testRemoveInternalSetting__internalSettingsSizeEqualsZero() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        HashMap _internalSettings = new HashMap();
        beanPropertyWriter._internalSettings = _internalSettings;
        byte[] byteArray = {};
        
        Object actual = beanPropertyWriter.removeInternalSetting(byteArray);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#removeInternalSetting(java.lang.Object)}
 * @utbot.executesCondition {@code (_internalSettings != null): False}
 * @utbot.returnsFrom {@code return removed;}
 *  */
    @Test
    public void testRemoveInternalSetting__internalSettingsEqualsNull() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        Object actual = beanPropertyWriter.removeInternalSetting(null);
        
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
    public void testRemoveInternalSetting__internalSettingsSizeNotEqualsZero() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        HashMap _internalSettings = new HashMap();
        Integer integer = 0;
        Object object = createInstance("java.lang.Object");
        _internalSettings.put(integer, object);
        beanPropertyWriter._internalSettings = _internalSettings;
        
        Object actual = beanPropertyWriter.removeInternalSetting(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _name.getValue();
 *  */
    @Test
    public void testGetName_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getName(BeanPropertyWriter.java:313) */
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
        // 18 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Field
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#toString()}
 * @utbot.executesCondition {@code (_accessorMethod != null): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.reflect.Field#getDeclaringClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append("field \"").append(_field.getDeclaringClass().getName()).append("#").append(_field.getName());
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.toString(BeanPropertyWriter.java:703) */
        beanPropertyWriter.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getAnnotation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_memberGetAnnotation() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedField _member = ((AnnotatedField) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Annotation actual = beanPropertyWriter.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_memberGetAnnotation_2() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedParameter _member = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Annotation actual = beanPropertyWriter.getAnnotation(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.returnsFrom {@code return _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_memberGetAnnotation_1() throws Exception  {
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
 * @utbot.returnsFrom {@code return _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_memberGetAnnotation_3() throws Exception  {
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
 * @utbot.returnsFrom {@code return _member.getAnnotation(acls);}
 *  */
    @Test
    public void testGetAnnotation_Return_memberGetAnnotation_4() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        AnnotatedConstructor _member = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        AnnotationMap _annotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_member, "com.fasterxml.jackson.databind.introspect.AnnotatedMember", "_annotations", _annotations);
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_member", _member);
        
        Annotation actual = beanPropertyWriter.getAnnotation(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAnnotation(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#getAnnotation(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.introspect.AnnotatedMember#getAnnotation(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _member.getAnnotation(acls);
 *  */
    @Test
    public void testGetAnnotation_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getAnnotation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.getAnnotation(BeanPropertyWriter.java:333) */
        beanPropertyWriter.getAnnotation(null);
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rename(com.fasterxml.jackson.databind.util.NameTransformer)
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#rename(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.SerializedString#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String newName = transformer.transform(_name.getValue());
 *  */
    @Test
    public void testRename_ThrowNullPointerException() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:253) */
        beanPropertyWriter.rename(null);
    }
    
    /**
    @utbot.classUnderTest {@link BeanPropertyWriter}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.BeanPropertyWriter#rename(com.fasterxml.jackson.databind.util.NameTransformer)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.SerializedString#getValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String newName = transformer.transform(_name.getValue());
 *  */
    @Test
    public void testRename_ThrowNullPointerException_1() throws Exception  {
        BeanPropertyWriter beanPropertyWriter = ((BeanPropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(beanPropertyWriter, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.BeanPropertyWriter.rename(BeanPropertyWriter.java:253) */
        beanPropertyWriter.rename(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1061993342285099 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1061993342285099.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1061993342296500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1061993342285099.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1061993342296500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1061993343028600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1061993343028600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1061993343031799 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1061993343028600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1061993343031799).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

