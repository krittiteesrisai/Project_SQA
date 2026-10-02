package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class org_mockito_internal_configuration_injection_filter_TypeBasedCandidateFilterTest {
    ///region Test suites for executable org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter.filterCandidate
    
    ///region Errors report for filterCandidate
    
    public void testFilterCandidate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 21 occurrences of:
        // Default concrete execution failed
        
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

