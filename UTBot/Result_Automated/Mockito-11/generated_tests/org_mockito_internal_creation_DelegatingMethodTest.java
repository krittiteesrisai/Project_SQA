package org.mockito.internal.creation;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_mockito_internal_creation_DelegatingMethodTest {
    ///region Test suites for executable org.mockito.internal.creation.DelegatingMethod.getName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getName()
    
    /**
    @utbot.classUnderTest {@link DelegatingMethod}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.DelegatingMethod#getName()}
 * @utbot.invokes {@link java.lang.reflect.Method#getName()}
 * @utbot.returnsFrom {@code return method.getName();}
 *  */
    @Test
    public void testGetName_MethodGetName() throws Exception  {
        DelegatingMethod delegatingMethod = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(delegatingMethod, "org.mockito.internal.creation.DelegatingMethod", "method", method);
        
        String actual = delegatingMethod.getName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getName()
    
    /**
    @utbot.classUnderTest {@link DelegatingMethod}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.DelegatingMethod#getName()}
 * @utbot.invokes {@link java.lang.reflect.Method#getName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return method.getName();
 *  */
    @Test
    public void testGetName_ThrowNullPointerException() throws Exception  {
        DelegatingMethod delegatingMethod = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        
        /* This test fails because method [org.mockito.internal.creation.DelegatingMethod.getName] produces [java.lang.NullPointerException]
            org.mockito.internal.creation.DelegatingMethod.getName(DelegatingMethod.java:35) */
        delegatingMethod.getName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.DelegatingMethod.equals
    
    ///region Errors report for equals
    
    public void testEquals_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field clazz is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.DelegatingMethod.hashCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link DelegatingMethod}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.DelegatingMethod#hashCode()}
 * @utbot.returnsFrom {@code return 1;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return 1;
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        DelegatingMethod delegatingMethod = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        
        /* This test fails because method [org.mockito.internal.creation.DelegatingMethod.hashCode] produces [java.lang.NullPointerException]
            org.mockito.internal.creation.DelegatingMethod.hashCode(DelegatingMethod.java:77) */
        delegatingMethod.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.DelegatingMethod.getReturnType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReturnType()
    
    /**
    @utbot.classUnderTest {@link DelegatingMethod}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.DelegatingMethod#getReturnType()}
 * @utbot.invokes {@link java.lang.reflect.Method#getReturnType()}
 * @utbot.returnsFrom {@code return method.getReturnType();}
 *  */
    @Test
    public void testGetReturnType_MethodGetReturnType() throws Exception  {
        DelegatingMethod delegatingMethod = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        Method method = ((Method) createInstance("java.lang.reflect.Method"));
        setField(delegatingMethod, "org.mockito.internal.creation.DelegatingMethod", "method", method);
        
        Class actual = delegatingMethod.getReturnType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReturnType()
    
    /**
    @utbot.classUnderTest {@link DelegatingMethod}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.DelegatingMethod#getReturnType()}
 * @utbot.invokes {@link java.lang.reflect.Method#getReturnType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return method.getReturnType();
 *  */
    @Test
    public void testGetReturnType_ThrowNullPointerException() throws Exception  {
        DelegatingMethod delegatingMethod = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        
        /* This test fails because method [org.mockito.internal.creation.DelegatingMethod.getReturnType] produces [java.lang.NullPointerException]
            org.mockito.internal.creation.DelegatingMethod.getReturnType(DelegatingMethod.java:45) */
        delegatingMethod.getReturnType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.DelegatingMethod.getParameterTypes
    
    ///region Errors report for getParameterTypes
    
    public void testGetParameterTypes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field parameterTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.DelegatingMethod.isVarArgs
    
    ///region Errors report for isVarArgs
    
    public void testIsVarArgs_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field modifiers is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.DelegatingMethod.getExceptionTypes
    
    ///region Errors report for getExceptionTypes
    
    public void testGetExceptionTypes_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field exceptionTypes is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.DelegatingMethod.isAbstract
    
    ///region Errors report for isAbstract
    
    public void testIsAbstract_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Field modifiers is not declared in class java.lang.reflect.Method
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.creation.DelegatingMethod.getJavaMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJavaMethod()
    
    /**
    @utbot.classUnderTest {@link DelegatingMethod}
 * @utbot.methodUnderTest {@link org.mockito.internal.creation.DelegatingMethod#getJavaMethod()}
 * @utbot.returnsFrom {@code return method;}
 *  */
    @Test
    public void testGetJavaMethod_ReturnMethod() throws Exception  {
        DelegatingMethod delegatingMethod = ((DelegatingMethod) createInstance("org.mockito.internal.creation.DelegatingMethod"));
        
        Method actual = delegatingMethod.getJavaMethod();
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1137760360307800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1137760360307800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1137760360315100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1137760360307800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1137760360315100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

