package com.google.gson.internal.bind;

import org.junit.Test;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

public final class com_google_gson_internal_bind_JsonAdapterAnnotationTypeAdapterFactoryTest {
    ///region Test suites for executable com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.create
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method create(com.google.gson.Gson, com.google.gson.reflect.TypeToken)
    
    /**
    @utbot.classUnderTest {@link JsonAdapterAnnotationTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory#create(com.google.gson.Gson,com.google.gson.reflect.TypeToken)}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getRawType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonAdapter annotation = targetType.getRawType().getAnnotation(JsonAdapter.class);
 *  */
    @Test
    public void testCreate_ThrowNullPointerException() {
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(null);
        
        /* This test fails because method [com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.create] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.create(JsonAdapterAnnotationTypeAdapterFactory.java:44) */
        jsonAdapterAnnotationTypeAdapterFactory.create(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonAdapterAnnotationTypeAdapterFactory}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory#create(com.google.gson.Gson,com.google.gson.reflect.TypeToken)}
 * @utbot.invokes {@link com.google.gson.reflect.TypeToken#getRawType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JsonAdapter annotation = targetType.getRawType().getAnnotation(JsonAdapter.class);
 *  */
    @Test
    public void testCreate_ThrowNullPointerException_1() throws Exception  {
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(null);
        TypeToken typeToken = ((TypeToken) createInstance("com.google.gson.reflect.TypeToken"));
        
        /* This test fails because method [com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.create] produces [java.lang.NullPointerException]
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.create(JsonAdapterAnnotationTypeAdapterFactory.java:45) */
        jsonAdapterAnnotationTypeAdapterFactory.create(null, typeToken);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.getTypeAdapter
    
    ///region Errors report for getTypeAdapter
    
    public void testGetTypeAdapter_errors()
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

