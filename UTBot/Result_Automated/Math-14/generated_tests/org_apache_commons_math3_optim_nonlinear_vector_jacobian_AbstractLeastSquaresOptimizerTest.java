package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.junit.Test;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.optim.OptimizationData;
import java.lang.reflect.Method;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer;
import org.apache.commons.math3.analysis.differentiation.JacobianFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.math3.analysis.differentiation.DSCompiler;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.optimization.fitting.GaussianFitter;
import java.util.ArrayList;
import org.apache.commons.math3.optimization.fitting.PolynomialFitter;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math3_optim_nonlinear_vector_jacobian_AbstractLeastSquaresOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWeightSquareRoot()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.returnsFrom {@code return weightMatrixSqrt.copy();}
 *  */
    @Test
    public void testGetWeightSquareRoot_ReturnWeightMatrixSqrtCopy() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.returnsFrom {@code return weightMatrixSqrt.copy();}
 *  */
    @Test
    public void testGetWeightSquareRoot_ReturnWeightMatrixSqrtCopy_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrixSqrt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.0522684006491886E-289);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) levenbergMarquardtOptimizer.getWeightSquareRoot());
        
        OpenMapRealMatrix expected = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.0522684006491886E-289);
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowNullPointerException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.returnsFrom {@code return weightMatrixSqrt.copy();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowNullPointerException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrixSqrt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrixSqrt.copy();
 *  */
    @Test
    public void testGetWeightSquareRoot_ThrowNullPointerException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrixSqrt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getWeightSquareRoot()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return weightMatrixSqrt.copy();
 *  */
    @Test(expected = NoDataException.class)
    public void testGetWeightSquareRoot_ThrowNoDataException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeightSquareRoot()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return weightMatrixSqrt.copy();
 *  */
    @Test(expected = NoDataException.class)
    public void testGetWeightSquareRoot_ThrowNoDataException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getWeightSquareRoot()
    
    @Test
    public void testGetWeightSquareRoot1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[5][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = doubleArray1;
        data[3] = doubleArray1;
        data[4] = ((double[]) null);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    
    @Test
    public void testGetWeightSquareRoot2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrixSqrt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 34 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111) */
        levenbergMarquardtOptimizer.getWeightSquareRoot();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 *  */
    @Test
    public void testParseOptimizationData() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 *  */
    @Test
    public void testParseOptimizationData_NotDataNotInstanceOfWeight() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        
        OptimizationData finalOptimizationDataArray0 = optimizationDataArray[0];
        
        assertNull(finalOptimizationDataArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightMatrixSqrt = squareRoot(((Weight) data).getWeight());
 *  */
    @Test
    public void testParseOptimizationData_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} 5 times
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testParseOptimizationData_ThrowNegativeArraySizeException() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[5];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2147483616);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 18746176);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[4] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NegativeArraySizeException: -1651744112]
            org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(BlockRealMatrix.java:261)
            org.apache.commons.math3.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:107)
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:291)
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:72)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(gaussNewtonOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} 5 times
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightMatrixSqrt = squareRoot(((Weight) data).getWeight());
 *  */
    @Test
    public void testParseOptimizationData_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[5];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[2][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        blocks[1] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[4] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:295)
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:72)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: weightMatrixSqrt = squareRoot(((Weight) data).getWeight());
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} 5 times
 * @utbot.throwsException {@link java.lang.NullPointerException} in: weightMatrixSqrt = squareRoot(((Weight) data).getWeight());
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException_3() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[5];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2147483640);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1469331970);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[4] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:295)
            org.apache.commons.math3.linear.BlockRealMatrix.copy(BlockRealMatrix.java:72)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(gaussNewtonOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(OptimizationData data: optData)
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:250) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) null);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: weightMatrixSqrt = squareRoot(((Weight) data).getWeight());
 *  */
    @Test(expected = NoDataException.class)
    public void testParseOptimizationData_ThrowNoDataException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[1] = ((OptimizationData) weight);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: weightMatrixSqrt = squareRoot(((Weight) data).getWeight());
 *  */
    @Test(expected = NoDataException.class)
    public void testParseOptimizationData_ThrowNoDataException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link org.apache.commons.math3.linear.NonSquareMatrixException} in: weightMatrixSqrt = squareRoot(((Weight) data).getWeight());
 *  */
    @Test(expected = NonSquareMatrixException.class)
    public void testParseOptimizationData_ThrowNonSquareMatrixException() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 4.9E-324);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
            Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {0.0, 0.0};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
            optimizationDataArray[0] = ((OptimizationData) weight);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
            Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
            Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
            parseOptimizationDataMethod.setAccessible(true);
            java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
            parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
            try {
                parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} 5 times
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: weightMatrixSqrt = squareRoot(((Weight) data).getWeight());
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testParseOptimizationData_ThrowNotStrictlyPositiveException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[5];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[4] = ((OptimizationData) weight);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} 5 times
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: weightMatrixSqrt = squareRoot(((Weight) data).getWeight());
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testParseOptimizationData_ThrowNotStrictlyPositiveException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[5];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[4] = ((OptimizationData) weight);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test
    public void testParseOptimizationData1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[12];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseOptimizationData2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[16];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[3] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseOptimizationData3() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[32];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[3] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(gaussNewtonOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseOptimizationData4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[9];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[7] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:131)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseOptimizationData5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[11];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null
        };
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[2] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseOptimizationData6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[11];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[2] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseOptimizationData7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[10];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null,
            null,
            null
        };
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[1] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testParseOptimizationData8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[6][];
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
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[1] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:252) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData9() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", java.lang.Double.NaN);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[9];
            Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {0.0};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
            optimizationDataArray[0] = ((OptimizationData) weight);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
            Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
            Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
            parseOptimizationDataMethod.setAccessible(true);
            java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
            parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
            try {
                parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    @Test(expected = NoDataException.class)
    public void testParseOptimizationData10() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[15];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[6] = ((OptimizationData) weight);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(gaussNewtonOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NoDataException.class)
    public void testParseOptimizationData11() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[9];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[7] = ((OptimizationData) weight);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData12() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", java.lang.Double.NaN);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[14];
            ModelFunction modelFunction = new ModelFunction(null);
            optimizationDataArray[0] = ((OptimizationData) modelFunction);
            Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
            BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
            double[][] blocks = {};
            setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
            setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2);
            setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 2);
            setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
            optimizationDataArray[4] = ((OptimizationData) weight);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
            Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
            Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
            parseOptimizationDataMethod.setAccessible(true);
            java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
            parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
            try {
                parseOptimizationDataMethod.invoke(gaussNewtonOptimizer, parseOptimizationDataMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    @Test(expected = NonSquareMatrixException.class)
    public void testParseOptimizationData13() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", java.lang.Double.NaN);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[13];
            MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
            optimizationDataArray[0] = ((OptimizationData) maxEval);
            Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
            BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
            double[][] blocks = {};
            setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
            setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 14);
            setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
            setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
            optimizationDataArray[4] = ((OptimizationData) weight);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
            Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
            Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
            parseOptimizationDataMethod.setAccessible(true);
            java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
            parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
            try {
                parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    
    @Test(expected = NonSquareMatrixException.class)
    public void testParseOptimizationData14() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[21];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[4] = ((OptimizationData) weight);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(gaussNewtonOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData15() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[14];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[5] = ((OptimizationData) weight);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NonSquareMatrixException.class)
    public void testParseOptimizationData16() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[8];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[3] = ((OptimizationData) weight);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData17() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[11];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[2] = ((OptimizationData) weight);
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testParseOptimizationData18() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", java.lang.Double.NaN);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[18];
            Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
            Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[1][];
            double[] doubleArray = {0.0};
            data[0] = doubleArray;
            setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
            optimizationDataArray[1] = ((OptimizationData) weight);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
            Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
            Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
            parseOptimizationDataMethod.setAccessible(true);
            java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
            parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
            try {
                parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(org.apache.commons.math3.util.Precision.class, "EPSILON", prevEPSILON);
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test(timeout = 1000L)
    public void testParseOptimizationData19() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[6];
        ModelFunction modelFunction = new ModelFunction(null);
        optimizationDataArray[2] = ((OptimizationData) modelFunction);
        CMAESOptimizer.Sigma sigma = ((CMAESOptimizer.Sigma) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$Sigma"));
        optimizationDataArray[3] = ((OptimizationData) sigma);
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1469331970);
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 2147483626);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[4] = ((OptimizationData) weight);
        ModelFunction modelFunction1 = new ModelFunction(null);
        optimizationDataArray[5] = ((OptimizationData) modelFunction1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
        Class optimizationDataArrayType = Class.forName("[Lorg.apache.commons.math3.optim.OptimizationData;");
        Method parseOptimizationDataMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("parseOptimizationData", optimizationDataArrayType);
        parseOptimizationDataMethod.setAccessible(true);
        java.lang.Object[] parseOptimizationDataMethodArguments = new java.lang.Object[1];
        parseOptimizationDataMethodArguments[0] = ((Object) optimizationDataArray);
        try {
            parseOptimizationDataMethod.invoke(levenbergMarquardtOptimizer, parseOptimizationDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeWeightedJacobian([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
        MultivariateDifferentiableVectorFunction f = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(jacobian, "org.apache.commons.math3.analysis.differentiation.JacobianFunction", "f", f);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:54)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
        levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
        DifferentiableMultivariateVectorFunction this$0 = ((DifferentiableMultivariateVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18"));
        MultivariateDifferentiableVectorFunction val$f = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(this$0, "org.apache.commons.math3.analysis.FunctionUtils$18", "val$f", val$f);
        setField(jacobian, "org.apache.commons.math3.analysis.FunctionUtils$18$1", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.analysis.FunctionUtils$18$1.value(FunctionUtils.java:691)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
        levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7eb9bd7f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
            gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
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
            int[][] sizes = new int[1][];
            int[] intArray = {0};
            sizes[0] = intArray;
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
            levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
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
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1073741824);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
            levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
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
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
            levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2][];
            org.apache.commons.math3.analysis.differentiation.DSCompiler[] dSCompilerArray1 = new org.apache.commons.math3.analysis.differentiation.DSCompiler[2];
            DSCompiler dSCompiler = ((DSCompiler) createInstance("org.apache.commons.math3.analysis.differentiation.DSCompiler"));
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "order", 33554432);
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
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33554432 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:119)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
            levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
            gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowClassCastException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7eb9bd7f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.FunctionUtils$18$1.value(FunctionUtils.java:689)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
            gaussNewtonOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
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
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.FunctionUtils$18$1.value(FunctionUtils.java:689)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
            levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        DiagonalMatrix weightMatrixSqrt = ((DiagonalMatrix) createInstance("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
        Object f = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        GaussianFitter this$0 = ((GaussianFitter) createInstance("org.apache.commons.math3.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(f, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jacobian, "org.apache.commons.math3.analysis.differentiation.JacobianFunction", "f", f);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
        levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrixSqrt.multiply(MatrixUtils.createRealMatrix(computeJacobian(params)));
 *  */
    @Test
    public void testComputeWeightedJacobian_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
        DifferentiableMultivariateVectorFunction this$0 = ((DifferentiableMultivariateVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18"));
        Object val$f = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        PolynomialFitter this$01 = ((PolynomialFitter) createInstance("org.apache.commons.math3.optimization.fitting.PolynomialFitter"));
        ArrayList observations = new ArrayList();
        setField(this$01, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(val$f, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$01);
        setField(this$0, "org.apache.commons.math3.analysis.FunctionUtils$18", "val$f", val$f);
        setField(jacobian, "org.apache.commons.math3.analysis.FunctionUtils$18$1", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
        levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeWeightedJacobian([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeWeightedJacobian(double[])}
     */
    @Test
    public void testComputeWeightedJacobianThrowsNPEWithNonEmptyPrimitiveArray() {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = new LevenbergMarquardtOptimizer();
        double[] doubleArray = {-0.25};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65) */
        levenbergMarquardtOptimizer.computeWeightedJacobian(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeResiduals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeResiduals([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeResiduals(double[])}
 * @utbot.returnsFrom {@code return residuals;}
 *  */
    @Test
    public void testComputeResiduals_ReturnResiduals() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {};
        
        double[] actual = levenbergMarquardtOptimizer.computeResiduals(doubleArray);
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeResiduals(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < target.length; i++)} once
 * @utbot.returnsFrom {@code return residuals;}
 *  */
    @Test
    public void testComputeResiduals_IterateForLoop() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {2.2250741237566753E-308};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {0.0};
        
        double[] actual = levenbergMarquardtOptimizer.computeResiduals(doubleArray);
        
        double[] expected = {2.2250741237566753E-308};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeResiduals([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeResiduals(double[])}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getTarget()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objectiveValue.length != target.length
 *  */
    @Test
    public void testComputeResiduals_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeResiduals] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeResiduals(AbstractLeastSquaresOptimizer.java:223) */
        levenbergMarquardtOptimizer.computeResiduals(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeResiduals([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeResiduals(double[])}
 * @utbot.executesCondition {@code (objectiveValue.length != target.length): True}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getTarget()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: objectiveValue.length != target.length
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeResiduals_ThrowDimensionMismatchException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {1.265E-321, 4.778309726740827E-299};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] doubleArray = {0.0};
        
        gaussNewtonOptimizer.computeResiduals(doubleArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeResiduals([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeResiduals(double[])}
     */
    @Test
    public void testComputeResidualsThrowsNPEWithNonEmptyPrimitiveArray() {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = new LevenbergMarquardtOptimizer();
        double[] doubleArray = {-0.25};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeResiduals] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getTarget(MultivariateVectorOptimizer.java:110)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeResiduals(AbstractLeastSquaresOptimizer.java:222) */
        levenbergMarquardtOptimizer.computeResiduals(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method squareRoot(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:119)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:267) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 1.73833895195875E-310);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
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
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:401)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:267) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 4.9E-324);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
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
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:401)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:267) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", java.lang.Double.NaN);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
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
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:402)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:267) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 1.73833895195875E-310);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            int[] keys = new int[12];
            keys[0] = 1;
            keys[1] = 3;
            keys[2] = 2;
            keys[3] = 3;
            keys[4] = 3;
            keys[5] = 3;
            keys[6] = 3;
            keys[7] = 3;
            keys[8] = 3;
            keys[9] = 3;
            keys[10] = 3;
            keys[11] = 3;
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
            double[] values = {0.0};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:402)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:267) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 4.9E-324);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            int[] keys = new int[11];
            keys[1] = 3;
            keys[2] = 1;
            keys[3] = 3;
            keys[4] = 3;
            keys[5] = 3;
            keys[6] = 3;
            keys[7] = 3;
            keys[8] = 3;
            keys[9] = 3;
            keys[10] = 3;
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
            double[] values = {0.0};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
            byte[] states = {java.lang.Byte.MIN_VALUE};
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
            setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:401)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:267) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test
    public void testSquareRoot_ThrowNullPointerException() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 4.9E-324);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
            OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot] produces [java.lang.NullPointerException]
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
                org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
                org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetricInternal(MatrixUtils.java:401)
                org.apache.commons.math3.linear.MatrixUtils.isSymmetric(MatrixUtils.java:440)
                org.apache.commons.math3.linear.EigenDecomposition.<init>(EigenDecomposition.java:120)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.squareRoot(AbstractLeastSquaresOptimizer.java:267) */
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.linear.NonSquareMatrixException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test(expected = NonSquareMatrixException.class)
    public void testSquareRoot_ThrowNonSquareMatrixException() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", 2.225073858507202E-308);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
            setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", -1);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.linear.NonSquareMatrixException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test(expected = NonSquareMatrixException.class)
    public void testSquareRoot_ThrowNonSquareMatrixException_1() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", java.lang.Double.NaN);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = new double[2][];
            double[] doubleArray = {0.0};
            data[0] = doubleArray;
            data[1] = ((double[]) null);
            setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#squareRoot(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.linear.NonSquareMatrixException} in: final EigenDecomposition dec = new EigenDecomposition(m);
 *  */
    @Test(expected = NonSquareMatrixException.class)
    public void testSquareRoot_ThrowNonSquareMatrixException_2() throws Throwable  {
        double prevEPSILON = org.apache.commons.math3.util.Precision.EPSILON;
        try {
            Class precisionClazz = Class.forName("org.apache.commons.math3.util.Precision");
            setStaticField(precisionClazz, "EPSILON", java.lang.Double.NaN);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
            double[][] data = {null};
            setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
            
            Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer");
            Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
            Method squareRootMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("squareRoot", array2DRowRealMatrixType);
            squareRootMethod.setAccessible(true);
            java.lang.Object[] squareRootMethodArguments = new java.lang.Object[1];
            squareRootMethodArguments[0] = array2DRowRealMatrix;
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeCost([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getWeight()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#operate(org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.ArrayRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#sqrt(double)}
 * @utbot.returnsFrom {@code return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));}
 *  */
    @Test
    public void testComputeCost_FastMathSqrt() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray1 = {2.0522684006501214E-289};
        
        double actual = levenbergMarquardtOptimizer.computeCost(doubleArray1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeCost([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test
    public void testComputeCost_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:101)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:77) */
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#operate(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test
    public void testComputeCost_ThrowNegativeArraySizeException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", Integer.MIN_VALUE);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.linear.AbstractRealMatrix.operate(AbstractRealMatrix.java:658)
            org.apache.commons.math3.linear.AbstractRealMatrix.operate(AbstractRealMatrix.java:675)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:77) */
        gaussNewtonOptimizer.computeCost(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test
    public void testComputeCost_ThrowNullPointerException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:101)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:77) */
        gaussNewtonOptimizer.computeCost(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testComputeCost_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:101)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:77) */
        gaussNewtonOptimizer.computeCost(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testComputeCost_ThrowNullPointerException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:101)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:77) */
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeCost([D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test(expected = NoDataException.class)
    public void testComputeCost_ThrowNoDataException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray1 = {};
        
        levenbergMarquardtOptimizer.computeCost(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeCost_ThrowDimensionMismatchException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray1 = {};
        
        levenbergMarquardtOptimizer.computeCost(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeCost_ThrowDimensionMismatchException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray1 = {5.43230922487E-312, 7.291122019556404E-304};
        
        levenbergMarquardtOptimizer.computeCost(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test(expected = NoDataException.class)
    public void testComputeCost_ThrowNoDataException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {};
        
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeCost_ThrowDimensionMismatchException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {6.47582E-319, 6.63123685E-316};
        
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return FastMath.sqrt(r.dotProduct(getWeight().operate(r)));
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testComputeCost_ThrowDimensionMismatchException_3() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] doubleArray = {};
        
        gaussNewtonOptimizer.computeCost(doubleArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeCost([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCost(double[])}
     */
    @Test
    public void testComputeCostThrowsNPEWithNonEmptyPrimitiveArray() {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = new LevenbergMarquardtOptimizer();
        double[] doubleArray = {-0.25};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:101)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCost(AbstractLeastSquaresOptimizer.java:77) */
        levenbergMarquardtOptimizer.computeCost(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeSigma([D, double)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
        MultivariateDifferentiableVectorFunction f = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(jacobian, "org.apache.commons.math3.analysis.differentiation.JacobianFunction", "f", f);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:54)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
        levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
        DifferentiableMultivariateVectorFunction this$0 = ((DifferentiableMultivariateVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18"));
        MultivariateDifferentiableVectorFunction val$f = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(this$0, "org.apache.commons.math3.analysis.FunctionUtils$18", "val$f", val$f);
        setField(jacobian, "org.apache.commons.math3.analysis.FunctionUtils$18$1", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.analysis.FunctionUtils$18$1.value(FunctionUtils.java:691)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
        levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException() throws Exception  {
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
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
            gaussNewtonOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
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
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "parameters", 1073741824);
            int[][] sizes = {null};
            setField(dSCompiler, "org.apache.commons.math3.analysis.differentiation.DSCompiler", "sizes", sizes);
            dSCompilerArray1[1] = dSCompiler;
            dSCompilerArray[1] = dSCompilerArray1;
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
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
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testComputeSigma_ThrowNegativeArraySizeException() throws Exception  {
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
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
            levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeSigma_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7eb9bd7f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
            gaussNewtonOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        DiagonalMatrix weightMatrixSqrt = ((DiagonalMatrix) createInstance("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
        Object f = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        PolynomialFitter this$0 = ((PolynomialFitter) createInstance("org.apache.commons.math3.optimization.fitting.PolynomialFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(f, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jacobian, "org.apache.commons.math3.analysis.differentiation.JacobianFunction", "f", f);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
        levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeSigma_ThrowClassCastException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7eb9bd7f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.FunctionUtils$18$1.value(FunctionUtils.java:689)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
            gaussNewtonOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] cov = computeCovariances(params, covarianceSingularityThreshold);
 *  */
    @Test
    public void testComputeSigma_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        BlockRealMatrix weightMatrixSqrt = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
        DifferentiableMultivariateVectorFunction this$0 = ((DifferentiableMultivariateVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18"));
        Object val$f = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        GaussianFitter this$01 = ((GaussianFitter) createInstance("org.apache.commons.math3.optimization.fitting.GaussianFitter"));
        ArrayList observations = new ArrayList();
        setField(this$01, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(val$f, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$01);
        setField(this$0, "org.apache.commons.math3.analysis.FunctionUtils$18", "val$f", val$f);
        setField(jacobian, "org.apache.commons.math3.analysis.FunctionUtils$18$1", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
        gaussNewtonOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nC = params.length;
 *  */
    @Test
    public void testComputeSigma_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:169) */
        levenbergMarquardtOptimizer.computeSigma(null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeSigma([D, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeSigma(double[],double)}
     */
    @Test
    public void testComputeSigmaThrowsNPEWithNonEmptyPrimitiveArrayAndCornerCase() {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = new LevenbergMarquardtOptimizer();
        double[] doubleArray = {-1.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeSigma(AbstractLeastSquaresOptimizer.java:171) */
        levenbergMarquardtOptimizer.computeSigma(doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.setCost
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCost(double)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#setCost(double)}
 *  */
    @Test
    public void testSetCost() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setCost(0.0);
        
        levenbergMarquardtOptimizer.setCost(java.lang.Double.NaN);
        
        double finalLevenbergMarquardtOptimizerCost = ((Double) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "cost"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalLevenbergMarquardtOptimizerCost, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getChiSquare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getChiSquare()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.returnsFrom {@code return cost * cost;}
 *  */
    @Test
    public void testGetChiSquare_ReturnCostMultiplyCost() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setCost(0.0);
        
        double actual = levenbergMarquardtOptimizer.getChiSquare();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeCovariances([D, double)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
        MultivariateDifferentiableVectorFunction f = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(jacobian, "org.apache.commons.math3.analysis.differentiation.JacobianFunction", "f", f);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:54)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
        levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
        DifferentiableMultivariateVectorFunction this$0 = ((DifferentiableMultivariateVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18"));
        MultivariateDifferentiableVectorFunction val$f = ((MultivariateDifferentiableVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$19"));
        setField(this$0, "org.apache.commons.math3.analysis.FunctionUtils$18", "val$f", val$f);
        setField(jacobian, "org.apache.commons.math3.analysis.FunctionUtils$18$1", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$19.value(FunctionUtils.java:742)
            org.apache.commons.math3.analysis.FunctionUtils$18$1.value(FunctionUtils.java:691)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
        levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeCovariances_ThrowClassCastException() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7eb9bd7f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.FunctionUtils$18$1.value(FunctionUtils.java:689)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
            gaussNewtonOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testComputeCovariances_ThrowClassCastException_1() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            byte[] byteArray = {};
            AtomicReference compilers = new AtomicReference(byteArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ClassCastException: class [B cannot be cast to class [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; ([B is in module java.base of loader 'bootstrap'; [[Lorg.apache.commons.math3.analysis.differentiation.DSCompiler; is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @7eb9bd7f)]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:188)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
            gaussNewtonOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
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
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:93)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.FunctionUtils$18$1.value(FunctionUtils.java:689)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
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
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.FunctionUtils$18$1.value(FunctionUtils.java:689)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
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
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getSize(DSCompiler.java:642)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.FunctionUtils$18$1.value(FunctionUtils.java:689)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Class dSCompilerClazz = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        AtomicReference prevCompilers = ((AtomicReference) getStaticFieldValue(dSCompilerClazz, "compilers"));
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler[][] dSCompilerArray = {};
            AtomicReference compilers = new AtomicReference(dSCompilerArray);
            setStaticField(dSCompilerClazz, "compilers", compilers);
            GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
                org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler(DSCompiler.java:198)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
            gaussNewtonOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
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
            LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
            JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
            setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
            double[] doubleArray = {0.0};
            
            /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.NegativeArraySizeException: -2147483648]
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:74)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:82)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:92)
                org.apache.commons.math3.analysis.differentiation.DerivativeStructure.<init>(DerivativeStructure.java:111)
                org.apache.commons.math3.analysis.differentiation.JacobianFunction.value(JacobianFunction.java:50)
                org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
                org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
            levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
        } finally {
            setStaticField(DSCompiler.class, "compilers", prevCompilers);
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        DiagonalMatrix weightMatrixSqrt = ((DiagonalMatrix) createInstance("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        JacobianFunction jacobian = ((JacobianFunction) createInstance("org.apache.commons.math3.analysis.differentiation.JacobianFunction"));
        Object f = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        PolynomialFitter this$0 = ((PolynomialFitter) createInstance("org.apache.commons.math3.optimization.fitting.PolynomialFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(f, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jacobian, "org.apache.commons.math3.analysis.differentiation.JacobianFunction", "f", f);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
        levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix j = computeWeightedJacobian(params);
 *  */
    @Test
    public void testComputeCovariances_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        MultivariateMatrixFunction jacobian = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18$1"));
        DifferentiableMultivariateVectorFunction this$0 = ((DifferentiableMultivariateVectorFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$18"));
        Object val$f = createInstance("org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        PolynomialFitter this$01 = ((PolynomialFitter) createInstance("org.apache.commons.math3.optimization.fitting.PolynomialFitter"));
        ArrayList observations = new ArrayList();
        setField(this$01, "org.apache.commons.math3.optimization.fitting.CurveFitter", "observations", observations);
        setField(val$f, "org.apache.commons.math3.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$01);
        setField(this$0, "org.apache.commons.math3.analysis.FunctionUtils$18", "val$f", val$f);
        setField(jacobian, "org.apache.commons.math3.analysis.FunctionUtils$18$1", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer", "jacobian", jacobian);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:130)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
        levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method computeCovariances([D, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#computeCovariances(double[],double)}
     */
    @Test
    public void testComputeCovariancesThrowsNPEWithNonEmptyPrimitiveArrayAndCornerCase() {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = new LevenbergMarquardtOptimizer();
        double[] doubleArray = {-1.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.computeJacobian(JacobianMultivariateVectorOptimizer.java:60)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeWeightedJacobian(AbstractLeastSquaresOptimizer.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.computeCovariances(AbstractLeastSquaresOptimizer.java:142) */
        levenbergMarquardtOptimizer.computeCovariances(doubleArray, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getRMS
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRMS()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getRMS()}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getTargetSize()}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#sqrt(double)}
 * @utbot.returnsFrom {@code return FastMath.sqrt(getChiSquare() / getTargetSize());}
 *  */
    @Test
    public void testGetRMS_FastMathSqrt() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setCost(0.0);
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        
        double actual = levenbergMarquardtOptimizer.getRMS();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getRMS()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#getRMS()}
     */
    @Test
    public void testGetRMSThrowsNPE() {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = new LevenbergMarquardtOptimizer();
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getRMS] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getTargetSize(MultivariateVectorOptimizer.java:119)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getRMS(AbstractLeastSquaresOptimizer.java:92) */
        levenbergMarquardtOptimizer.getRMS();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.optimize(optData);
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:159)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:90)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parseOptimizationData(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:250)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:201) */
        levenbergMarquardtOptimizer.optimize(((org.apache.commons.math3.optim.OptimizationData[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.optimize(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:159)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:90)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.optimize(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:159)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:90)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.optimize(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ModelFunctionJacobian modelFunctionJacobian = new ModelFunctionJacobian(null);
        optimizationDataArray[0] = ((OptimizationData) modelFunctionJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:159)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:90)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.optimize(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Target target = ((Target) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Target"));
        double[] target1 = {2.0E-323, 2.2250738585072014E-308};
        setField(target, "org.apache.commons.math3.optim.nonlinear.vector.Target", "target", target1);
        optimizationDataArray[0] = ((OptimizationData) target);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:159)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:90)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return super.optimize(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_5() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ModelFunction modelFunction = new ModelFunction(null);
        optimizationDataArray[0] = ((OptimizationData) modelFunction);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:159)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:90)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return super.optimize(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -3);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return super.optimize(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test
    public void testOptimize1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = new double[17];
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        double[] doubleArray = new double[17];
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {2.4922558957990473E-206};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:125)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {java.lang.Double.NaN};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Target target = ((Target) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Target"));
        double[] target1 = {};
        setField(target, "org.apache.commons.math3.optim.nonlinear.vector.Target", "target", target1);
        optimizationDataArray[0] = ((OptimizationData) target);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:125)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:125)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:126)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize5() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData(BaseOptimizer.java:177)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:123)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize6() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", target);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", target);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData(BaseOptimizer.java:181)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:123)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize7() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:126)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize8() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:281)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:107)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:128)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize9() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
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
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {-9.15253507224394E307};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {java.lang.Double.NaN};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:125)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize10() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = new double[17];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 17);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = {};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", start);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:125)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize11() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = new double[20];
        init[0] = 1.58E-322;
        init[1] = 6.63123685E-316;
        init[2] = 2.0237E-320;
        init[3] = 2.2250738585072034E-308;
        init[5] = 2.716154612436E-312;
        init[8] = 3.39519326554E-313;
        init[9] = 4.450147717014909E-308;
        init[11] = 4.9E-324;
        init[13] = 2.2250738585072014E-308;
        init[15] = 2.225073858507217E-308;
        init[16] = 2.0;
        init[17] = 1.58E-322;
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:125)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:70)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.optimize(MultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.optimize(JacobianMultivariateVectorOptimizer.java:89)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:203) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize12() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", target);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", target);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize13() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize14() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {-4.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {2.0000000000000004};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize15() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize16() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        data[0] = target;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {-4.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {2.0000000000000004};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize17() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {2.3204400042324097E77};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {4.782697411561485E-153};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize18() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize19() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
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
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {2.04678874993914E-115};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {2.04678874993914E-115};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {3.834169818706532E-152};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize20() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ModelFunctionJacobian modelFunctionJacobian = new ModelFunctionJacobian(null);
        optimizationDataArray[0] = ((OptimizationData) modelFunctionJacobian);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize21() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize22() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = new double[17];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 17);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = new double[32];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = new double[32];
        lower[1] = 1.0E-323;
        lower[3] = 5.562684646268003E-309;
        lower[5] = 2.0;
        lower[7] = 2.2250738585072014E-308;
        lower[9] = 8.289046E-317;
        lower[10] = 1.6578092E-316;
        lower[12] = 6.63123685E-316;
        lower[13] = 2.2598406375463764E-308;
        lower[15] = 2.0722615E-317;
        lower[16] = 7.291122019559713E-304;
        lower[22] = -0.0;
        lower[24] = 1.32624737E-315;
        lower[26] = 2.225073858507202E-308;
        lower[29] = -0.0;
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        double[] upper = {};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", upper);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize23() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] upperBound = {-6.663911142392537E-269};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {1.871647820337088E-307};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize24() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 10);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = new double[12];
        lower[0] = 8.6916947597938E-311;
        lower[3] = 4.450147717014403E-308;
        lower[5] = 4.45014784963914E-308;
        lower[6] = 1.0609978955E-314;
        lower[7] = 2.2250738585072014E-308;
        lower[9] = 4.9E-324;
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        double[] upper = {};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", upper);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize25() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {3.981707197348944E19};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {-7.841724654480552E-270};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ModelFunctionJacobian modelFunctionJacobian = new ModelFunctionJacobian(null);
        optimizationDataArray[0] = ((OptimizationData) modelFunctionJacobian);
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields718715880776800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields718715880776800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass718715880783300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields718715880776800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass718715880783300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields718715881251600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields718715881251600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass718715881253700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields718715881251600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass718715881253700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields718715881645400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields718715881645400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass718715881647200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields718715881645400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass718715881647200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields718715882275300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields718715882275300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass718715882277000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields718715882275300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass718715882277000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

