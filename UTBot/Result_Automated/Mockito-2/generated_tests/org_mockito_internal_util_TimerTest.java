package org.mockito.internal.util;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_mockito_internal_util_TimerTest {
    ///region Test suites for executable org.mockito.internal.util.Timer.start
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method start()
    
    /**
    @utbot.classUnderTest {@link Timer}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.Timer#start()}
 * @utbot.invokes {@link java.lang.System#currentTimeMillis()}
 *  */
    @Test
    public void testStart_SystemCurrentTimeMillis() throws Exception  {
        Timer timer = ((Timer) createInstance("org.mockito.internal.util.Timer"));
        setField(timer, "org.mockito.internal.util.Timer", "startTime", -255L);
        
        timer.start();
        
        long finalTimerStartTime = ((Long) getFieldValue(timer, "org.mockito.internal.util.Timer", "startTime"));
        
        assertEquals(1790846066911L, finalTimerStartTime);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method start()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.util.Timer}
     * @utbot.methodUnderTest {@link org.mockito.internal.util.Timer#start()}
     */
    @Test
    public void testStart() {
        Timer timer = new Timer(4194305L);
        
        timer.start();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.Timer.isCounting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isCounting()
    
    /**
    @utbot.classUnderTest {@link Timer}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.Timer#isCounting()}
 * @utbot.returnsFrom {@code return System.currentTimeMillis() - startTime <= durationMillis;}
 *  */
    @Test
    public void testIsCounting_SystemCurrentTimeMillisMinusStartTimeLessOrEqualDurationMillis() throws Exception  {
        Timer timer = ((Timer) createInstance("org.mockito.internal.util.Timer"));
        setField(timer, "org.mockito.internal.util.Timer", "durationMillis", -249L);
        setField(timer, "org.mockito.internal.util.Timer", "startTime", 121L);
        
        boolean actual = timer.isCounting();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Timer}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.Timer#isCounting()}
 * @utbot.returnsFrom {@code return System.currentTimeMillis() - startTime <= durationMillis;}
 *  */
    @Test
    public void testIsCounting_SystemCurrentTimeMillisMinusStartTimeGreaterThanDurationMillis() throws Exception  {
        Timer timer = ((Timer) createInstance("org.mockito.internal.util.Timer"));
        setField(timer, "org.mockito.internal.util.Timer", "durationMillis", -254L);
        setField(timer, "org.mockito.internal.util.Timer", "startTime", -2L);
        
        boolean actual = timer.isCounting();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isCounting()
    
    /**
    @utbot.classUnderTest {@link Timer}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.Timer#isCounting()}
 * @utbot.executesCondition {@code (assert startTime != -1;): True}
 * @utbot.executesCondition {@code (assert startTime != -1;): True}
 * @utbot.throwsException {@link java.lang.AssertionError} in: assert startTime != -1;
 *  */
    @Test
    public void testIsCounting_ThrowAssertionError() throws Exception  {
        Timer timer = ((Timer) createInstance("org.mockito.internal.util.Timer"));
        setField(timer, "org.mockito.internal.util.Timer", "startTime", -1L);
        
        /* This test fails because method [org.mockito.internal.util.Timer.isCounting] produces [java.lang.AssertionError]
            org.mockito.internal.util.Timer.isCounting(Timer.java:23) */
        timer.isCounting();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isCounting()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.util.Timer}
     * @utbot.methodUnderTest {@link org.mockito.internal.util.Timer#isCounting()}
     */
    @Test
    public void testIsCountingThrowsAE() {
        Timer timer = new Timer(4L);
        
        /* This test fails because method [org.mockito.internal.util.Timer.isCounting] produces [java.lang.AssertionError]
            org.mockito.internal.util.Timer.isCounting(Timer.java:23) */
        timer.isCounting();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1106910109326600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1106910109326600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1106910109335300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1106910109326600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1106910109335300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1106910110141200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1106910110141200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1106910110145800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1106910110141200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1106910110145800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

