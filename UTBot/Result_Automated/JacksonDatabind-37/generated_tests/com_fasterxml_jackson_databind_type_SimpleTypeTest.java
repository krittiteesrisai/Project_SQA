package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_type_SimpleTypeTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o.getClass() != getClass()): True}
 *  */
    @Test
    public void testEquals_OGetClassNotEqualsGetClass() {
        SimpleType simpleType = new SimpleType(((TypeBase) null));
        int[] intArray = {};
        
        boolean actual = simpleType.equals(intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() {
        SimpleType simpleType = new SimpleType(((TypeBase) null));
        
        boolean actual = simpleType.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() {
        SimpleType simpleType = new SimpleType(((TypeBase) null));
        
        boolean actual = simpleType.equals(simpleType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = simpleType.toString();
        
        String expected = "[simple type, class java.lang.Object]";
        
        assertEquals(expected, actual);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    @Test
    public void testToString2() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        TypeBindings typeBindings = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings_bindings_types_bindings_types0 = ((JavaType) get(typeBindings_bindings_types, 0));
        Class initialSimpleType_bindings_types0_class = ((Class) getFieldValue(typeBindings_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = simpleType.toString();
        
        String expected = "[simple type, class java.lang.Object<java.lang.Object>]";
        
        assertEquals(expected, actual);
        
        TypeBindings typeBindings1 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings1_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings1_bindings_types_bindings_types0 = ((JavaType) get(typeBindings1_bindings_types, 0));
        Class finalSimpleType_bindings_types0_class = ((Class) getFieldValue(typeBindings1_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_bindings_types0_class == finalSimpleType_bindings_types0_class);
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    @Test
    public void testToString3() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        TypeBindings typeBindings = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings_bindings_types_bindings_types0 = ((JavaType) get(typeBindings_bindings_types, 0));
        Class initialSimpleType_bindings_types0_class = ((Class) getFieldValue(typeBindings_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = simpleType.toString();
        
        String expected = "[simple type, class java.lang.Object<java.lang.Object>]";
        
        assertEquals(expected, actual);
        
        TypeBindings typeBindings1 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings1_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings1_bindings_types_bindings_types0 = ((JavaType) get(typeBindings1_bindings_types, 0));
        Class finalSimpleType_bindings_types0_class = ((Class) getFieldValue(typeBindings1_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_bindings_types0_class == finalSimpleType_bindings_types0_class);
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    @Test
    public void testToString4() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        String _canonicalName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        resolvedRecursiveType._canonicalName = _canonicalName;
        _types[0] = ((JavaType) resolvedRecursiveType);
        _types[1] = ((JavaType) resolvedRecursiveType);
        _types[2] = ((JavaType) resolvedRecursiveType);
        _types[3] = ((JavaType) resolvedRecursiveType);
        _types[4] = ((JavaType) resolvedRecursiveType);
        _types[5] = ((JavaType) resolvedRecursiveType);
        _types[6] = ((JavaType) resolvedRecursiveType);
        _types[7] = ((JavaType) resolvedRecursiveType);
        _types[8] = ((JavaType) resolvedRecursiveType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = simpleType.toString();
        
        String expected = "[simple type, class java.lang.Object<\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000>]";
        
        assertEquals(expected, actual);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test(expected = StackOverflowError.class)
    public void testToString5() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        _types[1] = ((JavaType) simpleType);
        _types[2] = ((JavaType) simpleType);
        _types[3] = ((JavaType) simpleType);
        _types[4] = ((JavaType) simpleType);
        _types[5] = ((JavaType) simpleType);
        _types[6] = ((JavaType) simpleType);
        _types[7] = ((JavaType) simpleType);
        _types[8] = ((JavaType) simpleType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        simpleType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString6() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionLikeType);
        _types[1] = ((JavaType) simpleType);
        _types[2] = ((JavaType) simpleType);
        _types[3] = ((JavaType) simpleType);
        _types[4] = ((JavaType) simpleType);
        _types[5] = ((JavaType) simpleType);
        _types[6] = ((JavaType) simpleType);
        _types[7] = ((JavaType) simpleType);
        _types[8] = ((JavaType) simpleType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        simpleType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString7() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", collectionType);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        simpleType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString8() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", mapType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        simpleType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString9() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        _types[1] = ((JavaType) simpleType);
        _types[2] = ((JavaType) simpleType);
        _types[3] = ((JavaType) simpleType);
        _types[4] = ((JavaType) simpleType);
        _types[5] = ((JavaType) simpleType);
        _types[6] = ((JavaType) simpleType);
        _types[7] = ((JavaType) simpleType);
        _types[8] = ((JavaType) simpleType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        simpleType.toString();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testToString10() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        String _canonicalName = "\u0000\u0000\u0000";
        _elementType._canonicalName = _canonicalName;
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionType);
        _types[1] = ((JavaType) simpleType);
        _types[2] = ((JavaType) simpleType);
        _types[3] = ((JavaType) simpleType);
        _types[4] = ((JavaType) simpleType);
        _types[5] = ((JavaType) simpleType);
        _types[6] = ((JavaType) simpleType);
        _types[7] = ((JavaType) simpleType);
        _types[8] = ((JavaType) simpleType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        simpleType.toString();
    }
    
    @Test
    public void testToString11() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        _types[0] = ((JavaType) resolvedRecursiveType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase.buildCanonicalName(TypeBase.java:75)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:247) */
        simpleType.toString();
    }
    
    @Test
    public void testToString12() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        SimpleType simpleType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        _types[0] = ((JavaType) simpleType1);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:189)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:247) */
        simpleType.toString();
    }
    
    @Test
    public void testToString13() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        _types[0] = ((JavaType) referenceType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:143)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:247) */
        simpleType.toString();
    }
    
    @Test
    public void testToString14() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:247) */
        simpleType.toString();
    }
    
    @Test
    public void testToString15() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        CollectionType _keyType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:186)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:151)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:247) */
        simpleType.toString();
    }
    
    @Test
    public void testToString16() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        String _canonicalName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        _keyType._canonicalName = _canonicalName;
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:153)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:247) */
        simpleType.toString();
    }
    
    @Test
    public void testToString17() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:148)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:151)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:247) */
        simpleType.toString();
    }
    
    @Test
    public void testToString18() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.toString] produces [java.lang.NullPointerException] */
        simpleType.toString();
    }
    
    @Test
    public void testToString19() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) referenceType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:145)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199)
            com.fasterxml.jackson.databind.type.SimpleType.toString(SimpleType.java:247) */
        simpleType.toString();
    }
    
    @Test
    public void testToString20() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionType _elementType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.toString] produces [java.lang.NullPointerException] */
        simpleType.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGenericSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.SimpleType#_classSignature(java.lang.Class,java.lang.StringBuilder,boolean)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#size()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.returnsFrom {@code return sb;}
 *  */
    @Test
    public void testGetGenericSignature_StringBuilderAppend() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        StringBuilder actual = simpleType.getGenericSignature(stringBuilder);
        
        StringBuilder expected = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        byte[] value = new byte[58];
        value[12] = (byte) 76;
        value[13] = (byte) 106;
        value[14] = (byte) 97;
        value[15] = (byte) 118;
        value[16] = (byte) 97;
        value[17] = (byte) 47;
        value[18] = (byte) 108;
        value[19] = (byte) 97;
        value[20] = (byte) 110;
        value[21] = (byte) 103;
        value[22] = (byte) 47;
        value[23] = (byte) 79;
        value[24] = (byte) 98;
        value[25] = (byte) 106;
        value[26] = (byte) 101;
        value[27] = (byte) 99;
        value[28] = (byte) 116;
        value[29] = (byte) 59;
        setField(expected, "java.lang.AbstractStringBuilder", "value", value);
        setField(expected, "java.lang.AbstractStringBuilder", "coder", (byte) 0);
        setField(expected, "java.lang.AbstractStringBuilder", "count", 30);
        
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
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGenericSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _classSignature(_class, sb, false);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_4() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:233)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:223) */
        simpleType.getGenericSignature(null);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb = containedType(i).getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:229) */
        simpleType.getGenericSignature(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb = containedType(i).getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_1() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:197)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:229) */
        simpleType.getGenericSignature(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb = containedType(i).getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_2() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:178)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:229) */
        simpleType.getGenericSignature(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb = containedType(i).getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_3() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) referenceType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder(" ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:195)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:229) */
        simpleType.getGenericSignature(stringBuilder);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getGenericSignature(java.lang.StringBuilder)
    
    @Test
    public void testGetGenericSignature1() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:225) */
        simpleType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature2() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        _types[0] = ((JavaType) arrayType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("                               ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getGenericSignature(ArrayType.java:186)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:229) */
        simpleType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature3() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        SimpleType simpleType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        _types[0] = ((JavaType) simpleType1);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("                               ");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:203)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:223)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:229) */
        simpleType.getGenericSignature(stringBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.construct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method construct(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#construct(java.lang.Class)}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(cls)): False}
 * @utbot.executesCondition {@code (Collection.class.isAssignableFrom(cls)): False}
 * @utbot.executesCondition {@code (cls.isArray()): True}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isArray()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 *  */
    @Test
    public void testConstruct_ClsIsArray() throws Exception  {
        Class class1 = Object.class;
        
        SimpleType actual = SimpleType.construct(class1);
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method construct(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#construct(java.lang.Class)}
 * @utbot.executesCondition {@code (Map.class.isAssignableFrom(cls)): True}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: Map.class.isAssignableFrom(cls)
 *  */
    @Test
    public void testConstruct_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.construct] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.type.SimpleType.construct(SimpleType.java:106) */
        SimpleType.construct(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.withValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withValueHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (h == _valueHandler): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithValueHandler_HEquals_valueHandler() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        SimpleType actual = simpleType.withValueHandler(((Object) null));
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(simpleType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withValueHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (h == _valueHandler): False}
 * @utbot.returnsFrom {@code return new SimpleType(_class, _bindings, _superClass, _superInterfaces, h, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithValueHandler_HNotEquals_valueHandler() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        SimpleType actual = simpleType.withValueHandler(((Object) null));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withValueHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (h == _valueHandler): False}
 * @utbot.returnsFrom {@code return new SimpleType(_class, _bindings, _superClass, _superInterfaces, h, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithValueHandler_HNotEquals_valueHandler_1() throws Exception  {
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
            SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            Class _class = Object.class;
            setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            
            Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            SimpleType actual = simpleType.withValueHandler(((Object) null));
            
            SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialSimpleType_class == finalSimpleType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method constructUnsafe(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#constructUnsafe(java.lang.Class)}
 * @utbot.returnsFrom {@code return new SimpleType(raw, null, null, null, null, null, false);}
 *  */
    @Test
    public void testConstructUnsafe_Return() throws Exception  {
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
            
            SimpleType actual = SimpleType.constructUnsafe(class1);
            
            SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType._narrow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _narrow(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#_narrow(java.lang.Class)}
 * @utbot.executesCondition {@code (_class == subclass): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void test_narrow__classEqualsSubclass() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        SimpleType actual = ((SimpleType) simpleType._narrow(null));
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(simpleType, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.withTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withTypeHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (_typeHandler == h): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithTypeHandler__typeHandlerEqualsH() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        SimpleType actual = simpleType.withTypeHandler(((Object) null));
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(simpleType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withTypeHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (_typeHandler == h): False}
 * @utbot.returnsFrom {@code return new SimpleType(_class, _bindings, _superClass, _superInterfaces, _valueHandler, h, _asStatic);}
 *  */
    @Test
    public void testWithTypeHandler__typeHandlerNotEqualsH() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        SimpleType actual = simpleType.withTypeHandler(((Object) null));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withTypeHandler(java.lang.Object)}
 * @utbot.executesCondition {@code (_typeHandler == h): False}
 * @utbot.returnsFrom {@code return new SimpleType(_class, _bindings, _superClass, _superInterfaces, _valueHandler, h, _asStatic);}
 *  */
    @Test
    public void testWithTypeHandler__typeHandlerNotEqualsH_1() throws Exception  {
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
            SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            Class _class = Object.class;
            setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            
            Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            SimpleType actual = simpleType.withTypeHandler(((Object) null));
            
            SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialSimpleType_class == finalSimpleType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.refine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method refine(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#refine(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testRefine_ReturnNull() {
        SimpleType simpleType = new SimpleType(((TypeBase) null));
        
        JavaType actual = simpleType.refine(null, null, null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.getErasedSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErasedSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.SimpleType#_classSignature(java.lang.Class,java.lang.StringBuilder,boolean)}
 * @utbot.returnsFrom {@code return _classSignature(_class, sb, true);}
 *  */
    @Test
    public void testGetErasedSignature_SimpleType_classSignature() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        StringBuilder actual = simpleType.getErasedSignature(stringBuilder);
        
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
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getErasedSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.SimpleType#_classSignature(java.lang.Class,java.lang.StringBuilder,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _classSignature(_class, sb, true);
 *  */
    @Test
    public void testGetErasedSignature_ThrowNullPointerException() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:233)
            com.fasterxml.jackson.databind.type.SimpleType.getErasedSignature(SimpleType.java:217) */
        simpleType.getErasedSignature(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.isContainerType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isContainerType()
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#isContainerType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsContainerType_Return() {
        SimpleType simpleType = new SimpleType(((TypeBase) null));
        
        boolean actual = simpleType.isContainerType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildCanonicalName()
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#buildCanonicalName()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#size()}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testBuildCanonicalName_StringBuilderToString() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = simpleType.buildCanonicalName();
        
        String expected = "java.lang.Object";
        
        assertEquals(expected, actual);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildCanonicalName()
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#buildCanonicalName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(_class.getName());
 *  */
    @Test
    public void testBuildCanonicalName_ThrowNullPointerException() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:189) */
        simpleType.buildCanonicalName();
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#buildCanonicalName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int count = _bindings.size();
 *  */
    @Test
    public void testBuildCanonicalName_ThrowNullPointerException_1() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:191) */
        simpleType.buildCanonicalName();
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#buildCanonicalName()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(t.toCanonical());
 *  */
    @Test
    public void testBuildCanonicalName_ThrowNullPointerException_2() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199) */
        simpleType.buildCanonicalName();
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#buildCanonicalName()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < count; ++i)} twice
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(t.toCanonical());
 *  */
    @Test
    public void testBuildCanonicalName_ThrowNullPointerException_3() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[2];
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        String _canonicalName = "  ";
        mapType._canonicalName = _canonicalName;
        _types[0] = ((JavaType) mapType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199) */
        simpleType.buildCanonicalName();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method buildCanonicalName()
    
    @Test
    public void testBuildCanonicalName1() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[2];
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "  ";
        referenceType._canonicalName = _canonicalName;
        _types[0] = ((JavaType) referenceType);
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[1] = ((JavaType) collectionType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        TypeBindings typeBindings = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings_bindings_types_bindings_types1 = ((JavaType) get(typeBindings_bindings_types, 1));
        Class initialSimpleType_bindings_types1_class = ((Class) getFieldValue(typeBindings_bindings_types_bindings_types1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = simpleType.buildCanonicalName();
        
        String expected = "java.lang.Object<  ,java.lang.Object>";
        
        assertEquals(expected, actual);
        
        TypeBindings typeBindings1 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings1_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings1_bindings_types_bindings_types1 = ((JavaType) get(typeBindings1_bindings_types, 1));
        Class finalSimpleType_bindings_types1_class = ((Class) getFieldValue(typeBindings1_bindings_types_bindings_types1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_bindings_types1_class == finalSimpleType_bindings_types1_class);
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    @Test
    public void testBuildCanonicalName2() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[2];
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "  ";
        referenceType._canonicalName = _canonicalName;
        _types[0] = ((JavaType) referenceType);
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[1] = ((JavaType) mapType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        TypeBindings typeBindings = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings_bindings_types_bindings_types1 = ((JavaType) get(typeBindings_bindings_types, 1));
        Class initialSimpleType_bindings_types1_class = ((Class) getFieldValue(typeBindings_bindings_types_bindings_types1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = simpleType.buildCanonicalName();
        
        String expected = "java.lang.Object<  ,java.lang.Object>";
        
        assertEquals(expected, actual);
        
        TypeBindings typeBindings1 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings1_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings1_bindings_types_bindings_types1 = ((JavaType) get(typeBindings1_bindings_types, 1));
        Class finalSimpleType_bindings_types1_class = ((Class) getFieldValue(typeBindings1_bindings_types_bindings_types1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_bindings_types1_class == finalSimpleType_bindings_types1_class);
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    @Test
    public void testBuildCanonicalName3() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        TypeBindings typeBindings = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings_bindings_types_bindings_types0 = ((JavaType) get(typeBindings_bindings_types, 0));
        JavaType typeBindings_bindings_types_bindings_types0_bindings_types0_elementType = ((JavaType) getFieldValue(typeBindings_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class initialSimpleType_bindings_types0_elementType_class = ((Class) getFieldValue(typeBindings_bindings_types_bindings_types0_bindings_types0_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        TypeBindings typeBindings1 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings1_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings1_bindings_types_bindings_types0 = ((JavaType) get(typeBindings1_bindings_types, 0));
        Class initialSimpleType_bindings_types0_class = ((Class) getFieldValue(typeBindings1_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = simpleType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object<java.lang.Object>>";
        
        assertEquals(expected, actual);
        
        TypeBindings typeBindings2 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings2_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings2, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings2_bindings_types_bindings_types0 = ((JavaType) get(typeBindings2_bindings_types, 0));
        JavaType typeBindings2_bindings_types_bindings_types0_bindings_types0_elementType = ((JavaType) getFieldValue(typeBindings2_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class finalSimpleType_bindings_types0_elementType_class = ((Class) getFieldValue(typeBindings2_bindings_types_bindings_types0_bindings_types0_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        TypeBindings typeBindings3 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings3_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings3, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings3_bindings_types_bindings_types0 = ((JavaType) get(typeBindings3_bindings_types, 0));
        Class finalSimpleType_bindings_types0_class = ((Class) getFieldValue(typeBindings3_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_bindings_types0_elementType_class == finalSimpleType_bindings_types0_elementType_class);
        
        assertFalse(initialSimpleType_bindings_types0_class == finalSimpleType_bindings_types0_class);
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    @Test
    public void testBuildCanonicalName4() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        TypeBindings typeBindings = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings_bindings_types_bindings_types0 = ((JavaType) get(typeBindings_bindings_types, 0));
        JavaType typeBindings_bindings_types_bindings_types0_bindings_types0_elementType = ((JavaType) getFieldValue(typeBindings_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class initialSimpleType_bindings_types0_elementType_class = ((Class) getFieldValue(typeBindings_bindings_types_bindings_types0_bindings_types0_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        TypeBindings typeBindings1 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings1_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings1_bindings_types_bindings_types0 = ((JavaType) get(typeBindings1_bindings_types, 0));
        Class initialSimpleType_bindings_types0_class = ((Class) getFieldValue(typeBindings1_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = simpleType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object<java.lang.Object>>";
        
        assertEquals(expected, actual);
        
        TypeBindings typeBindings2 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings2_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings2, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings2_bindings_types_bindings_types0 = ((JavaType) get(typeBindings2_bindings_types, 0));
        JavaType typeBindings2_bindings_types_bindings_types0_bindings_types0_elementType = ((JavaType) getFieldValue(typeBindings2_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class finalSimpleType_bindings_types0_elementType_class = ((Class) getFieldValue(typeBindings2_bindings_types_bindings_types0_bindings_types0_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        TypeBindings typeBindings3 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings3_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings3, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings3_bindings_types_bindings_types0 = ((JavaType) get(typeBindings3_bindings_types, 0));
        Class finalSimpleType_bindings_types0_class = ((Class) getFieldValue(typeBindings3_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_bindings_types0_elementType_class == finalSimpleType_bindings_types0_elementType_class);
        
        assertFalse(initialSimpleType_bindings_types0_class == finalSimpleType_bindings_types0_class);
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    @Test
    public void testBuildCanonicalName5() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[12];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ResolvedRecursiveType _elementType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        String _canonicalName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        _elementType._canonicalName = _canonicalName;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionLikeType);
        _types[1] = ((JavaType) _elementType);
        _types[2] = ((JavaType) _elementType);
        _types[3] = ((JavaType) _elementType);
        _types[4] = ((JavaType) _elementType);
        _types[5] = ((JavaType) _elementType);
        _types[6] = ((JavaType) _elementType);
        _types[7] = ((JavaType) _elementType);
        _types[8] = ((JavaType) _elementType);
        _types[9] = ((JavaType) _elementType);
        _types[10] = ((JavaType) _elementType);
        _types[11] = ((JavaType) _elementType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        TypeBindings typeBindings = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings_bindings_types_bindings_types0 = ((JavaType) get(typeBindings_bindings_types, 0));
        Class initialSimpleType_bindings_types0_class = ((Class) getFieldValue(typeBindings_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = simpleType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object<\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000>,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000>";
        
        assertEquals(expected, actual);
        
        TypeBindings typeBindings1 = simpleType._bindings;
        com.fasterxml.jackson.databind.JavaType[] typeBindings1_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType typeBindings1_bindings_types_bindings_types0 = ((JavaType) get(typeBindings1_bindings_types, 0));
        Class finalSimpleType_bindings_types0_class = ((Class) getFieldValue(typeBindings1_bindings_types_bindings_types0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_bindings_types0_class == finalSimpleType_bindings_types0_class);
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildCanonicalName()
    
    @Test(expected = StackOverflowError.class)
    public void testBuildCanonicalName6() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", mapLikeType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        simpleType.buildCanonicalName();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildCanonicalName7() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", collectionLikeType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        simpleType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName8() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ResolvedRecursiveType _keyType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase.buildCanonicalName(TypeBase.java:75)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:151)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199) */
        simpleType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName9() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException] */
        simpleType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName10() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:143)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:151)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199) */
        simpleType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName11() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException] */
        simpleType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName12() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException] */
        simpleType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName13() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[9];
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) referenceType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:145)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:69)
            com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName(SimpleType.java:199) */
        simpleType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName14() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.SimpleType.buildCanonicalName] produces [java.lang.NullPointerException] */
        simpleType.buildCanonicalName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.withContentType
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withContentType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Simple types have no content types; can not call withContentType()");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithContentType_ThrowIllegalArgumentException() {
        SimpleType simpleType = new SimpleType(((TypeBase) null));
        
        simpleType.withContentType(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.withStaticTyping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): True}
 * @utbot.returnsFrom {@code return _asStatic ? this : new SimpleType(_class, _bindings, _superClass, _superInterfaces, _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping__asStatic() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        SimpleType actual = simpleType.withStaticTyping();
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(simpleType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.returnsFrom {@code return _asStatic ? this : new SimpleType(_class, _bindings, _superClass, _superInterfaces, _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Not_asStatic() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        SimpleType actual = simpleType.withStaticTyping();
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.returnsFrom {@code return _asStatic ? this : new SimpleType(_class, _bindings, _superClass, _superInterfaces, _valueHandler, _typeHandler, true);}
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
            SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            Class _class = Object.class;
            setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            SimpleType actual = simpleType.withStaticTyping();
            
            SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            
            // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialSimpleType_class == finalSimpleType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.withContentTypeHandler
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withContentTypeHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Simple types have no content types; can not call withContenTypeHandler()");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithContentTypeHandler_ThrowIllegalArgumentException() {
        SimpleType simpleType = new SimpleType(((TypeBase) null));
        
        simpleType.withContentTypeHandler(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.SimpleType.withContentValueHandler
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link SimpleType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.SimpleType#withContentValueHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: throw new IllegalArgumentException("Simple types have no content types; can not call withContenValueHandler()");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithContentValueHandler_ThrowIllegalArgumentException() {
        SimpleType simpleType = new SimpleType(((TypeBase) null));
        
        simpleType.withContentValueHandler(((Object) null));
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1072214336043400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1072214336043400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1072214336048699 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072214336043400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072214336048699).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1072214336420200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1072214336420200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1072214336422100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072214336420200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072214336422100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1072214336792900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1072214336792900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1072214336794199 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072214336792900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072214336794199).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1072214337544000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1072214337544000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1072214337545499 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1072214337544000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1072214337545499).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

