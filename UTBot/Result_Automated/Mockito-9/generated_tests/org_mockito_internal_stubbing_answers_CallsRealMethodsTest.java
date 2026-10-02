package org.mockito.internal.stubbing.answers;

import org.junit.Test;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.invocation.SerializableMethod;
import org.mockito.internal.creation.DelegatingMethod;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class org_mockito_internal_stubbing_answers_CallsRealMethodsTest {
    ///region Test suites for executable org.mockito.internal.stubbing.answers.CallsRealMethods.answer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method answer(org.mockito.invocation.InvocationOnMock)
    
    /**
    @utbot.classUnderTest {@link CallsRealMethods}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.CallsRealMethods#answer(org.mockito.invocation.InvocationOnMock)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.callRealMethod();
 *  */
    @Test
    public void testAnswer_ThrowNullPointerException() throws Throwable  {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        
        /* This test fails because method [org.mockito.internal.stubbing.answers.CallsRealMethods.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:42) */
        callsRealMethods.answer(null);
    }
    
    /**
    @utbot.classUnderTest {@link CallsRealMethods}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.answers.CallsRealMethods#answer(org.mockito.invocation.InvocationOnMock)}
 * @utbot.invokes {@link org.mockito.invocation.InvocationOnMock#callRealMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.callRealMethod();
 *  */
    @Test
    public void testAnswer_ThrowNullPointerException_1() throws Throwable  {
        CallsRealMethods callsRealMethods = new CallsRealMethods();
        InvocationImpl invocationImpl = ((InvocationImpl) createInstance("org.mockito.internal.invocation.InvocationImpl"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "isAbstract", true);
        setField(invocationImpl, "org.mockito.internal.invocation.InvocationImpl", "method", method);
        
        /* This test fails because method [org.mockito.internal.stubbing.answers.CallsRealMethods.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.SerializableMethod.getJavaMethod(SerializableMethod.java:76)
            org.mockito.internal.invocation.InvocationImpl.getMethod(InvocationImpl.java:58)
            org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:42) */
        callsRealMethods.answer(invocationImpl);
    }
    ///endregion
    
    ///region Errors report for answer
    
    public void testAnswer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field modifiers is not declared in class java.lang.reflect.Method
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1109774785567600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1109774785567600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1109774785573700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1109774785567600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1109774785573700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

