package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_type_CollectionTypeTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return "[collection type; class " + _class.getName() + ", contains " + _elementType + "]";}
 *  */
    @Test
    public void testToString_StringBuilderToString() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionType.toString();
        
        String expected = "[collection type; class java.lang.Object, contains null]";
        
        assertEquals(expected, actual);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return "[collection type; class " + _class.getName() + ", contains " + _elementType + "]";
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionType.toString();
        
        String expected = "[collection type; class java.lang.Object, contains [array type, component type: null]]";
        
        assertEquals(expected, actual);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testToString2() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionType.toString();
        
        String expected = "[collection type; class java.lang.Object, contains [map type; class java.lang.Object, [array type, component type: null] -> null]]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testToString3() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionType.toString();
        
        String expected = "[collection type; class java.lang.Object, contains [map-like type; class java.lang.Object, [array type, component type: null] -> null]]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testToString4() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionType.toString();
        
        String expected = "[collection type; class java.lang.Object, contains [map type; class java.lang.Object, null -> null]]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testToString5() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionType.toString();
        
        String expected = "[collection type; class java.lang.Object, contains [map-like type; class java.lang.Object, null -> null]]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testToString6() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        JavaType javaType_elementType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class initialCollectionType_elementType_referencedType_class = ((Class) getFieldValue(javaType_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionType.toString();
        
        String expected = "[collection type; class java.lang.Object, contains [reference type, class java.lang.Object<java.lang.Object<[map-like type; class java.lang.Object, null -> null]>]]";
        
        assertEquals(expected, actual);
        
        JavaType javaType2 = collectionType._elementType;
        JavaType javaType2_elementType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class finalCollectionType_elementType_referencedType_class = ((Class) getFieldValue(javaType2_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_referencedType_class == finalCollectionType_elementType_referencedType_class);
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testToString7() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        JavaType javaType_elementType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class initialCollectionType_elementType_referencedType_class = ((Class) getFieldValue(javaType_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionType.toString();
        
        String expected = "[collection type; class java.lang.Object, contains [reference type, class java.lang.Object<java.lang.Object<[collection-like type; class java.lang.Object, contains null]>]]";
        
        assertEquals(expected, actual);
        
        JavaType javaType2 = collectionType._elementType;
        JavaType javaType2_elementType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
        Class finalCollectionType_elementType_referencedType_class = ((Class) getFieldValue(javaType2_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_referencedType_class == finalCollectionType_elementType_referencedType_class);
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = StackOverflowError.class)
    public void testToString8() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _elementType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        collectionType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString9() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _elementType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        collectionType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString10() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _elementType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        collectionType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString11() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _elementType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        collectionType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString12() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _elementType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        collectionType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString13() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _elementType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        collectionType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString14() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _elementType);
        String _canonicalName = "";
        _elementType._canonicalName = _canonicalName;
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        collectionType.toString();
    }
    
    @Test
    public void testToString15() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:145)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:212)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString16() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:191)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:262)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString17() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:191)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:262)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString18() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:143)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:212)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString19() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException] */
        collectionType.toString();
    }
    
    @Test
    public void testToString20() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:191)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:262)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString21() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:143)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:212)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString22() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString23() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:153)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString24() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        String _canonicalName = "\u0000\u0000\u0000";
        _referencedType._canonicalName = _canonicalName;
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:261)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:214)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString25() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ResolvedRecursiveType _referencedType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase.buildCanonicalName(TypeBase.java:74)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:145)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:212)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString26() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:191)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:145)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:212)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString27() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:196)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:145)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:212)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString28() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:167)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:145)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:212)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    
    @Test
    public void testToString29() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        String _canonicalName = "";
        _referencedType._canonicalName = _canonicalName;
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.ReferenceType.toString(ReferenceType.java:214)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionType.toString(CollectionType.java:126) */
        collectionType.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType.construct
    
    ///region OTHER: ERROR SUITE for method construct(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testConstruct1() {
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.construct] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(CollectionLikeType.java:35)
            com.fasterxml.jackson.databind.type.CollectionType.<init>(CollectionType.java:24)
            com.fasterxml.jackson.databind.type.CollectionType.construct(CollectionType.java:52) */
        CollectionType.construct(class1, ((JavaType) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType.construct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method construct(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#construct(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[],com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return new CollectionType(rawType, bindings, superClass, superInts, elemT, null, null, false);}
 *  */
    @Test
    public void testConstruct_Return() throws Exception  {
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -224);
        
        CollectionType actual = CollectionType.construct(class1, typeBindings, ((JavaType) null), ((com.fasterxml.jackson.databind.JavaType[]) null), ((JavaType) mapType));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", mapType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876787);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#construct(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[],com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return new CollectionType(rawType, bindings, superClass, superInts, elemT, null, null, false);}
 *  */
    @Test
    public void testConstruct_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            Class class1 = Object.class;
            MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
            
            CollectionType actual = CollectionType.construct(class1, ((TypeBindings) null), ((JavaType) null), ((com.fasterxml.jackson.databind.JavaType[]) null), ((JavaType) mapType));
            
            CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", mapType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876757);
            
            JavaType expected_elementType = expected._elementType;
            JavaType actual_elementType = actual._elementType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType.withContentTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_5() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentTypeHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_3() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentTypeHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_6() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentTypeHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_7() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentTypeHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_8() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        MapType _componentType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        byte[] _emptyArray = {};
        setField(_elementType, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _emptyArray);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentTypeHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class1 = byte[].class;
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class1);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 2375);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _emptyArray);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063879386);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_4() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentTypeHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_2() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentTypeHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _elementType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 134217728);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentTypeHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1198094739);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", -2032995546);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = collectionType._elementType;
            Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionType actual = collectionType.withContentTypeHandler(((Object) null));
            
            CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            
            JavaType expected_elementType = expected._elementType;
            JavaType actual_elementType = actual._elementType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType1 = collectionType._elementType;
            Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
            
            assertFalse(initialCollectionType_class == finalCollectionType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentTypeHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withTypeHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithContentTypeHandler_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withContentTypeHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.withContentTypeHandler(CollectionType.java:82) */
        collectionType.withContentTypeHandler(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType.withContentValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_5() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentValueHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_6() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        byte[] _typeHandler = {};
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentValueHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_3() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentValueHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_7() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentValueHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_8() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        MapType _componentType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        byte[] _emptyArray = {};
        setField(_elementType, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentValueHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ArrayType", "_emptyArray", _emptyArray);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class1 = byte[].class;
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class1);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 2375);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063879386);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_4() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentValueHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_2() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentValueHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _elementType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 134217728);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        int[] _valueHandler = {};
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        short[] _typeHandler = {};
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withContentValueHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1198094739);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", -2032995546);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object expected_valueHandler = getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        int expected_valueHandlerSize = getArrayLength(expected_valueHandler);
        assertEquals(expected_valueHandlerSize, getArrayLength(actual_valueHandler));
        assertArrayEquals(((int[]) expected_valueHandler), ((int[]) actual_valueHandler));
        
        Object expected_typeHandler = getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        int expected_typeHandlerSize = getArrayLength(expected_typeHandler);
        assertEquals(expected_typeHandlerSize, getArrayLength(actual_typeHandler));
        org.junit.Assert.assertArrayEquals(((short[]) expected_typeHandler), ((short[]) actual_typeHandler));
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = collectionType._elementType;
            Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionType actual = collectionType.withContentValueHandler(((Object) null));
            
            CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            
            JavaType expected_elementType = expected._elementType;
            JavaType actual_elementType = actual._elementType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType javaType1 = collectionType._elementType;
            Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
            
            assertFalse(initialCollectionType_class == finalCollectionType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withValueHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithContentValueHandler_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withContentValueHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.withContentValueHandler(CollectionType.java:95) */
        collectionType.withContentValueHandler(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType._narrow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _narrow(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#_narrow(java.lang.Class)}
 * @utbot.returnsFrom {@code return new CollectionType(subclass, _bindings, _superClass, _superInterfaces, _elementType, null, null, _asStatic);}
 *  */
    @Test
    public void test_narrow_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class class1 = Object.class;
        
        CollectionType actual = ((CollectionType) collectionType._narrow(class1));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876757);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#_narrow(java.lang.Class)}
 * @utbot.returnsFrom {@code return new CollectionType(subclass, _bindings, _superClass, _superInterfaces, _elementType, null, null, _asStatic);}
 *  */
    @Test
    public void test_narrow_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            Class class1 = Object.class;
            
            CollectionType actual = ((CollectionType) collectionType._narrow(class1));
            
            CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876757);
            
            JavaType expected_elementType = expected._elementType;
            JavaType actual_elementType = actual._elementType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithStaticTyping__asStatic() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        CollectionType actual = collectionType.withStaticTyping();
        
        JavaType actual_elementType = actual._elementType;
        assertNull(actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings actual_bindings = actual._bindings;
        assertNull(actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertNull(actual_class);
        
        int collectionType_hash = ((Integer) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(collectionType_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Not_asStatic() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withStaticTyping();
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Not_asStatic_2() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withStaticTyping();
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Not_asStatic_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            Class _class = Object.class;
            setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionType actual = collectionType.withStaticTyping();
            
            CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            
            JavaType expected_elementType = expected._elementType;
            JavaType actual_elementType = actual._elementType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertTrue(actual_asStatic);
            
            Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionType_class == finalCollectionType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withStaticTyping()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithStaticTyping_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withStaticTyping()
    
    @Test
    public void testWithStaticTyping1() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withStaticTyping();
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testWithStaticTyping2() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withStaticTyping();
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testWithStaticTyping3() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withStaticTyping();
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testWithStaticTyping4() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withStaticTyping();
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testWithStaticTyping5() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withStaticTyping();
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    @Test
    public void testWithStaticTyping6() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 1048576);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null};
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        int[] _valueHandler = {};
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        CollectionType _superClass = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionType._elementType;
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withStaticTyping();
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1064925587);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2128802598);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType expected_superClass = expected._superClass;
        JavaType actual_superClass = actual._superClass;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_superClass, actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertTrue(actual_asStatic);
        
        JavaType javaType1 = collectionType._elementType;
        com.fasterxml.jackson.databind.JavaType[] javaType1_elementType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalCollectionType_elementType_superInterfaces0 = ((JavaType) get(javaType1_elementType_superInterfaces, 0));
        JavaType javaType2 = collectionType._elementType;
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
        
        assertNull(finalCollectionType_elementType_superInterfaces0);
    }
    
    @Test
    public void testWithStaticTyping7() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _class);
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            ResolvedRecursiveType _superClass = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
            setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = collectionType._elementType;
            Class initialCollectionType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = collectionType._elementType;
            Object initialCollectionType_elementType_typeHandler = getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionType actual = collectionType.withStaticTyping();
            
            CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names1 = {};
            setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names1);
            com.fasterxml.jackson.databind.JavaType[] _types1 = {};
            setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types1);
            setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            
            JavaType expected_elementType = expected._elementType;
            JavaType actual_elementType = actual._elementType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            JavaType expected_superClass = expected._superClass;
            JavaType actual_superClass = actual._superClass;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_superClass, actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertTrue(actual_asStatic);
            
            JavaType javaType2 = collectionType._elementType;
            Class finalCollectionType_elementType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType3 = collectionType._elementType;
            Object finalCollectionType_elementType_typeHandler = getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
            
            assertFalse(initialCollectionType_elementType_typeHandler == finalCollectionType_elementType_typeHandler);
            
            assertFalse(initialCollectionType_class == finalCollectionType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withStaticTyping()
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping8() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _elementType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping9() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping10() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping11() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping12() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping13() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping14() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping15() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping16() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping17() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _elementType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping18() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping19() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _valueType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping20() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping21() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:99)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:12)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping22() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:55)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:176)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:13)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping23() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:127)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping24() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            MapLikeType _superClass = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            Class _class = Object.class;
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            MapType _superClass1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass1);
            com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
            setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            
            /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
                com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
                com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(CollectionLikeType.java:34)
                com.fasterxml.jackson.databind.type.CollectionType.<init>(CollectionType.java:24)
                com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
            collectionType.withStaticTyping();
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    @Test
    public void testWithStaticTyping25() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(CollectionLikeType.java:34)
            com.fasterxml.jackson.databind.type.CollectionType.<init>(CollectionType.java:24)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping26() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ArrayType _valueType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:99)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:12)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping27() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:127)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping28() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:22)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping29() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null};
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping30() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping31() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:99)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:12)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping32() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:55)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:176)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:13)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping33() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _valueHandler = {};
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        byte[] _typeHandler = {};
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        SimpleType _valueType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null};
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces1 = {null};
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces1);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces2 = {null};
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:55)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:176)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping34() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping35() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        short[] _valueHandler = {};
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null};
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        SimpleType _superClass = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces1 = {null};
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces1);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        CollectionType _superClass1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass1);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces2 = {null, null};
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces2);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping36() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping37() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:22)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping38() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:22)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping39() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType2 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:99)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:12)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping40() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:55)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:176)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping41() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:127)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping42() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:68)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:23)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:127)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping43() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ArrayType _referencedType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:99)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:12)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:127)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping44() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        SimpleType _referencedType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:55)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:176)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:13)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:127)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping45() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping46() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        byte[] _valueHandler = {};
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        byte[] _typeHandler = {};
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping47() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ArrayType _valueType2 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:99)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:12)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping48() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        SimpleType _valueType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:55)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:176)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping49() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ArrayType _keyType2 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:99)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:12)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping50() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:55)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:176)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping51() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:55)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:176)
            com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping(SimpleType.java:13)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping52() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:99)
            com.fasterxml.jackson.databind.type.ArrayType.withStaticTyping(ArrayType.java:12)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping53() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:127)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping54() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:127)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping55() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _valueType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:127)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping56() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:93)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:9)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.CollectionType.withStaticTyping(CollectionType.java:105) */
        collectionType.withStaticTyping();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType.withContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_elementType == contentType): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithContentType__elementTypeEqualsContentType() {
        CollectionType collectionType = new CollectionType(null, null);
        
        CollectionType actual = ((CollectionType) collectionType.withContentType(null));
        
        JavaType actual_elementType = actual._elementType;
        assertNull(actual_elementType);
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_elementType == contentType): False}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, contentType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentType__elementTypeNotEqualsContentType() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = ((CollectionType) collectionType.withContentType(mapLikeType));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", mapLikeType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876757);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_elementType == contentType): False}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, contentType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentType__elementTypeNotEqualsContentType_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null};
            setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            Class _class = Object.class;
            setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
            
            Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionType actual = ((CollectionType) collectionType.withContentType(mapLikeType));
            
            CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", mapLikeType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876757);
            
            JavaType expected_elementType = expected._elementType;
            JavaType actual_elementType = actual._elementType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] expected_superInterfaces = expected._superInterfaces;
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            int expected_superInterfacesSize = expected_superInterfaces.length;
            assertEquals(expected_superInterfacesSize, actual_superInterfaces.length);
            assertTrue(deepEquals(expected_superInterfaces, actual_superInterfaces));
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            JavaType finalCollectionType_superInterfaces0 = collectionType._superInterfaces[0];
            Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionType_class == finalCollectionType_class);
            
            assertNull(finalCollectionType_superInterfaces0);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType.refine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method refine(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#refine(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return new CollectionType(rawType, bindings, superClass, superInterfaces, _elementType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testRefine_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        CollectionType actual = ((CollectionType) collectionType.refine(class1, typeBindings, null, null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#refine(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return new CollectionType(rawType, bindings, superClass, superInterfaces, _elementType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testRefine_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            Class class1 = Object.class;
            
            CollectionType actual = ((CollectionType) collectionType.refine(class1, null, null, null));
            
            CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
            
            JavaType expected_elementType = expected._elementType;
            JavaType actual_elementType = actual._elementType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType.withTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, h, _asStatic);}
 *  */
    @Test
    public void testWithTypeHandler_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withTypeHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, h, _asStatic);}
 *  */
    @Test
    public void testWithTypeHandler_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -192);
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            Class _class = Object.class;
            setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionType actual = collectionType.withTypeHandler(((Object) null));
            
            CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876819);
            
            JavaType expected_elementType = expected._elementType;
            JavaType actual_elementType = actual._elementType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionType_class == finalCollectionType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionType.withValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType, h, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithValueHandler_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionType actual = collectionType.withValueHandler(((Object) null));
        
        CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
        
        JavaType expected_elementType = expected._elementType;
        JavaType actual_elementType = actual._elementType;
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_elementType, actual_elementType);
        
        JavaType actual_superClass = actual._superClass;
        assertNull(actual_superClass);
        
        com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
        assertNull(actual_superInterfaces);
        
        TypeBindings expected_bindings = expected._bindings;
        TypeBindings actual_bindings = actual._bindings;
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected_bindings, actual_bindings);
        
        String actual_canonicalName = actual._canonicalName;
        assertNull(actual_canonicalName);
        
        Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
        assertEquals(Class.class, actual_class.getClass());
        
        int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(expected_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
        Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionType(_class, _bindings, _superClass, _superInterfaces, _elementType, h, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithValueHandler_Return_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        TypeBindings prevEMPTY = ((TypeBindings) getStaticFieldValue(typeBindingsClazz, "EMPTY"));
        Class typeBaseClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        TypeBindings prevNO_BINDINGS = ((TypeBindings) getStaticFieldValue(typeBaseClazz, "NO_BINDINGS"));
        try {
            TypeBindings empty = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            com.fasterxml.jackson.databind.JavaType[] _types = {};
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            setField(empty, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            setStaticField(typeBindingsClazz, "EMPTY", empty);
            setStaticField(typeBaseClazz, "NO_BINDINGS", empty);
            CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -192);
            setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            Class _class = Object.class;
            setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionType actual = collectionType.withValueHandler(((Object) null));
            
            CollectionType expected = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876819);
            
            JavaType expected_elementType = expected._elementType;
            JavaType actual_elementType = actual._elementType;
            // com.fasterxml.jackson.databind.JavaType has overridden equals method
            assertEquals(expected_elementType, actual_elementType);
            
            JavaType actual_superClass = actual._superClass;
            assertNull(actual_superClass);
            
            com.fasterxml.jackson.databind.JavaType[] actual_superInterfaces = actual._superInterfaces;
            assertNull(actual_superInterfaces);
            
            TypeBindings expected_bindings = expected._bindings;
            TypeBindings actual_bindings = actual._bindings;
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected_bindings, actual_bindings);
            
            String actual_canonicalName = actual._canonicalName;
            assertNull(actual_canonicalName);
            
            Class expected_class = ((Class) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class actual_class = ((Class) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_class"));
            assertEquals(Class.class, actual_class.getClass());
            
            int expected_hash = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
            assertEquals(expected_hash, actual_hash);
            
            Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            assertNull(actual_valueHandler);
            
            Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            assertNull(actual_typeHandler);
            
            boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
            assertFalse(actual_asStatic);
            
            Class finalCollectionType_class = ((Class) getFieldValue(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionType_class == finalCollectionType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1072421699082400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1072421699082400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1072421699087400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072421699082400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072421699087400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1072421699448000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1072421699448000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1072421699450500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072421699448000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072421699450500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1072421699665200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1072421699665200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1072421699667900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072421699665200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072421699667900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1072421699854099 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1072421699854099.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1072421699854499 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072421699854099.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072421699854499).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static int getArrayLength(Object arr) {
        return java.lang.reflect.Array.getLength(arr);
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

