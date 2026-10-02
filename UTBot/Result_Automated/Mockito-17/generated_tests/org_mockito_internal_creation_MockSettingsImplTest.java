package org.mockito.internal.creation;

import org.junit.Test;
import org.mockito.internal.util.MockName;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertTrue;

public final class org_mockito_internal_creation_MockSettingsImplTest {
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.name
    
    ///region Errors report for name
    
    public void testName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.isSerializable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSerializable()
    
    /**
    @utbot.classUnderTest {@link MockSettingsImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.MockSettingsImpl#isSerializable()}
 * @utbot.returnsFrom {@code return extraInterfaces != null && java.util.Arrays.asList(extraInterfaces).contains(java.io.Serializable.class);}
 *  */
    @Test
    public void testIsSerializable_ExtraInterfacesEqualsNullAndJavaUtilArraysAsListExtraInterfacesContains() throws Exception  {
        MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
        java.lang.Class[] extraInterfaces = {};
        setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
        
        boolean actual = mockSettingsImpl.isSerializable();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MockSettingsImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.MockSettingsImpl#isSerializable()}
 * @utbot.returnsFrom {@code return extraInterfaces != null && java.util.Arrays.asList(extraInterfaces).contains(java.io.Serializable.class);}
 *  */
    @Test
    public void testIsSerializable_ExtraInterfacesNotEqualsNullAndJavaUtilArraysAsListExtraInterfacesContains() throws Exception  {
        MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
        java.lang.Class[] extraInterfaces = new java.lang.Class[1];
        Class class1 = Object.class;
        extraInterfaces[0] = class1;
        setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces", extraInterfaces);
        
        java.lang.Class[] mockSettingsImplExtraInterfaces = ((java.lang.Class[]) getFieldValue(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces"));
        Class initialMockSettingsImplExtraInterfaces0 = ((Class) get(mockSettingsImplExtraInterfaces, 0));
        
        boolean actual = mockSettingsImpl.isSerializable();
        
        assertTrue(actual);
        
        java.lang.Class[] mockSettingsImplExtraInterfaces1 = ((java.lang.Class[]) getFieldValue(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "extraInterfaces"));
        Class finalMockSettingsImplExtraInterfaces0 = ((Class) get(mockSettingsImplExtraInterfaces1, 0));
        
        assertFalse(initialMockSettingsImplExtraInterfaces0 == finalMockSettingsImplExtraInterfaces0);
    }
    ///endregion
    
    ///region Errors report for isSerializable
    
    public void testIsSerializable_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.serializable
    
    ///region Errors report for serializable
    
    public void testSerializable_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.getSpiedInstance
    
    ///region Errors report for getSpiedInstance
    
    public void testGetSpiedInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.initiateMockName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initiateMockName(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link MockSettingsImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.MockSettingsImpl#initiateMockName(java.lang.Class)}
 *  */
    @Test
    public void testInitiateMockName() throws Exception  {
        MockSettingsImpl mockSettingsImpl = ((MockSettingsImpl) createInstance("org.mockito.internal.creation.MockSettingsImpl"));
        String name = "";
        setField(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "name", name);
        
        MockName initialMockSettingsImplMockName = ((MockName) getFieldValue(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "mockName"));
        
        mockSettingsImpl.initiateMockName(null);
        
        MockName finalMockSettingsImplMockName = ((MockName) getFieldValue(mockSettingsImpl, "org.mockito.internal.creation.MockSettingsImpl", "mockName"));
        
        assertFalse(initialMockSettingsImplMockName == finalMockSettingsImplMockName);
    }
    ///endregion
    
    ///region Errors report for initiateMockName
    
    public void testInitiateMockName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 198 occurrences of:
        // Concrete execution failed
        
        // 8 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.spiedInstance
    
    ///region Errors report for spiedInstance
    
    public void testSpiedInstance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.getExtraInterfaces
    
    ///region Errors report for getExtraInterfaces
    
    public void testGetExtraInterfaces_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.defaultAnswer
    
    ///region Errors report for defaultAnswer
    
    public void testDefaultAnswer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.extraInterfaces
    
    ///region Errors report for extraInterfaces
    
    public void testExtraInterfaces_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.getMockName
    
    ///region Errors report for getMockName
    
    public void testGetMockName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.MockSettingsImpl.getDefaultAnswer
    
    ///region Errors report for getDefaultAnswer
    
    public void testGetDefaultAnswer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1122501017292599 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1122501017292599.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1122501017306700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1122501017292599.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1122501017306700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1122501018217800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1122501018217800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1122501018224200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1122501018217800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1122501018224200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

