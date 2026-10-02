package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import java.lang.reflect.InvocationTargetException;
import com.sun.org.apache.xpath.internal.XPathException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.IllegalFormatConversionException;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import java.util.HashMap;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_databind_ser_PropertyBuilderTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultValue(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (prim != null): False}
 * @utbot.executesCondition {@code (type.isContainerType() || type.isReferenceType()): False}
 * @utbot.returnsFrom {@code return JsonInclude.Include.NON_EMPTY;}
 *  */
    @Test
    public void testGetDefaultValue_TypeIsContainerTypeOrTypeIsReferenceType() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonInclude.Include actual = ((JsonInclude.Include) propertyBuilder.getDefaultValue(mapType));
        
        JsonInclude.Include expected = JsonInclude.Include.NON_EMPTY;
        
        assertEquals(expected, actual);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (prim != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#defaultValue(java.lang.Class)}
 * @utbot.returnsFrom {@code return ClassUtil.defaultValue(prim);}
 *  */
    @Test
    public void testGetDefaultValue_PrimNotEqualsNull() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonInclude.Include actual = ((JsonInclude.Include) propertyBuilder.getDefaultValue(mapType));
        
        JsonInclude.Include expected = JsonInclude.Include.NON_EMPTY;
        
        assertEquals(expected, actual);
        
        Class finalMapType_class = ((Class) getFieldValue(mapType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (prim != null): False}
 * @utbot.executesCondition {@code (type.isContainerType() || type.isReferenceType()): True}
 * @utbot.returnsFrom {@code return JsonInclude.Include.NON_EMPTY;}
 *  */
    @Test
    public void testGetDefaultValue_TypeIsContainerTypeOrTypeIsReferenceType_1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonInclude.Include actual = ((JsonInclude.Include) propertyBuilder.getDefaultValue(referenceType));
        
        JsonInclude.Include expected = JsonInclude.Include.NON_EMPTY;
        
        assertEquals(expected, actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (prim != null): False}
 * @utbot.executesCondition {@code (type.isContainerType() || type.isReferenceType()): False}
 * @utbot.returnsFrom {@code return JsonInclude.Include.NON_EMPTY;}
 *  */
    @Test
    public void testGetDefaultValue_TypeIsContainerTypeOrTypeIsReferenceType_2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonInclude.Include actual = ((JsonInclude.Include) propertyBuilder.getDefaultValue(collectionLikeType));
        
        JsonInclude.Include expected = JsonInclude.Include.NON_EMPTY;
        
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (prim != null): False}
 * @utbot.executesCondition {@code (type.isContainerType() || type.isReferenceType()): False}
 * @utbot.returnsFrom {@code return JsonInclude.Include.NON_EMPTY;}
 *  */
    @Test
    public void testGetDefaultValue_TypeIsContainerTypeOrTypeIsReferenceType_3() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JsonInclude.Include actual = ((JsonInclude.Include) propertyBuilder.getDefaultValue(arrayType));
        
        JsonInclude.Include expected = JsonInclude.Include.NON_EMPTY;
        
        assertEquals(expected, actual);
        
        Class finalArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialArrayType_class == finalArrayType_class);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (prim != null): False}
 * @utbot.executesCondition {@code (type.isContainerType() || type.isReferenceType()): True}
 * @utbot.executesCondition {@code (cls): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testGetDefaultValue_Cls() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Object actual = propertyBuilder.getDefaultValue(simpleType);
        
        assertNull(actual);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (prim != null): False}
 * @utbot.executesCondition {@code (type.isContainerType() || type.isReferenceType()): True}
 * @utbot.executesCondition {@code (cls): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetDefaultValue_NotCls() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialResolvedRecursiveType_class = ((Class) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Object actual = propertyBuilder.getDefaultValue(resolvedRecursiveType);
        
        assertNull(actual);
        
        Class finalResolvedRecursiveType_class = ((Class) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialResolvedRecursiveType_class == finalResolvedRecursiveType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDefaultValue(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultValue(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> cls = type.getRawClass();
 *  */
    @Test
    public void testGetDefaultValue_ThrowNullPointerException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultValue(PropertyBuilder.java:300) */
        propertyBuilder.getDefaultValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter
    
    ///region OTHER: ERROR SUITE for method buildWriter(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.introspect.AnnotatedMember, boolean)
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        propertyBuilder.buildWriter(null, null, collectionType, null, null, null, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        propertyBuilder.buildWriter(null, null, collectionLikeType, null, null, null, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter3() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        propertyBuilder.buildWriter(null, null, mapType, null, null, null, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter4() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary2);
        NopAnnotationIntrospector _secondary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        propertyBuilder.buildWriter(null, null, mapType, null, null, null, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter5() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary4);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        propertyBuilder.buildWriter(null, null, referenceType, null, null, null, null, false);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildWriter6() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary4);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        propertyBuilder.buildWriter(null, null, mapType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter7() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:100) */
        propertyBuilder.buildWriter(null, null, simpleType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter8() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:100) */
        propertyBuilder.buildWriter(null, null, arrayType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter9() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:100) */
        propertyBuilder.buildWriter(null, null, referenceType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter10() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:100) */
        propertyBuilder.buildWriter(null, null, collectionType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter11() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, simpleType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter12() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, arrayType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter13() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, referenceType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter14() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, simpleType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter15() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, arrayType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter16() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, referenceType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter17() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, collectionType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter18() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, simpleType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter19() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, arrayType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter20() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, referenceType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter21() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, simpleType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter22() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, arrayType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter23() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:100) */
        propertyBuilder.buildWriter(null, null, mapType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter24() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:100) */
        propertyBuilder.buildWriter(null, null, mapType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter25() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        DefaultSerializerProvider.Impl impl = ((DefaultSerializerProvider.Impl) createInstance("com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(impl, null, mapType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter26() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _secondary3 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        NopAnnotationIntrospector _secondary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1436)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType(JacksonAnnotationIntrospector.java:757)
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(AnnotationIntrospector.java:843)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:75) */
        propertyBuilder.buildWriter(null, null, collectionLikeType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter27() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _secondary4 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1436)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType(JacksonAnnotationIntrospector.java:757)
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(AnnotationIntrospector.java:843)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:75) */
        propertyBuilder.buildWriter(null, null, collectionType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter28() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException] */
        propertyBuilder.buildWriter(null, null, mapType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter29() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary6 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(AnnotationIntrospector.java:874)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:75) */
        propertyBuilder.buildWriter(null, null, null, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter30() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _secondary3 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1436)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType(JacksonAnnotationIntrospector.java:757)
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(AnnotationIntrospector.java:843)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:75) */
        propertyBuilder.buildWriter(null, null, mapType, null, null, null, null, false);
    }
    
    @Test
    public void testBuildWriter31() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1436)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType(JacksonAnnotationIntrospector.java:757)
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(AnnotationIntrospector.java:843)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.buildWriter(PropertyBuilder.java:75) */
        propertyBuilder.buildWriter(null, null, collectionLikeType, null, null, null, null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultBean()
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.executesCondition {@code (def == null): False}
 *  */
    @Test
    public void testGetDefaultBean_DefNotEqualsNull_1() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", null);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            byte[] _defaultBean = {};
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_defaultBean", _defaultBean);
            
            byte[] actual = ((byte[]) propertyBuilder.getDefaultBean());
            
            assertArrayEquals(_defaultBean, actual);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.executesCondition {@code (def == null): False}
 *  */
    @Test
    public void testGetDefaultBean_DefNotEqualsNull() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            Boolean noDefaultMarker = false;
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", noDefaultMarker);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_defaultBean", noDefaultMarker);
            
            Object actual = propertyBuilder.getDefaultBean();
            
            assertNull(actual);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.executesCondition {@code (def == null): True}
 * @utbot.executesCondition {@code (def == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.SerializationConfig#canOverrideAccessModifiers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#instantiateBean(boolean)}
 *  */
    @Test
    public void testGetDefaultBean_DefEqualsNull() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", null);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
            BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creatorsResolved", true);
            setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
            
            Object actual = propertyBuilder.getDefaultBean();
            
            assertNull(actual);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDefaultBean()
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: def = _beanDesc.instantiateBean(_config.canOverrideAccessModifiers());
 *  */
    @Test
    public void testGetDefaultBean_ThrowNullPointerException_1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241) */
        propertyBuilder.getDefaultBean();
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: def = _beanDesc.instantiateBean(_config.canOverrideAccessModifiers());
 *  */
    @Test
    public void testGetDefaultBean_ThrowNullPointerException_2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241) */
        propertyBuilder.getDefaultBean();
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: def = _beanDesc.instantiateBean(_config.canOverrideAccessModifiers());
 *  */
    @Test
    public void testGetDefaultBean_ThrowNullPointerException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241) */
        propertyBuilder.getDefaultBean();
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#instantiateBean(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: def = _beanDesc.instantiateBean(_config.canOverrideAccessModifiers());
 *  */
    @Test
    public void testGetDefaultBean_ThrowNullPointerException_3() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:442)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getDefaultConstructor(AnnotatedClass.java:298)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean(BasicBeanDescription.java:305)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241) */
        propertyBuilder.getDefaultBean();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDefaultBean()
    
    @Test
    public void testGetDefaultBean1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        DeserializationConfig _config1 = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config1);
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creatorsResolved", true);
        AnnotatedConstructor _defaultConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_defaultConstructor", _defaultConstructor);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:864)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember.fixAccess(AnnotatedMember.java:136)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean(BasicBeanDescription.java:310)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241) */
        propertyBuilder.getDefaultBean();
    }
    
    @Test
    public void testGetDefaultBean2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:442)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getDefaultConstructor(AnnotatedClass.java:298)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean(BasicBeanDescription.java:305)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241) */
        propertyBuilder.getDefaultBean();
    }
    
    @Test
    public void testGetDefaultBean3() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
            com.fasterxml.jackson.databind.util.LRUMap.get(LRUMap.java:68)
            com.fasterxml.jackson.databind.util.ClassUtil._getMetadata(ClassUtil.java:453)
            com.fasterxml.jackson.databind.util.ClassUtil.getConstructors(ClassUtil.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:443)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getDefaultConstructor(AnnotatedClass.java:298)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean(BasicBeanDescription.java:305)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241) */
        propertyBuilder.getDefaultBean();
    }
    
    @Test
    public void testGetDefaultBean4() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException] */
        propertyBuilder.getDefaultBean();
    }
    
    @Test
    public void testGetDefaultBean5() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean] produces [java.lang.NullPointerException]
            java.base/java.util.concurrent.ConcurrentHashMap.get(ConcurrentHashMap.java:936)
            com.fasterxml.jackson.databind.util.LRUMap.get(LRUMap.java:68)
            com.fasterxml.jackson.databind.util.ClassUtil._getMetadata(ClassUtil.java:453)
            com.fasterxml.jackson.databind.util.ClassUtil.getConstructors(ClassUtil.java:410)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:443)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getDefaultConstructor(AnnotatedClass.java:298)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean(BasicBeanDescription.java:305)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241) */
        propertyBuilder.getDefaultBean();
    }
    ///endregion
    
    ///region Errors report for getDefaultBean
    
    public void testGetDefaultBean_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _throwWrapped(java.lang.Exception, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new IllegalArgumentException("Failed to get property '" + propName + "' of default " + defaultBean.getClass().getName() + " instance");
 *  */
    @Test
    public void test_throwWrapped_ThrowNullPointerException_1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cloneNotSupportedException);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped(PropertyBuilder.java:329) */
        propertyBuilder._throwWrapped(cloneNotSupportedException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(t.getCause() != null)
 *  */
    @Test
    public void test_throwWrapped_ThrowNullPointerException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped(PropertyBuilder.java:324) */
        propertyBuilder._throwWrapped(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): False}
 * @utbot.iterates iterate the loop {@code while(t.getCause() != null)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new IllegalArgumentException("Failed to get property '" + propName + "' of default " + defaultBean.getClass().getName() + " instance");
 *  */
    @Test
    public void test_throwWrapped_ThrowNullPointerException_2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cause);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder._throwWrapped(PropertyBuilder.java:329) */
        propertyBuilder._throwWrapped(cloneNotSupportedException, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _throwWrapped(java.lang.Exception, java.lang.String, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): True}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: t instanceof RuntimeException
 *  */
    @Test(expected = NumberFormatException.class)
    public void test_throwWrapped_ThrowNumberFormatException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        setField(numberFormatException, "java.lang.Throwable", "cause", numberFormatException);
        
        propertyBuilder._throwWrapped(numberFormatException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.iterates iterate the loop {@code while(t.getCause() != null)} twice
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void test_throwWrapped_ThrowError_1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        CloneNotSupportedException cloneNotSupportedException = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        Error target = ((Error) createInstance("java.lang.Error"));
        setField(target, "java.lang.Throwable", "cause", target);
        setField(cause, "java.lang.reflect.InvocationTargetException", "target", target);
        setField(cloneNotSupportedException, "java.lang.Throwable", "cause", cause);
        
        propertyBuilder._throwWrapped(cloneNotSupportedException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (t instanceof Error): True}
 * @utbot.iterates iterate the loop {@code while(t.getCause() != null)} once
 * @utbot.throwsException {@link java.lang.Error} when: t instanceof Error
 *  */
    @Test(expected = Error.class)
    public void test_throwWrapped_ThrowError() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        InterruptedException interruptedException = ((InterruptedException) createInstance("java.lang.InterruptedException"));
        Error cause = ((Error) createInstance("java.lang.Error"));
        setField(interruptedException, "java.lang.Throwable", "cause", cause);
        
        propertyBuilder._throwWrapped(interruptedException, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#_throwWrapped(java.lang.Exception,java.lang.String,java.lang.Object)}
 * @utbot.executesCondition {@code (t instanceof Error): False}
 * @utbot.executesCondition {@code (t instanceof RuntimeException): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.iterates iterate the loop {@code while(t.getCause() != null)} 3 times
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Failed to get property '" + propName + "' of default " + defaultBean.getClass().getName() + " instance");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_throwWrapped_ThrowIllegalArgumentException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        NumberFormatException numberFormatException = ((NumberFormatException) createInstance("java.lang.NumberFormatException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        CloneNotSupportedException target = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        XPathException cause1 = ((XPathException) createInstance("com.sun.org.apache.xpath.internal.XPathException"));
        setField(cause1, "javax.xml.transform.TransformerException", "containedException", cause1);
        setField(target, "java.lang.Throwable", "cause", cause1);
        setField(cause, "java.lang.reflect.InvocationTargetException", "target", target);
        setField(numberFormatException, "java.lang.Throwable", "cause", cause);
        
        propertyBuilder._throwWrapped(numberFormatException, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _throwWrapped(java.lang.Exception, java.lang.String, java.lang.Object)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_throwWrapped1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        UnsupportedEncodingException unsupportedEncodingException = ((UnsupportedEncodingException) createInstance("java.io.UnsupportedEncodingException"));
        InvocationTargetException cause = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        InvocationTargetException target = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        InvocationTargetException target1 = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        MalformedURLException target2 = ((MalformedURLException) createInstance("java.net.MalformedURLException"));
        InvocationTargetException cause1 = ((InvocationTargetException) createInstance("java.lang.reflect.InvocationTargetException"));
        setField(target2, "java.lang.Throwable", "cause", cause1);
        setField(target1, "java.lang.reflect.InvocationTargetException", "target", target2);
        setField(target, "java.lang.reflect.InvocationTargetException", "target", target1);
        setField(cause, "java.lang.reflect.InvocationTargetException", "target", target);
        setField(unsupportedEncodingException, "java.lang.Throwable", "cause", cause);
        java.util.IllegalFormatConversionException[] illegalFormatConversionExceptionArray = {};
        
        propertyBuilder._throwWrapped(unsupportedEncodingException, null, illegalFormatConversionExceptionArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.getClassAnnotations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassAnnotations()
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getClassAnnotations()}
 * @utbot.returnsFrom {@code return _beanDesc.getClassAnnotations();}
 *  */
    @Test
    public void testGetClassAnnotations_Return_beanDescGetClassAnnotations() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        AnnotationMap _classAnnotations = ((AnnotationMap) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations", _classAnnotations);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        AnnotationMap actual = ((AnnotationMap) propertyBuilder.getClassAnnotations());
        
        AnnotationMap expected = new AnnotationMap();
        
        HashMap actual_annotations = ((HashMap) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_annotations);
        
    }
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getClassAnnotations()}
 * @utbot.returnsFrom {@code return _beanDesc.getClassAnnotations();}
 *  */
    @Test
    public void testGetClassAnnotations_Return_beanDescGetClassAnnotations_1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        BeanDescription beanDescription = propertyBuilder._beanDesc;
        AnnotatedClass beanDescription_beanDesc_classInfo = ((AnnotatedClass) getFieldValue(beanDescription, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo"));
        AnnotationMap initialPropertyBuilder_beanDesc_classInfo_classAnnotations = ((AnnotationMap) getFieldValue(beanDescription_beanDesc_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations"));
        
        AnnotationMap actual = ((AnnotationMap) propertyBuilder.getClassAnnotations());
        
        AnnotationMap expected = new AnnotationMap();
        
        HashMap actual_annotations = ((HashMap) getFieldValue(actual, "com.fasterxml.jackson.databind.introspect.AnnotationMap", "_annotations"));
        assertNull(actual_annotations);
        
        BeanDescription beanDescription1 = propertyBuilder._beanDesc;
        AnnotatedClass beanDescription1_beanDesc_classInfo = ((AnnotatedClass) getFieldValue(beanDescription1, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo"));
        AnnotationMap finalPropertyBuilder_beanDesc_classInfo_classAnnotations = ((AnnotationMap) getFieldValue(beanDescription1_beanDesc_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_classAnnotations"));
        
        assertFalse(initialPropertyBuilder_beanDesc_classInfo_classAnnotations == finalPropertyBuilder_beanDesc_classInfo_classAnnotations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getClassAnnotations()
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getClassAnnotations()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.BeanDescription#getClassAnnotations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _beanDesc.getClassAnnotations();
 *  */
    @Test
    public void testGetClassAnnotations_ThrowNullPointerException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getClassAnnotations] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getClassAnnotations(PropertyBuilder.java:59) */
        propertyBuilder.getClassAnnotations();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getClassAnnotations()
    
    @Test(expected = NullPointerException.class)
    public void testGetClassAnnotations1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        Class _primaryMixIn = Object.class;
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_primaryMixIn", _primaryMixIn);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        propertyBuilder.getClassAnnotations();
    }
    
    @Test(expected = NullPointerException.class)
    public void testGetClassAnnotations2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_annotationIntrospector", _annotationIntrospector);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        propertyBuilder.getClassAnnotations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated, boolean, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated,boolean,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.AnnotationIntrospector#refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig,com.fasterxml.jackson.databind.introspect.Annotated,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType secondary = _annotationIntrospector.refineSerializationType(_config, a, declaredType);
 *  */
    @Test
    public void testFindSerializationType_ThrowNullPointerException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated, boolean, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testFindSerializationType1() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        JavaType actual = propertyBuilder.findSerializationType(null, false, simpleType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType2() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        JavaType actual = propertyBuilder.findSerializationType(null, false, arrayType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType3() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        JavaType actual = propertyBuilder.findSerializationType(null, false, referenceType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType4() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        JavaType actual = propertyBuilder.findSerializationType(annotatedParameter, false, collectionType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType5() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        JavaType actual = propertyBuilder.findSerializationType(null, false, collectionType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType6() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        JavaType actual = propertyBuilder.findSerializationType(annotatedParameter, false, mapLikeType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType7() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        JavaType actual = propertyBuilder.findSerializationType(null, false, collectionLikeType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType8() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        NopAnnotationIntrospector _annotationIntrospector = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        JavaType actual = propertyBuilder.findSerializationType(null, false, mapLikeType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType9() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        JavaType actual = propertyBuilder.findSerializationType(null, false, collectionType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType10() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        JavaType actual = propertyBuilder.findSerializationType(annotatedMethod, false, mapType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType11() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        JavaType actual = propertyBuilder.findSerializationType(null, false, mapLikeType);
        
        assertNull(actual);
    }
    
    @Test
    public void testFindSerializationType12() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        JavaType actual = propertyBuilder.findSerializationType(annotatedField, false, mapLikeType);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method findSerializationType(com.fasterxml.jackson.databind.introspect.Annotated, boolean, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType13() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        
        propertyBuilder.findSerializationType(null, false, null);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType14() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        propertyBuilder.findSerializationType(null, false, collectionType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType15() throws Throwable  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        Object stdTypeConstructor = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Class stdTypeConstructorType = Class.forName("com.fasterxml.jackson.databind.introspect.Annotated");
        Class booleanType = boolean.class;
        Class collectionTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method findSerializationTypeMethod = propertyBuilderClazz.getDeclaredMethod("findSerializationType", stdTypeConstructorType, booleanType, collectionTypeType);
        findSerializationTypeMethod.setAccessible(true);
        java.lang.Object[] findSerializationTypeMethodArguments = new java.lang.Object[3];
        findSerializationTypeMethodArguments[0] = stdTypeConstructor;
        findSerializationTypeMethodArguments[1] = false;
        findSerializationTypeMethodArguments[2] = collectionType;
        try {
            findSerializationTypeMethod.invoke(propertyBuilder, findSerializationTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType16() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        propertyBuilder.findSerializationType(annotatedParameter, false, collectionLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType17() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        propertyBuilder.findSerializationType(null, false, collectionType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType18() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary2);
        NopAnnotationIntrospector _secondary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        propertyBuilder.findSerializationType(annotatedMethod, false, collectionType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType19() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType20() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType21() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _annotationIntrospector);
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType22() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary1);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType23() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary3);
        NopAnnotationIntrospector _secondary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        propertyBuilder.findSerializationType(null, false, collectionType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType24() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary4);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        propertyBuilder.findSerializationType(null, false, collectionType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType25() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary2);
        NopAnnotationIntrospector _secondary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType26() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary3);
        NopAnnotationIntrospector _secondary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType27() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary4 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType28() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary4);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType29() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType30() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _annotationIntrospector);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        propertyBuilder.findSerializationType(annotatedField, false, mapLikeType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType31() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(((TypeResolutionContext) null), ((Class) null), ((String) null), ((JavaType) null));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        propertyBuilder.findSerializationType(virtualAnnotatedMember, false, collectionType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType32() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _secondary);
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(((TypeResolutionContext) null), ((Class) null), ((String) null), ((JavaType) null));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        propertyBuilder.findSerializationType(virtualAnnotatedMember, false, collectionType);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testFindSerializationType33() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        propertyBuilder.findSerializationType(annotatedField, false, mapLikeType);
    }
    
    @Test
    public void testFindSerializationType34() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, simpleType);
    }
    
    @Test
    public void testFindSerializationType35() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, arrayType);
    }
    
    @Test
    public void testFindSerializationType36() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, referenceType);
    }
    
    @Test
    public void testFindSerializationType37() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, simpleType);
    }
    
    @Test
    public void testFindSerializationType38() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, arrayType);
    }
    
    @Test
    public void testFindSerializationType39() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, referenceType);
    }
    
    @Test
    public void testFindSerializationType40() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, simpleType);
    }
    
    @Test
    public void testFindSerializationType41() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, arrayType);
    }
    
    @Test
    public void testFindSerializationType42() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, referenceType);
    }
    
    @Test
    public void testFindSerializationType43() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(annotatedConstructor, false, collectionType);
    }
    
    @Test
    public void testFindSerializationType44() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, simpleType);
    }
    
    @Test
    public void testFindSerializationType45() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, arrayType);
    }
    
    @Test
    public void testFindSerializationType46() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary3 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, referenceType);
    }
    
    @Test
    public void testFindSerializationType47() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _primary = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary2 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1436)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType(JacksonAnnotationIntrospector.java:757)
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(AnnotationIntrospector.java:843)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, collectionType);
    }
    
    @Test
    public void testFindSerializationType48() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test
    public void testFindSerializationType49() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _secondary6 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary5, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(AnnotationIntrospector.java:874)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(annotatedParameter, false, null);
    }
    
    @Test
    public void testFindSerializationType50() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(null, false, collectionType);
    }
    
    @Test
    public void testFindSerializationType51() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        NopAnnotationIntrospector _primary1 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary1);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _primary1);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test
    public void testFindSerializationType52() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, collectionType);
    }
    
    @Test
    public void testFindSerializationType53() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(null, false, collectionType);
    }
    
    @Test
    public void testFindSerializationType54() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        TypeFactory _typeFactory = ((TypeFactory) createInstance("com.fasterxml.jackson.databind.type.TypeFactory"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_typeFactory", _typeFactory);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary6 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, collectionType);
    }
    
    @Test
    public void testFindSerializationType55() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary6 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(null, false, collectionType);
    }
    
    @Test
    public void testFindSerializationType56() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _secondary4 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(annotatedMethod, false, mapLikeType);
    }
    
    @Test
    public void testFindSerializationType57() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        JacksonAnnotationIntrospector _secondary5 = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary6 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.AnnotationIntrospector._findAnnotation(AnnotationIntrospector.java:1436)
            com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector.findSerializationType(JacksonAnnotationIntrospector.java:757)
            com.fasterxml.jackson.databind.AnnotationIntrospector.refineSerializationType(AnnotationIntrospector.java:843)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:503)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair.refineSerializationType(AnnotationIntrospectorPair.java:502)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType(PropertyBuilder.java:188) */
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test
    public void testFindSerializationType58() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary5 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary4, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary6 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary6);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(null, false, mapLikeType);
    }
    
    @Test
    public void testFindSerializationType59() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        AnnotationIntrospectorPair _annotationIntrospector = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _primary = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary1 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary2 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary3 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        AnnotationIntrospectorPair _secondary4 = ((AnnotationIntrospectorPair) createInstance("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(_secondary3, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary4);
        setField(_secondary2, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary3);
        setField(_secondary1, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary2);
        setField(_primary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary1);
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_primary", _primary);
        NopAnnotationIntrospector _secondary5 = ((NopAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(_secondary, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary5);
        setField(_annotationIntrospector, "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair", "_secondary", _secondary);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_annotationIntrospector", _annotationIntrospector);
        AnnotatedField annotatedField = new AnnotatedField(null, null, null);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.findSerializationType] produces [java.lang.NullPointerException] */
        propertyBuilder.findSerializationType(annotatedField, false, mapLikeType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyDefaultValue(java.lang.String, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link PropertyBuilder}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getPropertyDefaultValue(java.lang.String,com.fasterxml.jackson.databind.introspect.AnnotatedMember,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.ser.PropertyBuilder#getDefaultBean()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object defaultBean = getDefaultBean();
 *  */
    @Test
    public void testGetPropertyDefaultValue_ThrowNullPointerException() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:442)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getDefaultConstructor(AnnotatedClass.java:298)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean(BasicBeanDescription.java:305)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue(PropertyBuilder.java:272) */
        propertyBuilder.getPropertyDefaultValue(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPropertyDefaultValue(java.lang.String, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testGetPropertyDefaultValue1() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            Boolean noDefaultMarker = false;
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", noDefaultMarker);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_defaultBean", noDefaultMarker);
            String string = "";
            Object stdTypeConstructor = createInstance("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$StdTypeConstructor");
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            Class _class = Object.class;
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            Class stringType = Class.forName("java.lang.String");
            Class stdTypeConstructorType = Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedMember");
            Class mapLikeTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
            Method getPropertyDefaultValueMethod = propertyBuilderClazz.getDeclaredMethod("getPropertyDefaultValue", stringType, stdTypeConstructorType, mapLikeTypeType);
            getPropertyDefaultValueMethod.setAccessible(true);
            java.lang.Object[] getPropertyDefaultValueMethodArguments = new java.lang.Object[3];
            getPropertyDefaultValueMethodArguments[0] = string;
            getPropertyDefaultValueMethodArguments[1] = stdTypeConstructor;
            getPropertyDefaultValueMethodArguments[2] = mapLikeType;
            JsonInclude.Include actual = ((JsonInclude.Include) getPropertyDefaultValueMethod.invoke(propertyBuilder, getPropertyDefaultValueMethodArguments));
            
            JsonInclude.Include expected = JsonInclude.Include.NON_EMPTY;
            
            assertEquals(expected, actual);
            
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    
    @Test
    public void testGetPropertyDefaultValue2() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", null);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
            BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creatorsResolved", true);
            setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
            String string = "";
            AnnotatedConstructor annotatedConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            Class _class = Object.class;
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            JsonInclude.Include actual = ((JsonInclude.Include) propertyBuilder.getPropertyDefaultValue(string, annotatedConstructor, mapLikeType));
            
            JsonInclude.Include expected = JsonInclude.Include.NON_EMPTY;
            
            assertEquals(expected, actual);
            
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    
    @Test
    public void testGetPropertyDefaultValue3() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", null);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
            setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
            BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
            AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
            setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creatorsResolved", true);
            setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
            setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
            String string = "";
            AnnotatedField annotatedField = new AnnotatedField(null, null, null);
            ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            Class _class = Object.class;
            setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            JsonInclude.Include actual = ((JsonInclude.Include) propertyBuilder.getPropertyDefaultValue(string, annotatedField, referenceType));
            
            JsonInclude.Include expected = JsonInclude.Include.NON_EMPTY;
            
            assertEquals(expected, actual);
            
            Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialReferenceType_class == finalReferenceType_class);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPropertyDefaultValue(java.lang.String, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testGetPropertyDefaultValue4() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        String string = "";
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.resolveCreators(AnnotatedClass.java:442)
            com.fasterxml.jackson.databind.introspect.AnnotatedClass.getDefaultConstructor(AnnotatedClass.java:298)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean(BasicBeanDescription.java:305)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue(PropertyBuilder.java:272) */
        propertyBuilder.getPropertyDefaultValue(string, annotatedMethod, null);
    }
    
    @Test
    public void testGetPropertyDefaultValue5() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        String string = "";
        AnnotatedParameter annotatedParameter = ((AnnotatedParameter) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedParameter"));
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue] produces [java.lang.NullPointerException] */
        propertyBuilder.getPropertyDefaultValue(string, annotatedParameter, mapLikeType);
    }
    
    @Test
    public void testGetPropertyDefaultValue6() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        ReferenceType _type = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_type, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_type", _type);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        String string = "";
        AnnotatedMethod annotatedMethod = ((AnnotatedMethod) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedMethod"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue] produces [java.lang.NullPointerException] */
        propertyBuilder.getPropertyDefaultValue(string, annotatedMethod, null);
    }
    
    @Test
    public void testGetPropertyDefaultValue7() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creatorsResolved", true);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(((TypeResolutionContext) null), ((Class) null), ((String) null), ((JavaType) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultValue(PropertyBuilder.java:300)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue(PropertyBuilder.java:274) */
        propertyBuilder.getPropertyDefaultValue(null, virtualAnnotatedMember, null);
    }
    
    @Test
    public void testGetPropertyDefaultValue8() throws Exception  {
        PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
        SerializationConfig _config = ((SerializationConfig) createInstance("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 256);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_config", _config);
        BasicBeanDescription _beanDesc = ((BasicBeanDescription) createInstance("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        DeserializationConfig _config1 = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_config", _config1);
        AnnotatedClass _classInfo = ((AnnotatedClass) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_creatorsResolved", true);
        AnnotatedConstructor _defaultConstructor = ((AnnotatedConstructor) createInstance("com.fasterxml.jackson.databind.introspect.AnnotatedConstructor"));
        setField(_classInfo, "com.fasterxml.jackson.databind.introspect.AnnotatedClass", "_defaultConstructor", _defaultConstructor);
        setField(_beanDesc, "com.fasterxml.jackson.databind.introspect.BasicBeanDescription", "_classInfo", _classInfo);
        setField(propertyBuilder, "com.fasterxml.jackson.databind.ser.PropertyBuilder", "_beanDesc", _beanDesc);
        String string = "";
        VirtualAnnotatedMember virtualAnnotatedMember = new VirtualAnnotatedMember(((TypeResolutionContext) null), ((Class) null), ((String) null), ((JavaType) null));
        
        /* This test fails because method [com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.util.ClassUtil.checkAndFixAccess(ClassUtil.java:864)
            com.fasterxml.jackson.databind.introspect.AnnotatedMember.fixAccess(AnnotatedMember.java:136)
            com.fasterxml.jackson.databind.introspect.BasicBeanDescription.instantiateBean(BasicBeanDescription.java:310)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getDefaultBean(PropertyBuilder.java:241)
            com.fasterxml.jackson.databind.ser.PropertyBuilder.getPropertyDefaultValue(PropertyBuilder.java:272) */
        propertyBuilder.getPropertyDefaultValue(string, virtualAnnotatedMember, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPropertyDefaultValue(java.lang.String, com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = NullPointerException.class)
    public void testGetPropertyDefaultValue9() throws Exception  {
        Class propertyBuilderClazz = Class.forName("com.fasterxml.jackson.databind.ser.PropertyBuilder");
        Object prevNO_DEFAULT_MARKER = getStaticFieldValue(propertyBuilderClazz, "NO_DEFAULT_MARKER");
        try {
            Boolean noDefaultMarker = false;
            setStaticField(propertyBuilderClazz, "NO_DEFAULT_MARKER", noDefaultMarker);
            PropertyBuilder propertyBuilder = ((PropertyBuilder) createInstance("com.fasterxml.jackson.databind.ser.PropertyBuilder"));
            Object _defaultBean = createInstance("java.lang.Object");
            propertyBuilder._defaultBean = _defaultBean;
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            
            propertyBuilder.getPropertyDefaultValue(null, null, collectionLikeType);
        } finally {
            setStaticField(PropertyBuilder.class, "NO_DEFAULT_MARKER", prevNO_DEFAULT_MARKER);
        }
    }
    ///endregion
    
    ///region Errors report for getPropertyDefaultValue
    
    public void testGetPropertyDefaultValue_errors()
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1077358113355600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1077358113355600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1077358113360800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1077358113355600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1077358113360800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1077358113664000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1077358113664000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1077358113665500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1077358113664000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1077358113665500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1077358113900400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1077358113900400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1077358113901099 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1077358113900400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1077358113901099).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1077358114110600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1077358114110600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1077358114111000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1077358114110600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1077358114111000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

