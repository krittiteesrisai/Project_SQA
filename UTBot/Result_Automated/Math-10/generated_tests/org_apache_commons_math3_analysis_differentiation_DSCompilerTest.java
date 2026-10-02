package org.apache.commons.math3.analysis.differentiation;

import org.junit.Test;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static java.lang.reflect.Array.get;

public final class org_apache_commons_math3_analysis_differentiation_DSCompilerTest {
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCompiler(int, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
 * @utbot.executesCondition {@code (cache != null): True}
 * @utbot.executesCondition {@code (cache.length > parameters): True}
 * @utbot.executesCondition {@code (cache[parameters].length > order): True}
 * @utbot.executesCondition {@code (cache[parameters][order] != null): True}
 * @utbot.invokes {@link java.util.concurrent.atomic.AtomicReference#get()}
 * @utbot.returnsFrom {@code return cache[parameters][order];}
 *  */
    @Test
    public void testGetCompiler_OrderOfCacheparametersNotEqualsNull() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[12];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            dSCompilerArray1[0] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            
            DSCompiler actual = DSCompiler.getCompiler(1, 0);
            
            int dSCompilerParameters = ((Integer) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters"));
            int actualParameters = ((Integer) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters"));
            assertEquals(dSCompilerParameters, actualParameters);
            
            int dSCompilerOrder = dSCompiler.getOrder();
            int actualOrder = actual.getOrder();
            assertEquals(dSCompilerOrder, actualOrder);
            
            int[][] actualSizes = ((int[][]) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
            assertNull(actualSizes);
            
            int[][] actualDerivativesIndirection = ((int[][]) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection"));
            assertNull(actualDerivativesIndirection);
            
            int[] actualLowerIndirection = ((int[]) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection"));
            assertNull(actualLowerIndirection);
            
            int[][][] actualMultIndirection = ((int[][][]) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection"));
            assertNull(actualMultIndirection);
            
            int[][][] actualCompIndirection = ((int[][][]) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection"));
            assertNull(actualCompIndirection);
            
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCompiler(int, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final DSCompiler[][] cache = compilers.get();
 *  */
    @Test
    public void testGetCompiler_ThrowClassCastException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            int[] intArray = {};
            AtomicReference compilers = new AtomicReference(intArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            
            /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler] produces [java.lang.ClassCastException: class [I cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([I is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3067726d)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188) */
            DSCompiler.getCompiler(-255, 1);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
 * @utbot.executesCondition {@code (cache != null): True}
 * @utbot.executesCondition {@code (cache.length > parameters): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: cache != null && cache.length > parameters && cache[parameters].length > order
 *  */
    @Test
    public void testGetCompiler_ThrowArrayIndexOutOfBoundsException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            
            /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:189) */
            DSCompiler.getCompiler(-1, -255);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
 * @utbot.executesCondition {@code (cache != null): True}
 * @utbot.executesCondition {@code (cache.length > parameters): True}
 * @utbot.executesCondition {@code (cache[parameters].length > order): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: cache[parameters][order] != null
 *  */
    @Test
    public void testGetCompiler_ThrowArrayIndexOutOfBoundsException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            
            /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:190) */
            DSCompiler.getCompiler(1, -1);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
 * @utbot.executesCondition {@code (cache != null): True}
 * @utbot.executesCondition {@code (cache.length > parameters): True}
 * @utbot.executesCondition {@code (cache[parameters].length > order): False}
 * @utbot.executesCondition {@code (cache == null): False}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final DSCompiler[][] newCache = new DSCompiler[maxParameters + 1][maxOrder + 1];
 *  */
    @Test
    public void testGetCompiler_ThrowNegativeArraySizeException() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[1][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {null, null, null, null, null, null, null, null, null, null};
            dSCompilerArray[0] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            
            /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:199) */
            DSCompiler.getCompiler(0, Integer.MAX_VALUE);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
 * @utbot.executesCondition {@code (cache != null): True}
 * @utbot.executesCondition {@code (cache.length > parameters): False}
 * @utbot.executesCondition {@code (cache == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cache[0].length
 *  */
    @Test
    public void testGetCompiler_ThrowArrayIndexOutOfBoundsException_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            
            /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198) */
            DSCompiler.getCompiler(0, 1);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
 * @utbot.executesCondition {@code (cache != null): True}
 * @utbot.executesCondition {@code (cache.length > parameters): False}
 * @utbot.executesCondition {@code (cache == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cache[0].length
 *  */
    @Test
    public void testGetCompiler_ThrowArrayIndexOutOfBoundsException_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            
            /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198) */
            DSCompiler.getCompiler(1, 2);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
 * @utbot.executesCondition {@code (cache != null): False}
 * @utbot.executesCondition {@code (cache == null): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final DSCompiler[][] newCache = new DSCompiler[maxParameters + 1][maxOrder + 1];
 *  */
    @Test
    public void testGetCompiler_ThrowNegativeArraySizeException_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            AtomicReference compilers = new AtomicReference(null);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            
            /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:199) */
            DSCompiler.getCompiler(0, Integer.MAX_VALUE);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
 * @utbot.executesCondition {@code (cache != null): False}
 * @utbot.executesCondition {@code (cache == null): True}
 * @utbot.executesCondition {@code (cache != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return newCache[parameters][order];
 *  */
    @Test
    public void testGetCompiler_ThrowArrayIndexOutOfBoundsException_4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            AtomicReference compilers = new AtomicReference(null);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            
            /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:223) */
            DSCompiler.getCompiler(-1, 0);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
 * @utbot.executesCondition {@code (cache != null): False}
 * @utbot.executesCondition {@code (cache == null): True}
 * @utbot.executesCondition {@code (cache != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return newCache[parameters][order];
 *  */
    @Test
    public void testGetCompiler_ThrowArrayIndexOutOfBoundsException_5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            AtomicReference compilers = new AtomicReference(null);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            
            /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:223) */
            DSCompiler.getCompiler(0, -256);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getCompiler(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getCompiler(int,int)}
     */
    @Test
    public void testGetCompilerWithCornerCase() throws Exception  {
        DSCompiler actual = DSCompiler.getCompiler(0, 2);
        
        DSCompiler expected = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        AtomicReference compilers = ((AtomicReference) createInstance("java.util.concurrent.atomic.AtomicReference"));
        setField(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compilers", compilers);
        setField(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 2);
        int[][] sizes = new int[1][];
        int[] intArray = {1, 1, 1};
        sizes[0] = intArray;
        setField(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][] derivativesIndirection = new int[1][];
        int[] intArray1 = {};
        derivativesIndirection[0] = intArray1;
        setField(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        int[] lowerIndirection = {0};
        setField(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection);
        int[][][] multIndirection = new int[1][][];
        int[][] intArray2 = new int[1][];
        int[] intArray3 = {1, 0, 0};
        intArray2[0] = intArray3;
        multIndirection[0] = intArray2;
        setField(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        int[][][] compIndirection = new int[1][][];
        int[][] intArray4 = new int[1][];
        int[] intArray5 = {1, 0};
        intArray4[0] = intArray5;
        compIndirection[0] = intArray4;
        setField(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        
        int expectedParameters = ((Integer) getFieldValue(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters"));
        int actualParameters = ((Integer) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters"));
        assertEquals(expectedParameters, actualParameters);
        
        int expectedOrder = expected.getOrder();
        int actualOrder = actual.getOrder();
        assertEquals(expectedOrder, actualOrder);
        
        int[][] expectedSizes = ((int[][]) getFieldValue(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[][] actualSizes = ((int[][]) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int expectedSizesSize = expectedSizes.length;
        assertEquals(expectedSizesSize, actualSizes.length);
        assertArrayEquals(expectedSizes, actualSizes);
        
        int[][] expectedDerivativesIndirection = ((int[][]) getFieldValue(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection"));
        int[][] actualDerivativesIndirection = ((int[][]) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection"));
        int expectedDerivativesIndirectionSize = expectedDerivativesIndirection.length;
        assertEquals(expectedDerivativesIndirectionSize, actualDerivativesIndirection.length);
        assertArrayEquals(expectedDerivativesIndirection, actualDerivativesIndirection);
        
        int[] expectedLowerIndirection = ((int[]) getFieldValue(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection"));
        int[] actualLowerIndirection = ((int[]) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection"));
        int expectedLowerIndirectionSize = expectedLowerIndirection.length;
        assertEquals(expectedLowerIndirectionSize, actualLowerIndirection.length);
        org.junit.Assert.assertArrayEquals(expectedLowerIndirection, actualLowerIndirection);
        
        int[][][] expectedMultIndirection = ((int[][][]) getFieldValue(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection"));
        int[][][] actualMultIndirection = ((int[][][]) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection"));
        int expectedMultIndirectionSize = expectedMultIndirection.length;
        assertEquals(expectedMultIndirectionSize, actualMultIndirection.length);
        assertArrayEquals(expectedMultIndirection, actualMultIndirection);
        
        int[][][] expectedCompIndirection = ((int[][][]) getFieldValue(expected, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection"));
        int[][][] actualCompIndirection = ((int[][][]) getFieldValue(actual, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection"));
        int expectedCompIndirectionSize = expectedCompIndirection.length;
        assertEquals(expectedCompIndirectionSize, actualCompIndirection.length);
        assertArrayEquals(expectedCompIndirection, actualCompIndirection);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add([D, int, [D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} twice
 *  */
    @Test
    public void testAdd_IterateForLoop_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {1};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        dSCompiler.add(doubleArray, 1, doubleArray, 1, doubleArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 *  */
    @Test
    public void testAdd_IterateForLoop() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {3, 0};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        dSCompiler.add(null, -255, null, -255, null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add([D, int, [D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[resultOffset + i] = lhs[lhsOffset + i] + rhs[rhsOffset + i];
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {0, 1};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0, 0.0};
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.add(DSCompiler.java:738) */
        dSCompiler.add(doubleArray, 1, doubleArray1, 1, doubleArray2, -256);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[resultOffset + i] = lhs[lhsOffset + i] + rhs[rhsOffset + i];
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {3, 1};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.add(DSCompiler.java:738) */
        dSCompiler.add(doubleArray, 1, doubleArray, 129, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[resultOffset + i] = lhs[lhsOffset + i] + rhs[rhsOffset + i];
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {3, 1};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.add(DSCompiler.java:738) */
        dSCompiler.add(doubleArray, -256, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = 0; i < getSize(); ++i)
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -256);
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.add(DSCompiler.java:737) */
        dSCompiler.add(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = 0; i < getSize(); ++i)
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 129);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {0, 0};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.add(DSCompiler.java:737) */
        dSCompiler.add(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[resultOffset + i] = lhs[lhsOffset + i] + rhs[rhsOffset + i];
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.add(DSCompiler.java:738) */
        dSCompiler.add(doubleArray, 1, doubleArray, 1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[resultOffset + i] = lhs[lhsOffset + i] + rhs[rhsOffset + i];
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {3, 1};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.add(DSCompiler.java:738) */
        dSCompiler.add(doubleArray, 1, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[resultOffset + i] = lhs[lhsOffset + i] + rhs[rhsOffset + i];
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {3, 1};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.add(DSCompiler.java:738) */
        dSCompiler.add(null, -255, null, -255, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.sin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sin([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#sin(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 *  */
    @Test
    public void testSin_OrderLessOrEqualZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {0.0, java.lang.Double.POSITIVE_INFINITY};
        
        dSCompiler.sin(doubleArray, 1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#sin(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): True}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#cos(double)}
 *  */
    @Test
    public void testSin_OrderGreaterThanZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {0.0, java.lang.Double.NaN};
        
        dSCompiler.sin(doubleArray, 1, null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sin([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#sin(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.sin(operand[operandOffset]);
 *  */
    @Test
    public void testSin_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.sin] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.sin(DSCompiler.java:1133) */
        dSCompiler.sin(doubleArray, -256, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#sin(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.sin(operand[operandOffset]);
 *  */
    @Test
    public void testSin_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0, java.lang.Double.POSITIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.sin] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.sin(DSCompiler.java:1133) */
        dSCompiler.sin(doubleArray, 1, null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#sin(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compose(double[],int,double[],double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: compose(operand, operandOffset, function, result, resultOffset);
 *  */
    @Test
    public void testSin_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = new int[1][][];
        int[][] intArray = {};
        compIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {0.0, java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.sin] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1723)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.sin(DSCompiler.java:1142) */
        dSCompiler.sin(doubleArray, 1, doubleArray, 129);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#sin(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.sin(operand[operandOffset]);
 *  */
    @Test
    public void testSin_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.sin] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.sin(DSCompiler.java:1133) */
        dSCompiler.sin(doubleArray, 1, null, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#sin(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.sin(operand[operandOffset]);
 *  */
    @Test
    public void testSin_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.sin] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.sin(DSCompiler.java:1133) */
        dSCompiler.sin(doubleArray, 1, null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#sin(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testSin_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.sin] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.sin(DSCompiler.java:1132) */
        dSCompiler.sin(null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#sin(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: function[0] = FastMath.sin(operand[operandOffset]);
 *  */
    @Test
    public void testSin_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.sin] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.sin(DSCompiler.java:1133) */
        dSCompiler.sin(null, -255, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.cos
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cos([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#cos(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#cos(double)}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compose(double[],int,double[],double[],int)}
 *  */
    @Test
    public void testCos_OrderLessOrEqualZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {0.0, java.lang.Double.NaN};
        
        dSCompiler.cos(doubleArray, 1, null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cos([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#cos(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.cos(operand[operandOffset]);
 *  */
    @Test
    public void testCos_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.cos] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.cos(DSCompiler.java:1107) */
        dSCompiler.cos(doubleArray, -256, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#cos(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.cos(operand[operandOffset]);
 *  */
    @Test
    public void testCos_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0, java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.cos] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.cos(DSCompiler.java:1107) */
        dSCompiler.cos(doubleArray, 1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#cos(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compose(double[],int,double[],double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: compose(operand, operandOffset, function, result, resultOffset);
 *  */
    @Test
    public void testCos_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = new int[1][][];
        int[][] intArray = {};
        compIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.cos] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1723)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.cos(DSCompiler.java:1116) */
        dSCompiler.cos(doubleArray, 0, doubleArray, -256);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#cos(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.cos(operand[operandOffset]);
 *  */
    @Test
    public void testCos_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.cos] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.cos(DSCompiler.java:1107) */
        dSCompiler.cos(doubleArray, 1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#cos(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testCos_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.cos] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.cos(DSCompiler.java:1106) */
        dSCompiler.cos(null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#cos(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: function[0] = FastMath.cos(operand[operandOffset]);
 *  */
    @Test
    public void testCos_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.cos] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.cos(DSCompiler.java:1107) */
        dSCompiler.cos(null, -255, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.tan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tan([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#tan(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#tan(double)}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compose(double[],int,double[],double[],int)}
 *  */
    @Test
    public void testTan_OrderLessOrEqualZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY};
        
        dSCompiler.tan(doubleArray, 1, null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tan([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#tan(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double t = FastMath.tan(operand[operandOffset]);
 *  */
    @Test
    public void testTan_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.tan] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(DSCompiler.java:1159) */
        dSCompiler.tan(doubleArray, -256, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#tan(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = t;
 *  */
    @Test
    public void testTan_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0, java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.tan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(DSCompiler.java:1160) */
        dSCompiler.tan(doubleArray, 1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#tan(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: compose(operand, operandOffset, function, result, resultOffset);
 *  */
    @Test
    public void testTan_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = new int[1][][];
        int[][] intArray = {};
        compIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {0.0, java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.tan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1723)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(DSCompiler.java:1197) */
        dSCompiler.tan(doubleArray, 1, doubleArray, 129);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#tan(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = t;
 *  */
    @Test
    public void testTan_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.tan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(DSCompiler.java:1160) */
        dSCompiler.tan(doubleArray, 1, null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#tan(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[] function = new double[1 + order];
 *  */
    @Test
    public void testTan_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.tan] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(DSCompiler.java:1158) */
        dSCompiler.tan(null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#tan(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: compose(operand, operandOffset, function, result, resultOffset);
 *  */
    @Test
    public void testTan_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {-2147483646, Integer.MIN_VALUE};
        intArray[0] = intArray1;
        compIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.tan] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1717)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(DSCompiler.java:1197) */
        dSCompiler.tan(doubleArray, 0, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#tan(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: compose(operand, operandOffset, function, result, resultOffset);
 *  */
    @Test
    public void testTan_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {};
        intArray[0] = intArray1;
        compIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.tan] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1717)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(DSCompiler.java:1197) */
        dSCompiler.tan(doubleArray, 0, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#tan(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double t = FastMath.tan(operand[operandOffset]);
 *  */
    @Test
    public void testTan_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.tan] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.tan(DSCompiler.java:1159) */
        dSCompiler.tan(null, -255, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method atan2([D, int, [D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atan2(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: multiply(y, yOffset, y, yOffset, tmp2, 0);
 *  */
    @Test
    public void testAtan2_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {3, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][][] multIndirection = new int[1][][];
        int[][] intArray1 = new int[1][];
        int[] intArray2 = new int[11];
        intArray2[1] = 1;
        intArray2[2] = 1;
        intArray1[0] = intArray2;
        multIndirection[0] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        double[] doubleArray = {};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2] produces [java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.multiply(DSCompiler.java:775)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(DSCompiler.java:1390) */
        dSCompiler.atan2(doubleArray, 2, doubleArray1, -1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atan2(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[] tmp1 = new double[getSize()];
 *  */
    @Test
    public void testAtan2_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -256);
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(DSCompiler.java:1387) */
        dSCompiler.atan2(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atan2(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] tmp1 = new double[getSize()];
 *  */
    @Test
    public void testAtan2_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {3, Integer.MIN_VALUE};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(DSCompiler.java:1387) */
        dSCompiler.atan2(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atan2(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[] tmp1 = new double[getSize()];
 *  */
    @Test
    public void testAtan2_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -256);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {0};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(DSCompiler.java:1387) */
        dSCompiler.atan2(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atan2(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: multiply(x, xOffset, x, xOffset, tmp1, 0);
 *  */
    @Test
    public void testAtan2_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {3, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][][] multIndirection = new int[1][][];
        int[][] intArray1 = new int[1][];
        int[] intArray2 = new int[11];
        intArray2[0] = 3;
        intArray2[1] = 223;
        intArray2[3] = 3;
        intArray2[4] = 3;
        intArray2[5] = 3;
        intArray2[6] = 3;
        intArray2[7] = 3;
        intArray2[8] = 3;
        intArray2[9] = 3;
        intArray2[10] = 3;
        intArray1[0] = intArray2;
        multIndirection[0] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2] produces [java.lang.ArrayIndexOutOfBoundsException: Index -223 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.multiply(DSCompiler.java:775)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(DSCompiler.java:1388) */
        dSCompiler.atan2(null, -255, doubleArray, -223, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atan2(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: multiply(x, xOffset, x, xOffset, tmp1, 0);
 *  */
    @Test
    public void testAtan2_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {3, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][][] multIndirection = new int[1][][];
        int[][] intArray1 = new int[1][];
        intArray1[0] = intArray;
        multIndirection[0] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.multiply(DSCompiler.java:775)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(DSCompiler.java:1388) */
        dSCompiler.atan2(null, -255, doubleArray, -1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atan2(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: multiply(x, xOffset, x, xOffset, tmp1, 0);
 *  */
    @Test
    public void testAtan2_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {3, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][][] multIndirection = new int[1][][];
        int[][] intArray1 = new int[1][];
        int[] intArray2 = {};
        intArray1[0] = intArray2;
        multIndirection[0] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.multiply(DSCompiler.java:775)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(DSCompiler.java:1388) */
        dSCompiler.atan2(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atan2(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: multiply(x, xOffset, x, xOffset, tmp1, 0);
 *  */
    @Test
    public void testAtan2_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {3, 0};
        sizes[0] = intArray;
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][][] multIndirection = new int[1][][];
        int[][] intArray1 = {};
        multIndirection[0] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.multiply(DSCompiler.java:779)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(DSCompiler.java:1388) */
        dSCompiler.atan2(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atan2(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: multiply(x, xOffset, x, xOffset, tmp1, 0);
 *  */
    @Test
    public void testAtan2_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {3, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][][] multIndirection = new int[1][][];
        int[][] intArray1 = new int[1][];
        int[] intArray2 = {0};
        intArray1[0] = intArray2;
        multIndirection[0] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.multiply(DSCompiler.java:775)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(DSCompiler.java:1388) */
        dSCompiler.atan2(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atan2(double[],int,double[],int,double[],int)}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#add(double[],int,double[],int,double[],int)}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#rootN(double[],int,int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: rootN(tmp2, 0, 2, tmp1, 0);
 *  */
    @Test
    public void testAtan2_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {3, 0};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(DSCompiler.java:950)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atan2(DSCompiler.java:1392) */
        dSCompiler.atan2(null, -255, null, -255, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.log
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method log([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#log(double)}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compose(double[],int,double[],double[],int)}
 *  */
    @Test
    public void testLog_OrderLessOrEqualZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {0.0, -0.0};
        
        dSCompiler.log(doubleArray, 1, null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method log([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.log(operand[operandOffset]);
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log(DSCompiler.java:1025) */
        dSCompiler.log(doubleArray, -256, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.log(operand[operandOffset]);
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log(DSCompiler.java:1025) */
        dSCompiler.log(doubleArray, 1, null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: compose(operand, operandOffset, function, result, resultOffset);
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = new int[1][][];
        int[][] intArray = {};
        compIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {0.0, -0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1723)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log(DSCompiler.java:1036) */
        dSCompiler.log(doubleArray, 1, doubleArray, 129);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.log(operand[operandOffset]);
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0, 2.0000000000000004};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log(DSCompiler.java:1025) */
        dSCompiler.log(doubleArray, 1, null, 0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testLog_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log(DSCompiler.java:1024) */
        dSCompiler.log(null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: compose(operand, operandOffset, function, result, resultOffset);
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {};
        intArray[0] = intArray1;
        compIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {-0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1717)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log(DSCompiler.java:1036) */
        dSCompiler.log(doubleArray, 0, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: compose(operand, operandOffset, function, result, resultOffset);
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {-2147483646, 1073741824};
        intArray[0] = intArray1;
        compIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {-0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1717)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log(DSCompiler.java:1036) */
        dSCompiler.log(doubleArray, 0, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: compose(operand, operandOffset, function, result, resultOffset);
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {-2147483646, 0, 1073741824};
        intArray[0] = intArray1;
        compIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {0.0, -0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741825 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1719)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log(DSCompiler.java:1036) */
        dSCompiler.log(doubleArray, 1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: function[0] = FastMath.log(operand[operandOffset]);
 *  */
    @Test
    public void testLog_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log(DSCompiler.java:1025) */
        dSCompiler.log(null, -255, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.log10
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method log10([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log10(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.log10(operand[operandOffset]);
 *  */
    @Test
    public void testLog10_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log10] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log10(DSCompiler.java:1079) */
        dSCompiler.log10(doubleArray, -256, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log10(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testLog10_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log10] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log10(DSCompiler.java:1078) */
        dSCompiler.log10(null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log10(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: function[0] = FastMath.log10(operand[operandOffset]);
 *  */
    @Test
    public void testLog10_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.log10] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log10(DSCompiler.java:1079) */
        dSCompiler.log10(null, -255, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.pow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pow([D, int, double, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,double,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double xk = FastMath.pow(operand[operandOffset], p - order);
 *  */
    @Test
    public void testPow_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:843) */
        dSCompiler.pow(doubleArray, -256, java.lang.Double.NaN, ((double[]) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,double,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testPow_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:842) */
        dSCompiler.pow(((double[]) null), -255, java.lang.Double.NaN, ((double[]) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,double,double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double xk = FastMath.pow(operand[operandOffset], p - order);
 *  */
    @Test
    public void testPow_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:843) */
        dSCompiler.pow(((double[]) null), -255, java.lang.Double.NaN, ((double[]) null), -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.pow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pow([D, int, [D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,double[],int,double[],int)}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#log(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: log(x, xOffset, logX, 0);
 *  */
    @Test
    public void testPow_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {-2147483646, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.log(DSCompiler.java:1025)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:927) */
        dSCompiler.pow(doubleArray, 129, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] logX = new double[getSize()];
 *  */
    @Test
    public void testPow_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -256);
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:926) */
        dSCompiler.pow(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[] logX = new double[getSize()];
 *  */
    @Test
    public void testPow_ThrowNegativeArraySizeException1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {3, Integer.MIN_VALUE};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:926) */
        dSCompiler.pow(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] logX = new double[getSize()];
 *  */
    @Test
    public void testPow_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -256);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {0};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:926) */
        dSCompiler.pow(null, -255, null, -255, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.pow
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method pow([D, int, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[resultOffset] = 1.0;
 *  */
    @Test
    public void testPow_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:874) */
        dSCompiler.pow(((double[]) null), -255, 0, doubleArray, 256);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 0): False}
 * @utbot.executesCondition {@code (n > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double inv = 1.0 / operand[operandOffset];
 *  */
    @Test
    public void testPow_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:894) */
        dSCompiler.pow(doubleArray, 129, -256, ((double[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 0): False}
 * @utbot.executesCondition {@code (n > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double xk = FastMath.pow(operand[operandOffset], n - maxOrder);
 *  */
    @Test
    public void testPow_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:886) */
        dSCompiler.pow(doubleArray, 129, 1, ((double[]) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 0): False}
 * @utbot.executesCondition {@code (n > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double xk = FastMath.pow(operand[operandOffset], n - maxOrder);
 *  */
    @Test
    public void testPow_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 27);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:886) */
        dSCompiler.pow(doubleArray, 129, 2, ((double[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 0): False}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testPow_ThrowNegativeArraySizeException2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:881) */
        dSCompiler.pow(((double[]) null), -255, -255, ((double[]) null), -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 0): True}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getSize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Arrays.fill(result, resultOffset + 1, resultOffset + getSize(), 0);
 *  */
    @Test
    public void testPow_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", Integer.MIN_VALUE);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {0};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:875) */
        dSCompiler.pow(((double[]) null), -255, 0, doubleArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[resultOffset] = 1.0;
 *  */
    @Test
    public void testPow_ThrowNullPointerException1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:874) */
        dSCompiler.pow(((double[]) null), -255, 0, ((double[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 0): False}
 * @utbot.executesCondition {@code (n > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double inv = 1.0 / operand[operandOffset];
 *  */
    @Test
    public void testPow_ThrowNullPointerException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:894) */
        dSCompiler.pow(((double[]) null), -255, -256, ((double[]) null), 0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#pow(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 0): False}
 * @utbot.executesCondition {@code (n > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double xk = FastMath.pow(operand[operandOffset], n - maxOrder);
 *  */
    @Test
    public void testPow_ThrowNullPointerException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.pow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.pow(DSCompiler.java:886) */
        dSCompiler.pow(((double[]) null), -255, 1, ((double[]) null), -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.exp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exp([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#exp(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Arrays.fill(function, FastMath.exp(operand[operandOffset]));
 *  */
    @Test
    public void testExp_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.exp] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.exp(DSCompiler.java:984) */
        dSCompiler.exp(doubleArray, -256, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#exp(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testExp_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.exp] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.exp(DSCompiler.java:983) */
        dSCompiler.exp(null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#exp(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Arrays.fill(function, FastMath.exp(operand[operandOffset]));
 *  */
    @Test
    public void testExp_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.exp] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.exp(DSCompiler.java:984) */
        dSCompiler.exp(null, -255, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract([D, int, [D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#subtract(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} twice
 *  */
    @Test
    public void testSubtract_IterateForLoop_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {1};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        dSCompiler.subtract(doubleArray, 1, doubleArray, 1, doubleArray, 1);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#subtract(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 *  */
    @Test
    public void testSubtract_IterateForLoop() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {3, 0};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        dSCompiler.subtract(null, -255, null, -255, null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract([D, int, [D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#subtract(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[resultOffset + i] = lhs[lhsOffset + i] - rhs[rhsOffset + i];
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {0, 1};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0, 0.0};
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(DSCompiler.java:754) */
        dSCompiler.subtract(doubleArray, 1, doubleArray1, 1, doubleArray2, -256);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#subtract(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[resultOffset + i] = lhs[lhsOffset + i] - rhs[rhsOffset + i];
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {3, 1};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(DSCompiler.java:754) */
        dSCompiler.subtract(doubleArray, 1, doubleArray, 129, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#subtract(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[resultOffset + i] = lhs[lhsOffset + i] - rhs[rhsOffset + i];
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {3, 1};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(DSCompiler.java:754) */
        dSCompiler.subtract(doubleArray, -256, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#subtract(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = 0; i < getSize(); ++i)
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -256);
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(DSCompiler.java:753) */
        dSCompiler.subtract(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#subtract(double[],int,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = 0; i < getSize(); ++i)
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 129);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {0, 0};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(DSCompiler.java:753) */
        dSCompiler.subtract(null, -255, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#subtract(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[resultOffset + i] = lhs[lhsOffset + i] - rhs[rhsOffset + i];
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(DSCompiler.java:754) */
        dSCompiler.subtract(doubleArray, 1, doubleArray, 1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#subtract(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[resultOffset + i] = lhs[lhsOffset + i] - rhs[rhsOffset + i];
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {3, 1};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(DSCompiler.java:754) */
        dSCompiler.subtract(doubleArray, 1, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#subtract(double[],int,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[resultOffset + i] = lhs[lhsOffset + i] - rhs[rhsOffset + i];
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {3, 1};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.subtract(DSCompiler.java:754) */
        dSCompiler.subtract(null, -255, null, -255, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compileSizes(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileSizes(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): True}
 * @utbot.invokes {@link java.util.Arrays#fill(int[],int)}
 * @utbot.returnsFrom {@code return sizes;}
 *  */
    @Test
    public void testCompileSizes_ParametersEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileSizesMethod = dSCompilerClazz.getDeclaredMethod("compileSizes", intType, intType, dSCompilerClazz);
        compileSizesMethod.setAccessible(true);
        java.lang.Object[] compileSizesMethodArguments = new java.lang.Object[3];
        compileSizesMethodArguments[0] = 0;
        compileSizesMethodArguments[1] = -1;
        compileSizesMethodArguments[2] = ((Object) null);
        int[][] actual = ((int[][]) compileSizesMethod.invoke(null, compileSizesMethodArguments));
        
        int[][] expected = new int[1][];
        int[] intArray = {};
        expected[0] = intArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileSizes(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.returnsFrom {@code return sizes;}
 *  */
    @Test
    public void testCompileSizes_ParametersNotEqualsZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileSizesMethod = dSCompilerClazz.getDeclaredMethod("compileSizes", intType, intType, dSCompilerClazz);
        compileSizesMethod.setAccessible(true);
        java.lang.Object[] compileSizesMethodArguments = new java.lang.Object[3];
        compileSizesMethodArguments[0] = 1;
        compileSizesMethodArguments[1] = 0;
        compileSizesMethodArguments[2] = dSCompiler;
        int[][] actual = ((int[][]) compileSizesMethod.invoke(null, compileSizesMethodArguments));
        
        int[][] expected = new int[2][];
        expected[0] = ((int[]) null);
        int[] intArray = {1};
        expected[1] = intArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
        
        int[][] dSCompilerSizes = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes0 = ((int[]) get(dSCompilerSizes, 0));
        
        assertNull(finalDSCompilerSizes0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileSizes(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < order; ++i)} once
 * @utbot.returnsFrom {@code return sizes;}
 *  */
    @Test
    public void testCompileSizes_ParametersNotEqualsZero_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] sizes = new int[1][];
        int[] intArray = {0, 0};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileSizesMethod = dSCompilerClazz.getDeclaredMethod("compileSizes", intType, intType, dSCompilerClazz);
        compileSizesMethod.setAccessible(true);
        java.lang.Object[] compileSizesMethodArguments = new java.lang.Object[3];
        compileSizesMethodArguments[0] = 1;
        compileSizesMethodArguments[1] = 1;
        compileSizesMethodArguments[2] = dSCompiler;
        int[][] actual = ((int[][]) compileSizesMethod.invoke(null, compileSizesMethodArguments));
        
        int[][] expected = new int[2][];
        expected[0] = intArray;
        int[] intArray1 = {1, 1};
        expected[1] = intArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compileSizes(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileSizes(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final int[][] sizes = new int[parameters + 1][order + 1];
 *  */
    @Test
    public void testCompileSizes_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(DSCompiler.java:236) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileSizesMethod = dSCompilerClazz.getDeclaredMethod("compileSizes", intType, intType, dSCompilerClazz);
        compileSizesMethod.setAccessible(true);
        java.lang.Object[] compileSizesMethodArguments = new java.lang.Object[3];
        compileSizesMethodArguments[0] = -3;
        compileSizesMethodArguments[1] = -3;
        compileSizesMethodArguments[2] = ((Object) null);
        try {
            compileSizesMethod.invoke(null, compileSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileSizes(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(valueCompiler.sizes, 0, sizes, 0, parameters);
 *  */
    @Test
    public void testCompileSizes_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(DSCompiler.java:240) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileSizesMethod = dSCompilerClazz.getDeclaredMethod("compileSizes", intType, intType, dSCompilerClazz);
        compileSizesMethod.setAccessible(true);
        java.lang.Object[] compileSizesMethodArguments = new java.lang.Object[3];
        compileSizesMethodArguments[0] = -1;
        compileSizesMethodArguments[1] = -1;
        compileSizesMethodArguments[2] = dSCompiler;
        try {
            compileSizesMethod.invoke(null, compileSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileSizes(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sizes[parameters][0] = 1;
 *  */
    @Test
    public void testCompileSizes_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(DSCompiler.java:241) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileSizesMethod = dSCompilerClazz.getDeclaredMethod("compileSizes", intType, intType, dSCompilerClazz);
        compileSizesMethod.setAccessible(true);
        java.lang.Object[] compileSizesMethodArguments = new java.lang.Object[3];
        compileSizesMethodArguments[0] = 1;
        compileSizesMethodArguments[1] = -1;
        compileSizesMethodArguments[2] = dSCompiler;
        try {
            compileSizesMethod.invoke(null, compileSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileSizes(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < order; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sizes[parameters][i + 1] = sizes[parameters][i] + sizes[parameters - 1][i + 1];
 *  */
    @Test
    public void testCompileSizes_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] sizes = new int[1][];
        int[] intArray = {0};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(DSCompiler.java:243) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileSizesMethod = dSCompilerClazz.getDeclaredMethod("compileSizes", intType, intType, dSCompilerClazz);
        compileSizesMethod.setAccessible(true);
        java.lang.Object[] compileSizesMethodArguments = new java.lang.Object[3];
        compileSizesMethodArguments[0] = 1;
        compileSizesMethodArguments[1] = 1;
        compileSizesMethodArguments[2] = dSCompiler;
        try {
            compileSizesMethod.invoke(null, compileSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileSizes(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(valueCompiler.sizes, 0, sizes, 0, parameters);
 *  */
    @Test
    public void testCompileSizes_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(DSCompiler.java:240) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileSizesMethod = dSCompilerClazz.getDeclaredMethod("compileSizes", intType, intType, dSCompilerClazz);
        compileSizesMethod.setAccessible(true);
        java.lang.Object[] compileSizesMethodArguments = new java.lang.Object[3];
        compileSizesMethodArguments[0] = -1;
        compileSizesMethodArguments[1] = -1;
        compileSizesMethodArguments[2] = ((Object) null);
        try {
            compileSizesMethod.invoke(null, compileSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileSizes(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < order; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sizes[parameters][i + 1] = sizes[parameters][i] + sizes[parameters - 1][i + 1];
 *  */
    @Test
    public void testCompileSizes_ThrowNullPointerException_2() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(DSCompiler.java:243) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileSizesMethod = dSCompilerClazz.getDeclaredMethod("compileSizes", intType, intType, dSCompilerClazz);
        compileSizesMethod.setAccessible(true);
        java.lang.Object[] compileSizesMethodArguments = new java.lang.Object[3];
        compileSizesMethodArguments[0] = 1;
        compileSizesMethodArguments[1] = 1;
        compileSizesMethodArguments[2] = dSCompiler;
        try {
            compileSizesMethod.invoke(null, compileSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileSizes(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(valueCompiler.sizes, 0, sizes, 0, parameters);
 *  */
    @Test
    public void testCompileSizes_ThrowNullPointerException_1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(DSCompiler.java:240) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileSizesMethod = dSCompilerClazz.getDeclaredMethod("compileSizes", intType, intType, dSCompilerClazz);
        compileSizesMethod.setAccessible(true);
        java.lang.Object[] compileSizesMethodArguments = new java.lang.Object[3];
        compileSizesMethodArguments[0] = -1;
        compileSizesMethodArguments[1] = -1;
        compileSizesMethodArguments[2] = dSCompiler;
        try {
            compileSizesMethod.invoke(null, compileSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertIndex(int, int, [[I, int, int, [[I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.returnsFrom {@code return getPartialDerivativeIndex(destP, destO, destSizes, orders);}
 *  */
    @Test
    public void testConvertIndex_ReturnGetPartialDerivativeIndex_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[][] intArray = new int[2][];
        intArray[0] = ((int[]) null);
        int[] intArray1 = {1};
        intArray[1] = intArray1;
        int[][] intArray2 = new int[1][];
        int[] intArray3 = {0, 0};
        intArray2[0] = intArray3;
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 1;
        convertIndexMethodArguments[1] = 2;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 1;
        convertIndexMethodArguments[4] = 1;
        convertIndexMethodArguments[5] = ((Object) intArray2);
        int actual = ((Integer) convertIndexMethod.invoke(null, convertIndexMethodArguments));
        
        assertEquals(0, actual);
        
        int[] finalIntArray0 = intArray[0];
        
        assertNull(finalIntArray0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.returnsFrom {@code return getPartialDerivativeIndex(destP, destO, destSizes, orders);}
 *  */
    @Test
    public void testConvertIndex_ReturnGetPartialDerivativeIndex() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[][] intArray = new int[2][];
        intArray[0] = ((int[]) null);
        int[] intArray1 = {0};
        intArray[1] = intArray1;
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 1;
        convertIndexMethodArguments[1] = 2;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 1;
        convertIndexMethodArguments[4] = 0;
        convertIndexMethodArguments[5] = ((Object) null);
        int actual = ((Integer) convertIndexMethod.invoke(null, convertIndexMethodArguments));
        
        assertEquals(0, actual);
        
        int[] finalIntArray0 = intArray[0];
        
        assertNull(finalIntArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method convertIndex(int, int, [[I, int, int, [[I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPartialDerivativeIndex(destP, destO, destSizes, orders);
 *  */
    @Test
    public void testConvertIndex_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        int[][] intArray = new int[2][];
        intArray[0] = ((int[]) null);
        int[] intArray1 = {3, 1};
        intArray[1] = intArray1;
        int[][] intArray2 = {null};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:605) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 1;
        convertIndexMethodArguments[1] = 3;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 2;
        convertIndexMethodArguments[4] = 1;
        convertIndexMethodArguments[5] = ((Object) intArray2);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPartialDerivativeIndex(destP, destO, destSizes, orders);
 *  */
    @Test
    public void testConvertIndex_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        int[][] intArray = new int[2][];
        intArray[0] = ((int[]) null);
        int[] intArray1 = {3, 1};
        intArray[1] = intArray1;
        int[][] intArray2 = new int[2][];
        intArray2[0] = intArray1;
        int[] intArray3 = {0};
        intArray2[1] = intArray3;
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:605) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 1;
        convertIndexMethodArguments[1] = 3;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 2;
        convertIndexMethodArguments[4] = 1;
        convertIndexMethodArguments[5] = ((Object) intArray2);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(srcDerivativesIndirection[index], 0, orders, 0, FastMath.min(srcP, destP));
 *  */
    @Test
    public void testConvertIndex_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[][] intArray = {
            null,
            null
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:604) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 129;
        convertIndexMethodArguments[1] = -255;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 1;
        convertIndexMethodArguments[4] = -255;
        convertIndexMethodArguments[5] = ((Object) null);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(srcDerivativesIndirection[index], 0, orders, 0, FastMath.min(srcP, destP));
 *  */
    @Test
    public void testConvertIndex_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        int[][] intArray = new int[2][];
        intArray[0] = ((int[]) null);
        int[] intArray1 = {};
        intArray[1] = intArray1;
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:604) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 1;
        convertIndexMethodArguments[1] = 2;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 1;
        convertIndexMethodArguments[4] = -255;
        convertIndexMethodArguments[5] = ((Object) null);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(srcDerivativesIndirection[index], 0, orders, 0, FastMath.min(srcP, destP));
 *  */
    @Test
    public void testConvertIndex_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        int[][] intArray = new int[2][];
        intArray[0] = ((int[]) null);
        int[] intArray1 = {0};
        intArray[1] = intArray1;
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -1 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:604) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 1;
        convertIndexMethodArguments[1] = -1;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 2;
        convertIndexMethodArguments[4] = -255;
        convertIndexMethodArguments[5] = ((Object) null);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: int[] orders = new int[destP];
 *  */
    @Test
    public void testConvertIndex_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:603) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = -255;
        convertIndexMethodArguments[1] = -255;
        convertIndexMethodArguments[2] = ((Object) null);
        convertIndexMethodArguments[3] = -256;
        convertIndexMethodArguments[4] = -255;
        convertIndexMethodArguments[5] = ((Object) null);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPartialDerivativeIndex(destP, destO, destSizes, orders);
 *  */
    @Test
    public void testConvertIndex_ThrowNullPointerException_2() throws Throwable  {
        int[][] intArray = new int[2][];
        intArray[0] = ((int[]) null);
        int[] intArray1 = {3, 1};
        intArray[1] = intArray1;
        int[][] intArray2 = new int[2][];
        int[] intArray3 = {};
        intArray2[0] = intArray3;
        intArray2[1] = ((int[]) null);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:605) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 1;
        convertIndexMethodArguments[1] = 3;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 2;
        convertIndexMethodArguments[4] = 1;
        convertIndexMethodArguments[5] = ((Object) intArray2);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPartialDerivativeIndex(destP, destO, destSizes, orders);
 *  */
    @Test
    public void testConvertIndex_ThrowNullPointerException_1() throws Throwable  {
        int[][] intArray = new int[2][];
        intArray[0] = ((int[]) null);
        int[] intArray1 = {3, 1};
        intArray[1] = intArray1;
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:605) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 1;
        convertIndexMethodArguments[1] = 3;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 2;
        convertIndexMethodArguments[4] = 1;
        convertIndexMethodArguments[5] = ((Object) null);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(srcDerivativesIndirection[index], 0, orders, 0, FastMath.min(srcP, destP));
 *  */
    @Test
    public void testConvertIndex_ThrowNullPointerException_3() throws Throwable  {
        int[][] intArray = {
            null,
            null
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:604) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 1;
        convertIndexMethodArguments[1] = 1;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 1;
        convertIndexMethodArguments[4] = -255;
        convertIndexMethodArguments[5] = ((Object) null);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(srcDerivativesIndirection[index], 0, orders, 0, FastMath.min(srcP, destP));
 *  */
    @Test
    public void testConvertIndex_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:604) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = -255;
        convertIndexMethodArguments[1] = -255;
        convertIndexMethodArguments[2] = ((Object) null);
        convertIndexMethodArguments[3] = 1;
        convertIndexMethodArguments[4] = -255;
        convertIndexMethodArguments[5] = ((Object) null);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method convertIndex(int, int, [[I, int, int, [[I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#convertIndex(int,int,int[][],int,int,int[][])}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#min(int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.invokes org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} in: return getPartialDerivativeIndex(destP, destO, destSizes, orders);
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testConvertIndex_ThrowNumberIsTooLargeException() throws Throwable  {
        int[][] intArray = new int[2][];
        intArray[0] = ((int[]) null);
        int[] intArray1 = {3, -2};
        intArray[1] = intArray1;
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 1;
        convertIndexMethodArguments[1] = 3;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = 2;
        convertIndexMethodArguments[4] = -3;
        convertIndexMethodArguments[5] = ((Object) null);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method convertIndex(int, int, [[I, int, int, [[I)
    
    @Test(expected = OutOfMemoryError.class)
    public void testConvertIndexByFuzzer() throws Throwable  {
        int[][] intArray = new int[3][];
        int[] intArray1 = {Integer.MIN_VALUE, Integer.MIN_VALUE, 1};
        intArray[0] = intArray1;
        int[] intArray2 = {1, Integer.MAX_VALUE, 0};
        intArray[1] = intArray2;
        int[] intArray3 = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        intArray[2] = intArray3;
        int[][] intArray4 = new int[2][];
        int[] intArray5 = {Integer.MAX_VALUE, -1};
        intArray4[0] = intArray5;
        int[] intArray6 = {Integer.MAX_VALUE, -1};
        intArray4[1] = intArray6;
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method convertIndexMethod = dSCompilerClazz.getDeclaredMethod("convertIndex", intType, intType, intArrayType, intType, intType, intArrayType);
        convertIndexMethod.setAccessible(true);
        java.lang.Object[] convertIndexMethodArguments = new java.lang.Object[6];
        convertIndexMethodArguments[0] = 0;
        convertIndexMethodArguments[1] = -33554433;
        convertIndexMethodArguments[2] = ((Object) intArray);
        convertIndexMethodArguments[3] = Integer.MAX_VALUE;
        convertIndexMethodArguments[4] = -1;
        convertIndexMethodArguments[5] = ((Object) intArray4);
        try {
            convertIndexMethod.invoke(null, convertIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method linearCombination(double, [D, int, double, [D, int, double, [D, int, double, [D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 *  */
    @Test
    public void testLinearCombination_IterateForLoop() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {-2147483646, 0};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        dSCompiler.linearCombination(java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, null, -255);
        
        int[][] dSCompilerSizes = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes0 = ((int[]) get(dSCompilerSizes, 0));
        
        assertNull(finalDSCompilerSizes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method linearCombination(double, [D, int, double, [D, int, double, [D, int, double, [D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: MathArrays.linearCombination(a1, c1[offset1 + i], a2, c2[offset2 + i], a3, c3[offset3 + i], a4, c4[offset4 + i])
 *  */
    @Test
    public void testLinearCombination_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {-2147483646, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        double[] doubleArray2 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(DSCompiler.java:717) */
        dSCompiler.linearCombination(java.lang.Double.NaN, doubleArray, 1, java.lang.Double.NaN, doubleArray1, 0, java.lang.Double.NaN, doubleArray2, 1, java.lang.Double.NaN, doubleArray2, 129, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: MathArrays.linearCombination(a1, c1[offset1 + i], a2, c2[offset2 + i], a3, c3[offset3 + i], a4, c4[offset4 + i])
 *  */
    @Test
    public void testLinearCombination_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {0, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0, 0.0};
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(DSCompiler.java:717) */
        dSCompiler.linearCombination(java.lang.Double.NaN, doubleArray, 1, java.lang.Double.NaN, doubleArray1, 1, java.lang.Double.NaN, doubleArray2, -256, java.lang.Double.NaN, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: MathArrays.linearCombination(a1, c1[offset1 + i], a2, c2[offset2 + i], a3, c3[offset3 + i], a4, c4[offset4 + i])
 *  */
    @Test
    public void testLinearCombination_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {0, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(DSCompiler.java:717) */
        dSCompiler.linearCombination(java.lang.Double.NaN, doubleArray, 1, java.lang.Double.NaN, doubleArray1, -256, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: MathArrays.linearCombination(a1, c1[offset1 + i], a2, c2[offset2 + i], a3, c3[offset3 + i], a4, c4[offset4 + i])
 *  */
    @Test
    public void testLinearCombination_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {-2147483646, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(DSCompiler.java:717) */
        dSCompiler.linearCombination(java.lang.Double.NaN, doubleArray, -256, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = 0; i < getSize(); ++i)
 *  */
    @Test
    public void testLinearCombination_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -256);
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(DSCompiler.java:716) */
        dSCompiler.linearCombination(java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = 0; i < getSize(); ++i)
 *  */
    @Test
    public void testLinearCombination_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -256);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {0};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(DSCompiler.java:716) */
        dSCompiler.linearCombination(java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: MathArrays.linearCombination(a1, c1[offset1 + i], a2, c2[offset2 + i], a3, c3[offset3 + i], a4, c4[offset4 + i])
 *  */
    @Test
    public void testLinearCombination_ThrowNullPointerException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {3, 1};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(DSCompiler.java:717) */
        dSCompiler.linearCombination(java.lang.Double.NaN, doubleArray, 1, java.lang.Double.NaN, doubleArray, 1, java.lang.Double.NaN, doubleArray, 1, java.lang.Double.NaN, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: MathArrays.linearCombination(a1, c1[offset1 + i], a2, c2[offset2 + i], a3, c3[offset3 + i], a4, c4[offset4 + i])
 *  */
    @Test
    public void testLinearCombination_ThrowNullPointerException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {3, 1};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(DSCompiler.java:717) */
        dSCompiler.linearCombination(java.lang.Double.NaN, doubleArray, 1, java.lang.Double.NaN, doubleArray, 1, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: MathArrays.linearCombination(a1, c1[offset1 + i], a2, c2[offset2 + i], a3, c3[offset3 + i], a4, c4[offset4 + i])
 *  */
    @Test
    public void testLinearCombination_ThrowNullPointerException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {3, 1};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(DSCompiler.java:717) */
        dSCompiler.linearCombination(java.lang.Double.NaN, doubleArray, 1, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#linearCombination(double,double[],int,double,double[],int,double,double[],int,double,double[],int,double[],int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < getSize(); ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: MathArrays.linearCombination(a1, c1[offset1 + i], a2, c2[offset2 + i], a3, c3[offset3 + i], a4, c4[offset4 + i])
 *  */
    @Test
    public void testLinearCombination_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {1, 3};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.linearCombination(DSCompiler.java:717) */
        dSCompiler.linearCombination(java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, java.lang.Double.NaN, null, -255, null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method linearCombination(double, [D, int, double, [D, int, double, [D, int, double, [D, int, [D, int)
    
    @Test
    public void testLinearCombination1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] sizes = new int[9][];
        int[] intArray = {
            1, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        sizes[0] = intArray;
        sizes[1] = ((int[]) null);
        sizes[2] = ((int[]) null);
        sizes[3] = ((int[]) null);
        sizes[4] = ((int[]) null);
        sizes[5] = ((int[]) null);
        sizes[6] = ((int[]) null);
        sizes[7] = ((int[]) null);
        sizes[8] = ((int[]) null);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        dSCompiler.linearCombination(java.lang.Double.NaN, doubleArray, 0, java.lang.Double.NaN, doubleArray, 0, java.lang.Double.NaN, doubleArray, 0, java.lang.Double.NaN, doubleArray, 0, doubleArray, 0);
        
        int[][] dSCompilerSizes = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes1 = ((int[]) get(dSCompilerSizes, 1));
        int[][] dSCompilerSizes1 = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes2 = ((int[]) get(dSCompilerSizes1, 2));
        int[][] dSCompilerSizes2 = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes3 = ((int[]) get(dSCompilerSizes2, 3));
        int[][] dSCompilerSizes3 = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes4 = ((int[]) get(dSCompilerSizes3, 4));
        int[][] dSCompilerSizes4 = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes5 = ((int[]) get(dSCompilerSizes4, 5));
        int[][] dSCompilerSizes5 = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes6 = ((int[]) get(dSCompilerSizes5, 6));
        int[][] dSCompilerSizes6 = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes7 = ((int[]) get(dSCompilerSizes6, 7));
        int[][] dSCompilerSizes7 = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes8 = ((int[]) get(dSCompilerSizes7, 8));
        
        double finalDoubleArray0 = doubleArray[0];
        
        double finalDoubleArray01 = doubleArray[0];
        
        double finalDoubleArray02 = doubleArray[0];
        
        double finalDoubleArray03 = doubleArray[0];
        
        double finalDoubleArray04 = doubleArray[0];
        
        assertNull(finalDSCompilerSizes1);
        
        assertNull(finalDSCompilerSizes2);
        
        assertNull(finalDSCompilerSizes3);
        
        assertNull(finalDSCompilerSizes4);
        
        assertNull(finalDSCompilerSizes5);
        
        assertNull(finalDSCompilerSizes6);
        
        assertNull(finalDSCompilerSizes7);
        
        assertNull(finalDSCompilerSizes8);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray01, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray02, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray03, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray04, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method rootN([D, int, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#rootN(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 2): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.sqrt(operand[operandOffset]);
 *  */
    @Test
    public void testRootN_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(DSCompiler.java:950) */
        dSCompiler.rootN(doubleArray, -256, 2, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#rootN(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 2): False}
 * @utbot.executesCondition {@code (n == 3): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.cbrt(operand[operandOffset]);
 *  */
    @Test
    public void testRootN_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(DSCompiler.java:953) */
        dSCompiler.rootN(doubleArray, -256, 3, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#rootN(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 2): False}
 * @utbot.executesCondition {@code (n == 3): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.pow(operand[operandOffset], 1.0 / n);
 *  */
    @Test
    public void testRootN_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(DSCompiler.java:956) */
        dSCompiler.rootN(doubleArray, 129, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#rootN(double[],int,int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testRootN_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(DSCompiler.java:947) */
        dSCompiler.rootN(null, -255, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#rootN(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 2): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: function[0] = FastMath.sqrt(operand[operandOffset]);
 *  */
    @Test
    public void testRootN_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(DSCompiler.java:950) */
        dSCompiler.rootN(null, -255, 2, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#rootN(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 2): False}
 * @utbot.executesCondition {@code (n == 3): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: function[0] = FastMath.cbrt(operand[operandOffset]);
 *  */
    @Test
    public void testRootN_ThrowNullPointerException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(DSCompiler.java:953) */
        dSCompiler.rootN(null, -255, 3, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#rootN(double[],int,int,double[],int)}
 * @utbot.executesCondition {@code (n == 2): False}
 * @utbot.executesCondition {@code (n == 3): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: function[0] = FastMath.pow(operand[operandOffset], 1.0 / n);
 *  */
    @Test
    public void testRootN_ThrowNullPointerException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(DSCompiler.java:956) */
        dSCompiler.rootN(null, -255, -255, null, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method rootN([D, int, int, [D, int)
    
    @Test
    public void testRootN1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 29);
        double[] doubleArray = {
            5.06E-321, 5.06E-321, 5.06E-321, 5.06E-321, 5.06E-321, 5.06E-321,
            5.06E-321, 5.06E-321, 5.06E-321
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(DSCompiler.java:967) */
        dSCompiler.rootN(doubleArray, 0, 3, doubleArray, 0);
    }
    
    @Test
    public void testRootN2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 29);
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.rootN(DSCompiler.java:967) */
        dSCompiler.rootN(doubleArray, 0, 3, doubleArray, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.getOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getOrder()
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getOrder()}
 * @utbot.returnsFrom {@code return order;}
 *  */
    @Test
    public void testGetOrder_ReturnOrder() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -255);
        
        int actual = dSCompiler.getOrder();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method acosh([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#acosh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = operand[operandOffset];
 *  */
    @Test
    public void testAcosh_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh(DSCompiler.java:1542) */
        dSCompiler.acosh(doubleArray, -256, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#acosh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testAcosh_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh(DSCompiler.java:1541) */
        dSCompiler.acosh(null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#acosh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double x = operand[operandOffset];
 *  */
    @Test
    public void testAcosh_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh(DSCompiler.java:1542) */
        dSCompiler.acosh(null, -255, null, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method acosh([D, int, [D, int)
    
    @Test
    public void testAcosh1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        double[] doubleArray = {
            -8.212993224382646E-289, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh(DSCompiler.java:1582) */
        dSCompiler.acosh(doubleArray, 0, null, 0);
    }
    
    @Test
    public void testAcosh2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 29);
        double[] doubleArray = {
            -2.71198941037691456E17, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.acosh(DSCompiler.java:1582) */
        dSCompiler.acosh(doubleArray, 0, null, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method taylor([D, int, [D)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.returnsFrom {@code return value;}
 *  */
    @Test
    public void testTaylor_ReturnValue() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {};
        sizes[0] = intArray;
        int[] intArray1 = {3, 0};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        double actual = dSCompiler.taylor(null, -255, null);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = getSize() - 1; i >= 0; --i)} once
 * @utbot.returnsFrom {@code return value;}
 *  */
    @Test
    public void testTaylor_IterateForLoop() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][] derivativesIndirection = new int[1][];
        int[] intArray1 = {};
        derivativesIndirection[0] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        double[] doubleArray = {0.0};
        
        double actual = dSCompiler.taylor(doubleArray, 0, null);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        
        int[][] dSCompilerSizes = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes0 = ((int[]) get(dSCompilerSizes, 0));
        
        assertNull(finalDSCompilerSizes0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = getSize() - 1; i >= 0; --i)} once
 * @utbot.returnsFrom {@code return value;}
 *  */
    @Test
    public void testTaylor_KOfOrdersLessOrEqualZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][] derivativesIndirection = new int[1][];
        int[] intArray1 = {0};
        derivativesIndirection[0] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        double[] doubleArray = {0.0};
        
        double actual = dSCompiler.taylor(doubleArray, 0, null);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        
        int[][] dSCompilerSizes = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
        int[] finalDSCompilerSizes0 = ((int[]) get(dSCompilerSizes, 0));
        
        assertNull(finalDSCompilerSizes0);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = getSize() - 1; i >= 0; --i)} once
 * @utbot.returnsFrom {@code return value;}
 *  */
    @Test
    public void testTaylor_KOfOrdersGreaterThanZero() throws Exception  {
        Class arithmeticUtilsClazz = Class.forName("org.apache.commons.math3.util.ArithmeticUtils");
        long[] prevFACTORIALS = ((long[]) getStaticFieldValue(arithmeticUtilsClazz, "FACTORIALS"));
        try {
            long[] factorials = new long[21];
            factorials[0] = 1L;
            factorials[1] = 1L;
            factorials[2] = 2L;
            factorials[3] = 6L;
            factorials[4] = 24L;
            factorials[5] = 120L;
            factorials[6] = 720L;
            factorials[7] = 5040L;
            factorials[8] = 40320L;
            factorials[9] = 362880L;
            factorials[10] = 3628800L;
            factorials[11] = 39916800L;
            factorials[12] = 479001600L;
            factorials[13] = 6227020800L;
            factorials[14] = 87178291200L;
            factorials[15] = 1307674368000L;
            factorials[16] = 20922789888000L;
            factorials[17] = 355687428096000L;
            factorials[18] = 6402373705728000L;
            factorials[19] = 121645100408832000L;
            factorials[20] = 2432902008176640000L;
            setStaticField(arithmeticUtilsClazz, "FACTORIALS", factorials);
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
            int[][] sizes = new int[2][];
            sizes[0] = ((int[]) null);
            int[] intArray = {1};
            sizes[1] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            int[][] derivativesIndirection = new int[1][];
            derivativesIndirection[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
            double[] doubleArray = {0.0};
            
            double actual = dSCompiler.taylor(doubleArray, 0, doubleArray);
            
            org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
            
            int[][] dSCompilerSizes = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes"));
            int[] finalDSCompilerSizes0 = ((int[]) get(dSCompilerSizes, 0));
            
            assertNull(finalDSCompilerSizes0);
        } finally {
            setStaticField(org.apache.commons.math3.util.ArithmeticUtils.class, "FACTORIALS", prevFACTORIALS);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method taylor([D, int, [D)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = getSize() - 1; i >= 0; --i)
 *  */
    @Test
    public void testTaylor_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 129);
        int[][] sizes = {
            null,
            null
        };
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(DSCompiler.java:1735) */
        dSCompiler.taylor(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = getSize() - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double term = ds[dsOffset + i];
 *  */
    @Test
    public void testTaylor_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][] derivativesIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 127 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(DSCompiler.java:1737) */
        dSCompiler.taylor(doubleArray, 127, null);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = getSize() - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: term *= FastMath.pow(delta[k], orders[k]) / ArithmeticUtils.factorial(orders[k]);
 *  */
    @Test
    public void testTaylor_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class arithmeticUtilsClazz = Class.forName("org.apache.commons.math3.util.ArithmeticUtils");
        long[] prevFACTORIALS = ((long[]) getStaticFieldValue(arithmeticUtilsClazz, "FACTORIALS"));
        try {
            long[] factorials = new long[21];
            factorials[0] = 1L;
            factorials[1] = 1L;
            factorials[2] = 2L;
            factorials[3] = 6L;
            factorials[4] = 24L;
            factorials[5] = 120L;
            factorials[6] = 720L;
            factorials[7] = 5040L;
            factorials[8] = 40320L;
            factorials[9] = 362880L;
            factorials[10] = 3628800L;
            factorials[11] = 39916800L;
            factorials[12] = 479001600L;
            factorials[13] = 6227020800L;
            factorials[14] = 87178291200L;
            factorials[15] = 1307674368000L;
            factorials[16] = 20922789888000L;
            factorials[17] = 355687428096000L;
            factorials[18] = 6402373705728000L;
            factorials[19] = 121645100408832000L;
            factorials[20] = 2432902008176640000L;
            setStaticField(arithmeticUtilsClazz, "FACTORIALS", factorials);
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {1};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            int[][] derivativesIndirection = new int[1][];
            int[] intArray1 = {2, 1};
            derivativesIndirection[0] = intArray1;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
            double[] doubleArray = {0.0};
            double[] doubleArray1 = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(DSCompiler.java:1740) */
            dSCompiler.taylor(doubleArray, 0, doubleArray1);
        } finally {
            setStaticField(org.apache.commons.math3.util.ArithmeticUtils.class, "FACTORIALS", prevFACTORIALS);
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = getSize() - 1; i >= 0; --i)
 *  */
    @Test
    public void testTaylor_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -256);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {0};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(DSCompiler.java:1735) */
        dSCompiler.taylor(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = getSize() - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int[] orders = getPartialDerivativeOrders(i);
 *  */
    @Test
    public void testTaylor_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {3, 1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][] derivativesIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeOrders(DSCompiler.java:617)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(DSCompiler.java:1736) */
        dSCompiler.taylor(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = getSize() - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int k = 0; k < orders.length; ++k)
 *  */
    @Test
    public void testTaylor_ThrowNullPointerException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[][] sizes = new int[2][];
        sizes[0] = ((int[]) null);
        int[] intArray = {1};
        sizes[1] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][] derivativesIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(DSCompiler.java:1738) */
        dSCompiler.taylor(doubleArray, 0, null);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = getSize() - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: term *= FastMath.pow(delta[k], orders[k]) / ArithmeticUtils.factorial(orders[k]);
 *  */
    @Test
    public void testTaylor_ThrowNullPointerException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] sizes = new int[2][];
        int[] intArray = {1};
        sizes[0] = intArray;
        sizes[1] = ((int[]) null);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][] derivativesIndirection = new int[1][];
        derivativesIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(DSCompiler.java:1740) */
        dSCompiler.taylor(doubleArray, 0, null);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#taylor(double[],int,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = getSize() - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double term = ds[dsOffset + i];
 *  */
    @Test
    public void testTaylor_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {-2147483646, 1};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[][] derivativesIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.taylor(DSCompiler.java:1737) */
        dSCompiler.taylor(null, -255, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asinh([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#asinh(double[],int,double[],int)}
 * @utbot.executesCondition {@code (order > 0): False}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#asinh(double)}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compose(double[],int,double[],double[],int)}
 *  */
    @Test
    public void testAsinh_OrderLessOrEqualZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        double[] doubleArray = {0.0, -0.0};
        
        dSCompiler.asinh(doubleArray, 1, null, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asinh([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#asinh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = operand[operandOffset];
 *  */
    @Test
    public void testAsinh_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1599) */
        dSCompiler.asinh(doubleArray, -256, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#asinh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.asinh(x);
 *  */
    @Test
    public void testAsinh_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0, -0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1600) */
        dSCompiler.asinh(doubleArray, 1, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#asinh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: function[0] = FastMath.asinh(x);
 *  */
    @Test
    public void testAsinh_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {-0.097};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1600) */
        dSCompiler.asinh(doubleArray, 0, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#asinh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testAsinh_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1598) */
        dSCompiler.asinh(null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#asinh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double x = operand[operandOffset];
 *  */
    @Test
    public void testAsinh_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1599) */
        dSCompiler.asinh(null, -255, null, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method asinh([D, int, [D, int)
    
    @Test
    public void testAsinh1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 39);
        double[] doubleArray = {
            0.167, 0.167, 0.167, 0.167, 0.167, 0.167,
            0.167, 0.167, 0.167
        };
        double[] doubleArray1 = {
            0.167, 0.167, 0.167, 0.167, 0.167, 0.167,
            0.167, 0.167, 0.167
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1639) */
        dSCompiler.asinh(doubleArray, 0, doubleArray1, 0);
    }
    
    @Test
    public void testAsinh2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        double[] doubleArray = {
            0.036, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1639) */
        dSCompiler.asinh(doubleArray, 0, doubleArray, 0);
    }
    
    @Test
    public void testAsinh3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 30);
        double[] doubleArray = {0.097};
        double[] doubleArray1 = {
            0.097, 0.097, 0.097, 0.097, 0.097, 0.097,
            0.097, 0.097, 0.097, 0.097
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1639) */
        dSCompiler.asinh(doubleArray, 0, doubleArray1, 0);
    }
    
    @Test
    public void testAsinh4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        double[] doubleArray = {
            -0.167, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1639) */
        dSCompiler.asinh(doubleArray, 0, doubleArray1, 0);
    }
    
    @Test
    public void testAsinh5() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 29);
        double[] doubleArray = {
            -3.785766995733679E-270, -3.785766995733679E-270, -3.785766995733679E-270, -3.785766995733679E-270, -3.785766995733679E-270, -3.785766995733679E-270,
            -3.785766995733679E-270, -3.785766995733679E-270, -3.785766995733679E-270
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1639) */
        dSCompiler.asinh(doubleArray, 0, doubleArray, 0);
    }
    
    @Test
    public void testAsinh6() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 11);
        double[] doubleArray = {-0.036};
        double[] doubleArray1 = {
            -0.036, -0.036, -0.036, -0.036, -0.036, -0.036,
            -0.036, -0.036, -0.036
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1639) */
        dSCompiler.asinh(doubleArray, 0, doubleArray1, 0);
    }
    
    @Test
    public void testAsinh7() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 29);
        double[] doubleArray = {
            -1.9887354354327729, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1639) */
        dSCompiler.asinh(doubleArray, 0, doubleArray, 0);
    }
    
    @Test
    public void testAsinh8() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 29);
        double[] doubleArray = {
            2.0000000000000004, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.asinh(DSCompiler.java:1639) */
        dSCompiler.asinh(doubleArray, 0, doubleArray, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method atanh([D, int, [D, int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atanh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double x = operand[operandOffset];
 *  */
    @Test
    public void testAtanh_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh(DSCompiler.java:1656) */
        dSCompiler.atanh(doubleArray, -256, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atanh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] function = new double[1 + order];
 *  */
    @Test
    public void testAtanh_ThrowNegativeArraySizeException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh(DSCompiler.java:1655) */
        dSCompiler.atanh(null, -255, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#atanh(double[],int,double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double x = operand[operandOffset];
 *  */
    @Test
    public void testAtanh_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh(DSCompiler.java:1656) */
        dSCompiler.atanh(null, -255, null, -255);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method atanh([D, int, [D, int)
    
    @Test
    public void testAtanh1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 31);
        double[] doubleArray = {-0.087, -0.087};
        double[] doubleArray1 = {
            -0.087, -0.087, -0.087, -0.087, -0.087, -0.087,
            -0.087, -0.087, -0.087
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh(DSCompiler.java:1696) */
        dSCompiler.atanh(doubleArray, 0, doubleArray1, 0);
    }
    
    @Test
    public void testAtanh2() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 29);
        double[] doubleArray = {
            -3.785766995733679E-270, -3.785766995733679E-270, -3.785766995733679E-270, -3.785766995733679E-270, -3.785766995733679E-270, -3.785766995733679E-270,
            -3.785766995733679E-270, -3.785766995733679E-270, -3.785766995733679E-270
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh(DSCompiler.java:1696) */
        dSCompiler.atanh(doubleArray, 0, doubleArray, 0);
    }
    
    @Test
    public void testAtanh3() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 29);
        double[] doubleArray = {
            -0.09375, -0.09375, -0.09375, -0.09375, -0.09375, -0.09375,
            -0.09375, -0.09375, -0.09375
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh(DSCompiler.java:1696) */
        dSCompiler.atanh(doubleArray, 0, doubleArray, 0);
    }
    
    @Test
    public void testAtanh4() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 29);
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compose(DSCompiler.java:1712)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.atanh(DSCompiler.java:1696) */
        dSCompiler.atanh(doubleArray, 0, doubleArray, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.checkCompatibility
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkCompatibility(org.apache.commons.math3.analysis.differentiation.DSCompiler)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#checkCompatibility(org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters != compiler.parameters): False}
 * @utbot.executesCondition {@code (order != compiler.order): False}
 *  */
    @Test
    public void testCheckCompatibility_OrderEqualsCompilerOrder() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -255);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -255);
        
        dSCompiler.checkCompatibility(dSCompiler);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkCompatibility(org.apache.commons.math3.analysis.differentiation.DSCompiler)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#checkCompatibility(org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parameters != compiler.parameters
 *  */
    @Test
    public void testCheckCompatibility_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -255);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.checkCompatibility] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.checkCompatibility(DSCompiler.java:1754) */
        dSCompiler.checkCompatibility(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkCompatibility(org.apache.commons.math3.analysis.differentiation.DSCompiler)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#checkCompatibility(org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters != compiler.parameters): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: parameters != compiler.parameters
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testCheckCompatibility_ThrowDimensionMismatchException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -256);
        
        dSCompiler.checkCompatibility(dSCompiler1);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#checkCompatibility(org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters != compiler.parameters): False}
 * @utbot.executesCondition {@code (order != compiler.order): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: order != compiler.order
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testCheckCompatibility_ThrowDimensionMismatchException_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -255);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -255);
        
        dSCompiler.checkCompatibility(dSCompiler1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeOrders
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPartialDerivativeOrders(int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeOrders(int)}
 * @utbot.returnsFrom {@code return derivativesIndirection[index];}
 *  */
    @Test
    public void testGetPartialDerivativeOrders_ReturnIndexOfDerivativesIndirection() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = {
            null,
            null
        };
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        
        int[] actual = dSCompiler.getPartialDerivativeOrders(1);
        
        assertNull(actual);
        
        int[][] dSCompilerDerivativesIndirection = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection"));
        int[] finalDSCompilerDerivativesIndirection0 = ((int[]) get(dSCompilerDerivativesIndirection, 0));
        int[][] dSCompilerDerivativesIndirection1 = ((int[][]) getFieldValue(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection"));
        int[] finalDSCompilerDerivativesIndirection1 = ((int[]) get(dSCompilerDerivativesIndirection1, 1));
        
        assertNull(finalDSCompilerDerivativesIndirection0);
        
        assertNull(finalDSCompilerDerivativesIndirection1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPartialDerivativeOrders(int)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeOrders(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return derivativesIndirection[index];
 *  */
    @Test
    public void testGetPartialDerivativeOrders_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeOrders] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeOrders(DSCompiler.java:617) */
        dSCompiler.getPartialDerivativeOrders(-256);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeOrders(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return derivativesIndirection[index];
 *  */
    @Test
    public void testGetPartialDerivativeOrders_ThrowNullPointerException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeOrders] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeOrders(DSCompiler.java:617) */
        dSCompiler.getPartialDerivativeOrders(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compileLowerIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileLowerIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): True}
 * @utbot.returnsFrom {@code return new int[] { 0 };}
 *  */
    @Test
    public void testCompileLowerIndirection_ParametersEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileLowerIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileLowerIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileLowerIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileLowerIndirectionMethodArguments = new java.lang.Object[4];
        compileLowerIndirectionMethodArguments[0] = 0;
        compileLowerIndirectionMethodArguments[1] = -255;
        compileLowerIndirectionMethodArguments[2] = ((Object) null);
        compileLowerIndirectionMethodArguments[3] = ((Object) null);
        int[] actual = ((int[]) compileLowerIndirectionMethod.invoke(null, compileLowerIndirectionMethodArguments));
        
        int[] expected = {0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileLowerIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order <= 1): True}
 * @utbot.returnsFrom {@code return new int[] { 0 };}
 *  */
    @Test
    public void testCompileLowerIndirection_OrderLessOrEqual1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileLowerIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileLowerIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileLowerIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileLowerIndirectionMethodArguments = new java.lang.Object[4];
        compileLowerIndirectionMethodArguments[0] = -255;
        compileLowerIndirectionMethodArguments[1] = 1;
        compileLowerIndirectionMethodArguments[2] = ((Object) null);
        compileLowerIndirectionMethodArguments[3] = ((Object) null);
        int[] actual = ((int[]) compileLowerIndirectionMethod.invoke(null, compileLowerIndirectionMethodArguments));
        
        int[] expected = {0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileLowerIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order <= 1): False}
 * @utbot.returnsFrom {@code return lowerIndirection;}
 *  */
    @Test
    public void testCompileLowerIndirection_OrderGreaterThan1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[] lowerIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[] lowerIndirection1 = {};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection1);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileLowerIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileLowerIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileLowerIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileLowerIndirectionMethodArguments = new java.lang.Object[4];
        compileLowerIndirectionMethodArguments[0] = -255;
        compileLowerIndirectionMethodArguments[1] = 2;
        compileLowerIndirectionMethodArguments[2] = dSCompiler;
        compileLowerIndirectionMethodArguments[3] = dSCompiler1;
        int[] actual = ((int[]) compileLowerIndirectionMethod.invoke(null, compileLowerIndirectionMethodArguments));
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileLowerIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order <= 1): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.returnsFrom {@code return lowerIndirection;}
 *  */
    @Test
    public void testCompileLowerIndirection_DSCompilerGetSize() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[][] sizes = new int[2][];
        int[] intArray = {0};
        sizes[0] = intArray;
        int[] intArray1 = {0};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[] lowerIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[] lowerIndirection1 = {-255};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection1);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileLowerIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileLowerIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileLowerIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileLowerIndirectionMethodArguments = new java.lang.Object[4];
        compileLowerIndirectionMethodArguments[0] = -255;
        compileLowerIndirectionMethodArguments[1] = 2;
        compileLowerIndirectionMethodArguments[2] = dSCompiler;
        compileLowerIndirectionMethodArguments[3] = dSCompiler1;
        int[] actual = ((int[]) compileLowerIndirectionMethod.invoke(null, compileLowerIndirectionMethodArguments));
        
        int[] expected = {-255};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compileLowerIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileLowerIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lowerIndirection[vSize + i] = valueCompiler.getSize() + derivativeCompiler.lowerIndirection[i];
 *  */
    @Test
    public void testCompileLowerIndirection_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -256);
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[] lowerIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[] lowerIndirection1 = {-255};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection(DSCompiler.java:320) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileLowerIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileLowerIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileLowerIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileLowerIndirectionMethodArguments = new java.lang.Object[4];
        compileLowerIndirectionMethodArguments[0] = -255;
        compileLowerIndirectionMethodArguments[1] = 2;
        compileLowerIndirectionMethodArguments[2] = dSCompiler;
        compileLowerIndirectionMethodArguments[3] = dSCompiler1;
        try {
            compileLowerIndirectionMethod.invoke(null, compileLowerIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileLowerIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lowerIndirection[vSize + i] = valueCompiler.getSize() + derivativeCompiler.lowerIndirection[i];
 *  */
    @Test
    public void testCompileLowerIndirection_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 129);
        int[][] sizes = new int[2][];
        int[] intArray = {0};
        sizes[0] = intArray;
        int[] intArray1 = {0, 0};
        sizes[1] = intArray1;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[] lowerIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[] lowerIndirection1 = {-255};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection(DSCompiler.java:320) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileLowerIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileLowerIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileLowerIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileLowerIndirectionMethodArguments = new java.lang.Object[4];
        compileLowerIndirectionMethodArguments[0] = 1;
        compileLowerIndirectionMethodArguments[1] = 2;
        compileLowerIndirectionMethodArguments[2] = dSCompiler;
        compileLowerIndirectionMethodArguments[3] = dSCompiler1;
        try {
            compileLowerIndirectionMethod.invoke(null, compileLowerIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileLowerIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int vSize = valueCompiler.lowerIndirection.length;
 *  */
    @Test
    public void testCompileLowerIndirection_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection(DSCompiler.java:315) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileLowerIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileLowerIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileLowerIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileLowerIndirectionMethodArguments = new java.lang.Object[4];
        compileLowerIndirectionMethodArguments[0] = -255;
        compileLowerIndirectionMethodArguments[1] = 2;
        compileLowerIndirectionMethodArguments[2] = ((Object) null);
        compileLowerIndirectionMethodArguments[3] = ((Object) null);
        try {
            compileLowerIndirectionMethod.invoke(null, compileLowerIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileLowerIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int dSize = derivativeCompiler.lowerIndirection.length;
 *  */
    @Test
    public void testCompileLowerIndirection_ThrowNullPointerException_2() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[] lowerIndirection = {-255};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection(DSCompiler.java:316) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileLowerIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileLowerIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileLowerIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileLowerIndirectionMethodArguments = new java.lang.Object[4];
        compileLowerIndirectionMethodArguments[0] = -255;
        compileLowerIndirectionMethodArguments[1] = 2;
        compileLowerIndirectionMethodArguments[2] = dSCompiler;
        compileLowerIndirectionMethodArguments[3] = ((Object) null);
        try {
            compileLowerIndirectionMethod.invoke(null, compileLowerIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileLowerIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int vSize = valueCompiler.lowerIndirection.length;
 *  */
    @Test
    public void testCompileLowerIndirection_ThrowNullPointerException_1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection(DSCompiler.java:315) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileLowerIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileLowerIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileLowerIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileLowerIndirectionMethodArguments = new java.lang.Object[4];
        compileLowerIndirectionMethodArguments[0] = -255;
        compileLowerIndirectionMethodArguments[1] = 2;
        compileLowerIndirectionMethodArguments[2] = dSCompiler;
        compileLowerIndirectionMethodArguments[3] = ((Object) null);
        try {
            compileLowerIndirectionMethod.invoke(null, compileLowerIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileLowerIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int dSize = derivativeCompiler.lowerIndirection.length;
 *  */
    @Test
    public void testCompileLowerIndirection_ThrowNullPointerException_3() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[] lowerIndirection = {-255};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "lowerIndirection", lowerIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileLowerIndirection(DSCompiler.java:316) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileLowerIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileLowerIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileLowerIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileLowerIndirectionMethodArguments = new java.lang.Object[4];
        compileLowerIndirectionMethodArguments[0] = -255;
        compileLowerIndirectionMethodArguments[1] = 2;
        compileLowerIndirectionMethodArguments[2] = dSCompiler;
        compileLowerIndirectionMethodArguments[3] = dSCompiler1;
        try {
            compileLowerIndirectionMethod.invoke(null, compileLowerIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPartialDerivativeIndex(int, int, [[I, [I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = parameters - 1; i >= 0; --i)} once
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testGetPartialDerivativeIndex_PostfixDecrementDerivativeOrderGreaterThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[][] intArray = new int[1][];
        int[] intArray1 = {0, 0};
        intArray[0] = intArray1;
        int[] intArray2 = {1};
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Class intArray2Type = Class.forName("[I");
        Method getPartialDerivativeIndexMethod = dSCompilerClazz.getDeclaredMethod("getPartialDerivativeIndex", intType, intType, intArrayType, intArray2Type);
        getPartialDerivativeIndexMethod.setAccessible(true);
        java.lang.Object[] getPartialDerivativeIndexMethodArguments = new java.lang.Object[4];
        getPartialDerivativeIndexMethodArguments[0] = 1;
        getPartialDerivativeIndexMethodArguments[1] = 1;
        getPartialDerivativeIndexMethodArguments[2] = ((Object) intArray);
        getPartialDerivativeIndexMethodArguments[3] = ((Object) intArray2);
        int actual = ((Integer) getPartialDerivativeIndexMethod.invoke(null, getPartialDerivativeIndexMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = parameters - 1; i >= 0; --i)} once
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testGetPartialDerivativeIndex_PostfixDecrementDerivativeOrderLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {0};
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Class intArrayType1 = Class.forName("[I");
        Method getPartialDerivativeIndexMethod = dSCompilerClazz.getDeclaredMethod("getPartialDerivativeIndex", intType, intType, intArrayType, intArrayType1);
        getPartialDerivativeIndexMethod.setAccessible(true);
        java.lang.Object[] getPartialDerivativeIndexMethodArguments = new java.lang.Object[4];
        getPartialDerivativeIndexMethodArguments[0] = 1;
        getPartialDerivativeIndexMethodArguments[1] = 0;
        getPartialDerivativeIndexMethodArguments[2] = ((Object) null);
        getPartialDerivativeIndexMethodArguments[3] = ((Object) intArray);
        int actual = ((Integer) getPartialDerivativeIndexMethod.invoke(null, getPartialDerivativeIndexMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ReturnIndex() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Class intArrayType1 = Class.forName("[I");
        Method getPartialDerivativeIndexMethod = dSCompilerClazz.getDeclaredMethod("getPartialDerivativeIndex", intType, intType, intArrayType, intArrayType1);
        getPartialDerivativeIndexMethod.setAccessible(true);
        java.lang.Object[] getPartialDerivativeIndexMethodArguments = new java.lang.Object[4];
        getPartialDerivativeIndexMethodArguments[0] = 0;
        getPartialDerivativeIndexMethodArguments[1] = -255;
        getPartialDerivativeIndexMethodArguments[2] = ((Object) null);
        getPartialDerivativeIndexMethodArguments[3] = ((Object) null);
        int actual = ((Integer) getPartialDerivativeIndexMethod.invoke(null, getPartialDerivativeIndexMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPartialDerivativeIndex(int, int, [[I, [I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = parameters - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: index += sizes[i][m--];
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        int[][] intArray = {};
        int[] intArray1 = {1};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Class intArray1Type = Class.forName("[I");
        Method getPartialDerivativeIndexMethod = dSCompilerClazz.getDeclaredMethod("getPartialDerivativeIndex", intType, intType, intArrayType, intArray1Type);
        getPartialDerivativeIndexMethod.setAccessible(true);
        java.lang.Object[] getPartialDerivativeIndexMethodArguments = new java.lang.Object[4];
        getPartialDerivativeIndexMethodArguments[0] = 1;
        getPartialDerivativeIndexMethodArguments[1] = 1;
        getPartialDerivativeIndexMethodArguments[2] = ((Object) intArray);
        getPartialDerivativeIndexMethodArguments[3] = ((Object) intArray1);
        try {
            getPartialDerivativeIndexMethod.invoke(null, getPartialDerivativeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = parameters - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: index += sizes[i][m--];
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        int[][] intArray = new int[1][];
        int[] intArray1 = {0};
        intArray[0] = intArray1;
        int[] intArray2 = {1};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Class intArray2Type = Class.forName("[I");
        Method getPartialDerivativeIndexMethod = dSCompilerClazz.getDeclaredMethod("getPartialDerivativeIndex", intType, intType, intArrayType, intArray2Type);
        getPartialDerivativeIndexMethod.setAccessible(true);
        java.lang.Object[] getPartialDerivativeIndexMethodArguments = new java.lang.Object[4];
        getPartialDerivativeIndexMethodArguments[0] = 1;
        getPartialDerivativeIndexMethodArguments[1] = 1;
        getPartialDerivativeIndexMethodArguments[2] = ((Object) intArray);
        getPartialDerivativeIndexMethodArguments[3] = ((Object) intArray2);
        try {
            getPartialDerivativeIndexMethod.invoke(null, getPartialDerivativeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = parameters - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int derivativeOrder = orders[i];
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:568) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Class intArrayType1 = Class.forName("[I");
        Method getPartialDerivativeIndexMethod = dSCompilerClazz.getDeclaredMethod("getPartialDerivativeIndex", intType, intType, intArrayType, intArrayType1);
        getPartialDerivativeIndexMethod.setAccessible(true);
        java.lang.Object[] getPartialDerivativeIndexMethodArguments = new java.lang.Object[4];
        getPartialDerivativeIndexMethodArguments[0] = 1;
        getPartialDerivativeIndexMethodArguments[1] = 1;
        getPartialDerivativeIndexMethodArguments[2] = ((Object) null);
        getPartialDerivativeIndexMethodArguments[3] = ((Object) intArray);
        try {
            getPartialDerivativeIndexMethod.invoke(null, getPartialDerivativeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = parameters - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: index += sizes[i][m--];
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowNullPointerException_2() throws Throwable  {
        int[][] intArray = {null};
        int[] intArray1 = {1};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Class intArray1Type = Class.forName("[I");
        Method getPartialDerivativeIndexMethod = dSCompilerClazz.getDeclaredMethod("getPartialDerivativeIndex", intType, intType, intArrayType, intArray1Type);
        getPartialDerivativeIndexMethod.setAccessible(true);
        java.lang.Object[] getPartialDerivativeIndexMethodArguments = new java.lang.Object[4];
        getPartialDerivativeIndexMethodArguments[0] = 1;
        getPartialDerivativeIndexMethodArguments[1] = 1;
        getPartialDerivativeIndexMethodArguments[2] = ((Object) intArray);
        getPartialDerivativeIndexMethodArguments[3] = ((Object) intArray1);
        try {
            getPartialDerivativeIndexMethod.invoke(null, getPartialDerivativeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = parameters - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: index += sizes[i][m--];
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowNullPointerException_1() throws Throwable  {
        int[] intArray = {1, -255};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Class intArrayType1 = Class.forName("[I");
        Method getPartialDerivativeIndexMethod = dSCompilerClazz.getDeclaredMethod("getPartialDerivativeIndex", intType, intType, intArrayType, intArrayType1);
        getPartialDerivativeIndexMethod.setAccessible(true);
        java.lang.Object[] getPartialDerivativeIndexMethodArguments = new java.lang.Object[4];
        getPartialDerivativeIndexMethodArguments[0] = 1;
        getPartialDerivativeIndexMethodArguments[1] = 1;
        getPartialDerivativeIndexMethodArguments[2] = ((Object) null);
        getPartialDerivativeIndexMethodArguments[3] = ((Object) intArray);
        try {
            getPartialDerivativeIndexMethod.invoke(null, getPartialDerivativeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = parameters - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int derivativeOrder = orders[i];
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:568) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Class intArrayType1 = Class.forName("[I");
        Method getPartialDerivativeIndexMethod = dSCompilerClazz.getDeclaredMethod("getPartialDerivativeIndex", intType, intType, intArrayType, intArrayType1);
        getPartialDerivativeIndexMethod.setAccessible(true);
        java.lang.Object[] getPartialDerivativeIndexMethodArguments = new java.lang.Object[4];
        getPartialDerivativeIndexMethodArguments[0] = 1;
        getPartialDerivativeIndexMethodArguments[1] = -255;
        getPartialDerivativeIndexMethodArguments[2] = ((Object) null);
        getPartialDerivativeIndexMethodArguments[3] = ((Object) null);
        try {
            getPartialDerivativeIndexMethod.invoke(null, getPartialDerivativeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPartialDerivativeIndex(int, int, [[I, [I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = parameters - 1; i >= 0; --i)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} when: ordersSum > order
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testGetPartialDerivativeIndex_ThrowNumberIsTooLargeException() throws Throwable  {
        int[] intArray = {-255};
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Class intArrayType1 = Class.forName("[I");
        Method getPartialDerivativeIndexMethod = dSCompilerClazz.getDeclaredMethod("getPartialDerivativeIndex", intType, intType, intArrayType, intArrayType1);
        getPartialDerivativeIndexMethod.setAccessible(true);
        java.lang.Object[] getPartialDerivativeIndexMethodArguments = new java.lang.Object[4];
        getPartialDerivativeIndexMethodArguments[0] = 1;
        getPartialDerivativeIndexMethodArguments[1] = -256;
        getPartialDerivativeIndexMethodArguments[2] = ((Object) null);
        getPartialDerivativeIndexMethodArguments[3] = ((Object) intArray);
        try {
            getPartialDerivativeIndexMethod.invoke(null, getPartialDerivativeIndexMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPartialDerivativeIndex([I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int[])}
 * @utbot.returnsFrom {@code return getPartialDerivativeIndex(parameters, order, sizes, orders);}
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ReturnGetPartialDerivativeIndex_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {0, 0};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[] intArray1 = {1};
        
        int actual = dSCompiler.getPartialDerivativeIndex(intArray1);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int[])}
 * @utbot.returnsFrom {@code return getPartialDerivativeIndex(parameters, order, sizes, orders);}
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ReturnGetPartialDerivativeIndex() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        int[] intArray = {0};
        
        int actual = dSCompiler.getPartialDerivativeIndex(intArray);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPartialDerivativeIndex([I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPartialDerivativeIndex(parameters, order, sizes, orders);
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = new int[1][];
        int[] intArray = {0};
        sizes[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[] intArray1 = {1};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:542) */
        dSCompiler.getPartialDerivativeIndex(intArray1);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getPartialDerivativeIndex(parameters, order, sizes, orders);
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[] intArray = {1};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:542) */
        dSCompiler.getPartialDerivativeIndex(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: orders.length != getFreeParameters()
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowNullPointerException1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:538) */
        dSCompiler.getPartialDerivativeIndex(null);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPartialDerivativeIndex(parameters, order, sizes, orders);
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowNullPointerException_11() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[][] sizes = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
        int[] intArray = {1};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:542) */
        dSCompiler.getPartialDerivativeIndex(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPartialDerivativeIndex(parameters, order, sizes, orders);
 *  */
    @Test
    public void testGetPartialDerivativeIndex_ThrowNullPointerException_21() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1);
        int[] intArray = {1};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:542) */
        dSCompiler.getPartialDerivativeIndex(intArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPartialDerivativeIndex([I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int[])}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getFreeParameters()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: orders.length != getFreeParameters()
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetPartialDerivativeIndex_ThrowDimensionMismatchException() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", -3);
        int[] intArray = {-255, -255};
        
        dSCompiler.getPartialDerivativeIndex(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int[])}
 * @utbot.invokes org.apache.commons.math3.analysis.differentiation.DSCompiler#getPartialDerivativeIndex(int,int,int[][],int[])
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} in: return getPartialDerivativeIndex(parameters, order, sizes, orders);
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testGetPartialDerivativeIndex_ThrowNumberIsTooLargeException1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1);
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", -3);
        int[] intArray = {-2};
        
        dSCompiler.getPartialDerivativeIndex(intArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compileCompositionIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, [[I, [[I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.executesCondition {@code (parameters == 0): True}
 * @utbot.returnsFrom {@code return new int[][][] { { { 1, 0 } } };}
 *  */
    @Test
    public void testCompileCompositionIndirection_ParametersEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = 0;
        compileCompositionIndirectionMethodArguments[1] = -255;
        compileCompositionIndirectionMethodArguments[2] = ((Object) null);
        compileCompositionIndirectionMethodArguments[3] = ((Object) null);
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        int[][][] actual = ((int[][][]) compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments));
        
        int[][][] expected = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {1, 0};
        intArray[0] = intArray1;
        expected[0] = intArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order == 0): True}
 * @utbot.returnsFrom {@code return new int[][][] { { { 1, 0 } } };}
 *  */
    @Test
    public void testCompileCompositionIndirection_OrderEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = -255;
        compileCompositionIndirectionMethodArguments[1] = 0;
        compileCompositionIndirectionMethodArguments[2] = ((Object) null);
        compileCompositionIndirectionMethodArguments[3] = ((Object) null);
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        int[][][] actual = ((int[][][]) compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments));
        
        int[][][] expected = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {1, 0};
        intArray[0] = intArray1;
        expected[0] = intArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return compIndirection;}
 *  */
    @Test
    public void testCompileCompositionIndirection_OrderNotEqualsZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = {};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = -255;
        compileCompositionIndirectionMethodArguments[1] = 1;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        int[][][] actual = ((int[][][]) compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments));
        
        int[][][] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compileCompositionIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, [[I, [[I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: derivedTermF[term.length] = getPartialDerivativeIndex(parameters, order, sizes, orders);
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = new int[29];
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        int[][] intArray2 = {};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:437) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type, intArray2Type);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = 1;
        compileCompositionIndirectionMethodArguments[1] = 1;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) intArray2);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: derivedTermF[term.length] = getPartialDerivativeIndex(parameters, order, sizes, orders);
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = new int[29];
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        int[][] intArray2 = new int[1][];
        int[] intArray3 = {0};
        intArray2[0] = intArray3;
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:437) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type, intArray2Type);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = 1;
        compileCompositionIndirectionMethodArguments[1] = 1;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) intArray2);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: derivedTermF[0] = term[0];
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {};
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:433) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = -255;
        compileCompositionIndirectionMethodArguments[1] = -255;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: derivedTermF[1] = term[1] + 1;
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {0};
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:434) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = -255;
        compileCompositionIndirectionMethodArguments[1] = -255;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: int[] orders = new int[parameters];
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowNegativeArraySizeException() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = new int[29];
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:435) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = -256;
        compileCompositionIndirectionMethodArguments[1] = -255;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: derivedTermF[term.length] = getPartialDerivativeIndex(parameters, order, sizes, orders);
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowNullPointerException_6() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = new int[29];
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        int[][] intArray2 = {null};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:437) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type, intArray2Type);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = 1;
        compileCompositionIndirectionMethodArguments[1] = 1;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) intArray2);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int vSize = valueCompiler.compIndirection.length;
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:414) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = -255;
        compileCompositionIndirectionMethodArguments[1] = -255;
        compileCompositionIndirectionMethodArguments[2] = ((Object) null);
        compileCompositionIndirectionMethodArguments[3] = ((Object) null);
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int dSize = derivativeCompiler.compIndirection.length;
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowNullPointerException_1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:415) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = -255;
        compileCompositionIndirectionMethodArguments[1] = -255;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = ((Object) null);
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int[] derivedTermF = new int[term.length + 1];
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowNullPointerException_4() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = {null};
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:432) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = -255;
        compileCompositionIndirectionMethodArguments[1] = -255;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: derivedTermF[term.length] = getPartialDerivativeIndex(parameters, order, sizes, orders);
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowNullPointerException_5() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = new int[29];
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.getPartialDerivativeIndex(DSCompiler.java:580)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:437) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = 1;
        compileCompositionIndirectionMethodArguments[1] = 1;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: derivedTermF[j] = convertIndex(term[j], parameters, derivativeCompiler.derivativesIndirection, parameters, order, sizes);
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowNullPointerException_8() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = {null};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {0, -1, 0};
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        int[][] intArray2 = new int[1][];
        int[] intArray3 = {3, 0};
        intArray2[0] = intArray3;
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:604)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:441) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type, intArray2Type);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = 1;
        compileCompositionIndirectionMethodArguments[1] = 1;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) intArray2);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int vSize = valueCompiler.compIndirection.length;
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowNullPointerException_2() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:414) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = -255;
        compileCompositionIndirectionMethodArguments[1] = -255;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = ((Object) null);
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int dSize = derivativeCompiler.compIndirection.length;
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowNullPointerException_3() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:415) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = -255;
        compileCompositionIndirectionMethodArguments[1] = -255;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: derivedTermF[j] = convertIndex(term[j], parameters, derivativeCompiler.derivativesIndirection, parameters, order, sizes);
 *  */
    @Test
    public void testCompileCompositionIndirection_ThrowNullPointerException_7() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {0, 0, 0};
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        int[][] intArray2 = new int[1][];
        int[] intArray3 = {0, 0};
        intArray2[0] = intArray3;
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:604)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:441) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type, intArray2Type);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = 1;
        compileCompositionIndirectionMethodArguments[1] = 1;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) intArray2);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compileCompositionIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, [[I, [[I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileCompositionIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[][],int[][])}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} in: derivedTermF[term.length] = getPartialDerivativeIndex(parameters, order, sizes, orders);
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testCompileCompositionIndirection_ThrowNumberIsTooLargeException() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = new int[29];
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType, intArrayType);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = 1;
        compileCompositionIndirectionMethodArguments[1] = -256;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) null);
        compileCompositionIndirectionMethodArguments[5] = ((Object) null);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compileCompositionIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, [[I, [[I)
    
    @Test
    public void testCompileCompositionIndirection1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = new int[9][];
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        derivativesIndirection[0] = intArray;
        derivativesIndirection[1] = ((int[]) null);
        derivativesIndirection[2] = ((int[]) null);
        derivativesIndirection[3] = ((int[]) null);
        derivativesIndirection[4] = ((int[]) null);
        derivativesIndirection[5] = ((int[]) null);
        derivativesIndirection[6] = ((int[]) null);
        derivativesIndirection[7] = ((int[]) null);
        derivativesIndirection[8] = ((int[]) null);
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        int[][][] compIndirection1 = new int[9][][];
        int[][] intArray1 = new int[9][];
        int[] intArray2 = new int[32];
        intArray2[1] = -1061416895;
        intArray2[3] = 2053;
        intArray2[4] = 2053;
        intArray2[5] = 2053;
        intArray2[6] = 2053;
        intArray2[7] = 2053;
        intArray2[8] = 2053;
        intArray2[9] = 2053;
        intArray2[10] = 2053;
        intArray2[11] = 2053;
        intArray2[12] = 2053;
        intArray2[13] = 2053;
        intArray2[14] = 2053;
        intArray2[15] = 2053;
        intArray2[16] = 2053;
        intArray2[17] = 2053;
        intArray2[18] = 2053;
        intArray2[19] = 2053;
        intArray2[20] = 2053;
        intArray2[21] = 2053;
        intArray2[22] = 2053;
        intArray2[23] = 2053;
        intArray2[24] = 2053;
        intArray2[25] = 2053;
        intArray2[26] = 2053;
        intArray2[27] = 2053;
        intArray2[28] = 2053;
        intArray2[29] = 2053;
        intArray2[30] = 2053;
        intArray2[31] = 2053;
        intArray1[0] = intArray2;
        intArray1[1] = ((int[]) null);
        intArray1[2] = ((int[]) null);
        intArray1[3] = ((int[]) null);
        intArray1[4] = ((int[]) null);
        intArray1[5] = ((int[]) null);
        intArray1[6] = ((int[]) null);
        intArray1[7] = ((int[]) null);
        intArray1[8] = ((int[]) null);
        compIndirection1[0] = intArray1;
        compIndirection1[1] = ((int[][]) null);
        compIndirection1[2] = ((int[][]) null);
        compIndirection1[3] = ((int[][]) null);
        compIndirection1[4] = ((int[][]) null);
        compIndirection1[5] = ((int[][]) null);
        compIndirection1[6] = ((int[][]) null);
        compIndirection1[7] = ((int[][]) null);
        compIndirection1[8] = ((int[][]) null);
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        int[][] intArray3 = new int[9][];
        int[] intArray4 = {
            2053, 2053, 2053, 2053, 2053, 2053, 2053, 2053,
            0
        };
        intArray3[0] = intArray4;
        intArray3[1] = ((int[]) null);
        intArray3[2] = ((int[]) null);
        intArray3[3] = ((int[]) null);
        intArray3[4] = ((int[]) null);
        intArray3[5] = ((int[]) null);
        intArray3[6] = ((int[]) null);
        intArray3[7] = ((int[]) null);
        intArray3[8] = ((int[]) null);
        int[][] intArray5 = new int[17][];
        intArray5[0] = ((int[]) null);
        intArray5[1] = ((int[]) null);
        intArray5[2] = ((int[]) null);
        intArray5[3] = ((int[]) null);
        intArray5[4] = ((int[]) null);
        intArray5[5] = ((int[]) null);
        intArray5[6] = ((int[]) null);
        intArray5[7] = ((int[]) null);
        intArray5[8] = ((int[]) null);
        intArray5[9] = ((int[]) null);
        intArray5[10] = ((int[]) null);
        intArray5[11] = ((int[]) null);
        intArray5[12] = ((int[]) null);
        intArray5[13] = ((int[]) null);
        intArray5[14] = ((int[]) null);
        intArray5[15] = ((int[]) null);
        intArray5[16] = ((int[]) null);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2053 out of bounds for length 9]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.convertIndex(DSCompiler.java:604)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:441) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray3Type = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray3Type, intArray3Type);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = 1;
        compileCompositionIndirectionMethodArguments[1] = 8;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) intArray3);
        compileCompositionIndirectionMethodArguments[5] = ((Object) intArray5);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileCompositionIndirection2() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] compIndirection1 = new int[9][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {0, 0};
        intArray[0] = intArray1;
        compIndirection1[0] = intArray;
        compIndirection1[1] = ((int[][]) null);
        compIndirection1[2] = ((int[][]) null);
        compIndirection1[3] = ((int[][]) null);
        compIndirection1[4] = ((int[][]) null);
        compIndirection1[5] = ((int[][]) null);
        compIndirection1[6] = ((int[][]) null);
        compIndirection1[7] = ((int[][]) null);
        compIndirection1[8] = ((int[][]) null);
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "compIndirection", compIndirection1);
        int[][] intArray2 = new int[9][];
        int[] intArray3 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        intArray2[0] = intArray3;
        intArray2[1] = ((int[]) null);
        intArray2[2] = ((int[]) null);
        intArray2[3] = ((int[]) null);
        intArray2[4] = ((int[]) null);
        intArray2[5] = ((int[]) null);
        intArray2[6] = ((int[]) null);
        intArray2[7] = ((int[]) null);
        intArray2[8] = ((int[]) null);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileCompositionIndirection(DSCompiler.java:427) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[[I");
        Method compileCompositionIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileCompositionIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type, intArray2Type);
        compileCompositionIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileCompositionIndirectionMethodArguments = new java.lang.Object[6];
        compileCompositionIndirectionMethodArguments[0] = 1;
        compileCompositionIndirectionMethodArguments[1] = 8;
        compileCompositionIndirectionMethodArguments[2] = dSCompiler;
        compileCompositionIndirectionMethodArguments[3] = dSCompiler1;
        compileCompositionIndirectionMethodArguments[4] = ((Object) intArray2);
        compileCompositionIndirectionMethodArguments[5] = ((Object) intArray2);
        try {
            compileCompositionIndirectionMethod.invoke(null, compileCompositionIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compileDerivativesIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.returnsFrom {@code return derivativesIndirection;}
 *  */
    @Test
    public void testCompileDerivativesIndirection_OrderNotEqualsZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = 1;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = dSCompiler;
        compileDerivativesIndirectionMethodArguments[3] = dSCompiler;
        int[][] actual = ((int[][]) compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments));
        
        int[][] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order == 0): True}
 * @utbot.returnsFrom {@code return new int[1][parameters];}
 *  */
    @Test
    public void testCompileDerivativesIndirection_OrderEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = 1;
        compileDerivativesIndirectionMethodArguments[1] = 0;
        compileDerivativesIndirectionMethodArguments[2] = ((Object) null);
        compileDerivativesIndirectionMethodArguments[3] = ((Object) null);
        int[][] actual = ((int[][]) compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments));
        
        int[][] expected = new int[1][];
        int[] intArray = {0};
        expected[0] = intArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): True}
 * @utbot.returnsFrom {@code return new int[1][parameters];}
 *  */
    @Test
    public void testCompileDerivativesIndirection_ParametersEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = 0;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = ((Object) null);
        compileDerivativesIndirectionMethodArguments[3] = ((Object) null);
        int[][] actual = ((int[][]) compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments));
        
        int[][] expected = new int[1][];
        int[] intArray = {};
        expected[0] = intArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < vSize; ++i)} once
 * @utbot.returnsFrom {@code return derivativesIndirection;}
 *  */
    @Test
    public void testCompileDerivativesIndirection_SystemArraycopy() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = new int[1][];
        int[] intArray = {};
        derivativesIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection1 = {};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection1);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = 1;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = dSCompiler;
        compileDerivativesIndirectionMethodArguments[3] = dSCompiler1;
        int[][] actual = ((int[][]) compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments));
        
        int[][] expected = new int[1][];
        int[] intArray1 = {0};
        expected[0] = intArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.returnsFrom {@code return derivativesIndirection;}
 *  */
    @Test
    public void testCompileDerivativesIndirection_SystemArraycopy_1() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection1 = new int[1][];
        int[] intArray = {0};
        derivativesIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection1);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = 1;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = dSCompiler;
        compileDerivativesIndirectionMethodArguments[3] = dSCompiler1;
        int[][] actual = ((int[][]) compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments));
        
        int[][] expected = new int[1][];
        int[] intArray1 = {1};
        expected[0] = intArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compileDerivativesIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (order == 0): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return new int[1][parameters];
 *  */
    @Test
    public void testCompileDerivativesIndirection_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(DSCompiler.java:263) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = -256;
        compileDerivativesIndirectionMethodArguments[1] = 0;
        compileDerivativesIndirectionMethodArguments[2] = ((Object) null);
        compileDerivativesIndirectionMethodArguments[3] = ((Object) null);
        try {
            compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final int[][] derivativesIndirection = new int[vSize + dSize][parameters];
 *  */
    @Test
    public void testCompileDerivativesIndirection_ThrowNegativeArraySizeException_1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection1 = {null};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(DSCompiler.java:268) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = -255;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = dSCompiler;
        compileDerivativesIndirectionMethodArguments[3] = dSCompiler1;
        try {
            compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < vSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(valueCompiler.derivativesIndirection[i], 0, derivativesIndirection[i], 0, parameters - 1);
 *  */
    @Test
    public void testCompileDerivativesIndirection_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = new int[1][];
        int[] intArray = {};
        derivativesIndirection[0] = intArray;
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection1 = {};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for int[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(DSCompiler.java:273) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = 2;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = dSCompiler;
        compileDerivativesIndirectionMethodArguments[3] = dSCompiler1;
        try {
            compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int vSize = valueCompiler.derivativesIndirection.length;
 *  */
    @Test
    public void testCompileDerivativesIndirection_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(DSCompiler.java:266) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = -255;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = ((Object) null);
        compileDerivativesIndirectionMethodArguments[3] = ((Object) null);
        try {
            compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(derivativeCompiler.derivativesIndirection[i], 0, derivativesIndirection[vSize + i], 0, parameters);
 *  */
    @Test
    public void testCompileDerivativesIndirection_ThrowNullPointerException_2() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection1 = {null};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(DSCompiler.java:282) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = 1;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = dSCompiler;
        compileDerivativesIndirectionMethodArguments[3] = dSCompiler1;
        try {
            compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < vSize; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(valueCompiler.derivativesIndirection[i], 0, derivativesIndirection[i], 0, parameters - 1);
 *  */
    @Test
    public void testCompileDerivativesIndirection_ThrowNullPointerException_3() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection1 = {};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(DSCompiler.java:273) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = 1;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = dSCompiler;
        compileDerivativesIndirectionMethodArguments[3] = dSCompiler1;
        try {
            compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int dSize = derivativeCompiler.derivativesIndirection.length;
 *  */
    @Test
    public void testCompileDerivativesIndirection_ThrowNullPointerException_4() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(DSCompiler.java:267) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = -255;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = dSCompiler;
        compileDerivativesIndirectionMethodArguments[3] = ((Object) null);
        try {
            compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int dSize = derivativeCompiler.derivativesIndirection.length;
 *  */
    @Test
    public void testCompileDerivativesIndirection_ThrowNullPointerException_1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][] derivativesIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "derivativesIndirection", derivativesIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(DSCompiler.java:267) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = 1;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = dSCompiler;
        compileDerivativesIndirectionMethodArguments[3] = dSCompiler1;
        try {
            compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileDerivativesIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler)}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int vSize = valueCompiler.derivativesIndirection.length;
 *  */
    @Test
    public void testCompileDerivativesIndirection_ThrowNullPointerException_5() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileDerivativesIndirection(DSCompiler.java:266) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Method compileDerivativesIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileDerivativesIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz);
        compileDerivativesIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileDerivativesIndirectionMethodArguments = new java.lang.Object[4];
        compileDerivativesIndirectionMethodArguments[0] = -255;
        compileDerivativesIndirectionMethodArguments[1] = -255;
        compileDerivativesIndirectionMethodArguments[2] = dSCompiler;
        compileDerivativesIndirectionMethodArguments[3] = ((Object) null);
        try {
            compileDerivativesIndirectionMethod.invoke(null, compileDerivativesIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compileMultiplicationIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, [I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order == 0): True}
 * @utbot.returnsFrom {@code return new int[][][] { { { 1, 0, 0 } } };}
 *  */
    @Test
    public void testCompileMultiplicationIndirection_OrderEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = 0;
        compileMultiplicationIndirectionMethodArguments[2] = ((Object) null);
        compileMultiplicationIndirectionMethodArguments[3] = ((Object) null);
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        int[][][] actual = ((int[][][]) compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments));
        
        int[][][] expected = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {1, 0, 0};
        intArray[0] = intArray1;
        expected[0] = intArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.executesCondition {@code (parameters == 0): True}
 * @utbot.returnsFrom {@code return new int[][][] { { { 1, 0, 0 } } };}
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ParametersEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = 0;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = ((Object) null);
        compileMultiplicationIndirectionMethodArguments[3] = ((Object) null);
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        int[][][] actual = ((int[][][]) compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments));
        
        int[][][] expected = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {1, 0, 0};
        intArray[0] = intArray1;
        expected[0] = intArray;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.returnsFrom {@code return multIndirection;}
 *  */
    @Test
    public void testCompileMultiplicationIndirection_OrderNotEqualsZero() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = {};
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        int[][][] actual = ((int[][][]) compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments));
        
        int[][][] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.executesCondition {@code (parameters == 0): False}
 * @utbot.executesCondition {@code (order == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.returnsFrom {@code return multIndirection;}
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ListToArray() throws Exception  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = new int[1][][];
        int[][] intArray = {};
        multIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        int[][][] actual = ((int[][][]) compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments));
        
        int[][][] expected = new int[1][][];
        int[][] intArray1 = {};
        expected[0] = intArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compileMultiplicationIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, [I)
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: row.add(new int[] { dRow[j][0], lowerIndirection[dRow[j][1]], vSize + dRow[j][2] });
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {0, 1073741824};
        intArray[0] = intArray1;
        multIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        int[] intArray2 = {-255};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:360) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) intArray2);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: row.add(new int[] { dRow[j][0], lowerIndirection[dRow[j][1]], vSize + dRow[j][2] });
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {0, 0};
        intArray[0] = intArray1;
        multIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        int[] intArray2 = {-255};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:360) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = 1;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) intArray2);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: row.add(new int[] { dRow[j][0], vSize + dRow[j][1], lowerIndirection[dRow[j][2]] });
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = new int[11];
        intArray1[2] = Integer.MIN_VALUE;
        intArray1[3] = 3;
        intArray1[4] = 3;
        intArray1[5] = 3;
        intArray1[6] = 3;
        intArray1[7] = 3;
        intArray1[8] = 3;
        intArray1[9] = 3;
        intArray1[10] = 3;
        intArray[0] = intArray1;
        multIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        int[] intArray2 = {-255};
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:361) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) intArray2);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: row.add(new int[] { dRow[j][0], lowerIndirection[dRow[j][1]], vSize + dRow[j][2] });
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {};
        intArray[0] = intArray1;
        multIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:360) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: row.add(new int[] { dRow[j][0], lowerIndirection[dRow[j][1]], vSize + dRow[j][2] });
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {0};
        intArray[0] = intArray1;
        multIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:360) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int vSize = valueCompiler.multIndirection.length;
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:350) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = ((Object) null);
        compileMultiplicationIndirectionMethodArguments[3] = ((Object) null);
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int dSize = derivativeCompiler.multIndirection.length;
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowNullPointerException_2() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:351) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = ((Object) null);
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: row.add(new int[] { dRow[j][0], lowerIndirection[dRow[j][1]], vSize + dRow[j][2] });
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowNullPointerException_4() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = new int[1][][];
        int[][] intArray = {null};
        multIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:360) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dSize; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: row.add(new int[] { dRow[j][0], lowerIndirection[dRow[j][1]], vSize + dRow[j][2] });
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowNullPointerException_5() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = new int[1][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = {0, 0};
        intArray[0] = intArray1;
        multIndirection1[0] = intArray;
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:360) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int vSize = valueCompiler.multIndirection.length;
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowNullPointerException_1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:350) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = 8;
        compileMultiplicationIndirectionMethodArguments[1] = -254;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = ((Object) null);
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link DSCompiler}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.analysis.differentiation.DSCompiler#compileMultiplicationIndirection(int,int,org.apache.commons.math3.analysis.differentiation.DSCompiler,org.apache.commons.math3.analysis.differentiation.DSCompiler,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int dSize = derivativeCompiler.multIndirection.length;
 *  */
    @Test
    public void testCompileMultiplicationIndirection_ThrowNullPointerException_3() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:351) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArrayType = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArrayType);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = -255;
        compileMultiplicationIndirectionMethodArguments[1] = -255;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) null);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compileMultiplicationIndirection(int, int, org.apache.commons.math3.analysis.differentiation.DSCompiler, org.apache.commons.math3.analysis.differentiation.DSCompiler, [I)
    
    @Test
    public void testCompileMultiplicationIndirection1() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = new int[4][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = new int[11];
        intArray1[0] = 1;
        intArray1[3] = 1073741824;
        intArray1[4] = 1073741824;
        intArray1[5] = 1073741824;
        intArray1[6] = 1073741824;
        intArray1[7] = 1073741824;
        intArray1[8] = 1073741824;
        intArray1[9] = 1073741824;
        intArray1[10] = 1073741824;
        intArray[0] = intArray1;
        multIndirection1[0] = intArray;
        multIndirection1[1] = ((int[][]) null);
        multIndirection1[2] = ((int[][]) null);
        multIndirection1[3] = ((int[][]) null);
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        int[] intArray2 = new int[17];
        intArray2[1] = 286;
        intArray2[2] = 286;
        intArray2[3] = 286;
        intArray2[4] = 286;
        intArray2[5] = 286;
        intArray2[6] = 286;
        intArray2[7] = 286;
        intArray2[8] = 286;
        intArray2[9] = 286;
        intArray2[10] = 286;
        intArray2[11] = 286;
        intArray2[12] = 286;
        intArray2[13] = 286;
        intArray2[14] = 286;
        intArray2[15] = 286;
        intArray2[16] = 286;
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:359) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = 1;
        compileMultiplicationIndirectionMethodArguments[1] = 1;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) intArray2);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompileMultiplicationIndirection2() throws Throwable  {
        DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection = {null};
        setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection);
        DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
        int[][][] multIndirection1 = new int[8][][];
        int[][] intArray = new int[1][];
        int[] intArray1 = new int[11];
        intArray1[0] = 1;
        intArray1[3] = 3;
        intArray1[4] = 3;
        intArray1[5] = 3;
        intArray1[6] = 3;
        intArray1[7] = 3;
        intArray1[8] = 3;
        intArray1[9] = 3;
        intArray1[10] = 3;
        intArray[0] = intArray1;
        multIndirection1[0] = intArray;
        multIndirection1[1] = ((int[][]) null);
        multIndirection1[2] = ((int[][]) null);
        multIndirection1[3] = ((int[][]) null);
        multIndirection1[4] = ((int[][]) null);
        multIndirection1[5] = ((int[][]) null);
        multIndirection1[6] = ((int[][]) null);
        multIndirection1[7] = ((int[][]) null);
        setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "multIndirection", multIndirection1);
        int[] intArray2 = new int[17];
        intArray2[1] = 286;
        intArray2[2] = 286;
        intArray2[3] = 286;
        intArray2[4] = 286;
        intArray2[5] = 286;
        intArray2[6] = 286;
        intArray2[7] = 286;
        intArray2[8] = 286;
        intArray2[9] = 286;
        intArray2[10] = 286;
        intArray2[11] = 286;
        intArray2[12] = 286;
        intArray2[13] = 286;
        intArray2[14] = 286;
        intArray2[15] = 286;
        intArray2[16] = 286;
        
        /* This test fails because method [org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.analysis.differentiation.DSCompiler.compileMultiplicationIndirection(DSCompiler.java:359) */
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class intType = int.class;
        Class intArray2Type = Class.forName("[I");
        Method compileMultiplicationIndirectionMethod = dSCompilerClazz.getDeclaredMethod("compileMultiplicationIndirection", intType, intType, dSCompilerClazz, dSCompilerClazz, intArray2Type);
        compileMultiplicationIndirectionMethod.setAccessible(true);
        java.lang.Object[] compileMultiplicationIndirectionMethodArguments = new java.lang.Object[5];
        compileMultiplicationIndirectionMethodArguments[0] = 1;
        compileMultiplicationIndirectionMethodArguments[1] = 1;
        compileMultiplicationIndirectionMethodArguments[2] = dSCompiler;
        compileMultiplicationIndirectionMethodArguments[3] = dSCompiler1;
        compileMultiplicationIndirectionMethodArguments[4] = ((Object) intArray2);
        try {
            compileMultiplicationIndirectionMethod.invoke(null, compileMultiplicationIndirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields706828971480200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields706828971480200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass706828971485500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields706828971480200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass706828971485500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields706828973899200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields706828973899200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass706828973901200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields706828973899200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass706828973901200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields706828974386500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields706828974386500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass706828974388300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields706828974386500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass706828974388300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields706828974529700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields706828974529700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass706828974530300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields706828974529700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass706828974530300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

