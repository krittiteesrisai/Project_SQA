package org.mockito.internal.util;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public final class org_mockito_internal_util_PrimitivesTest {
    ///region Test suites for executable org.mockito.internal.util.Primitives.isPrimitiveWrapper
    
    ///region Errors report for isPrimitiveWrapper
    
    public void testIsPrimitiveWrapper_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.Primitives.primitiveValueOrNullFor
    
    ///region Errors report for primitiveValueOrNullFor
    
    public void testPrimitiveValueOrNullFor_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.Primitives.primitiveTypeOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method primitiveTypeOf(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link Primitives}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.Primitives#primitiveTypeOf(java.lang.Class)}
 * @utbot.executesCondition {@code (clazz.isPrimitive()): True}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.returnsFrom {@code return clazz;}
 *  */
    @Test
    public void testPrimitiveTypeOf_ClazzIsPrimitive() {
        Class class1 = Object.class;
        
        Class actual = Primitives.primitiveTypeOf(class1);
        
        assertNull(actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method primitiveTypeOf(java.lang.Class)
    
    /**
    @utbot.classUnderTest {@link Primitives}
 * @utbot.methodUnderTest {@link org.mockito.internal.util.Primitives#primitiveTypeOf(java.lang.Class)}
 * @utbot.invokes {@link java.lang.Class#isPrimitive()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: clazz.isPrimitive()
 *  */
    @Test
    public void testPrimitiveTypeOf_ThrowNullPointerException() {
        /* This test fails because method [org.mockito.internal.util.Primitives.primitiveTypeOf] produces [java.lang.NullPointerException]
            org.mockito.internal.util.Primitives.primitiveTypeOf(Primitives.java:29) */
        Primitives.primitiveTypeOf(null);
    }
    ///endregion
    
    ///region Errors report for primitiveTypeOf
    
    public void testPrimitiveTypeOf_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.mockito.internal.util.Primitives.primitiveWrapperOf
    
    ///region Errors report for primitiveWrapperOf
    
    public void testPrimitiveWrapperOf_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
}

