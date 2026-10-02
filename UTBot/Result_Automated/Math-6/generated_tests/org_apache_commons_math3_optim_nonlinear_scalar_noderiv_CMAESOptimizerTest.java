package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import java.lang.reflect.Method;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.random.SynchronizedRandomGenerator;
import java.util.Random;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.RandomAdaptor;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.MersenneTwister;
import java.util.List;
import org.apache.commons.math3.linear.BlockRealMatrix;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class org_apache_commons_math3_optim_nonlinear_scalar_noderiv_CMAESOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTimes_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1026) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTimes_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1026) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTimes_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1026) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTimes_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTimes_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#times(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTimes_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testTimes1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 5);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.times(CMAESOptimizer.java:1029) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    @Test(expected = OutOfRangeException.class)
    public void testTimes3() throws Throwable  {
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
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    @Test(expected = NoDataException.class)
    public void testTimes4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[4][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    @Test(expected = NoDataException.class)
    public void testTimes5() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null
        };
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    ///endregion
    
    ///region OTHER: TIMEOUTS for method times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testTimes6() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
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
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sqrt(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSqrt_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt(CMAESOptimizer.java:996) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSqrt_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt(CMAESOptimizer.java:996) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSqrt_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt(CMAESOptimizer.java:999) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt(CMAESOptimizer.java:999) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = Math.sqrt(m.getEntry(r, c));
 *  */
    @Test
    public void testSqrt_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt(CMAESOptimizer.java:999) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSqrt_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt(CMAESOptimizer.java:996) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt(CMAESOptimizer.java:999) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt(CMAESOptimizer.java:999) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSqrt_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSqrt_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sqrt(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSqrt_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region OTHER: ERROR SUITE for method sqrt(org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testSqrt1() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sqrt] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sqrt(org.apache.commons.math3.linear.RealMatrix)
    
    @Test(expected = NoDataException.class)
    public void testSqrt2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region OTHER: TIMEOUTS for method sqrt(org.apache.commons.math3.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testSqrt3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
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
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method log(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testLog_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(CMAESOptimizer.java:982) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(CMAESOptimizer.java:982) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(CMAESOptimizer.java:985) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(CMAESOptimizer.java:985) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[r][c] = Math.log(m.getEntry(r, c));
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(CMAESOptimizer.java:985) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testLog_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(CMAESOptimizer.java:982) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(CMAESOptimizer.java:985) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(CMAESOptimizer.java:985) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testLog_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testLog_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#log(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testLog_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region OTHER: ERROR SUITE for method log(org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testLog1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log(CMAESOptimizer.java:985) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    @Test
    public void testLog2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.log] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method log(org.apache.commons.math3.linear.RealMatrix)
    
    @Test(expected = NoDataException.class)
    public void testLog3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null,
            null
        };
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region OTHER: TIMEOUTS for method log(org.apache.commons.math3.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testLog4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
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
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    @Test(timeout = 1000L)
    public void testLog5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            79, 1, 79, 79, 79, 79, 79, 79,
            79, 79
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(double[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", doubleArrayType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(double[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.length; r++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_MinLessOrEqualROfM() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {1.7976931348623157E308};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", doubleArrayType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(double[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.length; r++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_MinGreaterThanROfM() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", doubleArrayType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method min([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int r = 0; r < m.length; r++)
 *  */
    @Test
    public void testMin_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(CMAESOptimizer.java:1259) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(double[])}
     */
    @Test
    public void testMinReturnsInfinityWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {java.lang.Double.NaN, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", doubleArrayType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IterateForLoop() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IterateForLoop_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", array2DRowRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IterateForLoop_2() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", array2DRowRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", array2DRowRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IterateForLoop_4() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", array2DRowRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
        
        double[][] array2DRowRealMatrixData = ((double[][]) getFieldValue(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalArray2DRowRealMatrixData0 = ((double[]) get(array2DRowRealMatrixData, 0));
        
        assertNull(finalArray2DRowRealMatrixData0);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_MinLessOrEqualE() throws Exception  {
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_MinLessOrEqualE_1() throws Exception  {
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(1.7976931348623157E308, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method min(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMin_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(CMAESOptimizer.java:1230) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMin_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(CMAESOptimizer.java:1230) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMin_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(CMAESOptimizer.java:1230) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMin_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(CMAESOptimizer.java:1230) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int r = 0; r < m.getRowDimension(); r++)
 *  */
    @Test
    public void testMin_ThrowNullPointerException1() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(CMAESOptimizer.java:1228) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(CMAESOptimizer.java:1230) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#min(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double e = m.getEntry(r, c);
 *  */
    @Test
    public void testMin_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.min(CMAESOptimizer.java:1230) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method min(org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testMin1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 65537);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NEGATIVE_INFINITY);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method minMethod = cMAESOptimizerClazz.getDeclaredMethod("min", openMapRealMatrixType);
        minMethod.setAccessible(true);
        java.lang.Object[] minMethodArguments = new java.lang.Object[1];
        minMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) minMethod.invoke(null, minMethodArguments));
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(double[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", doubleArrayType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(double[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.length; r++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_MaxGreaterOrEqualROfM() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {-1.7976931348623157E308};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", doubleArrayType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(double[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.length; r++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_MaxLessThanROfM() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", doubleArrayType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method max([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int r = 0; r < m.length; r++)
 *  */
    @Test
    public void testMax_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(CMAESOptimizer.java:1245) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(double[])}
     */
    @Test
    public void testMaxWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {java.lang.Double.NaN, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", doubleArrayType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = ((Object) doubleArray);
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IterateForLoop() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IterateForLoop_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", array2DRowRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IterateForLoop_2() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", array2DRowRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", array2DRowRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IterateForLoop_4() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", array2DRowRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = array2DRowRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
        
        double[][] array2DRowRealMatrixData = ((double[][]) getFieldValue(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalArray2DRowRealMatrixData0 = ((double[]) get(array2DRowRealMatrixData, 0));
        
        assertNull(finalArray2DRowRealMatrixData0);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(4.9E-324, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method max(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(CMAESOptimizer.java:1213) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(CMAESOptimizer.java:1213) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(CMAESOptimizer.java:1213) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(CMAESOptimizer.java:1213) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int r = 0; r < m.getRowDimension(); r++)
 *  */
    @Test
    public void testMax_ThrowNullPointerException1() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(CMAESOptimizer.java:1211) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(CMAESOptimizer.java:1213) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#max(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max(CMAESOptimizer.java:1213) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method max(org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testMax1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[11];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method maxMethod = cMAESOptimizerClazz.getDeclaredMethod("max", openMapRealMatrixType);
        maxMethod.setAccessible(true);
        java.lang.Object[] maxMethodArguments = new java.lang.Object[1];
        maxMethodArguments[0] = openMapRealMatrix;
        double actual = ((Double) maxMethod.invoke(null, maxMethodArguments));
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method max(org.apache.commons.math3.linear.RealMatrix)
    
    @Test
    public void testMax2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -1.7976931348623157E308);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.max] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
            1, 0, 3, 3, 3, 3, 3, 3,
            3, 3
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
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
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
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize
    
    ///region OTHER: ERROR SUITE for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test
    public void testOptimize1() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize2() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[1] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize3() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize4() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[1] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize(CMAESOptimizer.java:370)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize(CMAESOptimizer.java:79)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize5() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize6() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize7() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        CMAESOptimizer.Sigma sigma = ((CMAESOptimizer.Sigma) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$Sigma"));
        optimizationDataArray[0] = ((OptimizationData) sigma);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$Sigma.getSigma(CMAESOptimizer.java:304)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.parseOptimizationData(CMAESOptimizer.java:536)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize8() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        CMAESOptimizer.PopulationSize populationSize = ((CMAESOptimizer.PopulationSize) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize"));
        optimizationDataArray[0] = ((OptimizationData) populationSize);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize9() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize10() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize11() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize12() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize13() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {5.815998708602053E306};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {java.lang.Double.NaN};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize14() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = {
            3.39519326554E-313, 2.87034527747429E-306, 2.0237E-320, 4.243991582E-314, 6.63123685E-316, 2.0,
            2.2250781024987833E-308, 7.291149832979629E-304, 0.0
        };
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        double[] upper = {};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", upper);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize15() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        GoalType goalType = GoalType.MAXIMIZE;
        optimizationDataArray[0] = ((OptimizationData) goalType);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize16() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ObjectiveFunction objectiveFunction = new ObjectiveFunction(null);
        optimizationDataArray[0] = ((OptimizationData) objectiveFunction);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize17() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize18() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize19() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize20() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.optimize(CMAESOptimizer.java:363) */
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize21() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize22() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize23() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {4.110580621509028E-289};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {1.5158318265022026E-269};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize24() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {-1.0339086425933911E121, 0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-3.501746172422704E-105, 0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize25() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize26() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize27() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {9.791265987867335E-299};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {-3.323061453521878E-288};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        NonLinearConjugateGradientOptimizer.BracketingStep bracketingStep = new NonLinearConjugateGradientOptimizer.BracketingStep(0.0);
        optimizationDataArray[0] = ((OptimizationData) bracketingStep);
        
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize28() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize29() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        cMAESOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.reverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reverse([I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#reverse(int[])}
 * @utbot.returnsFrom {@code return reverse;}
 *  */
    @Test
    public void testReverse_ReturnReverse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method reverseMethod = cMAESOptimizerClazz.getDeclaredMethod("reverse", intArrayType);
        reverseMethod.setAccessible(true);
        java.lang.Object[] reverseMethodArguments = new java.lang.Object[1];
        reverseMethodArguments[0] = ((Object) intArray);
        int[] actual = ((int[]) reverseMethod.invoke(null, reverseMethodArguments));
        
        int[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#reverse(int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < indices.length; i++)} once
 * @utbot.returnsFrom {@code return reverse;}
 *  */
    @Test
    public void testReverse_IterateForLoop() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {-255};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method reverseMethod = cMAESOptimizerClazz.getDeclaredMethod("reverse", intArrayType);
        reverseMethod.setAccessible(true);
        java.lang.Object[] reverseMethodArguments = new java.lang.Object[1];
        reverseMethodArguments[0] = ((Object) intArray);
        int[] actual = ((int[]) reverseMethod.invoke(null, reverseMethodArguments));
        
        int[] expected = {-255};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reverse([I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#reverse(int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int[] reverse = new int[indices.length];
 *  */
    @Test
    public void testReverse_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.reverse] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.reverse(CMAESOptimizer.java:1284) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#reverse(int[])}
     */
    @Test
    public void testReverseWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {0, -1, Integer.MAX_VALUE};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method reverseMethod = cMAESOptimizerClazz.getDeclaredMethod("reverse", intArrayType);
        reverseMethod.setAccessible(true);
        java.lang.Object[] reverseMethodArguments = new java.lang.Object[1];
        reverseMethodArguments[0] = ((Object) intArray);
        int[] actual = ((int[]) reverseMethod.invoke(null, reverseMethodArguments));
        
        int[] expected = {Integer.MAX_VALUE, -1, 0};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sequence
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sequence(double, double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sequence(double,double,double)}
     */
    @Test(expected = NoDataException.class)
    public void testSequenceThrowsNDEWithCornerCases() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.push
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method push([D, double)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#push(double[],double)}
 *  */
    @Test
    public void testPush() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method pushMethod = cMAESOptimizerClazz.getDeclaredMethod("push", doubleArrayType, doubleType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[2];
        pushMethodArguments[0] = ((Object) doubleArray);
        pushMethodArguments[1] = java.lang.Double.NaN;
        pushMethod.invoke(null, pushMethodArguments);
        
        double finalDoubleArray0 = doubleArray[0];
        
        assertEquals(java.lang.Double.NaN, finalDoubleArray0, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#push(double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = vals.length - 1; i > 0; i--)} once
 *  */
    @Test
    public void testPush_IterateForLoop() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, 0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method pushMethod = cMAESOptimizerClazz.getDeclaredMethod("push", doubleArrayType, doubleType);
        pushMethod.setAccessible(true);
        java.lang.Object[] pushMethodArguments = new java.lang.Object[2];
        pushMethodArguments[0] = ((Object) doubleArray);
        pushMethodArguments[1] = java.lang.Double.NaN;
        pushMethod.invoke(null, pushMethodArguments);
        
        double finalDoubleArray0 = doubleArray[0];
        
        assertEquals(java.lang.Double.NaN, finalDoubleArray0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method push([D, double)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#push(double[],double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: vals[0] = val;
 *  */
    @Test
    public void testPush_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.push] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.push(CMAESOptimizer.java:807) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#push(double[],double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = vals.length - 1; i > 0; i--)
 *  */
    @Test
    public void testPush_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.push] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.push(CMAESOptimizer.java:804) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#push(double[],double)}
     */
    @Test
    public void testPushWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        
        assertEquals(1.1235582092889477E307, finalDoubleArray0, 1.0E-6);
        
        assertEquals(0.0, finalDoubleArray1, 1.0E-6);
        
        assertEquals(java.lang.Double.NEGATIVE_INFINITY, finalDoubleArray2, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testDivide_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1041) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testDivide_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1041) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1044) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1044) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1044) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1044) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testDivide_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1041) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1044) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1044) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1044) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1044) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1044) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDivide_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDivide_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDivide_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#divide(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, c) / n.getEntry(r, c);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDivide_ThrowOutOfRangeException_2() throws Throwable  {
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 5);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void testDivide3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide(CMAESOptimizer.java:1044) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void testDivide4() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.divide] produces [java.lang.NullPointerException] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method divideMethod = cMAESOptimizerClazz.getDeclaredMethod("divide", openMapRealMatrixType, openMapRealMatrixType);
        divideMethod.setAccessible(true);
        java.lang.Object[] divideMethodArguments = new java.lang.Object[2];
        divideMethodArguments[0] = openMapRealMatrix;
        divideMethodArguments[1] = openMapRealMatrix;
        try {
            divideMethod.invoke(null, divideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    @Test(expected = NoDataException.class)
    public void testDivide5() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    @Test(expected = NoDataException.class)
    public void testDivide6() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void testDivide7() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            3, 0, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void testDivide8() throws Throwable  {
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
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method square(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method square(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSquare_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(CMAESOptimizer.java:1010) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSquare_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(CMAESOptimizer.java:1010) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSquare_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(CMAESOptimizer.java:1013) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(CMAESOptimizer.java:1013) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(CMAESOptimizer.java:1013) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
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
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(CMAESOptimizer.java:1013) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testSquare_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(CMAESOptimizer.java:1010) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSquare_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(CMAESOptimizer.java:1013) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.square(CMAESOptimizer.java:1013) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSquare_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSquare_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSquare_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#square(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSquare_ThrowNoDataException_3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void testSquare1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 9);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 3, 3, 3, 3, 3, 3, 3,
            3
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
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method selectColumns(org.apache.commons.math3.linear.RealMatrix, [I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSelectColumns_IterateForLoop_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSelectColumns_IterateForLoop() throws Exception  {
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testSelectColumns_IterateForLoop_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method selectColumns(org.apache.commons.math3.linear.RealMatrix, [I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[m.getRowDimension()][cols.length];
 *  */
    @Test
    public void testSelectColumns_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", Integer.MIN_VALUE);
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1056) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1059) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 64 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1059) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1059) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
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
        int[] keys = {-320602176, -133056};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        int[] intArray = {63};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1059) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1059) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1059) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[m.getRowDimension()][cols.length];
 *  */
    @Test
    public void testSelectColumns_ThrowNullPointerException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1056) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[m.getRowDimension()][cols.length];
 *  */
    @Test
    public void testSelectColumns_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1056) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[m.getRowDimension()][cols.length];
 *  */
    @Test
    public void testSelectColumns_ThrowNullPointerException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1056) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[m.getRowDimension()][cols.length];
 *  */
    @Test
    public void testSelectColumns_ThrowNullPointerException_3() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1056) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1059) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.selectColumns(CMAESOptimizer.java:1059) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSelectColumns_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        int[] intArray = {-255};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSelectColumns_ThrowOutOfRangeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        int[] intArray = {0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSelectColumns_ThrowOutOfRangeException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        int[] intArray = {-1};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSelectColumns_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        int[] intArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSelectColumns_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        int[] intArray = {-255};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#selectColumns(org.apache.commons.math3.linear.RealMatrix,int[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = m.getEntry(r, cols[c]);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSelectColumns_ThrowOutOfRangeException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        int[] intArray = {-1};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (inputSigma != null): False}
 *  */
    @Test
    public void testCheckParameters_InputSigmaEqualsNull_1() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {3.785766995733894E-270};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (inputSigma != null): True}
 * @utbot.executesCondition {@code (inputSigma.length != init.length): False}
 *  */
    @Test
    public void testCheckParameters_InputSigmaLengthEqualsInitLength() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] inputSigma = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] start = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (inputSigma != null): False}
 *  */
    @Test
    public void testCheckParameters_InputSigmaEqualsNull() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {5.06E-321, 3.16E-322};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (inputSigma != null): False}
 *  */
    @Test
    public void testCheckParameters_InputSigmaEqualsNull_2() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] upperBound = {1.265E-321, 0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (inputSigma != null): True}
 * @utbot.executesCondition {@code (inputSigma.length != init.length): True}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#getStartPoint()}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#getLowerBound()}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#getUpperBound()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: inputSigma.length != init.length
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testCheckParameters_ThrowDimensionMismatchException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] inputSigma = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] start = {1.295163E-318, 2.0722615E-317};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (inputSigma.length != init.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < init.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: inputSigma[i] > uB[i] - lB[i]
 *  */
    @Test
    public void testCheckParameters_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] inputSigma = {4.9E-324};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] start = {4.450147717014403E-308};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", inputSigma);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters(CMAESOptimizer.java:561) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (inputSigma.length != init.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < init.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: inputSigma[i] > uB[i] - lB[i]
 *  */
    @Test
    public void testCheckParameters_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] inputSigma = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] start = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters(CMAESOptimizer.java:561) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (inputSigma.length != init.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < init.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inputSigma[i] > uB[i] - lB[i]
 *  */
    @Test
    public void testCheckParameters_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] inputSigma = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] start = {8.4879831639E-314};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters(CMAESOptimizer.java:561) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Method checkParametersMethod = cMAESOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(cMAESOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#checkParameters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inputSigma.length != init.length
 *  */
    @Test
    public void testCheckParameters_ThrowNullPointerException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] inputSigma = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] upperBound = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.checkParameters(CMAESOptimizer.java:557) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: initializeCMA(guess);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        double[] inputSigma = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "dimension", -255);
        GoalType goal = GoalType.MAXIMIZE;
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {1.7800590868057611E-307, 0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:580)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize(CMAESOptimizer.java:375) */
        cMAESOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: isMinimize = getGoalType().equals(GoalType.MINIMIZE);
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize(CMAESOptimizer.java:370) */
        cMAESOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: dimension = guess.length;
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException_1() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        GoalType goal = GoalType.MAXIMIZE;
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize(CMAESOptimizer.java:374) */
        cMAESOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: initializeCMA(guess);
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException_2() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "dimension", -255);
        GoalType goal = GoalType.MINIMIZE;
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {2.0000000000000018};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:580)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.doOptimize(CMAESOptimizer.java:375) */
        cMAESOptimizer.doOptimize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: initializeCMA(guess);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testDoOptimize_ThrowNotStrictlyPositiveException() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "dimension", -255);
        GoalType goal = GoalType.MINIMIZE;
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {6.47582E-319, 1.32624737E-315};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        cMAESOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: initializeCMA(guess);
 *  */
    @Test(expected = NoDataException.class)
    public void testDoOptimize_ThrowNoDataException() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "dimension", -255);
        GoalType goal = GoalType.MINIMIZE;
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        cMAESOptimizer.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initializeCMA([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: final RealMatrix insigma = new Array2DRowRealMatrix(sigmaArray, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testInitializeCMA_ThrowNoDataException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        double[] doubleArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (lambda <= 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} when: lambda <= 0
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testInitializeCMA_ThrowNotStrictlyPositiveException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initializeCMA([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < guess.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sigmaArray[i][0] = inputSigma[i];
 *  */
    @Test
    public void testInitializeCMA_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        double[] inputSigma = {};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:580) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < guess.length; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sigmaArray[i][0] = inputSigma[i];
 *  */
    @Test
    public void testInitializeCMA_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        double[] inputSigma = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:580) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#initializeCMA(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] sigmaArray = new double[guess.length][1];
 *  */
    @Test
    public void testInitializeCMA_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:578) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method initializeCMA([D)
    
    @Test(expected = NoDataException.class)
    public void testInitializeCMA1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        double[] inputSigma = {
            -1.7976931348623157E308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    @Test(expected = NotStrictlyPositiveException.class)
    public void testInitializeCMA2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 2);
        double[] inputSigma = new double[11];
        inputSigma[0] = -9.660455190528E12;
        inputSigma[1] = 5.721395938065834E-283;
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] doubleArray = {0.0, 0.0, 0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void testInitializeCMA3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        double[] inputSigma = {
            -1.7976931348623157E308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "sigma", java.lang.Double.NaN);
        double[] doubleArray = {0.0, 0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void testInitializeCMA4() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        double[] inputSigma = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "stopTolUpX", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "sigma", 0.0);
        double[] doubleArray = {0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void testInitializeCMA5() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        double[] inputSigma = {
            -1.7976931348623157E308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "stopTolUpX", java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "sigma", 0.0);
        double[] doubleArray = {0.0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void testInitializeCMA6() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        double[] inputSigma = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "inputSigma", inputSigma);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:580) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    public void testInitializeCMA7() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "lambda", 1);
        double[] doubleArray = new double[15];
        doubleArray[0] = java.lang.Double.NaN;
        doubleArray[1] = java.lang.Double.NaN;
        doubleArray[2] = java.lang.Double.NaN;
        doubleArray[3] = java.lang.Double.NaN;
        doubleArray[4] = java.lang.Double.NaN;
        doubleArray[5] = java.lang.Double.NaN;
        doubleArray[6] = java.lang.Double.NaN;
        doubleArray[7] = java.lang.Double.NaN;
        doubleArray[8] = java.lang.Double.NaN;
        doubleArray[9] = java.lang.Double.NaN;
        doubleArray[10] = java.lang.Double.NaN;
        doubleArray[11] = java.lang.Double.NaN;
        doubleArray[12] = java.lang.Double.NaN;
        doubleArray[13] = java.lang.Double.NaN;
        doubleArray[14] = java.lang.Double.NaN;
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.initializeCMA(CMAESOptimizer.java:580) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateBD
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateBD(double)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateBD(double)}
 * @utbot.executesCondition {@code (ccov1 + ccovmu + negccov > 0): False}
 *  */
    @Test
    public void testUpdateBD_Ccov1PlusCcovmuPlusNegccovLessOrEqualZero() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1", -3.89624521138216E-308);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmu", java.lang.Double.NaN);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleType = double.class;
        Method updateBDMethod = cMAESOptimizerClazz.getDeclaredMethod("updateBD", doubleType);
        updateBDMethod.setAccessible(true);
        java.lang.Object[] updateBDMethodArguments = new java.lang.Object[1];
        updateBDMethodArguments[0] = 2.2949324137017334E-308;
        updateBDMethod.invoke(cMAESOptimizer, updateBDMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovariance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, [I, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovariance(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix,int[],org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (ccov1 + ccovmu > 0): False}
 * @utbot.invokes org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateBD(double)
 *  */
    @Test
    public void testUpdateCovariance_Ccov1PlusCcovmuLessOrEqualZero() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1", 8.276096E-316);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmu", java.lang.Double.NaN);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovariance(boolean,org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix,int[],org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (ccov1 + ccovmu > 0): True}
 * @utbot.invokes org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final RealMatrix arpos = bestArx.subtract(repmat(xold, 1, mu)).scalarMultiply(1 / sigma);
 *  */
    @Test
    public void testUpdateCovariance_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "mu", -255);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1", 1.9929199279904566);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmu", -7.324320690431929E-4);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovariance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat(CMAESOptimizer.java:1177)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovariance(CMAESOptimizer.java:705) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sortedIndices
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sortedIndices([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sortedIndices(double[])}
 * @utbot.returnsFrom {@code return indices;}
 *  */
    @Test
    public void testSortedIndices_ReturnIndices() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] doubleArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method sortedIndicesMethod = cMAESOptimizerClazz.getDeclaredMethod("sortedIndices", doubleArrayType);
        sortedIndicesMethod.setAccessible(true);
        java.lang.Object[] sortedIndicesMethodArguments = new java.lang.Object[1];
        sortedIndicesMethodArguments[0] = ((Object) doubleArray);
        int[] actual = ((int[]) sortedIndicesMethod.invoke(cMAESOptimizer, sortedIndicesMethodArguments));
        
        int[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sortedIndices(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < doubles.length; i++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < doubles.length; i++)} once
 * @utbot.returnsFrom {@code return indices;}
 *  */
    @Test
    public void testSortedIndices_CMAESOptimizerAccess$100() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] doubleArray = {4.9E-324};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method sortedIndicesMethod = cMAESOptimizerClazz.getDeclaredMethod("sortedIndices", doubleArrayType);
        sortedIndicesMethod.setAccessible(true);
        java.lang.Object[] sortedIndicesMethodArguments = new java.lang.Object[1];
        sortedIndicesMethodArguments[0] = ((Object) doubleArray);
        int[] actual = ((int[]) sortedIndicesMethod.invoke(cMAESOptimizer, sortedIndicesMethodArguments));
        
        int[] expected = {0};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sortedIndices([D)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sortedIndices(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final DoubleIndex[] dis = new DoubleIndex[doubles.length];
 *  */
    @Test
    public void testSortedIndices_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sortedIndices] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sortedIndices(CMAESOptimizer.java:817) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sumRows(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sumRows(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[1][m.getColumnDimension()];
 *  */
    @Test
    public void testSumRows_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(CMAESOptimizer.java:1085) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] d = new double[1][m.getColumnDimension()];
 *  */
    @Test
    public void testSumRows_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(CMAESOptimizer.java:1085) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(CMAESOptimizer.java:1089) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(CMAESOptimizer.java:1089) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(CMAESOptimizer.java:1089) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(CMAESOptimizer.java:1089) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[1][m.getColumnDimension()];
 *  */
    @Test
    public void testSumRows_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(CMAESOptimizer.java:1085) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(CMAESOptimizer.java:1089) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.sumRows(CMAESOptimizer.java:1089) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSumRows_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSumRows_ThrowNoDataException_1() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#sumRows(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int c = 0; c < m.getColumnDimension(); c++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testSumRows_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method triu(org.apache.commons.math3.linear.RealMatrix, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testTriu_RGreaterThanCMinusK() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method triuMethod = cMAESOptimizerClazz.getDeclaredMethod("triu", openMapRealMatrixType, intType);
        triuMethod.setAccessible(true);
        java.lang.Object[] triuMethodArguments = new java.lang.Object[2];
        triuMethodArguments[0] = openMapRealMatrix;
        triuMethodArguments[1] = 1;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) triuMethod.invoke(null, triuMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testTriu_RLessOrEqualCMinusK_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testTriu_RLessOrEqualCMinusK() throws Exception  {
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method triu(org.apache.commons.math3.linear.RealMatrix, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTriu_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(CMAESOptimizer.java:1071) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTriu_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(CMAESOptimizer.java:1071) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
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
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(CMAESOptimizer.java:1074) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(CMAESOptimizer.java:1074) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(CMAESOptimizer.java:1074) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(CMAESOptimizer.java:1074) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] d = new double[m.getRowDimension()][m.getColumnDimension()];
 *  */
    @Test
    public void testTriu_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(CMAESOptimizer.java:1071) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(CMAESOptimizer.java:1074) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.triu(CMAESOptimizer.java:1074) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTriu_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTriu_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#triu(org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < m.getRowDimension(); r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testTriu_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 *  */
    @Test
    public void testCopyColumn_IterateForLoop() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 *  */
    @Test
    public void testCopyColumn_IterateForLoop_1() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m1.getRowDimension(); i++)} once
 *  */
    @Test
    public void testCopyColumn_IterateForLoop_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 64 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < m1.getRowDimension(); i++)
 *  */
    @Test
    public void testCopyColumn_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1127) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math3.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:265)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.copyColumn(CMAESOptimizer.java:1128) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#copyColumn(org.apache.commons.math3.linear.RealMatrix,int,org.apache.commons.math3.linear.RealMatrix,int)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.inverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inverse([I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#inverse(int[])}
 * @utbot.returnsFrom {@code return inverse;}
 *  */
    @Test
    public void testInverse_ReturnInverse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method inverseMethod = cMAESOptimizerClazz.getDeclaredMethod("inverse", intArrayType);
        inverseMethod.setAccessible(true);
        java.lang.Object[] inverseMethodArguments = new java.lang.Object[1];
        inverseMethodArguments[0] = ((Object) intArray);
        int[] actual = ((int[]) inverseMethod.invoke(null, inverseMethodArguments));
        
        int[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#inverse(int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < indices.length; i++)} once
 * @utbot.returnsFrom {@code return inverse;}
 *  */
    @Test
    public void testInverse_IterateForLoop() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        int[] intArray = {0};
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intArrayType = Class.forName("[I");
        Method inverseMethod = cMAESOptimizerClazz.getDeclaredMethod("inverse", intArrayType);
        inverseMethod.setAccessible(true);
        java.lang.Object[] inverseMethodArguments = new java.lang.Object[1];
        inverseMethodArguments[0] = ((Object) intArray);
        int[] actual = ((int[]) inverseMethod.invoke(null, inverseMethodArguments));
        
        int[] expected = {0};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inverse([I)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#inverse(int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < indices.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: inverse[indices[i]] = i;
 *  */
    @Test
    public void testInverse_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        int[] intArray = {2};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.inverse(CMAESOptimizer.java:1274) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#inverse(int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int[] inverse = new int[indices.length];
 *  */
    @Test
    public void testInverse_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.inverse] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.inverse(CMAESOptimizer.java:1272) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#inverse(int[])}
     */
    @Test
    public void testInverseThrowsAIOOBEWithNonEmptyPrimitiveArray() throws Throwable  {
        int[] intArray = {0, -1, Integer.MAX_VALUE};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.inverse(CMAESOptimizer.java:1274) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method diag(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testDiag_Return() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testDiag_Return_1() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        double[][] array2DRowRealMatrixData = ((double[][]) getFieldValue(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalArray2DRowRealMatrixData1 = ((double[]) get(array2DRowRealMatrixData, 1));
        
        assertNull(finalArray2DRowRealMatrixData1);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testDiag_Return_2() throws Exception  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null
        };
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method diagMethod = cMAESOptimizerClazz.getDeclaredMethod("diag", array2DRowRealMatrixType);
        diagMethod.setAccessible(true);
        java.lang.Object[] diagMethodArguments = new java.lang.Object[1];
        diagMethodArguments[0] = array2DRowRealMatrix;
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) diagMethod.invoke(null, diagMethodArguments));
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[2][];
        double[] doubleArray = {0.0};
        data1[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        data1[1] = doubleArray1;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data1);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
        double[][] array2DRowRealMatrixData = ((double[][]) getFieldValue(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalArray2DRowRealMatrixData0 = ((double[]) get(array2DRowRealMatrixData, 0));
        double[][] array2DRowRealMatrixData1 = ((double[][]) getFieldValue(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalArray2DRowRealMatrixData1 = ((double[]) get(array2DRowRealMatrixData1, 1));
        
        assertNull(finalArray2DRowRealMatrixData0);
        
        assertNull(finalArray2DRowRealMatrixData1);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getRowDimension(); i++)} twice
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testDiag_RealMatrixGetEntry() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method diag(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[m.getRowDimension()][1];
 *  */
    @Test
    public void testDiag_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1109) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[m.getRowDimension()][m.getRowDimension()];
 *  */
    @Test
    public void testDiag_ThrowNegativeArraySizeException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", Integer.MIN_VALUE);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1103) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: m.getColumnDimension() == 1
 *  */
    @Test
    public void testDiag_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1102) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1111) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1111) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[i][0] = m.getEntry(i, i);
 *  */
    @Test
    public void testDiag_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1111) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1111) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1111) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1111) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1111) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d[i][0] = m.getEntry(i, i);
 *  */
    @Test
    public void testDiag_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1111) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: m.getColumnDimension() == 1
 *  */
    @Test
    public void testDiag_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1102) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1111) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1111) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.diag(CMAESOptimizer.java:1105) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDiag_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getRowDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDiag_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#diag(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < m.getColumnDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testDiag_ThrowNoDataException_2() throws Throwable  {
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method randn1(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn1(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testRandn1_IterateForLoop() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Random wrappedMock = mock(Random.class);
        (when((((RandomGenerator) wrappedMock)).nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrappedMock);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn1(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testRandn1_IterateForLoop_1() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        RandomAdaptor wrappedMock = mock(RandomAdaptor.class);
        (when(wrappedMock.nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrappedMock);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method randn1(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn1(int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[size][popSize];
 *  */
    @Test
    public void testRandn1_ThrowNegativeArraySizeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn1] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn1(CMAESOptimizer.java:1309) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn1(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (when(randomMock.nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", randomMock);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn1] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn1(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[r][c] = random.nextGaussian();
 *  */
    @Test
    public void testRandn1_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn1] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn1(CMAESOptimizer.java:1312) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn1(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testRandn1_ThrowNoDataException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn1(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < size; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testRandn1_ThrowNoDataException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method randn(int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.returnsFrom {@code return randn;}
 *  */
    @Test
    public void testRandn_ReturnRandn() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 0;
        double[] actual = ((double[]) randnMethod.invoke(cMAESOptimizer, randnMethodArguments));
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return randn;}
 *  */
    @Test
    public void testRandn_IterateForLoop_1() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Well19937c random = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(random, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", 2.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        double[] actual = ((double[]) randnMethod.invoke(cMAESOptimizer, randnMethodArguments));
        
        double[] expected = {2.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
        
        RandomGenerator cMAESOptimizerRandom = ((RandomGenerator) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random"));
        double finalCMAESOptimizerRandomNextGaussian = ((Double) getFieldValue(cMAESOptimizerRandom, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian"));
        
        assertEquals(java.lang.Double.NaN, finalCMAESOptimizerRandomNextGaussian, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return randn;}
 *  */
    @Test
    public void testRandn_IterateForLoop() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", 2.0);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        double[] actual = ((double[]) randnMethod.invoke(cMAESOptimizer, randnMethodArguments));
        
        double[] expected = {2.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
        
        RandomGenerator cMAESOptimizerRandom = ((RandomGenerator) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random"));
        RandomGenerator cMAESOptimizerRandomRandomWrapped = ((RandomGenerator) getFieldValue(cMAESOptimizerRandom, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped"));
        double finalCMAESOptimizerRandomWrappedNextGaussian = ((Double) getFieldValue(cMAESOptimizerRandomRandomWrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian"));
        
        assertEquals(java.lang.Double.NaN, finalCMAESOptimizerRandomWrappedNextGaussian, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method randn(int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.math3.random.RandomGenerator#nextGaussian()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return randn;}
 *  */
    @Test
    public void testRandn_IterateForLoop_2() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        RandomAdaptor randomMock = mock(RandomAdaptor.class);
        (when(randomMock.nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", randomMock);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        double[] actual = ((double[]) randnMethod.invoke(cMAESOptimizer, randnMethodArguments));
        
        double[] expected = {java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return randn;}
 *  */
    @Test
    public void testRandn_IterateForLoop_3() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        RandomAdaptor wrappedMock = mock(RandomAdaptor.class);
        (when(wrappedMock.nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrappedMock);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        double[] actual = ((double[]) randnMethod.invoke(cMAESOptimizer, randnMethodArguments));
        
        double[] expected = {java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return randn;}
 *  */
    @Test
    public void testRandn_IterateForLoop_4() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        SynchronizedRandomGenerator wrapped = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        RandomAdaptor wrappedMock = mock(RandomAdaptor.class);
        (when(wrappedMock.nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(wrapped, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrappedMock);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 1;
        double[] actual = ((double[]) randnMethod.invoke(cMAESOptimizer, randnMethodArguments));
        
        double[] expected = {java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method randn(int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[] randn = new double[size];
 *  */
    @Test
    public void testRandn_ThrowNegativeArraySizeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1296) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", randomMock);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 2;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", randomMock);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 2;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", randomMock);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 2;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowIndexOutOfBoundsException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", randomMock);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 2;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowIndexOutOfBoundsException_4() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", randomMock);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 2;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowIndexOutOfBoundsException_5() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", randomMock);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 2;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowIndexOutOfBoundsException_6() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        Random randomMock = mock(Random.class);
        (when((((RandomGenerator) randomMock)).nextGaussian())).thenReturn(java.lang.Double.NaN);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", randomMock);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method randnMethod = cMAESOptimizerClazz.getDeclaredMethod("randn", intType);
        randnMethod.setAccessible(true);
        java.lang.Object[] randnMethodArguments = new java.lang.Object[1];
        randnMethodArguments[0] = 2;
        try {
            randnMethod.invoke(cMAESOptimizer, randnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        MersenneTwister wrapped = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mti", Integer.MIN_VALUE);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:253)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "index", 1073741824);
        int[] iRm1 = {0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:86)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        MersenneTwister wrapped = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {0};
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:237)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        MersenneTwister wrapped = ((MersenneTwister) createInstance("org.apache.commons.math3.random.MersenneTwister"));
        int[] mt = {};
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mt", mt);
        setField(wrapped, "org.apache.commons.math3.random.MersenneTwister", "mti", 624);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.random.MersenneTwister.next(MersenneTwister.java:234)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        int[] iRm2 = {1073741824};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {1073741824};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] v = {0, 0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "index", 1);
        int[] iRm1 = {0, 0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        int[] iRm2 = {0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm2", iRm2);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:87)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {Integer.MIN_VALUE};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "v", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm1", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        int[] i1 = {0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i1", i1);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i2", i1);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:92)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        SynchronizedRandomGenerator random = ((SynchronizedRandomGenerator) createInstance("org.apache.commons.math3.random.SynchronizedRandomGenerator"));
        Well19937c wrapped = ((Well19937c) createInstance("org.apache.commons.math3.random.Well19937c"));
        int[] v = {0};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "v", v);
        int[] iRm1 = {Integer.MIN_VALUE};
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm1", iRm1);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "iRm2", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i1", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i2", v);
        setField(wrapped, "org.apache.commons.math3.random.AbstractWell", "i3", v);
        setField(wrapped, "org.apache.commons.math3.random.BitsStreamGenerator", "nextGaussian", java.lang.Double.NaN);
        setField(random, "org.apache.commons.math3.random.SynchronizedRandomGenerator", "wrapped", wrapped);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:94)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.random.SynchronizedRandomGenerator.nextGaussian(SynchronizedRandomGenerator.java:120)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
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
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "random", random);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.random.Well19937c.next(Well19937c.java:91)
            org.apache.commons.math3.random.BitsStreamGenerator.nextDouble(BitsStreamGenerator.java:90)
            org.apache.commons.math3.random.BitsStreamGenerator.nextGaussian(BitsStreamGenerator.java:106)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#randn(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: randn[i] = random.nextGaussian();
 *  */
    @Test
    public void testRandn_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.randn(CMAESOptimizer.java:1298) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.zeros
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method zeros(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#zeros(int,int)}
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(n, m);}
 *  */
    @Test
    public void testZeros_Return() throws Exception  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method zeros(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#zeros(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: return new Array2DRowRealMatrix(n, m);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testZeros_ThrowNotStrictlyPositiveException() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#zeros(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: return new Array2DRowRealMatrix(n, m);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testZeros_ThrowNotStrictlyPositiveException_1() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method repmat(org.apache.commons.math3.linear.RealMatrix, int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
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
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method repmat(org.apache.commons.math3.linear.RealMatrix, int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[n * rd][m * cd];
 *  */
    @Test
    public void testRepmat_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 325321220);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat] produces [java.lang.NegativeArraySizeException: -1359804396]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat(CMAESOptimizer.java:1179) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = -220;
        repmatMethodArguments[2] = -123;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat(CMAESOptimizer.java:1182) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat(CMAESOptimizer.java:1182) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat(CMAESOptimizer.java:1182) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int rd = mat.getRowDimension();
 *  */
    @Test
    public void testRepmat_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat(CMAESOptimizer.java:1177) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", realMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = ((Object) null);
        repmatMethodArguments[1] = -255;
        repmatMethodArguments[2] = 1;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat(CMAESOptimizer.java:1182) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.repmat(CMAESOptimizer.java:1182) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testRepmat_ThrowNoDataException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -2061121216);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = -255;
        repmatMethodArguments[2] = -249;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = mat.getEntry(r % rd, c % cd);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testRepmat_ThrowOutOfRangeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", -799063683);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 16843009);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: d[r][c] = mat.getEntry(r % rd, c % cd);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testRepmat_ThrowOutOfRangeException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -799063683);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#repmat(org.apache.commons.math3.linear.RealMatrix,int,int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n * rd; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testRepmat_ThrowNoDataException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", -533837743);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Class intType = int.class;
        Method repmatMethod = cMAESOptimizerClazz.getDeclaredMethod("repmat", openMapRealMatrixType, intType, intType);
        repmatMethod.setAccessible(true);
        java.lang.Object[] repmatMethodArguments = new java.lang.Object[3];
        repmatMethodArguments[0] = openMapRealMatrix;
        repmatMethodArguments[1] = 177;
        repmatMethodArguments[2] = -255;
        try {
            repmatMethod.invoke(null, repmatMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.eye
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method eye(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#eye(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n; r++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testEye_RLessThanM() throws Exception  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method eye(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#eye(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testEye_ThrowNoDataException() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#eye(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testEye_ThrowNoDataException_1() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#eye(int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[n][m];
 *  */
    @Test
    public void testEye_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.eye] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.eye(CMAESOptimizer.java:1152) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method eyeMethod = cMAESOptimizerClazz.getDeclaredMethod("eye", intType, intType);
        eyeMethod.setAccessible(true);
        java.lang.Object[] eyeMethodArguments = new java.lang.Object[2];
        eyeMethodArguments[0] = -255;
        eyeMethodArguments[1] = -255;
        try {
            eyeMethod.invoke(null, eyeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.ones
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ones(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#ones(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n; r++)} once
 * @utbot.returnsFrom {@code return new Array2DRowRealMatrix(d, false);}
 *  */
    @Test
    public void testOnes_ArraysFill() throws Exception  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
        org.junit.Assert.assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                org.junit.Assert.assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ones(int, int)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#ones(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testOnes_ThrowNoDataException() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#ones(int,int)}
 * @utbot.iterates iterate the loop {@code for(int r = 0; r < n; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return new Array2DRowRealMatrix(d, false);
 *  */
    @Test(expected = NoDataException.class)
    public void testOnes_ThrowNoDataException_1() throws Throwable  {
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#ones(int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] d = new double[n][m];
 *  */
    @Test
    public void testOnes_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.ones] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.ones(CMAESOptimizer.java:1138) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class intType = int.class;
        Method onesMethod = cMAESOptimizerClazz.getDeclaredMethod("ones", intType, intType);
        onesMethod.setAccessible(true);
        java.lang.Object[] onesMethodArguments = new java.lang.Object[2];
        onesMethodArguments[0] = -255;
        onesMethodArguments[1] = -255;
        try {
            onesMethod.invoke(null, onesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.getStatisticsDHistory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStatisticsDHistory()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#getStatisticsDHistory()}
 * @utbot.returnsFrom {@code return statisticsDHistory;}
 *  */
    @Test
    public void testGetStatisticsDHistory_ReturnStatisticsDHistory() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        List actual = cMAESOptimizer.getStatisticsDHistory();
        
        assertNull(actual);
        
        List finalCMAESOptimizerStatisticsDHistory = ((List) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "statisticsDHistory"));
        
        assertNull(finalCMAESOptimizerStatisticsDHistory);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.parseOptimizationData
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testParseOptimizationData_ThrowDimensionMismatchException() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {0.0, 0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        cMAESOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testParseOptimizationData_ThrowDimensionMismatchException_1() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        double[] start = {4.9E-324};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {4.9E-324};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {0.0, 0.0};
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        cMAESOptimizer.parseOptimizationData(optimizationDataArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowNegativeArraySizeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1744833870);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 2147483620);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.NegativeArraySizeException: -1719019332]
            org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(BlockRealMatrix.java:261)
            org.apache.commons.math3.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:107)
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:458)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:674) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cc", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2147483646);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1469332006);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:463)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:674) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = false;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        Array2DRowRealMatrix diagC = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(diagC, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(AbstractRealMatrix.java:127)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:674) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cc", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:463)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:674) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = false;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cc", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "diagC", diagC);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:465)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:674) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = false;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:674) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test
    public void testUpdateCovarianceDiagonalOnly_ThrowNullPointerException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cc", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateCovarianceDiagonalOnly(CMAESOptimizer.java:674) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = false;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateCovarianceDiagonalOnly_ThrowNotStrictlyPositiveException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "diagC", diagC);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: diagC = diagC.scalarMultiply(oldFac).add(square(pc).scalarMultiply(ccov1Sep)).add((times(diagC, square(bestArz).multiply(weights))).scalarMultiply(ccovmuSep));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateCovarianceDiagonalOnly_ThrowNotStrictlyPositiveException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cc", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        BlockRealMatrix diagC = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(diagC, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "diagC", diagC);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = false;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} 
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateCovarianceDiagonalOnly_ThrowNotStrictlyPositiveException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        OpenMapRealMatrix diagC = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(diagC, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "diagC", diagC);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateCovarianceDiagonalOnly(boolean,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.executesCondition {@code (hsig): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} 
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testUpdateCovarianceDiagonalOnly_ThrowNumberIsTooLargeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccov1Sep", 0.0);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ccovmuSep", 0.0);
        OpenMapRealMatrix diagC = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(diagC, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 539325465);
        setField(diagC, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1046511112);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "diagC", diagC);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
        Class booleanType = boolean.class;
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method updateCovarianceDiagonalOnlyMethod = cMAESOptimizerClazz.getDeclaredMethod("updateCovarianceDiagonalOnly", booleanType, realMatrixType);
        updateCovarianceDiagonalOnlyMethod.setAccessible(true);
        java.lang.Object[] updateCovarianceDiagonalOnlyMethodArguments = new java.lang.Object[2];
        updateCovarianceDiagonalOnlyMethodArguments[0] = true;
        updateCovarianceDiagonalOnlyMethodArguments[1] = ((Object) null);
        try {
            updateCovarianceDiagonalOnlyMethod.invoke(cMAESOptimizer, updateCovarianceDiagonalOnlyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} 
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowNegativeArraySizeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1745699126);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 2147483616);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.NegativeArraySizeException: -1719011652]
            org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(BlockRealMatrix.java:261)
            org.apache.commons.math3.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:107)
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:458)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:648) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ps = ps.scalarMultiply(1 - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2 - cs) * mueff)));
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2147483638);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1469332008);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:463)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:648) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ps = ps.scalarMultiply(1 - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2 - cs) * mueff)));
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:465)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:648) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealMatrix#multiply(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2 - cs) * mueff))
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        OpenMapRealMatrix b = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "B", b);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:184)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:649) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ps = ps.scalarMultiply(1 - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2 - cs) * mueff)));
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowNullPointerException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:648) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2 - cs) * mueff))
 *  */
    @Test
    public void testUpdateEvolutionPaths_ThrowNullPointerException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.updateEvolutionPaths(CMAESOptimizer.java:649) */
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: ps = ps.scalarMultiply(1 - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2 - cs) * mueff)));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateEvolutionPaths_ThrowNotStrictlyPositiveException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: ps = ps.scalarMultiply(1 - cs).add(B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2 - cs) * mueff)));
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateEvolutionPaths_ThrowNotStrictlyPositiveException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} 
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateEvolutionPaths_ThrowNotStrictlyPositiveException_2() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        OpenMapRealMatrix ps = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} 
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testUpdateEvolutionPaths_ThrowNumberIsTooLargeException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        OpenMapRealMatrix ps = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(ps, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1997679894);
        setField(ps, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2110204064);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2 - cs) * mueff))
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testUpdateEvolutionPaths_ThrowDimensionMismatchException() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        OpenMapRealMatrix b = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(b, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "B", b);
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} 
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testUpdateEvolutionPaths_ThrowNotStrictlyPositiveException_3() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        Array2DRowRealMatrix ps = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix,org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: B.multiply(zmean).scalarMultiply(Math.sqrt(cs * (2 - cs) * mueff))
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testUpdateEvolutionPaths_ThrowDimensionMismatchException_1() throws Throwable  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "cs", 0.0);
        BlockRealMatrix ps = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[2][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        blocks[1] = ((double[]) null);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(ps, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "ps", ps);
        OpenMapRealMatrix b = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(b, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -3);
        setField(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "B", b);
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", blocks);
        
        Class cMAESOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer");
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.getStatisticsSigmaHistory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStatisticsSigmaHistory()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#getStatisticsSigmaHistory()}
 * @utbot.returnsFrom {@code return statisticsSigmaHistory;}
 *  */
    @Test
    public void testGetStatisticsSigmaHistory_ReturnStatisticsSigmaHistory() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        List actual = cMAESOptimizer.getStatisticsSigmaHistory();
        
        assertNull(actual);
        
        List finalCMAESOptimizerStatisticsSigmaHistory = ((List) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "statisticsSigmaHistory"));
        
        assertNull(finalCMAESOptimizerStatisticsSigmaHistory);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.getStatisticsMeanHistory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStatisticsMeanHistory()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#getStatisticsMeanHistory()}
 * @utbot.returnsFrom {@code return statisticsMeanHistory;}
 *  */
    @Test
    public void testGetStatisticsMeanHistory_ReturnStatisticsMeanHistory() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        List actual = cMAESOptimizer.getStatisticsMeanHistory();
        
        assertNull(actual);
        
        List finalCMAESOptimizerStatisticsMeanHistory = ((List) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "statisticsMeanHistory"));
        
        assertNull(finalCMAESOptimizerStatisticsMeanHistory);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.getStatisticsFitnessHistory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStatisticsFitnessHistory()
    
    /**
    @utbot.classUnderTest {@link CMAESOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer#getStatisticsFitnessHistory()}
 * @utbot.returnsFrom {@code return statisticsFitnessHistory;}
 *  */
    @Test
    public void testGetStatisticsFitnessHistory_ReturnStatisticsFitnessHistory() throws Exception  {
        CMAESOptimizer cMAESOptimizer = ((CMAESOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"));
        
        List actual = cMAESOptimizer.getStatisticsFitnessHistory();
        
        assertNull(actual);
        
        List finalCMAESOptimizerStatisticsFitnessHistory = ((List) getFieldValue(cMAESOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer", "statisticsFitnessHistory"));
        
        assertNull(finalCMAESOptimizerStatisticsFitnessHistory);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields715652571265400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields715652571265400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass715652571278200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715652571265400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715652571278200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields715652571650300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields715652571650300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass715652571651900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715652571650300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715652571651900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

