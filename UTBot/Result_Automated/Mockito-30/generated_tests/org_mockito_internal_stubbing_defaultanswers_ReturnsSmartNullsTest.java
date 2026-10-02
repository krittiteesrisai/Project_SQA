package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import org.mockito.internal.stubbing.answers.ThrowsException;
import org.mockito.internal.exceptions.base.ConditionalStackTraceFilter;
import org.mockito.internal.configuration.GlobalConfiguration;
import org.mockito.configuration.DefaultMockitoConfiguration;
import org.mockito.internal.exceptions.base.StackTraceFilter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

public final class org_mockito_internal_stubbing_defaultanswers_ReturnsSmartNullsTest {
    ///region Test suites for executable org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.answer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method answer(org.mockito.invocation.InvocationOnMock)
    
    /**
    @utbot.classUnderTest {@link ReturnsSmartNulls}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls#answer(org.mockito.invocation.InvocationOnMock)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAnswer_ThrowIndexOutOfBoundsException() throws Throwable  {
        Class globalConfigurationClazz = Class.forName("org.mockito.internal.configuration.GlobalConfiguration");
        ThreadLocal prevGlobalConfiguration = ((ThreadLocal) getStaticFieldValue(globalConfigurationClazz, "globalConfiguration"));
        try {
            Object globalConfiguration = createInstance("java.lang.ThreadLocal$SuppliedThreadLocal");
            setStaticField(globalConfigurationClazz, "globalConfiguration", globalConfiguration);
            ReturnsSmartNulls returnsSmartNulls = ((ReturnsSmartNulls) createInstance("org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls"));
            ThrowsException delegate = ((ThrowsException) createInstance("org.mockito.internal.stubbing.answers.ThrowsException"));
            NullPointerException throwable = ((NullPointerException) createInstance("java.lang.NullPointerException"));
            setField(throwable, "java.lang.NullPointerException", "extendedMessageState", 2);
            setField(delegate, "org.mockito.internal.stubbing.answers.ThrowsException", "throwable", throwable);
            ConditionalStackTraceFilter filter = ((ConditionalStackTraceFilter) createInstance("org.mockito.internal.exceptions.base.ConditionalStackTraceFilter"));
            GlobalConfiguration config = ((GlobalConfiguration) createInstance("org.mockito.internal.configuration.GlobalConfiguration"));
            setField(filter, "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter", "config", config);
            setField(delegate, "org.mockito.internal.stubbing.answers.ThrowsException", "filter", filter);
            setField(returnsSmartNulls, "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls", "delegate", delegate);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.answer] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
            returnsSmartNulls.answer(null);
        } finally {
            setStaticField(GlobalConfiguration.class, "globalConfiguration", prevGlobalConfiguration);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsSmartNulls}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls#answer(org.mockito.invocation.InvocationOnMock)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testAnswer_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        Class globalConfigurationClazz = Class.forName("org.mockito.internal.configuration.GlobalConfiguration");
        ThreadLocal prevGlobalConfiguration = ((ThreadLocal) getStaticFieldValue(globalConfigurationClazz, "globalConfiguration"));
        try {
            Object globalConfiguration = createInstance("java.lang.ThreadLocal$SuppliedThreadLocal");
            setField(globalConfiguration, "java.lang.ThreadLocal", "threadLocalHashCode", Integer.MIN_VALUE);
            setStaticField(globalConfigurationClazz, "globalConfiguration", globalConfiguration);
            ReturnsSmartNulls returnsSmartNulls = ((ReturnsSmartNulls) createInstance("org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls"));
            ThrowsException delegate = ((ThrowsException) createInstance("org.mockito.internal.stubbing.answers.ThrowsException"));
            NullPointerException throwable = ((NullPointerException) createInstance("java.lang.NullPointerException"));
            setField(throwable, "java.lang.NullPointerException", "extendedMessageState", 1048576);
            setField(delegate, "org.mockito.internal.stubbing.answers.ThrowsException", "throwable", throwable);
            ConditionalStackTraceFilter filter = ((ConditionalStackTraceFilter) createInstance("org.mockito.internal.exceptions.base.ConditionalStackTraceFilter"));
            GlobalConfiguration config = ((GlobalConfiguration) createInstance("org.mockito.internal.configuration.GlobalConfiguration"));
            setField(filter, "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter", "config", config);
            setField(delegate, "org.mockito.internal.stubbing.answers.ThrowsException", "filter", filter);
            setField(returnsSmartNulls, "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls", "delegate", delegate);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.answer] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
            returnsSmartNulls.answer(null);
        } finally {
            setStaticField(GlobalConfiguration.class, "globalConfiguration", prevGlobalConfiguration);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsSmartNulls}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls#answer(org.mockito.invocation.InvocationOnMock)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object defaultReturnValue = delegate.answer(invocation);
 *  */
    @Test
    public void testAnswer_ThrowClassCastException() throws Throwable  {
        Class globalConfigurationClazz = Class.forName("org.mockito.internal.configuration.GlobalConfiguration");
        ThreadLocal prevGlobalConfiguration = ((ThreadLocal) getStaticFieldValue(globalConfigurationClazz, "globalConfiguration"));
        try {
            Object globalConfiguration = createInstance("java.lang.ThreadLocal$SuppliedThreadLocal");
            setField(globalConfiguration, "java.lang.ThreadLocal", "threadLocalHashCode", 1);
            setStaticField(globalConfigurationClazz, "globalConfiguration", globalConfiguration);
            ReturnsSmartNulls returnsSmartNulls = ((ReturnsSmartNulls) createInstance("org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls"));
            ThrowsException delegate = ((ThrowsException) createInstance("org.mockito.internal.stubbing.answers.ThrowsException"));
            NullPointerException throwable = ((NullPointerException) createInstance("java.lang.NullPointerException"));
            setField(throwable, "java.lang.NullPointerException", "extendedMessageState", 2);
            setField(delegate, "org.mockito.internal.stubbing.answers.ThrowsException", "throwable", throwable);
            ConditionalStackTraceFilter filter = ((ConditionalStackTraceFilter) createInstance("org.mockito.internal.exceptions.base.ConditionalStackTraceFilter"));
            GlobalConfiguration config = ((GlobalConfiguration) createInstance("org.mockito.internal.configuration.GlobalConfiguration"));
            setField(filter, "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter", "config", config);
            setField(delegate, "org.mockito.internal.stubbing.answers.ThrowsException", "filter", filter);
            setField(returnsSmartNulls, "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls", "delegate", delegate);
            
            /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.answer] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to org.mockito.configuration.IMockitoConfiguration] */
            returnsSmartNulls.answer(null);
        } finally {
            setStaticField(GlobalConfiguration.class, "globalConfiguration", prevGlobalConfiguration);
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsSmartNulls}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls#answer(org.mockito.invocation.InvocationOnMock)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Object defaultReturnValue = delegate.answer(invocation);
 *  */
    @Test
    public void testAnswer_ThrowClassCastException_1() throws Throwable  {
        ReturnsSmartNulls returnsSmartNulls = ((ReturnsSmartNulls) createInstance("org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls"));
        ThrowsException delegate = ((ThrowsException) createInstance("org.mockito.internal.stubbing.answers.ThrowsException"));
        NullPointerException throwable = ((NullPointerException) createInstance("java.lang.NullPointerException"));
        setField(throwable, "java.lang.NullPointerException", "extendedMessageState", 1);
        String extendedMessage = "";
        setField(throwable, "java.lang.NullPointerException", "extendedMessage", extendedMessage);
        setField(delegate, "org.mockito.internal.stubbing.answers.ThrowsException", "throwable", throwable);
        ConditionalStackTraceFilter filter = ((ConditionalStackTraceFilter) createInstance("org.mockito.internal.exceptions.base.ConditionalStackTraceFilter"));
        DefaultMockitoConfiguration config = ((DefaultMockitoConfiguration) createInstance("org.mockito.configuration.DefaultMockitoConfiguration"));
        setField(filter, "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter", "config", config);
        StackTraceFilter filter1 = ((StackTraceFilter) createInstance("org.mockito.internal.exceptions.base.StackTraceFilter"));
        setField(filter, "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter", "filter", filter1);
        setField(delegate, "org.mockito.internal.stubbing.answers.ThrowsException", "filter", filter);
        setField(returnsSmartNulls, "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls", "delegate", delegate);
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.answer] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.StackTraceElement] */
        returnsSmartNulls.answer(null);
    }
    
    /**
    @utbot.classUnderTest {@link ReturnsSmartNulls}
 * @utbot.methodUnderTest {@link org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls#answer(org.mockito.invocation.InvocationOnMock)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object defaultReturnValue = delegate.answer(invocation);
 *  */
    @Test
    public void testAnswer_ThrowNullPointerException() throws Throwable  {
        ReturnsSmartNulls returnsSmartNulls = ((ReturnsSmartNulls) createInstance("org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls"));
        
        /* This test fails because method [org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.answer] produces [java.lang.NullPointerException]
            org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls.answer(ReturnsSmartNulls.java:47) */
        returnsSmartNulls.answer(null);
    }
    ///endregion
    
    ///region Errors report for answer
    
    public void testAnswer_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 16 occurrences of:
        // Field reflectionFactory is not declared in class java.lang.reflect.AccessibleObject
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1128043747221900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1128043747221900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1128043747231100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1128043747221900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1128043747231100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1128043751050900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1128043751050900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1128043751055300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1128043751050900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1128043751055300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1128043752705800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1128043752705800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1128043752711600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1128043752705800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1128043752711600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

