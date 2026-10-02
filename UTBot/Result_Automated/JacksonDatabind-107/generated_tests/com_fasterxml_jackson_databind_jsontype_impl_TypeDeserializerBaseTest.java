package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.MapType;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.BeanProperty.Bogus;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.BeanProperty.Std;
import com.fasterxml.jackson.databind.ser.std.MapProperty;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.core.io.SerializedString;
import java.util.TreeMap;
import java.lang.reflect.Constructor;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import java.io.IOException;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import sun.security.util.ByteArrayLexOrder;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import java.util.Comparator;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.HashMap;
import com.fasterxml.jackson.databind.ext.DOMDeserializer.DocumentDeserializer;
import com.fasterxml.jackson.databind.ext.DOMDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
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
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        String actual = asPropertyTypeDeserializer.getPropertyName();
        
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
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _baseType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _baseType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asPropertyTypeDeserializer._baseType;
        Class initialAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asPropertyTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; java.lang.Object; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asPropertyTypeDeserializer._baseType;
        Class finalAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsPropertyTypeDeserializer_baseType_class == finalAsPropertyTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString3() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        
        String actual = asPropertyTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:null; id-resolver: [com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver; id-to-type=null]]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString4() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        
        String actual = asWrapperTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer; base-type:null; id-resolver: com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver@33dd4a41]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString5() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _baseType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        String actual = asPropertyTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[recursive type; UNRESOLVED; id-resolver: null]";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testToString6() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        String _canonicalName = "";
        setField(_referencedType, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName", _canonicalName);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asPropertyTypeDeserializer._baseType;
        Class initialAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asPropertyTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class java.lang.Object<><[array type, component type: null]>]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asPropertyTypeDeserializer._baseType;
        Class finalAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsPropertyTypeDeserializer_baseType_class == finalAsPropertyTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString7() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        PlaceholderForType _referencedType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        String _canonicalName = "";
        setField(_referencedType, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName", _canonicalName);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asPropertyTypeDeserializer._baseType;
        Class initialAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asPropertyTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class java.lang.Object<><$1>]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asPropertyTypeDeserializer._baseType;
        Class finalAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsPropertyTypeDeserializer_baseType_class == finalAsPropertyTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString8() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asPropertyTypeDeserializer._baseType;
        JavaType javaType_baseType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class initialAsPropertyTypeDeserializer_baseType_referencedType_class = ((Class) getFieldValue(javaType_baseType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = asPropertyTypeDeserializer._baseType;
        Class initialAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asPropertyTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class java.lang.Object<java.lang.Object><[collection-like type; class java.lang.Object, contains null]>]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType2 = asPropertyTypeDeserializer._baseType;
        JavaType javaType2_baseType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class finalAsPropertyTypeDeserializer_baseType_referencedType_class = ((Class) getFieldValue(javaType2_baseType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = asPropertyTypeDeserializer._baseType;
        Class finalAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsPropertyTypeDeserializer_baseType_referencedType_class == finalAsPropertyTypeDeserializer_baseType_referencedType_class);
        
        assertFalse(initialAsPropertyTypeDeserializer_baseType_class == finalAsPropertyTypeDeserializer_baseType_class);
    }
    
    @Test
    public void testToString9() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asPropertyTypeDeserializer._baseType;
        JavaType javaType_baseType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class initialAsPropertyTypeDeserializer_baseType_referencedType_class = ((Class) getFieldValue(javaType_baseType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = asPropertyTypeDeserializer._baseType;
        Class initialAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asPropertyTypeDeserializer.toString();
        
        String expected = "[com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer; base-type:[reference type, class java.lang.Object<java.lang.Object><[map-like type; class java.lang.Object, null -> null]>]; id-resolver: null]";
        
        assertEquals(expected, actual);
        
        JavaType javaType2 = asPropertyTypeDeserializer._baseType;
        JavaType javaType2_baseType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class finalAsPropertyTypeDeserializer_baseType_referencedType_class = ((Class) getFieldValue(javaType2_baseType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = asPropertyTypeDeserializer._baseType;
        Class finalAsPropertyTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsPropertyTypeDeserializer_baseType_referencedType_class == finalAsPropertyTypeDeserializer_baseType_referencedType_class);
        
        assertFalse(initialAsPropertyTypeDeserializer_baseType_class == finalAsPropertyTypeDeserializer_baseType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = StackOverflowError.class)
    public void testToString10() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _baseType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asPropertyTypeDeserializer.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString11() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _baseType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asPropertyTypeDeserializer.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString12() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _baseType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        asPropertyTypeDeserializer.toString();
    }
    
    @Test
    public void testToString13() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        CollectionType _baseType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:134)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asPropertyTypeDeserializer.toString();
    }
    
    @Test
    public void testToString14() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:219)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString15() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:221)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asPropertyTypeDeserializer.toString();
    }
    
    @Test
    public void testToString16() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asPropertyTypeDeserializer.toString();
    }
    
    @Test
    public void testToString17() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase.buildCanonicalName(TypeBase.java:76)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:70)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asWrapperTypeDeserializer.toString();
    }
    
    @Test
    public void testToString18() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:219)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:70)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString19() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:166)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:70)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString20() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        String _canonicalName = "";
        setField(_referencedType, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName", _canonicalName);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:161)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asArrayTypeDeserializer.toString();
    }
    
    @Test
    public void testToString21() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        String _canonicalName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_referencedType, "com.fasterxml.jackson.databind.type.TypeBase", "_canonicalName", _canonicalName);
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:219)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:305)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asPropertyTypeDeserializer.toString();
    }
    
    @Test
    public void testToString22() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:214)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:70)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asPropertyTypeDeserializer.toString();
    }
    
    @Test
    public void testToString23() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_baseType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:191)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:70)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.toString(TypeDeserializerBase.java:134) */
        asPropertyTypeDeserializer.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method baseType()
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#baseType()}
 * @utbot.returnsFrom {@code return _baseType;}
 *  */
    @Test
    public void testBaseType_Return_baseType() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _baseType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) asPropertyTypeDeserializer.baseType());
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(_baseType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.jsontype.TypeIdResolver#getDescForKnownTypeIds()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String extraDesc = _idResolver.getDescForKnownTypeIds();
 *  */
    @Test
    public void test_handleUnknownTypeId_ThrowNullPointerException() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:281) */
        asPropertyTypeDeserializer._handleUnknownTypeId(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_handleUnknownTypeId1() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        JavaType actual = asArrayTypeDeserializer._handleUnknownTypeId(impl, string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _handleUnknownTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_handleUnknownTypeId2() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        FieldProperty _property = ((FieldProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.FieldProperty"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.SettableBeanProperty.getName(SettableBeanProperty.java:352)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:289) */
        asExternalTypeDeserializer._handleUnknownTypeId(null, string);
    }
    
    @Test
    public void test_handleUnknownTypeId3() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        BeanProperty.Bogus _property = ((BeanProperty.Bogus) createInstance("com.fasterxml.jackson.databind.BeanProperty$Bogus"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:291) */
        asExternalTypeDeserializer._handleUnknownTypeId(null, string);
    }
    
    @Test
    public void test_handleUnknownTypeId4() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        BeanProperty.Std _property = ((BeanProperty.Std) createInstance("com.fasterxml.jackson.databind.BeanProperty$Std"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.BeanProperty$Std.getName(BeanProperty.java:322)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:289) */
        asExternalTypeDeserializer._handleUnknownTypeId(null, string);
    }
    
    @Test
    public void test_handleUnknownTypeId5() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        MapProperty _property = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        OutOfMemoryError _key = ((OutOfMemoryError) createInstance("java.lang.OutOfMemoryError"));
        setField(_property, "com.fasterxml.jackson.databind.ser.std.MapProperty", "_key", _key);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:291) */
        asWrapperTypeDeserializer._handleUnknownTypeId(null, string);
    }
    
    @Test
    public void test_handleUnknownTypeId6() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        MapProperty _property = ((MapProperty) createInstance("com.fasterxml.jackson.databind.ser.std.MapProperty"));
        String _key = "";
        setField(_property, "com.fasterxml.jackson.databind.ser.std.MapProperty", "_key", _key);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:291) */
        asExternalTypeDeserializer._handleUnknownTypeId(null, string);
    }
    
    @Test
    public void test_handleUnknownTypeId7() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        String string = "";
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        _idToType.put(string, resolvedRecursiveType);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnknownTypeId(DeserializationContext.java:1166)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:291) */
        asArrayTypeDeserializer._handleUnknownTypeId(impl, string);
    }
    
    @Test
    public void test_handleUnknownTypeId8() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        String string = "\u0000";
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        _idToType.put(string, resolvedRecursiveType);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:291) */
        asPropertyTypeDeserializer._handleUnknownTypeId(null, string);
    }
    
    @Test
    public void test_handleUnknownTypeId9() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        AttributePropertyWriter _property = ((AttributePropertyWriter) createInstance("com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter"));
        SerializedString _name = ((SerializedString) createInstance("com.fasterxml.jackson.core.io.SerializedString"));
        setField(_property, "com.fasterxml.jackson.databind.ser.BeanPropertyWriter", "_name", _name);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:291) */
        asPropertyTypeDeserializer._handleUnknownTypeId(null, string);
    }
    
    @Test
    public void test_handleUnknownTypeId10() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 129);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:166)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            java.base/java.util.Formatter$FormatSpecifier.printString(Formatter.java:3056)
            java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:2933)
            java.base/java.util.Formatter.format(Formatter.java:2689)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DeserializationContext.invalidTypeIdException(DeserializationContext.java:1633)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnknownTypeId(DeserializationContext.java:1187)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:291) */
        asWrapperTypeDeserializer._handleUnknownTypeId(impl, string);
    }
    
    @Test
    public void test_handleUnknownTypeId11() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        LinkedHashMap _idToType = new LinkedHashMap();
        String string = "";
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        _idToType.put(string, resolvedRecursiveType);
        _idToType.put(null, null);
        setField(_idResolver, "com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver", "_idToType", _idToType);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.TreeMap.put(TreeMap.java:809)
            java.base/java.util.TreeMap.put(TreeMap.java:534)
            java.base/java.util.TreeSet.add(TreeSet.java:255)
            java.base/java.util.AbstractCollection.addAll(AbstractCollection.java:336)
            java.base/java.util.TreeSet.addAll(TreeSet.java:309)
            java.base/java.util.TreeSet.<init>(TreeSet.java:160)
            com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver.getDescForKnownTypeIds(TypeNameIdResolver.java:141)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleUnknownTypeId(TypeDeserializerBase.java:281) */
        asPropertyTypeDeserializer._handleUnknownTypeId(null, string);
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
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException] */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(null, null);
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
        SimpleType _defaultImpl = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
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
    public void test_deserializeWithNativeTypeId_ThrowIllegalStateException_1() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        SimpleType _defaultImpl = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
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
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = MismatchedInputException.class)
    public void test_deserializeWithNativeTypeId_ThrowMismatchedInputException() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
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
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -127);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = MismatchedInputException.class)
    public void test_deserializeWithNativeTypeId_ThrowMismatchedInputException_1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 128);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link com.fasterxml.jackson.databind.exc.MismatchedInputException} in: return _deserializeWithNativeTypeId(jp, ctxt, jp.getTypeId());
 *  */
    @Test(expected = MismatchedInputException.class)
    public void test_deserializeWithNativeTypeId_ThrowMismatchedInputException_2() throws Exception  {
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
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 128);
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, impl);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test
    public void test_deserializeWithNativeTypeId1() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        ByteArrayLexOrder comparator = ((ByteArrayLexOrder) createInstance("sun.security.util.ByteArrayLexOrder"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Class typeDeserializerBaseClazz = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Class implType = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        Method _deserializeWithNativeTypeIdMethod = typeDeserializerBaseClazz.getDeclaredMethod("_deserializeWithNativeTypeId", parserType, implType);
        _deserializeWithNativeTypeIdMethod.setAccessible(true);
        java.lang.Object[] _deserializeWithNativeTypeIdMethodArguments = new java.lang.Object[2];
        _deserializeWithNativeTypeIdMethodArguments[0] = parser;
        _deserializeWithNativeTypeIdMethodArguments[1] = impl;
        Object actual = _deserializeWithNativeTypeIdMethod.invoke(asPropertyTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        
        assertNull(actual);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId2() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
            Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            Object actual = asWrapperTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
            
            assertNull(actual);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeWithNativeTypeId3() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
            Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            Object actual = asWrapperTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
            
            assertNull(actual);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeWithNativeTypeId4() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
            Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            Comparator comparator = ((Comparator) createInstance("java.time.format.DateTimeTextProvider$1"));
            setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
            setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            Object actual = asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
            
            assertNull(actual);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeWithNativeTypeId5() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
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
            
            Object actual = asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
            
            assertNull(actual);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeWithNativeTypeId6() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        Object actual = asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = StackOverflowError.class)
    public void test_deserializeWithNativeTypeId7() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _defaultImplDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = -2147483647;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId8() throws Throwable  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
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
    
    @Test
    public void test_deserializeWithNativeTypeId9() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:562)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId10() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:344)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:159)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId11() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:277)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:151)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId12() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        PlaceholderForType _defaultImpl = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        ThrowableDeserializer _defaultImplDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:562)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId13() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:562)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId14() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("java.io.ObjectStreamClass$3"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:344)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:159)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId15() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
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
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId16() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        SimpleType _defaultImpl = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:277)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:151)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId17() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        SimpleType _defaultImpl = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:344)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:159)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId18() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        Integer value = 0;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:156)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:260)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId19() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        Class jsonParserDelegateClazz = Class.forName("com.fasterxml.jackson.core.util.JsonParserDelegate");
        Class parserType = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Constructor jsonParserDelegateConstructor = jsonParserDelegateClazz.getDeclaredConstructor(parserType);
        jsonParserDelegateConstructor.setAccessible(true);
        java.lang.Object[] jsonParserDelegateConstructorArguments = new java.lang.Object[1];
        jsonParserDelegateConstructorArguments[0] = parser;
        JsonParserDelegate jsonParserDelegate = ((JsonParserDelegate) jsonParserDelegateConstructor.newInstance(jsonParserDelegateConstructorArguments));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId20() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("java.io.ObjectStreamClass$3"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer.vanillaDeserialize(BeanDeserializer.java:277)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:151)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId21() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        String value = "";
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:156)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:260)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId22() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId23() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        CollectionType _defaultImpl = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        ThrowableDeserializer _defaultImplDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        FilteringParserDelegate delegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId24() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        ArrayType _beanType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.util.Arrays$NaturalOrder");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1116)
            com.fasterxml.jackson.databind.DeserializationContext.handleUnexpectedToken(DeserializationContext.java:1093)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId25() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId26() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
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
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId27() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        String string = "";
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        _deserializers.put(string, beanAsArrayBuilderDeserializer);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
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
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer._deserializeFromNonArray(BeanAsArrayBuilderDeserializer.java:345)
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer.deserialize(BeanAsArrayBuilderDeserializer.java:129)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId28() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ThrowableDeserializer _delegateDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
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
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId29() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        String string = "";
        BeanAsArrayBuilderDeserializer beanAsArrayBuilderDeserializer = ((BeanAsArrayBuilderDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer"));
        _deserializers.put(string, beanAsArrayBuilderDeserializer);
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
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer._deserializeFromNonArray(BeanAsArrayBuilderDeserializer.java:345)
            com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer.deserialize(BeanAsArrayBuilderDeserializer.java:129)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:236) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = IllegalStateException.class)
    public void test_deserializeWithNativeTypeId30() throws Throwable  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _defaultImplDeserializer);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
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
    public void test_deserializeWithNativeTypeId31() throws Throwable  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
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
            _deserializeWithNativeTypeIdMethod.invoke(asPropertyTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId32() throws Throwable  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("sun.security.x509.AVAComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
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
    public void test_deserializeWithNativeTypeId33() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId34() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
            ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
            Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId35() throws Throwable  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
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
            _deserializeWithNativeTypeIdMethod.invoke(asPropertyTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId36() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
            ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
            Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
            Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
            setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
            setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
            setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId37() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ObjectIdValueProperty _property = ((ObjectIdValueProperty) createInstance("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId38() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
            ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
            Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
            TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
            setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
            setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
            setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            
            asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId39() throws Throwable  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
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
            _deserializeWithNativeTypeIdMethod.invoke(asPropertyTypeDeserializer, _deserializeWithNativeTypeIdMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId40() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId41() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId42() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId43() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId44() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId45() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
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
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId46() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId47() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId48() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId49() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
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
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId50() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
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
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId51() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
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
        
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId52() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
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
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId53() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate1 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate1, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asArrayTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId54() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object comparator = createInstance("java.lang.String$CaseInsensitiveComparator");
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
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
    
    ///region OTHER: CHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = MismatchedInputException.class)
    public void test_deserializeWithNativeTypeId55() throws Throwable  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 128);
        
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
    
    @Test(expected = MismatchedInputException.class)
    public void test_deserializeWithNativeTypeId56() throws Throwable  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        Object parser = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Comparator comparator = ((Comparator) createInstance("com.sun.org.apache.xerces.internal.impl.xs.XSConstraints$1"));
        setField(_nativeIds, "java.util.TreeMap", "comparator", comparator);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(parser, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 128);
        
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
    
    @Test(expected = MismatchedInputException.class)
    public void test_deserializeWithNativeTypeId57() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        PlaceholderForType _baseType = ((PlaceholderForType) createInstance("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object delegate = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        Object _segment = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Segment");
        TreeMap _nativeIds = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        Integer key = 0;
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(_nativeIds, "java.util.TreeMap", "root", root);
        setField(_segment, "com.fasterxml.jackson.databind.util.TokenBuffer$Segment", "_nativeIds", _nativeIds);
        setField(delegate, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_segment", _segment);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 128);
        
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate, impl);
    }
    ///endregion
    
    ///region Errors report for _deserializeWithNativeTypeId
    
    public void test_deserializeWithNativeTypeId_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId
    
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
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ResolvedRecursiveType _defaultImpl = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        AsPropertyTypeDeserializer _typeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer", _typeDeserializer);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(null, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId58() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
            MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            
            asExternalTypeDeserializer._deserializeWithNativeTypeId(null, null, null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId59() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(null, impl, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId60() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        NonBlockingJsonParser nonBlockingJsonParser = ((NonBlockingJsonParser) createInstance("com.fasterxml.jackson.core.json.async.NonBlockingJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(nonBlockingJsonParser, impl, null);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_deserializeWithNativeTypeId61() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(null, impl, null);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test(expected = MismatchedInputException.class)
    public void test_deserializeWithNativeTypeId62() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", 128);
        
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(uTF8StreamJsonParser, impl, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _deserializeWithNativeTypeId(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object)
    
    @Test
    public void test_deserializeWithNativeTypeId63() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Integer integer = Integer.MIN_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:156)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:260) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl, integer);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId64() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MinimalClassNameIdResolver _idResolver = ((MinimalClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId(ClassNameIdResolver.java:49)
            com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver._typeFromId(MinimalClassNameIdResolver.java:67)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.typeFromId(ClassNameIdResolver.java:44)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:156)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:260) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, null, string);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId65() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ClassNameIdResolver _idResolver = ((ClassNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        LinkedHashMap _deserializers = new LinkedHashMap();
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver._typeFromId(ClassNameIdResolver.java:49)
            com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver.typeFromId(ClassNameIdResolver.java:44)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:156)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:260) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, null, string);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId66() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.requiresCustomCodec(JsonParserDelegate.java:94)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromNull(BeanDeserializer.java:550)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:182)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId67() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:155)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId68() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:151)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId69() throws Exception  {
        NullifyingDeserializer prevInstance = NullifyingDeserializer.instance;
        try {
            NullifyingDeserializer instance = new NullifyingDeserializer();
            Class nullifyingDeserializerClazz = Class.forName("com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer");
            setStaticField(nullifyingDeserializerClazz, "instance", instance);
            AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
            DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
            
            /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer.deserialize(NullifyingDeserializer.java:40)
                com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
            asArrayTypeDeserializer._deserializeWithNativeTypeId(null, impl, null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    
    @Test
    public void test_deserializeWithNativeTypeId70() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        StringDeserializer stringDeserializer = ((StringDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        _deserializers.put(null, stringDeserializer);
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:156)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:260) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl, string);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId71() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        String string = "";
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        _deserializers.put(string, collectionDeserializer);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        UTF8StreamJsonParser uTF8StreamJsonParser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.createDefaultInstance(CollectionDeserializer.java:255)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:245)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:27)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(uTF8StreamJsonParser, impl, string);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId72() throws Exception  {
        AsArrayTypeDeserializer asArrayTypeDeserializer = ((AsArrayTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asArrayTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(jsonParserSequence, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:149)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asArrayTypeDeserializer._deserializeWithNativeTypeId(jsonParserSequence, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId73() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        LinkedHashMap _deserializers = new LinkedHashMap();
        String string = "";
        CollectionDeserializer collectionDeserializer = ((CollectionDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.CollectionDeserializer"));
        _deserializers.put(string, collectionDeserializer);
        _deserializers.put(string, collectionDeserializer);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_deserializers", _deserializers);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        String string1 = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:239)
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer.deserialize(CollectionDeserializer.java:27)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(null, impl, string1);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId74() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        ThrowableDeserializer _defaultImplDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        ResolvedRecursiveType _beanType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_beanType", _beanType);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId75() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        ThrowableDeserializer _defaultImplDeserializer = ((ThrowableDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(filteringParserDelegate, "com.fasterxml.jackson.core.filter.FilteringParserDelegate", "_currToken", _currToken);
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.filter.FilteringParserDelegate.nextToken(FilteringParserDelegate.java:287)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:217)
            com.fasterxml.jackson.core.util.JsonParserDelegate.nextToken(JsonParserDelegate.java:217)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:155)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asPropertyTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId76() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        MapLikeType _defaultImpl = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        BeanDeserializer _defaultImplDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(filteringParserDelegate);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asExternalTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, impl, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId77() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        FilteringParserDelegate filteringParserDelegate = ((FilteringParserDelegate) createInstance("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.BeanDeserializerBase.handledType(BeanDeserializerBase.java:971)
            com.fasterxml.jackson.databind.deser.BeanDeserializer._deserializeOther(BeanDeserializer.java:198)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:161)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(filteringParserDelegate, null, null);
    }
    
    @Test
    public void test_deserializeWithNativeTypeId78() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ArrayType _defaultImpl = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        StdDelegatingDeserializer _deserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        BeanDeserializer _delegateDeserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        setField(_defaultImplDeserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        JsonParserSequence jsonParserSequence = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate jsonParserDelegate = new JsonParserDelegate(jsonParserSequence);
        JsonParserDelegate jsonParserDelegate1 = new JsonParserDelegate(jsonParserDelegate);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.core.util.JsonParserDelegate.isExpectedStartObjectToken(JsonParserDelegate.java:124)
            com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:149)
            com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer.deserializeWithType(StdDelegatingDeserializer.java:191)
            com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer.deserialize(TypeWrappedDeserializer.java:68)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._deserializeWithNativeTypeId(TypeDeserializerBase.java:262) */
        asWrapperTypeDeserializer._deserializeWithNativeTypeId(jsonParserDelegate1, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleMissingTypeId
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleMissingTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#_handleMissingTypeId(com.fasterxml.jackson.databind.DeserializationContext,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.DeserializationContext#handleMissingTypeId(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.jsontype.TypeIdResolver,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return ctxt.handleMissingTypeId(_baseType, _idResolver, extraDesc);
 *  */
    @Test
    public void test_handleMissingTypeId_ThrowNullPointerException() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleMissingTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleMissingTypeId(TypeDeserializerBase.java:300) */
        asPropertyTypeDeserializer._handleMissingTypeId(null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _handleMissingTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test
    public void test_handleMissingTypeId1() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ReferenceType _baseType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleMissingTypeId] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:166)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:259)
            java.base/java.util.Formatter$FormatSpecifier.printString(Formatter.java:3056)
            java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:2933)
            java.base/java.util.Formatter.format(Formatter.java:2689)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.DeserializationContext.missingTypeIdException(DeserializationContext.java:1643)
            com.fasterxml.jackson.databind.DeserializationContext.handleMissingTypeId(DeserializationContext.java:1218)
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._handleMissingTypeId(TypeDeserializerBase.java:300) */
        asExternalTypeDeserializer._handleMissingTypeId(impl, string);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method _handleMissingTypeId(com.fasterxml.jackson.databind.DeserializationContext, java.lang.String)
    
    @Test(expected = InvalidTypeIdException.class)
    public void test_handleMissingTypeId2() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        TypeNameIdResolver _idResolver = ((TypeNameIdResolver) createInstance("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_idResolver", _idResolver);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        String string = "";
        
        asWrapperTypeDeserializer._handleMissingTypeId(impl, string);
    }
    
    @Test(expected = InvalidTypeIdException.class)
    public void test_handleMissingTypeId3() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializationConfig _config = ((DeserializationConfig) createInstance("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_config", _config);
        
        asWrapperTypeDeserializer._handleMissingTypeId(impl, null);
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
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -127);
        
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
            setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_featureFlags", -255);
            
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
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        ReferenceType _defaultImpl = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        TypeWrappedDeserializer _defaultImplDeserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImplDeserializer", _defaultImplDeserializer);
        
        JavaType javaType = asExternalTypeDeserializer._defaultImpl;
        Class initialAsExternalTypeDeserializer_defaultImpl_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        TypeWrappedDeserializer actual = ((TypeWrappedDeserializer) asExternalTypeDeserializer._findDefaultImplDeserializer(null));
        
        TypeWrappedDeserializer expected = new TypeWrappedDeserializer(null, null);
        
        TypeDeserializer actual_typeDeserializer = ((TypeDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_typeDeserializer"));
        assertNull(actual_typeDeserializer);
        
        JsonDeserializer actual_deserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer"));
        assertNull(actual_deserializer);
        
        JavaType javaType1 = asExternalTypeDeserializer._defaultImpl;
        Class finalAsExternalTypeDeserializer_defaultImpl_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsExternalTypeDeserializer_defaultImpl_class == finalAsExternalTypeDeserializer_defaultImpl_class);
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
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        DOMDeserializer.DocumentDeserializer documentDeserializer = ((DOMDeserializer.DocumentDeserializer) createInstance("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer"));
        _cachedDeserializers.put(_defaultImpl, documentDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        JsonDeserializer initialAsExternalTypeDeserializer_defaultImplDeserializer = asExternalTypeDeserializer._defaultImplDeserializer;
        
        DOMDeserializer.DocumentDeserializer actual = ((DOMDeserializer.DocumentDeserializer) asExternalTypeDeserializer._findDefaultImplDeserializer(impl));
        
        DOMDeserializer.DocumentDeserializer expected = new DOMDeserializer.DocumentDeserializer();
        
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
    public void test_findDefaultImplDeserializer__defaultImplDeserializerEqualsNull_1() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        ValueInjector _property = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
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
    public void test_findDefaultImplDeserializer__defaultImplDeserializerEqualsNull_2() throws Exception  {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = ((AsPropertyTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer"));
        ValueInjector _property = ((ValueInjector) createInstance("com.fasterxml.jackson.databind.deser.impl.ValueInjector"));
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_property", _property);
        CollectionType _defaultImpl = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asPropertyTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _cachedDeserializers = new HashMap();
        StdDelegatingDeserializer stdDelegatingDeserializer = ((StdDelegatingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer"));
        ReferenceType _delegateType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType", _delegateType);
        FailingDeserializer _delegateDeserializer = ((FailingDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.FailingDeserializer"));
        setField(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer", _delegateDeserializer);
        _cachedDeserializers.put(_defaultImpl, stdDelegatingDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_cachedDeserializers", _cachedDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        BeanDeserializerFactory _factory = ((BeanDeserializerFactory) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory"));
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_factory", _factory);
        
        JsonDeserializer initialAsPropertyTypeDeserializer_defaultImplDeserializer = asPropertyTypeDeserializer._defaultImplDeserializer;
        
        StdDelegatingDeserializer actual = ((StdDelegatingDeserializer) asPropertyTypeDeserializer._findDefaultImplDeserializer(impl));
        
        JavaType stdDelegatingDeserializer_delegateType = ((JavaType) getFieldValue(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
        JavaType actual_delegateType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateType"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(stdDelegatingDeserializer_delegateType, actual_delegateType);
        
        JsonDeserializer stdDelegatingDeserializer_delegateDeserializer = ((JsonDeserializer) getFieldValue(stdDelegatingDeserializer, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        JsonDeserializer actual_delegateDeserializer = ((JsonDeserializer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer", "_delegateDeserializer"));
        
        JsonDeserializer finalAsPropertyTypeDeserializer_defaultImplDeserializer = asPropertyTypeDeserializer._defaultImplDeserializer;
        
        assertFalse(initialAsPropertyTypeDeserializer_defaultImplDeserializer == finalAsPropertyTypeDeserializer_defaultImplDeserializer);
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
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDefaultImplDeserializer(TypeDeserializerBase.java:208) */
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
            SimpleType _defaultImpl = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            Class _class = Object.class;
            setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
            
            asExternalTypeDeserializer._findDefaultImplDeserializer(null);
        } finally {
            setStaticField(NullifyingDeserializer.class, "instance", prevInstance);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _findDefaultImplDeserializer(com.fasterxml.jackson.databind.DeserializationContext)
    
    @Test(expected = NullPointerException.class)
    public void test_findDefaultImplDeserializer1() throws Exception  {
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        CollectionType _defaultImpl = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_defaultImpl, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _incompleteDeserializers = new HashMap();
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_incompleteDeserializers", _incompleteDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asExternalTypeDeserializer._findDefaultImplDeserializer(impl);
    }
    
    @Test(expected = NullPointerException.class)
    public void test_findDefaultImplDeserializer2() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        CollectionLikeType _defaultImpl = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_defaultImpl, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        DefaultDeserializationContext.Impl impl = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        DeserializerCache _cache = ((DeserializerCache) createInstance("com.fasterxml.jackson.databind.deser.DeserializerCache"));
        HashMap _incompleteDeserializers = new HashMap();
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        UUIDDeserializer uUIDDeserializer = ((UUIDDeserializer) createInstance("com.fasterxml.jackson.databind.deser.std.UUIDDeserializer"));
        _incompleteDeserializers.put(collectionLikeType, uUIDDeserializer);
        setField(_cache, "com.fasterxml.jackson.databind.deser.DeserializerCache", "_incompleteDeserializers", _incompleteDeserializers);
        setField(impl, "com.fasterxml.jackson.databind.DeserializationContext", "_cache", _cache);
        
        asWrapperTypeDeserializer._findDefaultImplDeserializer(impl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.getDefaultImpl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefaultImpl()
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#getDefaultImpl()}
 * @utbot.returnsFrom {@code return ClassUtil.rawClass(_defaultImpl);}
 *  */
    @Test
    public void testGetDefaultImpl_ReturnClassUtilRawClass() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        
        Class actual = asWrapperTypeDeserializer.getDefaultImpl();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeDeserializerBase}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase#getDefaultImpl()}
 * @utbot.returnsFrom {@code return ClassUtil.rawClass(_defaultImpl);}
 *  */
    @Test
    public void testGetDefaultImpl_ReturnClassUtilRawClass_1() throws Exception  {
        AsWrapperTypeDeserializer asWrapperTypeDeserializer = ((AsWrapperTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        SimpleType _defaultImpl = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(asWrapperTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_defaultImpl", _defaultImpl);
        
        Class actual = asWrapperTypeDeserializer.getDefaultImpl();
        
        assertNull(actual);
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
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:149) */
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
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase._findDeserializer(TypeDeserializerBase.java:156) */
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
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_baseType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        JavaType javaType = asExternalTypeDeserializer._baseType;
        Class initialAsExternalTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = asExternalTypeDeserializer.baseTypeName();
        
        String expected = "java.lang.Object";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = asExternalTypeDeserializer._baseType;
        Class finalAsExternalTypeDeserializer_baseType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialAsExternalTypeDeserializer_baseType_class == finalAsExternalTypeDeserializer_baseType_class);
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
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109) */
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
        AsExternalTypeDeserializer asExternalTypeDeserializer = ((AsExternalTypeDeserializer) createInstance("com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer"));
        SimpleType _baseType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(asExternalTypeDeserializer, "com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", "_baseType", _baseType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase.baseTypeName(TypeDeserializerBase.java:109) */
        asExternalTypeDeserializer.baseTypeName();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1093911957274300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1093911957274300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1093911957279100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1093911957274300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1093911957279100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1093911957648700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1093911957648700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1093911957649600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1093911957648700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1093911957649600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1093911958262000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1093911958262000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1093911958263899 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1093911958262000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1093911958263899).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

