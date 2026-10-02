package org.apache.commons.math3.optimization.general;

import org.junit.Test;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.apache.commons.math3.exception.NoDataException;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.math3.analysis.differentiation.DSCompiler;
import org.apache.commons.math3.optimization.fitting.HarmonicFitter;
import java.util.ArrayList;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.analysis.differentiation.GradientFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.optimization.fitting.GaussianFitter;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optimization.fitting.PolynomialFitter;
import org.apache.commons.math3.optimization.fitting.CurveFitter;
import org.apache.commons.math3.optimization.OptimizationData;
import org.apache.commons.math3.optimization.InitialGuess;
import org.apache.commons.math3.optimization.Target;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import java.lang.reflect.Method;
import org.apache.commons.math3.optimization.Weight;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math3_optimization_general_AbstractLeastSquaresOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimize
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize(int, org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction, [D, [D, [D)
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimizeByFuzzer() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 1.0, 1.0};
        double[] doubleArray1 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        double[] doubleArray2 = {java.lang.Double.NEGATIVE_INFINITY, 0.0};
        
        gaussNewtonOptimizer.optimize(-2, ((DifferentiableMultivariateVectorFunction) null), doubleArray, doubleArray1, doubleArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimize
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, [D, [D, [D)
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimizeByFuzzer1() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 1.0, 1.0};
        double[] doubleArray1 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        double[] doubleArray2 = {java.lang.Double.NEGATIVE_INFINITY, 0.0};
        
        gaussNewtonOptimizer.optimize(-2, ((MultivariateDifferentiableVectorFunction) null), doubleArray, doubleArray1, doubleArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWeightSquareRoot()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.returnsFrom {@code return weightMatrixSqrt.copy();}
 *  */
    @Test
    public void testGetWeightSquareRoot_ReturnWeightMatrixSqrtCopy() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) levenbergMarquardtOptimizer.getWeightSquareRoot());
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
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
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.returnsFrom {@code return weightMatrixSqrt.copy();}
 *  */
    @Test
    public void testGetWeightSquareRoot_ReturnWeightMatrixSqrtCopy_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrixSqrt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) levenbergMarquardtOptimizer.getWeightSquareRoot());
        
        OpenMapRealMatrix expected = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries1);
        
        int expectedRows = ((Integer) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows"));
        assertEquals(expectedRows, actualRows);
        
        int expectedColumns = ((Integer) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns"));
        assertEquals(expectedColumns, actualColumns);
        
        OpenIntToDoubleHashMap expectedEntries = ((OpenIntToDoubleHashMap) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries"));
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries"));
        int[] expectedEntriesKeys = ((int[]) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys"));
        int[] actualEntriesKeys = ((int[]) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys"));
        int expectedEntriesKeysSize = expectedEntriesKeys.length;
        assertEquals(expectedEntriesKeysSize, actualEntriesKeys.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
        byte[] expectedEntriesStates = ((byte[]) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states"));
        byte[] actualEntriesStates = ((byte[]) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states"));
        int expectedEntriesStatesSize = expectedEntriesStates.length;
        assertEquals(expectedEntriesStatesSize, actualEntriesStates.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesStates, actualEntriesStates);
        
        double expectedEntriesMissingEntries = ((Double) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries"));
        double actualEntriesMissingEntries = ((Double) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries"));
        org.junit.Assert.assertEquals(expectedEntriesMissingEntries, actualEntriesMissingEntries, 1.0E-6);
        
        int expectedEntriesSize = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size"));
        int actualEntriesSize = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size"));
        assertEquals(expectedEntriesSize, actualEntriesSize);
        
        int expectedEntriesMask = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask"));
        int actualEntriesMask = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask"));
        assertEquals(expectedEntriesMask, actualEntriesMask);
        
        int expectedEntriesCount = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count"));
        int actualEntriesCount = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count"));
        assertEquals(expectedEntriesCount, actualEntriesCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getWeightSquareRoot()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:260) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:260) */
        gaussNewtonOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowNullPointerException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:260) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.returnsFrom {@code return weightMatrixSqrt.copy();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowNullPointerException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:260) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrixSqrt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:260) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowNullPointerException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrixSqrt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:260) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getWeightSquareRoot()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return weightMatrixSqrt.copy();
 *  */
    @Test(expected = NoDataException.class)
    public void testGetWeightSquareRoot_ThrowNoDataException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return weightMatrixSqrt.copy();
 *  */
    @Test(expected = NoDataException.class)
    public void testGetWeightSquareRoot_ThrowNoDataException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getWeightSquareRoot()
    
    @Test
    public void testGetWeightSquareRoot1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[7][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = doubleArray1;
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:260) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    @Test
    public void testGetWeightSquareRoot2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrixSqrt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 34 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:260) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeWeightedJacobian([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final DerivativeStructure[] dsValue = jF.value(dsPoint);
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        MultivariateDifferentiableVectorFunction jF = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175) */
        levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nC; ++i)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: dsPoint[i] = new DerivativeStructure(nC, 1, i, params[i]);
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173) */
            gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nC; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: dsPoint[i] = new DerivativeStructure(nC, 1, i, params[i]);
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1073741824);
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173) */
            levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nC; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: dsPoint[i] = new DerivativeStructure(nC, 1, i, params[i]);
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173) */
            levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nC; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: dsPoint[i] = new DerivativeStructure(nC, 1, i, params[i]);
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1073741824);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173) */
            levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nC; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: dsPoint[i] = new DerivativeStructure(nC, 1, i, params[i]);
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173) */
            gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nC; ++i)} once
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: dsPoint[i] = new DerivativeStructure(nC, 1, i, params[i]);
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowNegativeArraySizeException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {Integer.MIN_VALUE};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173) */
            levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.executesCondition {@code (dsValue.length != nR): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getTarget()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.MatrixUtils#createRealMatrix(double[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(jacobianData));
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        HarmonicFitter this$0 = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        BlockRealMatrix weightMatrixSqrt = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:190) */
        gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final DerivativeStructure[] dsPoint = new DerivativeStructure[params.length];
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:170) */
        levenbergMarquardtOptimizer.computeWeightedJacobian(null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final DerivativeStructure[] dsValue = jF.value(dsPoint);
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175) */
        levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeWeightedJacobian([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.executesCondition {@code (dsValue.length != nR): True}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction#value(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getTarget()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: dsValue.length != nR
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeWeightedJacobian_ThrowDimensionMismatchException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        HarmonicFitter this$0 = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", 4);
        double[] target = {4.0E-323, 1.0E-323};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {};
        
        gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeWeightedJacobian([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
     */
    @Test
    public void testComputeWeightedJacobianThrowsNPEWithNonEmptyPrimitiveArray() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        double[] doubleArray = {0.0, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175) */
        gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeWeightedJacobian([D)
    
    @Test
    public void testComputeWeightedJacobian1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[3][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {null, null};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = {null, null, null, null, null, null, null, null, null, null};
            dSCompilerArray[1] = dSCompilerArray2;
            dSCompilerArray[2] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 10 out of bounds for object array[3]]
                java.base/java.lang.System.arraycopy(Native Method)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:204)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173) */
            gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeWeightedJacobian2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[3][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            dSCompilerArray[1] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[2] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] doubleArray = {0.0, 0.0, 0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:204)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173) */
            gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeWeightedJacobian3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {null, null};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = {};
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.NullPointerException]
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175) */
            gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method guessParametersErrors()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.executesCondition {@code (rows <= cols): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} in: rows
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testGuessParametersErrors_ThrowNumberIsTooSmallException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.cols = -255;
        levenbergMarquardtOptimizer.rows = -255;
        
        levenbergMarquardtOptimizer.guessParametersErrors();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method guessParametersErrors()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] errors = new double[cols];
 *  */
    @Test
    public void testGuessParametersErrors_ThrowNegativeArraySizeException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.cols = -2;
        levenbergMarquardtOptimizer.rows = -1;
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors] produces [java.lang.NegativeArraySizeException: -2]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors(AbstractLeastSquaresOptimizer.java:376) */
        levenbergMarquardtOptimizer.guessParametersErrors();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[][] covar = computeCovariances(point, 1e-14);
 *  */
    @Test
    public void testGuessParametersErrors_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.cost = 0.0;
        MultivariateDifferentiableVectorFunction jF = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors(AbstractLeastSquaresOptimizer.java:378) */
        levenbergMarquardtOptimizer.guessParametersErrors();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[][] covar = computeCovariances(point, 1e-14);
 *  */
    @Test
    public void testGuessParametersErrors_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            levenbergMarquardtOptimizer.rows = 1;
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            levenbergMarquardtOptimizer.cost = 0.0;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors(AbstractLeastSquaresOptimizer.java:378) */
            levenbergMarquardtOptimizer.guessParametersErrors();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGuessParametersErrors_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", Integer.MIN_VALUE);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            levenbergMarquardtOptimizer.rows = 1;
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            levenbergMarquardtOptimizer.cost = 0.0;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors(AbstractLeastSquaresOptimizer.java:378) */
            levenbergMarquardtOptimizer.guessParametersErrors();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] covar = computeCovariances(point, 1e-14);
 *  */
    @Test
    public void testGuessParametersErrors_ThrowNegativeArraySizeException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {Integer.MIN_VALUE};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            levenbergMarquardtOptimizer.rows = 1;
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            levenbergMarquardtOptimizer.cost = 0.0;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors(AbstractLeastSquaresOptimizer.java:378) */
            levenbergMarquardtOptimizer.guessParametersErrors();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGuessParametersErrors_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", Integer.MIN_VALUE);
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            levenbergMarquardtOptimizer.rows = 1;
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            levenbergMarquardtOptimizer.cost = 0.0;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors(AbstractLeastSquaresOptimizer.java:378) */
            levenbergMarquardtOptimizer.guessParametersErrors();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[][] covar = computeCovariances(point, 1e-14);
 *  */
    @Test
    public void testGuessParametersErrors_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            levenbergMarquardtOptimizer.rows = 1;
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            levenbergMarquardtOptimizer.cost = 0.0;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors(AbstractLeastSquaresOptimizer.java:378) */
            levenbergMarquardtOptimizer.guessParametersErrors();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: double[][] covar = computeCovariances(point, 1e-14);
 *  */
    @Test
    public void testGuessParametersErrors_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            levenbergMarquardtOptimizer.rows = 1;
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            levenbergMarquardtOptimizer.cost = 0.0;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors(AbstractLeastSquaresOptimizer.java:378) */
            levenbergMarquardtOptimizer.guessParametersErrors();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateResidualsAndCost()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: objective = computeObjectiveValue(point);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testUpdateResidualsAndCost_ThrowTooManyEvaluationsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {0.0};
        levenbergMarquardtOptimizer.point = point;
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: objective = computeObjectiveValue(point);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testUpdateResidualsAndCost_ThrowTooManyEvaluationsException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {0.0};
        levenbergMarquardtOptimizer.point = point;
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateResidualsAndCost()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: objective = computeObjectiveValue(point);
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        GradientFunction function = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
        MultivariateDifferentiableFunction f = ((MultivariateDifferentiableFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$17"));
        setField(function, "org.apache.commons.math3.analysis.differentiation.GradientFunction", "f", f);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$17.value(FunctionUtils.java:619)
            org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:52)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.computeObjectiveValue(BaseAbstractMultivariateVectorOptimizer.java:112)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:205) */
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: objective = computeObjectiveValue(point);
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
            GradientFunction function = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "function", function);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:48)
                org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.computeObjectiveValue(BaseAbstractMultivariateVectorOptimizer.java:112)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:205) */
            gaussNewtonOptimizer.updateResidualsAndCost();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: objective = computeObjectiveValue(point);
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
            GradientFunction function = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "function", function);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:48)
                org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.computeObjectiveValue(BaseAbstractMultivariateVectorOptimizer.java:112)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:205) */
            gaussNewtonOptimizer.updateResidualsAndCost();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: objective = computeObjectiveValue(point);
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
            GradientFunction function = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "function", function);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:48)
                org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.computeObjectiveValue(BaseAbstractMultivariateVectorOptimizer.java:112)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:205) */
            gaussNewtonOptimizer.updateResidualsAndCost();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1073741824);
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
            GradientFunction function = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "function", function);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:48)
                org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.computeObjectiveValue(BaseAbstractMultivariateVectorOptimizer.java:112)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:205) */
            gaussNewtonOptimizer.updateResidualsAndCost();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: objective = computeObjectiveValue(point);
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowNegativeArraySizeException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {Integer.MIN_VALUE};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
            GradientFunction function = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "function", function);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:48)
                org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.computeObjectiveValue(BaseAbstractMultivariateVectorOptimizer.java:112)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:205) */
            gaussNewtonOptimizer.updateResidualsAndCost();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", Integer.MIN_VALUE);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
            evaluations.setMaximalCount(Integer.MIN_VALUE);
            setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
            GradientFunction function = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "function", function);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:48)
                org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.computeObjectiveValue(BaseAbstractMultivariateVectorOptimizer.java:112)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:205) */
            gaussNewtonOptimizer.updateResidualsAndCost();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateResidualsAndCost()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
     */
    @Test(expected = TooManyEvaluationsException.class)
    public void testUpdateResidualsAndCostThrowsTMEE() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        
        gaussNewtonOptimizer.updateResidualsAndCost();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJacobianEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getJacobianEvaluations()}
 * @utbot.returnsFrom {@code return jacobianEvaluations;}
 *  */
    @Test
    public void testGetJacobianEvaluations_ReturnJacobianEvaluations() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        
        int actual = gaussNewtonOptimizer.getJacobianEvaluations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateJacobian()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix weightedJacobian = computeWeightedJacobian(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        MultivariateDifferentiableVectorFunction jF = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:154) */
        levenbergMarquardtOptimizer.updateJacobian();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix weightedJacobian = computeWeightedJacobian(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:154) */
            gaussNewtonOptimizer.updateJacobian();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final RealMatrix weightedJacobian = computeWeightedJacobian(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:154) */
            gaussNewtonOptimizer.updateJacobian();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix weightedJacobian = computeWeightedJacobian(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:154) */
            levenbergMarquardtOptimizer.updateJacobian();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix weightedJacobian = computeWeightedJacobian(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", Integer.MIN_VALUE);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:154) */
            gaussNewtonOptimizer.updateJacobian();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final RealMatrix weightedJacobian = computeWeightedJacobian(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowNegativeArraySizeException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {Integer.MIN_VALUE};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:154) */
            levenbergMarquardtOptimizer.updateJacobian();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix weightedJacobian = computeWeightedJacobian(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", Integer.MIN_VALUE);
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:154) */
            levenbergMarquardtOptimizer.updateJacobian();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix weightedJacobian = computeWeightedJacobian(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        GaussianFitter this$0 = ((GaussianFitter) createInstance("org.apache.commons.math3.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        BlockRealMatrix weightMatrixSqrt = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:190)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:154) */
        levenbergMarquardtOptimizer.updateJacobian();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateJacobian()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: final RealMatrix weightedJacobian = computeWeightedJacobian(point);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testUpdateJacobian_ThrowDimensionMismatchException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        GaussianFitter this$0 = ((GaussianFitter) createInstance("org.apache.commons.math3.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] target = {1.69759663277E-313, 1.0864618449742E-311};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        
        levenbergMarquardtOptimizer.updateJacobian();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method updateJacobian()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
     */
    @Test
    public void testUpdateJacobianThrowsNPE() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:170)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:154) */
        gaussNewtonOptimizer.updateJacobian();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setUp()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightMatrixSqrt = squareRoot(getWeight());
 *  */
    @Test
    public void testSetUp_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:508) */
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: super.setUp();
 *  */
    @Test
    public void testSetUp_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.setUp(BaseAbstractMultivariateVectorOptimizer.java:324)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:502) */
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: super.setUp();
 *  */
    @Test
    public void testSetUp_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", target);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.setUp(BaseAbstractMultivariateVectorOptimizer.java:324)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:502) */
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: super.setUp();
 *  */
    @Test
    public void testSetUp_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 4);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.setUp(BaseAbstractMultivariateVectorOptimizer.java:324)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:502) */
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: super.setUp();
 *  */
    @Test
    public void testSetUp_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.setUp(BaseAbstractMultivariateVectorOptimizer.java:324)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:502) */
        gaussNewtonOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetUp_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:508) */
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: weightMatrixSqrt = squareRoot(getWeight());
 *  */
    @Test
    public void testSetUp_ThrowNullPointerException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:508) */
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: weightMatrixSqrt = squareRoot(getWeight());
 *  */
    @Test
    public void testSetUp_ThrowNullPointerException_5() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:508) */
        gaussNewtonOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: super.setUp();
 *  */
    @Test
    public void testSetUp_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.setUp(BaseAbstractMultivariateVectorOptimizer.java:324)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:502) */
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: super.setUp();
 *  */
    @Test
    public void testSetUp_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.setUp(BaseAbstractMultivariateVectorOptimizer.java:324)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:502) */
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetUp_ThrowNullPointerException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:508) */
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetUp_ThrowNullPointerException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:508) */
        levenbergMarquardtOptimizer.setUp();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setUp()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: super.setUp();
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetUp_ThrowOutOfRangeException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        gaussNewtonOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: super.setUp();
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetUp_ThrowOutOfRangeException_4() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        gaussNewtonOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: super.setUp();
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetUp_ThrowOutOfRangeException_5() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        gaussNewtonOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: weightMatrixSqrt = squareRoot(getWeight());
 *  */
    @Test(expected = NoDataException.class)
    public void testSetUp_ThrowNoDataException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        data[0] = target;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: super.setUp();
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetUp_ThrowOutOfRangeException_2() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        double[] target = {0.0, 0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        gaussNewtonOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: weightMatrixSqrt = squareRoot(getWeight());
 *  */
    @Test(expected = NoDataException.class)
    public void testSetUp_ThrowNoDataException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: super.setUp();
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetUp_ThrowOutOfRangeException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", target);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        levenbergMarquardtOptimizer.setUp();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: super.setUp();
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetUp_ThrowOutOfRangeException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        double[] target = {0.0, 0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        
        gaussNewtonOptimizer.setUp();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setUp()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setUp()}
     */
    @Test
    public void testSetUpThrowsNPE() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.setUp(BaseAbstractMultivariateVectorOptimizer.java:321)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:502) */
        gaussNewtonOptimizer.setUp();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCovariances()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getCovariances(DEFAULT_SINGULARITY_THRESHOLD);
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        MultivariateDifferentiableVectorFunction jF = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:285) */
        levenbergMarquardtOptimizer.getCovariances();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testGetCovariances_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:285) */
            gaussNewtonOptimizer.getCovariances();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:285) */
            gaussNewtonOptimizer.getCovariances();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testGetCovariances_ThrowNegativeArraySizeException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {Integer.MIN_VALUE};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:285) */
            levenbergMarquardtOptimizer.getCovariances();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1073741824);
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:285) */
            levenbergMarquardtOptimizer.getCovariances();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", Integer.MIN_VALUE);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:285) */
            levenbergMarquardtOptimizer.getCovariances();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getCovariances(DEFAULT_SINGULARITY_THRESHOLD);
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:285) */
            levenbergMarquardtOptimizer.getCovariances();
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getCovariances(DEFAULT_SINGULARITY_THRESHOLD);
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        PolynomialFitter this$0 = ((PolynomialFitter) createInstance("org.apache.commons.math3.optimization.fitting.PolynomialFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        BlockRealMatrix weightMatrixSqrt = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:190)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:285) */
        levenbergMarquardtOptimizer.getCovariances();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCovariances()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return getCovariances(DEFAULT_SINGULARITY_THRESHOLD);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetCovariances_ThrowDimensionMismatchException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        double[] point = {};
        gaussNewtonOptimizer.point = point;
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        GaussianFitter this$0 = ((GaussianFitter) createInstance("org.apache.commons.math3.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] target = {7.9E-323, 1.1125369292536007E-308};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        
        gaussNewtonOptimizer.getCovariances();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getCovariances()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
     */
    @Test
    public void testGetCovariancesThrowsNPE() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:170)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:285) */
        gaussNewtonOptimizer.getCovariances();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCovariances(double)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return computeCovariances(point, threshold);
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        MultivariateDifferentiableVectorFunction jF = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307) */
        levenbergMarquardtOptimizer.getCovariances(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return computeCovariances(point, threshold);
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307) */
            levenbergMarquardtOptimizer.getCovariances(java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1073741824);
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307) */
            levenbergMarquardtOptimizer.getCovariances(java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return computeCovariances(point, threshold);
 *  */
    @Test
    public void testGetCovariances_ThrowNegativeArraySizeException1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {Integer.MIN_VALUE};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] point = {0.0};
            levenbergMarquardtOptimizer.point = point;
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307) */
            levenbergMarquardtOptimizer.getCovariances(java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return computeCovariances(point, threshold);
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1073741824);
            int[][] sizes = new int[1][];
            int[] intArray = {1};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler1 = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler1, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray2[1] = dSCompiler1;
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307) */
            gaussNewtonOptimizer.getCovariances(java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return computeCovariances(point, threshold);
 *  */
    @Test
    public void testGetCovariances_ThrowClassCastException1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307) */
            gaussNewtonOptimizer.getCovariances(java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return computeCovariances(point, threshold);
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] point = {0.0};
            gaussNewtonOptimizer.point = point;
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307) */
            gaussNewtonOptimizer.getCovariances(java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return computeCovariances(point, threshold);
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_51() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        GaussianFitter this$0 = ((GaussianFitter) createInstance("org.apache.commons.math3.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        BlockRealMatrix weightMatrixSqrt = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:190)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307) */
        levenbergMarquardtOptimizer.getCovariances(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCovariances(double)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return computeCovariances(point, threshold);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetCovariances_ThrowDimensionMismatchException1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        double[] point = {};
        gaussNewtonOptimizer.point = point;
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        PolynomialFitter this$0 = ((PolynomialFitter) createInstance("org.apache.commons.math3.optimization.fitting.PolynomialFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] target = {4.9E-324};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        
        gaussNewtonOptimizer.getCovariances(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getCovariances(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getCovariances(double)}
     */
    @Test
    public void testGetCovariancesThrowsNPE1() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:170)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:307) */
        gaussNewtonOptimizer.getCovariances(-1.0000001192092896);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeCost([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test
    public void testComputeCost_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:226) */
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test
    public void testComputeCost_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {1.2882395823324662E-231, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:226) */
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testComputeCost_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:226) */
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeCost([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getWeight()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test(expected = NoDataException.class)
    public void testComputeCost_ThrowNoDataException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {2.8480945388892178E-306};
        
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeCost([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCost(double[])}
     */
    @Test
    public void testComputeCostThrowsNPEWithNonEmptyPrimitiveArray() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        double[] doubleArray = {0.0, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:226) */
        gaussNewtonOptimizer.computeCost(doubleArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method computeCost([D)
    
    @Test
    public void testComputeCost1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray1 = {0.0};
        
        double actual = levenbergMarquardtOptimizer.computeCost(doubleArray1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeCost([D)
    
    @Test
    public void testComputeCost2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 34 out of bounds for double[10]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:226) */
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    
    @Test
    public void testComputeCost3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:226) */
        levenbergMarquardtOptimizer.computeCost(doubleArray1);
    }
    
    @Test
    public void testComputeCost4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = new double[16];
        doubleArray[0] = 6.32E-322;
        doubleArray[2] = 4.450147717014403E-308;
        doubleArray[4] = 2.0522684006491881E-289;
        doubleArray[5] = 1.73833895195875E-310;
        doubleArray[7] = 1.6578092E-316;
        doubleArray[8] = 2.225073858507233E-308;
        doubleArray[10] = 4.9E-324;
        doubleArray[12] = 3.337610787760802E-308;
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:226) */
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeCost([D)
    
    @Test(expected = NoDataException.class)
    public void testComputeCost5() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray1 = {};
        
        levenbergMarquardtOptimizer.computeCost(doubleArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeCovariances([D, double)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        MultivariateDifferentiableVectorFunction jF = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
        levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", Integer.MIN_VALUE);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 1073741824);
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowNegativeArraySizeException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {Integer.MIN_VALUE};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            gaussNewtonOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            gaussNewtonOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        HarmonicFitter this$0 = ((HarmonicFitter) createInstance("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        BlockRealMatrix weightMatrixSqrt = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:190)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
        levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeCovariances([D, double)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeCovariances_ThrowDimensionMismatchException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        PolynomialFitter this$0 = ((PolynomialFitter) createInstance("org.apache.commons.math3.optimization.fitting.PolynomialFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] target = {2.8480946237690494E-306};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {};
        
        levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeCovariances([D, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
     */
    @Test
    public void testComputeCovariancesThrowsNPEWithNonEmptyPrimitiveArrayAndCornerCase() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        double[] doubleArray = {java.lang.Double.NaN, 0.0, java.lang.Double.NEGATIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
        gaussNewtonOptimizer.computeCovariances(doubleArray, java.lang.Double.POSITIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeCovariances([D, double)
    
    @Test
    public void testComputeCovariances1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = {null, null, null, null, null, null, null, null, null, null};
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 10 out of bounds for object array[2]]
                java.base/java.lang.System.arraycopy(Native Method)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:204)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            gaussNewtonOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeCovariances2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[9][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[10];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[9][];
            int[] intArray = {
                9, 10881, 10881, 10881, 10881, 10881, 10881, 10881,
                10881
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
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[0] = dSCompilerArray1;
            dSCompilerArray[1] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[2] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[3] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[4] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[5] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[6] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[7] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[8] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] doubleArray = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0
            };
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeCovariances3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[3][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = {};
            dSCompilerArray[1] = dSCompilerArray2;
            dSCompilerArray[2] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:204)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            gaussNewtonOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeCovariances4() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[1][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] doubleArray = {0.0, 0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.NullPointerException]
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeCovariances5() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            dSCompilerArray[1] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] doubleArray = {0.0, 0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:204)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            gaussNewtonOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeCovariances6() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[1][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[11];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            dSCompilerArray1[0] = dSCompiler;
            dSCompilerArray[0] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.NullPointerException]
                java.base/java.lang.System.arraycopy(Native Method)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.compileSizes(DSCompiler.java:240)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.<init>(DSCompiler.java:163)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:215)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            gaussNewtonOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeCovariances7() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            AtomicReference compilers = new AtomicReference(null);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] doubleArray = {0.0, 0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.NullPointerException]
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeCovariances8() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        observations.add(null);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction.value(CurveFitter.java:284)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330) */
        levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeResiduals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeResiduals([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeResiduals(double[])}
 * @utbot.returnsFrom {@code return residuals;}
 *  */
    @Test
    public void testComputeResiduals_ReturnResiduals() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {};
        
        double[] actual = gaussNewtonOptimizer.computeResiduals(doubleArray);
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeResiduals(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < target.length; i++)} once
 * @utbot.returnsFrom {@code return residuals;}
 *  */
    @Test
    public void testComputeResiduals_IterateForLoop() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {0.0};
        
        double[] actual = levenbergMarquardtOptimizer.computeResiduals(doubleArray);
        
        double[] expected = {4.9E-324};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeResiduals([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeResiduals(double[])}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getTarget()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objectiveValue.length != target.length
 *  */
    @Test
    public void testComputeResiduals_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeResiduals] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeResiduals(AbstractLeastSquaresOptimizer.java:542) */
        levenbergMarquardtOptimizer.computeResiduals(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeResiduals([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeResiduals(double[])}
 * @utbot.executesCondition {@code (objectiveValue.length != target.length): True}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getTarget()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: objectiveValue.length != target.length
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeResiduals_ThrowDimensionMismatchException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        double[] target = {1.295163E-318};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {0.0, 0.0};
        
        levenbergMarquardtOptimizer.computeResiduals(doubleArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeResiduals([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeResiduals(double[])}
     */
    @Test
    public void testComputeResidualsThrowsNPEWithNonEmptyPrimitiveArray() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        double[] doubleArray = {0.0, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeResiduals] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getTarget(BaseAbstractMultivariateVectorOptimizer.java:270)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeResiduals(AbstractLeastSquaresOptimizer.java:541) */
        gaussNewtonOptimizer.computeResiduals(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getRMS
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRMS()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getRMS()}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#sqrt(double)}
 * @utbot.returnsFrom {@code return FastMath.sqrt(getChiSquare() / rows);}
 *  */
    @Test
    public void testGetRMS_FastMathSqrt() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = -255;
        levenbergMarquardtOptimizer.cost = 0.0;
        
        double actual = levenbergMarquardtOptimizer.getRMS();
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getChiSquare()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.returnsFrom {@code return cost * cost;}
 *  */
    @Test
    public void testGetChiSquare_ReturnCostMultiplyCost() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        gaussNewtonOptimizer.cost = 0.0;
        
        double actual = gaussNewtonOptimizer.getChiSquare();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setCost
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCost(double)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#setCost(double)}
 *  */
    @Test
    public void testSetCost() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        gaussNewtonOptimizer.cost = 0.0;
        
        gaussNewtonOptimizer.setCost(java.lang.Double.NaN);
        
        double finalGaussNewtonOptimizerCost = gaussNewtonOptimizer.cost;
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalGaussNewtonOptimizerCost, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeSigma([D, double)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        MultivariateDifferentiableVectorFunction jF = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
        levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            gaussNewtonOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", Integer.MIN_VALUE);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
 *  */
    @Test
    public void testComputeSigma_ThrowNegativeArraySizeException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {null};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[1][];
            int[] intArray = {Integer.MIN_VALUE};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray2[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {null};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", Integer.MIN_VALUE);
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray2[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
 *  */
    @Test
    public void testComputeSigma_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39a8376f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            gaussNewtonOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nC = params.length;
 *  */
    @Test
    public void testComputeSigma_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:402) */
        levenbergMarquardtOptimizer.computeSigma(null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeSigma([D, double)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeSigma_ThrowDimensionMismatchException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        PolynomialFitter this$0 = ((PolynomialFitter) createInstance("org.apache.commons.math3.optimization.fitting.PolynomialFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] target = {2.0E-323};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {};
        
        gaussNewtonOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method computeSigma([D, double)
    
    @Test
    public void testComputeSigma1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {null};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = {null, null, null, null, null, null, null, null, null, null};
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 10 out of bounds for object array[2]]
                java.base/java.lang.System.arraycopy(Native Method)
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:204)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeSigma2() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        Object jF = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        PolynomialFitter this$0 = ((PolynomialFitter) createInstance("org.apache.commons.math3.optimization.fitting.PolynomialFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(jF, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:190)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
        gaussNewtonOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
    }
    
    @Test
    public void testComputeSigma3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {};
            dSCompilerArray[0] = dSCompilerArray1;
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray2 = {};
            dSCompilerArray[1] = dSCompilerArray2;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.NullPointerException]
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            gaussNewtonOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeSigma4() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = {null, null};
            dSCompilerArray[0] = dSCompilerArray1;
            dSCompilerArray[1] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            double[] doubleArray = {0.0, 0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:204)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            gaussNewtonOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeSigma5() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[9][];
            dSCompilerArray[0] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[1] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[2] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[3] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[4] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[5] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[6] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            dSCompilerArray[7] = ((org.apache.commons.math3.analysis.differentiation.DSCompiler[]) null);
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[10];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            int[][] sizes = new int[9][];
            int[] intArray = {
                9, 0, 0, 0, 0, 0, 0, 0,
                0
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
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[8] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] doubleArray = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0
            };
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.NullPointerException]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:189)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:173)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    @Test
    public void testComputeSigma6() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            AtomicReference compilers = new AtomicReference(null);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            double[] doubleArray = {0.0, 0.0};
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.NullPointerException]
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:175)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:330)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:404) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, [Lorg.apache.commons.math3.optimization.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#optimizeInternal(int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.optimizeInternal(maxEval, FunctionUtils.toDifferentiableMultivariateVectorFunction(f), optData);
 *  */
    @Test
    public void testOptimizeInternal_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.parseOptimizationData(BaseAbstractMultivariateVectorOptimizer.java:342)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:235)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        levenbergMarquardtOptimizer.optimizeInternal(-255, ((MultivariateDifferentiableVectorFunction) null), ((org.apache.commons.math3.optimization.OptimizationData[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#optimizeInternal(int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.optimizeInternal(maxEval, FunctionUtils.toDifferentiableMultivariateVectorFunction(f), optData);
 *  */
    @Test
    public void testOptimizeInternal_ThrowNullPointerException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = {null};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.checkParameters(BaseAbstractMultivariateVectorOptimizer.java:365)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:237)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        gaussNewtonOptimizer.optimizeInternal(-255, ((MultivariateDifferentiableVectorFunction) null), optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#optimizeInternal(int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.optimizeInternal(maxEval, FunctionUtils.toDifferentiableMultivariateVectorFunction(f), optData);
 *  */
    @Test
    public void testOptimizeInternal_ThrowNullPointerException_3() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.checkParameters(BaseAbstractMultivariateVectorOptimizer.java:365)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:237)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        gaussNewtonOptimizer.optimizeInternal(-255, ((MultivariateDifferentiableVectorFunction) null), optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#optimizeInternal(int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.optimizeInternal(maxEval, FunctionUtils.toDifferentiableMultivariateVectorFunction(f), optData);
 *  */
    @Test
    public void testOptimizeInternal_ThrowNullPointerException_2() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optimization.InitialGuess"));
        double[] init = {2.0025664726564812E-307};
        setField(initialGuess, "org.apache.commons.math3.optimization.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.checkParameters(BaseAbstractMultivariateVectorOptimizer.java:365)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:237)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        gaussNewtonOptimizer.optimizeInternal(-255, ((MultivariateDifferentiableVectorFunction) null), optimizationDataArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, [Lorg.apache.commons.math3.optimization.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#optimizeInternal(int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[])}
 * @utbot.invokes {@link org.apache.commons.math3.analysis.FunctionUtils#toDifferentiableMultivariateVectorFunction(org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction)}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer#optimizeInternal(int,org.apache.commons.math3.analysis.MultivariateVectorFunction,org.apache.commons.math3.optimization.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return super.optimizeInternal(maxEval, FunctionUtils.toDifferentiableMultivariateVectorFunction(f), optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimizeInternal_ThrowDimensionMismatchException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        double[] target = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -3);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = {};
        
        levenbergMarquardtOptimizer.optimizeInternal(-255, ((MultivariateDifferentiableVectorFunction) null), optimizationDataArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, [Lorg.apache.commons.math3.optimization.OptimizationData;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#optimizeInternal(int,org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction,org.apache.commons.math3.optimization.OptimizationData[])}
     */
    @Test
    public void testOptimizeInternalThrowsNPEWithEmptyObjectArray() {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.checkParameters(BaseAbstractMultivariateVectorOptimizer.java:365)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:237)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        gaussNewtonOptimizer.optimizeInternal(-1073741825, ((MultivariateDifferentiableVectorFunction) null), optimizationDataArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, [Lorg.apache.commons.math3.optimization.OptimizationData;)
    
    @Test
    public void testOptimizeInternal1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        DifferentiableMultivariateVectorFunction function = ((DifferentiableMultivariateVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "function", function);
        MultivariateDifferentiableVectorFunction anonymousMultivariateDifferentiableVectorFunction = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[20];
        Target target = ((Target) createInstance("org.apache.commons.math3.optimization.Target"));
        double[] target1 = {};
        setField(target, "org.apache.commons.math3.optimization.Target", "target", target1);
        optimizationDataArray[0] = ((OptimizationData) target);
        Target target2 = ((Target) createInstance("org.apache.commons.math3.optimization.Target"));
        optimizationDataArray[1] = ((OptimizationData) target2);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.Target.getTarget(Target.java:49)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.parseOptimizationData(BaseAbstractMultivariateVectorOptimizer.java:344)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:235)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        levenbergMarquardtOptimizer.optimizeInternal(0, anonymousMultivariateDifferentiableVectorFunction, optimizationDataArray);
    }
    
    @Test
    public void testOptimizeInternal2() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        MultivariateVectorFunction function = ((MultivariateVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$16$2"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "function", function);
        Object theoreticalValuesFunction = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[2];
        Target target = ((Target) createInstance("org.apache.commons.math3.optimization.Target"));
        double[] target1 = {};
        setField(target, "org.apache.commons.math3.optimization.Target", "target", target1);
        optimizationDataArray[0] = ((OptimizationData) target);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:131)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:508)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:239)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class intType = int.class;
        Class theoreticalValuesFunctionType = Class.forName("org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optimization.OptimizationData;");
        Method optimizeInternalMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("optimizeInternal", intType, theoreticalValuesFunctionType, optimizationDataArrayType);
        optimizeInternalMethod.setAccessible(true);
        java.lang.Object[] optimizeInternalMethodArguments = new java.lang.Object[3];
        optimizeInternalMethodArguments[0] = 0;
        optimizeInternalMethodArguments[1] = theoreticalValuesFunction;
        optimizeInternalMethodArguments[2] = ((Object) optimizationDataArray);
        try {
            optimizeInternalMethod.invoke(gaussNewtonOptimizer, optimizeInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeInternal3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[4];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optimization.InitialGuess"));
        double[] init = {
            3.16E-322, 3.39519326554E-313, 0.0, 0.0, -0.0, -0.0,
            4.9E-324, 0.0, 3.16E-322
        };
        setField(initialGuess, "org.apache.commons.math3.optimization.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optimization.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weight, "org.apache.commons.math3.optimization.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[1] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:131)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.Weight.getWeight(Weight.java:67)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.parseOptimizationData(BaseAbstractMultivariateVectorOptimizer.java:348)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:235)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        levenbergMarquardtOptimizer.optimizeInternal(0, ((MultivariateDifferentiableVectorFunction) null), optimizationDataArray);
    }
    
    @Test
    public void testOptimizeInternal4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[4];
        Target target = ((Target) createInstance("org.apache.commons.math3.optimization.Target"));
        double[] target1 = {
            3.16E-322, 3.39519326554E-313, 0.0, 0.0, -0.0, -0.0,
            4.9E-324, 0.0, 3.16E-322
        };
        setField(target, "org.apache.commons.math3.optimization.Target", "target", target1);
        optimizationDataArray[0] = ((OptimizationData) target);
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optimization.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weight, "org.apache.commons.math3.optimization.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[1] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:131)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.Weight.getWeight(Weight.java:67)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.parseOptimizationData(BaseAbstractMultivariateVectorOptimizer.java:348)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:235)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        levenbergMarquardtOptimizer.optimizeInternal(0, ((MultivariateDifferentiableVectorFunction) null), optimizationDataArray);
    }
    
    @Test
    public void testOptimizeInternal5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        MultivariateVectorFunction function = ((MultivariateVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$16$2"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "function", function);
        Object theoreticalValuesFunction = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[4];
        Target target = ((Target) createInstance("org.apache.commons.math3.optimization.Target"));
        double[] target1 = {1.491668146241398E-154, 1.58E-322};
        setField(target, "org.apache.commons.math3.optimization.Target", "target", target1);
        optimizationDataArray[0] = ((OptimizationData) target);
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optimization.InitialGuess"));
        double[] init = {};
        setField(initialGuess, "org.apache.commons.math3.optimization.InitialGuess", "init", init);
        optimizationDataArray[1] = ((OptimizationData) initialGuess);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.checkParameters(BaseAbstractMultivariateVectorOptimizer.java:365)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:237)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class intType = int.class;
        Class theoreticalValuesFunctionType = Class.forName("org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optimization.OptimizationData;");
        Method optimizeInternalMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("optimizeInternal", intType, theoreticalValuesFunctionType, optimizationDataArrayType);
        optimizeInternalMethod.setAccessible(true);
        java.lang.Object[] optimizeInternalMethodArguments = new java.lang.Object[3];
        optimizeInternalMethodArguments[0] = 0;
        optimizeInternalMethodArguments[1] = theoreticalValuesFunction;
        optimizeInternalMethodArguments[2] = ((Object) optimizationDataArray);
        try {
            optimizeInternalMethod.invoke(levenbergMarquardtOptimizer, optimizeInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeInternal6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
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
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        Object theoreticalValuesFunction = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[1];
        Target target = ((Target) createInstance("org.apache.commons.math3.optimization.Target"));
        double[] target1 = {};
        setField(target, "org.apache.commons.math3.optimization.Target", "target", target1);
        optimizationDataArray[0] = ((OptimizationData) target);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:508)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:239)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class intType = int.class;
        Class theoreticalValuesFunctionType = Class.forName("org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optimization.OptimizationData;");
        Method optimizeInternalMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("optimizeInternal", intType, theoreticalValuesFunctionType, optimizationDataArrayType);
        optimizeInternalMethod.setAccessible(true);
        java.lang.Object[] optimizeInternalMethodArguments = new java.lang.Object[3];
        optimizeInternalMethodArguments[0] = 0;
        optimizeInternalMethodArguments[1] = theoreticalValuesFunction;
        optimizeInternalMethodArguments[2] = ((Object) optimizationDataArray);
        try {
            optimizeInternalMethod.invoke(levenbergMarquardtOptimizer, optimizeInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testOptimizeInternal7() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        MultivariateDifferentiableVectorFunction anonymousMultivariateDifferentiableVectorFunction = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[2];
        Target target = ((Target) createInstance("org.apache.commons.math3.optimization.Target"));
        double[] target1 = {};
        setField(target, "org.apache.commons.math3.optimization.Target", "target", target1);
        optimizationDataArray[1] = ((OptimizationData) target);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:131)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:508)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:239)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        levenbergMarquardtOptimizer.optimizeInternal(0, anonymousMultivariateDifferentiableVectorFunction, optimizationDataArray);
    }
    
    @Test
    public void testOptimizeInternal8() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.setUp(BaseAbstractMultivariateVectorOptimizer.java:324)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:502)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:239)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        levenbergMarquardtOptimizer.optimizeInternal(0, ((MultivariateDifferentiableVectorFunction) null), optimizationDataArray);
    }
    
    @Test
    public void testOptimizeInternal9() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:131)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.getWeight(BaseAbstractMultivariateVectorOptimizer.java:260)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.setUp(AbstractLeastSquaresOptimizer.java:508)
            org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer.optimizeInternal(BaseAbstractMultivariateVectorOptimizer.java:239)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.optimizeInternal(AbstractLeastSquaresOptimizer.java:496) */
        levenbergMarquardtOptimizer.optimizeInternal(0, ((MultivariateDifferentiableVectorFunction) null), optimizationDataArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimizeInternal(int, org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction, [Lorg.apache.commons.math3.optimization.OptimizationData;)
    
    @Test(expected = OutOfRangeException.class)
    public void testOptimizeInternal10() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        MultivariateDifferentiableVectorFunction anonymousMultivariateDifferentiableVectorFunction = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = {null};
        
        gaussNewtonOptimizer.optimizeInternal(0, anonymousMultivariateDifferentiableVectorFunction, optimizationDataArray);
    }
    
    @Test(expected = NoDataException.class)
    public void testOptimizeInternal11() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        Object theoreticalValuesFunction = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[1];
        Target target = ((Target) createInstance("org.apache.commons.math3.optimization.Target"));
        double[] target1 = {};
        setField(target, "org.apache.commons.math3.optimization.Target", "target", target1);
        optimizationDataArray[0] = ((OptimizationData) target);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class intType = int.class;
        Class theoreticalValuesFunctionType = Class.forName("org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optimization.OptimizationData;");
        Method optimizeInternalMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("optimizeInternal", intType, theoreticalValuesFunctionType, optimizationDataArrayType);
        optimizeInternalMethod.setAccessible(true);
        java.lang.Object[] optimizeInternalMethodArguments = new java.lang.Object[3];
        optimizeInternalMethodArguments[0] = 0;
        optimizeInternalMethodArguments[1] = theoreticalValuesFunction;
        optimizeInternalMethodArguments[2] = ((Object) optimizationDataArray);
        try {
            optimizeInternalMethod.invoke(levenbergMarquardtOptimizer, optimizeInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testOptimizeInternal12() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        MultivariateDifferentiableVectorFunction anonymousMultivariateDifferentiableVectorFunction = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[2];
        Target target = ((Target) createInstance("org.apache.commons.math3.optimization.Target"));
        double[] target1 = {0.0};
        setField(target, "org.apache.commons.math3.optimization.Target", "target", target1);
        optimizationDataArray[1] = ((OptimizationData) target);
        
        levenbergMarquardtOptimizer.optimizeInternal(0, anonymousMultivariateDifferentiableVectorFunction, optimizationDataArray);
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testOptimizeInternal13() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "evaluations", evaluations);
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        Object theoreticalValuesFunction = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        org.apache.commons.math3.optimization.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optimization.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optimization.InitialGuess"));
        double[] init = {};
        setField(initialGuess, "org.apache.commons.math3.optimization.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class intType = int.class;
        Class theoreticalValuesFunctionType = Class.forName("org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optimization.OptimizationData;");
        Method optimizeInternalMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("optimizeInternal", intType, theoreticalValuesFunctionType, optimizationDataArrayType);
        optimizeInternalMethod.setAccessible(true);
        java.lang.Object[] optimizeInternalMethodArguments = new java.lang.Object[3];
        optimizeInternalMethodArguments[0] = 0;
        optimizeInternalMethodArguments[1] = theoreticalValuesFunction;
        optimizeInternalMethodArguments[2] = ((Object) optimizationDataArray);
        try {
            optimizeInternalMethod.invoke(levenbergMarquardtOptimizer, optimizeInternalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method squareRoot(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:119)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:562) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", array2DRowRealMatrixType);
        squareRootMethod.setAccessible(true);
        java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
        squareRootMethodArguments[0] = array2DRowRealMatrix;
        try {
            squareRootMethod.invoke(levenbergMarquardtOptimizer, squareRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 1.73833895195875E-310);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            int[] keys = {3, 1};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
            double[] values = {0.0};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:401)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:562) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", openMapRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = openMapRealMatrix;
            try {
                squareRootMethod.invoke(gaussNewtonOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 1.73833895195875E-310);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            int[] keys = {3, 0};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
            byte[] states = {(byte) 0};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:401)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:562) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", openMapRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = openMapRealMatrix;
            try {
                squareRootMethod.invoke(levenbergMarquardtOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 4.9E-324);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            int[] keys = new int[12];
            keys[0] = 3;
            keys[2] = 3;
            keys[3] = 3;
            keys[4] = 3;
            keys[6] = 3;
            keys[7] = 3;
            keys[8] = 3;
            keys[9] = 3;
            keys[10] = 3;
            keys[11] = 3;
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
            byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 5);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:401)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:562) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", openMapRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = openMapRealMatrix;
            try {
                squareRootMethod.invoke(gaussNewtonOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 4.9E-324);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            int[] keys = {0};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
            byte[] states = {(byte) 0};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:402)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:562) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", openMapRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = openMapRealMatrix;
            try {
                squareRootMethod.invoke(gaussNewtonOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 7.291122019556399E-304);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            int[] keys = new int[14];
            keys[0] = 3;
            keys[2] = 3;
            keys[3] = 3;
            keys[4] = 3;
            keys[5] = 1;
            keys[6] = 3;
            keys[7] = 3;
            keys[8] = 3;
            keys[9] = 3;
            keys[10] = 3;
            keys[11] = 3;
            keys[12] = 3;
            keys[13] = 3;
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
            double[] values = {0.0, 0.0};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
            byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 5);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:401)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:562) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", openMapRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = openMapRealMatrix;
            try {
                squareRootMethod.invoke(gaussNewtonOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowNullPointerException() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 1.73833895195875E-310);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.NullPointerException]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:401)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:562) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", openMapRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = openMapRealMatrix;
            try {
                squareRootMethod.invoke(levenbergMarquardtOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method squareRoot(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.linear.NonSquareMatrixException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test(expected = NonSquareMatrixException.class)
    public void testSquareRoot_ThrowNonSquareMatrixException() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 2.225073858507202E-308);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", -1);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", openMapRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = openMapRealMatrix;
            try {
                squareRootMethod.invoke(gaussNewtonOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.linear.NonSquareMatrixException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test(expected = NonSquareMatrixException.class)
    public void testSquareRoot_ThrowNonSquareMatrixException_1() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", java.lang.Double.NaN);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {0.0, 0.0};
            data[0] = doubleArray;
            setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", array2DRowRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = array2DRowRealMatrix;
            try {
                squareRootMethod.invoke(levenbergMarquardtOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.linear.NonSquareMatrixException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test(expected = NonSquareMatrixException.class)
    public void testSquareRoot_ThrowNonSquareMatrixException_2() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 4.9E-324);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
            Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = {null};
            setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", array2DRowRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = array2DRowRealMatrix;
            try {
                squareRootMethod.invoke(levenbergMarquardtOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method squareRoot(org.apache.commons.math3.linear.RealMatrix)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
     */
    @Test
    public void testSquareRootThrowsNPE() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = new GaussNewtonOptimizer();
        
        /* This test fails because method [org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:119)
            org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:562) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", realMatrixType);
        squareRootMethod.setAccessible(true);
        java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
        squareRootMethodArguments[0] = ((Object) null);
        try {
            squareRootMethod.invoke(gaussNewtonOptimizer, squareRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method squareRoot(org.apache.commons.math3.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testSquareRoot1() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", java.lang.Double.NaN);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 251658231);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 251658231);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            int[] keys = {
                1, 3, 3, 3, 3, 3, 3, 3,
                0
            };
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
            double[] values = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, 0.0
            };
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
            byte[] states = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 8);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This execution may take longer than the 1000 ms timeout
             and therefore fail due to exceeding the timeout. */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", openMapRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = openMapRealMatrix;
            try {
                squareRootMethod.invoke(gaussNewtonOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    @Test(timeout = 1000L)
    public void testSquareRoot2() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 0.0);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optimization.general.GaussNewtonOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 478423185);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 478423185);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            int[] keys = {
                0, 10881, 10881, 10881, 10881, 10881, 10881, 10881,
                478423185
            };
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
            double[] values = {
                0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
                0.0, 0.0, -1.1945774316841202E-299
            };
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
            byte[] states = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -0.0);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 8);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This execution may take longer than the 1000 ms timeout
             and therefore fail due to exceeding the timeout. */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
            Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", openMapRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = openMapRealMatrix;
            try {
                squareRootMethod.invoke(gaussNewtonOptimizer, squareRootMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields718223050981000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields718223050981000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass718223050986000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields718223050981000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass718223050986000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields718223051242200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields718223051242200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass718223051243900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields718223051242200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass718223051243900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields718223051663600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields718223051663600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass718223051665200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields718223051663600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass718223051665200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields718223052085000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields718223052085000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass718223052086500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields718223052085000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass718223052086500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

