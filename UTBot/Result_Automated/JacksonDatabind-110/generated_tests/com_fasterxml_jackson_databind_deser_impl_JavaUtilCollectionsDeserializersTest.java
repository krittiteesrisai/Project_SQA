package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_deser_impl_JavaUtilCollectionsDeserializersTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.converter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method converter(int, com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaUtilCollectionsDeserializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers#converter(int,com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.returnsFrom {@code return new JavaUtilCollectionsConverter(kind, concreteType.findSuperType(rawSuper));}
 *  */
    @Test
    public void testConverter_Return_1() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Class class1 = Object.class;
        
        Object actual = JavaUtilCollectionsDeserializers.converter(-255, resolvedRecursiveType, class1);
        
        Object expected = createInstance("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter");
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind", -255);
        
        JavaType actual_inputType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_inputType"));
        assertNull(actual_inputType);
        
        int expected_kind = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind"));
        int actual_kind = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind"));
        assertEquals(expected_kind, actual_kind);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link JavaUtilCollectionsDeserializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers#converter(int,com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.returnsFrom {@code return new JavaUtilCollectionsConverter(kind, concreteType.findSuperType(rawSuper));}
 *  */
    @Test
    public void testConverter_Return_2() throws Exception  {
        ResolvedRecursiveType resolvedRecursiveType = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        ResolvedRecursiveType _superClass = ((ResolvedRecursiveType) createInstance("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(resolvedRecursiveType, "com.fasterxml.jackson.databind.type.TypeBase", "_superClass", _superClass);
        Class class1 = Object.class;
        
        Object actual = JavaUtilCollectionsDeserializers.converter(-255, resolvedRecursiveType, class1);
        
        Object expected = createInstance("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter");
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind", -255);
        
        JavaType actual_inputType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_inputType"));
        assertNull(actual_inputType);
        
        int expected_kind = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind"));
        int actual_kind = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind"));
        assertEquals(expected_kind, actual_kind);
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link JavaUtilCollectionsDeserializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers#converter(int,com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.returnsFrom {@code return new JavaUtilCollectionsConverter(kind, concreteType.findSuperType(rawSuper));}
 *  */
    @Test
    public void testConverter_Return() throws Exception  {
        SimpleType simpleType = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        com.fasterxml.jackson.databind.JavaType[] _superInterfaces = new com.fasterxml.jackson.databind.JavaType[1];
        SimpleType simpleType1 = ((SimpleType) createInstance("com.fasterxml.jackson.databind.type.SimpleType"));
        Class _class = Object.class;
        setField(simpleType1, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        _superInterfaces[0] = ((JavaType) simpleType1);
        setField(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces", _superInterfaces);
        setField(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        com.fasterxml.jackson.databind.JavaType[] simpleType_superInterfaces = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType simpleType_superInterfaces_superInterfaces0 = ((JavaType) get(simpleType_superInterfaces, 0));
        Class initialSimpleType_superInterfaces0_class = ((Class) getFieldValue(simpleType_superInterfaces_superInterfaces0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class initialSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Object actual = JavaUtilCollectionsDeserializers.converter(-255, simpleType, _class);
        
        Object expected = createInstance("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter");
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_inputType", simpleType);
        setField(expected, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind", -255);
        
        JavaType expected_inputType = ((JavaType) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_inputType"));
        JavaType actual_inputType = ((JavaType) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_inputType"));
        // com.fasterxml.jackson.databind.JavaType has overridden equals method
        assertEquals(expected_inputType, actual_inputType);
        
        int expected_kind = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind"));
        int actual_kind = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter", "_kind"));
        assertEquals(expected_kind, actual_kind);
        
        com.fasterxml.jackson.databind.JavaType[] simpleType_superInterfaces1 = ((com.fasterxml.jackson.databind.JavaType[]) getFieldValue(simpleType, "com.fasterxml.jackson.databind.type.TypeBase", "_superInterfaces"));
        JavaType simpleType_superInterfaces1_superInterfaces0 = ((JavaType) get(simpleType_superInterfaces1, 0));
        Class finalSimpleType_superInterfaces0_class = ((Class) getFieldValue(simpleType_superInterfaces1_superInterfaces0, "com.fasterxml.jackson.databind.JavaType", "_class"));
        Class finalSimpleType_class = ((Class) getFieldValue(simpleType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        Class final_class = _class;
        
        assertFalse(initialSimpleType_superInterfaces0_class == finalSimpleType_superInterfaces0_class);
        
        assertFalse(initialSimpleType_class == finalSimpleType_class);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method converter(int, com.fasterxml.jackson.databind.JavaType, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link JavaUtilCollectionsDeserializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers#converter(int,com.fasterxml.jackson.databind.JavaType,java.lang.Class)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#findSuperType(java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new JavaUtilCollectionsConverter(kind, concreteType.findSuperType(rawSuper));
 *  */
    @Test
    public void testConverter_ThrowNullPointerException() {
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.converter] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.converter(JavaUtilCollectionsDeserializers.java:108) */
        JavaUtilCollectionsDeserializers.converter(-255, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForMap
    
    ///region FUZZER: ERROR SUITE for method findForMap(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers#findForMap(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindForMapThrowsNPE() throws JsonMappingException  {
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForMap] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForMap(JavaUtilCollectionsDeserializers.java:95) */
        JavaUtilCollectionsDeserializers.findForMap(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForCollection
    
    ///region FUZZER: ERROR SUITE for method findForCollection(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType)
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers#findForCollection(com.fasterxml.jackson.databind.DeserializationContext,com.fasterxml.jackson.databind.JavaType)}
     */
    @Test
    public void testFindForCollectionThrowsNPE() throws JsonMappingException  {
        /* This test fails because method [com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForCollection] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForCollection(JavaUtilCollectionsDeserializers.java:71) */
        JavaUtilCollectionsDeserializers.findForCollection(null, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1094615641516000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1094615641516000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1094615641523900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1094615641516000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1094615641523900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1094615642455500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1094615642455500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1094615642460299 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1094615642455500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1094615642460299).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

