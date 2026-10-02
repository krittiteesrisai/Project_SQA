package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_databind_type_ReferenceTypeTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        boolean actual = referenceType.equals(referenceType);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o.getClass() != getClass()): True}
 *  */
    @Test
    public void testEquals_OGetClassNotEqualsGetClass() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        short[] shortArray = {};
        
        boolean actual = referenceType.equals(shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        boolean actual = referenceType.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = referenceType.toString();
        
        String expected = "[reference type, class java.lang.Object<java.lang.Object<[map-like type; class java.lang.Object, null -> null]>]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    @Test
    public void testToString2() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = referenceType.toString();
        
        String expected = "[reference type, class java.lang.Object<java.lang.Object<[collection-like type; class java.lang.Object, contains null]>]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = StackOverflowError.class)
    public void testToString3() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _referencedType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        referenceType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString4() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _referencedType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        referenceType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString5() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _referencedType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        referenceType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString6() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _referencedType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        referenceType.toString();
    }
    
    @Test
    public void testToString7() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.buildCanonicalName(ArrayType.java:98)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString8() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:179)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString9() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString10() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _referencedType._canonicalName = _canonicalName;
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:173) */
        referenceType.toString();
    }
    
    @Test
    public void testToString11() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        String _canonicalName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        _referencedType._canonicalName = _canonicalName;
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:179)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:263)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:173) */
        referenceType.toString();
    }
    
    @Test
    public void testToString12() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:163)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString13() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString14() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:134)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString15() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionType _keyType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException] */
        referenceType.toString();
    }
    
    @Test
    public void testToString16() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.buildCanonicalName(ArrayType.java:98)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:134)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString17() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:179)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:134)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString18() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _keyType._canonicalName = _canonicalName;
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:136)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString19() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:131)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:134)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString20() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:160)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:134)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString21() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _keyType._canonicalName = _canonicalName;
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException] */
        referenceType.toString();
    }
    
    @Test
    public void testToString22() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.buildCanonicalName(ArrayType.java:98)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:163)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString23() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:179)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:163)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString24() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:131)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:163)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171) */
        referenceType.toString();
    }
    
    @Test
    public void testToString25() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _elementType._canonicalName = _canonicalName;
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionLikeType.toString(CollectionLikeType.java:205)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:173) */
        referenceType.toString();
    }
    
    @Test
    public void testToString26() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _elementType._canonicalName = _canonicalName;
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:171)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:112)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:173) */
        referenceType.toString();
    }
    
    @Test
    public void testToString27() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.toString] produces [java.lang.NullPointerException] */
        referenceType.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGenericSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _classSignature(_class, sb, false);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:134)
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:153) */
        referenceType.getGenericSignature(null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb = _referencedType.getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:155)
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:155) */
        referenceType.getGenericSignature(stringBuilder);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getGenericSignature(java.lang.StringBuilder)
    
    @Test
    public void testGetGenericSignature1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("     ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:199)
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:155) */
        referenceType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature2() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("                             ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:152)
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:155) */
        referenceType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature3() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("                               ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getGenericSignature(ArrayType.java:235)
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:155) */
        referenceType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature4() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("                               ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:104)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:241)
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:155) */
        referenceType.getGenericSignature(stringBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.isReferenceType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isReferenceType()
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#isReferenceType()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsReferenceType_ReturnTrue() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        boolean actual = referenceType.isReferenceType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.construct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method construct(java.lang.Class, com.fasterxml.jackson.databind.JavaType, java.lang.Object, java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#construct(java.lang.Class,com.fasterxml.jackson.databind.JavaType,java.lang.Object,java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(cls, refType, null, null, false);}
 *  */
    @Test
    public void testConstruct_Return() throws Exception  {
        Class class1 = Object.class;
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_hash", -218);
        
        ReferenceType actual = ReferenceType.construct(class1, arrayType, null, null);
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", arrayType);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876793);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.getReferencedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferencedType()
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#getReferencedType()}
 * @utbot.returnsFrom {@code return _referencedType;}
 *  */
    @Test
    public void testGetReferencedType_Return_referencedType() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        JavaType actual = referenceType.getReferencedType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.withTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withTypeHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (h == _typeHandler): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTypeHandler_HEquals_typeHandler() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        ReferenceType actual = referenceType.withTypeHandler(((Object) null));
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withTypeHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (h == _typeHandler): False}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType, _valueHandler, h, _asStatic);}
 *  */
    @Test
    public void testWithTypeHandler_HNotEquals_typeHandler() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withTypeHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithStaticTyping__asStatic() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        ReferenceType actual = referenceType.withStaticTyping();
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method withStaticTyping()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_asStatic): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.databind.JavaType#withStaticTyping()} once
    /// return from: {@code return new ReferenceType(_class, _referencedType.withStaticTyping(), _valueHandler, _typeHandler, true);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withStaticTyping()}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Return_1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withStaticTyping();
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withStaticTyping()}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Return() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withStaticTyping();
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withStaticTyping()}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Return_3() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {null};
        setField(_referencedType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withStaticTyping();
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        java.lang.String[] javaType1_referencedType_typeNames = ((java.lang.String[]) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames"));
        String finalReferenceType_referencedType_typeNames0 = ((String) get(javaType1_referencedType_typeNames, 0));
        JavaType javaType2 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
        
        assertNull(finalReferenceType_referencedType_typeNames0);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withStaticTyping()}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Return_2() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withStaticTyping();
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withStaticTyping()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new ReferenceType(_class, _referencedType.withStaticTyping(), _valueHandler, _typeHandler, true);
 *  */
    @Test
    public void testWithStaticTyping_ThrowNullPointerException() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withStaticTyping()
    
    @Test
    public void testWithStaticTyping1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withStaticTyping();
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withStaticTyping()
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping2() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        referenceType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping3() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _referencedType);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        referenceType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping4() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        ReferenceType _componentType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_componentType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _componentType);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping5() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType2);
        Class _class = Object.class;
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:87)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:22)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping6() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:87)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:22)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping7() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType2);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:87)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:22)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping8() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        SimpleType _componentType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {null, null, null, null, null, null, null, null, null};
        setField(_componentType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.<init>(ArrayType.java:32)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:92)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:12)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping9() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        ReferenceType _componentType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_componentType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType2);
        Class _class = Object.class;
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        Object _emptyArray = createInstance("java.lang.Object");
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:87)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:22)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping10() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        ReferenceType _componentType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_componentType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType2);
        Class _class = Object.class;
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        Object _emptyArray = createInstance("java.lang.Object");
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:87)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:22)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping11() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        SimpleType _componentType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.<init>(ArrayType.java:32)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:92)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:12)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping12() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {null, null, null, null, null, null, null, null, null};
        setField(_referencedType2, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType2);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:87)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:22)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping13() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {};
        setField(_referencedType2, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType2);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:87)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:22)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping14() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        SimpleType _componentType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {};
        setField(_componentType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        Object _emptyArray = createInstance("java.lang.Object");
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:87)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:22)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping15() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType2);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:78)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:39)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:87)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:22)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:74) */
        referenceType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping16() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {null, null, null, null, null, null, null, null, null};
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping] produces [java.lang.NullPointerException] */
        referenceType.withStaticTyping();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.withValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withValueHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (h == _valueHandler): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithValueHandler_HEquals_valueHandler() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        ReferenceType actual = referenceType.withValueHandler(((Object) null));
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withValueHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (h == _valueHandler): False}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType, h, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithValueHandler_HNotEquals_valueHandler() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -195);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withValueHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876816);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildCanonicalName()
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#buildCanonicalName()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#toCanonical()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testBuildCanonicalName_StringBuilderToString() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _referencedType._canonicalName = _canonicalName;
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = referenceType.buildCanonicalName();
        
        String expected = "java.lang.Object<";
        
        assertEquals(expected, actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildCanonicalName()
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#buildCanonicalName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(_class.getName());
 *  */
    @Test
    public void testBuildCanonicalName_ThrowNullPointerException() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82) */
        referenceType.buildCanonicalName();
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#buildCanonicalName()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#toCanonical()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(_referencedType.toCanonical());
 *  */
    @Test
    public void testBuildCanonicalName_ThrowNullPointerException_1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method buildCanonicalName()
    
    @Test
    public void testBuildCanonicalName1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = referenceType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    @Test
    public void testBuildCanonicalName2() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = referenceType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    @Test
    public void testBuildCanonicalName3() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        _elementType._canonicalName = _canonicalName;
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = referenceType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object<\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000>";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    @Test
    public void testBuildCanonicalName4() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        JavaType javaType_referencedType_elementType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class initialReferenceType_referencedType_elementType_class = ((Class) getFieldValue(javaType_referencedType_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = referenceType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object<java.lang.Object>";
        
        assertEquals(expected, actual);
        
        JavaType javaType2 = referenceType._referencedType;
        JavaType javaType2_referencedType_elementType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class finalReferenceType_referencedType_elementType_class = ((Class) getFieldValue(javaType2_referencedType_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_elementType_class == finalReferenceType_referencedType_elementType_class);
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    @Test
    public void testBuildCanonicalName5() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        JavaType javaType_referencedType_elementType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class initialReferenceType_referencedType_elementType_class = ((Class) getFieldValue(javaType_referencedType_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = referenceType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object<java.lang.Object>";
        
        assertEquals(expected, actual);
        
        JavaType javaType2 = referenceType._referencedType;
        JavaType javaType2_referencedType_elementType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class finalReferenceType_referencedType_elementType_class = ((Class) getFieldValue(javaType2_referencedType_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_elementType_class == finalReferenceType_referencedType_elementType_class);
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildCanonicalName()
    
    @Test(expected = StackOverflowError.class)
    public void testBuildCanonicalName6() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _referencedType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        referenceType.buildCanonicalName();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildCanonicalName7() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _referencedType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName8() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.buildCanonicalName(ArrayType.java:98)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName9() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:179)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName10() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName11() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName12() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.buildCanonicalName(ArrayType.java:98)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:134)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName13() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:179)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:134)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName14() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:134)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName15() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _keyType._canonicalName = _canonicalName;
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException] */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName16() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.buildCanonicalName(ArrayType.java:98)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:163)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName17() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:179)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:163)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName18() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:82)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:163)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:47)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:84) */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName19() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException] */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName20() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException] */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName21() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException] */
        referenceType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName22() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName] produces [java.lang.NullPointerException] */
        referenceType.buildCanonicalName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType._narrow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _narrow(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#_narrow(java.lang.Class)}
 * @utbot.returnsFrom {@code return new ReferenceType(subclass, _referencedType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void test_narrow_Return() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class class1 = Object.class;
        
        ReferenceType actual = ((ReferenceType) referenceType._narrow(class1));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.containedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containedType(int)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#containedType(int)}
 * @utbot.executesCondition {@code ((index == 0)): False}
 * @utbot.returnsFrom {@code return (index == 0) ? _referencedType : null;}
 *  */
    @Test
    public void testContainedType_IndexNotEqualsZero() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        JavaType actual = referenceType.containedType(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#containedType(int)}
 * @utbot.executesCondition {@code ((index == 0)): True}
 * @utbot.returnsFrom {@code return (index == 0) ? _referencedType : null;}
 *  */
    @Test
    public void testContainedType_IndexEqualsZero() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        JavaType actual = referenceType.containedType(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.containedTypeCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containedTypeCount()
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#containedTypeCount()}
 * @utbot.returnsFrom {@code return 1;}
 *  */
    @Test
    public void testContainedTypeCount_Return1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        int actual = referenceType.containedTypeCount();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.getErasedSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErasedSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.ReferenceType#_classSignature(java.lang.Class,java.lang.StringBuilder,boolean)}
 * @utbot.returnsFrom {@code return _classSignature(_class, sb, true);}
 *  */
    @Test
    public void testGetErasedSignature_ReferenceType_classSignature() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        StringBuilder actual = referenceType.getErasedSignature(stringBuilder);
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        byte[] value = new byte[34];
        value[0] = (byte) 76;
        value[1] = (byte) 106;
        value[2] = (byte) 97;
        value[3] = (byte) 118;
        value[4] = (byte) 97;
        value[5] = (byte) 47;
        value[6] = (byte) 108;
        value[7] = (byte) 97;
        value[8] = (byte) 110;
        value[9] = (byte) 103;
        value[10] = (byte) 47;
        value[11] = (byte) 79;
        value[12] = (byte) 98;
        value[13] = (byte) 106;
        value[14] = (byte) 101;
        value[15] = (byte) 99;
        value[16] = (byte) 116;
        value[17] = (byte) 59;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 18);
        
        byte[] expectedValue = ((byte[]) getFieldValue(expected, "java.lang.AbstractStringBuilder", "value"));
        byte[] actualValue = ((byte[]) getFieldValue(actual, "java.lang.AbstractStringBuilder", "value"));
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue);
        
        byte expectedCoder = ((Byte) getFieldValue(expected, "java.lang.AbstractStringBuilder", "coder"));
        byte actualCoder = ((Byte) getFieldValue(actual, "java.lang.AbstractStringBuilder", "coder"));
        assertEquals(expectedCoder, actualCoder);
        
        int expectedCount = ((Integer) getFieldValue(expected, "java.lang.AbstractStringBuilder", "count"));
        int actualCount = ((Integer) getFieldValue(actual, "java.lang.AbstractStringBuilder", "count"));
        assertEquals(expectedCount, actualCount);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getErasedSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.ReferenceType#_classSignature(java.lang.Class,java.lang.StringBuilder,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _classSignature(_class, sb, true);
 *  */
    @Test
    public void testGetErasedSignature_ThrowNullPointerException() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:134)
            com.fasterxml.jackson.databind.type.ReferenceType.getErasedSignature(ReferenceType.java:147) */
        referenceType.getErasedSignature(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.getParameterSource
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParameterSource()
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#getParameterSource()}
 * @utbot.returnsFrom {@code return _class;}
 *  */
    @Test
    public void testGetParameterSource_Return_class() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        Class actual = referenceType.getParameterSource();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.containedTypeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containedTypeName(int)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#containedTypeName(int)}
 * @utbot.executesCondition {@code ((index == 0)): False}
 * @utbot.returnsFrom {@code return (index == 0) ? "T" : null;}
 *  */
    @Test
    public void testContainedTypeName_IndexNotEqualsZero() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        String actual = referenceType.containedTypeName(-255);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#containedTypeName(int)}
 * @utbot.executesCondition {@code ((index == 0)): True}
 * @utbot.returnsFrom {@code return (index == 0) ? "T" : null;}
 *  */
    @Test
    public void testContainedTypeName_IndexEqualsZero() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        String actual = referenceType.containedTypeName(0);
        
        String expected = "T";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.withContentTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithContentTypeHandler_Return() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        ReferenceType actual = referenceType.withContentTypeHandler(((Object) null));
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_2() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {null};
        setField(_referencedType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        int[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _typeHandler1 = {};
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler1);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentTypeHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler1);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        java.lang.String[] javaType1_referencedType_typeNames = ((java.lang.String[]) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames"));
        String finalReferenceType_referencedType_typeNames0 = ((String) get(javaType1_referencedType_typeNames, 0));
        JavaType javaType2 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
        
        assertNull(finalReferenceType_referencedType_typeNames0);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _valueHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        int[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentTypeHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_6() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentTypeHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionType _referencedType1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_3() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentTypeHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_7() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentTypeHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_4() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _valueHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        byte[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentTypeHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(_referencedType2, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType2);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_5() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        ArrayType _componentType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        Object _emptyArray = createInstance("java.lang.Object");
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        byte[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentTypeHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentTypeHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getTypeHandler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: h == _referencedType.<Object>getTypeHandler()
 *  */
    @Test
    public void testWithContentTypeHandler_ThrowNullPointerException() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withContentTypeHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.withContentTypeHandler(ReferenceType.java:45) */
        referenceType.withContentTypeHandler(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.ReferenceType.withContentValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithContentValueHandler_Return() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        
        ReferenceType actual = referenceType.withContentValueHandler(((Object) null));
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(referenceType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_2() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {null};
        setField(_referencedType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        int[] _valueHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _typeHandler = {};
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentValueHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        java.lang.String[] javaType1_referencedType_typeNames = ((java.lang.String[]) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames"));
        String finalReferenceType_referencedType_typeNames0 = ((String) get(javaType1_referencedType_typeNames, 0));
        JavaType javaType2 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
        
        assertNull(finalReferenceType_referencedType_typeNames0);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_3() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        int[] _valueHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        byte[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentValueHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        int[][] _valueHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentValueHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_6() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        short[] _valueHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        byte[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentValueHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionType _referencedType1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_7() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        short[] _valueHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        short[] _typeHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentValueHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_5() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        ArrayType _componentType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        Object _emptyArray = createInstance("java.lang.Object");
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        byte[] _valueHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentValueHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_referencedType1, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new ReferenceType(_class, _referencedType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_4() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_referencedType1, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_referencedType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _valueHandler = {};
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(referenceType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = referenceType._referencedType;
        Class initialReferenceType_referencedType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        ReferenceType actual = referenceType.withContentValueHandler(((Object) null));
        
        ReferenceType expected = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType1);
        setField(_referencedType2, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_referencedType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(expected, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType2);
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParametersFor", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        // com.fasterxml.jackson.databind.type.ReferenceType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = referenceType._referencedType;
        Class finalReferenceType_referencedType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalReferenceType_class = ((Class) getFieldValue(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialReferenceType_referencedType_class == finalReferenceType_referencedType_class);
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ReferenceType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.ReferenceType#withContentValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getValueHandler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: h == _referencedType.<Object>getValueHandler()
 *  */
    @Test
    public void testWithContentValueHandler_ThrowNullPointerException() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.ReferenceType.withContentValueHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.withContentValueHandler(ReferenceType.java:62) */
        referenceType.withContentValueHandler(((Object) null));
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1075047122244400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1075047122244400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1075047122249699 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1075047122244400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1075047122249699).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1075047124024699 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1075047124024699.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1075047124026600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1075047124024699.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1075047124026600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

