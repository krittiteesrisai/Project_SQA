package org.apache.commons.math3.optimization.direct;

import org.junit.Test;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import java.lang.reflect.Method;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import java.util.List;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static java.lang.reflect.Array.get;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class org_apache_commons_math3_optimization_direct_CMAESOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sqrt(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSqrt_MathSqrt() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", openMapRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = openMapRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) sqrtMethod.invoke(null, sqrtMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sqrt(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSqrt_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(CMAESOptimizer.java:1049) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", openMapRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = openMapRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSqrt_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(CMAESOptimizer.java:1049) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", array2DRowRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = array2DRowRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSqrt_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(CMAESOptimizer.java:1052) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", openMapRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = openMapRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSqrt_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(CMAESOptimizer.java:1052) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", openMapRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = openMapRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = Math.sqrt(m.getEntry(r, c));
 *  */
    @Test
    public void testSqrt_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(CMAESOptimizer.java:1052) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", openMapRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = openMapRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = Math.sqrt(m.getEntry(r, c));
 *  */
    @Test
    public void testSqrt_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {79, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(CMAESOptimizer.java:1052) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", openMapRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = openMapRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSqrt_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(CMAESOptimizer.java:1049) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", realMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = ((Object) null);
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSqrt_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(CMAESOptimizer.java:1052) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", openMapRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = openMapRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSqrt_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(CMAESOptimizer.java:1052) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", openMapRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = openMapRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sqrt(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSqrt_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", openMapRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = openMapRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSqrt_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", openMapRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = openMapRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSqrt_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", array2DRowRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = array2DRowRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSqrt_ThrowNoDataException_3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", array2DRowRealMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = array2DRowRealMatrix;
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method sqrt(org.apache.commons.math3.linear.RealMatrix)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
     */
    @Test
    public void testSqrtThrowsNPE() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(CMAESOptimizer.java:1049) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sqrtMethod = cMAESOptimizerClazz.getDeclaredMethod("sqrt", realMatrixType);
        sqrtMethod.setAccessible(true);
        java.lang.Object[] sqrtMethodArguments = new java.lang.Object[1];
        sqrtMethodArguments[0] = ((Object) null);
        try {
            sqrtMethod.invoke(null, sqrtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.log
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method log(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testLog_MathLog() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", openMapRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = openMapRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) logMethod.invoke(null, logMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method log(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testLog_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.log] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(CMAESOptimizer.java:1034) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", openMapRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = openMapRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(CMAESOptimizer.java:1034) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", array2DRowRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = array2DRowRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(CMAESOptimizer.java:1037) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", openMapRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = openMapRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(CMAESOptimizer.java:1037) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", openMapRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = openMapRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = Math.log(m.getEntry(r, c));
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(CMAESOptimizer.java:1037) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", openMapRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = openMapRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = Math.log(m.getEntry(r, c));
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {79, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(CMAESOptimizer.java:1037) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", openMapRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = openMapRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testLog_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.log] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(CMAESOptimizer.java:1034) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", realMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = ((Object) null);
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testLog_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.log] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(CMAESOptimizer.java:1037) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", openMapRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = openMapRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testLog_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.log] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(CMAESOptimizer.java:1037) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", openMapRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = openMapRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method log(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testLog_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", openMapRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = openMapRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testLog_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", openMapRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = openMapRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testLog_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method logMethod = cMAESOptimizerClazz.getDeclaredMethod("log", array2DRowRealMatrixType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[1];
        logMethodArguments[0] = array2DRowRealMatrix;
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(double[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", doubleArrayType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(double[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.length; r++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_MinLessOrEqualROfM() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {1.7976931348623157E308};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", doubleArrayType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(double[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.length; r++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_MinGreaterThanROfM() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", doubleArrayType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method min([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int r = 0; r < m.length; r++)
 *  */
    @Test
    public void testMin_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.min] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(CMAESOptimizer.java:1310) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", doubleArrayType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = ((Object) null);
        try {
            minMethod.invoke(null, minMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(double[])}
     */
    @Test
    public void testMinReturnsInfinityWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {java.lang.Double.NaN, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", doubleArrayType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IterateForLoop() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IterateForLoop_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", array2DRowRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IterateForLoop_2() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", array2DRowRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IterateForLoop_3() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", array2DRowRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IterateForLoop_4() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", array2DRowRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(1.7976931348623157E308, actual, 1.0E-6);
        
        double[][] array2DRowRealMatrixData = ((double[][]) getFieldValue(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalArray2DRowRealMatrixData0 = ((double[]) get(array2DRowRealMatrixData, 0));
        
        assertNull(finalArray2DRowRealMatrixData0);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_MinLessOrEqualE() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 1.7976931348623157E308);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_MinGreaterThanE() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(4.9E-324, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_MinLessOrEqualE_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {1.7976931348623157E308};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_MinLessOrEqualE_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 1.7976931348623157E308};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        org.junit.Assert.assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method min(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMin_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.min] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(CMAESOptimizer.java:1281) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        try {
            minMethod.invoke(null, minMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMin_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.min] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(CMAESOptimizer.java:1281) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        try {
            minMethod.invoke(null, minMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMin_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.min] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(CMAESOptimizer.java:1281) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        try {
            minMethod.invoke(null, minMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMin_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.min] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(CMAESOptimizer.java:1281) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        try {
            minMethod.invoke(null, minMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int r = 0; r < m.getRowDimension(); r++)
 *  */
    @Test
    public void testMin_ThrowNullPointerException1() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.min] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(CMAESOptimizer.java:1279) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", realMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = ((Object) null);
        try {
            minMethod.invoke(null, minMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMin_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.min] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(CMAESOptimizer.java:1281) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        try {
            minMethod.invoke(null, minMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method min(org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testMin1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.min] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(CMAESOptimizer.java:1281) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        try {
            minMethod.invoke(null, minMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMin2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.min] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(CMAESOptimizer.java:1281) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        try {
            minMethod.invoke(null, minMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method min(org.apache.commons.math3.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testMin3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 65537);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        try {
            minMethod.invoke(null, minMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(double[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", doubleArrayType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(double[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.length; r++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_MaxGreaterOrEqualROfM() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {-1.7976931348623157E308};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", doubleArrayType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(double[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.length; r++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_MaxLessThanROfM() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", doubleArrayType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method max([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int r = 0; r < m.length; r++)
 *  */
    @Test
    public void testMax_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.max] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(CMAESOptimizer.java:1296) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", doubleArrayType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = ((Object) null);
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(double[])}
     */
    @Test
    public void testMaxWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {java.lang.Double.NaN, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", doubleArrayType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IterateForLoop() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IterateForLoop_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", array2DRowRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IterateForLoop_2() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", array2DRowRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IterateForLoop_3() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", array2DRowRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IterateForLoop_4() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", array2DRowRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
        
        double[][] array2DRowRealMatrixData = ((double[][]) getFieldValue(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalArray2DRowRealMatrixData0 = ((double[]) get(array2DRowRealMatrixData, 0));
        
        assertNull(finalArray2DRowRealMatrixData0);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_MaxGreaterOrEqualE() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -1.7976931348623157E308);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_MaxLessThanE() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(4.9E-324, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_MaxGreaterOrEqualE_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {-1.7976931348623157E308};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_MaxGreaterOrEqualE_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, -1.7976931348623157E308};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method max(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMax_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.max] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(CMAESOptimizer.java:1264) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMax_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.max] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(CMAESOptimizer.java:1264) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMax_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.max] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(CMAESOptimizer.java:1264) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMax_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.max] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(CMAESOptimizer.java:1264) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int r = 0; r < m.getRowDimension(); r++)
 *  */
    @Test
    public void testMax_ThrowNullPointerException1() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.max] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(CMAESOptimizer.java:1262) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", realMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = ((Object) null);
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMax_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.max] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(CMAESOptimizer.java:1264) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMax_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.max] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(CMAESOptimizer.java:1264) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method max(org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testMax1() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.max] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:304)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(CMAESOptimizer.java:1264) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", array2DRowRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = array2DRowRealMatrix;
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMax2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.max] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method max(org.apache.commons.math3.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testMax3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 65537);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, -1.7976931348623157E308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testMax4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 65537);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        try {
            maxMethod.invoke(null, maxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#reverse(int[])}
 * @utbot.returnsFrom {@code return reverse;}
 *  */
    @Test
    public void testReverse_ReturnReverse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method reverseMethod = cMAESOptimizerClazz.getDeclaredMethod("reverse", intArrayType);
        reverseMethod.setAccessible(true);
        java.lang.Object[] reverseMethodArguments = new java.lang.Object[1];
        reverseMethodArguments[0] = ((Object) intArray);
        int[] actual = ((int[]) reverseMethod.invoke(null, reverseMethodArguments));
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#reverse(int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < indices.length; i++)} once
 * @utbot.returnsFrom {@code return reverse;}
 *  */
    @Test
    public void testReverse_IterateForLoop() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {1};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method reverseMethod = cMAESOptimizerClazz.getDeclaredMethod("reverse", intArrayType);
        reverseMethod.setAccessible(true);
        java.lang.Object[] reverseMethodArguments = new java.lang.Object[1];
        reverseMethodArguments[0] = ((Object) intArray);
        int[] actual = ((int[]) reverseMethod.invoke(null, reverseMethodArguments));
        
        int[] expected = {1};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reverse([I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#reverse(int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int[] reverse = new int[indices.length];
 *  */
    @Test
    public void testReverse_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.reverse] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.reverse(CMAESOptimizer.java:1335) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method reverseMethod = cMAESOptimizerClazz.getDeclaredMethod("reverse", intArrayType);
        reverseMethod.setAccessible(true);
        java.lang.Object[] reverseMethodArguments = new java.lang.Object[1];
        reverseMethodArguments[0] = ((Object) null);
        try {
            reverseMethod.invoke(null, reverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reverse([I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#reverse(int[])}
     */
    @Test
    public void testReverseWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {0, -1, Integer.MAX_VALUE};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method reverseMethod = cMAESOptimizerClazz.getDeclaredMethod("reverse", intArrayType);
        reverseMethod.setAccessible(true);
        java.lang.Object[] reverseMethodArguments = new java.lang.Object[1];
        reverseMethodArguments[0] = ((Object) intArray);
        int[] actual = ((int[]) reverseMethod.invoke(null, reverseMethodArguments));
        
        int[] expected = {Integer.MAX_VALUE, -1, 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.sequence
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sequence(double, double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sequence(double,double,double)}
     */
    @Test(expected = NoDataException.class)
    public void testSequenceThrowsNDEWithCornerCases() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleType = double.class;
        Method sequenceMethod = cMAESOptimizerClazz.getDeclaredMethod("sequence", doubleType, doubleType, doubleType);
        sequenceMethod.setAccessible(true);
        java.lang.Object[] sequenceMethodArguments = new java.lang.Object[3];
        sequenceMethodArguments[0] = java.lang.Double.NEGATIVE_INFINITY;
        sequenceMethodArguments[1] = 1.0;
        sequenceMethodArguments[2] = java.lang.Double.NaN;
        try {
            sequenceMethod.invoke(null, sequenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.push
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method push([D, double)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#push(double[],double)}
 *  */
    @Test
    public void testPush() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method pushMethod = cMAESOptimizerClazz.getDeclaredMethod("push", doubleArrayType, doubleType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[2];
        pushMethodArguments[0] = ((Object) doubleArray);
        pushMethodArguments[1] = java.lang.Double.NaN;
        pushMethod.invoke(null, pushMethodArguments);
        
        double finalDoubleArray0 = doubleArray[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray0, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#push(double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = vals.length - 1; i > 0; i--)} once
 *  */
    @Test
    public void testPush_IterateForLoop() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, 0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method pushMethod = cMAESOptimizerClazz.getDeclaredMethod("push", doubleArrayType, doubleType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[2];
        pushMethodArguments[0] = ((Object) doubleArray);
        pushMethodArguments[1] = java.lang.Double.NaN;
        pushMethod.invoke(null, pushMethodArguments);
        
        double finalDoubleArray0 = doubleArray[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method push([D, double)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#push(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: vals[0] = val;
 *  */
    @Test
    public void testPush_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.push] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.push(CMAESOptimizer.java:816) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method pushMethod = cMAESOptimizerClazz.getDeclaredMethod("push", doubleArrayType, doubleType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[2];
        pushMethodArguments[0] = ((Object) doubleArray);
        pushMethodArguments[1] = java.lang.Double.NaN;
        try {
            pushMethod.invoke(null, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#push(double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = vals.length - 1; i > 0; i--)
 *  */
    @Test
    public void testPush_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.push] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.push(CMAESOptimizer.java:813) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method pushMethod = cMAESOptimizerClazz.getDeclaredMethod("push", doubleArrayType, doubleType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[2];
        pushMethodArguments[0] = ((Object) null);
        pushMethodArguments[1] = java.lang.Double.NaN;
        try {
            pushMethod.invoke(null, pushMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method push([D, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#push(double[],double)}
     */
    @Test
    public void testPushWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method pushMethod = cMAESOptimizerClazz.getDeclaredMethod("push", doubleArrayType, doubleType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[2];
        pushMethodArguments[0] = ((Object) doubleArray);
        pushMethodArguments[1] = 1.1235582092889477E307;
        pushMethod.invoke(null, pushMethodArguments);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        double finalDoubleArray2 = doubleArray[2];
        
        org.junit.Assert.assertEquals(1.1235582092889477E307, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalDoubleArray1, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, finalDoubleArray2, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testDivide_RealMatrixGetEntry() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        data[0] = values;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = array2DRowRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) divideMethod.invoke(null, divideMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        double[] doubleArray = {java.lang.Double.NaN};
        data1[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data1);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testDivide_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1094) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testDivide_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1094) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", array2DRowRealMatrixType, array2DRowRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = array2DRowRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test
    public void testDivide_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1097) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test
    public void testDivide_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1097) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test
    public void testDivide_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1097) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test
    public void testDivide_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1097) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testDivide_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1094) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", realMatrixType, realMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = ((Object) null);
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1097) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1097) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1097) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1097) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test
    public void testDivide_ThrowNullPointerException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1097) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDivide_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDivide_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDivide_ThrowOutOfRangeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = openMapRealMatrix1;
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDivide_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", array2DRowRealMatrixType, array2DRowRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = array2DRowRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDivide_ThrowNoDataException_3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", array2DRowRealMatrixType, array2DRowRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = array2DRowRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDivide_ThrowOutOfRangeException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = array2DRowRealMatrix;
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testDivide1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDivide2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(CMAESOptimizer.java:1097) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", array2DRowRealMatrixType, array2DRowRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = array2DRowRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDivide3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = array2DRowRealMatrix;
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    @Test(expected = NoDataException.class)
    public void testDivide4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[5][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", array2DRowRealMatrixType, array2DRowRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = array2DRowRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testDivide5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 79, 79, 79, 79, 79, 79, 79,
            79
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = array2DRowRealMatrix;
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testDivide6() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = ((Object) null);
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.square
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method square(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSquare_IterateForLoop_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) squareMethod.invoke(null, squareMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSquare_IterateForLoop_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) squareMethod.invoke(null, squareMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSquare_IterateForLoop() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) squareMethod.invoke(null, squareMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method square(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSquare_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1063) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSquare_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1063) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", array2DRowRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = array2DRowRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testSquare_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1066) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testSquare_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1066) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testSquare_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1066) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testSquare_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1066) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSquare_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1063) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", realMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = ((Object) null);
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testSquare_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1066) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testSquare_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1066) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method square(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSquare_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSquare_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSquare_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", array2DRowRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = array2DRowRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSquare_ThrowNoDataException_3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", array2DRowRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = array2DRowRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method square(org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testSquare1() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:304)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1066) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", array2DRowRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = array2DRowRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSquare2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 10);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSquare3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.square] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method square(org.apache.commons.math3.linear.RealMatrix)
    
    @Test(expected = NoDataException.class)
    public void testSquare4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", array2DRowRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = array2DRowRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method square(org.apache.commons.math3.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testSquare5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareMethod = cMAESOptimizerClazz.getDeclaredMethod("square", openMapRealMatrixType);
        squareMethod.setAccessible(true);
        java.lang.Object[] squareMethodArguments = new java.lang.Object[1];
        squareMethodArguments[0] = openMapRealMatrix;
        try {
            squareMethod.invoke(null, squareMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.times
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTimes_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1079) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTimes_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1079) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", array2DRowRealMatrixType, array2DRowRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = array2DRowRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test
    public void testTimes_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1082) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test
    public void testTimes_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1082) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test
    public void testTimes_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1082) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test
    public void testTimes_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1082) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTimes_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1079) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", realMatrixType, realMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = ((Object) null);
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test
    public void testTimes_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1082) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test
    public void testTimes_ThrowNullPointerException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1082) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test
    public void testTimes_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1082) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test
    public void testTimes_ThrowNullPointerException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1082) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test
    public void testTimes_ThrowNullPointerException_5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1082) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTimes_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTimes_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testTimes_ThrowOutOfRangeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = openMapRealMatrix1;
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTimes_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", array2DRowRealMatrixType, array2DRowRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = array2DRowRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTimes_ThrowNoDataException_3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", array2DRowRealMatrixType, array2DRowRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = array2DRowRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testTimes_ThrowOutOfRangeException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = array2DRowRealMatrix;
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, c) * n.getEntry(r, c);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testTimes_ThrowOutOfRangeException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = array2DRowRealMatrix;
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testTimes1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 4);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTimes2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(CMAESOptimizer.java:1082) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", array2DRowRealMatrixType, array2DRowRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = array2DRowRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTimes3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.times] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = openMapRealMatrix;
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    @Test(expected = NoDataException.class)
    public void testTimes4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[5][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", array2DRowRealMatrixType, array2DRowRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = array2DRowRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testTimes5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 79, 79, 79, 79, 79, 79,
            79, 79
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = openMapRealMatrix1;
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testTimes6() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = ((Object) null);
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testTimes7() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 10);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        data[0] = values;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method timesMethod = cMAESOptimizerClazz.getDeclaredMethod("times", openMapRealMatrixType, openMapRealMatrixType);
        timesMethod.setAccessible(true);
        java.lang.Object[] timesMethodArguments = new java.lang.Object[2];
        timesMethodArguments[0] = openMapRealMatrix;
        timesMethodArguments[1] = array2DRowRealMatrix;
        try {
            timesMethod.invoke(null, timesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkParameters();
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] lowerBound = {java.lang.Double.POSITIVE_INFINITY};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {1.93234463087914E-231};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters(CMAESOptimizer.java:512)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize(CMAESOptimizer.java:356) */
        cMAESOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#doOptimize()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getGoalType()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.GoalType#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: isMinimize = getGoalType().equals(GoalType.MINIMIZE);
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] inputSigma = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", inputSigma);
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", lowerBound);
        double[] start = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize(CMAESOptimizer.java:358) */
        cMAESOptimizer.doOptimize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#doOptimize()}
 * @utbot.invokes org.apache.commons.math3.optimization.direct.CMAESOptimizer#checkParameters()
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkParameters();
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDoOptimize_ThrowDimensionMismatchException() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] inputSigma = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", inputSigma);
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {1.491668146261748E-154, 3.31561842E-316};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        cMAESOptimizer.doOptimize();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method doOptimize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#doOptimize()}
     */
    @Test
    public void testDoOptimizeThrowsNPE() {
        CMAESOptimizer cMAESOptimizer = new CMAESOptimizer();
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getStartPoint(BaseAbstractMultivariateOptimizer.java:162)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters(CMAESOptimizer.java:505)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize(CMAESOptimizer.java:356) */
        cMAESOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doOptimize()
    
    @Test
    public void testDoOptimize1() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] lowerBound = {2.652494739E-315};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = new double[20];
        start[0] = 4.345847379897E-311;
        start[1] = 1.2882297539194267E-231;
        start[2] = 1.2882300610573341E-231;
        start[4] = 2.2250738585072014E-308;
        start[5] = 2.590327E-318;
        start[7] = 1.265E-321;
        start[8] = 2.225209666237823E-308;
        start[10] = 2.0E-323;
        start[11] = 3.785766995733679E-270;
        start[13] = 1.295163E-318;
        start[14] = 2.652494739E-315;
        start[16] = 4.9E-324;
        start[18] = 2.590327E-318;
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters(CMAESOptimizer.java:522)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize(CMAESOptimizer.java:356) */
        cMAESOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize2() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] inputSigma = {-0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", inputSigma);
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {6.953355807835E-310};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize(CMAESOptimizer.java:358) */
        cMAESOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testDoOptimize3() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] lowerBound = {java.lang.Double.NEGATIVE_INFINITY};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {7.405045801111966E-304};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        cMAESOptimizer.doOptimize();
    }
    
    @Test(expected = NoDataException.class)
    public void testDoOptimize4() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] inputSigma = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", inputSigma);
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        GoalType goal = GoalType.MAXIMIZE;
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "goal", goal);
        double[] start = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        cMAESOptimizer.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initializeCMA([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < guess.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: boundaries[1][i] - boundaries[0][i]
 *  */
    @Test
    public void testInitializeCMA_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[][] boundaries = {null};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "boundaries", boundaries);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "dimension", -255);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:575) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < guess.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: boundaries[1][i] - boundaries[0][i]
 *  */
    @Test
    public void testInitializeCMA_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[][] boundaries = new double[2][];
        double[] doubleArray = {};
        boundaries[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        boundaries[1] = doubleArray1;
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "boundaries", boundaries);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "dimension", -255);
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:575) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArray2Type = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArray2Type);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray2);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < guess.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: inputSigma[i]
 *  */
    @Test
    public void testInitializeCMA_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[][] boundaries = new double[2][];
        double[] doubleArray = {0.0};
        boundaries[0] = doubleArray;
        boundaries[1] = doubleArray;
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "boundaries", boundaries);
        double[] inputSigma = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", inputSigma);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "dimension", -255);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:576) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArray1Type);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray1);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < guess.length; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: boundaries[1][i] - boundaries[0][i]
 *  */
    @Test
    public void testInitializeCMA_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[][] boundaries = new double[2][];
        double[] doubleArray = {0.0};
        boundaries[0] = doubleArray;
        boundaries[1] = doubleArray;
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "boundaries", boundaries);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", doubleArray);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "dimension", -255);
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:575) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArray1Type);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray1);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < guess.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: inputSigma[i]
 *  */
    @Test
    public void testInitializeCMA_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] inputSigma = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", inputSigma);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "dimension", -255);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:576) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] sigmaArray = new double[guess.length][1];
 *  */
    @Test
    public void testInitializeCMA_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "lambda", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:573) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) null);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] sigmaArray = new double[guess.length][1];
 *  */
    @Test
    public void testInitializeCMA_ThrowNullPointerException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "dimension", -255);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:573) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) null);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < guess.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boundaries[1][i] - boundaries[0][i]
 *  */
    @Test
    public void testInitializeCMA_ThrowNullPointerException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[][] boundaries = {
            null,
            null
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "boundaries", boundaries);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "dimension", -255);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:575) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < guess.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boundaries[1][i] - boundaries[0][i]
 *  */
    @Test
    public void testInitializeCMA_ThrowNullPointerException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[][] boundaries = new double[2][];
        boundaries[0] = ((double[]) null);
        double[] doubleArray = {0.0};
        boundaries[1] = doubleArray;
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "boundaries", boundaries);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "dimension", -255);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:575) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArray1Type);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray1);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initializeCMA([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link java.lang.Math#log(double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: RealMatrix insigma = new Array2DRowRealMatrix(sigmaArray, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testInitializeCMA_ThrowNoDataException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "dimension", -255);
        double[] doubleArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method initializeCMA([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#initializeCMA(double[])}
     */
    @Test
    public void testInitializeCMAThrowsNASEWithNonEmptyPrimitiveArray() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = new CMAESOptimizer();
        double[] doubleArray = {2.0, 0.0, 0.3};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.NegativeArraySizeException: -1073741822]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sequence(CMAESOptimizer.java:1247)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:590) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method initializeCMA([D)
    
    @Test
    public void testInitializeCMA1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "lambda", -2147483647);
        double[] inputSigma = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", inputSigma);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.NegativeArraySizeException: -1073741822]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sequence(CMAESOptimizer.java:1247)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:590) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInitializeCMA2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "lambda", -2147483647);
        double[][] boundaries = new double[10][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        boundaries[0] = doubleArray;
        boundaries[1] = doubleArray;
        boundaries[2] = ((double[]) null);
        boundaries[3] = ((double[]) null);
        boundaries[4] = ((double[]) null);
        boundaries[5] = ((double[]) null);
        boundaries[6] = ((double[]) null);
        boundaries[7] = ((double[]) null);
        boundaries[8] = ((double[]) null);
        boundaries[9] = ((double[]) null);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "boundaries", boundaries);
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.NegativeArraySizeException: -1073741822]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sequence(CMAESOptimizer.java:1247)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:590) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArray1Type);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray1);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInitializeCMA3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "lambda", 1);
        double[][] boundaries = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "boundaries", boundaries);
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:575) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initializeCMA([D)
    
    @Test(expected = NoDataException.class)
    public void testInitializeCMA4() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "lambda", 1);
        double[][] boundaries = new double[10][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        boundaries[0] = doubleArray;
        boundaries[1] = doubleArray;
        boundaries[2] = ((double[]) null);
        boundaries[3] = ((double[]) null);
        boundaries[4] = ((double[]) null);
        boundaries[5] = ((double[]) null);
        boundaries[6] = ((double[]) null);
        boundaries[7] = ((double[]) null);
        boundaries[8] = ((double[]) null);
        boundaries[9] = ((double[]) null);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "boundaries", boundaries);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", doubleArray);
        double[] doubleArray1 = {0.0, 0.0, 0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArray1Type);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray1);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoDataException.class)
    public void testInitializeCMA5() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "lambda", 1);
        double[][] boundaries = new double[10][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        boundaries[0] = doubleArray;
        boundaries[1] = doubleArray;
        boundaries[2] = ((double[]) null);
        boundaries[3] = ((double[]) null);
        boundaries[4] = ((double[]) null);
        boundaries[5] = ((double[]) null);
        boundaries[6] = ((double[]) null);
        boundaries[7] = ((double[]) null);
        boundaries[8] = ((double[]) null);
        boundaries[9] = ((double[]) null);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "boundaries", boundaries);
        double[] doubleArray1 = {0.0, 0.0, 0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArray1Type);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray1);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoDataException.class)
    public void testInitializeCMA6() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "lambda", 1);
        double[] inputSigma = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", inputSigma);
        double[] doubleArray = {0.0, 0.0, 0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoDataException.class)
    public void testInitializeCMA7() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "lambda", 1);
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method initializeCMAMethod = cMAESOptimizerClazz.getDeclaredMethod("initializeCMA", doubleArrayType);
        initializeCMAMethod.setAccessible(true);
        java.lang.Object[] initializeCMAMethodArguments = new java.lang.Object[1];
        initializeCMAMethodArguments[0] = ((Object) doubleArray);
        try {
            initializeCMAMethod.invoke(cMAESOptimizer, initializeCMAMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (inputSigma != null): True}
 * @utbot.executesCondition {@code (inputSigma.length != init.length): False}
 *  */
    @Test
    public void testCheckParameters_InputSigmaLengthEqualsInitLength() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] inputSigma = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", inputSigma);
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", inputSigma);
        double[] start = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (inputSigma != null): False}
 *  */
    @Test
    public void testCheckParameters_InputSigmaEqualsNull() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {2.0000000000004547, 2.0722615E-317};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#checkParameters()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getStartPoint()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getLowerBound()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getUpperBound()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < lB.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: !Double.isInfinite(uB[i])
 *  */
    @Test
    public void testCheckParameters_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] lowerBound = {java.lang.Double.POSITIVE_INFINITY};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters(CMAESOptimizer.java:512) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (hasFiniteBounds): False}
 * @utbot.executesCondition {@code (inputSigma != null): True}
 * @utbot.executesCondition {@code (inputSigma.length != init.length): True}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getStartPoint()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getLowerBound()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getUpperBound()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: inputSigma.length != init.length
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testCheckParameters_ThrowDimensionMismatchException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] inputSigma = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "inputSigma", inputSigma);
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {5.180654E-318, 2.2250738585072646E-308};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method checkParameters()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#checkParameters()}
     */
    @Test
    public void testCheckParametersThrowsNPE() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = new CMAESOptimizer();
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer.getStartPoint(BaseAbstractMultivariateOptimizer.java:162)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters(CMAESOptimizer.java:505) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkParameters()
    
    @Test
    public void testCheckParameters1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] lowerBound = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {-0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters(CMAESOptimizer.java:522) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, [I, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovariance(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix,int[],org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (ccov1 + ccovmu > 0): False}
 * @utbot.invokes org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateBD(double)
 *  */
    @Test
    public void testUpdateCovariance_Ccov1PlusCcovmuLessOrEqualZero() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1", 1.999969537486692);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmu", -1.999969537486692);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method updateCovarianceMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovariance", booleanType, realMatrixType, realMatrixType, intArrayType, realMatrixType);
        updateCovarianceMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceMethodArguments = new java.lang.Object[5];
        updateCovarianceMethodArguments[0] = false;
        updateCovarianceMethodArguments[1] = ((Object) null);
        updateCovarianceMethodArguments[2] = ((Object) null);
        updateCovarianceMethodArguments[3] = ((Object) null);
        updateCovarianceMethodArguments[4] = ((Object) null);
        updateCovarianceMethod.invoke(cMAESOptimizer, updateCovarianceMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, [I, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovariance(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix,int[],org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: RealMatrix arpos = bestArx.subtract(repmat(xold, 1, mu)).scalarMultiply(1. / sigma);
 *  */
    @Test
    public void testUpdateCovariance_ThrowNegativeArraySizeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "mu", -255);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1", 1.0000927983821095);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmu", -0.015289091494404966);
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 33686019);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance] produces [java.lang.NegativeArraySizeException: -253]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(CMAESOptimizer.java:1230)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance(CMAESOptimizer.java:706) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method updateCovarianceMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovariance", booleanType, realMatrixType, realMatrixType, intArrayType, realMatrixType);
        updateCovarianceMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceMethodArguments = new java.lang.Object[5];
        updateCovarianceMethodArguments[0] = false;
        updateCovarianceMethodArguments[1] = ((Object) null);
        updateCovarianceMethodArguments[2] = ((Object) null);
        updateCovarianceMethodArguments[3] = ((Object) null);
        updateCovarianceMethodArguments[4] = openMapRealMatrix;
        try {
            updateCovarianceMethod.invoke(cMAESOptimizer, updateCovarianceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovariance(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix,int[],org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: RealMatrix arpos = bestArx.subtract(repmat(xold, 1, mu)).scalarMultiply(1. / sigma);
 *  */
    @Test
    public void testUpdateCovariance_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "mu", -255);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1", java.lang.Double.POSITIVE_INFINITY);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmu", java.lang.Double.POSITIVE_INFINITY);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(CMAESOptimizer.java:1228)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance(CMAESOptimizer.java:706) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method updateCovarianceMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovariance", booleanType, realMatrixType, realMatrixType, intArrayType, realMatrixType);
        updateCovarianceMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceMethodArguments = new java.lang.Object[5];
        updateCovarianceMethodArguments[0] = false;
        updateCovarianceMethodArguments[1] = ((Object) null);
        updateCovarianceMethodArguments[2] = ((Object) null);
        updateCovarianceMethodArguments[3] = ((Object) null);
        updateCovarianceMethodArguments[4] = ((Object) null);
        try {
            updateCovarianceMethod.invoke(cMAESOptimizer, updateCovarianceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, [I, org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testUpdateCovariance1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "mu", 1073741827);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1", -1.1968314472809996E-7);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmu", 1.9999998845555744);
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        BlockRealMatrix blockRealMatrix1 = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        int[] intArray = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1789569711);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(CMAESOptimizer.java:1233)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance(CMAESOptimizer.java:706) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method updateCovarianceMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovariance", booleanType, blockRealMatrixType, blockRealMatrixType, intArrayType, blockRealMatrixType);
        updateCovarianceMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceMethodArguments = new java.lang.Object[5];
        updateCovarianceMethodArguments[0] = false;
        updateCovarianceMethodArguments[1] = blockRealMatrix;
        updateCovarianceMethodArguments[2] = blockRealMatrix1;
        updateCovarianceMethodArguments[3] = ((Object) intArray);
        updateCovarianceMethodArguments[4] = openMapRealMatrix;
        try {
            updateCovarianceMethod.invoke(cMAESOptimizer, updateCovarianceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, [I, org.apache.commons.math3.linear.RealMatrix)
    
    @Test(expected = NoDataException.class)
    public void testUpdateCovariance2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1", -2.65048421335847E-308);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmu", java.lang.Double.POSITIVE_INFINITY);
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        BlockRealMatrix blockRealMatrix1 = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method updateCovarianceMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovariance", booleanType, blockRealMatrixType, blockRealMatrixType, intArrayType, blockRealMatrixType);
        updateCovarianceMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceMethodArguments = new java.lang.Object[5];
        updateCovarianceMethodArguments[0] = false;
        updateCovarianceMethodArguments[1] = blockRealMatrix;
        updateCovarianceMethodArguments[2] = blockRealMatrix1;
        updateCovarianceMethodArguments[3] = ((Object) null);
        updateCovarianceMethodArguments[4] = openMapRealMatrix;
        try {
            updateCovarianceMethod.invoke(cMAESOptimizer, updateCovarianceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoDataException.class)
    public void testUpdateCovariance3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1", 1.5602154346261443E-8);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmu", -8.673617379891924E-19);
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        int[] intArray = {};
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method updateCovarianceMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovariance", booleanType, realMatrixType, realMatrixType, intArrayType, realMatrixType);
        updateCovarianceMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceMethodArguments = new java.lang.Object[5];
        updateCovarianceMethodArguments[0] = false;
        updateCovarianceMethodArguments[1] = ((Object) null);
        updateCovarianceMethodArguments[2] = blockRealMatrix;
        updateCovarianceMethodArguments[3] = ((Object) intArray);
        updateCovarianceMethodArguments[4] = openMapRealMatrix;
        try {
            updateCovarianceMethod.invoke(cMAESOptimizer, updateCovarianceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoDataException.class)
    public void testUpdateCovariance4() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1", 6.519603679855859E229);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmu", -1.3494016584558563E-79);
        int[] intArray = new int[16];
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method updateCovarianceMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovariance", booleanType, realMatrixType, realMatrixType, intArrayType, realMatrixType);
        updateCovarianceMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceMethodArguments = new java.lang.Object[5];
        updateCovarianceMethodArguments[0] = false;
        updateCovarianceMethodArguments[1] = ((Object) null);
        updateCovarianceMethodArguments[2] = ((Object) null);
        updateCovarianceMethodArguments[3] = ((Object) intArray);
        updateCovarianceMethodArguments[4] = array2DRowRealMatrix;
        try {
            updateCovarianceMethod.invoke(cMAESOptimizer, updateCovarianceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoDataException.class)
    public void testUpdateCovariance5() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1", 0.06564336503151982);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmu", 1.9843750002910385);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method updateCovarianceMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovariance", booleanType, realMatrixType, realMatrixType, intArrayType, realMatrixType);
        updateCovarianceMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceMethodArguments = new java.lang.Object[5];
        updateCovarianceMethodArguments[0] = false;
        updateCovarianceMethodArguments[1] = ((Object) null);
        updateCovarianceMethodArguments[2] = ((Object) null);
        updateCovarianceMethodArguments[3] = ((Object) null);
        updateCovarianceMethodArguments[4] = array2DRowRealMatrix;
        try {
            updateCovarianceMethod.invoke(cMAESOptimizer, updateCovarianceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method triu(org.apache.commons.math3.linear.RealMatrix, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testTriu_IterateForLoop_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 0;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) triuMethod.invoke(null, triuMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testTriu_IterateForLoop() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 0;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) triuMethod.invoke(null, triuMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testTriu_IterateForLoop_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 0;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) triuMethod.invoke(null, triuMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method triu(org.apache.commons.math3.linear.RealMatrix, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTriu_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(CMAESOptimizer.java:1124) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = -255;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTriu_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(CMAESOptimizer.java:1124) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", array2DRowRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = array2DRowRealMatrix;
        triuMethodArguments[1] = -255;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m.getEntry(r, c)
 *  */
    @Test
    public void testTriu_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 4);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(CMAESOptimizer.java:1127) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 0;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m.getEntry(r, c)
 *  */
    @Test
    public void testTriu_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(CMAESOptimizer.java:1127) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 0;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m.getEntry(r, c)
 *  */
    @Test
    public void testTriu_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(CMAESOptimizer.java:1127) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 0;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m.getEntry(r, c)
 *  */
    @Test
    public void testTriu_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(CMAESOptimizer.java:1127) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 0;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTriu_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(CMAESOptimizer.java:1124) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", realMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = ((Object) null);
        triuMethodArguments[1] = -255;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: m.getEntry(r, c)
 *  */
    @Test
    public void testTriu_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(CMAESOptimizer.java:1127) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 0;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: m.getEntry(r, c)
 *  */
    @Test
    public void testTriu_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(CMAESOptimizer.java:1127) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 0;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method triu(org.apache.commons.math3.linear.RealMatrix, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTriu_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = -255;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTriu_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = -255;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTriu_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", array2DRowRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = array2DRowRealMatrix;
        triuMethodArguments[1] = -255;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method triu(org.apache.commons.math3.linear.RealMatrix, int)
    
    @Test
    public void testTriu1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 5);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 2147483645;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) triuMethod.invoke(null, triuMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[5][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        data[1] = doubleArray1;
        double[] doubleArray2 = {0.0};
        data[2] = doubleArray2;
        double[] doubleArray3 = {0.0};
        data[3] = doubleArray3;
        double[] doubleArray4 = {0.0};
        data[4] = doubleArray4;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method triu(org.apache.commons.math3.linear.RealMatrix, int)
    
    @Test(timeout = 1000L)
    public void testTriu2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = -3;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testTriu3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[0] = 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[11];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = -3;
        try {
            triuMethod.invoke(null, triuMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateBD
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateBD(double)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateBD(double)}
 * @utbot.executesCondition {@code (ccov1 + ccovmu + negccov > 0): False}
 *  */
    @Test
    public void testUpdateBD_Ccov1PlusCcovmuPlusNegccovLessOrEqualZero() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1", -8.65771068634E-311);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmu", 8.6917611161815E-311);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleType = double.class;
        Method updateBDMethod = cMAESOptimizerClazz.getDeclaredMethod("updateBD", doubleType);
        updateBDMethod.setAccessible(true);
        java.lang.Object[] updateBDMethodArguments = new java.lang.Object[1];
        updateBDMethodArguments[0] = -3.40504298415E-313;
        updateBDMethod.invoke(cMAESOptimizer, updateBDMethodArguments);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method updateBD(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateBD(double)}
     */
    @Test
    public void testUpdateBD() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CMAESOptimizer cMAESOptimizer = new CMAESOptimizer();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleType = double.class;
        Method updateBDMethod = cMAESOptimizerClazz.getDeclaredMethod("updateBD", doubleType);
        updateBDMethod.setAccessible(true);
        java.lang.Object[] updateBDMethodArguments = new java.lang.Object[1];
        updateBDMethodArguments[0] = 1.0;
        updateBDMethod.invoke(cMAESOptimizer, updateBDMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.sortedIndices
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sortedIndices([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sortedIndices(double[])}
 * @utbot.returnsFrom {@code return indices;}
 *  */
    @Test
    public void testSortedIndices_ReturnIndices() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] doubleArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method sortedIndicesMethod = cMAESOptimizerClazz.getDeclaredMethod("sortedIndices", doubleArrayType);
        sortedIndicesMethod.setAccessible(true);
        java.lang.Object[] sortedIndicesMethodArguments = new java.lang.Object[1];
        sortedIndicesMethodArguments[0] = ((Object) doubleArray);
        int[] actual = ((int[]) sortedIndicesMethod.invoke(cMAESOptimizer, sortedIndicesMethodArguments));
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sortedIndices(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < doubles.length; i++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < doubles.length; i++)} once
 * @utbot.returnsFrom {@code return indices;}
 *  */
    @Test
    public void testSortedIndices_CMAESOptimizerAccess$000() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] doubleArray = {0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method sortedIndicesMethod = cMAESOptimizerClazz.getDeclaredMethod("sortedIndices", doubleArrayType);
        sortedIndicesMethod.setAccessible(true);
        java.lang.Object[] sortedIndicesMethodArguments = new java.lang.Object[1];
        sortedIndicesMethodArguments[0] = ((Object) doubleArray);
        int[] actual = ((int[]) sortedIndicesMethod.invoke(cMAESOptimizer, sortedIndicesMethodArguments));
        
        int[] expected = {0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sortedIndices([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sortedIndices(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DoubleIndex[] dis = new DoubleIndex[doubles.length];
 *  */
    @Test
    public void testSortedIndices_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sortedIndices] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sortedIndices(CMAESOptimizer.java:826) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method sortedIndicesMethod = cMAESOptimizerClazz.getDeclaredMethod("sortedIndices", doubleArrayType);
        sortedIndicesMethod.setAccessible(true);
        java.lang.Object[] sortedIndicesMethodArguments = new java.lang.Object[1];
        sortedIndicesMethodArguments[0] = ((Object) null);
        try {
            sortedIndicesMethod.invoke(cMAESOptimizer, sortedIndicesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sortedIndices([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sortedIndices(double[])}
     */
    @Test
    public void testSortedIndicesWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        CMAESOptimizer cMAESOptimizer = new CMAESOptimizer();
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method sortedIndicesMethod = cMAESOptimizerClazz.getDeclaredMethod("sortedIndices", doubleArrayType);
        sortedIndicesMethod.setAccessible(true);
        java.lang.Object[] sortedIndicesMethodArguments = new java.lang.Object[1];
        sortedIndicesMethodArguments[0] = ((Object) doubleArray);
        int[] actual = ((int[]) sortedIndicesMethod.invoke(cMAESOptimizer, sortedIndicesMethodArguments));
        
        int[] expected = {1, 2, 0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method selectColumns(org.apache.commons.math3.linear.RealMatrix, [I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSelectColumns_RealMatrixGetEntry() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) selectColumnsMethod.invoke(null, selectColumnsMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method selectColumns(org.apache.commons.math3.linear.RealMatrix, [I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[m.getRowDimension()][cols.length];
 *  */
    @Test
    public void testSelectColumns_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", Integer.MIN_VALUE);
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1109) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test
    public void testSelectColumns_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1112) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test
    public void testSelectColumns_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 96);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 64);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {95};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 64 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1112) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test
    public void testSelectColumns_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 64);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-64};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {63};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1112) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test
    public void testSelectColumns_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 64);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-857473088, -421696};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {63};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1112) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test
    public void testSelectColumns_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1112) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test
    public void testSelectColumns_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1112) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[m.getRowDimension()][cols.length];
 *  */
    @Test
    public void testSelectColumns_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1109) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) null);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[m.getRowDimension()][cols.length];
 *  */
    @Test
    public void testSelectColumns_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1109) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", realMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = ((Object) null);
        selectColumnsMethodArguments[1] = ((Object) null);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[m.getRowDimension()][cols.length];
 *  */
    @Test
    public void testSelectColumns_ThrowNullPointerException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1109) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", array2DRowRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = array2DRowRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) null);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[m.getRowDimension()][cols.length];
 *  */
    @Test
    public void testSelectColumns_ThrowNullPointerException_3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1109) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", array2DRowRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = array2DRowRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) null);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test
    public void testSelectColumns_ThrowNullPointerException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1112) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test
    public void testSelectColumns_ThrowNullPointerException_5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 32);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {31};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1112) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method selectColumns(org.apache.commons.math3.linear.RealMatrix, [I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSelectColumns_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        int[] intArray = {-255};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSelectColumns_ThrowOutOfRangeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        int[] intArray = {0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSelectColumns_ThrowOutOfRangeException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        int[] intArray = {-1};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSelectColumns_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        int[] intArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSelectColumns_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        int[] intArray = {-255};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", array2DRowRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = array2DRowRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method selectColumns(org.apache.commons.math3.linear.RealMatrix, [I)
    
    @Test
    public void testSelectColumns1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 866232970);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[39];
        keys[0] = 3;
        keys[1] = 3;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 3;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        keys[12] = 3;
        keys[13] = 3;
        keys[14] = 3;
        keys[15] = 3;
        keys[16] = 3;
        keys[17] = 3;
        keys[18] = 3;
        keys[19] = 3;
        keys[20] = 3;
        keys[21] = 3;
        keys[22] = 3;
        keys[23] = 3;
        keys[24] = 3;
        keys[25] = 3;
        keys[26] = 3;
        keys[27] = 3;
        keys[28] = 3;
        keys[29] = 3;
        keys[30] = 3;
        keys[31] = 3;
        keys[33] = 3;
        keys[34] = 3;
        keys[35] = 3;
        keys[37] = 3;
        keys[38] = 3;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[39];
        states[36] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {866232969};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) selectColumnsMethod.invoke(null, selectColumnsMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    @Test
    public void testSelectColumns2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1073741827);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[25];
        keys[16] = 1073741826;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[25];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            java.lang.Byte.MIN_VALUE
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 24);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {1073741826, 0, 0, 0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) selectColumnsMethod.invoke(null, selectColumnsMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method selectColumns(org.apache.commons.math3.linear.RealMatrix, [I)
    
    @Test
    public void testSelectColumns3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 866232970);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[39];
        keys[0] = 3;
        keys[1] = 3;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 3;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        keys[12] = 3;
        keys[13] = 3;
        keys[14] = 3;
        keys[15] = 3;
        keys[16] = 3;
        keys[17] = 3;
        keys[18] = 3;
        keys[19] = 3;
        keys[20] = 3;
        keys[21] = 3;
        keys[22] = 3;
        keys[23] = 3;
        keys[24] = 3;
        keys[25] = 3;
        keys[26] = 3;
        keys[27] = 3;
        keys[28] = 3;
        keys[29] = 3;
        keys[30] = 3;
        keys[31] = 3;
        keys[33] = 3;
        keys[34] = 3;
        keys[35] = 3;
        keys[37] = 3;
        keys[38] = 3;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[39];
        states[36] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {866232969, 3};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1112) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", openMapRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = openMapRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method selectColumns(org.apache.commons.math3.linear.RealMatrix, [I)
    
    @Test(expected = NoDataException.class)
    public void testSelectColumns4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null,
            null
        };
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        int[] intArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", array2DRowRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = array2DRowRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testSelectColumns5() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        int[] intArray = {0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intArrayType = Class.forName("[I");
        Method selectColumnsMethod = cMAESOptimizerClazz.getDeclaredMethod("selectColumns", array2DRowRealMatrixType, intArrayType);
        selectColumnsMethod.setAccessible(true);
        java.lang.Object[] selectColumnsMethodArguments = new java.lang.Object[2];
        selectColumnsMethodArguments[0] = array2DRowRealMatrix;
        selectColumnsMethodArguments[1] = ((Object) intArray);
        try {
            selectColumnsMethod.invoke(null, selectColumnsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sumRows(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSumRows_IterateForLoop() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) sumRowsMethod.invoke(null, sumRowsMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSumRows_IterateForLoop_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) sumRowsMethod.invoke(null, sumRowsMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSumRows_IterateForLoop_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) sumRowsMethod.invoke(null, sumRowsMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSumRows_IterateForLoop_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) sumRowsMethod.invoke(null, sumRowsMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sumRows(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[1][m.getColumnDimension()];
 *  */
    @Test
    public void testSumRows_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(CMAESOptimizer.java:1138) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[][] d = new double[1][m.getColumnDimension()];
 *  */
    @Test
    public void testSumRows_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(CMAESOptimizer.java:1138) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", array2DRowRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = array2DRowRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += m.getEntry(r, c);
 *  */
    @Test
    public void testSumRows_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(CMAESOptimizer.java:1142) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += m.getEntry(r, c);
 *  */
    @Test
    public void testSumRows_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[13];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[4] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 4);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(CMAESOptimizer.java:1142) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += m.getEntry(r, c);
 *  */
    @Test
    public void testSumRows_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(CMAESOptimizer.java:1142) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += m.getEntry(r, c);
 *  */
    @Test
    public void testSumRows_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(CMAESOptimizer.java:1142) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[][] d = new double[1][m.getColumnDimension()];
 *  */
    @Test
    public void testSumRows_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(CMAESOptimizer.java:1138) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", realMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = ((Object) null);
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sum += m.getEntry(r, c);
 *  */
    @Test
    public void testSumRows_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(CMAESOptimizer.java:1142) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sum += m.getEntry(r, c);
 *  */
    @Test
    public void testSumRows_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(CMAESOptimizer.java:1142) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sumRows(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSumRows_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", openMapRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = openMapRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSumRows_ThrowNoDataException_1() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", array2DRowRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = array2DRowRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSumRows_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method sumRowsMethod = cMAESOptimizerClazz.getDeclaredMethod("sumRows", array2DRowRealMatrixType);
        sumRowsMethod.setAccessible(true);
        java.lang.Object[] sumRowsMethodArguments = new java.lang.Object[1];
        sumRowsMethodArguments[0] = array2DRowRealMatrix;
        try {
            sumRowsMethod.invoke(null, sumRowsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.zeros
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zeros(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#zeros(int,int)}
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(n, m);}
 *  */
    @Test
    public void testZeros_Return() throws Exception  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method zerosMethod = cMAESOptimizerClazz.getDeclaredMethod("zeros", intType, intType);
        zerosMethod.setAccessible(true);
        java.lang.Object[] zerosMethodArguments = new java.lang.Object[2];
        zerosMethodArguments[0] = 1;
        zerosMethodArguments[1] = 1;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) zerosMethod.invoke(null, zerosMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method zeros(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#zeros(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: return new Array2DRowRealMatrix(n, m);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testZeros_ThrowNotStrictlyPositiveException() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method zerosMethod = cMAESOptimizerClazz.getDeclaredMethod("zeros", intType, intType);
        zerosMethod.setAccessible(true);
        java.lang.Object[] zerosMethodArguments = new java.lang.Object[2];
        zerosMethodArguments[0] = 1;
        zerosMethodArguments[1] = 0;
        try {
            zerosMethod.invoke(null, zerosMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#zeros(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: return new Array2DRowRealMatrix(n, m);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testZeros_ThrowNotStrictlyPositiveException_1() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method zerosMethod = cMAESOptimizerClazz.getDeclaredMethod("zeros", intType, intType);
        zerosMethod.setAccessible(true);
        java.lang.Object[] zerosMethodArguments = new java.lang.Object[2];
        zerosMethodArguments[0] = 0;
        zerosMethodArguments[1] = -255;
        try {
            zerosMethod.invoke(null, zerosMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method randn(int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.returnsFrom {@code return randn;}
 *  */
    @Test
    public void testRandn_ReturnRandn() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 0;
        double[] actual = ((double[]) randnMethod.invoke(cMAESOptimizer, randnMethodArguments));
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return randn;}
 *  */
    @Test
    public void testRandn_IterateForLoop() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (when(randomMock.nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", randomMock);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        double[] actual = ((double[]) randnMethod.invoke(cMAESOptimizer, randnMethodArguments));
        
        double[] expected = {java.lang.Double.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return randn;}
 *  */
    @Test
    public void testRandn_RandomGeneratorNextGaussian() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well1024a random = ((Well1024a) createInstance("org.apache.commons.math3.random.Well1024a"));
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", 2.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        double[] actual = ((double[]) randnMethod.invoke(cMAESOptimizer, randnMethodArguments));
        
        double[] expected = {2.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
        
        RandomGenerator cMAESOptimizerRandom = ((RandomGenerator) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random"));
        double finalCMAESOptimizerRandomNextGaussian = ((Double) getFieldValue(cMAESOptimizerRandom, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalCMAESOptimizerRandomNextGaussian, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method randn(int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] randn = new double[size];
 *  */
    @Test
    public void testRandn_ThrowNegativeArraySizeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1347) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = -256;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_14() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 8);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:102)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_15() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", Integer.MIN_VALUE);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_12() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_13() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(CMAESOptimizer.java:1349) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method randn1(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testRandn1_IterateForLoop() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (when(randomMock.nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", randomMock);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) randn1Method.invoke(cMAESOptimizer, randn1MethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {java.lang.Double.NaN};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testRandn1_RandomGeneratorNextGaussian() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", -2.0000000000000004);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) randn1Method.invoke(cMAESOptimizer, randn1MethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {-2.0000000000000004};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        RandomGenerator cMAESOptimizerRandom = ((RandomGenerator) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random"));
        double finalCMAESOptimizerRandomNextGaussian = ((Double) getFieldValue(cMAESOptimizerRandom, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalCMAESOptimizerRandomNextGaussian, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method randn1(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[size][popSize];
 *  */
    @Test
    public void testRandn1_ThrowNegativeArraySizeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1360) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = -255;
        randn1MethodArguments[1] = -255;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (when(randomMock.nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", randomMock);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 2;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0, 0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 397 out of bounds for length 2]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:239)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        MersenneTwister random = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(random, "org.apache.commons.math3.random.MersenneTwister", "mti", 8);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:102)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_15() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1073741824);
        int[] iRm1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {536870912};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm1);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:89)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {1073741824};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_12() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {3, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        int[] i3 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", i3);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_13() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {3, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        int[] i2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", i2);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:85)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowArrayIndexOutOfBoundsException_14() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0, 0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {1};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(random, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i1", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i2", iRm2);
        setField(random, "org.apache.commons.math3.random.AbstractWell", "i3", iRm2);
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:101)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(CMAESOptimizer.java:1363) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method randn1(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testRandn1_ThrowNoDataException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 0;
        randn1MethodArguments[1] = 1;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#randn1(int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testRandn1_ThrowNoDataException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method randn1Method = cMAESOptimizerClazz.getDeclaredMethod("randn1", intType, intType);
        randn1Method.setAccessible(true);
        java.lang.Object[] randn1MethodArguments = new java.lang.Object[2];
        randn1MethodArguments[0] = 1;
        randn1MethodArguments[1] = 0;
        try {
            randn1Method.invoke(cMAESOptimizer, randn1MethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method diag(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testDiag_IterateForLoop() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) diagMethod.invoke(null, diagMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testDiag_IterateForLoop_1() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", array2DRowRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = array2DRowRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) diagMethod.invoke(null, diagMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        double[] doubleArray2 = {0.0};
        data1[1] = doubleArray2;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data1);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        double[][] array2DRowRealMatrixData = ((double[][]) getFieldValue(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalArray2DRowRealMatrixData1 = ((double[]) get(array2DRowRealMatrixData, 1));
        
        assertNull(finalArray2DRowRealMatrixData1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method diag(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[m.getRowDimension()][1];
 *  */
    @Test
    public void testDiag_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1162) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[m.getRowDimension()][m.getRowDimension()];
 *  */
    @Test
    public void testDiag_ThrowNegativeArraySizeException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", Integer.MIN_VALUE);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1156) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: m.getColumnDimension() == 1
 *  */
    @Test
    public void testDiag_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1155) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", array2DRowRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = array2DRowRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDiag_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1164) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[i][0] = m.getEntry(i, i);
 *  */
    @Test
    public void testDiag_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1164) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDiag_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1164) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[i][0] = m.getEntry(i, i);
 *  */
    @Test
    public void testDiag_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1164) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[i][0] = m.getEntry(i, i);
 *  */
    @Test
    public void testDiag_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1164) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[i][0] = m.getEntry(i, i);
 *  */
    @Test
    public void testDiag_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1164) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: m.getColumnDimension() == 1
 *  */
    @Test
    public void testDiag_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1155) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", realMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = ((Object) null);
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testDiag_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1164) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testDiag_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1164) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testDiag_ThrowNullPointerException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(CMAESOptimizer.java:1158) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method diag(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDiag_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getRowDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDiag_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", openMapRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = openMapRealMatrix;
        try {
            diagMethod.invoke(null, diagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inverse([I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#inverse(int[])}
 * @utbot.returnsFrom {@code return inverse;}
 *  */
    @Test
    public void testInverse_ReturnInverse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method inverseMethod = cMAESOptimizerClazz.getDeclaredMethod("inverse", intArrayType);
        inverseMethod.setAccessible(true);
        java.lang.Object[] inverseMethodArguments = new java.lang.Object[1];
        inverseMethodArguments[0] = ((Object) intArray);
        int[] actual = ((int[]) inverseMethod.invoke(null, inverseMethodArguments));
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#inverse(int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < indices.length; i++)} once
 * @utbot.returnsFrom {@code return inverse;}
 *  */
    @Test
    public void testInverse_IterateForLoop() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method inverseMethod = cMAESOptimizerClazz.getDeclaredMethod("inverse", intArrayType);
        inverseMethod.setAccessible(true);
        java.lang.Object[] inverseMethodArguments = new java.lang.Object[1];
        inverseMethodArguments[0] = ((Object) intArray);
        int[] actual = ((int[]) inverseMethod.invoke(null, inverseMethodArguments));
        
        int[] expected = {0};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inverse([I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#inverse(int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < indices.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: inverse[indices[i]] = i;
 *  */
    @Test
    public void testInverse_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[] intArray = {2};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse(CMAESOptimizer.java:1325) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method inverseMethod = cMAESOptimizerClazz.getDeclaredMethod("inverse", intArrayType);
        inverseMethod.setAccessible(true);
        java.lang.Object[] inverseMethodArguments = new java.lang.Object[1];
        inverseMethodArguments[0] = ((Object) intArray);
        try {
            inverseMethod.invoke(null, inverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#inverse(int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int[] inverse = new int[indices.length];
 *  */
    @Test
    public void testInverse_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse(CMAESOptimizer.java:1323) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method inverseMethod = cMAESOptimizerClazz.getDeclaredMethod("inverse", intArrayType);
        inverseMethod.setAccessible(true);
        java.lang.Object[] inverseMethodArguments = new java.lang.Object[1];
        inverseMethodArguments[0] = ((Object) null);
        try {
            inverseMethod.invoke(null, inverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method inverse([I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#inverse(int[])}
     */
    @Test
    public void testInverseThrowsAIOOBEWithNonEmptyPrimitiveArray() throws Throwable  {
        int[] intArray = {0, -1, Integer.MAX_VALUE};
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse(CMAESOptimizer.java:1325) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method inverseMethod = cMAESOptimizerClazz.getDeclaredMethod("inverse", intArrayType);
        inverseMethod.setAccessible(true);
        java.lang.Object[] inverseMethodArguments = new java.lang.Object[1];
        inverseMethodArguments[0] = ((Object) intArray);
        try {
            inverseMethod.invoke(null, inverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ones(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#ones(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n; r++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testOnes_ArraysFill() throws Exception  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method onesMethod = cMAESOptimizerClazz.getDeclaredMethod("ones", intType, intType);
        onesMethod.setAccessible(true);
        java.lang.Object[] onesMethodArguments = new java.lang.Object[2];
        onesMethodArguments[0] = 1;
        onesMethodArguments[1] = 1;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) onesMethod.invoke(null, onesMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {1.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ones(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#ones(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testOnes_ThrowNoDataException() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method onesMethod = cMAESOptimizerClazz.getDeclaredMethod("ones", intType, intType);
        onesMethod.setAccessible(true);
        java.lang.Object[] onesMethodArguments = new java.lang.Object[2];
        onesMethodArguments[0] = 0;
        onesMethodArguments[1] = 1;
        try {
            onesMethod.invoke(null, onesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#ones(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testOnes_ThrowNoDataException_1() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method onesMethod = cMAESOptimizerClazz.getDeclaredMethod("ones", intType, intType);
        onesMethod.setAccessible(true);
        java.lang.Object[] onesMethodArguments = new java.lang.Object[2];
        onesMethodArguments[0] = 1;
        onesMethodArguments[1] = 0;
        try {
            onesMethod.invoke(null, onesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ones(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#ones(int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[n][m];
 *  */
    @Test
    public void testOnes_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones(CMAESOptimizer.java:1190) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method onesMethod = cMAESOptimizerClazz.getDeclaredMethod("ones", intType, intType);
        onesMethod.setAccessible(true);
        java.lang.Object[] onesMethodArguments = new java.lang.Object[2];
        onesMethodArguments[0] = 1;
        onesMethodArguments[1] = -255;
        try {
            onesMethod.invoke(null, onesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method eye(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#eye(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n; r++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testEye_RLessThanM() throws Exception  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method eyeMethod = cMAESOptimizerClazz.getDeclaredMethod("eye", intType, intType);
        eyeMethod.setAccessible(true);
        java.lang.Object[] eyeMethodArguments = new java.lang.Object[2];
        eyeMethodArguments[0] = 1;
        eyeMethodArguments[1] = 1;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) eyeMethod.invoke(null, eyeMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {1.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method eye(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#eye(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testEye_ThrowNoDataException() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method eyeMethod = cMAESOptimizerClazz.getDeclaredMethod("eye", intType, intType);
        eyeMethod.setAccessible(true);
        java.lang.Object[] eyeMethodArguments = new java.lang.Object[2];
        eyeMethodArguments[0] = 0;
        eyeMethodArguments[1] = 1;
        try {
            eyeMethod.invoke(null, eyeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#eye(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testEye_ThrowNoDataException_1() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method eyeMethod = cMAESOptimizerClazz.getDeclaredMethod("eye", intType, intType);
        eyeMethod.setAccessible(true);
        java.lang.Object[] eyeMethodArguments = new java.lang.Object[2];
        eyeMethodArguments[0] = 1;
        eyeMethodArguments[1] = 0;
        try {
            eyeMethod.invoke(null, eyeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method eye(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#eye(int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[n][m];
 *  */
    @Test
    public void testEye_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye(CMAESOptimizer.java:1203) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class intType = int.class;
        Method eyeMethod = cMAESOptimizerClazz.getDeclaredMethod("eye", intType, intType);
        eyeMethod.setAccessible(true);
        java.lang.Object[] eyeMethodArguments = new java.lang.Object[2];
        eyeMethodArguments[0] = 1;
        eyeMethodArguments[1] = -255;
        try {
            eyeMethod.invoke(null, eyeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method repmat(org.apache.commons.math3.linear.RealMatrix, int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testRepmat_RealMatrixGetEntry() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = 1;
        repmatMethodArguments[2] = 1;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) repmatMethod.invoke(null, repmatMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method repmat(org.apache.commons.math3.linear.RealMatrix, int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] d = new double[n * rd][m * cd];
 *  */
    @Test
    public void testRepmat_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 325321216);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat] produces [java.lang.NegativeArraySizeException: -1359803904]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(CMAESOptimizer.java:1230) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = -119;
        repmatMethodArguments[2] = -123;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testRepmat_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(CMAESOptimizer.java:1233) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = 1;
        repmatMethodArguments[2] = 1;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testRepmat_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(CMAESOptimizer.java:1233) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = 1;
        repmatMethodArguments[2] = 1;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = mat.getEntry(r % rd, c % cd);
 *  */
    @Test
    public void testRepmat_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(CMAESOptimizer.java:1233) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = 1;
        repmatMethodArguments[2] = 1;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int rd = mat.getRowDimension();
 *  */
    @Test
    public void testRepmat_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(CMAESOptimizer.java:1228) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", realMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = ((Object) null);
        repmatMethodArguments[1] = -255;
        repmatMethodArguments[2] = -255;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testRepmat_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(CMAESOptimizer.java:1233) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = 1;
        repmatMethodArguments[2] = 1;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testRepmat_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(CMAESOptimizer.java:1233) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = 1;
        repmatMethodArguments[2] = 1;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method repmat(org.apache.commons.math3.linear.RealMatrix, int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testRepmat_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -1318335936);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = -255;
        repmatMethodArguments[2] = -239;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = mat.getEntry(r % rd, c % cd);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testRepmat_ThrowOutOfRangeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", -799063683);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 16843009);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = -43;
        repmatMethodArguments[2] = -255;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = mat.getEntry(r % rd, c % cd);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testRepmat_ThrowOutOfRangeException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -799063683);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = 1;
        repmatMethodArguments[2] = -43;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testRepmat_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", -1171354717);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = 11;
        repmatMethodArguments[2] = -255;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 *  */
    @Test
    public void testCopyColumn_IterateForLoop() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = -255;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        copyColumnMethod.invoke(null, copyColumnMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 *  */
    @Test
    public void testCopyColumn_IterateForLoop_1() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", array2DRowRealMatrixType, intType, array2DRowRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = array2DRowRealMatrix;
        copyColumnMethodArguments[1] = -255;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        copyColumnMethod.invoke(null, copyColumnMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 *  */
    @Test
    public void testCopyColumn_IterateForLoop_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", array2DRowRealMatrixType, intType, array2DRowRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = array2DRowRealMatrix;
        copyColumnMethodArguments[1] = -255;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        copyColumnMethod.invoke(null, copyColumnMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 96);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 64);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 64 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 95;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 128);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-128};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 127;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 96);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-96, -96};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 95;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 96);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-96, 0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:357)
            org.apache.commons.math3.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = openMapRealMatrix1;
        copyColumnMethodArguments[3] = 95;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < m1.getRowDimension(); i++)
 *  */
    @Test
    public void testCopyColumn_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1179) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", realMatrixType, intType, realMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = ((Object) null);
        copyColumnMethodArguments[1] = -255;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowNullPointerException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 32);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 31;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowNullPointerException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:215)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowNullPointerException_5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowNullPointerException_7() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:273)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math3.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:231)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = openMapRealMatrix1;
        copyColumnMethodArguments[3] = 0;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test
    public void testCopyColumn_ThrowNullPointerException_6() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math3.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:231)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1180) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = openMapRealMatrix1;
        copyColumnMethodArguments[3] = 0;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testCopyColumn_ThrowOutOfRangeException_5() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", array2DRowRealMatrixType, intType, array2DRowRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = array2DRowRealMatrix;
        copyColumnMethodArguments[1] = -1;
        copyColumnMethodArguments[2] = ((Object) null);
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testCopyColumn_ThrowOutOfRangeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 128);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-128};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 127;
        copyColumnMethodArguments[2] = openMapRealMatrix1;
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testCopyColumn_ThrowOutOfRangeException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = openMapRealMatrix;
        copyColumnMethodArguments[3] = -1;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testCopyColumn_ThrowOutOfRangeException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = array2DRowRealMatrix;
        copyColumnMethodArguments[3] = -255;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testCopyColumn_ThrowOutOfRangeException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = array2DRowRealMatrix;
        copyColumnMethodArguments[3] = -1;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: m2.setEntry(i, col2, m1.getEntry(i, col1));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testCopyColumn_ThrowOutOfRangeException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method copyColumnMethod = cMAESOptimizerClazz.getDeclaredMethod("copyColumn", openMapRealMatrixType, intType, openMapRealMatrixType, intType);
        copyColumnMethod.setAccessible(true);
        java.lang.Object[] copyColumnMethodArguments = new java.lang.Object[4];
        copyColumnMethodArguments[0] = openMapRealMatrix;
        copyColumnMethodArguments[1] = 0;
        copyColumnMethodArguments[2] = array2DRowRealMatrix;
        copyColumnMethodArguments[3] = 0;
        try {
            copyColumnMethod.invoke(null, copyColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowNegativeArraySizeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1321293);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 2147483602);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.NegativeArraySizeException: -1404112196]
            org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(BlockRealMatrix.java:250)
            org.apache.commons.math3.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:103)
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:439)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:646) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2147483646);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1469332000);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:444)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:646) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:444)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:646) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:446)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:646) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        Array2DRowRealMatrix ps = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(ps, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(AbstractRealMatrix.java:127)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:646) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#multiply(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff))
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        OpenMapRealMatrix b = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "B", b);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:155)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:647) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", array2DRowRealMatrixType, array2DRowRealMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = array2DRowRealMatrix;
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:646) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff))
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowNullPointerException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:647) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateEvolutionPaths_ThrowNotStrictlyPositiveException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateEvolutionPaths_ThrowNotStrictlyPositiveException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testUpdateEvolutionPaths_ThrowNumberIsTooLargeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        OpenMapRealMatrix ps = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(ps, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1610612737);
        setField(ps, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1519733429);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff))
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testUpdateEvolutionPaths_ThrowDimensionMismatchException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        OpenMapRealMatrix b = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(b, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "B", b);
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", openMapRealMatrixType, openMapRealMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = openMapRealMatrix;
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateEvolutionPaths_ThrowNotStrictlyPositiveException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        Array2DRowRealMatrix ps = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(ps, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff))
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testUpdateEvolutionPaths_ThrowDimensionMismatchException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[2][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        blocks[1] = ((double[]) null);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        OpenMapRealMatrix b = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(b, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -3);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "B", b);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", blocks);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", array2DRowRealMatrixType, array2DRowRealMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = array2DRowRealMatrix;
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff))
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testUpdateEvolutionPaths_ThrowDimensionMismatchException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        OpenMapRealMatrix b = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(b, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "B", b);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", array2DRowRealMatrixType, array2DRowRealMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = array2DRowRealMatrix;
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: ps = ps.scalarMultiply(1. - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2. - cs) * mueff)));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateEvolutionPaths_ThrowNotStrictlyPositiveException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cs", 0.0);
        Array2DRowRealMatrix ps = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ps", ps);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateEvolutionPathsMethod = cMAESOptimizerClazz.getDeclaredMethod("updateEvolutionPaths", realMatrixType, realMatrixType);
        updateEvolutionPathsMethod.setAccessible(true);
        java.lang.Object[] updateEvolutionPathsMethodArguments = new java.lang.Object[2];
        updateEvolutionPathsMethodArguments[0] = ((Object) null);
        updateEvolutionPathsMethodArguments[1] = ((Object) null);
        try {
            updateEvolutionPathsMethod.invoke(cMAESOptimizer, updateEvolutionPathsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsFitnessHistory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStatisticsFitnessHistory()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getStatisticsFitnessHistory()}
 * @utbot.returnsFrom {@code return statisticsFitnessHistory;}
 *  */
    @Test
    public void testGetStatisticsFitnessHistory_ReturnStatisticsFitnessHistory() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        List actual = cMAESOptimizer.getStatisticsFitnessHistory();
        
        assertNull(actual);
        
        List finalCMAESOptimizerStatisticsFitnessHistory = ((List) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "statisticsFitnessHistory"));
        
        assertNull(finalCMAESOptimizerStatisticsFitnessHistory);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsMeanHistory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStatisticsMeanHistory()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getStatisticsMeanHistory()}
 * @utbot.returnsFrom {@code return statisticsMeanHistory;}
 *  */
    @Test
    public void testGetStatisticsMeanHistory_ReturnStatisticsMeanHistory() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        List actual = cMAESOptimizer.getStatisticsMeanHistory();
        
        assertNull(actual);
        
        List finalCMAESOptimizerStatisticsMeanHistory = ((List) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "statisticsMeanHistory"));
        
        assertNull(finalCMAESOptimizerStatisticsMeanHistory);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsDHistory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStatisticsDHistory()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getStatisticsDHistory()}
 * @utbot.returnsFrom {@code return statisticsDHistory;}
 *  */
    @Test
    public void testGetStatisticsDHistory_ReturnStatisticsDHistory() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        List actual = cMAESOptimizer.getStatisticsDHistory();
        
        assertNull(actual);
        
        List finalCMAESOptimizerStatisticsDHistory = ((List) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "statisticsDHistory"));
        
        assertNull(finalCMAESOptimizerStatisticsDHistory);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowNegativeArraySizeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1962990944);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 2147483598);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.NegativeArraySizeException: -395554628]
            org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(BlockRealMatrix.java:250)
            org.apache.commons.math3.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:103)
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:439)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:675) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2147483630);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1469331981);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:444)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:675) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:444)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:675) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:446)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:675) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        Array2DRowRealMatrix diagC = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(diagC, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:341)
            org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(AbstractRealMatrix.java:127)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:675) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: add
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowNegativeArraySizeException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        OpenMapRealMatrix pc = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(pc, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", Integer.MIN_VALUE);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "pc", pc);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1063)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:677) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cc", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:675) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = false;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowNullPointerException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:675) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowNullPointerException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(CMAESOptimizer.java:1063)
            org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:677) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateCovarianceDiagonalOnly_ThrowNotStrictlyPositiveException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateCovarianceDiagonalOnly_ThrowNotStrictlyPositiveException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} 
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateCovarianceDiagonalOnly_ThrowNotStrictlyPositiveException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        OpenMapRealMatrix diagC = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(diagC, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} 
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testUpdateCovarianceDiagonalOnly_ThrowNumberIsTooLargeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "cc", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        OpenMapRealMatrix diagC = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(diagC, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1714089476);
        setField(diagC, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1787461632);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = false;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} 
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateCovarianceDiagonalOnly_ThrowNotStrictlyPositiveException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "ccovmuSep", 0.0);
        Array2DRowRealMatrix diagC = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(diagC, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "diagC", diagC);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[3];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        updateCovarianceDiagonalOnlyMethodArguments[2] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsSigmaHistory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStatisticsSigmaHistory()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.direct.CMAESOptimizer#getStatisticsSigmaHistory()}
 * @utbot.returnsFrom {@code return statisticsSigmaHistory;}
 *  */
    @Test
    public void testGetStatisticsSigmaHistory_ReturnStatisticsSigmaHistory() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        
        List actual = cMAESOptimizer.getStatisticsSigmaHistory();
        
        assertNull(actual);
        
        List finalCMAESOptimizerStatisticsSigmaHistory = ((List) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optimization.direct.CMAESOptimizer", "statisticsSigmaHistory"));
        
        assertNull(finalCMAESOptimizerStatisticsSigmaHistory);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields720963736163000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields720963736163000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass720963736184100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields720963736163000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass720963736184100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields720963736561100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields720963736561100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass720963736564000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields720963736561100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass720963736564000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

