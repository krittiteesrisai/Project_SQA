package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.junit.Test;
import java.lang.reflect.Method;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.apache.commons.math3.analysis.differentiation.GradientFunction;
import org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math3_optim_nonlinear_vector_jacobian_LevenbergMarquardtOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method determineLMDirection([D, [D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} twice
 *  */
    @Test
    public void testDetermineLMDirection_NSingLessOrEqualZero() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray);
        determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method determineLMDirection([D, [D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDiag[j] = dpj;
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_13() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:752) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Arrays.fill(lmDiag, j + 1, lmDiag.length, 0);
 *  */
    @Test
    public void testDetermineLMDirection_ThrowIllegalArgumentException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {1.32624737E-315};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {0.0, 4.9E-324};
        double[] doubleArray2 = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.IllegalArgumentException: fromIndex(1) > toIndex(0)]
            java.base/java.util.Arrays.rangeCheck(Arrays.java:718)
            java.base/java.util.Arrays.fill(Arrays.java:3379)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:750) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray1);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double dpj = diag[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_12() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:748) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray1);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDiag[j] = weightedJacobian[j][permutation[j]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_14() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {java.lang.Double.NaN, -0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:797) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class lmDirType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", lmDirType, lmDirType, lmDirType, lmDirType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) lmDir);
        determineLMDirectionMethodArguments[1] = ((Object) lmDir);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[3] = ((Object) lmDir);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDiag[j] = weightedJacobian[j][permutation[j]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_15() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {6.32E-322};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {java.lang.Double.NaN};
        double[] doubleArray2 = {0.0, -0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:797) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[3] = ((Object) lmDir);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double rkk = weightedJacobian[k][pk];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_16() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {java.lang.Double.NaN};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {4.243991582E-314, 4.9E-324};
        double[] doubleArray2 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:767) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray1);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double rkk = weightedJacobian[k][pk];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_17() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {0, 4};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {1.0864618449742E-311};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {8.6916947597938E-311, 0.0};
        double[] doubleArray2 = {1.2882297635174863E-231, 0.0};
        double[] doubleArray3 = {-3.78576700278522E-270, 1.61895E-319};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:767) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray3);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = work[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_18() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {java.lang.Double.NaN};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {1.295163E-318, -0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {4.9E-324};
        double[] doubleArray2 = {0.0, -0.0};
        double[] doubleArray3 = {2.1729236899484E-311, 2.1729236899484E-311};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:825) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray3);
        determineLMDirectionMethodArguments[3] = ((Object) lmDir);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = work[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:825) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = work[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {268435456};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 268435456 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:825) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int pj = permutation[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:734) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j] = qy[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:739) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray1);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = {null};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {129, 1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        weightedJacobian[0] = doubleArray;
        weightedJacobian[1] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = {
            null,
            null
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255, 129};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        weightedJacobian[0] = doubleArray;
        weightedJacobian[1] = ((double[]) null);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j] = qy[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:739) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[j] = diagR[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:738) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[j] = diagR[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {2};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:738) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[j] = diagR[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 2);
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1, 1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        weightedJacobian[0] = doubleArray;
        weightedJacobian[1] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:738) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDiag[j] = dpj;
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_12() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:752) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Arrays.fill(lmDiag, j + 1, lmDiag.length, 0);
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_13() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1, -255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {1.295163E-318};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {java.lang.Double.NaN, 4.9E-324};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:750) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray1);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDiag[j] = weightedJacobian[j][permutation[j]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_15() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {4.144523E-317, 4.144523E-317};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = {null};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray = {1.0E-323};
        double[] doubleArray1 = {0.0, -0.0};
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:797) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[3] = ((Object) lmDir);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rkk = weightedJacobian[k][pk];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_16() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {1.0864618449742E-311, 1.0864618449742E-311};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = {null};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray = {java.lang.Double.NaN, 0.0};
        double[] doubleArray1 = {0.0, 4.9E-324};
        double[] doubleArray2 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:767) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray1);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double dpj = diag[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_11() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:748) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDiag[j] = weightedJacobian[j][permutation[j]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_14() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {2.121995791E-314};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {0.0, -0.0};
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:797) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[3] = ((Object) lmDir);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int j = 0; j < lmDir.length; ++j)
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:824) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = work[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:825) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pj = permutation[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:734) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255, -255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = {
            null,
            null
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255, 1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        weightedJacobian[0] = doubleArray;
        weightedJacobian[1] = ((double[]) null);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[j] = qy[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_10() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:739) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = work[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:825) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: weightedJacobian[i][pj] = weightedJacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[j] = qy[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:739) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[j] = diagR[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:738) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[j] = diagR[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:738) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) null);
        determineLMDirectionMethodArguments[3] = ((Object) null);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method determineLMDirection([D, [D, [D, [D)
    
    @Test
    public void testDetermineLMDirection1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            0.0, 4.243991582E-314, 4.243991582E-314, 4.243991582E-314, 4.243991582E-314, 4.243991582E-314,
            4.243991582E-314, 4.243991582E-314, 4.243991582E-314
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = new int[17];
        permutation[1] = 3;
        permutation[2] = 3;
        permutation[3] = 3;
        permutation[4] = 3;
        permutation[5] = 3;
        permutation[6] = 3;
        permutation[7] = 3;
        permutation[8] = 3;
        permutation[9] = 3;
        permutation[10] = 3;
        permutation[11] = 3;
        permutation[12] = 3;
        permutation[13] = 3;
        permutation[14] = 3;
        permutation[15] = 3;
        permutation[16] = 3;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[][] weightedJacobian = new double[9][];
        double[] doubleArray = {-2.229440925845008E-308};
        weightedJacobian[0] = doubleArray;
        weightedJacobian[1] = ((double[]) null);
        weightedJacobian[2] = ((double[]) null);
        weightedJacobian[3] = ((double[]) null);
        weightedJacobian[4] = ((double[]) null);
        weightedJacobian[5] = ((double[]) null);
        weightedJacobian[6] = ((double[]) null);
        weightedJacobian[7] = ((double[]) null);
        weightedJacobian[8] = ((double[]) null);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray2 = new double[11];
        doubleArray2[0] = 9.670962474544657E-299;
        double[] doubleArray3 = {8.0948E-320, 8.0948E-320};
        double[] doubleArray4 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray3);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray4);
        determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        
        double[] levenbergMarquardtOptimizerDiagR = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR"));
        double finalLevenbergMarquardtOptimizerDiagR3 = ((Double) get(levenbergMarquardtOptimizerDiagR, 3));
        double[][] levenbergMarquardtOptimizerWeightedJacobian = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] levenbergMarquardtOptimizerWeightedJacobianWeightedJacobian0 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian, 0));
        double finalLevenbergMarquardtOptimizerWeightedJacobian00 = ((Double) get(levenbergMarquardtOptimizerWeightedJacobianWeightedJacobian0, 0));
        double[][] levenbergMarquardtOptimizerWeightedJacobian1 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian1 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian1, 1));
        double[][] levenbergMarquardtOptimizerWeightedJacobian2 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian2 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian2, 2));
        double[][] levenbergMarquardtOptimizerWeightedJacobian3 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian3 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian3, 3));
        double[][] levenbergMarquardtOptimizerWeightedJacobian4 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian4 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian4, 4));
        double[][] levenbergMarquardtOptimizerWeightedJacobian5 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian5 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian5, 5));
        double[][] levenbergMarquardtOptimizerWeightedJacobian6 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian6 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian6, 6));
        double[][] levenbergMarquardtOptimizerWeightedJacobian7 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian7 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian7, 7));
        double[][] levenbergMarquardtOptimizerWeightedJacobian8 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian8 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian8, 8));
        
        double finalDoubleArray30 = doubleArray3[0];
        double finalDoubleArray31 = doubleArray3[1];
        
        assertEquals(0.0, finalLevenbergMarquardtOptimizerDiagR3, 1.0E-6);
        
        assertEquals(0.0, finalLevenbergMarquardtOptimizerWeightedJacobian00, 1.0E-6);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian1);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian2);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian3);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian4);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian5);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian6);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian7);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian8);
        
        assertEquals(9.670962474544657E-299, finalDoubleArray30, 1.0E-6);
        
        assertEquals(0.0, finalDoubleArray31, 1.0E-6);
    }
    
    @Test
    public void testDetermineLMDirection2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = new int[32];
        permutation[1] = 3;
        permutation[2] = 3;
        permutation[3] = 3;
        permutation[4] = 3;
        permutation[5] = 3;
        permutation[6] = 3;
        permutation[7] = 3;
        permutation[8] = 3;
        permutation[9] = 3;
        permutation[10] = 3;
        permutation[11] = 3;
        permutation[12] = 3;
        permutation[13] = 3;
        permutation[14] = 3;
        permutation[15] = 3;
        permutation[16] = 3;
        permutation[17] = 3;
        permutation[18] = 3;
        permutation[19] = 3;
        permutation[20] = 3;
        permutation[21] = 3;
        permutation[22] = 3;
        permutation[23] = 3;
        permutation[24] = 3;
        permutation[25] = 3;
        permutation[26] = 3;
        permutation[27] = 3;
        permutation[28] = 3;
        permutation[29] = 3;
        permutation[30] = 3;
        permutation[31] = 3;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[9][];
        weightedJacobian[0] = lmDir;
        weightedJacobian[1] = ((double[]) null);
        weightedJacobian[2] = ((double[]) null);
        weightedJacobian[3] = ((double[]) null);
        weightedJacobian[4] = ((double[]) null);
        weightedJacobian[5] = ((double[]) null);
        weightedJacobian[6] = ((double[]) null);
        weightedJacobian[7] = ((double[]) null);
        weightedJacobian[8] = ((double[]) null);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray2 = {1.390671161567E-309, 1.390671161567E-309};
        double[] doubleArray3 = {
            3.16E-322, 3.16E-322, 3.16E-322, 3.16E-322, 3.16E-322, 3.16E-322,
            3.16E-322, 3.16E-322, 3.16E-322
        };
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray3);
        determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        
        double[] levenbergMarquardtOptimizerLmDir = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir"));
        double finalLevenbergMarquardtOptimizerLmDir3 = ((Double) get(levenbergMarquardtOptimizerLmDir, 3));
        double[][] levenbergMarquardtOptimizerWeightedJacobian = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian1 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian, 1));
        double[][] levenbergMarquardtOptimizerWeightedJacobian1 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian2 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian1, 2));
        double[][] levenbergMarquardtOptimizerWeightedJacobian2 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian3 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian2, 3));
        double[][] levenbergMarquardtOptimizerWeightedJacobian3 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian4 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian3, 4));
        double[][] levenbergMarquardtOptimizerWeightedJacobian4 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian5 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian4, 5));
        double[][] levenbergMarquardtOptimizerWeightedJacobian5 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian6 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian5, 6));
        double[][] levenbergMarquardtOptimizerWeightedJacobian6 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian7 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian6, 7));
        double[][] levenbergMarquardtOptimizerWeightedJacobian7 = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian8 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian7, 8));
        
        double finalDoubleArray20 = doubleArray2[0];
        double finalDoubleArray21 = doubleArray2[1];
        
        double finalDoubleArray30 = doubleArray3[0];
        
        assertEquals(3.16E-322, finalLevenbergMarquardtOptimizerLmDir3, 1.0E-6);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian1);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian2);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian3);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian4);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian5);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian6);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian7);
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian8);
        
        assertEquals(java.lang.Double.NaN, finalDoubleArray20, 1.0E-6);
        
        assertEquals(0.0, finalDoubleArray21, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalDoubleArray30, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method determineLMDirection([D, [D, [D, [D)
    
    @Test
    public void testDetermineLMDirection3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", -2147483647);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = new double[11];
        lmDir[0] = java.lang.Double.NaN;
        lmDir[1] = java.lang.Double.NaN;
        lmDir[2] = java.lang.Double.NaN;
        lmDir[3] = java.lang.Double.NaN;
        lmDir[4] = java.lang.Double.NaN;
        lmDir[5] = java.lang.Double.NaN;
        lmDir[6] = java.lang.Double.NaN;
        lmDir[7] = java.lang.Double.NaN;
        lmDir[8] = java.lang.Double.NaN;
        lmDir[9] = java.lang.Double.NaN;
        lmDir[10] = java.lang.Double.NaN;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:825) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDetermineLMDirection4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            0.0, 4.0474E-320, 4.0474E-320, 4.0474E-320, 4.0474E-320, 4.0474E-320,
            4.0474E-320, 4.0474E-320, 4.0474E-320
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {
            0, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            -2147483646
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[][] weightedJacobian = new double[9][];
        weightedJacobian[0] = diagR;
        weightedJacobian[1] = ((double[]) null);
        weightedJacobian[2] = ((double[]) null);
        weightedJacobian[3] = ((double[]) null);
        weightedJacobian[4] = ((double[]) null);
        weightedJacobian[5] = ((double[]) null);
        weightedJacobian[6] = ((double[]) null);
        weightedJacobian[7] = ((double[]) null);
        weightedJacobian[8] = ((double[]) null);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray = {
            0.0, 2.0237E-320, 2.0237E-320, 2.0237E-320, 2.0237E-320, 2.0237E-320,
            2.0237E-320, 2.0237E-320, 2.0237E-320
        };
        double[] doubleArray1 = {
            -2.225073858507202E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray2 = {java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483646 out of bounds for length 9]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:825) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDetermineLMDirection5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = new double[17];
        diagR[0] = java.lang.Double.NaN;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = new double[18];
        lmDir[0] = 4.345847379897E-311;
        lmDir[1] = 4.345847379897E-311;
        lmDir[2] = 4.345847379897E-311;
        lmDir[3] = 4.345847379897E-311;
        lmDir[4] = 4.345847379897E-311;
        lmDir[5] = 4.345847379897E-311;
        lmDir[6] = 4.345847379897E-311;
        lmDir[7] = 4.345847379897E-311;
        lmDir[8] = 4.345847379897E-311;
        lmDir[9] = 4.345847379897E-311;
        lmDir[10] = 4.345847379897E-311;
        lmDir[11] = 4.345847379897E-311;
        lmDir[12] = 4.345847379897E-311;
        lmDir[13] = 4.345847379897E-311;
        lmDir[14] = 4.345847379897E-311;
        lmDir[15] = 4.345847379897E-311;
        lmDir[16] = 4.345847379897E-311;
        lmDir[17] = 4.345847379897E-311;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[9][];
        double[] doubleArray = {
            1.3191472680136148E-228, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        weightedJacobian[0] = doubleArray;
        weightedJacobian[1] = ((double[]) null);
        weightedJacobian[2] = ((double[]) null);
        weightedJacobian[3] = ((double[]) null);
        weightedJacobian[4] = ((double[]) null);
        weightedJacobian[5] = ((double[]) null);
        weightedJacobian[6] = ((double[]) null);
        weightedJacobian[7] = ((double[]) null);
        weightedJacobian[8] = ((double[]) null);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {
            0.0, 3.16E-322, 3.16E-322, 3.16E-322, 3.16E-322, 3.16E-322,
            3.16E-322, 3.16E-322, 3.16E-322, 3.16E-322
        };
        double[] doubleArray2 = {
            1.3191472680136148E-228, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray3 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:825) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray3);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray1);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDetermineLMDirection6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = new double[32];
        lmDir[0] = 1.6261730269158982E-260;
        lmDir[1] = 1.6261730269158982E-260;
        lmDir[2] = 1.6261730269158982E-260;
        lmDir[3] = 1.6261730269158982E-260;
        lmDir[4] = 1.6261730269158982E-260;
        lmDir[5] = 1.6261730269158982E-260;
        lmDir[6] = 1.6261730269158982E-260;
        lmDir[7] = 1.6261730269158982E-260;
        lmDir[8] = 1.6261730269158982E-260;
        lmDir[9] = 1.6261730269158982E-260;
        lmDir[10] = 1.6261730269158982E-260;
        lmDir[11] = 1.6261730269158982E-260;
        lmDir[12] = 1.6261730269158982E-260;
        lmDir[13] = 1.6261730269158982E-260;
        lmDir[14] = 1.6261730269158982E-260;
        lmDir[15] = 1.6261730269158982E-260;
        lmDir[16] = 1.6261730269158982E-260;
        lmDir[17] = 1.6261730269158982E-260;
        lmDir[18] = 1.6261730269158982E-260;
        lmDir[19] = 1.6261730269158982E-260;
        lmDir[20] = 1.6261730269158982E-260;
        lmDir[21] = 1.6261730269158982E-260;
        lmDir[22] = 1.6261730269158982E-260;
        lmDir[23] = 1.6261730269158982E-260;
        lmDir[24] = 1.6261730269158982E-260;
        lmDir[25] = 1.6261730269158982E-260;
        lmDir[26] = 1.6261730269158982E-260;
        lmDir[27] = 1.6261730269158982E-260;
        lmDir[28] = 1.6261730269158982E-260;
        lmDir[29] = 1.6261730269158982E-260;
        lmDir[30] = 1.6261730269158982E-260;
        lmDir[31] = 1.6261730269158982E-260;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[9][];
        double[] doubleArray = {
            1.494583827802091E-154, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        weightedJacobian[0] = doubleArray;
        weightedJacobian[1] = ((double[]) null);
        weightedJacobian[2] = ((double[]) null);
        weightedJacobian[3] = ((double[]) null);
        weightedJacobian[4] = ((double[]) null);
        weightedJacobian[5] = ((double[]) null);
        weightedJacobian[6] = ((double[]) null);
        weightedJacobian[7] = ((double[]) null);
        weightedJacobian[8] = ((double[]) null);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray2 = {
            -1.494583827802091E-154, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray3 = {java.lang.Double.NaN, java.lang.Double.NaN};
        double[] doubleArray4 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:825) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray3);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray4);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDetermineLMDirection7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            0.0, 6.953355807835E-310, 6.953355807835E-310, 6.953355807835E-310, 6.953355807835E-310, 6.953355807835E-310,
            6.953355807835E-310, 6.953355807835E-310, 6.953355807835E-310
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = new int[32];
        permutation[1] = 3;
        permutation[2] = 3;
        permutation[3] = 3;
        permutation[4] = 3;
        permutation[5] = 3;
        permutation[6] = 3;
        permutation[7] = 3;
        permutation[8] = 3;
        permutation[9] = 3;
        permutation[10] = 3;
        permutation[11] = 3;
        permutation[12] = 3;
        permutation[13] = 3;
        permutation[14] = 3;
        permutation[15] = 3;
        permutation[16] = 3;
        permutation[17] = 3;
        permutation[18] = 3;
        permutation[19] = 3;
        permutation[20] = 3;
        permutation[21] = 3;
        permutation[22] = 3;
        permutation[23] = 3;
        permutation[24] = 3;
        permutation[25] = 3;
        permutation[26] = 3;
        permutation[27] = 3;
        permutation[28] = 3;
        permutation[29] = 3;
        permutation[30] = 3;
        permutation[31] = 3;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            2.2250738585072014E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray2 = {0.0, 0.0, 0.0, 0.0};
        double[] doubleArray3 = {
            1.0361308E-317, 1.0361308E-317, 1.0361308E-317, 1.0361308E-317, 1.0361308E-317, 1.0361308E-317,
            1.0361308E-317, 1.0361308E-317, 1.0361308E-317
        };
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:767) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray3);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDetermineLMDirection8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 3);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[10][];
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        weightedJacobian[0] = doubleArray;
        weightedJacobian[1] = doubleArray;
        weightedJacobian[2] = doubleArray;
        weightedJacobian[3] = doubleArray;
        weightedJacobian[4] = doubleArray;
        weightedJacobian[5] = doubleArray;
        weightedJacobian[6] = doubleArray;
        weightedJacobian[7] = doubleArray;
        weightedJacobian[8] = doubleArray;
        weightedJacobian[9] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:738) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray1);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDetermineLMDirection9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 2);
        double[] diagR = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[][] weightedJacobian = new double[10][];
        weightedJacobian[0] = diagR;
        weightedJacobian[1] = diagR;
        weightedJacobian[2] = diagR;
        weightedJacobian[3] = diagR;
        weightedJacobian[4] = diagR;
        weightedJacobian[5] = diagR;
        weightedJacobian[6] = diagR;
        weightedJacobian[7] = diagR;
        weightedJacobian[8] = diagR;
        weightedJacobian[9] = diagR;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:748) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[1] = ((Object) null);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method determineLMParameter([D, double, [D, [D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDetermineLMParameter_FpLessOrEqual0dMultiplyDelta() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmPar", 0.0);
        double[][] weightedJacobian = new double[2][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        weightedJacobian[1] = ((double[]) null);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = 2.3534373682645353E-184;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        
        double[][] levenbergMarquardtOptimizerWeightedJacobian = ((double[][]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian"));
        double[] finalLevenbergMarquardtOptimizerWeightedJacobian1 = ((double[]) get(levenbergMarquardtOptimizerWeightedJacobian, 1));
        
        assertNull(finalLevenbergMarquardtOptimizerWeightedJacobian1);
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): False}
 * @utbot.executesCondition {@code (rank == solvedCols): False}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < nC; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 *  */
    @Test
    public void testDetermineLMParameter_RankNotEqualsSolvedCols() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0, 3, 3, 3};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[8][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        weightedJacobian[1] = doubleArray1;
        weightedJacobian[2] = doubleArray1;
        weightedJacobian[3] = doubleArray1;
        weightedJacobian[4] = doubleArray1;
        weightedJacobian[5] = doubleArray1;
        weightedJacobian[6] = doubleArray1;
        weightedJacobian[7] = doubleArray1;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray2 = {0.0};
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = 17.00000024194144;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray2);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method determineLMParameter([D, double, [D, [D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): False}
 * @utbot.executesCondition {@code (rank == solvedCols): False}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < nC; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += weightedJacobian[i][pj] * qy[i];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[2][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        double[] doubleArray1 = {0.0, 0.0};
        weightedJacobian[1] = doubleArray1;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray2 = {};
        double[] doubleArray3 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:625) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray2Type = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArray2Type, doubleType, doubleArray2Type, doubleArray2Type, doubleArray2Type, doubleArray2Type);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray2);
        determineLMParameterMethodArguments[1] = java.lang.Double.NEGATIVE_INFINITY;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray3);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nC = weightedJacobian[0].length;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[][] weightedJacobian = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:560) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): False}
 * @utbot.executesCondition {@code (rank == solvedCols): True}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int k = rank - 1; k >= 0; --k)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += weightedJacobian[i][pj] * qy[i];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1, -255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 1);
        double[] lmDir = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        double[] doubleArray2 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:625) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArray1Type, doubleType, doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[1] = -5.471547728694747E98;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray2);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray2);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {Integer.MIN_VALUE};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:584) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work1[pj] = s;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_13() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0, 0.0};
        double[] doubleArray2 = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:585) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray2);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): False}
 * @utbot.executesCondition {@code (rank == solvedCols): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += weightedJacobian[i][pj] * qy[i];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_15() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0, 0.0};
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:625) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray2);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {65};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 1);
        double[] lmDir = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 2]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:565) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArray1Type, doubleType, doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < nC; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = 0;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 1);
        double[] lmDir = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        weightedJacobian[0] = lmDir;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:568) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_12() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:584) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int pj = permutation[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_14() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:583) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 1);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:565) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArray1Type, doubleType, doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} twice
 * @utbot.iterates iterate the loop {@code for(int k = rank - 1; k >= 0; --k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[i]] -= ypk * weightedJacobian[i][pk];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {2, 1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 2);
        double[] lmDir = new double[11];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:574) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArray1Type, doubleType, doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} twice
 * @utbot.iterates iterate the loop {@code for(int k = rank - 1; k >= 0; --k)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double ypk = lmDir[pk] / diagR[pk];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1, 0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 2);
        double[] lmDir = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        weightedJacobian[0] = lmDir;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:572) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < nC; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = 0;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {536870912};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        weightedJacobian[0] = lmDir;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:568) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 1);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:565) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < nC; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = 0;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", -1);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:568) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nC = weightedJacobian[0].length;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[][] weightedJacobian = {null};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:560) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nC = weightedJacobian[0].length;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:560) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int k = rank - 1; k >= 0; --k)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:584) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArray1Type, doubleType, doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_11() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:584) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work1[pj] = s;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_13() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:585) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 1);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:565) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArray1Type, doubleType, doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < nC; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        weightedJacobian[0] = lmDir;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:584) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pj = permutation[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_10() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:583) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_12() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:584) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 1);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:565) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int k = rank - 1; k >= 0; --k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double ypk = lmDir[pk] / diagR[pk];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 1);
        double[] lmDir = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:572) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArray1Type, doubleType, doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < nC; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = 0;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:568) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "rank", 1);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:565) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < nC; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = 0;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:568) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) null);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final RealMatrix weightMatrixSqrt = getWeightSquareRoot();
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {1.7800590868187127E-307, 2.8480945388892184E-306};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:311) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrixSqrt = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {7.291122019559713E-304, 3.785767023939841E-270};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {4.77832795454153E-299};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for double[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:311) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#computeObjectiveValue(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double[] currentObjective = computeObjectiveValue(currentPoint);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {6.32E-322};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        GradientFunction model = ((GradientFunction) createInstance("org.apache.commons.math3.analysis.differentiation.GradientFunction"));
        MultivariateDifferentiableFunction f = ((MultivariateDifferentiableFunction) createInstance("org.apache.commons.math3.analysis.FunctionUtils$17"));
        setField(model, "org.apache.commons.math3.analysis.differentiation.GradientFunction", "f", f);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "model", model);
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.analysis.FunctionUtils$17.value(FunctionUtils.java:622)
            org.apache.commons.math3.analysis.differentiation.GradientFunction.value(GradientFunction.java:51)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.computeObjectiveValue(MultivariateVectorOptimizer.java:63)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:314) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nC = currentPoint.length;
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:289) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final RealMatrix weightMatrixSqrt = getWeightSquareRoot();
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {1.4916681462400417E-154, 2.8480945388892178E-306};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {8.0948E-320};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:311) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final RealMatrix weightMatrixSqrt = getWeightSquareRoot();
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "solvedCols", -255);
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:311) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testDoOptimize_ThrowMathUnsupportedOperationException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] lowerBound = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testDoOptimize_ThrowMathUnsupportedOperationException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] upperBound = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: final RealMatrix weightMatrixSqrt = getWeightSquareRoot();
 *  */
    @Test(expected = NoDataException.class)
    public void testDoOptimize_ThrowNoDataException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {2.2294197058870983E-308, 2.225074389006149E-308};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {2.056276737369206E-289};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: final RealMatrix weightMatrixSqrt = getWeightSquareRoot();
 *  */
    @Test(expected = NoDataException.class)
    public void testDoOptimize_ThrowNoDataException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {7.291122888725873E-304, -0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {2.0E-323};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: double[] currentObjective = computeObjectiveValue(currentPoint);
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoOptimize_ThrowTooManyEvaluationsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {7.9E-323, 2.590327E-318};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {1.1125369292536007E-308};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyIterationsException} in: double[] currentObjective = computeObjectiveValue(currentPoint);
 *  */
    @Test(expected = TooManyIterationsException.class)
    public void testDoOptimize_ThrowTooManyIterationsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix weightMatrixSqrt = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrixSqrt, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer", "weightMatrixSqrt", weightMatrixSqrt);
        double[] target = {6.63123685E-316, 2.2250738585072093E-308};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {-0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method doOptimize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#doOptimize()}
     */
    @Test
    public void testDoOptimizeThrowsNPE() {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = new LevenbergMarquardtOptimizer();
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getTarget(MultivariateVectorOptimizer.java:105)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:287) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method qrDecomposition(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowNegativeArraySizeException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1311585805);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 773951157);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NegativeArraySizeException: -2138671164]
            org.apache.commons.math3.linear.BlockRealMatrix.createBlocksLayout(BlockRealMatrix.java:261)
            org.apache.commons.math3.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:107)
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:458)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", blockRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = blockRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2147483646);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1469332016);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:463)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", blockRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = blockRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:463)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", blockRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = blockRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.scalarMultiply(BlockRealMatrix.java:465)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", blockRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = blockRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(AbstractRealMatrix.java:127)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", array2DRowRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = array2DRowRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(AbstractRealMatrix.java:131)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", openMapRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = openMapRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {74, 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 3);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(AbstractRealMatrix.java:131)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", openMapRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = openMapRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: permutation[k] = k;
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:863) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", blockRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = blockRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(AbstractRealMatrix.java:131)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", openMapRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = openMapRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
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
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(AbstractRealMatrix.java:131)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", openMapRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = openMapRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jacNorm[k] = FastMath.sqrt(norm2);
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:869) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", blockRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = blockRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class realMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", realMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = ((Object) null);
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(AbstractRealMatrix.java:131)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", openMapRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = openMapRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:247)
            org.apache.commons.math3.linear.AbstractRealMatrix.scalarMultiply(AbstractRealMatrix.java:131)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:856) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", openMapRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = openMapRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: permutation[k] = k;
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:863) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", blockRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = blockRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jacNorm[k] = FastMath.sqrt(norm2);
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:869) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", blockRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = blockRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method qrDecomposition(org.apache.commons.math3.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testQrDecomposition_ThrowNotStrictlyPositiveException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", blockRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = blockRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testQrDecomposition_ThrowNotStrictlyPositiveException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(blockRealMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", blockRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = blockRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testQrDecomposition_ThrowNumberIsTooLargeException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2625795);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1276150018);
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", openMapRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = openMapRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testQrDecomposition_ThrowNotStrictlyPositiveException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", array2DRowRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = array2DRowRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testQrDecomposition_ThrowNotStrictlyPositiveException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(array2DRowRealMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", array2DRowRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = array2DRowRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qrDecomposition(org.apache.commons.math3.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} in: weightedJacobian = jacobian.scalarMultiply(-1).getData();
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testQrDecomposition_ThrowNotStrictlyPositiveException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", array2DRowRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = array2DRowRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method qrDecomposition(org.apache.commons.math3.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testQrDecomposition1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 34914);
        setField(openMapRealMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 31781);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            536870912, 536870912, 536870912, 536870912, 536870912, 536870912, 536870912, 536870912,
            536870912
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
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition", openMapRealMatrixType);
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[1];
        qrDecompositionMethodArguments[0] = openMapRealMatrix;
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.checkParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): False}
 * @utbot.executesCondition {@code (getUpperBound() != null): False}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#getLowerBound()}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#getUpperBound()}
 *  */
    @Test
    public void testCheckParameters_GetUpperBoundEqualsNull() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Method checkParametersMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(levenbergMarquardtOptimizer, checkParametersMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} when: getLowerBound() != null || getUpperBound() != null
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_ThrowMathUnsupportedOperationException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] lowerBound = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Method checkParametersMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(levenbergMarquardtOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (getLowerBound() != null): False}
 * @utbot.executesCondition {@code (getUpperBound() != null): True}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#getUpperBound()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} when: getLowerBound() != null || getUpperBound() != null
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_ThrowMathUnsupportedOperationException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] upperBound = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Method checkParametersMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(levenbergMarquardtOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method qTy([D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 *  */
    @Test
    public void testQTy() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) null);
        qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 *  */
    @Test
    public void testQTy_IterateForLoop() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] beta = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArray1Type);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) doubleArray1);
        qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method qTy([D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nC = weightedJacobian[0].length;
 *  */
    @Test
    public void testQTy_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[][] weightedJacobian = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:933) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) null);
        try {
            qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gamma += weightedJacobian[i][pk] * y[i];
 *  */
    @Test
    public void testQTy_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:939) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArray1Type);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) doubleArray1);
        try {
            qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int pk = permutation[k];
 *  */
    @Test
    public void testQTy_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:936) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) null);
        try {
            qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gamma += weightedJacobian[i][pk] * y[i];
 *  */
    @Test
    public void testQTy_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {2};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:939) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) null);
        try {
            qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gamma *= beta[pk];
 *  */
    @Test
    public void testQTy_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] beta = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:941) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArray1Type);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) doubleArray1);
        try {
            qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nC = weightedJacobian[0].length;
 *  */
    @Test
    public void testQTy_ThrowNullPointerException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[][] weightedJacobian = {null};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:933) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) null);
        try {
            qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nR = weightedJacobian.length;
 *  */
    @Test
    public void testQTy_ThrowNullPointerException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:932) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) null);
        try {
            qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gamma += weightedJacobian[i][pk] * y[i];
 *  */
    @Test
    public void testQTy_ThrowNullPointerException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:939) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) null);
        try {
            qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pk = permutation[k];
 *  */
    @Test
    public void testQTy_ThrowNullPointerException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:936) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) null);
        try {
            qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < nC; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gamma *= beta[pk];
 *  */
    @Test
    public void testQTy_ThrowNullPointerException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] weightedJacobian = new double[1][];
        double[] doubleArray = {0.0};
        weightedJacobian[0] = doubleArray;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer", "weightedJacobian", weightedJacobian);
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:941) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArray1Type);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) doubleArray1);
        try {
            qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields716175271005100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields716175271005100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass716175271013700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716175271005100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716175271013700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields716175271346600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields716175271346600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass716175271350500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields716175271346600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass716175271350500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

