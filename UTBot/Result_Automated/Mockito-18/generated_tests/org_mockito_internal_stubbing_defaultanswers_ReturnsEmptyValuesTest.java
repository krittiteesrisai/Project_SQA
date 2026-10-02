package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import org.mockito.internal.invocation.SerializableMethod;
import java.lang.reflect.Method;
import org.mockito.internal.util.ObjectMethodsGuru;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.creation.DelegatingMethod;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;

public final class org_mockito_internal_stubbing_defaultanswers_ReturnsEmptyValuesTest {
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues.answer
    
    ///region Errors report for answer
    
    public void testAnswer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues.returnValueFor
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method returnValueFor(java.lang.Class)
    
    @Test
    public void testReturnValueFor1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class primitivesClazz = Class.forName("org.mockito.internal.util.Primitives");
        Map prevPRIMITIVE_OR_WRAPPER_DEFAULT_VALUES = ((Map) getStaticFieldValue(primitivesClazz, "PRIMITIVE_OR_WRAPPER_DEFAULT_VALUES"));
        try {
            LinkedHashMap primitiveOrWrapperDefaultValues = new LinkedHashMap();
            Class class1 = Boolean.class;
            Boolean boolean1 = false;
            primitiveOrWrapperDefaultValues.put(class1, boolean1);
            Class class2 = Character.class;
            Character character = '\u0000';
            primitiveOrWrapperDefaultValues.put(class2, character);
            Class class3 = Byte.class;
            Byte byte1 = (byte) 0;
            primitiveOrWrapperDefaultValues.put(class3, byte1);
            Class class4 = Short.class;
            Short short1 = (short) 0;
            primitiveOrWrapperDefaultValues.put(class4, short1);
            Class class5 = Integer.class;
            Integer integer = 0;
            primitiveOrWrapperDefaultValues.put(class5, integer);
            Class class6 = Long.class;
            Long long1 = 0L;
            primitiveOrWrapperDefaultValues.put(class6, long1);
            Class class7 = Float.class;
            Float float1 = 0.0f;
            primitiveOrWrapperDefaultValues.put(class7, float1);
            Class class8 = Double.class;
            Double double1 = 0.0;
            primitiveOrWrapperDefaultValues.put(class8, double1);
            Class class9 = boolean.class;
            Boolean boolean2 = false;
            primitiveOrWrapperDefaultValues.put(class9, boolean2);
            Class class10 = char.class;
            Character character1 = '\u0000';
            primitiveOrWrapperDefaultValues.put(class10, character1);
            Class class11 = byte.class;
            Byte byte2 = (byte) 0;
            primitiveOrWrapperDefaultValues.put(class11, byte2);
            Class class12 = short.class;
            Short short2 = (short) 0;
            primitiveOrWrapperDefaultValues.put(class12, short2);
            Class class13 = int.class;
            Integer integer1 = 0;
            primitiveOrWrapperDefaultValues.put(class13, integer1);
            Class class14 = long.class;
            Long long2 = 0L;
            primitiveOrWrapperDefaultValues.put(class14, long2);
            Class class15 = float.class;
            Float float2 = 0.0f;
            primitiveOrWrapperDefaultValues.put(class15, float2);
            Class class16 = double.class;
            Double double2 = 0.0;
            primitiveOrWrapperDefaultValues.put(class16, double2);
            setStaticField(primitivesClazz, "PRIMITIVE_OR_WRAPPER_DEFAULT_VALUES", primitiveOrWrapperDefaultValues);
            ReturnsEmptyValues returnsEmptyValues = new ReturnsEmptyValues();
            Class class17 = Object.class;
            
            Object actual = returnsEmptyValues.returnValueFor(class17);
            
            assertNull(actual);
            
            Class finalClass17 = class17;
            
        } finally {
            setStaticField(org.mockito.internal.util.Primitives.class, "PRIMITIVE_OR_WRAPPER_DEFAULT_VALUES", prevPRIMITIVE_OR_WRAPPER_DEFAULT_VALUES);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1123078738322600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1123078738322600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1123078738336799 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1123078738322600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1123078738336799).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1123078740450399 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1123078740450399.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1123078740457000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1123078740450399.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1123078740457000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1123078741786300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1123078741786300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1123078741791399 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1123078741786300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1123078741791399).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

