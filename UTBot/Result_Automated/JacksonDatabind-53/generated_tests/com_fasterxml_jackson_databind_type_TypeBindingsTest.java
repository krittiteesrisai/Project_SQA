package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class com_fasterxml_jackson_databind_type_TypeBindingsTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 *  */
    @Test
    public void testEquals_O() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        boolean actual = typeBindings.equals(typeBindings);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o.getClass() != getClass()): True}
 *  */
    @Test
    public void testEquals_OGetClassNotEqualsGetClass() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        int[] intArray = {};
        
        boolean actual = typeBindings.equals(intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        boolean actual = typeBindings.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#toString()}
 * @utbot.executesCondition {@code (_types.length == 0): True}
 * @utbot.returnsFrom {@code return "<>";}
 *  */
    @Test
    public void testToString__typesLengthEqualsZero() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        String actual = typeBindings.toString();
        
        String expected = "<>";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#toString()}
 * @utbot.executesCondition {@code (_types.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _types.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sig = _types[i].getGenericSignature();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_1() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.toString(TypeBindings.java:323) */
        typeBindings.toString();
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#toString()}
 * @utbot.executesCondition {@code (_types.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _types.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sig = _types[i].getGenericSignature();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_2() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:188)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:222)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:468)
            com.fasterxml.jackson.databind.type.TypeBindings.toString(TypeBindings.java:323) */
        typeBindings.toString();
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#toString()}
 * @utbot.executesCondition {@code (_types.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _types.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sig = _types[i].getGenericSignature();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_3() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) mapLikeType);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:222)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:222)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:468)
            com.fasterxml.jackson.databind.type.TypeBindings.toString(TypeBindings.java:323) */
        typeBindings.toString();
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#toString()}
 * @utbot.executesCondition {@code (_types.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _types.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sig = _types[i].getGenericSignature();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_4() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionLikeType);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:222)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:188)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:468)
            com.fasterxml.jackson.databind.type.TypeBindings.toString(TypeBindings.java:323) */
        typeBindings.toString();
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#toString()}
 * @utbot.executesCondition {@code (_types.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _types.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String sig = _types[i].getGenericSignature();
 *  */
    @Test
    public void testToString_ThrowNullPointerException_5() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _types[0] = ((JavaType) collectionLikeType);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:188)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:188)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:468)
            com.fasterxml.jackson.databind.type.TypeBindings.toString(TypeBindings.java:323) */
        typeBindings.toString();
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _types.length == 0
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.toString(TypeBindings.java:313) */
        typeBindings.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#hashCode()}
 * @utbot.returnsFrom {@code return _hashCode;}
 *  */
    @Test
    public void testHashCode_Return_hashCode() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", -255);
        
        int actual = typeBindings.hashCode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#isEmpty()}
 * @utbot.returnsFrom {@code return (_types.length == 0);}
 *  */
    @Test
    public void testIsEmpty__typesLengthEqualsZero() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        boolean actual = typeBindings.isEmpty();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#isEmpty()}
 * @utbot.returnsFrom {@code return (_types.length == 0);}
 *  */
    @Test
    public void testIsEmpty__typesLengthNotEqualsZero() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        boolean actual = typeBindings.isEmpty();
        
        assertFalse(actual);
        
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types0 = ((JavaType) get(typeBindings_types, 0));
        
        assertNull(finalTypeBindings_types0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_types.length == 0);
 *  */
    @Test
    public void testIsEmpty_ThrowNullPointerException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.isEmpty] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.isEmpty(TypeBindings.java:245) */
        typeBindings.isEmpty();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#size()}
 * @utbot.returnsFrom {@code return _types.length;}
 *  */
    @Test
    public void testSize_Return_typesLength() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        int actual = typeBindings.size();
        
        assertEquals(1, actual);
        
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types0 = ((JavaType) get(typeBindings_types, 0));
        
        assertNull(finalTypeBindings_types0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _types.length;
 *  */
    @Test
    public void testSize_ThrowNullPointerException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.size] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.size(TypeBindings.java:252) */
        typeBindings.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.getTypeParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeParameters()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getTypeParameters()}
 * @utbot.executesCondition {@code (_types.length == 0): True}
 * @utbot.invokes {@link java.util.Collections#emptyList()}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testGetTypeParameters__typesLengthEqualsZero() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        List actual = typeBindings.getTypeParameters();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getTypeParameters()}
 * @utbot.executesCondition {@code (_types.length == 0): False}
 * @utbot.invokes {@link java.util.Arrays#asList(java.lang.Object[])}
 * @utbot.returnsFrom {@code return Arrays.asList(_types);}
 *  */
    @Test
    public void testGetTypeParameters__typesLengthNotEqualsZero() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        List actual = typeBindings.getTypeParameters();
        
        List expected = new ArrayList();
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
        
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types0 = ((JavaType) get(typeBindings_types, 0));
        
        assertNull(finalTypeBindings_types0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTypeParameters()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getTypeParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _types.length == 0
 *  */
    @Test
    public void testGetTypeParameters_ThrowNullPointerException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.getTypeParameters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.getTypeParameters(TypeBindings.java:276) */
        typeBindings.getTypeParameters();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.readResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readResolve()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#readResolve()}
 * @utbot.executesCondition {@code (_names == null): False}
 * @utbot.executesCondition {@code (_names.length == 0): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReadResolve__namesLengthNotEqualsZero() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        
        TypeBindings actual = ((TypeBindings) typeBindings.readResolve());
        
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(typeBindings, actual);
        
        java.lang.String[] typeBindings_names = ((java.lang.String[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names"));
        String finalTypeBindings_names0 = ((String) get(typeBindings_names, 0));
        
        assertNull(finalTypeBindings_names0);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#readResolve()}
 * @utbot.executesCondition {@code (_names == null): False}
 * @utbot.executesCondition {@code (_names.length == 0): True}
 * @utbot.returnsFrom {@code return EMPTY;}
 *  */
    @Test
    public void testReadResolve__namesLengthEqualsZero() throws Exception  {
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
            TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names1 = {};
            setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names1);
            
            TypeBindings actual = ((TypeBindings) typeBindings.readResolve());
            
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(empty, actual);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#readResolve()}
 * @utbot.executesCondition {@code (_names == null): True}
 * @utbot.returnsFrom {@code return EMPTY;}
 *  */
    @Test
    public void testReadResolve__namesEqualsNull() throws Exception  {
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
            TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            
            TypeBindings actual = ((TypeBindings) typeBindings.readResolve());
            
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(empty, actual);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.create
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method create(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code ((vars == null)): False}
 * @utbot.executesCondition {@code (varLen != 1): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings.TypeParamStash#paramsFor1(java.lang.Class)}
 * @utbot.invokes {@link java.lang.reflect.TypeVariable#getName()}
 * @utbot.returnsFrom {@code return new TypeBindings(new String[] { vars[0].getName() }, new JavaType[] { typeArg1 }, null);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new TypeBindings(new String[] { vars[0].getName() }, new JavaType[] { typeArg1 }, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreate_ThrowIllegalArgumentException() throws Exception  {
        Class class1 = Object.class;
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -3);
        
        TypeBindings.create(class1, mapType);
    }
    ///endregion
    
    ///region Errors report for create
    
    public void testCreate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.create
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method create(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (types == null): False}
 * @utbot.executesCondition {@code (vars == null): False}
 * @utbot.executesCondition {@code (vars.length == 0): False}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.activatesSwitch {@code switch(types.length) case: default}
 *  */
    @Test
    public void testCreate_VarsLengthNotEqualsZero() throws Exception  {
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {};
        
        TypeBindings actual = TypeBindings.create(class1, javaTypeArray);
        
        TypeBindings expected = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", javaTypeArray);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method create(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (types == null): False}
 * @utbot.activatesSwitch {@code switch(types.length) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeVariable<?>[] vars = erasedType.getTypeParameters();
 *  */
    @Test
    public void testCreate_ThrowNullPointerException() {
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {};
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.create] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:99) */
        TypeBindings.create(((Class) null), javaTypeArray);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (types == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeVariable<?>[] vars = erasedType.getTypeParameters();
 *  */
    @Test
    public void testCreate_ThrowNullPointerException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        com.fasterxml.jackson.databind.JavaType[] prevNO_TYPES = ((com.fasterxml.jackson.databind.JavaType[]) getStaticFieldValue(typeBindingsClazz, "NO_TYPES"));
        try {
            com.fasterxml.jackson.databind.JavaType[] noTypes = {};
            setStaticField(typeBindingsClazz, "NO_TYPES", noTypes);
            
            /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.create] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.type.TypeBindings.create(TypeBindings.java:99) */
            TypeBindings.create(((Class) null), ((com.fasterxml.jackson.databind.JavaType[]) null));
        } finally {
            setStaticField(TypeBindings.class, "NO_TYPES", prevNO_TYPES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method create(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.activatesSwitch {@code switch(types.length) case: 2}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return create(erasedType, types[0], types[1]);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreate_ThrowIllegalArgumentException1() {
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null};
        
        TypeBindings.create(class1, javaTypeArray);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.activatesSwitch {@code switch(types.length) case: 1}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return create(erasedType, types[0]);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreate_ThrowIllegalArgumentException_1() {
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null};
        
        TypeBindings.create(class1, javaTypeArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method create(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test
    public void testCreate1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        com.fasterxml.jackson.databind.JavaType[] prevNO_TYPES = ((com.fasterxml.jackson.databind.JavaType[]) getStaticFieldValue(typeBindingsClazz, "NO_TYPES"));
        try {
            com.fasterxml.jackson.databind.JavaType[] noTypes = {};
            setStaticField(typeBindingsClazz, "NO_TYPES", noTypes);
            Class class1 = Object.class;
            
            TypeBindings actual = TypeBindings.create(class1, ((com.fasterxml.jackson.databind.JavaType[]) null));
            
            TypeBindings expected = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", noTypes);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "NO_TYPES", prevNO_TYPES);
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method create(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreate2() {
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null, null, null};
        
        TypeBindings.create(class1, javaTypeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.create
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method create(java.lang.Class, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code ((vars == null)): False}
 * @utbot.executesCondition {@code (varLen != 2): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings.TypeParamStash#paramsFor2(java.lang.Class)}
 * @utbot.invokes {@link java.lang.reflect.TypeVariable#getName()}
 * @utbot.invokes {@link java.lang.reflect.TypeVariable#getName()}
 * @utbot.returnsFrom {@code return new TypeBindings(new String[] { vars[0].getName(), vars[1].getName() }, new JavaType[] { typeArg1, typeArg2 }, null);}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new TypeBindings(new String[] { vars[0].getName(), vars[1].getName() }, new JavaType[] { typeArg1, typeArg2 }, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreate_ThrowIllegalArgumentException2() throws Exception  {
        Class class1 = Object.class;
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -4);
        MapType mapType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        TypeBindings.create(class1, mapType, mapType1);
    }
    ///endregion
    
    ///region Errors report for create
    
    public void testCreate_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 5 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.create
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method create(java.lang.Class, java.util.List)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,java.util.List)}
 * @utbot.executesCondition {@code ((typeList == null || typeList.isEmpty())): False}
 *  */
    @Test
    public void testCreate_TypeListEqualsNullOrTypeListIsEmpty() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        com.fasterxml.jackson.databind.JavaType[] prevNO_TYPES = ((com.fasterxml.jackson.databind.JavaType[]) getStaticFieldValue(typeBindingsClazz, "NO_TYPES"));
        try {
            com.fasterxml.jackson.databind.JavaType[] noTypes = {};
            setStaticField(typeBindingsClazz, "NO_TYPES", noTypes);
            Class class1 = Object.class;
            
            TypeBindings actual = TypeBindings.create(class1, ((List) null));
            
            TypeBindings expected = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", noTypes);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "NO_TYPES", prevNO_TYPES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,java.util.List)}
 * @utbot.executesCondition {@code ((typeList == null || typeList.isEmpty())): True}
 * @utbot.executesCondition {@code ((typeList == null || typeList.isEmpty())): True}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 *  */
    @Test
    public void testCreate_TypeListNotEqualsNullOrTypeListIsEmpty() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        com.fasterxml.jackson.databind.JavaType[] prevNO_TYPES = ((com.fasterxml.jackson.databind.JavaType[]) getStaticFieldValue(typeBindingsClazz, "NO_TYPES"));
        try {
            com.fasterxml.jackson.databind.JavaType[] noTypes = {};
            setStaticField(typeBindingsClazz, "NO_TYPES", noTypes);
            Class class1 = Object.class;
            ArrayList arrayList = new ArrayList();
            
            TypeBindings actual = TypeBindings.create(class1, arrayList);
            
            TypeBindings expected = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {};
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", noTypes);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
            
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "NO_TYPES", prevNO_TYPES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method create(java.lang.Class, java.util.List)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,java.util.List)}
 * @utbot.executesCondition {@code ((typeList == null || typeList.isEmpty())): True}
 * @utbot.executesCondition {@code ((typeList == null || typeList.isEmpty())): False}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 * @utbot.invokes {@link java.util.List#size()}
 * @utbot.invokes {@link java.util.List#toArray(java.lang.Object[])}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBindings#create(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return create(erasedType, types);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreate_ThrowIllegalArgumentException3() {
        Class class1 = Object.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        
        TypeBindings.create(class1, arrayList);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emptyBindings()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#emptyBindings()}
 * @utbot.returnsFrom {@code return EMPTY;}
 *  */
    @Test
    public void testEmptyBindings_ReturnEMPTY() throws Exception  {
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
            
            TypeBindings actual = TypeBindings.emptyBindings();
            
            // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
            assertEquals(empty, actual);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.findBoundType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method findBoundType(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return null;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#findBoundType(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindBoundType_ReturnNull() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        
        JavaType actual = typeBindings.findBoundType(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#findBoundType(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _names.length; i < len; ++i)} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindBoundType_NotNameEquals() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        String string = "";
        
        JavaType actual = typeBindings.findBoundType(string);
        
        assertNull(actual);
        
        java.lang.String[] typeBindings_names = ((java.lang.String[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names"));
        String finalTypeBindings_names0 = ((String) get(typeBindings_names, 0));
        
        assertNull(finalTypeBindings_names0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method findBoundType(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.String#equals(java.lang.Object)} once
    /// execute conditions:
    ///     {@code (name.equals(_names[i])): True}
    /// return from: {@code return t;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#findBoundType(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _names.length; i < len; ++i)} once
 *  */
    @Test
    public void testFindBoundType_NotTNotInstanceOfResolvedRecursiveType() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = new java.lang.String[1];
        String string = " ";
        _names[0] = string;
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        JavaType actual = typeBindings.findBoundType(string);
        
        assertNull(actual);
        
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types0 = ((JavaType) get(typeBindings_types, 0));
        
        assertNull(finalTypeBindings_types0);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#findBoundType(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _names.length; i < len; ++i)} once
 *  */
    @Test
    public void testFindBoundType_T2EqualsNull() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = new java.lang.String[1];
        String string = "";
        _names[0] = string;
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        _types[0] = ((JavaType) resolvedRecursiveType);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        ResolvedRecursiveType actual = ((ResolvedRecursiveType) typeBindings.findBoundType(string));
        
        // com.fasterxml.jackson.databind.type.ResolvedRecursiveType has overridden equals method
        assertEquals(resolvedRecursiveType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#findBoundType(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _names.length; i < len; ++i)} once
 *  */
    @Test
    public void testFindBoundType_T2NotEqualsNull() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = new java.lang.String[1];
        String string = " ";
        _names[0] = string;
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.ResolvedRecursiveType", "_referencedType", _referencedType);
        _types[0] = ((JavaType) resolvedRecursiveType);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        MapType actual = ((MapType) typeBindings.findBoundType(string));
        
        JavaType actual_keyType = actual._keyType;
        assertNull(actual_keyType);
        
        JavaType actual_valueType = actual._valueType;
        assertNull(actual_valueType);
        
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
        
        int _referencedType_hash = ((Integer) getFieldValue(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        int actual_hash = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_hash"));
        assertEquals(_referencedType_hash, actual_hash);
        
        Object actual_valueHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        assertNull(actual_valueHandler);
        
        Object actual_typeHandler = getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
        assertNull(actual_typeHandler);
        
        boolean actual_asStatic = ((Boolean) getFieldValue(actual, "com.fasterxml.jackson.databind.JavaType", "_asStatic"));
        assertFalse(actual_asStatic);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findBoundType(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#findBoundType(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _names.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JavaType t = _types[i];
 *  */
    @Test
    public void testFindBoundType_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = new java.lang.String[1];
        String string = " ";
        _names[0] = string;
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.findBoundType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.fasterxml.jackson.databind.type.TypeBindings.findBoundType(TypeBindings.java:220) */
        typeBindings.findBoundType(string);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#findBoundType(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _names.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: name.equals(_names[i])
 *  */
    @Test
    public void testFindBoundType_ThrowNullPointerException_1() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.findBoundType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.findBoundType(TypeBindings.java:219) */
        typeBindings.findBoundType(null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#findBoundType(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0, len = _names.length; i < len; ++i)
 *  */
    @Test
    public void testFindBoundType_ThrowNullPointerException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.findBoundType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.findBoundType(TypeBindings.java:218) */
        typeBindings.findBoundType(null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#findBoundType(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0, len = _names.length; i < len; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JavaType t = _types[i];
 *  */
    @Test
    public void testFindBoundType_ThrowNullPointerException_2() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = new java.lang.String[1];
        String string = " ";
        _names[0] = string;
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.findBoundType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.findBoundType(TypeBindings.java:220) */
        typeBindings.findBoundType(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.typeParameterArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method typeParameterArray()
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#typeParameterArray()}
 * @utbot.returnsFrom {@code return _types;}
 *  */
    @Test
    public void testTypeParameterArray_Return_types() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        com.fasterxml.jackson.databind.JavaType[] actual = typeBindings.typeParameterArray();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.getBoundName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBoundName(int)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getBoundName(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBoundName_IndexLessThanZero() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        String actual = typeBindings.getBoundName(-1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getBoundName(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= _names.length): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBoundName_IndexGreaterOrEqual_namesLength() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        
        String actual = typeBindings.getBoundName(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getBoundName(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= _names.length): False}
 * @utbot.returnsFrom {@code return _names[index];}
 *  */
    @Test
    public void testGetBoundName_IndexLessThan_namesLength() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        
        String actual = typeBindings.getBoundName(0);
        
        assertNull(actual);
        
        java.lang.String[] typeBindings_names = ((java.lang.String[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names"));
        String finalTypeBindings_names0 = ((String) get(typeBindings_names, 0));
        
        assertNull(finalTypeBindings_names0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBoundName(int)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getBoundName(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < 0 || index >= _names.length
 *  */
    @Test
    public void testGetBoundName_ThrowNullPointerException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.getBoundName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.getBoundName(TypeBindings.java:257) */
        typeBindings.getBoundName(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createIfNeeded(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#createIfNeeded(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code ((vars == null)): False}
 * @utbot.executesCondition {@code (varLen == 0): False}
 * @utbot.executesCondition {@code (varLen != 1): False}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.invokes {@link java.lang.reflect.TypeVariable#getName()}
 * @utbot.returnsFrom {@code return new TypeBindings(new String[] { vars[0].getName() }, new JavaType[] { typeArg1 }, null);}
 *  */
    @Test
    public void testCreateIfNeeded_VarLenEquals1() throws Exception  {
        Class class1 = Object.class;
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -3);
        
        TypeBindings actual = TypeBindings.createIfNeeded(class1, mapType);
        
        TypeBindings expected = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createIfNeeded(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#createIfNeeded(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeVariable<?>[] vars = erasedType.getTypeParameters();
 *  */
    @Test
    public void testCreateIfNeeded_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(TypeBindings.java:152) */
        TypeBindings.createIfNeeded(((Class) null), ((JavaType) null));
    }
    ///endregion
    
    ///region Errors report for createIfNeeded
    
    public void testCreateIfNeeded_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createIfNeeded(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#createIfNeeded(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.executesCondition {@code (vars == null): False}
 * @utbot.executesCondition {@code (vars.length == 0): False}
 * @utbot.executesCondition {@code (types == null): False}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 *  */
    @Test
    public void testCreateIfNeeded_TypesNotEqualsNull() throws Exception  {
        Class class1 = Object.class;
        com.fasterxml.jackson.databind.JavaType[] javaTypeArray = {null};
        
        TypeBindings actual = TypeBindings.createIfNeeded(class1, javaTypeArray);
        
        TypeBindings expected = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
        JavaType finalJavaTypeArray0 = javaTypeArray[0];
        
        assertNull(finalJavaTypeArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createIfNeeded(java.lang.Class, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#createIfNeeded(java.lang.Class,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeVariable<?>[] vars = erasedType.getTypeParameters();
 *  */
    @Test
    public void testCreateIfNeeded_ThrowNullPointerException1() {
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.createIfNeeded(TypeBindings.java:172) */
        TypeBindings.createIfNeeded(((Class) null), ((com.fasterxml.jackson.databind.JavaType[]) null));
    }
    ///endregion
    
    ///region Errors report for createIfNeeded
    
    public void testCreateIfNeeded_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.getBoundType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBoundType(int)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getBoundType(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBoundType_IndexLessThanZero() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        JavaType actual = typeBindings.getBoundType(-1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getBoundType(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= _types.length): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBoundType_IndexGreaterOrEqual_typesLength() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        JavaType actual = typeBindings.getBoundType(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getBoundType(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (index >= _types.length): False}
 * @utbot.returnsFrom {@code return _types[index];}
 *  */
    @Test
    public void testGetBoundType_IndexLessThan_typesLength() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        JavaType actual = typeBindings.getBoundType(0);
        
        assertNull(actual);
        
        com.fasterxml.jackson.databind.JavaType[] typeBindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalTypeBindings_types0 = ((JavaType) get(typeBindings_types, 0));
        
        assertNull(finalTypeBindings_types0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBoundType(int)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#getBoundType(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < 0 || index >= _types.length
 *  */
    @Test
    public void testGetBoundType_ThrowNullPointerException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.getBoundType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.getBoundType(TypeBindings.java:265) */
        typeBindings.getBoundType(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.hasUnbound
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasUnbound(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#hasUnbound(java.lang.String)}
 * @utbot.executesCondition {@code (_unboundVariables != null): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasUnbound__unboundVariablesNotEqualsNull() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _unboundVariables = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        
        boolean actual = typeBindings.hasUnbound(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#hasUnbound(java.lang.String)}
 * @utbot.executesCondition {@code (_unboundVariables != null): True}
 * @utbot.executesCondition {@code (name.equals(_unboundVariables[i])): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHasUnbound_NameEquals() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _unboundVariables = new java.lang.String[1];
        String string = "";
        _unboundVariables[0] = string;
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        
        boolean actual = typeBindings.hasUnbound(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#hasUnbound(java.lang.String)}
 * @utbot.executesCondition {@code (_unboundVariables != null): True}
 * @utbot.executesCondition {@code (name.equals(_unboundVariables[i])): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasUnbound_NotNameEquals() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _unboundVariables = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        String string = "";
        
        boolean actual = typeBindings.hasUnbound(string);
        
        assertFalse(actual);
        
        java.lang.String[] typeBindings_unboundVariables = ((java.lang.String[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables"));
        String finalTypeBindings_unboundVariables0 = ((String) get(typeBindings_unboundVariables, 0));
        
        assertNull(finalTypeBindings_unboundVariables0);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#hasUnbound(java.lang.String)}
 * @utbot.executesCondition {@code (_unboundVariables != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasUnbound__unboundVariablesEqualsNull() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        boolean actual = typeBindings.hasUnbound(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasUnbound(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#hasUnbound(java.lang.String)}
 * @utbot.executesCondition {@code (_unboundVariables != null): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: name.equals(_unboundVariables[i])
 *  */
    @Test
    public void testHasUnbound_ThrowNullPointerException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _unboundVariables = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.hasUnbound] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.hasUnbound(TypeBindings.java:288) */
        typeBindings.hasUnbound(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.TypeBindings.withUnboundVariable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withUnboundVariable(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#withUnboundVariable(java.lang.String)}
 * @utbot.executesCondition {@code ((_unboundVariables == null)): False}
 * @utbot.executesCondition {@code ((len == 0)): False}
 * @utbot.invokes {@link java.util.Arrays#copyOf(java.lang.Object[],int)}
 * @utbot.returnsFrom {@code return new TypeBindings(_names, _types, names);}
 *  */
    @Test
    public void testWithUnboundVariable_LenNotEqualsZero() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        java.lang.String[] _unboundVariables = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        
        TypeBindings actual = typeBindings.withUnboundVariable(null);
        
        TypeBindings expected = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        java.lang.String[] _unboundVariables1 = {null, null};
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] typeBindings_unboundVariables = ((java.lang.String[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables"));
        String finalTypeBindings_unboundVariables0 = ((String) get(typeBindings_unboundVariables, 0));
        
        assertNull(finalTypeBindings_unboundVariables0);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#withUnboundVariable(java.lang.String)}
 * @utbot.executesCondition {@code ((_unboundVariables == null)): False}
 * @utbot.executesCondition {@code ((len == 0)): True}
 * @utbot.returnsFrom {@code return new TypeBindings(_names, _types, names);}
 *  */
    @Test
    public void testWithUnboundVariable_LenEqualsZero() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_hash", -3);
        _types[0] = ((JavaType) mapLikeType);
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        java.lang.String[] _unboundVariables = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        
        TypeBindings actual = typeBindings.withUnboundVariable(null);
        
        TypeBindings expected = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        java.lang.String[] _unboundVariables1 = {null};
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", -2);
        
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] typeBindings_names = ((java.lang.String[]) getFieldValue(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names"));
        String finalTypeBindings_names0 = ((String) get(typeBindings_names, 0));
        
        assertNull(finalTypeBindings_names0);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#withUnboundVariable(java.lang.String)}
 * @utbot.executesCondition {@code ((_unboundVariables == null)): True}
 * @utbot.executesCondition {@code ((len == 0)): True}
 * @utbot.returnsFrom {@code return new TypeBindings(_names, _types, names);}
 *  */
    @Test
    public void testWithUnboundVariable__unboundVariablesEqualsNull() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        
        TypeBindings actual = typeBindings.withUnboundVariable(null);
        
        TypeBindings expected = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        java.lang.String[] _unboundVariables = {null};
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        
        // com.fasterxml.jackson.databind.type.TypeBindings has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method withUnboundVariable(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#withUnboundVariable(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new TypeBindings(_names, _types, names);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithUnboundVariable_ThrowIllegalArgumentException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {null, null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        java.lang.String[] _unboundVariables = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        
        typeBindings.withUnboundVariable(null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#withUnboundVariable(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new TypeBindings(_names, _types, names);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithUnboundVariable_ThrowIllegalArgumentException_1() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        java.lang.String[] prevNO_STRINGS = ((java.lang.String[]) getStaticFieldValue(typeBindingsClazz, "NO_STRINGS"));
        try {
            java.lang.String[] noStrings = {};
            setStaticField(typeBindingsClazz, "NO_STRINGS", noStrings);
            TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            com.fasterxml.jackson.databind.JavaType[] _types = {null};
            setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
            java.lang.String[] _unboundVariables = {};
            setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
            
            typeBindings.withUnboundVariable(null);
        } finally {
            setStaticField(TypeBindings.class, "NO_STRINGS", prevNO_STRINGS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#withUnboundVariable(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new TypeBindings(_names, _types, names);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testWithUnboundVariable_ThrowIllegalArgumentException_2() throws Exception  {
        Class typeBindingsClazz = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        com.fasterxml.jackson.databind.JavaType[] prevNO_TYPES = ((com.fasterxml.jackson.databind.JavaType[]) getStaticFieldValue(typeBindingsClazz, "NO_TYPES"));
        try {
            com.fasterxml.jackson.databind.JavaType[] noTypes = {};
            setStaticField(typeBindingsClazz, "NO_TYPES", noTypes);
            TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            java.lang.String[] _names = {null};
            setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
            java.lang.String[] _unboundVariables = {};
            setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
            
            typeBindings.withUnboundVariable(null);
        } finally {
            setStaticField(TypeBindings.class, "NO_TYPES", prevNO_TYPES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withUnboundVariable(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeBindings}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.TypeBindings#withUnboundVariable(java.lang.String)}
 * @utbot.executesCondition {@code ((_unboundVariables == null)): False}
 * @utbot.executesCondition {@code ((len == 0)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new TypeBindings(_names, _types, names);
 *  */
    @Test
    public void testWithUnboundVariable_ThrowNullPointerException() throws Exception  {
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        java.lang.String[] _unboundVariables = {};
        setField(typeBindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_unboundVariables", _unboundVariables);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.TypeBindings.withUnboundVariable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBindings.<init>(TypeBindings.java:60)
            com.fasterxml.jackson.databind.type.TypeBindings.withUnboundVariable(TypeBindings.java:204) */
        typeBindings.withUnboundVariable(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1076965231527100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1076965231527100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1076965231535000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076965231527100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076965231535000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1076965232333700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076965232333700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076965232338700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076965232333700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076965232338700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1076965238525900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076965238525900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076965238530300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076965238525900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076965238530300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1076965239781600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1076965239781600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1076965239787499 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1076965239781600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1076965239787499).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

