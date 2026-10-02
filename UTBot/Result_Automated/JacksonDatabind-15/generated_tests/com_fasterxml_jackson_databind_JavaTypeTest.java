package com.fasterxml.jackson.databind;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_JavaTypeTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hashCode()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHashCode_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        
        int actual = collectionType.hashCode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isInterface
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInterface()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isInterface()}
 * @utbot.invokes {@link java.lang.Class#isInterface()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsInterface_ClassIsInterface() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = collectionType._class;
        
        boolean actual = collectionType.isInterface();
        
        assertFalse(actual);
        
        Class finalCollectionType_class = collectionType._class;
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isInterface()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isInterface()}
 * @utbot.invokes {@link java.lang.Class#isInterface()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testIsInterface_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isInterface] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isInterface(JavaType.java:262) */
        collectionType.isInterface();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isPrimitive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPrimitive()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isPrimitive()}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsPrimitive_ClassIsPrimitive() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = collectionType._class;
        
        boolean actual = collectionType.isPrimitive();
        
        assertFalse(actual);
        
        Class finalCollectionType_class = collectionType._class;
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPrimitive()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isPrimitive()}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testIsPrimitive_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isPrimitive(JavaType.java:265) */
        collectionType.isPrimitive();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getGenericSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getGenericSignature()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getGenericSignature()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getGenericSignature(java.lang.StringBuilder)}
 *  */
    @Test
    public void testGetGenericSignature_JavaTypeGetGenericSignature() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType collectionType_elementType = ((JavaType) getFieldValue(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class initialCollectionType_elementType_class = ((Class) getFieldValue(collectionType_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionType_class = collectionType._class;
        
        String actual = collectionType.getGenericSignature();
        
        String expected = "Ljava/lang/Object<Ljava/lang/Object;>;";
        
        assertEquals(expected, actual);
        
        JavaType collectionType_elementType1 = ((JavaType) getFieldValue(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class finalCollectionType_elementType_class = ((Class) getFieldValue(collectionType_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionType_class = collectionType._class;
        
        assertFalse(initialCollectionType_elementType_class == finalCollectionType_elementType_class);
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGenericSignature()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getGenericSignature()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:199)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:152)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        collectionType.getGenericSignature();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getGenericSignature()
    
    @Test
    public void testGetGenericSignature1() throws Exception  {
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getGenericSignature(ArrayType.java:235)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        arrayType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature2() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:104)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:227)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        simpleType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature3() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:152)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:152)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        collectionLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature4() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getGenericSignature(ArrayType.java:235)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:152)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        collectionLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature5() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:104)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:227)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:152)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        collectionLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature6() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:152)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:199)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        mapType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature7() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:199)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:199)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        mapLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature8() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:200)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        mapType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature9() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getGenericSignature(ArrayType.java:235)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:199)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        mapLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature10() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:104)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:227)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:199)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        mapLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature11() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = {null, null, null, null, null, null, null, null, null};
        setField(_elementType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:231)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:152)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:403) */
        collectionLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature12() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException] */
        collectionLikeType.getGenericSignature();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isFinal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isFinal()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isFinal()}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.invokes {@link java.lang.reflect.Modifier#isFinal(int)}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsFinal_ModifierIsFinal() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = collectionType._class;
        
        boolean actual = collectionType.isFinal();
        
        assertFalse(actual);
        
        Class finalCollectionType_class = collectionType._class;
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isFinal()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isFinal()}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testIsFinal_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isFinal] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isFinal(JavaType.java:268) */
        collectionType.isFinal();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isAbstract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAbstract()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isAbstract()}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.invokes {@link java.lang.reflect.Modifier#isAbstract(int)}
 * @utbot.returnsFrom {@code return Modifier.isAbstract(_class.getModifiers());}
 *  */
    @Test
    public void testIsAbstract_ModifierIsAbstract() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = collectionLikeType._class;
        
        boolean actual = collectionLikeType.isAbstract();
        
        assertFalse(actual);
        
        Class finalCollectionLikeType_class = collectionLikeType._class;
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isAbstract()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isAbstract()}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Modifier.isAbstract(_class.getModifiers());
 *  */
    @Test
    public void testIsAbstract_ThrowNullPointerException() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isAbstract] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isAbstract(JavaType.java:232) */
        simpleType.isAbstract();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueHandler()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getValueHandler()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetValueHandler_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        Object actual = collectionType.getValueHandler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isConcrete
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isConcrete()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isConcrete()}
 * @utbot.executesCondition {@code ((mod & (Modifier.INTERFACE | Modifier.ABSTRACT)) == 0): True}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsConcrete_ModBitwiseAndModifierINTERFACEBitwiseOrModifierABSTRACTEqualsZero() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = simpleType._class;
        
        boolean actual = simpleType.isConcrete();
        
        assertTrue(actual);
        
        Class finalSimpleType_class = simpleType._class;
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isConcrete()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isConcrete()}
 * @utbot.invokes {@link java.lang.Class#getModifiers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int mod = _class.getModifiers();
 *  */
    @Test
    public void testIsConcrete_ThrowNullPointerException() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isConcrete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isConcrete(JavaType.java:242) */
        simpleType.isConcrete();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.hasRawClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasRawClass(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasRawClass(java.lang.Class)}
 * @utbot.executesCondition {@code (public ): False}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHasRawClass_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = collectionType._class;
        
        boolean actual = collectionType.hasRawClass(null);
        
        assertFalse(actual);
        
        Class finalCollectionType_class = collectionType._class;
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasRawClass(java.lang.Class)}
 * @utbot.executesCondition {@code (public ): True}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHasRawClass_Return_1() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        boolean actual = simpleType.hasRawClass(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.widenBy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method widenBy(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#widenBy(java.lang.Class)}
 * @utbot.executesCondition {@code (superclass == _class): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#_assertSubclass(java.lang.Class,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#_widen(java.lang.Class)}
 *  */
    @Test
    public void testWidenBy_SuperclassNotEquals_class() throws Exception  {
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialArrayType_class = arrayType._class;
        
        ArrayType actual = ((ArrayType) arrayType.widenBy(_class));
        
        // com.fasterxml.jackson.databind.type.ArrayType has overridden equals method
        assertEquals(arrayType, actual);
        
        Class finalArrayType_class = arrayType._class;
        
        Class final_class = _class;
        
        assertFalse(initialArrayType_class == finalArrayType_class);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method widenBy(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#widenBy(java.lang.Class)}
 * @utbot.executesCondition {@code (superclass == _class): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#_assertSubclass(java.lang.Class,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _assertSubclass(_class, superclass);
 *  */
    @Test
    public void testWidenBy_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.widenBy] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(CollectionLikeType.java:32)
            com.fasterxml.jackson.databind.type.CollectionType.<init>(CollectionType.java:22)
            com.fasterxml.jackson.databind.type.CollectionType._narrow(CollectionType.java:27)
            com.fasterxml.jackson.databind.JavaType._widen(JavaType.java:207)
            com.fasterxml.jackson.databind.JavaType.widenBy(JavaType.java:197) */
        collectionType.widenBy(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method widenBy(java.lang.Class)
    
    @Test
    public void testWidenBy1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.widenBy] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:20)
            com.fasterxml.jackson.databind.type.MapType._narrow(MapType.java:30)
            com.fasterxml.jackson.databind.JavaType._widen(JavaType.java:207)
            com.fasterxml.jackson.databind.JavaType.widenBy(JavaType.java:197) */
        mapType.widenBy(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.narrowBy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method narrowBy(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#narrowBy(java.lang.Class)}
 * @utbot.executesCondition {@code (subclass == _class): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#_assertSubclass(java.lang.Class,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#_narrow(java.lang.Class)}
 *  */
    @Test
    public void testNarrowBy_SubclassNotEquals_class() throws Exception  {
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialArrayType_class = arrayType._class;
        
        ArrayType actual = ((ArrayType) arrayType.narrowBy(_class));
        
        // com.fasterxml.jackson.databind.type.ArrayType has overridden equals method
        assertEquals(arrayType, actual);
        
        Class finalArrayType_class = arrayType._class;
        
        Class final_class = _class;
        
        assertFalse(initialArrayType_class == finalArrayType_class);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method narrowBy(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#narrowBy(java.lang.Class)}
 * @utbot.executesCondition {@code (subclass == _class): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#_assertSubclass(java.lang.Class,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _assertSubclass(subclass, _class);
 *  */
    @Test
    public void testNarrowBy_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.narrowBy] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.JavaType._assertSubclass(JavaType.java:448)
            com.fasterxml.jackson.databind.JavaType.narrowBy(JavaType.java:149) */
        collectionType.narrowBy(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.containedTypeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containedTypeName(int)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#containedTypeName(int)}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testContainedTypeName_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        String actual = collectionType.containedTypeName(-255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getRawClass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRawClass()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetRawClass_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        Class actual = collectionType.getRawClass();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isMapLikeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isMapLikeType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isMapLikeType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsMapLikeType_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        boolean actual = collectionType.isMapLikeType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.forcedNarrowBy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forcedNarrowBy(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#forcedNarrowBy(java.lang.Class)}
 * @utbot.executesCondition {@code (subclass == _class): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testForcedNarrowBy_SubclassEquals_class() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        SimpleType actual = ((SimpleType) simpleType.forcedNarrowBy(null));
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(simpleType, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forcedNarrowBy(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#forcedNarrowBy(java.lang.Class)}
 * @utbot.executesCondition {@code (subclass == _class): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#_narrow(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: JavaType result = _narrow(subclass);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testForcedNarrowBy_ThrowIllegalArgumentException() throws Exception  {
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class class1 = Object.class;
        
        arrayType.forcedNarrowBy(class1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method forcedNarrowBy(java.lang.Class)
    
    @Test
    public void testForcedNarrowBy1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.forcedNarrowBy] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:38)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:20)
            com.fasterxml.jackson.databind.type.MapType._narrow(MapType.java:30)
            com.fasterxml.jackson.databind.JavaType.forcedNarrowBy(JavaType.java:172) */
        mapType.forcedNarrowBy(class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.containedTypeCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containedTypeCount()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#containedTypeCount()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testContainedTypeCount_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        int actual = collectionType.containedTypeCount();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isEnumType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEnumType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isEnumType()}
 * @utbot.invokes {@link java.lang.Class#isEnum()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsEnumType_ClassIsEnum() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = collectionType._class;
        
        boolean actual = collectionType.isEnumType();
        
        assertFalse(actual);
        
        Class finalCollectionType_class = collectionType._class;
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEnumType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isEnumType()}
 * @utbot.invokes {@link java.lang.Class#isEnum()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testIsEnumType_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isEnumType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isEnumType(JavaType.java:259) */
        collectionType.isEnumType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.useStaticType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method useStaticType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#useStaticType()}
 * @utbot.returnsFrom {@code return _asStatic;}
 *  */
    @Test
    public void testUseStaticType_Return_asStatic() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        boolean actual = collectionType.useStaticType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isArrayType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isArrayType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isArrayType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsArrayType_Return() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        boolean actual = simpleType.isArrayType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeHandler()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getTypeHandler()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetTypeHandler_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        Object actual = collectionType.getTypeHandler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.hasGenericTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasGenericTypes()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasGenericTypes()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHasGenericTypes_Return() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        boolean actual = collectionLikeType.hasGenericTypes();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasGenericTypes()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHasGenericTypes_Return_1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        boolean actual = mapLikeType.hasGenericTypes();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasGenericTypes()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHasGenericTypes_Return_3() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _typeParameters = {null};
        setField(simpleType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters", _typeParameters);
        
        boolean actual = simpleType.hasGenericTypes();
        
        assertTrue(actual);
        
        com.fasterxml.jackson.databind.JavaType[] simpleType_typeParameters = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(simpleType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeParameters"));
        JavaType finalSimpleType_typeParameters0 = ((JavaType) get(simpleType_typeParameters, 0));
        
        assertNull(finalSimpleType_typeParameters0);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasGenericTypes()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHasGenericTypes_Return_2() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        boolean actual = simpleType.hasGenericTypes();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.containedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containedType(int)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#containedType(int)}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testContainedType_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        JavaType actual = collectionType.containedType(-255);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType._assertSubclass
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _assertSubclass(java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#_assertSubclass(java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code (!_class.isAssignableFrom(subclass)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_class.isAssignableFrom(subclass)
 *  */
    @Test
    public void test_assertSubclass_ThrowNullPointerException_1() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType._assertSubclass] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.JavaType._assertSubclass(JavaType.java:448) */
        simpleType._assertSubclass(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#_assertSubclass(java.lang.Class,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_class.isAssignableFrom(subclass)
 *  */
    @Test
    public void test_assertSubclass_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType._assertSubclass] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType._assertSubclass(JavaType.java:448) */
        collectionType._assertSubclass(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getKeyType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKeyType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getKeyType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetKeyType_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        JavaType actual = collectionType.getKeyType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getErasedSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErasedSignature()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getErasedSignature()}
 *  */
    @Test
    public void testGetErasedSignature() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        Class _class = Object.class;
        setField(collectionType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionType_class = collectionType._class;
        
        String actual = collectionType.getErasedSignature();
        
        String expected = "Ljava/lang/Object;";
        
        assertEquals(expected, actual);
        
        Class finalCollectionType_class = collectionType._class;
        
        assertFalse(initialCollectionType_class == finalCollectionType_class);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getErasedSignature()}
 *  */
    @Test
    public void testGetErasedSignature_1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = mapType._class;
        
        String actual = mapType.getErasedSignature();
        
        String expected = "Ljava/lang/Object;";
        
        assertEquals(expected, actual);
        
        Class finalMapType_class = mapType._class;
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getErasedSignature()
    
    @Test
    public void testGetErasedSignature1() throws Exception  {
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getErasedSignature(ArrayType.java:241)
            com.fasterxml.jackson.databind.JavaType.getErasedSignature(JavaType.java:424) */
        arrayType.getErasedSignature();
    }
    
    @Test
    public void testGetErasedSignature2() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:104)
            com.fasterxml.jackson.databind.type.SimpleType.getErasedSignature(SimpleType.java:221)
            com.fasterxml.jackson.databind.JavaType.getErasedSignature(JavaType.java:424) */
        simpleType.getErasedSignature();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isThrowable
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isThrowable()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isThrowable()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.returnsFrom {@code public }
 * @utbot.throwsException {@link java.lang.NullPointerException} in: public 
 *  */
    @Test
    public void testIsThrowable_ThrowNullPointerException() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isThrowable] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.JavaType.isThrowable(JavaType.java:253) */
        collectionType.isThrowable();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType._widen
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _widen(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#_widen(java.lang.Class)}
 * @utbot.returnsFrom {@code return _narrow(superclass);}
 *  */
    @Test
    public void test_widen_Return_narrow() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {null};
        setField(simpleType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class class1 = Object.class;
        
        SimpleType actual = ((SimpleType) simpleType._widen(class1));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        java.lang.String[] simpleType_typeNames = ((java.lang.String[]) getFieldValue(simpleType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames"));
        String finalSimpleType_typeNames0 = ((String) get(simpleType_typeNames, 0));
        
        Class finalClass1 = class1;
        
        assertNull(finalSimpleType_typeNames0);
        
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#_widen(java.lang.Class)}
 * @utbot.returnsFrom {@code return _narrow(superclass);}
 *  */
    @Test
    public void test_widen_Return_narrow_1() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        java.lang.String[] _typeNames = {};
        setField(simpleType, "com.fasterxml.jackson.databind.type.SimpleType", "_typeNames", _typeNames);
        Class class1 = Object.class;
        
        SimpleType actual = ((SimpleType) simpleType._widen(class1));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#_widen(java.lang.Class)}
 * @utbot.returnsFrom {@code return _narrow(superclass);}
 *  */
    @Test
    public void test_widen_Return_narrow_2() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class class1 = Object.class;
        
        SimpleType actual = ((SimpleType) simpleType._widen(class1));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _widen(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#_widen(java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#_narrow(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: /**
 *  * <p>
 *  *  Default implementation is just to call {@link #_narrow}, since
 *  *  underlying type construction is usually identical
 *  */
 * protected JavaType _widen(Class<?> superclass) {
 *     return _narrow(superclass);
 * }
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void test_widen_ThrowIllegalArgumentException() throws Exception  {
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class class1 = Object.class;
        
        arrayType._widen(class1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.containedTypeOrUnknown
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containedTypeOrUnknown(int)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#containedTypeOrUnknown(int)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#containedType(int)}
 * @utbot.returnsFrom {@code return (t == null) ? TypeFactory.unknownType() : t;}
 *  */
    @Test
    public void testContainedTypeOrUnknown_JavaTypeContainedType() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        SimpleType actual = ((SimpleType) collectionType.containedTypeOrUnknown(0));
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(_elementType, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method containedTypeOrUnknown(int)
    
    @Test
    public void testContainedTypeOrUnknown1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        SimpleType actual = ((SimpleType) mapLikeType.containedTypeOrUnknown(2));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testContainedTypeOrUnknown2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        SimpleType actual = ((SimpleType) collectionLikeType.containedTypeOrUnknown(-255));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testContainedTypeOrUnknown3() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        SimpleType actual = ((SimpleType) mapLikeType.containedTypeOrUnknown(0));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testContainedTypeOrUnknown4() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        SimpleType actual = ((SimpleType) mapLikeType.containedTypeOrUnknown(1));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testContainedTypeOrUnknown5() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        SimpleType actual = ((SimpleType) collectionLikeType.containedTypeOrUnknown(0));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isCollectionLikeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCollectionLikeType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isCollectionLikeType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsCollectionLikeType_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        boolean actual = collectionType.isCollectionLikeType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetContentType_Return() throws Exception  {
        CollectionType collectionType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        
        JavaType actual = collectionType.getContentType();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1066039992206099 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1066039992206099.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1066039992214000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066039992206099.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066039992214000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1066039992866199 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1066039992866199.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1066039992868400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1066039992866199.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1066039992868400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

