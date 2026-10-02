package com.fasterxml.jackson.databind.module;

import org.junit.Test;
import java.util.HashMap;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_module_SimpleAbstractTypeResolverTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.addMapping
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addMapping(java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link SimpleAbstractTypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver#addMapping(java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code (superType == subType): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: superType == subType
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddMapping_ThrowIllegalArgumentException() {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = new SimpleAbstractTypeResolver();
        
        simpleAbstractTypeResolver.addMapping(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addMapping(java.lang.Class, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link SimpleAbstractTypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver#addMapping(java.lang.Class,java.lang.Class)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !superType.isAssignableFrom(subType)
 *  */
    @Test
    public void testAddMapping_ThrowNullPointerException() {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = new SimpleAbstractTypeResolver();
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.addMapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.addMapping(SimpleAbstractTypeResolver.java:58) */
        simpleAbstractTypeResolver.addMapping(null, class1);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleAbstractTypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver#addMapping(java.lang.Class,java.lang.Class)}
 * @utbot.executesCondition {@code (!superType.isAssignableFrom(subType)): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.Class#getName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: " to "
 *  */
    @Test
    public void testAddMapping_ThrowNullPointerException_1() {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = new SimpleAbstractTypeResolver();
        Class class1 = Object.class;
        
        /* This test fails because method [com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.addMapping] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.addMapping(SimpleAbstractTypeResolver.java:58) */
        simpleAbstractTypeResolver.addMapping(class1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.findTypeMapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method findTypeMapping(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link SimpleAbstractTypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver#findTypeMapping(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (dst == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testFindTypeMapping_DstEqualsNull() throws Exception  {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = ((SimpleAbstractTypeResolver) createInstance("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver"));
        HashMap _mappings = new HashMap();
        setField(simpleAbstractTypeResolver, "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "_mappings", _mappings);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JavaType actual = simpleAbstractTypeResolver.findTypeMapping(null, arrayType);
        
        assertNull(actual);
        
        Class finalArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialArrayType_class == finalArrayType_class);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleAbstractTypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver#findTypeMapping(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.executesCondition {@code (dst == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#narrowBy(java.lang.Class)}
 * @utbot.returnsFrom {@code return type.narrowBy(dst);}
 *  */
    @Test
    public void testFindTypeMapping_DstNotEqualsNull() throws Exception  {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = ((SimpleAbstractTypeResolver) createInstance("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver"));
        HashMap _mappings = new HashMap();
        ClassKey classKey = ((ClassKey) createInstance("com.fasterxml.jackson.databind.type.ClassKey"));
        Class _class = Object.class;
        setField(classKey, "com.fasterxml.jackson.databind.type.ClassKey", "_class", _class);
        _mappings.put(classKey, _class);
        setField(simpleAbstractTypeResolver, "com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver", "_mappings", _mappings);
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        Class initialArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        JavaType actual = simpleAbstractTypeResolver.findTypeMapping(null, arrayType);
        
        assertNull(actual);
        
        Class finalArrayType_class = ((Class) getFieldValue(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class"));
        
        assertFalse(initialArrayType_class == finalArrayType_class);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method findTypeMapping(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link SimpleAbstractTypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver#findTypeMapping(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> src = type.getRawClass();
 *  */
    @Test
    public void testFindTypeMapping_ThrowNullPointerException() {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = new SimpleAbstractTypeResolver();
        
        /* This test fails because method [com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.findTypeMapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.findTypeMapping(SimpleAbstractTypeResolver.java:74) */
        simpleAbstractTypeResolver.findTypeMapping(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SimpleAbstractTypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver#findTypeMapping(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JavaType#getRawClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Class<?> dst = _mappings.get(new ClassKey(src));
 *  */
    @Test
    public void testFindTypeMapping_ThrowNullPointerException_1() throws Exception  {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = ((SimpleAbstractTypeResolver) createInstance("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver"));
        ArrayType arrayType = ((ArrayType) createInstance("com.fasterxml.jackson.databind.type.ArrayType"));
        Class _class = Object.class;
        setField(arrayType, "com.fasterxml.jackson.databind.JavaType", "_class", _class);
        
        /* This test fails because method [com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.findTypeMapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.findTypeMapping(SimpleAbstractTypeResolver.java:75) */
        simpleAbstractTypeResolver.findTypeMapping(null, arrayType);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver.resolveAbstractType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method resolveAbstractType(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType)
    
    /**
    @utbot.classUnderTest {@link SimpleAbstractTypeResolver}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver#resolveAbstractType(com.fasterxml.jackson.databind.DeserializationConfig,com.fasterxml.jackson.databind.JavaType)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testResolveAbstractType_ReturnNull() {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver = new SimpleAbstractTypeResolver();
        
        JavaType actual = simpleAbstractTypeResolver.resolveAbstractType(null, null);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1069570525383499 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1069570525383499.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1069570525390900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069570525383499.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069570525390900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1069570525866400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1069570525866400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1069570525869000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1069570525866400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1069570525869000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

