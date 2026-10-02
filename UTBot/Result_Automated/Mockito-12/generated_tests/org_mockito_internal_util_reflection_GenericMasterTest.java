package org.mockito.internal.util.reflection;

import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class org_mockito_internal_util_reflection_GenericMasterTest {
    ///region Test suites for executable org.mockito.internal.util.reflection.GenericMaster.getGenericType
    
    ///region Errors report for getGenericType
    
    public void testGetGenericType_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 5 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.visitor.Reifier.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.visitor" to unnamed module @376b4233 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.parser.SignatureParser.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.parser" to unnamed module @376b4233 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.reflect.generics.factory.CoreReflectionFactory.$assertionsDisabled accessible: module
        java.base does not "opens sun.reflect.generics.factory" to unnamed module @376b4233 */
        
        // 1 occurrences of:
        // Field type is not declared in class java.lang.reflect.Field
        
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

