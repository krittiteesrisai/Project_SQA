package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import org.apache.commons.math.linear.ArrayRealVector;
import java.lang.reflect.Method;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.util.Incrementor;
import org.apache.commons.math.util.Incrementor.MaxCountExceededCallback;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_optimization_direct_BOBYQAOptimizerTest {
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method update(double, double, int)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final ArrayRealVector work = new ArrayRealVector(npt + n);
 *  */
    @Test
    public void testUpdate_ThrowNegativeArraySizeException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:63)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2307) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = -255;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double alpha = work.getEntry(knew);
 *  */
    @Test
    public void testUpdate_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math.linear.ArrayRealVector.getEntry(ArrayRealVector.java:622)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2345) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = 129;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < npt; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work.setEntry(i, zMatrix.getEntry(knew, 0) * zMatrix.getEntry(i, 0));
 *  */
    @Test
    public void testUpdate_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[2][];
        data1[0] = data;
        double[] doubleArray = {};
        data1[1] = doubleArray;
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:295)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2343) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = 1;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < npt; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double alpha = work.getEntry(knew);
 *  */
    @Test
    public void testUpdate_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = new double[30];
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[35][];
        double[] doubleArray = {0.0};
        data1[0] = doubleArray;
        data1[1] = ((double[]) null);
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        data1[9] = ((double[]) null);
        data1[10] = ((double[]) null);
        data1[11] = ((double[]) null);
        data1[12] = ((double[]) null);
        data1[13] = ((double[]) null);
        data1[14] = ((double[]) null);
        data1[15] = ((double[]) null);
        data1[16] = ((double[]) null);
        data1[17] = ((double[]) null);
        data1[18] = ((double[]) null);
        data1[19] = ((double[]) null);
        data1[20] = ((double[]) null);
        data1[21] = ((double[]) null);
        data1[22] = ((double[]) null);
        data1[23] = ((double[]) null);
        data1[24] = ((double[]) null);
        data1[25] = ((double[]) null);
        data1[26] = ((double[]) null);
        data1[27] = ((double[]) null);
        data1[28] = ((double[]) null);
        data1[29] = ((double[]) null);
        data1[30] = ((double[]) null);
        data1[31] = ((double[]) null);
        data1[32] = ((double[]) null);
        data1[33] = ((double[]) null);
        data1[34] = doubleArray;
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.ArrayIndexOutOfBoundsException: Index 34 out of bounds for length 31]
            org.apache.commons.math.linear.ArrayRealVector.getEntry(ArrayRealVector.java:622)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2345) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = 34;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double d2 = zMatrix.getEntry(knew, 0) / sqrtDenom;
 *  */
    @Test
    public void testUpdate_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[2][];
        double[] doubleArray = {0.0};
        data1[0] = doubleArray;
        double[] doubleArray1 = {};
        data1[1] = doubleArray1;
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        ArrayRealVector lagrangeValuesAtNewPoint = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {0.0, 0.0};
        setField(lagrangeValuesAtNewPoint, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lagrangeValuesAtNewPoint", lagrangeValuesAtNewPoint);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:295)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2353) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = 1;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = currentBest.getDimension();
 *  */
    @Test
    public void testUpdate_ThrowNullPointerException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = new BOBYQAOptimizer(0, 0.0, 0.0);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2302) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = -255;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ztest = Math.max(ztest, Math.abs(zMatrix.getEntry(k, j)));
 *  */
    @Test
    public void testUpdate_ThrowNullPointerException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2313) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = -252;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double tau = lagrangeValuesAtNewPoint.getEntry(knew);
 *  */
    @Test
    public void testUpdate_ThrowNullPointerException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2346) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = 1;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < npt; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work.setEntry(i, zMatrix.getEntry(knew, 0) * zMatrix.getEntry(i, 0));
 *  */
    @Test
    public void testUpdate_ThrowNullPointerException_5() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2343) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = -255;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.Array2DRowRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double d2 = zMatrix.getEntry(knew, 0) / sqrtDenom;
 *  */
    @Test
    public void testUpdate_ThrowNullPointerException_3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector lagrangeValuesAtNewPoint = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {0.0, 0.0};
        setField(lagrangeValuesAtNewPoint, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lagrangeValuesAtNewPoint", lagrangeValuesAtNewPoint);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2353) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = 1;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work.setEntry(jp, bMatrix.getEntry(knew, j));
 *  */
    @Test
    public void testUpdate_ThrowNullPointerException_4() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        double[] doubleArray = {0.0};
        data1[0] = doubleArray;
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        ArrayRealVector lagrangeValuesAtNewPoint = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(lagrangeValuesAtNewPoint, "org.apache.commons.math.linear.ArrayRealVector", "data", doubleArray);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lagrangeValuesAtNewPoint", lagrangeValuesAtNewPoint);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(BOBYQAOptimizer.java:2363) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = 0;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method update(double, double, int)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < npt; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: work.setEntry(i, zMatrix.getEntry(knew, 0) * zMatrix.getEntry(i, 0));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testUpdate_ThrowOutOfRangeException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = -1;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} twice
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: ztest = Math.max(ztest, Math.abs(zMatrix.getEntry(k, j)));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testUpdate_ThrowOutOfRangeException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        double[] doubleArray = {-0.0};
        data1[0] = doubleArray;
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = -255;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < npt; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: work.setEntry(i, zMatrix.getEntry(knew, 0) * zMatrix.getEntry(i, 0));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testUpdate_ThrowOutOfRangeException_3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = 0;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: ztest = Math.max(ztest, Math.abs(zMatrix.getEntry(k, j)));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testUpdate_ThrowOutOfRangeException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = -255;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: work.setEntry(jp, bMatrix.getEntry(knew, j));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testUpdate_ThrowOutOfRangeException_5() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -13);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = new double[32];
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        double[] doubleArray = {0.0};
        data1[0] = doubleArray;
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", bMatrix);
        ArrayRealVector lagrangeValuesAtNewPoint = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(lagrangeValuesAtNewPoint, "org.apache.commons.math.linear.ArrayRealVector", "data", doubleArray);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lagrangeValuesAtNewPoint", lagrangeValuesAtNewPoint);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = 0;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#update(double,double,int)}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: work.setEntry(jp, bMatrix.getEntry(knew, j));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testUpdate_ThrowOutOfRangeException_4() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        double[] doubleArray = {0.0};
        data1[0] = doubleArray;
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        ArrayRealVector lagrangeValuesAtNewPoint = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(lagrangeValuesAtNewPoint, "org.apache.commons.math.linear.ArrayRealVector", "data", doubleArray);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lagrangeValuesAtNewPoint", lagrangeValuesAtNewPoint);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class intType = int.class;
        Method updateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("update", doubleType, doubleType, intType);
        updateMethod.setAccessible(true);
        java.lang.Object[] updateMethodArguments = new java.lang.Object[3];
        updateMethodArguments[0] = java.lang.Double.NaN;
        updateMethodArguments[1] = java.lang.Double.NaN;
        updateMethodArguments[2] = 0;
        try {
            updateMethod.invoke(bOBYQAOptimizer, updateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.caller
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method caller(int)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#caller(int)}
 * @utbot.invokes {@link java.lang.Throwable#getStackTrace()}
 *  */
    @Test
    public void testCaller_ThrowableGetStackTrace() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Method callerMethod = bOBYQAOptimizerClazz.getDeclaredMethod("caller", intType);
        callerMethod.setAccessible(true);
        java.lang.Object[] callerMethodArguments = new java.lang.Object[1];
        callerMethodArguments[0] = 1;
        String actual = ((String) callerMethod.invoke(null, callerMethodArguments));
        
        String expected = "invoke0 (at line -2)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method caller(int)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#caller(int)}
 * @utbot.invokes {@link java.lang.Throwable#getStackTrace()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final StackTraceElement e = elements[n];
 *  */
    @Test
    public void testCaller_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.caller] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 30]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.caller(BOBYQAOptimizer.java:2456) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Method callerMethod = bOBYQAOptimizerClazz.getDeclaredMethod("caller", intType);
        callerMethod.setAccessible(true);
        java.lang.Object[] callerMethodArguments = new java.lang.Object[1];
        callerMethodArguments[0] = -256;
        try {
            callerMethod.invoke(null, callerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setup([D, [D)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#setup(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: boundDifference[i] = upperBound[i] - lowerBound[i];
 *  */
    @Test
    public void testSetup_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 5);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        double[] start = {8.0948E-320, 3.7857669957336824E-270};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        double[] doubleArray = {};
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup(BOBYQAOptimizer.java:2409) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method setupMethod = bOBYQAOptimizerClazz.getDeclaredMethod("setup", doubleArrayType, doubleArrayType);
        setupMethod.setAccessible(true);
        java.lang.Object[] setupMethodArguments = new java.lang.Object[2];
        setupMethodArguments[0] = ((Object) doubleArray);
        setupMethodArguments[1] = ((Object) doubleArray1);
        try {
            setupMethod.invoke(bOBYQAOptimizer, setupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#setup(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: boundDifference[i] = upperBound[i] - lowerBound[i];
 *  */
    @Test
    public void testSetup_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 4);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        double[] start = {2.1729236899484E-311, 0.0};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 0.0};
        double[] doubleArray1 = {-0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup(BOBYQAOptimizer.java:2409) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method setupMethod = bOBYQAOptimizerClazz.getDeclaredMethod("setup", doubleArrayType, doubleArrayType);
        setupMethod.setAccessible(true);
        java.lang.Object[] setupMethodArguments = new java.lang.Object[2];
        setupMethodArguments[0] = ((Object) doubleArray);
        setupMethodArguments[1] = ((Object) doubleArray1);
        try {
            setupMethod.invoke(bOBYQAOptimizer, setupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#setup(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: boundDifference[i] = upperBound[i] - lowerBound[i];
 *  */
    @Test
    public void testSetup_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 5);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        double[] start = {2.781342323134002E-309, 2.2250738585072014E-308};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup(BOBYQAOptimizer.java:2409) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method setupMethod = bOBYQAOptimizerClazz.getDeclaredMethod("setup", doubleArrayType, doubleArrayType);
        setupMethod.setAccessible(true);
        java.lang.Object[] setupMethodArguments = new java.lang.Object[2];
        setupMethodArguments[0] = ((Object) null);
        setupMethodArguments[1] = ((Object) doubleArray);
        try {
            setupMethod.invoke(bOBYQAOptimizer, setupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#setup(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boundDifference[i] = upperBound[i] - lowerBound[i];
 *  */
    @Test
    public void testSetup_ThrowNullPointerException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 6);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        double[] start = {4.796974999106545E-299, 2.8480945388892184E-306};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup(BOBYQAOptimizer.java:2409) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method setupMethod = bOBYQAOptimizerClazz.getDeclaredMethod("setup", doubleArrayType, doubleArrayType);
        setupMethod.setAccessible(true);
        java.lang.Object[] setupMethodArguments = new java.lang.Object[2];
        setupMethodArguments[0] = ((Object) null);
        setupMethodArguments[1] = ((Object) doubleArray);
        try {
            setupMethod.invoke(bOBYQAOptimizer, setupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#setup(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dimension; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boundDifference[i] = upperBound[i] - lowerBound[i];
 *  */
    @Test
    public void testSetup_ThrowNullPointerException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 5);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        double[] start = {2.0237E-320, 7.9E-323};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup(BOBYQAOptimizer.java:2409) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method setupMethod = bOBYQAOptimizerClazz.getDeclaredMethod("setup", doubleArrayType, doubleArrayType);
        setupMethod.setAccessible(true);
        java.lang.Object[] setupMethodArguments = new java.lang.Object[2];
        setupMethodArguments[0] = ((Object) null);
        setupMethodArguments[1] = ((Object) null);
        try {
            setupMethod.invoke(bOBYQAOptimizer, setupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setup([D, [D)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#setup(double[],double[])}
 * @utbot.executesCondition {@code (dimension < MINIMUM_PROBLEM_DIMENSION): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooSmallException} when: dimension < MINIMUM_PROBLEM_DIMENSION
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testSetup_ThrowNumberIsTooSmallException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        double[] start = {4.782976044828997E-299};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method setupMethod = bOBYQAOptimizerClazz.getDeclaredMethod("setup", doubleArrayType, doubleArrayType);
        setupMethod.setAccessible(true);
        java.lang.Object[] setupMethodArguments = new java.lang.Object[2];
        setupMethodArguments[0] = ((Object) null);
        setupMethodArguments[1] = ((Object) null);
        try {
            setupMethod.invoke(bOBYQAOptimizer, setupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#setup(double[],double[])}
 * @utbot.executesCondition {@code (dimension < MINIMUM_PROBLEM_DIMENSION): False}
 * @utbot.executesCondition {@code (numberOfInterpolationPoints < nPointsInterval[0]): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: nPointsInterval[1]
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetup_ThrowOutOfRangeException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 3);
        double[] start = {0.0, 0.0};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method setupMethod = bOBYQAOptimizerClazz.getDeclaredMethod("setup", doubleArrayType, doubleArrayType);
        setupMethod.setAccessible(true);
        java.lang.Object[] setupMethodArguments = new java.lang.Object[2];
        setupMethodArguments[0] = ((Object) null);
        setupMethodArguments[1] = ((Object) null);
        try {
            setupMethod.invoke(bOBYQAOptimizer, setupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#setup(double[],double[])}
 * @utbot.executesCondition {@code (dimension < MINIMUM_PROBLEM_DIMENSION): False}
 * @utbot.executesCondition {@code (numberOfInterpolationPoints < nPointsInterval[0]): False}
 * @utbot.executesCondition {@code (numberOfInterpolationPoints > nPointsInterval[1]): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: nPointsInterval[1]
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetup_ThrowOutOfRangeException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 7);
        double[] start = {2.652494739E-315, 8.289046E-317};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method setupMethod = bOBYQAOptimizerClazz.getDeclaredMethod("setup", doubleArrayType, doubleArrayType);
        setupMethod.setAccessible(true);
        java.lang.Object[] setupMethodArguments = new java.lang.Object[2];
        setupMethodArguments[0] = ((Object) null);
        setupMethodArguments[1] = ((Object) null);
        try {
            setupMethod.invoke(bOBYQAOptimizer, setupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method setup([D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#setup(double[],double[])}
     */
    @Test
    public void testSetupThrowsNPEWithNonEmptyPrimitiveArrays() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = new BOBYQAOptimizer(2, 0.0, 3.0);
        double[] doubleArray = {2.0, 2.0, 2.0};
        double[] doubleArray1 = {2.0, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, 2.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer.getStartPoint(BaseAbstractMultivariateOptimizer.java:139)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup(BOBYQAOptimizer.java:2386) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method setupMethod = bOBYQAOptimizerClazz.getDeclaredMethod("setup", doubleArrayType, doubleArrayType);
        setupMethod.setAccessible(true);
        java.lang.Object[] setupMethodArguments = new java.lang.Object[2];
        setupMethodArguments[0] = ((Object) doubleArray);
        setupMethodArguments[1] = ((Object) doubleArray1);
        try {
            setupMethod.invoke(bOBYQAOptimizer, setupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setup(lowerBound, upperBound);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 5);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        double[] lowerBound = {};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {4.9E-324, 4.9E-324};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup(BOBYQAOptimizer.java:2409)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize(BOBYQAOptimizer.java:239) */
        bOBYQAOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setup(lowerBound, upperBound);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 5);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        double[] lowerBound = {};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {6.32E-322};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {4.9E-324, 4.9E-324};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup(BOBYQAOptimizer.java:2409)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize(BOBYQAOptimizer.java:239) */
        bOBYQAOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setup(lowerBound, upperBound);
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 5);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        double[] lowerBound = {-2.2685123024461913E307, 0.0};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {1.5807169279415255E308};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {5.180654E-318, 1.780059086812237E-307};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup(BOBYQAOptimizer.java:2409)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize(BOBYQAOptimizer.java:239) */
        bOBYQAOptimizer.doOptimize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NumberIsTooSmallException} in: setup(lowerBound, upperBound);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testDoOptimize_ThrowNumberIsTooSmallException() throws Exception  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        double[] lowerBound = {5.06E-321};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {6.7903865311E-313, 2.652494739E-315};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {4.9E-324};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        bOBYQAOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: setup(lowerBound, upperBound);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDoOptimize_ThrowOutOfRangeException() throws Exception  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 7);
        double[] lowerBound = {-0.0};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {2.000000000000007, 2.0000000001164153};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {4.9E-324, 4.9E-324};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        bOBYQAOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: setup(lowerBound, upperBound);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDoOptimize_ThrowOutOfRangeException_1() throws Exception  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 3);
        double[] lowerBound = {2.225073858507233E-308, 1.390671161567E-309};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer", "upperBound", upperBound);
        double[] start = {4.9E-324, 4.9E-324};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "start", start);
        
        bOBYQAOptimizer.doOptimize();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method doOptimize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#doOptimize()}
     */
    @Test
    public void testDoOptimizeThrowsNPE() {
        BOBYQAOptimizer bOBYQAOptimizer = new BOBYQAOptimizer(-2147483647, -1.0, 0.0);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer.getLowerBound(BaseAbstractMultivariateSimpleBoundsOptimizer.java:72)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize(BOBYQAOptimizer.java:235) */
        bOBYQAOptimizer.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bobyqa([D, [D)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: upperDifference.setEntry(j, upperBound[j] - currentBest.getEntry(j));
 *  */
    @Test
    public void testBobyqa_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "boundDifference", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", currentBest);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:301) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) doubleArray);
        bobyqaMethodArguments[1] = ((Object) doubleArray1);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return bobyqb(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqa_ThrowNegativeArraySizeException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -256);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:63)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:385)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:332) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) null);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double boundDiff = boundDifference[j];
 *  */
    @Test
    public void testBobyqa_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        double[] boundDifference = {};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "boundDifference", boundDifference);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:299) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) null);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lowerDifference.setEntry(j, lowerBound[j] - currentBest.getEntry(j));
 *  */
    @Test
    public void testBobyqa_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "boundDifference", data);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:300) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) doubleArray);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return bobyqb(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqa_ThrowArithmeticException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1653)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:332) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) null);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = currentBest.getDimension();
 *  */
    @Test
    public void testBobyqa_ThrowNullPointerException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = new BOBYQAOptimizer(0, 0.0, 0.0);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:289) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) null);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: upperDifference.setEntry(j, upperBound[j] - currentBest.getEntry(j));
 *  */
    @Test
    public void testBobyqa_ThrowNullPointerException_5() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "boundDifference", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", currentBest);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:301) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) doubleArray);
        bobyqaMethodArguments[1] = ((Object) doubleArray);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lowerDifference.setEntry(j, lowerBound[j] - currentBest.getEntry(j));
 *  */
    @Test
    public void testBobyqa_ThrowNullPointerException_3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "boundDifference", data);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:300) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) doubleArray);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: upperDifference.setEntry(j, upperBound[j] - currentBest.getEntry(j));
 *  */
    @Test
    public void testBobyqa_ThrowNullPointerException_4() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "boundDifference", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", currentBest);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:301) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) doubleArray);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double boundDiff = boundDifference[j];
 *  */
    @Test
    public void testBobyqa_ThrowNullPointerException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:299) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) null);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lowerDifference.setEntry(j, lowerBound[j] - currentBest.getEntry(j));
 *  */
    @Test
    public void testBobyqa_ThrowNullPointerException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "boundDifference", data);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:300) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) null);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return bobyqb(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqa_ThrowNullPointerException_6() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1588)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:332) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) null);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return bobyqb(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqa_ThrowNullPointerException_7() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1610)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:332) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) null);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return bobyqb(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqa_ThrowNullPointerException_8() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector modelSecondDerivativesParameters = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {0.0};
        setField(modelSecondDerivativesParameters, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", modelSecondDerivativesParameters);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1612)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa(BOBYQAOptimizer.java:332) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) null);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method bobyqa([D, [D)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: lowerDifference.setEntry(j, lowerBound[j] - currentBest.getEntry(j));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testBobyqa_ThrowOutOfRangeException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "boundDifference", data);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {};
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        double[] doubleArray = {0.0};
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) doubleArray);
        bobyqaMethodArguments[1] = ((Object) null);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqa(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: upperDifference.setEntry(j, upperBound[j] - currentBest.getEntry(j));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testBobyqa_ThrowOutOfRangeException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        double[] boundDifference = {0.0};
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "boundDifference", boundDifference);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", boundDifference);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        ArrayRealVector upperDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {};
        setField(upperDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "upperDifference", upperDifference);
        double[] doubleArray = {0.0};
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqaMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqa", doubleArrayType, doubleArrayType);
        bobyqaMethod.setAccessible(true);
        java.lang.Object[] bobyqaMethodArguments = new java.lang.Object[2];
        bobyqaMethodArguments[0] = ((Object) doubleArray);
        bobyqaMethodArguments[1] = ((Object) doubleArray);
        try {
            bobyqaMethod.invoke(bOBYQAOptimizer, bobyqaMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method bobyqb([D, [D)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final ArrayRealVector work2 = new ArrayRealVector(npt);
 *  */
    @Test
    public void testBobyqb_ThrowNegativeArraySizeException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -256);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:63)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:385) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowArithmeticException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector modelSecondDerivativesParameters = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {0.0};
        setField(modelSecondDerivativesParameters, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", modelSecondDerivativesParameters);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1653)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {0.0};
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        ArrayRealVector modelSecondDerivativesValues = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {0.0};
        setField(modelSecondDerivativesValues, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesValues", modelSecondDerivativesValues);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1672)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) doubleArray);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testBobyqb_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        evaluations.setMaximalCount(1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        MultivariateFunctionMappingAdapter function = ((MultivariateFunctionMappingAdapter) createInstance("org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter"));
        java.lang.Object[] mappers = createArray("org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter$Mapper", 1);
        setField(function, "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter", "mappers", mappers);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.unboundedToBounded(MultivariateFunctionMappingAdapter.java:147)
            org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.value(MultivariateFunctionMappingAdapter.java:180)
            org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer.computeObjectiveValue(BaseAbstractMultivariateOptimizer.java:98)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1683)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {0.0};
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        ArrayRealVector upperDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {};
        setField(upperDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "upperDifference", upperDifference);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesValues", originShift);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.ArrayRealVector.getEntry(ArrayRealVector.java:622)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1634)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = currentBest.getDimension();
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = new BOBYQAOptimizer(0, 0.0, 0.0);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:378) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1588)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1598)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException_3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1610)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException_4() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector modelSecondDerivativesParameters = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {0.0};
        setField(modelSecondDerivativesParameters, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", modelSecondDerivativesParameters);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1612)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException_5() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {0.0};
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1600)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException_8() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {0.0};
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        ArrayRealVector modelSecondDerivativesValues = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {0.0};
        setField(modelSecondDerivativesValues, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesValues", modelSecondDerivativesValues);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1672)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException_9() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Array2DRowRealMatrix interpolationPoints = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        double[] doubleArray = {0.0};
        data1[0] = doubleArray;
        setField(interpolationPoints, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "interpolationPoints", interpolationPoints);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", doubleArray);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1607)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException_10() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {0.0};
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        ArrayRealVector modelSecondDerivativesValues = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {0.0};
        setField(modelSecondDerivativesValues, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesValues", modelSecondDerivativesValues);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1673)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) doubleArray);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException_6() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {0.0};
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        ArrayRealVector modelSecondDerivativesValues = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {0.0};
        setField(modelSecondDerivativesValues, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesValues", modelSecondDerivativesValues);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1640)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#bobyqb(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: prelim(lowerBound, upperBound);
 *  */
    @Test
    public void testBobyqb_ThrowNullPointerException_7() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", -255);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {0.0, 0.0};
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        ArrayRealVector modelSecondDerivativesValues = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {0.0};
        setField(modelSecondDerivativesValues, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesValues", modelSecondDerivativesValues);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1634)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(BOBYQAOptimizer.java:407) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method bobyqbMethod = bOBYQAOptimizerClazz.getDeclaredMethod("bobyqb", doubleArrayType, doubleArrayType);
        bobyqbMethod.setAccessible(true);
        java.lang.Object[] bobyqbMethodArguments = new java.lang.Object[2];
        bobyqbMethodArguments[0] = ((Object) null);
        bobyqbMethodArguments[1] = ((Object) null);
        try {
            bobyqbMethod.invoke(bOBYQAOptimizer, bobyqbMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for bobyqb
    
    public void testBobyqb_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException is not accessible from package org.apache.commons.math.optimization.direct
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method prelim([D, [D)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.executesCondition {@code (nfm <= 2 * n): False}
 * @utbot.invokes {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#getEvaluations()}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: final int tmp1 = (nfm - np) / n;
 *  */
    @Test
    public void testPrelim_ThrowArithmeticException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1653) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = currentBest.getDimension();
 *  */
    @Test
    public void testPrelim_ThrowNullPointerException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = new BOBYQAOptimizer(0, 0.0, 0.0);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1586) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int ndim = bMatrix.getRowDimension();
 *  */
    @Test
    public void testPrelim_ThrowNullPointerException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1588) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: modelSecondDerivativesParameters.setEntry(k, ZERO);
 *  */
    @Test
    public void testPrelim_ThrowNullPointerException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1610) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originShift.setEntry(j, currentBest.getEntry(j));
 *  */
    @Test
    public void testPrelim_ThrowNullPointerException_3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1598) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: interpolationPoints.setEntry(k, j, ZERO);
 *  */
    @Test
    public void testPrelim_ThrowNullPointerException_5() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1600) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0, max = n * np / 2; i < max; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: modelSecondDerivativesValues.setEntry(i, ZERO);
 *  */
    @Test
    public void testPrelim_ThrowNullPointerException_6() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1607) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: modelSecondDerivativesParameters.setEntry(k, ZERO);
 *  */
    @Test
    public void testPrelim_ThrowNullPointerException_7() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1610) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: zMatrix.setEntry(k, j, ZERO);
 *  */
    @Test
    public void testPrelim_ThrowNullPointerException_4() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 256);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector modelSecondDerivativesParameters = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {0.0};
        setField(modelSecondDerivativesParameters, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", modelSecondDerivativesParameters);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1612) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prelim([D, [D)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < n; j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: interpolationPoints.setEntry(k, j, ZERO);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testPrelim_ThrowOutOfRangeException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "interpolationPoints", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", currentBest);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.executesCondition {@code (nfm <= 2 * n): True}
 * @utbot.executesCondition {@code (nfm >= 1): False}
 * @utbot.executesCondition {@code (nfm > n): False}
 * @utbot.invokes {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#getEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#toArray()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#computeObjectiveValue(double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.TooManyEvaluationsException} in: final double objectiveValue = computeObjectiveValue(currentBest.toArray());
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testPrelim_ThrowTooManyEvaluationsException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math.util.Incrementor$1"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#prelim(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: zMatrix.setEntry(k, j, ZERO);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testPrelim_ThrowOutOfRangeException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 256);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        ArrayRealVector modelSecondDerivativesParameters = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {0.0};
        setField(modelSecondDerivativesParameters, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", modelSecondDerivativesParameters);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method prelim([D, [D)
    
    @Test
    public void testPrelim1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -2147483647);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {
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
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        MultivariateFunctionMappingAdapter function = ((MultivariateFunctionMappingAdapter) createInstance("org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter"));
        java.lang.Object[] mappers = createArray("org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter$Mapper", 1);
        setField(function, "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter", "mappers", mappers);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "function", function);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.unboundedToBounded(MultivariateFunctionMappingAdapter.java:147)
            org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.value(MultivariateFunctionMappingAdapter.java:180)
            org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer.computeObjectiveValue(BaseAbstractMultivariateOptimizer.java:98)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1683) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray1);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrelim2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[9][];
        data1[0] = data;
        data1[1] = ((double[]) null);
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "interpolationPoints", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", currentBest);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.Array2DRowRealMatrix.setEntry(Array2DRowRealMatrix.java:302)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1603) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrelim3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -2147483647);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", java.lang.Double.NaN);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.Incrementor.incrementCount(Incrementor.java:151)
            org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer.computeObjectiveValue(BaseAbstractMultivariateOptimizer.java:94)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1683) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrelim4() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -2147483647);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesValues", originShift);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1673) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrelim5() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", java.lang.Double.NaN);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector modelSecondDerivativesParameters = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(modelSecondDerivativesParameters, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", modelSecondDerivativesParameters);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer.getEvaluations(BaseAbstractMultivariateOptimizer.java:76)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1624) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrelim6() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Array2DRowRealMatrix interpolationPoints = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[9][];
        data1[0] = data;
        data1[1] = ((double[]) null);
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        setField(interpolationPoints, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "interpolationPoints", interpolationPoints);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", currentBest);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1607) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrelim7() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -2147483647);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesValues", originShift);
        double[] doubleArray = {};
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer.getEvaluations(BaseAbstractMultivariateOptimizer.java:76)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1624) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray1);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrelim8() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -2147483647);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {
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
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        MultivariateFunctionMappingAdapter function = ((MultivariateFunctionMappingAdapter) createInstance("org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter"));
        MicrosphereInterpolatingFunction bounded = ((MicrosphereInterpolatingFunction) createInstance("org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction"));
        setField(function, "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter", "bounded", bounded);
        java.lang.Object[] mappers = createArray("org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter$Mapper", 0);
        setField(function, "org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter", "mappers", mappers);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.value(MicrosphereInterpolatingFunction.java:198)
            org.apache.commons.math.optimization.direct.MultivariateFunctionMappingAdapter.value(MultivariateFunctionMappingAdapter.java:180)
            org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer.computeObjectiveValue(BaseAbstractMultivariateOptimizer.java:98)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1683) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) null);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrelim9() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {
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
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector modelSecondDerivativesParameters = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {0.0, 0.0, 0.0, 0.0};
        setField(modelSecondDerivativesParameters, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", modelSecondDerivativesParameters);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        MicrosphereInterpolatingFunction function = ((MicrosphereInterpolatingFunction) createInstance("org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction"));
        ArrayList microsphere = new ArrayList();
        setField(function, "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction", "microsphere", microsphere);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "function", function);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.value(MicrosphereInterpolatingFunction.java:203)
            org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer.computeObjectiveValue(BaseAbstractMultivariateOptimizer.java:98)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1683) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray1);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testPrelim10() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -2147483647);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {
            null,
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
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math.util.Incrementor", "count", -4130);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "evaluations", evaluations);
        MicrosphereInterpolatingFunction function = ((MicrosphereInterpolatingFunction) createInstance("org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction"));
        ArrayList microsphere = new ArrayList();
        microsphere.add(null);
        microsphere.add(null);
        microsphere.add(null);
        setField(function, "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction", "microsphere", microsphere);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer", "function", function);
        double[] doubleArray = new double[18];
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim] produces [java.lang.NullPointerException]
            org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction.value(MicrosphereInterpolatingFunction.java:199)
            org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer.computeObjectiveValue(BaseAbstractMultivariateOptimizer.java:98)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(BOBYQAOptimizer.java:1683) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray1);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method prelim([D, [D)
    
    @Test(expected = OutOfRangeException.class)
    public void testPrelim11() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -2147483647);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[9][];
        double[] doubleArray = {};
        data1[0] = doubleArray;
        data1[1] = ((double[]) null);
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", currentBest);
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArray1Type, doubleArray1Type);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray1);
        prelimMethodArguments[1] = ((Object) doubleArray1);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testPrelim12() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {
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
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", currentBest);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testPrelim13() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", java.lang.Double.NaN);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", currentBest);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testPrelim14() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {
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
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Array2DRowRealMatrix interpolationPoints = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "interpolationPoints", interpolationPoints);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", currentBest);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testPrelim15() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1073741824);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data1[0] = doubleArray;
        data1[1] = ((double[]) null);
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", bMatrix);
        ArrayRealVector modelSecondDerivativesParameters = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(modelSecondDerivativesParameters, "org.apache.commons.math.linear.ArrayRealVector", "data", doubleArray);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", modelSecondDerivativesParameters);
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) doubleArray1);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testPrelim16() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Array2DRowRealMatrix interpolationPoints = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {};
        setField(interpolationPoints, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "interpolationPoints", interpolationPoints);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", currentBest);
        double[] doubleArray = {};
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray1);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testPrelim17() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -2147483647);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        ArrayRealVector originShift = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(originShift, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "originShift", originShift);
        ArrayRealVector modelSecondDerivativesValues = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {};
        setField(modelSecondDerivativesValues, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesValues", modelSecondDerivativesValues);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) doubleArray);
        prelimMethodArguments[1] = ((Object) doubleArray);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testPrelim18() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1073741824);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "initialTrustRegionRadius", 0.0);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", bMatrix);
        ArrayRealVector modelSecondDerivativesParameters = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(modelSecondDerivativesParameters, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "modelSecondDerivativesParameters", modelSecondDerivativesParameters);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method prelimMethod = bOBYQAOptimizerClazz.getDeclaredMethod("prelim", doubleArrayType, doubleArrayType);
        prelimMethod.setAccessible(true);
        java.lang.Object[] prelimMethodArguments = new java.lang.Object[2];
        prelimMethodArguments[0] = ((Object) null);
        prelimMethodArguments[1] = ((Object) doubleArray);
        try {
            prelimMethod.invoke(bOBYQAOptimizer, prelimMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method altmov(int, double)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final ArrayRealVector hcol = new ArrayRealVector(npt);
 *  */
    @Test
    public void testAltmov_ThrowNegativeArraySizeException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -256);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.linear.ArrayRealVector.<init>(ArrayRealVector.java:63)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1266) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = -255;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} twice
 * @utbot.iterates iterate the loop {@code for(int j = 0, max = npt - n - 1; j < max; j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double tmp = zMatrix.getEntry(knew, j);
 *  */
    @Test
    public void testAltmov_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[2][];
        double[] doubleArray = {0.0};
        data1[0] = doubleArray;
        double[] doubleArray1 = {};
        data1[1] = doubleArray1;
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:295)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1275) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 1;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} twice
 * @utbot.iterates iterate the loop {@code for(int j = 0, max = npt - n - 1; j < max; j++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double alpha = hcol.getEntry(knew);
 *  */
    @Test
    public void testAltmov_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[32][];
        double[] doubleArray = {0.0};
        data1[0] = doubleArray;
        data1[1] = doubleArray;
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        data1[9] = ((double[]) null);
        data1[10] = ((double[]) null);
        data1[11] = ((double[]) null);
        data1[12] = ((double[]) null);
        data1[13] = ((double[]) null);
        data1[14] = ((double[]) null);
        data1[15] = ((double[]) null);
        data1[16] = ((double[]) null);
        data1[17] = ((double[]) null);
        data1[18] = ((double[]) null);
        data1[19] = ((double[]) null);
        data1[20] = ((double[]) null);
        data1[21] = ((double[]) null);
        data1[22] = ((double[]) null);
        data1[23] = ((double[]) null);
        data1[24] = ((double[]) null);
        data1[25] = ((double[]) null);
        data1[26] = ((double[]) null);
        data1[27] = ((double[]) null);
        data1[28] = ((double[]) null);
        data1[29] = ((double[]) null);
        data1[30] = ((double[]) null);
        data1[31] = doubleArray;
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.ArrayIndexOutOfBoundsException: Index 31 out of bounds for length 2]
            org.apache.commons.math.linear.ArrayRealVector.getEntry(ArrayRealVector.java:622)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1280) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 31;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = currentBest.getDimension();
 *  */
    @Test
    public void testAltmov_ThrowNullPointerException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = new BOBYQAOptimizer(0, 0.0, 0.0);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1262) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = -255;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: glag.setEntry(i, bMatrix.getEntry(knew, i));
 *  */
    @Test
    public void testAltmov_ThrowNullPointerException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1286) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 0;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} twice
 * @utbot.iterates iterate the loop {@code for(int j = 0, max = npt - n - 1; j < max; j++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double tmp = zMatrix.getEntry(knew, j);
 *  */
    @Test
    public void testAltmov_ThrowNullPointerException_3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1275) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = -255;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tmp += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
 *  */
    @Test
    public void testAltmov_ThrowNullPointerException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        data1[0] = data;
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1291) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 0;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tmp += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
 *  */
    @Test
    public void testAltmov_ThrowNullPointerException_4() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        data1[0] = data;
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "interpolationPoints", bMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1291) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 0;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method altmov(int, double)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} twice
 * @utbot.iterates iterate the loop {@code for(int j = 0, max = npt - n - 1; j < max; j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: final double tmp = zMatrix.getEntry(knew, j);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAltmov_ThrowOutOfRangeException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = -1;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: glag.setEntry(i, bMatrix.getEntry(knew, i));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAltmov_ThrowOutOfRangeException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = {null};
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 0;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} twice
 * @utbot.iterates iterate the loop {@code for(int j = 0, max = npt - n - 1; j < max; j++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: hcol.setEntry(k, hcol.getEntry(k) + tmp * zMatrix.getEntry(k, j));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAltmov_ThrowOutOfRangeException_3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        double[] doubleArray = {0.0};
        data1[0] = doubleArray;
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 0;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#altmov(int,double)}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < npt; k++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: tmp += interpolationPoints.getEntry(k, j) * trustRegionCenterOffset.getEntry(j);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAltmov_ThrowOutOfRangeException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        data1[0] = data;
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        Array2DRowRealMatrix interpolationPoints = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data2 = {};
        setField(interpolationPoints, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "interpolationPoints", interpolationPoints);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 0;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method altmov(int, double)
    
    @Test
    public void testAltmov1() throws Exception  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[11][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data1[0] = doubleArray;
        data1[1] = doubleArray;
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        data1[9] = ((double[]) null);
        data1[10] = ((double[]) null);
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 0;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        double[] actual = ((double[]) altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments));
        
        double[] expected = {0.0, 0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
        
        Array2DRowRealMatrix bOBYQAOptimizerZMatrix = ((Array2DRowRealMatrix) getFieldValue(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix"));
        double[][] bOBYQAOptimizerZMatrixZMatrixData = ((double[][]) getFieldValue(bOBYQAOptimizerZMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalBOBYQAOptimizerZMatrixData2 = ((double[]) get(bOBYQAOptimizerZMatrixZMatrixData, 2));
        Array2DRowRealMatrix bOBYQAOptimizerZMatrix1 = ((Array2DRowRealMatrix) getFieldValue(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix"));
        double[][] bOBYQAOptimizerZMatrix1ZMatrixData = ((double[][]) getFieldValue(bOBYQAOptimizerZMatrix1, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalBOBYQAOptimizerZMatrixData3 = ((double[]) get(bOBYQAOptimizerZMatrix1ZMatrixData, 3));
        Array2DRowRealMatrix bOBYQAOptimizerZMatrix2 = ((Array2DRowRealMatrix) getFieldValue(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix"));
        double[][] bOBYQAOptimizerZMatrix2ZMatrixData = ((double[][]) getFieldValue(bOBYQAOptimizerZMatrix2, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalBOBYQAOptimizerZMatrixData4 = ((double[]) get(bOBYQAOptimizerZMatrix2ZMatrixData, 4));
        Array2DRowRealMatrix bOBYQAOptimizerZMatrix3 = ((Array2DRowRealMatrix) getFieldValue(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix"));
        double[][] bOBYQAOptimizerZMatrix3ZMatrixData = ((double[][]) getFieldValue(bOBYQAOptimizerZMatrix3, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalBOBYQAOptimizerZMatrixData5 = ((double[]) get(bOBYQAOptimizerZMatrix3ZMatrixData, 5));
        Array2DRowRealMatrix bOBYQAOptimizerZMatrix4 = ((Array2DRowRealMatrix) getFieldValue(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix"));
        double[][] bOBYQAOptimizerZMatrix4ZMatrixData = ((double[][]) getFieldValue(bOBYQAOptimizerZMatrix4, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalBOBYQAOptimizerZMatrixData6 = ((double[]) get(bOBYQAOptimizerZMatrix4ZMatrixData, 6));
        Array2DRowRealMatrix bOBYQAOptimizerZMatrix5 = ((Array2DRowRealMatrix) getFieldValue(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix"));
        double[][] bOBYQAOptimizerZMatrix5ZMatrixData = ((double[][]) getFieldValue(bOBYQAOptimizerZMatrix5, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalBOBYQAOptimizerZMatrixData7 = ((double[]) get(bOBYQAOptimizerZMatrix5ZMatrixData, 7));
        Array2DRowRealMatrix bOBYQAOptimizerZMatrix6 = ((Array2DRowRealMatrix) getFieldValue(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix"));
        double[][] bOBYQAOptimizerZMatrix6ZMatrixData = ((double[][]) getFieldValue(bOBYQAOptimizerZMatrix6, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalBOBYQAOptimizerZMatrixData8 = ((double[]) get(bOBYQAOptimizerZMatrix6ZMatrixData, 8));
        Array2DRowRealMatrix bOBYQAOptimizerZMatrix7 = ((Array2DRowRealMatrix) getFieldValue(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix"));
        double[][] bOBYQAOptimizerZMatrix7ZMatrixData = ((double[][]) getFieldValue(bOBYQAOptimizerZMatrix7, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalBOBYQAOptimizerZMatrixData9 = ((double[]) get(bOBYQAOptimizerZMatrix7ZMatrixData, 9));
        Array2DRowRealMatrix bOBYQAOptimizerZMatrix8 = ((Array2DRowRealMatrix) getFieldValue(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix"));
        double[][] bOBYQAOptimizerZMatrix8ZMatrixData = ((double[][]) getFieldValue(bOBYQAOptimizerZMatrix8, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalBOBYQAOptimizerZMatrixData10 = ((double[]) get(bOBYQAOptimizerZMatrix8ZMatrixData, 10));
        
        assertNull(finalBOBYQAOptimizerZMatrixData2);
        
        assertNull(finalBOBYQAOptimizerZMatrixData3);
        
        assertNull(finalBOBYQAOptimizerZMatrixData4);
        
        assertNull(finalBOBYQAOptimizerZMatrixData5);
        
        assertNull(finalBOBYQAOptimizerZMatrixData6);
        
        assertNull(finalBOBYQAOptimizerZMatrixData7);
        
        assertNull(finalBOBYQAOptimizerZMatrixData8);
        
        assertNull(finalBOBYQAOptimizerZMatrixData9);
        
        assertNull(finalBOBYQAOptimizerZMatrixData10);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method altmov(int, double)
    
    @Test
    public void testAltmov2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 6);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix zMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data1[0] = doubleArray;
        data1[1] = ((double[]) null);
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        setField(zMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "zMatrix", zMatrix);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:295)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1277) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 0;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAltmov3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data1[0] = doubleArray;
        data1[1] = ((double[]) null);
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "interpolationPoints", bMatrix);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", doubleArray);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1419) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 0;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAltmov4() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 1);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterInterpolationPointIndex", 1);
        Array2DRowRealMatrix bMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data1[0] = doubleArray;
        data1[1] = ((double[]) null);
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        setField(bMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "bMatrix", bMatrix);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "interpolationPoints", bMatrix);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", doubleArray);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(BOBYQAOptimizer.java:1419) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method altmovMethod = bOBYQAOptimizerClazz.getDeclaredMethod("altmov", intType, doubleType);
        altmovMethod.setAccessible(true);
        java.lang.Object[] altmovMethodArguments = new java.lang.Object[2];
        altmovMethodArguments[0] = 0;
        altmovMethodArguments[1] = java.lang.Double.NaN;
        try {
            altmovMethod.invoke(bOBYQAOptimizer, altmovMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trsbox(double, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.invokes org.apache.commons.math.optimization.direct.BOBYQAOptimizer#printMethod()
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#getDimension()}
 * @utbot.invokes org.apache.commons.math.optimization.direct.BOBYQAOptimizer#printState(int)
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.returnsFrom {@code return new double[] { dsq, crvmin };}
 *  */
    @Test
    public void testTrsbox_StepsqEqualsZERO() throws Exception  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = ((Object) null);
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        double[] actual = ((double[]) trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments));
        
        double[] expected = {0.0, -1.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method trsbox(double, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: trustRegionCenterOffset.getEntry(i) <= lowerDifference.getEntry(i)
 *  */
    @Test
    public void testTrsbox_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.ArrayRealVector.getEntry(ArrayRealVector.java:622)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1851) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.ArrayRealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = currentBest.getDimension();
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = new BOBYQAOptimizer(0, 0.0, 0.0);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1814) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = ((Object) null);
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: xbdi.setEntry(i, ZERO);
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1850) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = ((Object) null);
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: trustRegionCenterOffset.getEntry(i) <= lowerDifference.getEntry(i)
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1851) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: trustRegionCenterOffset.getEntry(i) <= lowerDifference.getEntry(i)
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_3() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", currentBest);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1851) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: gradientAtTrustRegionCenter.getEntry(i) >= ZERO
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_4() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {4.9E-324};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", currentBest);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {2.652494739E-315};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1852) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: trialStepPoint.setEntry(i, ZERO);
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_7() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {-0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {4.774494577E-314};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "gradientAtTrustRegionCenter", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", trustRegionCenterOffset);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {1.1125369292536007E-308};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1863) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: s.setEntry(i, -gnew.getEntry(i));
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_13() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {-4.9E-324};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {1.67885504033475E-154};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "gradientAtTrustRegionCenter", currentBest);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {1.67885504033475E-154};
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trialStepPoint", lowerDifference);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        ArrayRealVector arrayRealVector1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {5.304989477E-315};
        setField(arrayRealVector1, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1890) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = arrayRealVector;
        trsboxMethodArguments[2] = arrayRealVector1;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gnew.setEntry(i, gradientAtTrustRegionCenter.getEntry(i));
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_8() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", 2);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {java.lang.Double.NaN};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {-2.2808640455958926E-307};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        ArrayRealVector gradientAtTrustRegionCenter = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(gradientAtTrustRegionCenter, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "gradientAtTrustRegionCenter", gradientAtTrustRegionCenter);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {-2.2808640455958926E-307};
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trialStepPoint", gradientAtTrustRegionCenter);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {java.lang.Double.NaN};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1864) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: trustRegionCenterOffset.getEntry(i) >= upperDifference.getEntry(i)
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_5() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {2.907249366697211E-216};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {-1.5508464589694258E26};
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {4.345847379897E-311};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1855) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: gradientAtTrustRegionCenter.getEntry(i) <= ZERO
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_6() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {7.416905892095747E-309};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {7.416905892095747E-309};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {java.lang.Double.NaN};
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "upperDifference", currentBest);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {6.32E-322};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1856) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gnew.setEntry(i, gradientAtTrustRegionCenter.getEntry(i));
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_9() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {-2.2250741237566757E-308};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {-9.556620592710777E-299};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {-1.281333333664003E-144};
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "upperDifference", currentBest);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trialStepPoint", currentBest);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {4.0E-323, 4.0E-323};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1864) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: s.setEntry(i, ZERO);
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_12() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {3.16E-322};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {3.16E-322};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        ArrayRealVector gradientAtTrustRegionCenter = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {-1.1125369292536007E-308};
        setField(gradientAtTrustRegionCenter, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "gradientAtTrustRegionCenter", gradientAtTrustRegionCenter);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        ArrayRealVector trialStepPoint = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(trialStepPoint, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trialStepPoint", trialStepPoint);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {0.0};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1888) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = arrayRealVector;
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: trialStepPoint.setEntry(i, ZERO);
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_10() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {3.337610787760802E-308};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {3.440431550731873E-106};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "gradientAtTrustRegionCenter", currentBest);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {java.lang.Double.NEGATIVE_INFINITY};
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        ArrayRealVector upperDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {3.440431550731873E-106};
        setField(upperDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "upperDifference", upperDifference);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data4 = {1.6578092E-316};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data4);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1863) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: trialStepPoint.setEntry(i, ZERO);
 *  */
    @Test
    public void testTrsbox_ThrowNullPointerException_11() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {4.9E-324};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {4.9E-324};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        ArrayRealVector gradientAtTrustRegionCenter = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {-0.0, 0.0};
        setField(gradientAtTrustRegionCenter, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "gradientAtTrustRegionCenter", gradientAtTrustRegionCenter);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {-1.0E-323};
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "upperDifference", currentBest);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data4 = {java.lang.Double.NaN};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data4);
        
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(BOBYQAOptimizer.java:1863) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method trsbox(double, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: xbdi.setEntry(i, ZERO);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testTrsbox_ThrowOutOfRangeException() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {};
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = ((Object) null);
        trsboxMethodArguments[2] = arrayRealVector;
        trsboxMethodArguments[3] = ((Object) null);
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: s.setEntry(i, ZERO);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testTrsbox_ThrowOutOfRangeException_1() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {7.9E-323};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {-2.0};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        ArrayRealVector gradientAtTrustRegionCenter = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {-1.4916681462400413E-154, 0.0};
        setField(gradientAtTrustRegionCenter, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "gradientAtTrustRegionCenter", gradientAtTrustRegionCenter);
        ArrayRealVector lowerDifference = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(lowerDifference, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", lowerDifference);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trialStepPoint", lowerDifference);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        ArrayRealVector arrayRealVector1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(arrayRealVector1, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        ArrayRealVector arrayRealVector2 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {};
        setField(arrayRealVector2, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = arrayRealVector;
        trsboxMethodArguments[2] = arrayRealVector1;
        trsboxMethodArguments[3] = arrayRealVector2;
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#trsbox(double,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector,org.apache.commons.math.linear.ArrayRealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < n; i++)} once
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: s.setEntry(i, -gnew.getEntry(i));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testTrsbox_ThrowOutOfRangeException_2() throws Throwable  {
        BOBYQAOptimizer bOBYQAOptimizer = ((BOBYQAOptimizer) createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "numberOfInterpolationPoints", -255);
        ArrayRealVector currentBest = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(currentBest, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "currentBest", currentBest);
        ArrayRealVector trustRegionCenterOffset = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data1 = {2.999313938030556E-309};
        setField(trustRegionCenterOffset, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trustRegionCenterOffset", trustRegionCenterOffset);
        ArrayRealVector gradientAtTrustRegionCenter = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data2 = {-3.31561842E-316, 0.0};
        setField(gradientAtTrustRegionCenter, "org.apache.commons.math.linear.ArrayRealVector", "data", data2);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "gradientAtTrustRegionCenter", gradientAtTrustRegionCenter);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "lowerDifference", trustRegionCenterOffset);
        ArrayRealVector trialStepPoint = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data3 = {5.06E-321};
        setField(trialStepPoint, "org.apache.commons.math.linear.ArrayRealVector", "data", data3);
        setField(bOBYQAOptimizer, "org.apache.commons.math.optimization.direct.BOBYQAOptimizer", "trialStepPoint", trialStepPoint);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math.linear.ArrayRealVector", "data", data1);
        ArrayRealVector arrayRealVector1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data4 = {java.lang.Double.NaN, java.lang.Double.NaN};
        setField(arrayRealVector1, "org.apache.commons.math.linear.ArrayRealVector", "data", data4);
        ArrayRealVector arrayRealVector2 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data5 = {};
        setField(arrayRealVector2, "org.apache.commons.math.linear.ArrayRealVector", "data", data5);
        
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class doubleType = double.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Method trsboxMethod = bOBYQAOptimizerClazz.getDeclaredMethod("trsbox", doubleType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType, arrayRealVectorType);
        trsboxMethod.setAccessible(true);
        java.lang.Object[] trsboxMethodArguments = new java.lang.Object[6];
        trsboxMethodArguments[0] = java.lang.Double.NaN;
        trsboxMethodArguments[1] = arrayRealVector;
        trsboxMethodArguments[2] = arrayRealVector1;
        trsboxMethodArguments[3] = arrayRealVector2;
        trsboxMethodArguments[4] = ((Object) null);
        trsboxMethodArguments[5] = ((Object) null);
        try {
            trsboxMethod.invoke(bOBYQAOptimizer, trsboxMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.printMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printMethod()
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#printMethod()}
 *  */
    @Test
    public void testPrintMethod() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Method printMethodMethod = bOBYQAOptimizerClazz.getDeclaredMethod("printMethod");
        printMethodMethod.setAccessible(true);
        java.lang.Object[] printMethodMethodArguments = new java.lang.Object[0];
        printMethodMethod.invoke(null, printMethodMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.printState
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method printState(int)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#printState(int)}
 *  */
    @Test
    public void testPrintState() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Method printStateMethod = bOBYQAOptimizerClazz.getDeclaredMethod("printState", intType);
        printStateMethod.setAccessible(true);
        java.lang.Object[] printStateMethodArguments = new java.lang.Object[1];
        printStateMethodArguments[0] = -255;
        printStateMethod.invoke(null, printStateMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.direct.BOBYQAOptimizer.fillNewArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method fillNewArray(int, double)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#fillNewArray(int,double)}
 * @utbot.invokes {@link java.util.Arrays#fill(double[],double)}
 * @utbot.returnsFrom {@code return ds;}
 *  */
    @Test
    public void testFillNewArray_ArraysFill() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method fillNewArrayMethod = bOBYQAOptimizerClazz.getDeclaredMethod("fillNewArray", intType, doubleType);
        fillNewArrayMethod.setAccessible(true);
        java.lang.Object[] fillNewArrayMethodArguments = new java.lang.Object[2];
        fillNewArrayMethodArguments[0] = 0;
        fillNewArrayMethodArguments[1] = java.lang.Double.NaN;
        double[] actual = ((double[]) fillNewArrayMethod.invoke(null, fillNewArrayMethodArguments));
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method fillNewArray(int, double)
    
    /**
    @utbot.classUnderTest {@link BOBYQAOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#fillNewArray(int,double)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] ds = new double[n];
 *  */
    @Test
    public void testFillNewArray_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.optimization.direct.BOBYQAOptimizer.fillNewArray] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer.fillNewArray(BOBYQAOptimizer.java:2447) */
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method fillNewArrayMethod = bOBYQAOptimizerClazz.getDeclaredMethod("fillNewArray", intType, doubleType);
        fillNewArrayMethod.setAccessible(true);
        java.lang.Object[] fillNewArrayMethodArguments = new java.lang.Object[2];
        fillNewArrayMethodArguments[0] = -256;
        fillNewArrayMethodArguments[1] = java.lang.Double.NaN;
        try {
            fillNewArrayMethod.invoke(null, fillNewArrayMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method fillNewArray(int, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.direct.BOBYQAOptimizer#fillNewArray(int,double)}
     */
    @Test(expected = OutOfMemoryError.class)
    public void testFillNewArrayThrowsOOMEWithCornerCase() throws Throwable  {
        Class bOBYQAOptimizerClazz = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class intType = int.class;
        Class doubleType = double.class;
        Method fillNewArrayMethod = bOBYQAOptimizerClazz.getDeclaredMethod("fillNewArray", intType, doubleType);
        fillNewArrayMethod.setAccessible(true);
        java.lang.Object[] fillNewArrayMethodArguments = new java.lang.Object[2];
        fillNewArrayMethodArguments[0] = Integer.MAX_VALUE;
        fillNewArrayMethodArguments[1] = 2.0;
        try {
            fillNewArrayMethod.invoke(null, fillNewArrayMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields726975150897200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields726975150897200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass726975150904100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields726975150897200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass726975150904100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields726975151320200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields726975151320200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass726975151331600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields726975151320200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass726975151331600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

