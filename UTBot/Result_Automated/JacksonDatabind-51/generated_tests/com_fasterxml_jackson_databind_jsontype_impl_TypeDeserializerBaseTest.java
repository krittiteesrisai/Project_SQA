package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.util.TreeMap;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.IOException;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.Method;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import java.text.RuleBasedCollator;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import java.util.Comparator;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.HashMap;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_jsontype_impl_TypeDeserializerBaseTest {
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ArrayType _baseType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        String actual = asArrayTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[array type, component type: null]; id-resolver: null]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString2() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapType _baseType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asArrayTypeDeserializer._baseType;
        Class initialAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asArrayTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map type; class java.lang.Object, null -> null]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asArrayTypeDeserializer._baseType;
        Class finalAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsArrayTypeDeserializer_baseType_class == finalAsArrayTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString3() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asArrayTypeDeserializer._baseType;
        Class initialAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asArrayTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map-like type; class java.lang.Object, null -> null]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asArrayTypeDeserializer._baseType;
        Class finalAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsArrayTypeDeserializer_baseType_class == finalAsArrayTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString4() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        
        String actual = asPropertyTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: [com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver; id-to-type=null]]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asArrayTypeDeserializer._baseType;
        Class initialAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asArrayTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map-like type; class java.lang.Object, [array type, component type: null] -> null]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asArrayTypeDeserializer._baseType;
        Class finalAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsArrayTypeDeserializer_baseType_class == finalAsArrayTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString6() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapType _baseType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asArrayTypeDeserializer._baseType;
        Class initialAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asArrayTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer; base-type:[map type; class java.lang.Object, [array type, component type: null] -> null]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asArrayTypeDeserializer._baseType;
        Class finalAsArrayTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsArrayTypeDeserializer_baseType_class == finalAsArrayTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString7() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        
        String actual = asPropertyTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver@568690fe]";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = StackOverflowError.class)
    public void testToString8() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _baseType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asArrayTypeDeserializer.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString9() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _baseType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString10() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:219)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:128) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString11() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:166)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:258)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:128) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString12() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:219)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:128) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString13() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapType _baseType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:219)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:161)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:128) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString14() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:166)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:258)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:128) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString15() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapType _baseType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:166)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:258)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:161)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:128) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString16() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapType _baseType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:161)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:128) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString17() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapType _baseType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:161)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:161)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:128) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString18() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _baseType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:161)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:128) */
        asArrayTypeDeserializer.toString();
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
    public void test_deserializeWithNativeTypeId_ThrowClassCastException() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = new AsWrapperTypeDeserializer(null, null);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Integer] */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, null);
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
    public void test_deserializeWithNativeTypeId_ThrowJsonMappingException() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_deserializeWithNativeTypeId_ThrowJsonMappingException_3() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 256);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_deserializeWithNativeTypeId_ThrowJsonMappingException_2() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
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
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 256);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserializeWithNativeTypeId_ThrowIllegalStateException() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsExternalTypeDeserializer _typeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _defaultImplDeserializer);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_deserializeWithNativeTypeId_ThrowIllegalStateException_1() throws Throwable  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _defaultImplDeserializer);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        RuleBasedCollator comparator = ((RuleBasedCollator) createInstance("java.text.RuleBasedCollator"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method _deserializeWithNativeTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_deserializeWithNativeTypeId", parserType, deserializationContextType);
        _deserializeWithNativeTypeIdMethod.setAccessible(true);
        java.lang.Object[] _deserializeWithNativeTypeIdMethodArguments = new java.lang.Object[2];
        _deserializeWithNativeTypeIdMethodArguments[0] = parser;
        _deserializeWithNativeTypeIdMethodArguments[1] = ((Object) null);
        try {
            _deserializeWithNativeTypeIdMethod.invoke(asWrapperTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_deserializeWithNativeTypeId1() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -2147483647;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_deserializeWithNativeTypeId2() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(root, "java.util.TreeMap$Entry", "value", key);
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:252)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:228) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId3() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        String value = "";
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.getTypeFactory(DeserializationContext.java:250)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId(ClassNameIdResolver.java:51)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.typeFromId(ClassNameIdResolver.java:42)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:252)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:228) */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId4() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
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
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver._typeFromId(TypeNameIdResolver.java:136)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.typeFromId(TypeNameIdResolver.java:127)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:252)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:228) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId5() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:254)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:228) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId6() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        String string = "";
        _deserializers.put(string, null);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        String value = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:252)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:228) */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId7() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -2147483647;
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
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId8() throws Throwable  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _defaultImpl);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
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
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId9() throws Throwable  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("com.sun.org.apache.xerces.internal.impl.xs.XSConstraints$1"));
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
    public void test_deserializeWithNativeTypeId10() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
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
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId11() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -2147483647;
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
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId12() throws Throwable  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("com.sun.org.apache.xerces.internal.impl.xs.XSConstraints$1"));
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
    public void test_deserializeWithNativeTypeId13() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 1;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId14() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
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
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    ///endregion
    
    ///region Errors report for _deserializeWithNativeTypeId
    
    public void test_deserializeWithNativeTypeId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        // Failed requirement.
        
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
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#reportMappingException(java.lang.String,java.lang.Object[])}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.JsonMappingException} in: ctxt.reportMappingException("No (native) type id found when one was expected for polymorphic type handling");
 *  */
    @Test(expected = JsonMappingException.class)
    public void test_deserializeWithNativeTypeId_ThrowJsonMappingException1() throws Exception  {
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
    public void test_deserializeWithNativeTypeId_ThrowIllegalStateException1() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsWrapperTypeDeserializer _typeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(null, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId15() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            
            asPropertyTypeDeserializer._deserializeWithNativeTypeId(null, null, null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId16() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(null, impl, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId17() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(readerBasedJsonParser, impl, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId18() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        ReaderBasedJsonParser readerBasedJsonParser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(readerBasedJsonParser, impl, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void test_deserializeWithNativeTypeId19() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:252) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl, integer);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId20() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:35)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:254) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(null, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId21() throws Throwable  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId(ClassNameIdResolver.java:51)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.typeFromId(ClassNameIdResolver.java:42)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:252) */
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class deserializationContextType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Class stringType = Class.forName("java.lang.Object");
        Method _deserializeWithNativeTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_deserializeWithNativeTypeId", parserType, deserializationContextType, stringType);
        _deserializeWithNativeTypeIdMethod.setAccessible(true);
        java.lang.Object[] _deserializeWithNativeTypeIdMethodArguments = new java.lang.Object[3];
        _deserializeWithNativeTypeIdMethodArguments[0] = parser;
        _deserializeWithNativeTypeIdMethodArguments[1] = ((Object) null);
        _deserializeWithNativeTypeIdMethodArguments[2] = string;
        try {
            _deserializeWithNativeTypeIdMethod.invoke(asArrayTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void test_deserializeWithNativeTypeId22() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:254) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(treeTraversingParser, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId23() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        FilteringParserDelegate delegate1 = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:254) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId24() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        SimpleType _defaultImpl = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(delegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:281)
            com.fasterxml.jackson.core.util.JsonParserSequence.nextToken(JsonParserSequence.java:99)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:215)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:144)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:254) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId25() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        String string = "";
        StringDeserializer stringDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        _deserializers.put(string, stringDeserializer);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:30)
            com.fasterxml.jackson.databind.deser.std.StringDeserializer.deserialize(StringDeserializer.java:11)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:254) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(null, null, string);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId26() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:157)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:150)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:254) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (idResolver instanceof TypeIdResolverBase): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnknownTypeId(com.fasterxml.jackson.databind.JavaType,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,java.lang.String)}
 * @utbot.returnsFrom {@code return ctxt.handleUnknownTypeId(_baseType, typeId, idResolver, extraDesc);}
 *  */
    @Test
    public void test_handleUnknownTypeId_NotIdResolverNotInstanceOfTypeIdResolverBase() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
        
        JavaType actual = asExternalTypeDeserializer._handleUnknownTypeId(impl, null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (idResolver instanceof TypeIdResolverBase): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleUnknownTypeId(com.fasterxml.jackson.databind.JavaType,java.lang.String,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleUnknownTypeId(_baseType, typeId, idResolver, extraDesc);
 *  */
    @Test
    public void test_handleUnknownTypeId_ThrowNullPointerException() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:285) */
        asPropertyTypeDeserializer._handleUnknownTypeId(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, com.fasterxml.jackson.databind.JavaType)
    
    @Test(expected = InvalidTypeIdException.class)
    public void test_handleUnknownTypeId1() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 256);
        
        asExternalTypeDeserializer._handleUnknownTypeId(impl, null, null, null);
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
            AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 1);
            
            NullifyingDeserializer actual = ((NullifyingDeserializer) asExternalTypeDeserializer._findDefaultImplDeserializer(impl));
            
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
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        
        TypeWrappedDeserializer actual = ((TypeWrappedDeserializer) asWrapperTypeDeserializer._findDefaultImplDeserializer(null));
        
        TypeWrappedDeserializer expected = new TypeWrappedDeserializer(null, null);
        
        TypeDeserializer actual_typeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer"));
        assertNull(actual_typeDeserializer);
        
        JsonDeserializer actual_deserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer"));
        assertNull(actual_deserializer);
        
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
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        TokenBufferDeserializer tokenBufferDeserializer = ((TokenBufferDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer"));
        _cachedDeserializers.put(_defaultImpl, tokenBufferDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        JsonDeserializer initialAsExternalTypeDeserializer_defaultImplDeserializer = asExternalTypeDeserializer._defaultImplDeserializer;
        
        TokenBufferDeserializer actual = ((TokenBufferDeserializer) asExternalTypeDeserializer._findDefaultImplDeserializer(impl));
        
        TokenBufferDeserializer expected = new TokenBufferDeserializer();
        
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
    public void test_findDefaultImplDeserializer__defaultImplDeserializerEqualsNull_3() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        TypeWrappedDeserializer _delegateDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        _cachedDeserializers.put(_defaultImpl, stdDelegatingDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        JsonDeserializer initialAsWrapperTypeDeserializer_defaultImplDeserializer = asWrapperTypeDeserializer._defaultImplDeserializer;
        
        StdDelegatingDeserializer actual = ((StdDelegatingDeserializer) asWrapperTypeDeserializer._findDefaultImplDeserializer(impl));
        
        JavaType actual_delegateType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
        assertNull(actual_delegateType);
        
        JsonDeserializer stdDelegatingDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        JsonDeserializer actual_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        
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
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ValueInjector _property = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        _cachedDeserializers.put(_defaultImpl, typeWrappedDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        JsonDeserializer initialAsPropertyTypeDeserializer_defaultImplDeserializer = asPropertyTypeDeserializer._defaultImplDeserializer;
        
        TypeWrappedDeserializer actual = ((TypeWrappedDeserializer) asPropertyTypeDeserializer._findDefaultImplDeserializer(impl));
        
        TypeWrappedDeserializer expected = new TypeWrappedDeserializer(null, null);
        
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
    public void test_findDefaultImplDeserializer__defaultImplDeserializerEqualsNull_2() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ManagedReferenceProperty _property = ((ManagedReferenceProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        MapType _defaultImpl = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        _cachedDeserializers.put(_defaultImpl, typeWrappedDeserializer);
        _cachedDeserializers.put(null, null);
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
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDefaultImplDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDefaultImplDeserializer(TypeDeserializerBase.java:200) */
        asExternalTypeDeserializer._findDefaultImplDeserializer(null);
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
            ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
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
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.getTypeIdResolver
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeIdResolver()
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#getTypeIdResolver()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetTypeIdResolver_Return() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        TypeIdResolver actual = asPropertyTypeDeserializer.getTypeIdResolver();
        
        assertNull(actual);
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
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        String string = "";
        TypeWrappedDeserializer typeWrappedDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        _deserializers.put(string, typeWrappedDeserializer);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        
        TypeWrappedDeserializer actual = ((TypeWrappedDeserializer) asWrapperTypeDeserializer._findDeserializer(null, string));
        
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
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:143) */
        asPropertyTypeDeserializer._findDeserializer(null, null);
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
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:150) */
        asPropertyTypeDeserializer._findDeserializer(null, string);
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
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:110) */
        asPropertyTypeDeserializer.baseTypeName();
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
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:110) */
        asPropertyTypeDeserializer.baseTypeName();
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
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        Class actual = asPropertyTypeDeserializer.getDefaultImpl();
        
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
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        
        Class actual = asPropertyTypeDeserializer.getDefaultImpl();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1076297052651300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1076297052651300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1076297052657800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076297052651300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076297052657800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1076297053414700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076297053414700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076297053416100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076297053414700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076297053416100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1076297053789000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076297053789000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076297053790800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076297053789000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076297053790800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

