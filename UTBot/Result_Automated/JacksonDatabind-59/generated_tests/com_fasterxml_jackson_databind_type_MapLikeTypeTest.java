package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_databind_type_MapLikeTypeTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.construct
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method construct(java.lang.Class, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#construct(java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeVariable<?>[] vars = rawType.getTypeParameters();
 *  */
    @Test
    public void testConstruct_ThrowNullPointerException_1() {
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.construct] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:39)
            com.fasterxml.jackson.databind.type.MapLikeType.construct(MapLikeType.java:85) */
        MapLikeType.construct(class1, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#construct(java.lang.Class,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeVariable<?>[] vars = rawType.getTypeParameters();
 *  */
    @Test
    public void testConstruct_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.construct] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.construct(MapLikeType.java:78) */
        MapLikeType.construct(null, null, null);
    }
    ///endregion
    
    ///region Errors report for construct
    
    public void testConstruct_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.isContainerType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isContainerType()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#isContainerType()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsContainerType_ReturnTrue() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        
        boolean actual = mapLikeType.isContainerType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.isMapLikeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isMapLikeType()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#isMapLikeType()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsMapLikeType_ReturnTrue() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        
        boolean actual = mapLikeType.isMapLikeType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.getKeyType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKeyType()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#getKeyType()}
 * @utbot.returnsFrom {@code return _keyType;}
 *  */
    @Test
    public void testGetKeyType_Return_keyType() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        
        JavaType actual = mapLikeType.getKeyType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildCanonicalName()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#buildCanonicalName()}
 * @utbot.executesCondition {@code (_keyType != null): False}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testBuildCanonicalName__keyTypeEqualsNull() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapLikeType.buildCanonicalName();
        
        String expected = "java.lang.Object";
        
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildCanonicalName()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#buildCanonicalName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(_class.getName());
 *  */
    @Test
    public void testBuildCanonicalName_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:170) */
        mapLikeType.buildCanonicalName();
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#buildCanonicalName()}
 * @utbot.executesCondition {@code (_keyType != null): True}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#toCanonical()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#toCanonical()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(_valueType.toCanonical());
 *  */
    @Test
    public void testBuildCanonicalName_ThrowNullPointerException_1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _keyType._canonicalName = _canonicalName;
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:175) */
        mapLikeType.buildCanonicalName();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method buildCanonicalName()
    
    @Test
    public void testBuildCanonicalName1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _keyType._canonicalName = _canonicalName;
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        _valueType._canonicalName = _canonicalName;
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapLikeType.buildCanonicalName();
        
        String expected = "java.lang.Object<,>";
        
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    @Test
    public void testBuildCanonicalName2() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _keyType._canonicalName = _canonicalName;
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapLikeType.buildCanonicalName();
        
        String expected = "java.lang.Object<,java.lang.Object>";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    @Test
    public void testBuildCanonicalName3() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        _keyType._canonicalName = _canonicalName;
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapLikeType.buildCanonicalName();
        
        String expected = "java.lang.Object<\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000,java.lang.Object>";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildCanonicalName()
    
    @Test(expected = StackOverflowError.class)
    public void testBuildCanonicalName4() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _keyType);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        mapLikeType.buildCanonicalName();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildCanonicalName5() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _keyType);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        mapLikeType.buildCanonicalName();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testBuildCanonicalName6() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName7() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:166)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173) */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName8() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:168)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173) */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName9() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.buildCanonicalName(ReferenceType.java:166)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:205)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173) */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName10() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ResolvedRecursiveType _keyType1 = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase.buildCanonicalName(TypeBase.java:74)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173) */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName11() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        _keyType._canonicalName = _canonicalName;
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException] */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName12() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:175) */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName13() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "";
        _elementType._canonicalName = _canonicalName;
        setField(_keyType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException] */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName14() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:202)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:205)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173) */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName15() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException] */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName16() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:170)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173) */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName17() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        ResolvedRecursiveType _keyType1 = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        String _canonicalName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        _keyType1._canonicalName = _canonicalName;
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException] */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName18() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionType _keyType1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:202)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173) */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName19() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:175) */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName20() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:175) */
        mapLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName21() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:170)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:205)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:173) */
        mapLikeType.buildCanonicalName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType._narrow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _narrow(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#_narrow(java.lang.Class)}
 * @utbot.returnsFrom {@code return new MapLikeType(subclass, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void test_narrow_Return() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 127);
        byte[] _typeHandler = {};
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        JavaType javaType = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = ((MapLikeType) mapLikeType._narrow(_class));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876883);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapLikeType._valueType;
        Object finalMapLikeType_valueType_valueHandler = getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        Object finalMapLikeType_valueHandler = getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
        
        Class final_class = _class;
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertNull(finalMapLikeType_valueType_valueHandler);
        
        assertNull(finalMapLikeType_valueHandler);
        
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#_narrow(java.lang.Class)}
 * @utbot.returnsFrom {@code return new MapLikeType(subclass, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -129);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _valueHandler);
            Class class1 = Object.class;
            
            MapLikeType actual = ((MapLikeType) mapLikeType._narrow(class1));
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876883);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _valueHandler);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.withTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, h, _asStatic);}
 *  */
    @Test
    public void testWithTypeHandler_Return() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withTypeHandler(((Object) null));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, _valueHandler, h, _asStatic);}
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -5);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -5);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withTypeHandler(((Object) null));
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.withKeyType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withKeyType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (keyType == _keyType): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithKeyType_KeyTypeEquals_keyType() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        
        MapLikeType actual = mapLikeType.withKeyType(null);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(mapLikeType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (keyType == _keyType): False}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyType_KeyTypeNotEquals_keyType() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withKeyType(mapLikeType1);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", mapLikeType1);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (keyType == _keyType): False}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyType_KeyTypeNotEquals_keyType_1() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(mapLikeType1, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withKeyType(mapLikeType1);
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", mapLikeType1);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.withValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, h, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithValueHandler_Return() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withValueHandler(((Object) null));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType, h, _typeHandler, _asStatic);}
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withValueHandler(((Object) null));
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.refine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method refine(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#refine(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return new MapLikeType(rawType, bindings, superClass, superInterfaces, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testRefine_Return() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        MapLikeType actual = ((MapLikeType) mapLikeType.refine(class1, typeBindings, null, null));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#refine(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return new MapLikeType(rawType, bindings, superClass, superInterfaces, _keyType, _valueType, _valueHandler, _typeHandler, _asStatic);}
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -1);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            short[] _valueHandler = {};
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            int[][] _typeHandler = {};
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            Class class1 = Object.class;
            
            MapLikeType actual = ((MapLikeType) mapLikeType.refine(class1, null, null, null));
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.withContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_valueType == contentType): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithContentType__valueTypeEqualsContentType() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        
        MapLikeType actual = ((MapLikeType) mapLikeType.withContentType(null));
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(mapLikeType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_valueType == contentType): False}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, contentType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentType__valueTypeNotEqualsContentType() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = ((MapLikeType) mapLikeType.withContentType(mapLikeType1));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", mapLikeType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_valueType == contentType): False}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, contentType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentType__valueTypeNotEqualsContentType_1() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            MapLikeType mapLikeType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(mapLikeType1, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
            
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = ((MapLikeType) mapLikeType.withContentType(mapLikeType1));
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", mapLikeType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithStaticTyping__asStatic() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        MapLikeType actual = mapLikeType.withStaticTyping();
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(mapLikeType, actual);
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
    /// return from: {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withStaticTyping(), _valueHandler, _typeHandler, true);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withStaticTyping()}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Return_2() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withStaticTyping();
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withStaticTyping()}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Return() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -8192);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        int[] _valueHandler = {};
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        byte[] _typeHandler = {};
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withStaticTyping();
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063884948);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withStaticTyping()}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Return_1() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            Class _class = Object.class;
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withStaticTyping();
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withStaticTyping()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superInterfaces
 *  */
    @Test
    public void testWithStaticTyping_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156) */
        mapLikeType.withStaticTyping();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withStaticTyping()
    
    @Test
    public void testWithStaticTyping1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {};
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withStaticTyping();
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
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
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    @Test
    public void testWithStaticTyping2() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {};
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withStaticTyping();
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
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
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withStaticTyping()
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping3() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        
        mapLikeType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping4() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapLikeType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping5() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapLikeType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping6() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        
        mapLikeType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping7() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _valueType2);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        ReferenceType _superClass = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        Class _class = Object.class;
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        ReferenceType _superClass1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass1);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = new com.fasterxml.jackson.databind.JavaType[18];
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings2 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings2);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        SimpleType _superClass2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass2);
        
        mapLikeType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping8() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapLikeType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping9() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapLikeType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping10() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _valueType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapLikeType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping11() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType2);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapLikeType.withStaticTyping();
    }
    
    @Test(expected = StackOverflowError.class)
    public void testWithStaticTyping12() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _valueType2);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping13() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:39)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156) */
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping14() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _keyType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException] */
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping15() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:39)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156) */
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping16() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:101)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:10)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156) */
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping17() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:39)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:23)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:101)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:10)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156) */
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping18() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:39)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:23)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:101)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:10)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156) */
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping19() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:39)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:23)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:101)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:10)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156) */
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping20() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:39)
            com.fasterxml.jackson.databind.type.MapType.<init>(MapType.java:23)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:101)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:10)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156) */
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping21() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:101)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:10)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:101)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:10)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:101)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:10)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156) */
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping22() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException] */
        mapLikeType.withStaticTyping();
    }
    
    @Test
    public void testWithStaticTyping23() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
            com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
            com.fasterxml.jackson.databind.type.SimpleType.<init>(SimpleType.java:68)
            com.fasterxml.jackson.databind.type.ReferenceType.<init>(ReferenceType.java:34)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:150)
            com.fasterxml.jackson.databind.type.ReferenceType.withStaticTyping(ReferenceType.java:13)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:101)
            com.fasterxml.jackson.databind.type.MapType.withStaticTyping(MapType.java:10)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:16)
            com.fasterxml.jackson.databind.type.MapLikeType.withStaticTyping(MapLikeType.java:156) */
        mapLikeType.withStaticTyping();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method upgradeFrom(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#upgradeFrom(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (baseType instanceof TypeBase): True}
 * @utbot.returnsFrom {@code return new MapLikeType((TypeBase) baseType, keyT, valueT);}
 *  */
    @Test
    public void testUpgradeFrom_BaseTypeInstanceOfTypeBase() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        MapLikeType actual = MapLikeType.upgradeFrom(mapType, null, null);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method upgradeFrom(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#upgradeFrom(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (baseType instanceof TypeBase): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: "Can not upgrade from an instance of " + baseType.getClass()
 *  */
    @Test
    public void testUpgradeFrom_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.upgradeFrom(MapLikeType.java:69) */
        MapLikeType.upgradeFrom(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.withKeyTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withKeyTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType.withTypeHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyTypeHandler_Return_1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withKeyTypeHandler(null);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyTypeHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.MapType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType.withTypeHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyTypeHandler_Return() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _keyType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            Class _class = Object.class;
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapLikeType._keyType;
            JavaType javaType_keyType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            JavaType javaType_keyType_keyType_keyType_keyType_keyType = ((JavaType) getFieldValue(javaType_keyType_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialMapLikeType_keyType_keyType_keyType_class = ((Class) getFieldValue(javaType_keyType_keyType_keyType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapLikeType._keyType;
            JavaType javaType1_keyType_keyType = ((JavaType) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialMapLikeType_keyType_keyType_class = ((Class) getFieldValue(javaType1_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType2 = mapLikeType._keyType;
            Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withKeyTypeHandler(null);
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _keyType3 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType3, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType3, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType3, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType3);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType3 = mapLikeType._keyType;
            JavaType javaType3_keyType_keyType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            JavaType javaType3_keyType_keyType_keyType_keyType_keyType = ((JavaType) getFieldValue(javaType3_keyType_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalMapLikeType_keyType_keyType_keyType_class = ((Class) getFieldValue(javaType3_keyType_keyType_keyType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType4 = mapLikeType._keyType;
            JavaType javaType4_keyType_keyType = ((JavaType) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalMapLikeType_keyType_keyType_class = ((Class) getFieldValue(javaType4_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType5 = mapLikeType._keyType;
            Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_keyType_keyType_keyType_class == finalMapLikeType_keyType_keyType_keyType_class);
            
            assertFalse(initialMapLikeType_keyType_keyType_class == finalMapLikeType_keyType_keyType_class);
            
            assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withKeyTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyTypeHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withTypeHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superInterfaces
 *  */
    @Test
    public void testWithKeyTypeHandler_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withKeyTypeHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.withKeyTypeHandler(MapLikeType.java:246) */
        mapLikeType.withKeyTypeHandler(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withKeyTypeHandler(java.lang.Object)
    
    @Test
    public void testWithKeyTypeHandler1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withKeyTypeHandler(null);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType finalMapLikeType_superInterfaces0 = mapLikeType._superInterfaces[0];
        JavaType finalMapLikeType_superInterfaces1 = mapLikeType._superInterfaces[1];
        JavaType finalMapLikeType_superInterfaces2 = mapLikeType._superInterfaces[2];
        JavaType finalMapLikeType_superInterfaces3 = mapLikeType._superInterfaces[3];
        JavaType finalMapLikeType_superInterfaces4 = mapLikeType._superInterfaces[4];
        JavaType finalMapLikeType_superInterfaces5 = mapLikeType._superInterfaces[5];
        JavaType finalMapLikeType_superInterfaces6 = mapLikeType._superInterfaces[6];
        JavaType finalMapLikeType_superInterfaces7 = mapLikeType._superInterfaces[7];
        JavaType finalMapLikeType_superInterfaces8 = mapLikeType._superInterfaces[8];
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        
        assertNull(finalMapLikeType_superInterfaces0);
        
        assertNull(finalMapLikeType_superInterfaces1);
        
        assertNull(finalMapLikeType_superInterfaces2);
        
        assertNull(finalMapLikeType_superInterfaces3);
        
        assertNull(finalMapLikeType_superInterfaces4);
        
        assertNull(finalMapLikeType_superInterfaces5);
        
        assertNull(finalMapLikeType_superInterfaces6);
        
        assertNull(finalMapLikeType_superInterfaces7);
        
        assertNull(finalMapLikeType_superInterfaces8);
    }
    
    @Test
    public void testWithKeyTypeHandler2() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._keyType;
        JavaType javaType_keyType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialMapLikeType_keyType_keyType_class = ((Class) getFieldValue(javaType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapLikeType._keyType;
        Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withKeyTypeHandler(null);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _keyType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType2 = mapLikeType._keyType;
        JavaType javaType2_keyType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalMapLikeType_keyType_keyType_class = ((Class) getFieldValue(javaType2_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = mapLikeType._keyType;
        Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_keyType_keyType_class == finalMapLikeType_keyType_keyType_class);
        
        assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    @Test
    public void testWithKeyTypeHandler3() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapLikeType._keyType;
            Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withKeyTypeHandler(null);
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType1 = mapLikeType._keyType;
            Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType finalMapLikeType_superInterfaces0 = mapLikeType._superInterfaces[0];
            JavaType finalMapLikeType_superInterfaces1 = mapLikeType._superInterfaces[1];
            JavaType finalMapLikeType_superInterfaces2 = mapLikeType._superInterfaces[2];
            JavaType finalMapLikeType_superInterfaces3 = mapLikeType._superInterfaces[3];
            JavaType finalMapLikeType_superInterfaces4 = mapLikeType._superInterfaces[4];
            JavaType finalMapLikeType_superInterfaces5 = mapLikeType._superInterfaces[5];
            JavaType finalMapLikeType_superInterfaces6 = mapLikeType._superInterfaces[6];
            JavaType finalMapLikeType_superInterfaces7 = mapLikeType._superInterfaces[7];
            JavaType finalMapLikeType_superInterfaces8 = mapLikeType._superInterfaces[8];
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
            
            assertNull(finalMapLikeType_superInterfaces0);
            
            assertNull(finalMapLikeType_superInterfaces1);
            
            assertNull(finalMapLikeType_superInterfaces2);
            
            assertNull(finalMapLikeType_superInterfaces3);
            
            assertNull(finalMapLikeType_superInterfaces4);
            
            assertNull(finalMapLikeType_superInterfaces5);
            
            assertNull(finalMapLikeType_superInterfaces6);
            
            assertNull(finalMapLikeType_superInterfaces7);
            
            assertNull(finalMapLikeType_superInterfaces8);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithKeyTypeHandler4() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            Class _class = Object.class;
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _referencedType);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _referencedType);
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapLikeType._keyType;
            JavaType javaType_keyType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
            Class initialMapLikeType_keyType_referencedType_class = ((Class) getFieldValue(javaType_keyType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapLikeType._keyType;
            Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withKeyTypeHandler(null);
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _referencedType);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _referencedType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 294);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType2 = mapLikeType._keyType;
            JavaType javaType2_keyType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
            Class finalMapLikeType_keyType_referencedType_class = ((Class) getFieldValue(javaType2_keyType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType3 = mapLikeType._keyType;
            Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_keyType_referencedType_class == finalMapLikeType_keyType_referencedType_class);
            
            assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithKeyTypeHandler5() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _referencedType);
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object object = new Object();
            
            JavaType javaType = mapLikeType._keyType;
            Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withKeyTypeHandler(object);
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _keyType1);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _referencedType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 294);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType1 = mapLikeType._keyType;
            Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithKeyTypeHandler6() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        java.lang.Class[] _typeHandler = {};
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces1 = {null, null, null, null, null, null, null, null, null};
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler1 = createInstance("java.lang.Object");
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler1);
        Object _typeHandler1 = createInstance("java.lang.Object");
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler1);
        Object object = new Object();
        
        JavaType javaType = mapLikeType._keyType;
        Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withKeyTypeHandler(object);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _keyType1);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        Object _typeHandler2 = createInstance("java.lang.Object");
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler2);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces1);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753767);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler1);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType1_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces0 = ((JavaType) get(javaType1_keyType_superInterfaces, 0));
        JavaType javaType2 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType2_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces1 = ((JavaType) get(javaType2_keyType_superInterfaces, 1));
        JavaType javaType3 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType3_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces2 = ((JavaType) get(javaType3_keyType_superInterfaces, 2));
        JavaType javaType4 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType4_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces3 = ((JavaType) get(javaType4_keyType_superInterfaces, 3));
        JavaType javaType5 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType5_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType5, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces4 = ((JavaType) get(javaType5_keyType_superInterfaces, 4));
        JavaType javaType6 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType6_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType6, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces5 = ((JavaType) get(javaType6_keyType_superInterfaces, 5));
        JavaType javaType7 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType7_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType7, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces6 = ((JavaType) get(javaType7_keyType_superInterfaces, 6));
        JavaType javaType8 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType8_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType8, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces7 = ((JavaType) get(javaType8_keyType_superInterfaces, 7));
        JavaType javaType9 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType9_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType9, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces8 = ((JavaType) get(javaType9_keyType_superInterfaces, 8));
        JavaType javaType10 = mapLikeType._keyType;
        Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType10, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType finalMapLikeType_superInterfaces0 = mapLikeType._superInterfaces[0];
        JavaType finalMapLikeType_superInterfaces1 = mapLikeType._superInterfaces[1];
        JavaType finalMapLikeType_superInterfaces2 = mapLikeType._superInterfaces[2];
        JavaType finalMapLikeType_superInterfaces3 = mapLikeType._superInterfaces[3];
        JavaType finalMapLikeType_superInterfaces4 = mapLikeType._superInterfaces[4];
        JavaType finalMapLikeType_superInterfaces5 = mapLikeType._superInterfaces[5];
        JavaType finalMapLikeType_superInterfaces6 = mapLikeType._superInterfaces[6];
        JavaType finalMapLikeType_superInterfaces7 = mapLikeType._superInterfaces[7];
        JavaType finalMapLikeType_superInterfaces8 = mapLikeType._superInterfaces[8];
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        
        assertNull(finalMapLikeType_keyType_superInterfaces0);
        
        assertNull(finalMapLikeType_keyType_superInterfaces1);
        
        assertNull(finalMapLikeType_keyType_superInterfaces2);
        
        assertNull(finalMapLikeType_keyType_superInterfaces3);
        
        assertNull(finalMapLikeType_keyType_superInterfaces4);
        
        assertNull(finalMapLikeType_keyType_superInterfaces5);
        
        assertNull(finalMapLikeType_keyType_superInterfaces6);
        
        assertNull(finalMapLikeType_keyType_superInterfaces7);
        
        assertNull(finalMapLikeType_keyType_superInterfaces8);
        
        assertNull(finalMapLikeType_superInterfaces0);
        
        assertNull(finalMapLikeType_superInterfaces1);
        
        assertNull(finalMapLikeType_superInterfaces2);
        
        assertNull(finalMapLikeType_superInterfaces3);
        
        assertNull(finalMapLikeType_superInterfaces4);
        
        assertNull(finalMapLikeType_superInterfaces5);
        
        assertNull(finalMapLikeType_superInterfaces6);
        
        assertNull(finalMapLikeType_superInterfaces7);
        
        assertNull(finalMapLikeType_superInterfaces8);
    }
    
    @Test
    public void testWithKeyTypeHandler7() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapType _referencedType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        MapLikeType _anchorType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_anchorType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _anchorType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _anchorType);
        CollectionType _superClass = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._keyType;
        JavaType javaType_keyType_anchorType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType"));
        Class initialMapLikeType_keyType_anchorType_class = ((Class) getFieldValue(javaType_keyType_anchorType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapLikeType._keyType;
        Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withKeyTypeHandler(null);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _anchorType);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _anchorType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753766);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType2 = mapLikeType._keyType;
        JavaType javaType2_keyType_anchorType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType"));
        Class finalMapLikeType_keyType_anchorType_class = ((Class) getFieldValue(javaType2_keyType_anchorType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = mapLikeType._keyType;
        Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_keyType_anchorType_class == finalMapLikeType_keyType_anchorType_class);
        
        assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    @Test
    public void testWithKeyTypeHandler8() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        CollectionLikeType _superClass = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        Object object = new Object();
        
        JavaType javaType = mapLikeType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapLikeType._keyType;
        Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withKeyTypeHandler(object);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType2 = mapLikeType._keyType;
        JavaType javaType2_keyType_valueType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType2_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = mapLikeType._keyType;
        Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_keyType_valueType_class == finalMapLikeType_keyType_valueType_class);
        
        assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withKeyTypeHandler(java.lang.Object)
    
    @Test
    public void testWithKeyTypeHandler9() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _referencedType);
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _referencedType);
            
            /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withKeyTypeHandler] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
                com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
                com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:39)
                com.fasterxml.jackson.databind.type.MapLikeType.withKeyTypeHandler(MapLikeType.java:246) */
            mapLikeType.withKeyTypeHandler(null);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithKeyTypeHandler10() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            MapLikeType _referencedType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _referencedType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            
            /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withKeyTypeHandler] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
                com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
                com.fasterxml.jackson.databind.type.MapLikeType.<init>(MapLikeType.java:39)
                com.fasterxml.jackson.databind.type.MapLikeType.withKeyTypeHandler(MapLikeType.java:246) */
            mapLikeType.withKeyTypeHandler(null);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.isTrueMapType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isTrueMapType()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#isTrueMapType()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.returnsFrom {@code return Map.class.isAssignableFrom(_class);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Map.class.isAssignableFrom(_class);
 *  */
    @Test
    public void testIsTrueMapType_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.isTrueMapType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.type.MapLikeType.isTrueMapType(MapLikeType.java:262) */
        mapLikeType.isTrueMapType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method hasHandlers()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _valueType.hasHandlers() || _keyType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_SuperHasHandlersOr_valueTypeHasHandlersOr_keyTypeHasHandlers_1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        boolean actual = mapLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _valueType.hasHandlers() || _keyType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_SuperHasHandlersOr_valueTypeHasHandlersOr_keyTypeHasHandlers() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        boolean actual = mapLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#hasHandlers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _valueType.hasHandlers() || _keyType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_SuperHasHandlersOr_valueTypeHasHandlersOr_keyTypeHasHandlers_2() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        boolean actual = mapLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method hasHandlers()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.JavaType#hasHandlers()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _valueType.hasHandlers() || _keyType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_ReturnSuperHasHandlersOr_valueTypeHasHandlersOr_keyTypeHasHandlers_2() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType2 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        boolean actual = mapLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _valueType.hasHandlers() || _keyType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_ReturnSuperHasHandlersOr_valueTypeHasHandlersOr_keyTypeHasHandlers() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        CollectionLikeType _componentType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        boolean actual = mapLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _valueType.hasHandlers() || _keyType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_ReturnSuperHasHandlersOr_valueTypeHasHandlersOr_keyTypeHasHandlers_1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        MapLikeType _componentType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        boolean actual = mapLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasHandlers()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#hasHandlers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBase#hasHandlers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#hasHandlers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.hasHandlers() || _valueType.hasHandlers() || _keyType.hasHandlers();
 *  */
    @Test
    public void testHasHandlers_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219) */
        mapLikeType.hasHandlers();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasHandlers()
    
    @Test
    public void testHasHandlers1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType3 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType3);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219) */
        mapLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers2() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType2 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219) */
        mapLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers3() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_elementType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219) */
        mapLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers4() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType2 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType3 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType3);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219) */
        mapLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers5() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType2 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionType _elementType1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        SimpleType _elementType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219) */
        mapLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers6() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType3 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType3);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219) */
        mapLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers7() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType2 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType3 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType3);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219) */
        mapLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers8() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType3 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_valueType3, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType3);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219) */
        mapLikeType.hasHandlers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.getErasedSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErasedSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.MapLikeType#_classSignature(java.lang.Class,java.lang.StringBuilder,boolean)}
 * @utbot.returnsFrom {@code return _classSignature(_class, sb, true);}
 *  */
    @Test
    public void testGetErasedSignature_MapLikeType_classSignature() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        StringBuilder actual = mapLikeType.getErasedSignature(stringBuilder);
        
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
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getErasedSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.MapLikeType#_classSignature(java.lang.Class,java.lang.StringBuilder,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _classSignature(_class, sb, true);
 *  */
    @Test
    public void testGetErasedSignature_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:224)
            com.fasterxml.jackson.databind.type.MapLikeType.getErasedSignature(MapLikeType.java:225) */
        mapLikeType.getErasedSignature(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.withContentTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_3() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withContentTypeHandler(((Object) null));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapLikeType._keyType;
        Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withContentTypeHandler(((Object) null));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType3 = mapLikeType._keyType;
        JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapLikeType._keyType;
        Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_keyType_valueType_class == finalMapLikeType_keyType_valueType_class);
        
        assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapLikeType._keyType;
        Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withContentTypeHandler(((Object) null));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType3 = mapLikeType._keyType;
        JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapLikeType._keyType;
        Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_keyType_valueType_class == finalMapLikeType_keyType_valueType_class);
        
        assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_2() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            Class _class = Object.class;
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapLikeType._keyType;
            JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
            Class initialMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapLikeType._keyType;
            Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType2 = mapLikeType._valueType;
            Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withContentTypeHandler(((Object) null));
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType3 = mapLikeType._keyType;
            JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
            Class finalMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType4 = mapLikeType._keyType;
            Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType5 = mapLikeType._valueType;
            Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_keyType_valueType_class == finalMapLikeType_keyType_valueType_class);
            
            assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
            
            assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentTypeHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withTypeHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superInterfaces
 *  */
    @Test
    public void testWithContentTypeHandler_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withContentTypeHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.withContentTypeHandler(MapLikeType.java:130) */
        mapLikeType.withContentTypeHandler(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.withKeyValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withKeyValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return_2() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withKeyValueHandler(null);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._keyType;
        JavaType javaType_keyType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        JavaType javaType_keyType_keyType_keyType_keyType_keyType = ((JavaType) getFieldValue(javaType_keyType_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialMapLikeType_keyType_keyType_keyType_class = ((Class) getFieldValue(javaType_keyType_keyType_keyType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapLikeType._keyType;
        JavaType javaType1_keyType_keyType = ((JavaType) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialMapLikeType_keyType_keyType_class = ((Class) getFieldValue(javaType1_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapLikeType._keyType;
        Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withKeyValueHandler(null);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType3 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_keyType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(_keyType3, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType3, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType3, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType3);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType3 = mapLikeType._keyType;
        JavaType javaType3_keyType_keyType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        JavaType javaType3_keyType_keyType_keyType_keyType_keyType = ((JavaType) getFieldValue(javaType3_keyType_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalMapLikeType_keyType_keyType_keyType_class = ((Class) getFieldValue(javaType3_keyType_keyType_keyType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapLikeType._keyType;
        JavaType javaType4_keyType_keyType = ((JavaType) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalMapLikeType_keyType_keyType_class = ((Class) getFieldValue(javaType4_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapLikeType._keyType;
        Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_keyType_keyType_keyType_class == finalMapLikeType_keyType_keyType_keyType_class);
        
        assertFalse(initialMapLikeType_keyType_keyType_class == finalMapLikeType_keyType_keyType_class);
        
        assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.MapType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return_1() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapLikeType _keyType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _keyType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            Class _class = Object.class;
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
            setField(_keyType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapLikeType._keyType;
            JavaType javaType_keyType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            JavaType javaType_keyType_keyType_keyType_keyType_keyType = ((JavaType) getFieldValue(javaType_keyType_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialMapLikeType_keyType_keyType_keyType_class = ((Class) getFieldValue(javaType_keyType_keyType_keyType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapLikeType._keyType;
            JavaType javaType1_keyType_keyType = ((JavaType) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialMapLikeType_keyType_keyType_class = ((Class) getFieldValue(javaType1_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType2 = mapLikeType._keyType;
            Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withKeyValueHandler(null);
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapType _keyType3 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_keyType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
            setField(_keyType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(_keyType3, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_keyType3, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType3, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType3);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType3 = mapLikeType._keyType;
            JavaType javaType3_keyType_keyType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            JavaType javaType3_keyType_keyType_keyType_keyType_keyType = ((JavaType) getFieldValue(javaType3_keyType_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalMapLikeType_keyType_keyType_keyType_class = ((Class) getFieldValue(javaType3_keyType_keyType_keyType_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType4 = mapLikeType._keyType;
            JavaType javaType4_keyType_keyType = ((JavaType) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalMapLikeType_keyType_keyType_class = ((Class) getFieldValue(javaType4_keyType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType5 = mapLikeType._keyType;
            Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_keyType_keyType_keyType_class == finalMapLikeType_keyType_keyType_keyType_class);
            
            assertFalse(initialMapLikeType_keyType_keyType_class == finalMapLikeType_keyType_keyType_class);
            
            assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType.withValueHandler(h), _valueType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithKeyValueHandler_Return_3() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _keyType1);
        setField(_keyType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._keyType;
        Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapLikeType._valueType;
        JavaType javaType1_valueType_keyType = ((JavaType) getFieldValue(javaType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialMapLikeType_valueType_keyType_class = ((Class) getFieldValue(javaType1_valueType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withKeyValueHandler(null);
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _keyType2);
        setField(_keyType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType2);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType3 = mapLikeType._keyType;
        Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapLikeType._valueType;
        JavaType javaType4_valueType_keyType = ((JavaType) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalMapLikeType_valueType_keyType_class = ((Class) getFieldValue(javaType4_valueType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
        
        assertFalse(initialMapLikeType_valueType_keyType_class == finalMapLikeType_valueType_keyType_class);
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withKeyValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withKeyValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withValueHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superInterfaces
 *  */
    @Test
    public void testWithKeyValueHandler_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withKeyValueHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.withKeyValueHandler(MapLikeType.java:252) */
        mapLikeType.withKeyValueHandler(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.getContentTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentTypeHandler()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#getContentTypeHandler()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getTypeHandler()}
 * @utbot.returnsFrom {@code return _valueType.getTypeHandler();}
 *  */
    @Test
    public void testGetContentTypeHandler_JavaTypeGetTypeHandler() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType mapLikeType = new MapLikeType(null, null, referenceType);
        
        Object actual = mapLikeType.getContentTypeHandler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContentTypeHandler()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#getContentTypeHandler()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getTypeHandler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueType.getTypeHandler();
 *  */
    @Test
    public void testGetContentTypeHandler_ThrowNullPointerException() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.getContentTypeHandler] produces [java.lang.NullPointerException] */
        mapLikeType.getContentTypeHandler();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.getContentValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentValueHandler()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#getContentValueHandler()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getValueHandler()}
 * @utbot.returnsFrom {@code return _valueType.getValueHandler();}
 *  */
    @Test
    public void testGetContentValueHandler_JavaTypeGetValueHandler() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        MapLikeType mapLikeType = new MapLikeType(null, null, referenceType);
        
        Object actual = mapLikeType.getContentValueHandler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContentValueHandler()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#getContentValueHandler()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getValueHandler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _valueType.getValueHandler();
 *  */
    @Test
    public void testGetContentValueHandler_ThrowNullPointerException() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.getContentValueHandler] produces [java.lang.NullPointerException] */
        mapLikeType.getContentValueHandler();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.withContentValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_3() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        ReferenceType _valueType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withContentValueHandler(((Object) null));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapLikeType._keyType;
        Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withContentValueHandler(((Object) null));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType3 = mapLikeType._keyType;
        JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapLikeType._keyType;
        Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType5 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_keyType_valueType_class == finalMapLikeType_keyType_valueType_class);
        
        assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_keyType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null};
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = mapLikeType._keyType;
        JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class initialMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = mapLikeType._keyType;
        Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType2 = mapLikeType._valueType;
        Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        MapLikeType actual = mapLikeType.withContentValueHandler(((Object) null));
        
        MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        MapLikeType _valueType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType1);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
        
        // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType3 = mapLikeType._keyType;
        JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
        Class finalMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType4 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType4_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces0 = ((JavaType) get(javaType4_keyType_superInterfaces, 0));
        JavaType javaType5 = mapLikeType._keyType;
        com.fasterxml.jackson.databind.JavaType[] javaType5_keyType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType5, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalMapLikeType_keyType_superInterfaces1 = ((JavaType) get(javaType5_keyType_superInterfaces, 1));
        JavaType javaType6 = mapLikeType._keyType;
        Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType6, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType7 = mapLikeType._valueType;
        Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType7, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_keyType_valueType_class == finalMapLikeType_keyType_valueType_class);
        
        assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
        
        assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        
        assertNull(finalMapLikeType_keyType_superInterfaces0);
        
        assertNull(finalMapLikeType_keyType_superInterfaces1);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new MapLikeType(_class, _bindings, _superClass, _superInterfaces, _keyType, _valueType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_2() throws Exception  {
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
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_valueType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            Class _class = Object.class;
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_valueType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(_keyType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(_keyType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_hash", 255);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_valueType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
            setField(mapLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = mapLikeType._keyType;
            JavaType javaType_keyType_valueType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
            Class initialMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = mapLikeType._keyType;
            Class initialMapLikeType_keyType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType2 = mapLikeType._valueType;
            Class initialMapLikeType_valueType_class = ((Class) getFieldValue(javaType2, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            MapLikeType actual = mapLikeType.withContentValueHandler(((Object) null));
            
            MapLikeType expected = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            MapType _valueType2 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_valueType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_valueType2, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_valueType2, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753983);
            
            // com.fasterxml.jackson.databind.type.MapLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType3 = mapLikeType._keyType;
            JavaType javaType3_keyType_valueType = ((JavaType) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType"));
            Class finalMapLikeType_keyType_valueType_class = ((Class) getFieldValue(javaType3_keyType_valueType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType4 = mapLikeType._keyType;
            Class finalMapLikeType_keyType_class = ((Class) getFieldValue(javaType4, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType5 = mapLikeType._valueType;
            Class finalMapLikeType_valueType_class = ((Class) getFieldValue(javaType5, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialMapLikeType_keyType_valueType_class == finalMapLikeType_keyType_valueType_class);
            
            assertFalse(initialMapLikeType_keyType_class == finalMapLikeType_keyType_class);
            
            assertFalse(initialMapLikeType_valueType_class == finalMapLikeType_valueType_class);
            
            assertFalse(initialMapLikeType_class == finalMapLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#withContentValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withValueHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superInterfaces
 *  */
    @Test
    public void testWithContentValueHandler_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.withContentValueHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.withContentValueHandler(MapLikeType.java:144) */
        mapLikeType.withContentValueHandler(((Object) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o.getClass() != getClass()): True}
 *  */
    @Test
    public void testEquals_OGetClassNotEqualsGetClass() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        short[] shortArray = {};
        
        boolean actual = mapLikeType.equals(shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        
        boolean actual = mapLikeType.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        
        boolean actual = mapLikeType.equals(mapLikeType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#toString()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _class.getName()
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:274) */
        mapLikeType.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = mapLikeType.toString();
        
        String expected = "[map-like type; class java.lang.Object, null -> null]";
        
        assertEquals(expected, actual);
        
        Class finalMapLikeType_class = ((Class) getFieldValue(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialMapLikeType_class == finalMapLikeType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString2() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapType _valueType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:161)
            java.base/java.util.Formatter$FormatSpecifier.printString(Formatter.java:3056)
            java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:2933)
            java.base/java.util.Formatter.format(Formatter.java:2689)
            java.base/java.util.Formatter.format(Formatter.java:2625)
            java.base/java.lang.String.format(String.java:4147)
            com.fasterxml.jackson.databind.type.MapLikeType.toString(MapLikeType.java:273) */
        mapLikeType.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGenericSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _classSignature(_class, sb, false);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:224)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:230) */
        mapLikeType.getGenericSignature(null);
    }
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _keyType.getGenericSignature(sb);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException_1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _keyType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:224)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232) */
        mapLikeType.getGenericSignature(stringBuilder);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getGenericSignature(java.lang.StringBuilder)
    
    @Test
    public void testGetGenericSignature1() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232) */
        mapLikeType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature2() throws Exception  {
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(mapLikeType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232) */
        mapLikeType.getGenericSignature(stringBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.MapLikeType.getContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentType()
    
    /**
    @utbot.classUnderTest {@link MapLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.MapLikeType#getContentType()}
 * @utbot.returnsFrom {@code return _valueType;}
 *  */
    @Test
    public void testGetContentType_Return_valueType() {
        MapLikeType mapLikeType = new MapLikeType(null, null, null);
        
        JavaType actual = mapLikeType.getContentType();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1078716216391700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1078716216391700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1078716216398200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078716216391700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078716216398200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1078716216768899 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1078716216768899.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1078716216770700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078716216768899.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078716216770700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1078716217134800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1078716217134800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1078716217136299 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078716217134800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078716217136299).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1078716217722600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1078716217722600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1078716217723800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078716217722600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078716217723800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

