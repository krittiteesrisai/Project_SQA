package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static java.lang.reflect.Array.get;

public final class com_fasterxml_jackson_databind_type_CollectionLikeTypeTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.getContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentType()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#getContentType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testGetContentType_Return() {
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, null);
        
        JavaType actual = collectionLikeType.getContentType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (o.getClass() != getClass()): True}
 *  */
    @Test
    public void testEquals_OGetClassNotEqualsGetClass() {
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, null);
        short[] shortArray = {};
        
        boolean actual = collectionLikeType.equals(shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() {
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, null);
        
        boolean actual = collectionLikeType.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() {
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, null);
        
        boolean actual = collectionLikeType.equals(collectionLikeType);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#toString()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return "[collection-like type; class " + _class.getName() + ", contains " + _elementType + "]";
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.toString(CollectionLikeType.java:247) */
        collectionLikeType.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionLikeType.toString();
        
        String expected = "[collection-like type; class java.lang.Object, contains null]";
        
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    @Test
    public void testToString2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionLikeType.toString();
        
        String expected = "[collection-like type; class java.lang.Object, contains [map-like type; class java.lang.Object, null -> null]]";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString3() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.toString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapType.toString(MapType.java:161)
            java.base/java.lang.String.valueOf(String.java:4222)
            java.base/java.lang.StringBuilder.append(StringBuilder.java:173)
            com.fasterxml.jackson.databind.type.CollectionLikeType.toString(CollectionLikeType.java:247) */
        collectionLikeType.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getGenericSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#getGenericSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.CollectionLikeType#_classSignature(java.lang.Class,java.lang.StringBuilder,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _classSignature(_class, sb, false);
 *  */
    @Test
    public void testGetGenericSignature_ThrowNullPointerException() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:224)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:192) */
        collectionLikeType.getGenericSignature(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getGenericSignature(java.lang.StringBuilder)
    
    @Test
    public void testGetGenericSignature1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:232)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194) */
        collectionLikeType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194) */
        collectionLikeType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature3() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("\u0000");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.ReferenceType.getGenericSignature(ReferenceType.java:224)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194) */
        collectionLikeType.getGenericSignature(stringBuilder);
    }
    
    @Test
    public void testGetGenericSignature4() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("");
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:194)
            com.fasterxml.jackson.databind.type.MapLikeType.getGenericSignature(MapLikeType.java:230)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getGenericSignature(CollectionLikeType.java:194) */
        collectionLikeType.getGenericSignature(stringBuilder);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.construct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method construct(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#construct(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[],com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(rawType, bindings, superClass, superInts, elemT, null, null, false);}
 *  */
    @Test
    public void testConstruct_Return() throws Exception  {
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(referenceType, "com.fasterxml.jackson.databind.JavaType", "_hash", -62);
        
        CollectionLikeType actual = CollectionLikeType.construct(class1, typeBindings, null, null, referenceType);
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", referenceType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876949);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#construct(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[],com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(rawType, bindings, superClass, superInts, elemT, null, null, false);}
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
            setField(mapType, "com.fasterxml.jackson.databind.JavaType", "_hash", -166);
            
            CollectionLikeType actual = CollectionLikeType.construct(class1, null, null, null, mapType);
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", mapType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876845);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.construct
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method construct(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#construct(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeVariable<?>[] vars = rawType.getTypeParameters();
 *  */
    @Test
    public void testConstruct_ThrowNullPointerException_1() {
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.construct] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(CollectionLikeType.java:35)
            com.fasterxml.jackson.databind.type.CollectionLikeType.construct(CollectionLikeType.java:73) */
        CollectionLikeType.construct(class1, null);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#construct(java.lang.Class,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link java.lang.Class#getTypeParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: TypeVariable<?>[] vars = rawType.getTypeParameters();
 *  */
    @Test
    public void testConstruct_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.construct] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.construct(CollectionLikeType.java:65) */
        CollectionLikeType.construct(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method construct(java.lang.Class, com.fasterxml.jackson.databind.JavaType)
    
    @Test
    public void testConstruct1() throws Exception  {
        Class class1 = Object.class;
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        
        CollectionLikeType actual = CollectionLikeType.construct(class1, resolvedRecursiveType);
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", resolvedRecursiveType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.withStaticTyping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithStaticTyping__asStatic() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        CollectionLikeType actual = collectionLikeType.withStaticTyping();
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(collectionLikeType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Not_asStatic() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withStaticTyping();
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);}
 *  */
    @Test
    public void testWithStaticTyping_Not_asStatic_2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withStaticTyping();
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withStaticTyping(), _valueHandler, _typeHandler, true);}
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            Class _class = Object.class;
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withStaticTyping();
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_asStatic", true);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withStaticTyping()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withStaticTyping()}
 * @utbot.executesCondition {@code (_asStatic): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withStaticTyping()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithStaticTyping_ThrowNullPointerException() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.withStaticTyping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.withStaticTyping(CollectionLikeType.java:143) */
        collectionLikeType.withStaticTyping();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.withContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentType(com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_elementType == contentType): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithContentType__elementTypeEqualsContentType() {
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, null);
        
        CollectionLikeType actual = ((CollectionLikeType) collectionLikeType.withContentType(null));
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(collectionLikeType, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_elementType == contentType): False}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, contentType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentType__elementTypeNotEqualsContentType() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        short[] _typeHandler = {};
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = ((CollectionLikeType) collectionLikeType.withContentType(mapLikeType));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", mapLikeType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876757);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentType(com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (_elementType == contentType): False}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, contentType, _valueHandler, _typeHandler, _asStatic);}
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            MapLikeType mapLikeType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(mapLikeType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
            
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = ((CollectionLikeType) collectionLikeType.withContentType(mapLikeType));
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", mapLikeType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876757);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method upgradeFrom(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#upgradeFrom(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (baseType instanceof TypeBase): True}
 * @utbot.returnsFrom {@code return new CollectionLikeType((TypeBase) baseType, elementType);}
 *  */
    @Test
    public void testUpgradeFrom_BaseTypeInstanceOfTypeBase() throws Exception  {
        MapType mapType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        
        CollectionLikeType actual = CollectionLikeType.upgradeFrom(mapType, null);
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method upgradeFrom(com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#upgradeFrom(com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (baseType instanceof TypeBase): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new IllegalArgumentException("Can not upgrade from an instance of " + baseType.getClass());
 *  */
    @Test
    public void testUpgradeFrom_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.upgradeFrom(CollectionLikeType.java:89) */
        CollectionLikeType.upgradeFrom(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType._narrow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _narrow(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#_narrow(java.lang.Class)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(subclass, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void test_narrow_Return() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null};
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        short[] _typeHandler = {};
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        Class class1 = Object.class;
        
        CollectionLikeType actual = ((CollectionLikeType) collectionLikeType._narrow(class1));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876757);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType finalCollectionLikeType_superInterfaces0 = collectionLikeType._superInterfaces[0];
        JavaType finalCollectionLikeType_superInterfaces1 = collectionLikeType._superInterfaces[1];
        
        Class finalClass1 = class1;
        
        assertNull(finalCollectionLikeType_superInterfaces0);
        
        assertNull(finalCollectionLikeType_superInterfaces1);
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#_narrow(java.lang.Class)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(subclass, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, _typeHandler, _asStatic);}
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            MapLikeType _superClass = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            Class class1 = Object.class;
            
            CollectionLikeType actual = ((CollectionLikeType) collectionLikeType._narrow(class1));
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876757);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Object finalCollectionLikeType_valueHandler = getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler");
            Object finalCollectionLikeType_typeHandler = getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler");
            
            Class finalClass1 = class1;
            
            assertNull(finalCollectionLikeType_valueHandler);
            
            assertNull(finalCollectionLikeType_typeHandler);
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.withTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, h, _asStatic);}
 *  */
    @Test
    public void testWithTypeHandler_Return() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null};
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withTypeHandler(((Object) null));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType finalCollectionLikeType_superInterfaces0 = collectionLikeType._superInterfaces[0];
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        
        assertNull(finalCollectionLikeType_superInterfaces0);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType, _valueHandler, h, _asStatic);}
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            Class _class = Object.class;
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withTypeHandler(((Object) null));
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.withValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType, h, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithValueHandler_Return() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        short[] _typeHandler = {};
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withValueHandler(((Object) null));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType, h, _typeHandler, _asStatic);}
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -254);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            Class _class = Object.class;
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withValueHandler(((Object) null));
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876757);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.refine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method refine(java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings, com.fasterxml.jackson.databind.JavaType, [Lcom.fasterxml.jackson.databind.JavaType;)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#refine(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return new CollectionLikeType(rawType, bindings, superClass, superInterfaces, _elementType, _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testRefine_Return() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -255);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class class1 = Object.class;
        TypeBindings typeBindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        
        CollectionLikeType actual = ((CollectionLikeType) collectionLikeType.refine(class1, typeBindings, null, null));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", typeBindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876756);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#refine(java.lang.Class,com.fasterxml.jackson.databind.type.TypeBindings,com.fasterxml.jackson.databind.JavaType,com.fasterxml.jackson.databind.JavaType[])}
 * @utbot.returnsFrom {@code return new CollectionLikeType(rawType, bindings, superClass, superInterfaces, _elementType, _valueHandler, _typeHandler, _asStatic);}
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", 1);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            Class class1 = Object.class;
            
            CollectionLikeType actual = ((CollectionLikeType) collectionLikeType.refine(class1, null, null, null));
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", class1);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877012);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.isContainerType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isContainerType()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#isContainerType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsContainerType_Return() {
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, null);
        
        boolean actual = collectionLikeType.isContainerType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.getErasedSignature
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getErasedSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.CollectionLikeType#_classSignature(java.lang.Class,java.lang.StringBuilder,boolean)}
 * @utbot.returnsFrom {@code return _classSignature(_class, sb, true);}
 *  */
    @Test
    public void testGetErasedSignature_CollectionLikeType_classSignature() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        StringBuilder stringBuilder = new StringBuilder("");
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        StringBuilder actual = collectionLikeType.getErasedSignature(stringBuilder);
        
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
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getErasedSignature(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#getErasedSignature(java.lang.StringBuilder)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.CollectionLikeType#_classSignature(java.lang.Class,java.lang.StringBuilder,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _classSignature(_class, sb, true);
 *  */
    @Test
    public void testGetErasedSignature_ThrowNullPointerException() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.getErasedSignature] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.TypeBase._classSignature(TypeBase.java:224)
            com.fasterxml.jackson.databind.type.CollectionLikeType.getErasedSignature(CollectionLikeType.java:187) */
        collectionLikeType.getErasedSignature(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method hasHandlers()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _elementType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_SuperHasHandlersOr_elementTypeHasHandlers() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        
        boolean actual = collectionLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _elementType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_SuperHasHandlersOr_elementTypeHasHandlers_1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        boolean actual = collectionLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _elementType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_SuperHasHandlersOr_elementTypeHasHandlers_2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        MapLikeType _componentType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_valueType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        boolean actual = collectionLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _elementType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_SuperHasHandlersOr_elementTypeHasHandlers_3() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        ArrayType _componentType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        boolean actual = collectionLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method hasHandlers()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.databind.JavaType#hasHandlers()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _elementType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_ReturnSuperHasHandlersOr_elementTypeHasHandlers_1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        boolean actual = collectionLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#hasHandlers()}
 * @utbot.returnsFrom {@code return super.hasHandlers() || _elementType.hasHandlers();}
 *  */
    @Test
    public void testHasHandlers_ReturnSuperHasHandlersOr_elementTypeHasHandlers() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        CollectionLikeType _componentType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_componentType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_valueType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        boolean actual = collectionLikeType.hasHandlers();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasHandlers()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#hasHandlers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.TypeBase#hasHandlers()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#hasHandlers()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.hasHandlers() || _elementType.hasHandlers();
 *  */
    @Test
    public void testHasHandlers_ThrowNullPointerException() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasHandlers()
    
    @Test
    public void testHasHandlers1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        boolean actual = collectionLikeType.hasHandlers();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasHandlers()
    
    @Test
    public void testHasHandlers2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers3() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        SimpleType _componentType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers4() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers5() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        CollectionLikeType _componentType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_componentType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers6() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        ArrayType _componentType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        SimpleType _componentType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_componentType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType1);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers7() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        MapLikeType _componentType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_componentType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.ArrayType.hasHandlers(ArrayType.java:186)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers8() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers9() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        MapLikeType _componentType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_componentType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.ArrayType.hasHandlers(ArrayType.java:186)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers10() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ArrayType _elementType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        CollectionLikeType _componentType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_componentType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers11() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        CollectionLikeType _componentType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_componentType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers12() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        MapLikeType _componentType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ReferenceType _valueType2 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_componentType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.ArrayType.hasHandlers(ArrayType.java:186)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers13() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        MapLikeType _componentType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_componentType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.ArrayType.hasHandlers(ArrayType.java:186)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers14() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionType _valueType1 = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        CollectionLikeType _elementType2 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType3 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType3);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers15() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType2 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType2 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers16() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType2 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType3 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType3);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers17() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionType _elementType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        CollectionLikeType _elementType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType3 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        SimpleType _elementType4 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType3, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType4);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType3);
        setField(_elementType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers18() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType2 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType3 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        ArrayType _valueType1 = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        SimpleType _componentType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_valueType1, "com.fasterxml.jackson.databind.type.ArrayType", "_componentType", _componentType);
        setField(_elementType3, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType3);
        setField(_valueType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    
    @Test
    public void testHasHandlers19() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _valueType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _valueType2 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType1 = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType2 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        SimpleType _valueType3 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(_elementType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType3);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType2);
        setField(_valueType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_valueType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType2);
        setField(_valueType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType1);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _valueType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:220)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.MapLikeType.hasHandlers(MapLikeType.java:219)
            com.fasterxml.jackson.databind.type.CollectionLikeType.hasHandlers(CollectionLikeType.java:182) */
        collectionLikeType.hasHandlers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildCanonicalName()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#buildCanonicalName()}
 * @utbot.executesCondition {@code (_elementType != null): False}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testBuildCanonicalName__elementTypeEqualsNull() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionLikeType.buildCanonicalName();
        
        String expected = "java.lang.Object";
        
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#buildCanonicalName()}
 * @utbot.executesCondition {@code (_elementType != null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#toCanonical()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testBuildCanonicalName__elementTypeNotEqualsNull() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        String _canonicalName = "  ";
        _elementType._canonicalName = _canonicalName;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionLikeType.buildCanonicalName();
        
        String expected = "java.lang.Object<  >";
        
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildCanonicalName()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#buildCanonicalName()}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append(_class.getName());
 *  */
    @Test
    public void testBuildCanonicalName_ThrowNullPointerException() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:202) */
        collectionLikeType.buildCanonicalName();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method buildCanonicalName()
    
    @Test
    public void testBuildCanonicalName1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionLikeType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object>";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    @Test
    public void testBuildCanonicalName2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        String _canonicalName = "";
        _elementType1._canonicalName = _canonicalName;
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionLikeType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object<>>";
        
        assertEquals(expected, actual);
        
        JavaType javaType1 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    @Test
    public void testBuildCanonicalName3() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        CollectionLikeType _elementType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionLikeType._elementType;
        JavaType javaType_elementType_elementType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class initialCollectionLikeType_elementType_elementType_class = ((Class) getFieldValue(javaType_elementType_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        String actual = collectionLikeType.buildCanonicalName();
        
        String expected = "java.lang.Object<java.lang.Object<java.lang.Object>>";
        
        assertEquals(expected, actual);
        
        JavaType javaType2 = collectionLikeType._elementType;
        JavaType javaType2_elementType_elementType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType"));
        Class finalCollectionLikeType_elementType_elementType_class = ((Class) getFieldValue(javaType2_elementType_elementType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_elementType_class == finalCollectionLikeType_elementType_elementType_class);
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method buildCanonicalName()
    
    @Test(expected = StackOverflowError.class)
    public void testBuildCanonicalName4() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _elementType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        collectionLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName5() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        String _canonicalName = "";
        _keyType._canonicalName = _canonicalName;
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:175)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:205) */
        collectionLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName6() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        MapLikeType _keyType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:175)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:205) */
        collectionLikeType.buildCanonicalName();
    }
    
    @Test
    public void testBuildCanonicalName7() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.MapLikeType.buildCanonicalName(MapLikeType.java:175)
            com.fasterxml.jackson.databind.type.TypeBase.toCanonical(TypeBase.java:68)
            com.fasterxml.jackson.databind.type.CollectionLikeType.buildCanonicalName(CollectionLikeType.java:205) */
        collectionLikeType.buildCanonicalName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.isCollectionLikeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCollectionLikeType()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#isCollectionLikeType()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsCollectionLikeType_Return() {
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, null);
        
        boolean actual = collectionLikeType.isCollectionLikeType();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.withContentValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withContentValueHandler(((Object) null));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return_2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withContentValueHandler(((Object) null));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _elementType1);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.MapType#withValueHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withValueHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentValueHandler_Return() throws Exception  {
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            Class _class = Object.class;
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            int[] _valueHandler = {};
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            byte[] _typeHandler = {};
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            
            JavaType javaType = collectionLikeType._elementType;
            Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withContentValueHandler(((Object) null));
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType1 = collectionLikeType._elementType;
            Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withContentValueHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentValueHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withValueHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithContentValueHandler_ThrowNullPointerException() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.withContentValueHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.withContentValueHandler(CollectionLikeType.java:132) */
        collectionLikeType.withContentValueHandler(((Object) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withContentValueHandler(java.lang.Object)
    
    @Test
    public void testWithContentValueHandler1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object object = new Object();
        
        JavaType javaType = collectionLikeType._elementType;
        JavaType javaType_elementType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withContentValueHandler(object);
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
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
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType2 = collectionLikeType._elementType;
        JavaType javaType2_elementType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType2_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_keyType_class == finalCollectionLikeType_elementType_keyType_class);
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    @Test
    public void testWithContentValueHandler2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object object = new Object();
        
        JavaType javaType = collectionLikeType._elementType;
        JavaType javaType_elementType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withContentValueHandler(object);
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
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
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType2 = collectionLikeType._elementType;
        JavaType javaType2_elementType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType2_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_keyType_class == finalCollectionLikeType_elementType_keyType_class);
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    @Test
    public void testWithContentValueHandler3() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionType _referencedType = ((CollectionType) createInstance("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        CollectionLikeType _anchorType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_anchorType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_anchorType, "com.fasterxml.jackson.databind.JavaType", "_hash", -2);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_anchorType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _anchorType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _valueHandler1 = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler1);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces1 = {null, null, null, null, null, null, null, null, null, null};
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces1);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        JavaType javaType = collectionLikeType._elementType;
        JavaType javaType_elementType_anchorType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType"));
        Class initialCollectionLikeType_elementType_anchorType_class = ((Class) getFieldValue(javaType_elementType_anchorType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withContentValueHandler(((Object) null));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _anchorType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces1);
        TypeBindings _bindings1 = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        java.lang.String[] _names = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_names", _names);
        com.fasterxml.jackson.databind.JavaType[] _types = {};
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_types", _types);
        setField(_bindings1, "com.fasterxml.jackson.databind.type.TypeBindings", "_hashCode", 1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings1);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType2 = collectionLikeType._elementType;
        JavaType javaType2_elementType_anchorType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType"));
        Class finalCollectionLikeType_elementType_anchorType_class = ((Class) getFieldValue(javaType2_elementType_anchorType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = collectionLikeType._elementType;
        com.fasterxml.jackson.databind.JavaType[] javaType3_elementType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType3, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalCollectionLikeType_elementType_superInterfaces0 = ((JavaType) get(javaType3_elementType_superInterfaces, 0));
        JavaType javaType4 = collectionLikeType._elementType;
        com.fasterxml.jackson.databind.JavaType[] javaType4_elementType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType4, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalCollectionLikeType_elementType_superInterfaces1 = ((JavaType) get(javaType4_elementType_superInterfaces, 1));
        JavaType javaType5 = collectionLikeType._elementType;
        com.fasterxml.jackson.databind.JavaType[] javaType5_elementType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType5, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalCollectionLikeType_elementType_superInterfaces2 = ((JavaType) get(javaType5_elementType_superInterfaces, 2));
        JavaType javaType6 = collectionLikeType._elementType;
        com.fasterxml.jackson.databind.JavaType[] javaType6_elementType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType6, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalCollectionLikeType_elementType_superInterfaces3 = ((JavaType) get(javaType6_elementType_superInterfaces, 3));
        JavaType javaType7 = collectionLikeType._elementType;
        com.fasterxml.jackson.databind.JavaType[] javaType7_elementType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType7, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalCollectionLikeType_elementType_superInterfaces4 = ((JavaType) get(javaType7_elementType_superInterfaces, 4));
        JavaType javaType8 = collectionLikeType._elementType;
        com.fasterxml.jackson.databind.JavaType[] javaType8_elementType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType8, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalCollectionLikeType_elementType_superInterfaces5 = ((JavaType) get(javaType8_elementType_superInterfaces, 5));
        JavaType javaType9 = collectionLikeType._elementType;
        com.fasterxml.jackson.databind.JavaType[] javaType9_elementType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType9, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalCollectionLikeType_elementType_superInterfaces6 = ((JavaType) get(javaType9_elementType_superInterfaces, 6));
        JavaType javaType10 = collectionLikeType._elementType;
        com.fasterxml.jackson.databind.JavaType[] javaType10_elementType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType10, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalCollectionLikeType_elementType_superInterfaces7 = ((JavaType) get(javaType10_elementType_superInterfaces, 7));
        JavaType javaType11 = collectionLikeType._elementType;
        com.fasterxml.jackson.databind.JavaType[] javaType11_elementType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(javaType11, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType finalCollectionLikeType_elementType_superInterfaces8 = ((JavaType) get(javaType11_elementType_superInterfaces, 8));
        JavaType javaType12 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType12, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType finalCollectionLikeType_superInterfaces0 = collectionLikeType._superInterfaces[0];
        JavaType finalCollectionLikeType_superInterfaces1 = collectionLikeType._superInterfaces[1];
        JavaType finalCollectionLikeType_superInterfaces2 = collectionLikeType._superInterfaces[2];
        JavaType finalCollectionLikeType_superInterfaces3 = collectionLikeType._superInterfaces[3];
        JavaType finalCollectionLikeType_superInterfaces4 = collectionLikeType._superInterfaces[4];
        JavaType finalCollectionLikeType_superInterfaces5 = collectionLikeType._superInterfaces[5];
        JavaType finalCollectionLikeType_superInterfaces6 = collectionLikeType._superInterfaces[6];
        JavaType finalCollectionLikeType_superInterfaces7 = collectionLikeType._superInterfaces[7];
        JavaType finalCollectionLikeType_superInterfaces8 = collectionLikeType._superInterfaces[8];
        JavaType finalCollectionLikeType_superInterfaces9 = collectionLikeType._superInterfaces[9];
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_anchorType_class == finalCollectionLikeType_elementType_anchorType_class);
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        
        assertNull(finalCollectionLikeType_elementType_superInterfaces0);
        
        assertNull(finalCollectionLikeType_elementType_superInterfaces1);
        
        assertNull(finalCollectionLikeType_elementType_superInterfaces2);
        
        assertNull(finalCollectionLikeType_elementType_superInterfaces3);
        
        assertNull(finalCollectionLikeType_elementType_superInterfaces4);
        
        assertNull(finalCollectionLikeType_elementType_superInterfaces5);
        
        assertNull(finalCollectionLikeType_elementType_superInterfaces6);
        
        assertNull(finalCollectionLikeType_elementType_superInterfaces7);
        
        assertNull(finalCollectionLikeType_elementType_superInterfaces8);
        
        assertNull(finalCollectionLikeType_superInterfaces0);
        
        assertNull(finalCollectionLikeType_superInterfaces1);
        
        assertNull(finalCollectionLikeType_superInterfaces2);
        
        assertNull(finalCollectionLikeType_superInterfaces3);
        
        assertNull(finalCollectionLikeType_superInterfaces4);
        
        assertNull(finalCollectionLikeType_superInterfaces5);
        
        assertNull(finalCollectionLikeType_superInterfaces6);
        
        assertNull(finalCollectionLikeType_superInterfaces7);
        
        assertNull(finalCollectionLikeType_superInterfaces8);
        
        assertNull(finalCollectionLikeType_superInterfaces9);
    }
    
    @Test
    public void testWithContentValueHandler4() throws Exception  {
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            CollectionLikeType _superClass = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = collectionLikeType._elementType;
            JavaType javaType_elementType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = collectionLikeType._elementType;
            Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withContentValueHandler(((Object) null));
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType2 = collectionLikeType._elementType;
            JavaType javaType2_elementType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType2_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType3 = collectionLikeType._elementType;
            Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType finalCollectionLikeType_superInterfaces0 = collectionLikeType._superInterfaces[0];
            JavaType finalCollectionLikeType_superInterfaces1 = collectionLikeType._superInterfaces[1];
            JavaType finalCollectionLikeType_superInterfaces2 = collectionLikeType._superInterfaces[2];
            JavaType finalCollectionLikeType_superInterfaces3 = collectionLikeType._superInterfaces[3];
            JavaType finalCollectionLikeType_superInterfaces4 = collectionLikeType._superInterfaces[4];
            JavaType finalCollectionLikeType_superInterfaces5 = collectionLikeType._superInterfaces[5];
            JavaType finalCollectionLikeType_superInterfaces6 = collectionLikeType._superInterfaces[6];
            JavaType finalCollectionLikeType_superInterfaces7 = collectionLikeType._superInterfaces[7];
            JavaType finalCollectionLikeType_superInterfaces8 = collectionLikeType._superInterfaces[8];
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_elementType_keyType_class == finalCollectionLikeType_elementType_keyType_class);
            
            assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
            
            assertNull(finalCollectionLikeType_superInterfaces0);
            
            assertNull(finalCollectionLikeType_superInterfaces1);
            
            assertNull(finalCollectionLikeType_superInterfaces2);
            
            assertNull(finalCollectionLikeType_superInterfaces3);
            
            assertNull(finalCollectionLikeType_superInterfaces4);
            
            assertNull(finalCollectionLikeType_superInterfaces5);
            
            assertNull(finalCollectionLikeType_superInterfaces6);
            
            assertNull(finalCollectionLikeType_superInterfaces7);
            
            assertNull(finalCollectionLikeType_superInterfaces8);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithContentValueHandler5() throws Exception  {
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            CollectionLikeType _superClass = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object object = new Object();
            
            JavaType javaType = collectionLikeType._elementType;
            JavaType javaType_elementType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
            Class initialCollectionLikeType_elementType_referencedType_class = ((Class) getFieldValue(javaType_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = collectionLikeType._elementType;
            Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withContentValueHandler(object);
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            ReferenceType _elementType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _elementType1);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753766);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType2 = collectionLikeType._elementType;
            JavaType javaType2_elementType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
            Class finalCollectionLikeType_elementType_referencedType_class = ((Class) getFieldValue(javaType2_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType3 = collectionLikeType._elementType;
            Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_elementType_referencedType_class == finalCollectionLikeType_elementType_referencedType_class);
            
            assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithContentValueHandler6() throws Exception  {
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _referencedType);
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            MapType _superClass = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object object = new Object();
            
            JavaType javaType = collectionLikeType._elementType;
            JavaType javaType_elementType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
            Class initialCollectionLikeType_elementType_referencedType_class = ((Class) getFieldValue(javaType_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = collectionLikeType._elementType;
            Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withContentValueHandler(object);
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            ReferenceType _elementType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _referencedType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753766);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType2 = collectionLikeType._elementType;
            JavaType javaType2_elementType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
            Class finalCollectionLikeType_elementType_referencedType_class = ((Class) getFieldValue(javaType2_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType3 = collectionLikeType._elementType;
            Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_elementType_referencedType_class == finalCollectionLikeType_elementType_referencedType_class);
            
            assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withContentValueHandler(java.lang.Object)
    
    @Test
    public void testWithContentValueHandler7() throws Exception  {
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            Class _class = Object.class;
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _valueHandler = createInstance("java.lang.Object");
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            
            /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.withContentValueHandler] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
                com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
                com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(CollectionLikeType.java:34)
                com.fasterxml.jackson.databind.type.CollectionLikeType.withContentValueHandler(CollectionLikeType.java:132) */
            collectionLikeType.withContentValueHandler(((Object) null));
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.getContentTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentTypeHandler()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#getContentTypeHandler()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getTypeHandler()}
 * @utbot.returnsFrom {@code return _elementType.getTypeHandler();}
 *  */
    @Test
    public void testGetContentTypeHandler_JavaTypeGetTypeHandler() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, referenceType);
        
        Object actual = collectionLikeType.getContentTypeHandler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContentTypeHandler()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#getContentTypeHandler()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getTypeHandler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _elementType.getTypeHandler();
 *  */
    @Test
    public void testGetContentTypeHandler_ThrowNullPointerException() {
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.getContentTypeHandler] produces [java.lang.NullPointerException] */
        collectionLikeType.getContentTypeHandler();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.withContentTypeHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withContentTypeHandler(((Object) null));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return_2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        ReferenceType _referencedType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        Class _class = Object.class;
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _referencedType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withContentTypeHandler(((Object) null));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _elementType1);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
        setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType1 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentTypeHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.type.MapType#withTypeHandler(java.lang.Object)}
 * @utbot.returnsFrom {@code return new CollectionLikeType(_class, _bindings, _superClass, _superInterfaces, _elementType.withTypeHandler(h), _valueHandler, _typeHandler, _asStatic);}
 *  */
    @Test
    public void testWithContentTypeHandler_Return() throws Exception  {
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            MapType _keyType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            Class _class = Object.class;
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = collectionLikeType._elementType;
            Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withContentTypeHandler(((Object) null));
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType1 = collectionLikeType._elementType;
            Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method withContentTypeHandler(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#withContentTypeHandler(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#withTypeHandler(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _superClass
 *  */
    @Test
    public void testWithContentTypeHandler_ThrowNullPointerException() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.withContentTypeHandler] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.type.CollectionLikeType.withContentTypeHandler(CollectionLikeType.java:119) */
        collectionLikeType.withContentTypeHandler(((Object) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method withContentTypeHandler(java.lang.Object)
    
    @Test
    public void testWithContentTypeHandler1() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionLikeType._elementType;
        JavaType javaType_elementType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withContentTypeHandler(((Object) null));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapType _elementType1 = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
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
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType2 = collectionLikeType._elementType;
        JavaType javaType2_elementType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType2_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_keyType_class == finalCollectionLikeType_elementType_keyType_class);
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    @Test
    public void testWithContentTypeHandler2() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        JavaType javaType = collectionLikeType._elementType;
        JavaType javaType_elementType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class initialCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withContentTypeHandler(((Object) null));
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
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
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType2 = collectionLikeType._elementType;
        JavaType javaType2_elementType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
        Class finalCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType2_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_keyType_class == finalCollectionLikeType_elementType_keyType_class);
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    
    @Test
    public void testWithContentTypeHandler3() throws Exception  {
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapLikeType _elementType = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            CollectionLikeType _keyType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_keyType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            CollectionLikeType _superClass = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            
            JavaType javaType = collectionLikeType._elementType;
            JavaType javaType_elementType_keyType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class initialCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = collectionLikeType._elementType;
            Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withContentTypeHandler(((Object) null));
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            MapLikeType _elementType1 = ((MapLikeType) createInstance("com.fasterxml.jackson.databind.type.MapLikeType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.MapLikeType", "_valueType", _keyType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063877011);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127754022);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType2 = collectionLikeType._elementType;
            JavaType javaType2_elementType_keyType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.MapLikeType", "_keyType"));
            Class finalCollectionLikeType_elementType_keyType_class = ((Class) getFieldValue(javaType2_elementType_keyType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType3 = collectionLikeType._elementType;
            Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType finalCollectionLikeType_superInterfaces0 = collectionLikeType._superInterfaces[0];
            JavaType finalCollectionLikeType_superInterfaces1 = collectionLikeType._superInterfaces[1];
            JavaType finalCollectionLikeType_superInterfaces2 = collectionLikeType._superInterfaces[2];
            JavaType finalCollectionLikeType_superInterfaces3 = collectionLikeType._superInterfaces[3];
            JavaType finalCollectionLikeType_superInterfaces4 = collectionLikeType._superInterfaces[4];
            JavaType finalCollectionLikeType_superInterfaces5 = collectionLikeType._superInterfaces[5];
            JavaType finalCollectionLikeType_superInterfaces6 = collectionLikeType._superInterfaces[6];
            JavaType finalCollectionLikeType_superInterfaces7 = collectionLikeType._superInterfaces[7];
            JavaType finalCollectionLikeType_superInterfaces8 = collectionLikeType._superInterfaces[8];
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_elementType_keyType_class == finalCollectionLikeType_elementType_keyType_class);
            
            assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
            
            assertNull(finalCollectionLikeType_superInterfaces0);
            
            assertNull(finalCollectionLikeType_superInterfaces1);
            
            assertNull(finalCollectionLikeType_superInterfaces2);
            
            assertNull(finalCollectionLikeType_superInterfaces3);
            
            assertNull(finalCollectionLikeType_superInterfaces4);
            
            assertNull(finalCollectionLikeType_superInterfaces5);
            
            assertNull(finalCollectionLikeType_superInterfaces6);
            
            assertNull(finalCollectionLikeType_superInterfaces7);
            
            assertNull(finalCollectionLikeType_superInterfaces8);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithContentTypeHandler4() throws Exception  {
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            CollectionLikeType _superClass = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            com.fasterxml.jackson.databind.JavaType[] _superInterfaces = {null, null, null, null, null, null, null, null, null};
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object object = new Object();
            
            JavaType javaType = collectionLikeType._elementType;
            JavaType javaType_elementType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
            Class initialCollectionLikeType_elementType_referencedType_class = ((Class) getFieldValue(javaType_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = collectionLikeType._elementType;
            Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withContentTypeHandler(object);
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            ReferenceType _elementType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _elementType1);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753766);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType2 = collectionLikeType._elementType;
            JavaType javaType2_elementType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
            Class finalCollectionLikeType_elementType_referencedType_class = ((Class) getFieldValue(javaType2_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType3 = collectionLikeType._elementType;
            Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType finalCollectionLikeType_superInterfaces0 = collectionLikeType._superInterfaces[0];
            JavaType finalCollectionLikeType_superInterfaces1 = collectionLikeType._superInterfaces[1];
            JavaType finalCollectionLikeType_superInterfaces2 = collectionLikeType._superInterfaces[2];
            JavaType finalCollectionLikeType_superInterfaces3 = collectionLikeType._superInterfaces[3];
            JavaType finalCollectionLikeType_superInterfaces4 = collectionLikeType._superInterfaces[4];
            JavaType finalCollectionLikeType_superInterfaces5 = collectionLikeType._superInterfaces[5];
            JavaType finalCollectionLikeType_superInterfaces6 = collectionLikeType._superInterfaces[6];
            JavaType finalCollectionLikeType_superInterfaces7 = collectionLikeType._superInterfaces[7];
            JavaType finalCollectionLikeType_superInterfaces8 = collectionLikeType._superInterfaces[8];
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_elementType_referencedType_class == finalCollectionLikeType_elementType_referencedType_class);
            
            assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
            
            assertNull(finalCollectionLikeType_superInterfaces0);
            
            assertNull(finalCollectionLikeType_superInterfaces1);
            
            assertNull(finalCollectionLikeType_superInterfaces2);
            
            assertNull(finalCollectionLikeType_superInterfaces3);
            
            assertNull(finalCollectionLikeType_superInterfaces4);
            
            assertNull(finalCollectionLikeType_superInterfaces5);
            
            assertNull(finalCollectionLikeType_superInterfaces6);
            
            assertNull(finalCollectionLikeType_superInterfaces7);
            
            assertNull(finalCollectionLikeType_superInterfaces8);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithContentTypeHandler5() throws Exception  {
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            Class _class = Object.class;
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _referencedType);
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            MapType _superClass = ((MapType) createInstance("com.fasterxml.jackson.databind.type.MapType"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object object = new Object();
            
            JavaType javaType = collectionLikeType._elementType;
            JavaType javaType_elementType_referencedType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
            Class initialCollectionLikeType_elementType_referencedType_class = ((Class) getFieldValue(javaType_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType1 = collectionLikeType._elementType;
            Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            CollectionLikeType actual = collectionLikeType.withContentTypeHandler(object);
            
            CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            ReferenceType _elementType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _referencedType);
            setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", empty);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876755);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(expected, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType1);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
            setField(expected, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753766);
            
            // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
            assertEquals(expected, actual);
            
            JavaType javaType2 = collectionLikeType._elementType;
            JavaType javaType2_elementType_referencedType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType"));
            Class finalCollectionLikeType_elementType_referencedType_class = ((Class) getFieldValue(javaType2_elementType_referencedType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            JavaType javaType3 = collectionLikeType._elementType;
            Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
            Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
            
            assertFalse(initialCollectionLikeType_elementType_referencedType_class == finalCollectionLikeType_elementType_referencedType_class);
            
            assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
            
            assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    
    @Test
    public void testWithContentTypeHandler6() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -512);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        CollectionLikeType _anchorType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Class _class = Object.class;
        setField(_anchorType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_anchorType, "com.fasterxml.jackson.databind.JavaType", "_hash", -2);
        Object _valueHandler = createInstance("java.lang.Object");
        setField(_anchorType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _anchorType);
        TypeBindings _bindings = ((TypeBindings) createInstance("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(_elementType, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        Object _typeHandler = createInstance("java.lang.Object");
        setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
        ArrayType _superClass = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(collectionLikeType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        Object object = new Object();
        
        JavaType javaType = collectionLikeType._elementType;
        JavaType javaType_elementType_anchorType = ((JavaType) getFieldValue(javaType, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType"));
        Class initialCollectionLikeType_elementType_anchorType_class = ((Class) getFieldValue(javaType_elementType_anchorType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType1 = collectionLikeType._elementType;
        Class initialCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType1, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        CollectionLikeType actual = collectionLikeType.withContentTypeHandler(object);
        
        CollectionLikeType expected = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        ReferenceType _elementType1 = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType", _anchorType);
        setField(_elementType1, "com.fasterxml.jackson.databind.type.TypeBase", "_bindings", _bindings);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_hash", 1063876499);
        Object _typeHandler1 = createInstance("java.lang.Object");
        setField(_elementType1, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler1);
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
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_hash", 2127753510);
        setField(expected, "com.fasterxml.jackson.databind.JavaType", "_valueHandler", _valueHandler);
        
        // com.fasterxml.jackson.databind.type.CollectionLikeType has overridden equals method
        assertEquals(expected, actual);
        
        JavaType javaType2 = collectionLikeType._elementType;
        JavaType javaType2_elementType_anchorType = ((JavaType) getFieldValue(javaType2, "com.fasterxml.jackson.databind.type.ReferenceType", "_anchorType"));
        Class finalCollectionLikeType_elementType_anchorType_class = ((Class) getFieldValue(javaType2_elementType_anchorType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        JavaType javaType3 = collectionLikeType._elementType;
        Class finalCollectionLikeType_elementType_class = ((Class) getFieldValue(javaType3, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalCollectionLikeType_class = ((Class) getFieldValue(collectionLikeType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialCollectionLikeType_elementType_anchorType_class == finalCollectionLikeType_elementType_anchorType_class);
        
        assertFalse(initialCollectionLikeType_elementType_class == finalCollectionLikeType_elementType_class);
        
        assertFalse(initialCollectionLikeType_class == finalCollectionLikeType_class);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method withContentTypeHandler(java.lang.Object)
    
    @Test
    public void testWithContentTypeHandler7() throws Exception  {
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
            CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            ReferenceType _elementType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
            CollectionLikeType _referencedType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
            setField(_referencedType, "com.fasterxml.jackson.databind.JavaType", "_hash", -256);
            setField(_elementType, "com.fasterxml.jackson.databind.type.ReferenceType", "_referencedType", _referencedType);
            Class _class = Object.class;
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
            Object _typeHandler = createInstance("java.lang.Object");
            setField(_elementType, "com.fasterxml.jackson.databind.JavaType", "_typeHandler", _typeHandler);
            setField(collectionLikeType, "com.fasterxml.jackson.databind.type.CollectionLikeType", "_elementType", _elementType);
            
            /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.withContentTypeHandler] produces [java.lang.NullPointerException]
                com.fasterxml.jackson.databind.JavaType.<init>(JavaType.java:80)
                com.fasterxml.jackson.databind.type.TypeBase.<init>(TypeBase.java:45)
                com.fasterxml.jackson.databind.type.CollectionLikeType.<init>(CollectionLikeType.java:34)
                com.fasterxml.jackson.databind.type.CollectionLikeType.withContentTypeHandler(CollectionLikeType.java:119) */
            collectionLikeType.withContentTypeHandler(((Object) null));
        } finally {
            setStaticField(TypeBindings.class, "EMPTY", prevEMPTY);
            setStaticField(TypeBase.class, "NO_BINDINGS", prevNO_BINDINGS);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.getContentValueHandler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getContentValueHandler()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#getContentValueHandler()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getValueHandler()}
 * @utbot.returnsFrom {@code return _elementType.getValueHandler();}
 *  */
    @Test
    public void testGetContentValueHandler_JavaTypeGetValueHandler() throws Exception  {
        ReferenceType referenceType = ((ReferenceType) createInstance("com.fasterxml.jackson.databind.type.ReferenceType"));
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, referenceType);
        
        Object actual = collectionLikeType.getContentValueHandler();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getContentValueHandler()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#getContentValueHandler()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getValueHandler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _elementType.getValueHandler();
 *  */
    @Test
    public void testGetContentValueHandler_ThrowNullPointerException() {
        CollectionLikeType collectionLikeType = new CollectionLikeType(null, null);
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.getContentValueHandler] produces [java.lang.NullPointerException] */
        collectionLikeType.getContentValueHandler();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.type.CollectionLikeType.isTrueCollectionType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isTrueCollectionType()
    
    /**
    @utbot.classUnderTest {@link CollectionLikeType}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.type.CollectionLikeType#isTrueCollectionType()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.returnsFrom {@code return Collection.class.isAssignableFrom(_class);}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return Collection.class.isAssignableFrom(_class);
 *  */
    @Test
    public void testIsTrueCollectionType_ThrowNullPointerException() throws Exception  {
        CollectionLikeType collectionLikeType = ((CollectionLikeType) createInstance("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.type.CollectionLikeType.isTrueCollectionType] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.type.CollectionLikeType.isTrueCollectionType(CollectionLikeType.java:224) */
        collectionLikeType.isTrueCollectionType();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1078570188896500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1078570188896500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1078570188902200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078570188896500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078570188902200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1078570189401800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1078570189401800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1078570189403600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078570189401800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078570189403600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields1078570189864500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1078570189864500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1078570189865600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078570189864500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078570189865600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1078570191026600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1078570191026600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1078570191031500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1078570191026600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1078570191031500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

