package org.mockito.internal.verification;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.mockito.internal.util.Timer;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.verification.VerificationMode;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_mockito_internal_verification_VerificationOverTimeImplTest {
    ///region Test suites for executable org.mockito.internal.verification.VerificationOverTimeImpl.sleep
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sleep(long)
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#sleep(long)}
 * @utbot.invokes {@link java.lang.Thread#sleep(long)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testSleep_ThrowIllegalArgumentException() throws Throwable  {
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 0L, null, false);
        
        /* This test fails because method [org.mockito.internal.verification.VerificationOverTimeImpl.sleep] produces [java.lang.IllegalArgumentException: timeout value is negative]
            java.base/java.lang.Thread.sleep(Native Method)
            org.mockito.internal.verification.VerificationOverTimeImpl.sleep(VerificationOverTimeImpl.java:125) */
        Class verificationOverTimeImplClazz = Class.forName("org.mockito.internal.verification.VerificationOverTimeImpl");
        Class longType = long.class;
        Method sleepMethod = verificationOverTimeImplClazz.getDeclaredMethod("sleep", longType);
        sleepMethod.setAccessible(true);
        java.lang.Object[] sleepMethodArguments = new java.lang.Object[1];
        sleepMethodArguments[0] = -255L;
        try {
            sleepMethod.invoke(verificationOverTimeImpl, sleepMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.verification.VerificationOverTimeImpl.verify
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verify(org.mockito.internal.verification.api.VerificationData)
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#verify(org.mockito.internal.verification.api.VerificationData)}
 * @utbot.executesCondition {@code (error != null): False}
 * @utbot.invokes {@link org.mockito.internal.util.Timer#start()}
 * @utbot.iterates iterate the loop {@code while(timer.isCounting())} once
 *  */
    @Test
    public void testVerify_ErrorEqualsNull() throws Exception  {
        Timer timer = ((Timer) createInstance("org.mockito.internal.util.Timer"));
        setField(timer, "org.mockito.internal.util.Timer", "durationMillis", -254L);
        setField(timer, "org.mockito.internal.util.Timer", "startTime", -255L);
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 0L, null, false, timer);
        
        verificationOverTimeImpl.verify(null);
        
        Timer verificationOverTimeImplTimer = ((Timer) getFieldValue(verificationOverTimeImpl, "org.mockito.internal.verification.VerificationOverTimeImpl", "timer"));
        long finalVerificationOverTimeImplTimerStartTime = ((Long) getFieldValue(verificationOverTimeImplTimer, "org.mockito.internal.util.Timer", "startTime"));
        
        assertEquals(-9223372036854775555L, finalVerificationOverTimeImplTimerStartTime);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verify(org.mockito.internal.verification.api.VerificationData)
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#verify(org.mockito.internal.verification.api.VerificationData)}
 * @utbot.invokes {@link org.mockito.internal.util.Timer#start()}
 * @utbot.iterates iterate the loop {@code while(timer.isCounting())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delegate.verify(data);
 *  */
    @Test
    public void testVerify_ThrowNullPointerException() throws Exception  {
        Timer timer = ((Timer) createInstance("org.mockito.internal.util.Timer"));
        setField(timer, "org.mockito.internal.util.Timer", "durationMillis", -254L);
        setField(timer, "org.mockito.internal.util.Timer", "startTime", -255L);
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 0L, null, false, timer);
        
        /* This test fails because method [org.mockito.internal.verification.VerificationOverTimeImpl.verify] produces [java.lang.NullPointerException] */
        verificationOverTimeImpl.verify(null);
    }
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#verify(org.mockito.internal.verification.api.VerificationData)}
 * @utbot.invokes {@link org.mockito.internal.util.Timer#start()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: timer.start();
 *  */
    @Test
    public void testVerify_ThrowNullPointerException_1() {
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 0L, null, false, null);
        
        /* This test fails because method [org.mockito.internal.verification.VerificationOverTimeImpl.verify] produces [java.lang.NullPointerException] */
        verificationOverTimeImpl.verify(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verify(org.mockito.internal.verification.api.VerificationData)
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#verify(org.mockito.internal.verification.api.VerificationData)}
 * @utbot.iterates iterate the loop {@code while(timer.isCounting())} once
 * @utbot.throwsException {@link org.mockito.exceptions.base.MockitoException} in: delegate.verify(data);
 *  */
    @Test(expected = MockitoException.class)
    public void testVerify_ThrowMockitoException() throws Exception  {
        Calls calls = ((Calls) createInstance("org.mockito.internal.verification.Calls"));
        Timer timer = ((Timer) createInstance("org.mockito.internal.util.Timer"));
        setField(timer, "org.mockito.internal.util.Timer", "durationMillis", -254L);
        setField(timer, "org.mockito.internal.util.Timer", "startTime", -255L);
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 0L, calls, false, timer);
        
        verificationOverTimeImpl.verify(null);
    }
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#verify(org.mockito.internal.verification.api.VerificationData)}
 * @utbot.iterates iterate the loop {@code while(timer.isCounting())} once
 * @utbot.throwsException {@link java.lang.AssertionError} in: while(timer.isCounting())
 *  */
    @Test
    public void testVerify_ThrowAssertionError() throws Exception  {
        Timer timer = ((Timer) createInstance("org.mockito.internal.util.Timer"));
        setField(timer, "org.mockito.internal.util.Timer", "startTime", -255L);
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 0L, null, false, timer);
        
        /* This test fails because method [org.mockito.internal.verification.VerificationOverTimeImpl.verify] produces [java.lang.AssertionError] */
        verificationOverTimeImpl.verify(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.verification.VerificationOverTimeImpl.getDuration
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDuration()
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#getDuration()}
 * @utbot.returnsFrom {@code return durationMillis;}
 *  */
    @Test
    public void testGetDuration_ReturnDurationMillis() {
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 1L, null, false, null);
        
        long actual = verificationOverTimeImpl.getDuration();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.verification.VerificationOverTimeImpl.getDelegate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDelegate()
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#getDelegate()}
 * @utbot.returnsFrom {@code return delegate;}
 *  */
    @Test
    public void testGetDelegate_ReturnDelegate() {
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 0L, null, false, null);
        
        VerificationMode actual = verificationOverTimeImpl.getDelegate();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getDelegate()
    
    /**
     * @utbot.classUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl}
     * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#getDelegate()}
     */
    @Test
    public void testGetDelegate() throws Exception  {
        Times times = new Times(Integer.MAX_VALUE);
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(java.lang.Long.MAX_VALUE, java.lang.Long.MAX_VALUE, times, true);
        
        Times actual = ((Times) verificationOverTimeImpl.getDelegate());
        
        Times expected = ((Times) createInstance("org.mockito.internal.verification.Times"));
        setField(expected, "org.mockito.internal.verification.Times", "wantedCount", Integer.MAX_VALUE);
        
        int expectedWantedCount = expected.wantedCount;
        int actualWantedCount = actual.wantedCount;
        assertEquals(expectedWantedCount, actualWantedCount);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.verification.VerificationOverTimeImpl.canRecoverFromFailure
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method canRecoverFromFailure(org.mockito.verification.VerificationMode)
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#canRecoverFromFailure(org.mockito.verification.VerificationMode)}
 * @utbot.returnsFrom {@code return !(verificationMode instanceof AtMost || verificationMode instanceof NoMoreInteractions);}
 *  */
    @Test
    public void testCanRecoverFromFailure_NotVerificationModeNotInstanceOfAtMostOrVerificationModeNotInstanceOfNoMoreInteractions() throws Exception  {
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 0L, null, false);
        AtMost atMost = ((AtMost) createInstance("org.mockito.internal.verification.AtMost"));
        
        boolean actual = verificationOverTimeImpl.canRecoverFromFailure(atMost);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#canRecoverFromFailure(org.mockito.verification.VerificationMode)}
 * @utbot.returnsFrom {@code return !(verificationMode instanceof AtMost || verificationMode instanceof NoMoreInteractions);}
 *  */
    @Test
    public void testCanRecoverFromFailure_NotVerificationModeNotInstanceOfAtMostOrVerificationModeNotInstanceOfNoMoreInteractions_1() {
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 0L, null, false);
        NoMoreInteractions noMoreInteractions = new NoMoreInteractions();
        
        boolean actual = verificationOverTimeImpl.canRecoverFromFailure(noMoreInteractions);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#canRecoverFromFailure(org.mockito.verification.VerificationMode)}
 * @utbot.returnsFrom {@code return !(verificationMode instanceof AtMost || verificationMode instanceof NoMoreInteractions);}
 *  */
    @Test
    public void testCanRecoverFromFailure_NotVerificationModeInstanceOfAtMostOrVerificationModeInstanceOfNoMoreInteractions() {
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(0L, 0L, null, false);
        
        boolean actual = verificationOverTimeImpl.canRecoverFromFailure(null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.verification.VerificationOverTimeImpl.getPollingPeriod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPollingPeriod()
    
    /**
    @utbot.classUnderTest {@link VerificationOverTimeImpl}
 * @utbot.methodUnderTest {@link org.mockito.internal.verification.VerificationOverTimeImpl#getPollingPeriod()}
 * @utbot.returnsFrom {@code return pollingPeriodMillis;}
 *  */
    @Test
    public void testGetPollingPeriod_ReturnPollingPeriodMillis() {
        VerificationOverTimeImpl verificationOverTimeImpl = new VerificationOverTimeImpl(1L, 0L, null, false, null);
        
        long actual = verificationOverTimeImpl.getPollingPeriod();
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///region Errors report for getPollingPeriod
    
    public void testGetPollingPeriod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1108230911677200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1108230911677200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1108230911685100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1108230911677200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1108230911685100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1108230912205500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1108230912205500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1108230912208200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1108230912205500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1108230912208200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

