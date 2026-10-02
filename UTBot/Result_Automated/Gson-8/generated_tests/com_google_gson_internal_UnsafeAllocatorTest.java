package com.google.gson.internal;

import org.junit.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

public final class com_google_gson_internal_UnsafeAllocatorTest {
    ///region Test suites for executable com.google.gson.internal.UnsafeAllocator.create
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method create()
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.UnsafeAllocator}
     * @utbot.methodUnderTest {@link com.google.gson.internal.UnsafeAllocator#create()}
     */
    @Test
    public void testCreate() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.UnsafeAllocator}
     * @utbot.methodUnderTest {@link com.google.gson.internal.UnsafeAllocator#create()}
     */
    @Test
    public void testCreate1() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.UnsafeAllocator}
     * @utbot.methodUnderTest {@link com.google.gson.internal.UnsafeAllocator#create()}
     */
    @Test
    public void testCreate2() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.UnsafeAllocator}
     * @utbot.methodUnderTest {@link com.google.gson.internal.UnsafeAllocator#create()}
     */
    @Test
    public void testCreate3() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.UnsafeAllocator}
     * @utbot.methodUnderTest {@link com.google.gson.internal.UnsafeAllocator#create()}
     */
    @Test
    public void testCreate4() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.UnsafeAllocator}
     * @utbot.methodUnderTest {@link com.google.gson.internal.UnsafeAllocator#create()}
     */
    @Test
    public void testCreate5() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.UnsafeAllocator}
     * @utbot.methodUnderTest {@link com.google.gson.internal.UnsafeAllocator#create()}
     */
    @Test
    public void testCreate6() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.UnsafeAllocator}
     * @utbot.methodUnderTest {@link com.google.gson.internal.UnsafeAllocator#create()}
     */
    @Test
    public void testCreate7() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.UnsafeAllocator}
     * @utbot.methodUnderTest {@link com.google.gson.internal.UnsafeAllocator#create()}
     */
    @Test
    public void testCreate8() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.UnsafeAllocator}
     * @utbot.methodUnderTest {@link com.google.gson.internal.UnsafeAllocator#create()}
     */
    @Test
    public void testCreate9() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method create()
    
    @Test
    public void testCreate10() throws Exception  {
        UnsafeAllocator actual = UnsafeAllocator.create();
        
        UnsafeAllocator expected = ((UnsafeAllocator) createInstance("com.google.gson.internal.UnsafeAllocator$4"));
        
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

