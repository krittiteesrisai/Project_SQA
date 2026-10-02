package org.mockito.internal.invocation;

import org.junit.Test;
import java.util.ArrayList;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.creation.DelegatingMethod;
import java.lang.reflect.Method;
import org.mockito.internal.debugging.Location;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public final class org_mockito_internal_invocation_InvocationMatcherTest {
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.toString
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testToString_ThrowClassCastException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        short[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.toString] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        invocationMatcher.toString();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testToString_ThrowClassCastException_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.toString] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        invocationMatcher.toString();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#toString(java.util.List,org.mockito.internal.reporting.PrintSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.toString(matchers, new PrintSettings());
 *  */
    @Test
    public void testToString_ThrowNullPointerException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.toString] produces [java.lang.NullPointerException]
            org.mockito.internal.reporting.PrintSettings.print(PrintSettings.java:59)
            org.mockito.internal.invocation.InvocationMatcher.toString(InvocationMatcher.java:75) */
        invocationMatcher.toString();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testToString_ThrowNullPointerException_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.toString] produces [java.lang.NullPointerException] */
        invocationMatcher.toString();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} 
 *  */
    @Test(expected = NotAMockException.class)
    public void testToString_ThrowNotAMockException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        byte[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        invocationMatcher.toString();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString()}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: return invocation.toString(matchers, new PrintSettings());
 *  */
    @Test(expected = NotAMockException.class)
    public void testToString_ThrowNotAMockException_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        invocationMatcher.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.toString
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString(org.mockito.internal.reporting.PrintSettings)
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString(org.mockito.internal.reporting.PrintSettings)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} 
 *  */
    @Test(expected = NotAMockException.class)
    public void testToString_ThrowNotAMockException1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        short[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        invocationMatcher.toString(null);
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString(org.mockito.internal.reporting.PrintSettings)}
 * @utbot.throwsException {@link org.mockito.exceptions.misusing.NotAMockException} in: return invocation.toString(matchers, printSettings);
 *  */
    @Test(expected = NotAMockException.class)
    public void testToString_ThrowNotAMockException_11() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        invocationMatcher.toString(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString(org.mockito.internal.reporting.PrintSettings)
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#toString(org.mockito.internal.reporting.PrintSettings)}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#toString(java.util.List,org.mockito.internal.reporting.PrintSettings)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testToString_ThrowClassCastException1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        int[] mock = {};
        setField(invocation, "org.mockito.internal.invocation.Invocation", "mock", mock);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        ArrayList matchers = new ArrayList();
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers", matchers);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.toString] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        invocationMatcher.toString(null);
    }
    ///endregion
    
    ///region Errors report for toString
    
    public void testToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.matches
    
    ///region Errors report for matches
    
    public void testMatches_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMethod()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#getMethod()}
 * @utbot.returnsFrom {@code return invocation.getMethod();}
 *  */
    @Test
    public void testGetMethod_InvocationGetMethod() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        DelegatingMethod method = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        Method actual = invocationMatcher.getMethod();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMethod()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetMethod_ThrowClassCastException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        invocationMatcher.getMethod();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetMethod_ThrowClassCastException_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [java.lang.ClassCastException: The object with type java.lang.Object can not be casted to java.lang.Class$ReflectionData] */
        invocationMatcher.getMethod();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#getMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getMethod();
 *  */
    @Test
    public void testGetMethod_ThrowNullPointerException() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [java.lang.NullPointerException]
            org.mockito.internal.invocation.InvocationMatcher.getMethod(InvocationMatcher.java:58) */
        invocationMatcher.getMethod();
    }
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetMethod_ThrowNullPointerException_1() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        String methodName = "";
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "methodName", methodName);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        /* This test fails because method [org.mockito.internal.invocation.InvocationMatcher.getMethod] produces [java.lang.NullPointerException] */
        invocationMatcher.getMethod();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getMethod()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMethod()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#getMethod()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return invocation.getMethod();
 *  */
    @Test(expected = NullPointerException.class)
    public void testGetMethod_ThrowNullPointerException_2() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        SerializableMethod method = ((SerializableMethod) createInstance("org.mockito.internal.invocation.SerializableMethod"));
        Class declaringClass = Object.class;
        setField(method, "org.mockito.internal.invocation.SerializableMethod", "declaringClass", declaringClass);
        setField(invocation, "org.mockito.internal.invocation.Invocation", "method", method);
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        invocationMatcher.getMethod();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocation()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getLocation()}
 * @utbot.invokes {@link org.mockito.internal.invocation.Invocation#getLocation()}
 * @utbot.returnsFrom {@code return invocation.getLocation();}
 *  */
    @Test
    public void testGetLocation_InvocationGetLocation() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        Invocation invocation = ((Invocation) createInstance("org.mockito.internal.invocation.Invocation"));
        setField(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "invocation", invocation);
        
        Location actual = invocationMatcher.getLocation();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region Errors report for getLocation
    
    public void testGetLocation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getMatchers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMatchers()
    
    /**
    @utbot.classUnderTest {@link InvocationMatcher}
 * @utbot.methodUnderTest {@link org.mockito.internal.invocation.InvocationMatcher#getMatchers()}
 * @utbot.returnsFrom {@code return this.matchers;}
 *  */
    @Test
    public void testGetMatchers_ReturnThisMatchers() throws Exception  {
        InvocationMatcher invocationMatcher = ((InvocationMatcher) createInstance("org.mockito.internal.invocation.InvocationMatcher"));
        
        List actual = invocationMatcher.getMatchers();
        
        assertNull(actual);
        
        List finalInvocationMatcherMatchers = ((List) getFieldValue(invocationMatcher, "org.mockito.internal.invocation.InvocationMatcher", "matchers"));
        
        assertNull(finalInvocationMatcherMatchers);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.hasSimilarMethod
    
    ///region Errors report for hasSimilarMethod
    
    public void testHasSimilarMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field name is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.hasSameMethod
    
    ///region Errors report for hasSameMethod
    
    public void testHasSameMethod_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.safelyArgumentsMatch
    
    ///region Errors report for safelyArgumentsMatch
    
    public void testSafelyArgumentsMatch_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @376b4233 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.captureArgumentsFrom
    
    ///region Errors report for captureArgumentsFrom
    
    public void testCaptureArgumentsFrom_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 9 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.invocation.InvocationMatcher.getInvocation
    
    ///region Errors report for getInvocation
    
    public void testGetInvocation_errors()
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1128891685975700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1128891685975700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1128891685981200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1128891685975700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1128891685981200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1128891686402300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1128891686402300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1128891686403400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1128891686402300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1128891686403400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

