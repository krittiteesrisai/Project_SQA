package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Dynamic;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_fasterxml_jackson_databind_ser_std_StdKeySerializersTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getDefault
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDefault()
    
    /**
    @utbot.classUnderTest {@link StdKeySerializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializers#getDefault()}
 * @utbot.returnsFrom {@code return DEFAULT_KEY_SERIALIZER;}
 *  */
    @Test
    public void testGetDefault_ReturnDEFAULT_KEY_SERIALIZER() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonSerializer prevDEFAULT_KEY_SERIALIZER = StdKeySerializers.DEFAULT_KEY_SERIALIZER;
        try {
            StdKeySerializer defaultKeySerializer = new StdKeySerializer();
            Class stdKeySerializersClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
            setStaticField(stdKeySerializersClazz, "DEFAULT_KEY_SERIALIZER", defaultKeySerializer);
            
            StdKeySerializer actual = ((StdKeySerializer) StdKeySerializers.getDefault());
            
            Class defaultKeySerializer_handledType = defaultKeySerializer._handledType;
            Class actual_handledType = actual._handledType;
            assertEquals(Class.class, actual_handledType.getClass());
            
        } finally {
            setStaticField(StdKeySerializers.class, "DEFAULT_KEY_SERIALIZER", prevDEFAULT_KEY_SERIALIZER);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getDefault()
    
    /**
     * @utbot.classUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializers}
     * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializers#getDefault()}
     */
    @Test
    public void testGetDefault() {
        StdKeySerializer actual = ((StdKeySerializer) StdKeySerializers.getDefault());
        
        StdKeySerializer expected = new StdKeySerializer();
        
        Class expected_handledType = expected._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getFallbackKeySerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFallbackKeySerializer(com.fasterxml.jackson.databind.SerializationConfig, java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link StdKeySerializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializers#getFallbackKeySerializer(com.fasterxml.jackson.databind.SerializationConfig,java.lang.Class)}
 * @utbot.executesCondition {@code (rawKeyType != null): True}
 * @utbot.executesCondition {@code (rawKeyType): True}
 * @utbot.returnsFrom {@code return new Dynamic();}
 *  */
    @Test
    public void testGetFallbackKeySerializer_RawKeyType() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Object prevFOR_PROPERTIES = getStaticFieldValue(emptyClazz, "FOR_PROPERTIES");
        try {
            Object forProperties = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
            setStaticField(emptyClazz, "FOR_PROPERTIES", forProperties);
            Class class1 = Object.class;
            
            StdKeySerializer actual = ((StdKeySerializer) StdKeySerializers.getFallbackKeySerializer(null, class1));
            
            StdKeySerializer expected = new StdKeySerializer();
            
            Class expected_handledType = expected._handledType;
            Class actual_handledType = actual._handledType;
            assertEquals(Class.class, actual_handledType.getClass());
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(emptyClazz, "FOR_PROPERTIES", prevFOR_PROPERTIES);
        }
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializers#getFallbackKeySerializer(com.fasterxml.jackson.databind.SerializationConfig,java.lang.Class)}
 * @utbot.executesCondition {@code (rawKeyType != null): False}
 * @utbot.returnsFrom {@code return DEFAULT_KEY_SERIALIZER;}
 *  */
    @Test
    public void testGetFallbackKeySerializer_RawKeyTypeEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        JsonSerializer prevDEFAULT_KEY_SERIALIZER = StdKeySerializers.DEFAULT_KEY_SERIALIZER;
        try {
            StdKeySerializer defaultKeySerializer = new StdKeySerializer();
            Class stdKeySerializersClazz = Class.forName("com.fasterxml.jackson.databind.ser.std.StdKeySerializers");
            setStaticField(stdKeySerializersClazz, "DEFAULT_KEY_SERIALIZER", defaultKeySerializer);
            
            StdKeySerializer actual = ((StdKeySerializer) StdKeySerializers.getFallbackKeySerializer(null, null));
            
            Class defaultKeySerializer_handledType = defaultKeySerializer._handledType;
            Class actual_handledType = actual._handledType;
            assertEquals(Class.class, actual_handledType.getClass());
            
        } finally {
            setStaticField(StdKeySerializers.class, "DEFAULT_KEY_SERIALIZER", prevDEFAULT_KEY_SERIALIZER);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.ser.std.StdKeySerializers.getStdKeySerializer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStdKeySerializer(com.fasterxml.jackson.databind.SerializationConfig, java.lang.Class, boolean)
    
    /**
    @utbot.classUnderTest {@link StdKeySerializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializers#getStdKeySerializer(com.fasterxml.jackson.databind.SerializationConfig,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (rawKeyType == null): False}
 * @utbot.executesCondition {@code (rawKeyType): False}
 * @utbot.executesCondition {@code (rawKeyType): False}
 * @utbot.executesCondition {@code (rawKeyType.isPrimitive() || Number.class.isAssignableFrom(rawKeyType)): True}
 * @utbot.executesCondition {@code (rawKeyType): False}
 * @utbot.executesCondition {@code (Date.class.isAssignableFrom(rawKeyType)): False}
 * @utbot.executesCondition {@code (Calendar.class.isAssignableFrom(rawKeyType)): False}
 * @utbot.executesCondition {@code (rawKeyType): False}
 * @utbot.executesCondition {@code (useDefault): False}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isAssignableFrom(java.lang.Class)}
 * @utbot.returnsFrom {@code return useDefault ? DEFAULT_KEY_SERIALIZER : null;}
 *  */
    @Test
    public void testGetStdKeySerializer_NotUseDefault() throws Exception  {
        Class class1 = Object.class;
        
        StdKeySerializers.Dynamic actual = ((StdKeySerializers.Dynamic) StdKeySerializers.getStdKeySerializer(null, class1, false));
        
        StdKeySerializers.Dynamic expected = ((StdKeySerializers.Dynamic) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic"));
        Object _dynamicSerializers = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", "_dynamicSerializers", _dynamicSerializers);
        Class _handledType = String.class;
        setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
        
        PropertySerializerMap expected_dynamicSerializers = expected._dynamicSerializers;
        PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
        boolean actual_dynamicSerializers_resetWhenFull = ((Boolean) getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "_resetWhenFull"));
        assertFalse(actual_dynamicSerializers_resetWhenFull);
        
        Class expected_handledType = expected._handledType;
        Class actual_handledType = actual._handledType;
        assertEquals(Class.class, actual_handledType.getClass());
        
        Class finalClass1 = class1;
        
    }
    
    /**
    @utbot.classUnderTest {@link StdKeySerializers}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.ser.std.StdKeySerializers#getStdKeySerializer(com.fasterxml.jackson.databind.SerializationConfig,java.lang.Class,boolean)}
 * @utbot.executesCondition {@code (rawKeyType == null): True}
 * @utbot.returnsFrom {@code return new Dynamic();}
 *  */
    @Test
    public void testGetStdKeySerializer_RawKeyTypeEqualsNull() throws Exception  {
        Class emptyClazz = Class.forName("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
        Object prevFOR_PROPERTIES = getStaticFieldValue(emptyClazz, "FOR_PROPERTIES");
        try {
            Object forProperties = createInstance("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$Empty");
            setStaticField(emptyClazz, "FOR_PROPERTIES", forProperties);
            
            StdKeySerializers.Dynamic actual = ((StdKeySerializers.Dynamic) StdKeySerializers.getStdKeySerializer(null, null, false));
            
            StdKeySerializers.Dynamic expected = ((StdKeySerializers.Dynamic) createInstance("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic"));
            setField(expected, "com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Dynamic", "_dynamicSerializers", forProperties);
            Class _handledType = String.class;
            setField(expected, "com.fasterxml.jackson.databind.ser.std.StdSerializer", "_handledType", _handledType);
            
            PropertySerializerMap expected_dynamicSerializers = expected._dynamicSerializers;
            PropertySerializerMap actual_dynamicSerializers = actual._dynamicSerializers;
            boolean actual_dynamicSerializers_resetWhenFull = ((Boolean) getFieldValue(actual_dynamicSerializers, "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", "_resetWhenFull"));
            assertFalse(actual_dynamicSerializers_resetWhenFull);
            
            Class expected_handledType = expected._handledType;
            Class actual_handledType = actual._handledType;
            assertEquals(Class.class, actual_handledType.getClass());
            
        } finally {
            setStaticField(emptyClazz, "FOR_PROPERTIES", prevFOR_PROPERTIES);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1077474200260100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1077474200260100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1077474200270199 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1077474200260100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1077474200270199).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1077474204519500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1077474204519500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1077474204524000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1077474204519500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1077474204524000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1077474205466599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1077474205466599.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1077474205469399 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1077474205466599.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1077474205469399).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1077474206084800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1077474206084800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1077474206088000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1077474206084800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1077474206088000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

