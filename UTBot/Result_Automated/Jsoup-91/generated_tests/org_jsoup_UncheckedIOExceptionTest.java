package org.jsoup;

import org.junit.Test;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;

public final class org_jsoup_UncheckedIOExceptionTest {
    ///region Test suites for executable org.jsoup.UncheckedIOException.ioException
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ioException()
    
    /**
    @utbot.classUnderTest {@link UncheckedIOException}
 * @utbot.methodUnderTest {@link org.jsoup.UncheckedIOException#ioException()}
 * @utbot.invokes {@link org.jsoup.UncheckedIOException#getCause()}
 * @utbot.returnsFrom {@code return (IOException) getCause();}
 *  */
    @Test
    public void testIoException_UncheckedIOExceptionGetCause() throws Exception  {
        UncheckedIOException uncheckedIOException = ((UncheckedIOException) createInstance("org.jsoup.UncheckedIOException"));
        
        IOException actual = uncheckedIOException.ioException();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ioException()
    
    /**
    @utbot.classUnderTest {@link UncheckedIOException}
 * @utbot.methodUnderTest {@link org.jsoup.UncheckedIOException#ioException()}
 * @utbot.invokes {@link org.jsoup.UncheckedIOException#getCause()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (IOException) getCause();
 *  */
    @Test
    public void testIoException_ThrowClassCastException() throws Exception  {
        UncheckedIOException uncheckedIOException = ((UncheckedIOException) createInstance("org.jsoup.UncheckedIOException"));
        CloneNotSupportedException cause = ((CloneNotSupportedException) createInstance("java.lang.CloneNotSupportedException"));
        setField(uncheckedIOException, "java.lang.Throwable", "cause", cause);
        
        /* This test fails because method [org.jsoup.UncheckedIOException.ioException] produces [java.lang.ClassCastException: class java.lang.CloneNotSupportedException cannot be cast to class java.io.IOException (java.lang.CloneNotSupportedException and java.io.IOException are in module java.base of loader 'bootstrap')]
            org.jsoup.UncheckedIOException.ioException(UncheckedIOException.java:12) */
        uncheckedIOException.ioException();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1009396856327900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1009396856327900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1009396856335200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009396856327900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009396856335200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

