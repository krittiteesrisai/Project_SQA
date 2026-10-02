package com.google.gson.internal.bind;

import org.junit.Test;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

public final class com_google_gson_internal_bind_TypeAdaptersTest {
    ///region Test suites for executable com.google.gson.internal.bind.TypeAdapters.newFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newFactory(java.lang.Class, java.lang.Class, com.google.gson.TypeAdapter)
    
    /**
    @utbot.classUnderTest {@link TypeAdapters}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(java.lang.Class,java.lang.Class,com.google.gson.TypeAdapter)}
 *  */
    @Test
    public void testNewFactory() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(null, null, null);
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$31"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.TypeAdapters.newFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newFactory(com.google.gson.reflect.TypeToken, com.google.gson.TypeAdapter)
    
    /**
    @utbot.classUnderTest {@link TypeAdapters}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
 * @utbot.returnsFrom {@code return new TypeAdapterFactory() {
 * 
 *     @SuppressWarnings("unchecked")
 *     public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
 *         return typeToken.equals(type) ? (TypeAdapter<T>) typeAdapter : null;
 *     }
 * };}
 *  */
    @Test
    public void testNewFactory_Return() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method newFactory(com.google.gson.reflect.TypeToken, com.google.gson.TypeAdapter)
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.TypeAdapters}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
     */
    @Test
    public void testNewFactory1() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.TypeAdapters}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
     */
    @Test
    public void testNewFactory2() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.TypeAdapters}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
     */
    @Test
    public void testNewFactory3() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.TypeAdapters}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
     */
    @Test
    public void testNewFactory4() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.TypeAdapters}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
     */
    @Test
    public void testNewFactory5() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.TypeAdapters}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
     */
    @Test
    public void testNewFactory6() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.TypeAdapters}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
     */
    @Test
    public void testNewFactory7() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.TypeAdapters}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
     */
    @Test
    public void testNewFactory8() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.TypeAdapters}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
     */
    @Test
    public void testNewFactory9() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.gson.internal.bind.TypeAdapters}
     * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(com.google.gson.reflect.TypeToken,com.google.gson.TypeAdapter)}
     */
    @Test
    public void testNewFactory10() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((TypeToken) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$29"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.TypeAdapters.newFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newFactory(java.lang.Class, com.google.gson.TypeAdapter)
    
    /**
    @utbot.classUnderTest {@link TypeAdapters}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactory(java.lang.Class,com.google.gson.TypeAdapter)}
 *  */
    @Test
    public void testNewFactory11() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newFactory(((Class) null), ((TypeAdapter) null));
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$30"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newTypeHierarchyFactory(java.lang.Class, com.google.gson.TypeAdapter)
    
    /**
    @utbot.classUnderTest {@link TypeAdapters}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newTypeHierarchyFactory(java.lang.Class,com.google.gson.TypeAdapter)}
 * @utbot.returnsFrom {@code return new TypeAdapterFactory() {
 * 
 *     @SuppressWarnings("unchecked")
 *     public <T2> TypeAdapter<T2> create(Gson gson, TypeToken<T2> typeToken) {
 *         final Class<? super T2> requestedType = typeToken.getRawType();
 *         if (!clazz.isAssignableFrom(requestedType)) {
 *             return null;
 *         }
 *         return (TypeAdapter<T2>) typeAdapter;
 *     }
 * 
 *     @Override
 *     public String toString() {
 *         return "Factory[typeHierarchy=" + clazz.getName() + ",adapter=" + typeAdapter + "]";
 *     }
 * };}
 *  */
    @Test
    public void testNewTypeHierarchyFactory_Return() throws Exception  {
        TypeAdapterFactory actual = TypeAdapters.newTypeHierarchyFactory(null, null);
        
        TypeAdapterFactory expected = ((TypeAdapterFactory) createInstance("com.google.gson.internal.bind.TypeAdapters$33"));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.gson.internal.bind.TypeAdapters.newFactoryForMultipleTypes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newFactoryForMultipleTypes(java.lang.Class, java.lang.Class, com.google.gson.TypeAdapter)
    
    /**
    @utbot.classUnderTest {@link TypeAdapters}
 * @utbot.methodUnderTest {@link com.google.gson.internal.bind.TypeAdapters#newFactoryForMultipleTypes(java.lang.Class,java.lang.Class,com.google.gson.TypeAdapter)}
 * @utbot.returnsFrom {@code return new TypeAdapterFactory() {
 * 
 *     @SuppressWarnings("unchecked")
 *     public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
 *         Class<? super T> rawType = typeToken.getRawType();
 *         return (rawType == base || rawType == sub) ? (TypeAdapter<T>) typeAdapter : null;
 *     }
 * 
 *     @Override
 *     public String toString() {
 *         return "Factory[type=" + base.getName() + "+" + sub.getName() + ",adapter=" + typeAdapter + "]";
 *     }
 * };}
 *  */
    @Test
    public void testNewFactoryForMultipleTypes_Return() throws Exception  {
        Object actual = TypeAdapters.newFactoryForMultipleTypes(null, null, null);
        
        Object expected = createInstance("com.google.gson.internal.bind.TypeAdapters$32");
        
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

