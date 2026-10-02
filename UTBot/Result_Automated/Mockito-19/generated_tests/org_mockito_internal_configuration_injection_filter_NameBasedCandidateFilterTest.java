package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class org_mockito_internal_configuration_injection_filter_NameBasedCandidateFilterTest {
    ///region Test suites for executable org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter.filterCandidate
    
    ///region Errors report for filterCandidate
    
    public void testFilterCandidate_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 13 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Field name is not declared in class java.lang.reflect.Field
        
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

