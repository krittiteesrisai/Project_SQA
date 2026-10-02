package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import java.util.HashMap;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.DoubleDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers.FloatDeserializer;
import java.util.TreeMap;
import java.io.IOException;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_jsontype_impl_TypeDeserializerBaseTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ArrayType _baseType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        String actual = asExternalTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer; base-type:[array type, component type: null]; id-resolver: null]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asArrayTypeDeserializer._baseType;
        Class initialAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asArrayTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asArrayTypeDeserializer._baseType;
        Class finalAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsArrayTypeDeserializer_baseType_class == finalAsArrayTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString3() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        
        String actual = asWrapperTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer; base-type:null; id-resolver: [com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver; id-to-type=null]]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = {};
        setField(_baseType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asExternalTypeDeserializer._baseType;
        Class initialAsExternalTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asExternalTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer; base-type:[simple type, class java.lang.Object]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asExternalTypeDeserializer._baseType;
        Class finalAsExternalTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsExternalTypeDeserializer_baseType_class == finalAsExternalTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString5() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        
        String actual = asExternalTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer; base-type:null; id-resolver: com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver@5cd88474]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString6() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asArrayTypeDeserializer._baseType;
        JavaType javaType_baseType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class initialAsArrayTypeDeserializer_baseType_referencedType_class = ((Class) getFieldValue(javaType_baseType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = asArrayTypeDeserializer._baseType;
        Class initialAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asArrayTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[reference type, class java.lang.Object<java.lang.Object<[map-like type; class java.lang.Object, null -> null]>]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType2 = asArrayTypeDeserializer._baseType;
        JavaType javaType2_baseType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class finalAsArrayTypeDeserializer_baseType_referencedType_class = ((Class) getFieldValue(javaType2_baseType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = asArrayTypeDeserializer._baseType;
        Class finalAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsArrayTypeDeserializer_baseType_referencedType_class == finalAsArrayTypeDeserializer_baseType_referencedType_class);
        
        assertFalse(initialAsArrayTypeDeserializer_baseType_class == finalAsArrayTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString7() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asExternalTypeDeserializer._baseType;
        JavaType javaType_baseType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class initialAsExternalTypeDeserializer_baseType_referencedType_class = ((Class) getFieldValue(javaType_baseType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = asExternalTypeDeserializer._baseType;
        Class initialAsExternalTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asExternalTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer; base-type:[reference type, class java.lang.Object<java.lang.Object<[collection-like type; class java.lang.Object, contains null]>]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType2 = asExternalTypeDeserializer._baseType;
        JavaType javaType2_baseType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class finalAsExternalTypeDeserializer_baseType_referencedType_class = ((Class) getFieldValue(javaType2_baseType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = asExternalTypeDeserializer._baseType;
        Class finalAsExternalTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsExternalTypeDeserializer_baseType_referencedType_class == finalAsExternalTypeDeserializer_baseType_referencedType_class);
        
        assertFalse(initialAsExternalTypeDeserializer_baseType_class == finalAsExternalTypeDeserializer_baseType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = StackOverflowError.class)
    public void testToString8() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ArrayType _baseType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _baseType);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asWrapperTypeDeserializer.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString9() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _baseType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asPropertyTypeDeserializer.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString10() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _baseType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asExternalTypeDeserializer.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString11() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = new com.fasterxml.jackson.databind.JavaType[1];
        _typeParameters[0] = ((JavaType) _baseType);
        setField(_baseType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asWrapperTypeDeserializer.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString12() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = new com.fasterxml.jackson.databind.JavaType[1];
        _typeParameters[0] = ((JavaType) _baseType);
        setField(_baseType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asArrayTypeDeserializer.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString13() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = new com.fasterxml.jackson.databind.JavaType[1];
        _typeParameters[0] = ((JavaType) _baseType);
        setField(_baseType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString14() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        CollectionLikeType _baseType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.toString(CollectionLikeType.java:205)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString15() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        CollectionType _baseType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:112)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString16() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ArrayType _baseType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        CollectionLikeType _componentType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.toString(CollectionLikeType.java:205)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ArrayType.toString(ArrayType.java:253)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString17() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ArrayType _baseType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        CollectionType _componentType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:112)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ArrayType.toString(ArrayType.java:253)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString18() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ArrayType _baseType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        SimpleType _componentType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:179)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:263)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ArrayType.toString(ArrayType.java:253)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString19() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ArrayType _baseType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        ReferenceType _componentType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ArrayType.toString(ArrayType.java:253)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString20() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asExternalTypeDeserializer.toString();
    }
    
    @Test
    public void testToString21() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = new com.fasterxml.jackson.databind.JavaType[1];
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        _typeParameters[0] = ((JavaType) arrayType);
        setField(_baseType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.buildCanonicalName(ArrayType.java:98)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:189)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:263)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asExternalTypeDeserializer.toString();
    }
    
    @Test
    public void testToString22() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = new com.fasterxml.jackson.databind.JavaType[1];
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        _typeParameters[0] = ((JavaType) referenceType);
        setField(_baseType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:189)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:263)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asExternalTypeDeserializer.toString();
    }
    
    @Test
    public void testToString23() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        _typeParameters[0] = ((JavaType) mapLikeType);
        setField(_baseType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:131)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:189)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:263)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString24() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = new com.fasterxml.jackson.databind.JavaType[9];
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        setField(referenceType, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName", _canonicalName);
        _typeParameters[0] = ((JavaType) referenceType);
        setField(_baseType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:189)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:263)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asExternalTypeDeserializer.toString();
    }
    
    @Test
    public void testToString25() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = new com.fasterxml.jackson.databind.JavaType[9];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _typeParameters[0] = ((JavaType) collectionLikeType);
        setField(_baseType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:189)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:263)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString26() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = new com.fasterxml.jackson.databind.JavaType[1];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        _typeParameters[0] = ((JavaType) collectionLikeType);
        setField(_baseType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:160)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:189)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:263)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString27() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.buildCanonicalName(ArrayType.java:98)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString28() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException] */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString29() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:131)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asExternalTypeDeserializer.toString();
    }
    
    @Test
    public void testToString30() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        String _canonicalName = "";
        setField(_referencedType, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName", _canonicalName);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:148)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:173)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString31() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        String _canonicalName = "";
        setField(_referencedType, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName", _canonicalName);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:179)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:263)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:173)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asExternalTypeDeserializer.toString();
    }
    
    @Test
    public void testToString32() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        String _canonicalName = "";
        setField(_referencedType, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName", _canonicalName);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:241)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:173)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asPropertyTypeDeserializer.toString();
    }
    
    @Test
    public void testToString33() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:160)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:132) */
        asArrayTypeDeserializer.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (idResolver instanceof TypeIdResolverBase): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#unknownTypeException(com.fasterxml.jackson.databind.JavaType,java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw ctxt.unknownTypeException(_baseType, typeId, extraDesc);
 *  */
    @Test
    public void test_handleUnknownTypeId_ThrowNullPointerException() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:277) */
        asPropertyTypeDeserializer._handleUnknownTypeId(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void test_handleUnknownTypeId1() throws Throwable  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        CollectionType _baseType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        TypeNameIdResolver typeNameIdResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        HashMap _idToType = new HashMap();
        setField(typeNameIdResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:112)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.DeserializationContext.unknownTypeException(DeserializationContext.java:960)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:277) */
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class stringType = Class.forName("java.lang.String");
        Class typeNameIdResolverType = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        Class javaTypeType = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Method _handleUnknownTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_handleUnknownTypeId", implType, stringType, typeNameIdResolverType, javaTypeType);
        _handleUnknownTypeIdMethod.setAccessible(true);
        java.lang.Object[] _handleUnknownTypeIdMethodArguments = new java.lang.Object[4];
        _handleUnknownTypeIdMethodArguments[0] = impl;
        _handleUnknownTypeIdMethodArguments[1] = string;
        _handleUnknownTypeIdMethodArguments[2] = typeNameIdResolver;
        _handleUnknownTypeIdMethodArguments[3] = ((Object) null);
        try {
            _handleUnknownTypeIdMethod.invoke(asArrayTypeDeserializer, _handleUnknownTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDefaultImplDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_defaultImpl == null): True}
 * @utbot.executesCondition {@code (!ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void test_findDefaultImplDeserializer_CtxtIsEnabled() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        JsonDeserializer actual = asWrapperTypeDeserializer._findDefaultImplDeserializer(impl);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_defaultImpl == null): True}
 * @utbot.executesCondition {@code (!ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)): True}
 * @utbot.returnsFrom {@code return NullifyingDeserializer.instance;}
 *  */
    @Test
    public void test_findDefaultImplDeserializer_NotCtxtIsEnabled() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            
            NullifyingDeserializer actual = ((NullifyingDeserializer) asWrapperTypeDeserializer._findDefaultImplDeserializer(impl));
            
            Class instance_valueClass = ((Class) getFieldValue(instance, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
            assertEquals(Class.class, actual_valueClass.getClass());
            
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_defaultImpl == null): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(raw)): False}
 * @utbot.executesCondition {@code (_defaultImplDeserializer == null): False}
 * @utbot.returnsFrom {@code return _defaultImplDeserializer;}
 *  */
    @Test
    public void test_findDefaultImplDeserializer__defaultImplDeserializerNotEqualsNull() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        StdDelegatingDeserializer _defaultImplDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        
        StdDelegatingDeserializer actual = ((StdDelegatingDeserializer) asWrapperTypeDeserializer._findDefaultImplDeserializer(null));
        
        Converter actual_converter = ((Converter) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_converter"));
        assertNull(actual_converter);
        
        JavaType actual_delegateType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
        assertNull(actual_delegateType);
        
        JsonDeserializer actual_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        assertNull(actual_delegateDeserializer);
        
        Class actual_valueClass = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDeserializer", "_valueClass"));
        assertNull(actual_valueClass);
        
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_defaultImpl == null): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(raw)): False}
 * @utbot.executesCondition {@code (_defaultImplDeserializer == null): True}
 * @utbot.returnsFrom {@code return _defaultImplDeserializer;}
 *  */
    @Test
    public void test_findDefaultImplDeserializer__defaultImplDeserializerEqualsNull() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ValueInjector _property = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        CollectionType _defaultImpl = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        _cachedDeserializers.put(_defaultImpl, typeWrappedDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        JsonDeserializer initialAsWrapperTypeDeserializer_defaultImplDeserializer = asWrapperTypeDeserializer._defaultImplDeserializer;
        
        TypeWrappedDeserializer actual = ((TypeWrappedDeserializer) asWrapperTypeDeserializer._findDefaultImplDeserializer(impl));
        
        TypeWrappedDeserializer expected = new TypeWrappedDeserializer(null, null);
        
        JsonDeserializer finalAsWrapperTypeDeserializer_defaultImplDeserializer = asWrapperTypeDeserializer._defaultImplDeserializer;
        
        assertFalse(initialAsWrapperTypeDeserializer_defaultImplDeserializer == finalAsWrapperTypeDeserializer_defaultImplDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_defaultImpl == null): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(raw)): False}
 * @utbot.executesCondition {@code (_defaultImplDeserializer == null): True}
 * @utbot.returnsFrom {@code return _defaultImplDeserializer;}
 *  */
    @Test
    public void test_findDefaultImplDeserializer__defaultImplDeserializerEqualsNull_1() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        CollectionType _defaultImpl = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        _cachedDeserializers.put(_defaultImpl, typeWrappedDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        JsonDeserializer initialAsExternalTypeDeserializer_defaultImplDeserializer = asExternalTypeDeserializer._defaultImplDeserializer;
        
        TypeWrappedDeserializer actual = ((TypeWrappedDeserializer) asExternalTypeDeserializer._findDefaultImplDeserializer(impl));
        
        TypeWrappedDeserializer expected = new TypeWrappedDeserializer(null, null);
        
        JsonDeserializer finalAsExternalTypeDeserializer_defaultImplDeserializer = asExternalTypeDeserializer._defaultImplDeserializer;
        
        assertFalse(initialAsExternalTypeDeserializer_defaultImplDeserializer == finalAsExternalTypeDeserializer_defaultImplDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_defaultImpl == null): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(raw)): False}
 * @utbot.executesCondition {@code (_defaultImplDeserializer == null): True}
 * @utbot.returnsFrom {@code return _defaultImplDeserializer;}
 *  */
    @Test
    public void test_findDefaultImplDeserializer__defaultImplDeserializerEqualsNull_2() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        CollectionType _defaultImpl = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        FailingDeserializer _delegateDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        _cachedDeserializers.put(_defaultImpl, stdDelegatingDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        JsonDeserializer initialAsPropertyTypeDeserializer_defaultImplDeserializer = asPropertyTypeDeserializer._defaultImplDeserializer;
        
        StdDelegatingDeserializer actual = ((StdDelegatingDeserializer) asPropertyTypeDeserializer._findDefaultImplDeserializer(impl));
        
        JavaType actual_delegateType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
        assertNull(actual_delegateType);
        
        JsonDeserializer stdDelegatingDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        JsonDeserializer actual_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        
        JsonDeserializer finalAsPropertyTypeDeserializer_defaultImplDeserializer = asPropertyTypeDeserializer._defaultImplDeserializer;
        
        assertFalse(initialAsPropertyTypeDeserializer_defaultImplDeserializer == finalAsPropertyTypeDeserializer_defaultImplDeserializer);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_defaultImpl == null): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(raw)): False}
 * @utbot.executesCondition {@code (_defaultImplDeserializer == null): True}
 * @utbot.returnsFrom {@code return _defaultImplDeserializer;}
 *  */
    @Test
    public void test_findDefaultImplDeserializer__defaultImplDeserializerEqualsNull_3() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ObjectIdValueProperty _property = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        CollectionType _collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType", _collectionType);
        FailingDeserializer _valueDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueDeserializer", _valueDeserializer);
        _cachedDeserializers.put(_defaultImpl, collectionDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_mapperFeatures", 1);
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        JacksonAnnotationIntrospector _annotationIntrospector = ((JacksonAnnotationIntrospector) createInstance("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(_base, "com.fasterxml.jackson.databind.cfg.BaseSettings", "_annotationIntrospector", _annotationIntrospector);
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        LinkedNode _currentType = ((LinkedNode) createInstance("com.fasterxml.jackson.databind.util.LinkedNode"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_currentType", _currentType);
        
        JsonDeserializer initialAsWrapperTypeDeserializer_defaultImplDeserializer = asWrapperTypeDeserializer._defaultImplDeserializer;
        
        CollectionDeserializer actual = ((CollectionDeserializer) asWrapperTypeDeserializer._findDefaultImplDeserializer(impl));
        
        JavaType collectionDeserializer_collectionType = ((JavaType) getFieldValue(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType"));
        JavaType actual_collectionType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_collectionType"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(collectionDeserializer_collectionType, actual_collectionType);
        
        JsonDeserializer collectionDeserializer_valueDeserializer = ((JsonDeserializer) getFieldValue(collectionDeserializer, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueDeserializer"));
        JsonDeserializer actual_valueDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueDeserializer"));
        
        TypeDeserializer actual_valueTypeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueTypeDeserializer"));
        assertNull(actual_valueTypeDeserializer);
        
        ValueInstantiator actual_valueInstantiator = ((ValueInstantiator) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_valueInstantiator"));
        assertNull(actual_valueInstantiator);
        
        JsonDeserializer actual_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer", "_delegateDeserializer"));
        assertNull(actual_delegateDeserializer);
        
        JsonDeserializer finalAsWrapperTypeDeserializer_defaultImplDeserializer = asWrapperTypeDeserializer._defaultImplDeserializer;
        
        assertFalse(initialAsWrapperTypeDeserializer_defaultImplDeserializer == finalAsWrapperTypeDeserializer_defaultImplDeserializer);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_defaultImpl == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#isEnabled(com.fasterxml.jackson.databind.DeserializationFeature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)
 *  */
    @Test
    public void test_findDefaultImplDeserializer_ThrowNullPointerException() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDefaultImplDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDefaultImplDeserializer(TypeDeserializerBase.java:193) */
        asWrapperTypeDeserializer._findDefaultImplDeserializer(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.executesCondition {@code (_defaultImpl == null): False}
 * @utbot.executesCondition {@code (ClassUtil.isBogusClass(raw)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.util.ClassUtil#isBogusClass(java.lang.Class)}
 * @utbot.returnsFrom {@code return NullifyingDeserializer.instance;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return NullifyingDeserializer.instance;
 *  */
    @Test(expected = NullPointerException.class)
    public void test_findDefaultImplDeserializer_ThrowNullPointerException_1() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
            ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            
            asExternalTypeDeserializer._findDefaultImplDeserializer(null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (typeId == null): True}
 * @utbot.executesCondition {@code (deser == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#mappingException(java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} when: deser == null
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_deserializeWithNativeTypeId_ThrowJsonMappingException() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(null, impl, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext,java.lang.Object)}
 * @utbot.executesCondition {@code (typeId == null): True}
 * @utbot.executesCondition {@code (deser == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return deser.deserialize(jp, ctxt);
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserializeWithNativeTypeId_ThrowIllegalStateException() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(null, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = IllegalArgumentException.class)
    public void test_deserializeWithNativeTypeId1() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        BaseSettings _base = ((BaseSettings) createInstance("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(_config, "com.fasterxml.jackson.databind.cfg.MapperConfig", "_base", _base);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        asArrayTypeDeserializer._deserializeWithNativeTypeId(treeTraversingParser, impl, string);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId2() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
            ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            
            asArrayTypeDeserializer._deserializeWithNativeTypeId(null, null, null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void test_deserializeWithNativeTypeId3() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:154)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:244) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(null, impl, integer);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId4() throws Throwable  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:141)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:134)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class objectType = Class.forName("java.lang.Object");
        Method _deserializeWithNativeTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_deserializeWithNativeTypeId", parserType, implType, objectType);
        _deserializeWithNativeTypeIdMethod.setAccessible(true);
        java.lang.Object[] _deserializeWithNativeTypeIdMethodArguments = new java.lang.Object[3];
        _deserializeWithNativeTypeIdMethodArguments[0] = parser;
        _deserializeWithNativeTypeIdMethodArguments[1] = impl;
        _deserializeWithNativeTypeIdMethodArguments[2] = ((Object) null);
        try {
            _deserializeWithNativeTypeIdMethod.invoke(asWrapperTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_deserializeWithNativeTypeId5() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:125)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId6() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:127)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId7() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:34)
                com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
            asPropertyTypeDeserializer._deserializeWithNativeTypeId(null, impl, null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeWithNativeTypeId8() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Integer integer = 0;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:231)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.typeFromId(ClassNameIdResolver.java:48)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:154)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:244) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl, integer);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId9() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:141)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:134)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId10() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:127)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId11() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate1, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:266)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:197)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:125)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId12() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        String string = "";
        NumberDeserializers.DoubleDeserializer doubleDeserializer = ((NumberDeserializers.DoubleDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer"));
        _deserializers.put(string, doubleDeserializer);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        String string1 = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDeserializer._parseDouble(StdDeserializer.java:657)
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer.deserialize(NumberDeserializers.java:386)
            com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer.deserialize(NumberDeserializers.java:371)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(null, null, string1);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId13() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        CollectionType _defaultImpl = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:141)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:134)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId14() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:107)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:107)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:107)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:107)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:123)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId15() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        NumberDeserializers.FloatDeserializer floatDeserializer = ((NumberDeserializers.FloatDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer"));
        _deserializers.put(null, floatDeserializer);
        String string = "";
        _deserializers.put(string, null);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:154)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:244) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(treeTraversingParser, null, string);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId16() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        CollectionType _defaultImpl = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:174)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:42)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:246) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTypeId()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void test_deserializeWithNativeTypeId_ThrowClassCastException() throws Throwable  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        int[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method _deserializeWithNativeTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_deserializeWithNativeTypeId", parserType, deserializationContextType);
        _deserializeWithNativeTypeIdMethod.setAccessible(true);
        java.lang.Object[] _deserializeWithNativeTypeIdMethodArguments = new java.lang.Object[2];
        _deserializeWithNativeTypeIdMethodArguments[0] = parser;
        _deserializeWithNativeTypeIdMethodArguments[1] = ((Object) null);
        try {
            _deserializeWithNativeTypeIdMethod.invoke(asPropertyTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getTypeId()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test
    public void test_deserializeWithNativeTypeId_ThrowNullPointerException() throws IOException  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = new AsWrapperTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException] */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_deserializeWithNativeTypeId_ThrowJsonMappingException_1() throws Throwable  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 256);
        
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method _deserializeWithNativeTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_deserializeWithNativeTypeId", parserType, implType);
        _deserializeWithNativeTypeIdMethod.setAccessible(true);
        java.lang.Object[] _deserializeWithNativeTypeIdMethodArguments = new java.lang.Object[2];
        _deserializeWithNativeTypeIdMethodArguments[0] = parser;
        _deserializeWithNativeTypeIdMethodArguments[1] = impl;
        try {
            _deserializeWithNativeTypeIdMethod.invoke(asExternalTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_deserializeWithNativeTypeId_ThrowJsonMappingException1() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_deserializeWithNativeTypeId_ThrowJsonMappingException_2() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 256);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_deserializeWithNativeTypeId_ThrowJsonMappingException_3() throws Throwable  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 800321491;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segmentPtr", 537133058);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 256);
        
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method _deserializeWithNativeTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_deserializeWithNativeTypeId", parserType, implType);
        _deserializeWithNativeTypeIdMethod.setAccessible(true);
        java.lang.Object[] _deserializeWithNativeTypeIdMethodArguments = new java.lang.Object[2];
        _deserializeWithNativeTypeIdMethodArguments[0] = parser;
        _deserializeWithNativeTypeIdMethodArguments[1] = impl;
        try {
            _deserializeWithNativeTypeIdMethod.invoke(asPropertyTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserializeWithNativeTypeId_ThrowIllegalStateException1() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _defaultImplDeserializer);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserializeWithNativeTypeId_ThrowIllegalStateException_1() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _defaultImplDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId17() throws Throwable  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.util.Comparators$NullComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method _deserializeWithNativeTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_deserializeWithNativeTypeId", parserType, implType);
        _deserializeWithNativeTypeIdMethod.setAccessible(true);
        java.lang.Object[] _deserializeWithNativeTypeIdMethodArguments = new java.lang.Object[2];
        _deserializeWithNativeTypeIdMethodArguments[0] = parser;
        _deserializeWithNativeTypeIdMethodArguments[1] = impl;
        try {
            _deserializeWithNativeTypeIdMethod.invoke(asExternalTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId18() throws Throwable  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method _deserializeWithNativeTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_deserializeWithNativeTypeId", parserType, implType);
        _deserializeWithNativeTypeIdMethod.setAccessible(true);
        java.lang.Object[] _deserializeWithNativeTypeIdMethodArguments = new java.lang.Object[2];
        _deserializeWithNativeTypeIdMethodArguments[0] = parser;
        _deserializeWithNativeTypeIdMethodArguments[1] = impl;
        try {
            _deserializeWithNativeTypeIdMethod.invoke(asWrapperTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId19() throws Throwable  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method _deserializeWithNativeTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_deserializeWithNativeTypeId", parserType, implType);
        _deserializeWithNativeTypeIdMethod.setAccessible(true);
        java.lang.Object[] _deserializeWithNativeTypeIdMethodArguments = new java.lang.Object[2];
        _deserializeWithNativeTypeIdMethodArguments[0] = parser;
        _deserializeWithNativeTypeIdMethodArguments[1] = impl;
        try {
            _deserializeWithNativeTypeIdMethod.invoke(asArrayTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for _deserializeWithNativeTypeId
    
    public void test_deserializeWithNativeTypeId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method baseTypeName()
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#baseTypeName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.returnsFrom {@code return _baseType.getRawClass().getName();}
 *  */
    @Test
    public void testBaseTypeName_ClassGetName() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ArrayType _baseType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asPropertyTypeDeserializer._baseType;
        Class initialAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asPropertyTypeDeserializer.baseTypeName();
        
        String expected = "java.lang.Object";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asPropertyTypeDeserializer._baseType;
        Class finalAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsPropertyTypeDeserializer_baseType_class == finalAsPropertyTypeDeserializer_baseType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method baseTypeName()
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#baseTypeName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public String baseTypeName() {
 *     return _baseType.getRawClass().getName();
 * }
 *  */
    @Test
    public void testBaseTypeName_ThrowNullPointerException() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114) */
        asWrapperTypeDeserializer.baseTypeName();
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#baseTypeName()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public String baseTypeName() {
 *     return _baseType.getRawClass().getName();
 * }
 *  */
    @Test
    public void testBaseTypeName_ThrowNullPointerException_1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ArrayType _baseType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:114) */
        asPropertyTypeDeserializer.baseTypeName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _findDeserializer(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDeserializer(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.executesCondition {@code (deser == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return deser;}
 *  */
    @Test
    public void test_findDeserializer_DeserNotEqualsNull() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        String string = "";
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        _deserializers.put(string, typeWrappedDeserializer);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        TypeWrappedDeserializer actual = ((TypeWrappedDeserializer) asPropertyTypeDeserializer._findDeserializer(null, string));
        
        TypeWrappedDeserializer expected = new TypeWrappedDeserializer(null, null);
        
        TypeDeserializer actual_typeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer"));
        assertNull(actual_typeDeserializer);
        
        JsonDeserializer actual_deserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer"));
        assertNull(actual_deserializer);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _findDeserializer(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDeserializer(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonDeserializer<Object> deser = _deserializers.get(typeId);
 *  */
    @Test
    public void test_findDeserializer_ThrowNullPointerException() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:147) */
        asWrapperTypeDeserializer._findDeserializer(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_findDeserializer(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.executesCondition {@code (deser == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.TypeIdResolver#typeFromId(com.fasterxml.jackson.databind.DatabindContext,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType type = _idResolver.typeFromId(ctxt, typeId);
 *  */
    @Test
    public void test_findDeserializer_ThrowNullPointerException_1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:154) */
        asPropertyTypeDeserializer._findDeserializer(null, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.getTypeIdResolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeIdResolver()
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#getTypeIdResolver()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetTypeIdResolver_Return() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        TypeIdResolver actual = asWrapperTypeDeserializer.getTypeIdResolver();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.getDefaultImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultImpl()
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#getDefaultImpl()}
 * @utbot.executesCondition {@code ((_defaultImpl == null)): True}
 * @utbot.returnsFrom {@code return (_defaultImpl == null) ? null : _defaultImpl.getRawClass();}
 *  */
    @Test
    public void testGetDefaultImpl__defaultImplEqualsNull() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        Class actual = asWrapperTypeDeserializer.getDefaultImpl();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#getDefaultImpl()}
 * @utbot.executesCondition {@code ((_defaultImpl == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code return (_defaultImpl == null) ? null : _defaultImpl.getRawClass();}
 *  */
    @Test
    public void testGetDefaultImpl__defaultImplNotEqualsNull() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        
        Class actual = asPropertyTypeDeserializer.getDefaultImpl();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.getPropertyName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyName()
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#getPropertyName()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetPropertyName_Return() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        String actual = asWrapperTypeDeserializer.getPropertyName();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1069543626986300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1069543626986300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1069543626994000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069543626986300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069543626994000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1069543627468500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1069543627468500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1069543627472500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069543627468500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069543627472500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1069543628142200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1069543628142200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1069543628145900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069543628142200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069543628145900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

