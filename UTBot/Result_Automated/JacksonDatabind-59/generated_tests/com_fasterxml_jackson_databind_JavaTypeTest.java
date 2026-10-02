package com.fasterxml.jackson.databind;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_JavaTypeTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getContentType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetContentType_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        JavaType actual = mapType.getContentType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hashCode()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHashCode_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        
        int actual = mapType.hashCode();
        
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = referenceType._class;
        
        boolean actual = referenceType.isInterface();
        
        assertFalse(actual);
        
        Class finalReferenceType_class = referenceType._class;
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isInterface] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isInterface(JavaType.java:283) */
        mapType.isInterface();
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = referenceType._class;
        
        boolean actual = referenceType.isPrimitive();
        
        assertFalse(actual);
        
        Class finalReferenceType_class = referenceType._class;
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isPrimitive] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isPrimitive(JavaType.java:286) */
        mapType.isPrimitive();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getGenericSignature
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGenericSignature()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getGenericSignature()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        mapLikeType.getGenericSignature();
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getGenericSignature()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        collectionLikeType.getGenericSignature();
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getGenericSignature()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_3() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        collectionLikeType.getGenericSignature();
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getGenericSignature()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:224)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        mapLikeType.getGenericSignature();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getGenericSignature()
    
    @Test
    public void testGetGenericSignature1() throws Exception  {
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getGenericSignature(ArrayType.java:192)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        arrayType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature2() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:194)
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:222)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        referenceType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature3() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:194)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:256)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        simpleType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature4() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        mapType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature5() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _keyType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getGenericSignature(ArrayType.java:192)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        mapLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature6() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:194)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:256)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        mapLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature7() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:224)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        collectionLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature8() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getGenericSignature(ArrayType.java:192)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
        collectionLikeType.getGenericSignature();
    }
    
    @Test
    public void testGetGenericSignature9() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:194)
            com.fasterxml.jackson.databind.type.SimpleType.getGenericSignature(SimpleType.java:256)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194)
            com.fasterxml.jackson.databind.JavaType.getGenericSignature(JavaType.java:499) */
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = referenceType._class;
        
        boolean actual = referenceType.isFinal();
        
        assertFalse(actual);
        
        Class finalReferenceType_class = referenceType._class;
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isFinal] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isFinal(JavaType.java:289) */
        mapType.isFinal();
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = referenceType._class;
        
        boolean actual = referenceType.isAbstract();
        
        assertFalse(actual);
        
        Class finalReferenceType_class = referenceType._class;
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isAbstract] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isAbstract(JavaType.java:253) */
        mapType.isAbstract();
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        boolean actual = mapType.isArrayType();
        
        assertFalse(actual);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isThrowable] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.JavaType.isThrowable(JavaType.java:274) */
        mapType.isThrowable();
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = mapType._class;
        
        boolean actual = mapType.hasRawClass(null);
        
        assertFalse(actual);
        
        Class finalMapType_class = mapType._class;
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasRawClass(java.lang.Class)}
 * @utbot.executesCondition {@code (public ): True}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHasRawClass_Return_1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        boolean actual = mapType.hasRawClass(null);
        
        assertTrue(actual);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        Class actual = mapType.getRawClass();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.forcedNarrowBy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method forcedNarrowBy(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#forcedNarrowBy(java.lang.Class)}
 * @utbot.executesCondition {@code (subclass == _class): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#_narrow(java.lang.Class)}
 *  */
    @Test
    public void testForcedNarrowBy_SubclassNotEquals_class() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialSimpleType_class = simpleType._class;
        
        SimpleType actual = ((SimpleType) simpleType.forcedNarrowBy(_class));
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(simpleType, actual);
        
        Class finalSimpleType_class = simpleType._class;
        
        Class final_class = _class;
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forcedNarrowBy(java.lang.Class)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testForcedNarrowBy1() throws Exception  {
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        arrayType.forcedNarrowBy(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.hasContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasContentType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasContentType()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHasContentType_ReturnTrue() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        boolean actual = mapType.hasContentType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isTypeOrSubTypeOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isTypeOrSubTypeOf(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isTypeOrSubTypeOf(java.lang.Class)}
 * @utbot.returnsFrom {@code return (_class == clz) || (clz.isAssignableFrom(_class));}
 *  */
    @Test
    public void testIsTypeOrSubTypeOf__classEqualsClzOrClzIsAssignableFrom() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        boolean actual = referenceType.isTypeOrSubTypeOf(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isTypeOrSubTypeOf(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isTypeOrSubTypeOf(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_class == clz) || (clz.isAssignableFrom(_class));
 *  */
    @Test
    public void testIsTypeOrSubTypeOf_ThrowNullPointerException() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isTypeOrSubTypeOf] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isTypeOrSubTypeOf(JavaType.java:248) */
        referenceType.isTypeOrSubTypeOf(null);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isTypeOrSubTypeOf(java.lang.Class)}
 * @utbot.returnsFrom {@code return (_class == clz) || (clz.isAssignableFrom(_class));}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_class == clz) || (clz.isAssignableFrom(_class));
 *  */
    @Test
    public void testIsTypeOrSubTypeOf_ThrowNullPointerException_1() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isTypeOrSubTypeOf] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.JavaType.isTypeOrSubTypeOf(JavaType.java:248) */
        referenceType.isTypeOrSubTypeOf(class1);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = mapType._class;
        
        boolean actual = mapType.isConcrete();
        
        assertTrue(actual);
        
        Class finalMapType_class = mapType._class;
        
        assertFalse(initialMapType_class == finalMapType_class);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isConcrete] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isConcrete(JavaType.java:263) */
        mapType.isConcrete();
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        Object actual = mapType.getValueHandler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.hasGenericTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasGenericTypes()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasGenericTypes()}
 * @utbot.executesCondition {@code (public ): False}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHasGenericTypes_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(mapType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        boolean actual = mapType.hasGenericTypes();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasGenericTypes()}
 * @utbot.executesCondition {@code (public ): True}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testHasGenericTypes_Return_1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        boolean actual = mapLikeType.hasGenericTypes();
        
        assertTrue(actual);
        
        TypeBindings mapLikeType_bindings = ((TypeBindings) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_bindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalMapLikeType_bindings_types0 = ((JavaType) get(mapLikeType_bindings_bindings_types, 0));
        
        assertNull(finalMapLikeType_bindings_types0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.hasHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasHandlers()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasHandlers()}
 * @utbot.returnsFrom {@code return (_typeHandler != null) || (_valueHandler != null);}
 *  */
    @Test
    public void testHasHandlers__typeHandlerNotEqualsNullOr_valueHandlerNotEqualsNull() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        boolean actual = mapType.hasHandlers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasHandlers()}
 * @utbot.returnsFrom {@code return (_typeHandler != null) || (_valueHandler != null);}
 *  */
    @Test
    public void testHasHandlers__typeHandlerNotEqualsNullOr_valueHandlerNotEqualsNull_1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        boolean actual = mapType.hasHandlers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasHandlers()}
 * @utbot.returnsFrom {@code return (_typeHandler != null) || (_valueHandler != null);}
 *  */
    @Test
    public void testHasHandlers__typeHandlerEqualsNullOr_valueHandlerEqualsNull() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        boolean actual = simpleType.hasHandlers();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getParameterSource
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParameterSource()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getParameterSource()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetParameterSource_ReturnNull() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        Class actual = mapType.getParameterSource();
        
        assertNull(actual);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        Object actual = mapType.getTypeHandler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.hasValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasValueHandler()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasValueHandler()}
 * @utbot.returnsFrom {@code return _valueHandler != null;}
 *  */
    @Test
    public void testHasValueHandler_Return_valueHandlerEqualsNull_1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        boolean actual = mapType.hasValueHandler();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#hasValueHandler()}
 * @utbot.returnsFrom {@code return _valueHandler != null;}
 *  */
    @Test
    public void testHasValueHandler_Return_valueHandlerEqualsNull() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        boolean actual = mapType.hasValueHandler();
        
        assertFalse(actual);
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
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getErasedSignature()}
 *  */
    @Test
    public void testGetErasedSignature_1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = collectionLikeType._class;
        
        String actual = collectionLikeType.getErasedSignature();
        
        String expected = "Ljava/lang/Object;";
        
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = collectionLikeType._class;
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getErasedSignature()
    
    @Test
    public void testGetErasedSignature1() throws Exception  {
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ArrayType.getErasedSignature(ArrayType.java:198)
            com.fasterxml.jackson.databind.JavaType.getErasedSignature(JavaType.java:520) */
        arrayType.getErasedSignature();
    }
    
    @Test
    public void testGetErasedSignature2() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:194)
            com.fasterxml.jackson.databind.type.SimpleType.getErasedSignature(SimpleType.java:250)
            com.fasterxml.jackson.databind.JavaType.getErasedSignature(JavaType.java:520) */
        simpleType.getErasedSignature();
    }
    
    @Test
    public void testGetErasedSignature3() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:194)
            com.fasterxml.jackson.databind.type.ReferenceType.getErasedSignature(ReferenceType.java:216)
            com.fasterxml.jackson.databind.JavaType.getErasedSignature(JavaType.java:520) */
        referenceType.getErasedSignature();
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
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialReferenceType_class = referenceType._class;
        
        boolean actual = referenceType.isEnumType();
        
        assertFalse(actual);
        
        Class finalReferenceType_class = referenceType._class;
        
        assertFalse(initialReferenceType_class == finalReferenceType_class);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.isEnumType] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.isEnumType(JavaType.java:280) */
        mapType.isEnumType();
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        JavaType actual = mapType.getKeyType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.isJavaLangObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isJavaLangObject()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isJavaLangObject()}
 * @utbot.returnsFrom {@code return _class == Object.class;}
 *  */
    @Test
    public void testIsJavaLangObject_Return_classNotEqualsObjectClass_1() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapType_class = mapType._class;
        
        boolean actual = mapType.isJavaLangObject();
        
        assertTrue(actual);
        
        Class finalMapType_class = mapType._class;
        
        assertFalse(initialMapType_class == finalMapType_class);
    }
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#isJavaLangObject()}
 * @utbot.returnsFrom {@code return _class == Object.class;}
 *  */
    @Test
    public void testIsJavaLangObject_Return_classNotEqualsObjectClass() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        boolean actual = mapType.isJavaLangObject();
        
        assertFalse(actual);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        boolean actual = mapType.useStaticType();
        
        assertFalse(actual);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        boolean actual = mapType.isMapLikeType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getReferencedType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferencedType()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getReferencedType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetReferencedType_Return() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        JavaType actual = mapType.getReferencedType();
        
        assertNull(actual);
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
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        boolean actual = mapType.isCollectionLikeType();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getContentValueHandler
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContentValueHandler()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getContentValueHandler()}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testGetContentValueHandler_ThrowNullPointerException() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getContentValueHandler] produces [java.lang.NullPointerException] */
        mapType.getContentValueHandler();
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
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = new com.fasterxml.jackson.databind.JavaType[1];
        MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        _types[0] = ((JavaType) mapLikeType1);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        MapLikeType actual = ((MapLikeType) mapLikeType.containedTypeOrUnknown(0));
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(mapLikeType1, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method containedTypeOrUnknown(int)
    
    @Test
    public void testContainedTypeOrUnknown1() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        SimpleType actual = ((SimpleType) resolvedRecursiveType.containedTypeOrUnknown(Integer.MIN_VALUE));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testContainedTypeOrUnknown2() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null, null, null, null, null, null, null, null, null};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        SimpleType actual = ((SimpleType) resolvedRecursiveType.containedTypeOrUnknown(1073741824));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types1 = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types1);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        TypeBindings resolvedRecursiveType_bindings = ((TypeBindings) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] resolvedRecursiveType_bindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(resolvedRecursiveType_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalResolvedRecursiveType_bindings_types0 = ((JavaType) get(resolvedRecursiveType_bindings_bindings_types, 0));
        TypeBindings resolvedRecursiveType_bindings1 = ((TypeBindings) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] resolvedRecursiveType_bindings1_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(resolvedRecursiveType_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalResolvedRecursiveType_bindings_types1 = ((JavaType) get(resolvedRecursiveType_bindings1_bindings_types, 1));
        TypeBindings resolvedRecursiveType_bindings2 = ((TypeBindings) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] resolvedRecursiveType_bindings2_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(resolvedRecursiveType_bindings2, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalResolvedRecursiveType_bindings_types2 = ((JavaType) get(resolvedRecursiveType_bindings2_bindings_types, 2));
        TypeBindings resolvedRecursiveType_bindings3 = ((TypeBindings) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] resolvedRecursiveType_bindings3_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(resolvedRecursiveType_bindings3, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalResolvedRecursiveType_bindings_types3 = ((JavaType) get(resolvedRecursiveType_bindings3_bindings_types, 3));
        TypeBindings resolvedRecursiveType_bindings4 = ((TypeBindings) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] resolvedRecursiveType_bindings4_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(resolvedRecursiveType_bindings4, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalResolvedRecursiveType_bindings_types4 = ((JavaType) get(resolvedRecursiveType_bindings4_bindings_types, 4));
        TypeBindings resolvedRecursiveType_bindings5 = ((TypeBindings) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] resolvedRecursiveType_bindings5_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(resolvedRecursiveType_bindings5, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalResolvedRecursiveType_bindings_types5 = ((JavaType) get(resolvedRecursiveType_bindings5_bindings_types, 5));
        TypeBindings resolvedRecursiveType_bindings6 = ((TypeBindings) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] resolvedRecursiveType_bindings6_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(resolvedRecursiveType_bindings6, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalResolvedRecursiveType_bindings_types6 = ((JavaType) get(resolvedRecursiveType_bindings6_bindings_types, 6));
        TypeBindings resolvedRecursiveType_bindings7 = ((TypeBindings) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] resolvedRecursiveType_bindings7_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(resolvedRecursiveType_bindings7, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalResolvedRecursiveType_bindings_types7 = ((JavaType) get(resolvedRecursiveType_bindings7_bindings_types, 7));
        TypeBindings resolvedRecursiveType_bindings8 = ((TypeBindings) getFieldValue(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] resolvedRecursiveType_bindings8_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(resolvedRecursiveType_bindings8, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalResolvedRecursiveType_bindings_types8 = ((JavaType) get(resolvedRecursiveType_bindings8_bindings_types, 8));
        
        assertNull(finalResolvedRecursiveType_bindings_types0);
        
        assertNull(finalResolvedRecursiveType_bindings_types1);
        
        assertNull(finalResolvedRecursiveType_bindings_types2);
        
        assertNull(finalResolvedRecursiveType_bindings_types3);
        
        assertNull(finalResolvedRecursiveType_bindings_types4);
        
        assertNull(finalResolvedRecursiveType_bindings_types5);
        
        assertNull(finalResolvedRecursiveType_bindings_types6);
        
        assertNull(finalResolvedRecursiveType_bindings_types7);
        
        assertNull(finalResolvedRecursiveType_bindings_types8);
    }
    
    @Test
    public void testContainedTypeOrUnknown3() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        com.fasterxml.jackson.databind.JavaType[] _types = {null};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        SimpleType actual = ((SimpleType) mapLikeType.containedTypeOrUnknown(0));
        
        SimpleType expected = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types1 = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types1);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        Class _class = Object.class;
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.SimpleType has overridden equals method
        assertEquals(expected, actual);
        
        TypeBindings mapLikeType_bindings = ((TypeBindings) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings"));
        com.fasterxml.jackson.databind.JavaType[] mapLikeType_bindings_bindings_types = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(mapLikeType_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types"));
        JavaType finalMapLikeType_bindings_types0 = ((JavaType) get(mapLikeType_bindings_bindings_types, 0));
        
        assertNull(finalMapLikeType_bindings_types0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.JavaType.getContentTypeHandler
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContentTypeHandler()
    
    /**
    @utbot.classUnderTest {@link JavaType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.JavaType#getContentTypeHandler()}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testGetContentTypeHandler_ThrowNullPointerException() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.JavaType.getContentTypeHandler] produces [java.lang.NullPointerException] */
        mapType.getContentTypeHandler();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1078422548603900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1078422548603900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1078422548609300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078422548603900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078422548609300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1078422549334900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1078422549334900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1078422549336300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078422549334900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078422549336300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

