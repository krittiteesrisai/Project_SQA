package org.apache.commons.math.optimization.general;

import org.junit.Test;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import java.lang.reflect.Method;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.fitting.CurveFitter;
import java.util.ArrayList;
import org.apache.commons.math.optimization.fitting.WeightedObservedPoint;
import org.apache.commons.math.optimization.fitting.ParametricGaussianFunction;
import org.apache.commons.math.exception.ZeroNotAllowedException;
import org.apache.commons.math.exception.DimensionMismatchException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_optimization_general_AbstractLeastSquaresOptimizerTest {
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, [D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[])}
 * @utbot.executesCondition {@code (target.length != weights.length): True}
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: target.length
 *  */
    @Test(expected = OptimizationException.class)
    public void testOptimize_ThrowOptimizationException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        gaussNewtonOptimizer.optimize(null, doubleArray, doubleArray1, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[])}
 * @utbot.executesCondition {@code (target.length != weights.length): False}
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: return doOptimize();
 *  */
    @Test(expected = OptimizationException.class)
    public void testOptimize_ThrowOptimizationException_1() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        gaussNewtonOptimizer.cols = -255;
        gaussNewtonOptimizer.rows = -255;
        double[] residuals = {0.0};
        gaussNewtonOptimizer.residuals = residuals;
        gaussNewtonOptimizer.cost = 0.0;
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -255);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -255);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        Object theoreticalValuesFunction = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        double[] doubleArray2 = {};
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer");
        Class theoreticalValuesFunctionType = Class.forName("org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction");
        Class doubleArrayType = Class.forName("[D");
        Method optimizeMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("optimize", theoreticalValuesFunctionType, doubleArrayType, doubleArrayType, doubleArrayType);
        optimizeMethod.setAccessible(true);
        java.lang.Object[] optimizeMethodArguments = new java.lang.Object[4];
        optimizeMethodArguments[0] = theoreticalValuesFunction;
        optimizeMethodArguments[1] = ((Object) doubleArray);
        optimizeMethodArguments[2] = ((Object) doubleArray1);
        optimizeMethodArguments[3] = ((Object) doubleArray2);
        try {
            optimizeMethod.invoke(gaussNewtonOptimizer, optimizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[])}
 * @utbot.executesCondition {@code (target.length != weights.length): False}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: return doOptimize();
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testOptimize_ThrowFunctionEvaluationException() throws Throwable  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        gaussNewtonOptimizer.cols = -255;
        gaussNewtonOptimizer.rows = -255;
        double[] residualsWeights = {0.0};
        gaussNewtonOptimizer.residualsWeights = residualsWeights;
        double[] residuals = {0.0};
        gaussNewtonOptimizer.residuals = residuals;
        gaussNewtonOptimizer.cost = 0.0;
        gaussNewtonOptimizer.setMaxIterations(1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -255);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -255);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        Object theoreticalValuesFunction = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        double[] doubleArray = {2.781342323134002E-309};
        double[] doubleArray1 = {-0.0};
        double[] doubleArray2 = {};
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer");
        Class theoreticalValuesFunctionType = Class.forName("org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction");
        Class doubleArrayType = Class.forName("[D");
        Method optimizeMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("optimize", theoreticalValuesFunctionType, doubleArrayType, doubleArrayType, doubleArrayType);
        optimizeMethod.setAccessible(true);
        java.lang.Object[] optimizeMethodArguments = new java.lang.Object[4];
        optimizeMethodArguments[0] = theoreticalValuesFunction;
        optimizeMethodArguments[1] = ((Object) doubleArray);
        optimizeMethodArguments[2] = ((Object) doubleArray1);
        optimizeMethodArguments[3] = ((Object) doubleArray2);
        try {
            optimizeMethod.invoke(gaussNewtonOptimizer, optimizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, [D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: target.length != weights.length
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:332) */
        levenbergMarquardtOptimizer.optimize(null, doubleArray, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: target.length != weights.length
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:332) */
        levenbergMarquardtOptimizer.optimize(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[])}
 * @utbot.executesCondition {@code (target.length != weights.length): False}
 * @utbot.invokes {@link org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction#jacobian()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jF = f.jacobian();
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -255);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -255);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:344) */
        levenbergMarquardtOptimizer.optimize(null, doubleArray, doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction,double[],double[],double[])}
 * @utbot.executesCondition {@code (target.length != weights.length): False}
 * @utbot.invokes {@link org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction#jacobian()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.point = startPoint.clone();
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -255);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -255);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        Object theoreticalValuesFunction = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.optimize(AbstractLeastSquaresOptimizer.java:347) */
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer");
        Class theoreticalValuesFunctionType = Class.forName("org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction");
        Class doubleArrayType = Class.forName("[D");
        Method optimizeMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("optimize", theoreticalValuesFunctionType, doubleArrayType, doubleArrayType, doubleArrayType);
        optimizeMethod.setAccessible(true);
        java.lang.Object[] optimizeMethodArguments = new java.lang.Object[4];
        optimizeMethodArguments[0] = theoreticalValuesFunction;
        optimizeMethodArguments[1] = ((Object) doubleArray);
        optimizeMethodArguments[2] = ((Object) doubleArray1);
        optimizeMethodArguments[3] = ((Object) null);
        try {
            optimizeMethod.invoke(levenbergMarquardtOptimizer, optimizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: CHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, [D, [D, [D)
    
    @Test(expected = OptimizationException.class)
    public void testOptimizeByFuzzer() throws FunctionEvaluationException, OptimizationException  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer.setMaxIterations(-1);
        levenbergMarquardtOptimizer.setMaxEvaluations(1);
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY};
        double[] doubleArray1 = {-1.0, java.lang.Double.POSITIVE_INFINITY};
        double[] doubleArray2 = {java.lang.Double.NEGATIVE_INFINITY, 1.0};
        
        levenbergMarquardtOptimizer.optimize(null, doubleArray, doubleArray1, doubleArray2);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method optimize(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, [D, [D, [D)
    
    @Test(expected = FunctionEvaluationException.class)
    public void testOptimize1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.cost = java.lang.Double.NaN;
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        Object theoreticalValuesFunction = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0};
        double[] doubleArray2 = {0.0, 0.0, 0.0, 0.0};
        
        Class abstractLeastSquaresOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer");
        Class theoreticalValuesFunctionType = Class.forName("org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction");
        Class doubleArrayType = Class.forName("[D");
        Method optimizeMethod = abstractLeastSquaresOptimizerClazz.getDeclaredMethod("optimize", theoreticalValuesFunctionType, doubleArrayType, doubleArrayType, doubleArrayType);
        optimizeMethod.setAccessible(true);
        java.lang.Object[] optimizeMethodArguments = new java.lang.Object[4];
        optimizeMethodArguments[0] = theoreticalValuesFunction;
        optimizeMethodArguments[1] = ((Object) doubleArray);
        optimizeMethodArguments[2] = ((Object) doubleArray1);
        optimizeMethodArguments[3] = ((Object) doubleArray2);
        try {
            optimizeMethod.invoke(levenbergMarquardtOptimizer, optimizeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getIterations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIterations()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getIterations()}
 * @utbot.returnsFrom {@code return iterations;}
 *  */
    @Test
    public void testGetIterations_ReturnIterations() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -255);
        
        int actual = levenbergMarquardtOptimizer.getIterations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setConvergenceChecker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#setConvergenceChecker(org.apache.commons.math.optimization.VectorialConvergenceChecker)}
 *  */
    @Test
    public void testSetConvergenceChecker() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        
        levenbergMarquardtOptimizer.setConvergenceChecker(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getConvergenceChecker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConvergenceChecker()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getConvergenceChecker()}
 * @utbot.returnsFrom {@code return checker;}
 *  */
    @Test
    public void testGetConvergenceChecker_ReturnChecker() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        
        VectorialConvergenceChecker actual = levenbergMarquardtOptimizer.getConvergenceChecker();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.incrementIterationsCounter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method incrementIterationsCounter()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#incrementIterationsCounter()}
 * @utbot.executesCondition {@code (++iterations > maxIterations): False}
 *  */
    @Test
    public void testIncrementIterationsCounter_PrefixIncrementIterationsLessOrEqualMaxIterations() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -1);
        
        levenbergMarquardtOptimizer.incrementIterationsCounter();
        
        int finalLevenbergMarquardtOptimizerIterations = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations"));
        
        assertEquals(0, finalLevenbergMarquardtOptimizerIterations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method incrementIterationsCounter()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#incrementIterationsCounter()}
 * @utbot.executesCondition {@code (++iterations > maxIterations): True}
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} when: ++iterations > maxIterations
 *  */
    @Test(expected = OptimizationException.class)
    public void testIncrementIterationsCounter_ThrowOptimizationException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setMaxIterations(-254);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -254);
        
        levenbergMarquardtOptimizer.incrementIterationsCounter();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateResidualsAndCost()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 *  */
    @Test
    public void testUpdateResidualsAndCost() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] objective = {0.0};
        levenbergMarquardtOptimizer.objective = objective;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxEvaluations(256);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        double[] initialLevenbergMarquardtOptimizerObjective = levenbergMarquardtOptimizer.objective;
        
        levenbergMarquardtOptimizer.updateResidualsAndCost();
        
        double[] finalLevenbergMarquardtOptimizerObjective = levenbergMarquardtOptimizer.objective;
        int finalLevenbergMarquardtOptimizerObjectiveEvaluations = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations"));
        
        assertFalse(initialLevenbergMarquardtOptimizerObjective == finalLevenbergMarquardtOptimizerObjective);
        
        assertEquals(256, finalLevenbergMarquardtOptimizerObjectiveEvaluations);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; i++)} once
 *  */
    @Test
    public void testUpdateResidualsAndCost_IterateForLoop() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        gaussNewtonOptimizer.rows = 1;
        double[] targetValues = {0.0};
        gaussNewtonOptimizer.targetValues = targetValues;
        gaussNewtonOptimizer.residualsWeights = targetValues;
        double[] point = {};
        gaussNewtonOptimizer.point = point;
        gaussNewtonOptimizer.objective = targetValues;
        gaussNewtonOptimizer.residuals = targetValues;
        gaussNewtonOptimizer.cost = 0.0;
        gaussNewtonOptimizer.setMaxEvaluations(256);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        double[] initialGaussNewtonOptimizerObjective = gaussNewtonOptimizer.objective;
        
        gaussNewtonOptimizer.updateResidualsAndCost();
        
        double[] finalGaussNewtonOptimizerObjective = gaussNewtonOptimizer.objective;
        int finalGaussNewtonOptimizerObjectiveEvaluations = ((Integer) getFieldValue(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations"));
        
        assertFalse(initialGaussNewtonOptimizerObjective == finalGaussNewtonOptimizerObjective);
        
        assertEquals(256, finalGaussNewtonOptimizerObjectiveEvaluations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateResidualsAndCost()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): False}
 * @utbot.executesCondition {@code (objective.length != rows): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double residual = targetValues[i] - objective[i];
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] targetValues = {};
        levenbergMarquardtOptimizer.targetValues = targetValues;
        levenbergMarquardtOptimizer.point = targetValues;
        double[] objective = {0.0};
        levenbergMarquardtOptimizer.objective = objective;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxEvaluations(256);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:220) */
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): False}
 * @utbot.executesCondition {@code (objective.length != rows): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: residuals[i] = residual;
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        gaussNewtonOptimizer.rows = 1;
        double[] targetValues = {0.0};
        gaussNewtonOptimizer.targetValues = targetValues;
        double[] point = {};
        gaussNewtonOptimizer.point = point;
        gaussNewtonOptimizer.objective = targetValues;
        gaussNewtonOptimizer.residuals = point;
        gaussNewtonOptimizer.cost = 0.0;
        gaussNewtonOptimizer.setMaxEvaluations(256);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:221) */
        gaussNewtonOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): False}
 * @utbot.executesCondition {@code (objective.length != rows): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: cost += residualsWeights[i] * residual * residual;
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        gaussNewtonOptimizer.rows = 1;
        double[] targetValues = {0.0};
        gaussNewtonOptimizer.targetValues = targetValues;
        double[] residualsWeights = {};
        gaussNewtonOptimizer.residualsWeights = residualsWeights;
        gaussNewtonOptimizer.point = residualsWeights;
        gaussNewtonOptimizer.objective = targetValues;
        gaussNewtonOptimizer.residuals = targetValues;
        gaussNewtonOptimizer.cost = 0.0;
        gaussNewtonOptimizer.setMaxEvaluations(256);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:222) */
        gaussNewtonOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: objective = function.value(point);
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[] point = {};
        gaussNewtonOptimizer.point = point;
        gaussNewtonOptimizer.setMaxEvaluations(256);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.value(HarmonicFitter.java:114)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction.value(CurveFitter.java:190)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:212) */
        gaussNewtonOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: objective = function.value(point);
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[] point = {0.0, 0.0};
        gaussNewtonOptimizer.point = point;
        gaussNewtonOptimizer.setMaxEvaluations(256);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.value(HarmonicFitter.java:116)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction.value(CurveFitter.java:190)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:212) */
        gaussNewtonOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: objective = function.value(point);
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {0.0};
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.setMaxEvaluations(256);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.value(HarmonicFitter.java:115)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction.value(CurveFitter.java:190)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:212) */
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ++objectiveEvaluations > maxEvaluations
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setMaxEvaluations(-254);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -254);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.NullPointerException]
            org.apache.commons.math.FunctionEvaluationException.<init>(FunctionEvaluationException.java:138)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:209) */
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: objective = function.value(point);
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setMaxEvaluations(256);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:212) */
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): False}
 * @utbot.executesCondition {@code (objective.length != rows): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double residual = targetValues[i] - objective[i];
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowNullPointerException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        double[] objective = {0.0};
        levenbergMarquardtOptimizer.objective = objective;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxEvaluations(256);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:220) */
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): False}
 * @utbot.executesCondition {@code (objective.length != rows): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: residuals[i] = residual;
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowNullPointerException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] targetValues = {0.0};
        levenbergMarquardtOptimizer.targetValues = targetValues;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.objective = targetValues;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxEvaluations(256);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:221) */
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++objectiveEvaluations > maxEvaluations): False}
 * @utbot.executesCondition {@code (objective.length != rows): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cost += residualsWeights[i] * residual * residual;
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowNullPointerException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] targetValues = {0.0};
        levenbergMarquardtOptimizer.targetValues = targetValues;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.objective = targetValues;
        levenbergMarquardtOptimizer.residuals = targetValues;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxEvaluations(256);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:222) */
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method updateResidualsAndCost()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: objective.length
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsAndCost_ThrowFunctionEvaluationException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = -255;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.setMaxEvaluations(256);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: objective.length
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsAndCost_ThrowFunctionEvaluationException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[] point = {0.0, 0.0, 0.0, 4.9E-324};
        gaussNewtonOptimizer.point = point;
        double[] objective = {0.0};
        gaussNewtonOptimizer.objective = objective;
        gaussNewtonOptimizer.setMaxEvaluations(256);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        ParametricGaussianFunction f = ((ParametricGaussianFunction) createInstance("org.apache.commons.math.optimization.fitting.ParametricGaussianFunction"));
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        gaussNewtonOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: objective.length
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsAndCost_ThrowFunctionEvaluationException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {0.0, 0.0, 0.0, 0.0};
        levenbergMarquardtOptimizer.point = point;
        double[] objective = {0.0};
        levenbergMarquardtOptimizer.objective = objective;
        levenbergMarquardtOptimizer.setMaxEvaluations(256);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateResidualsAndCost()}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: objective.length
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsAndCost_ThrowFunctionEvaluationException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = new double[11];
        levenbergMarquardtOptimizer.point = point;
        double[] objective = {0.0};
        levenbergMarquardtOptimizer.objective = objective;
        levenbergMarquardtOptimizer.setMaxEvaluations(256);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 255);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction");
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        levenbergMarquardtOptimizer.updateResidualsAndCost();
    }
    ///endregion
    
    ///region Errors report for updateResidualsAndCost
    
    public void testUpdateResidualsAndCost_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.optimization.general
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.guessParametersErrors
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method guessParametersErrors()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.executesCondition {@code (rows <= cols): True}
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: rows
 *  */
    @Test(expected = OptimizationException.class)
    public void testGuessParametersErrors_ThrowOptimizationException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.cols = -255;
        levenbergMarquardtOptimizer.rows = -255;
        
        levenbergMarquardtOptimizer.guessParametersErrors();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#guessParametersErrors()}
 * @utbot.executesCondition {@code (rows <= cols): False}
 * @utbot.invokes {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: double[][] covar = getCovariances();
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testGuessParametersErrors_ThrowFunctionEvaluationException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[][] jacobian = {null};
        gaussNewtonOptimizer.jacobian = jacobian;
        gaussNewtonOptimizer.rows = 1;
        double[] residualsWeights = {0.0};
        gaussNewtonOptimizer.residualsWeights = residualsWeights;
        double[] point = {};
        gaussNewtonOptimizer.point = point;
        double[] residuals = {0.0};
        gaussNewtonOptimizer.residuals = residuals;
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        gaussNewtonOptimizer.guessParametersErrors();
    }
    ///endregion
    
    ///region Errors report for guessParametersErrors
    
    public void testGuessParametersErrors_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.optimization.general
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getJacobianEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJacobianEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getJacobianEvaluations()}
 * @utbot.returnsFrom {@code return jacobianEvaluations;}
 *  */
    @Test
    public void testGetJacobianEvaluations_ReturnJacobianEvaluations() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        
        int actual = levenbergMarquardtOptimizer.getJacobianEvaluations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getChiSquare()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.returnsFrom {@code return chiSquare;}
 *  */
    @Test
    public void testGetChiSquare_ReturnChiSquare() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        
        double actual = levenbergMarquardtOptimizer.getChiSquare();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.returnsFrom {@code return chiSquare;}
 *  */
    @Test
    public void testGetChiSquare_IterateForLoop() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] residualsWeights = {0.0};
        levenbergMarquardtOptimizer.residualsWeights = residualsWeights;
        levenbergMarquardtOptimizer.residuals = residualsWeights;
        
        double actual = levenbergMarquardtOptimizer.getChiSquare();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getChiSquare()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double residual = residuals[i];
 *  */
    @Test
    public void testGetChiSquare_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] residuals = {};
        levenbergMarquardtOptimizer.residuals = residuals;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare(AbstractLeastSquaresOptimizer.java:257) */
        levenbergMarquardtOptimizer.getChiSquare();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: chiSquare += residual * residual / residualsWeights[i];
 *  */
    @Test
    public void testGetChiSquare_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        gaussNewtonOptimizer.rows = 1;
        double[] residualsWeights = {};
        gaussNewtonOptimizer.residualsWeights = residualsWeights;
        double[] residuals = {0.0};
        gaussNewtonOptimizer.residuals = residuals;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare(AbstractLeastSquaresOptimizer.java:258) */
        gaussNewtonOptimizer.getChiSquare();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double residual = residuals[i];
 *  */
    @Test
    public void testGetChiSquare_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare(AbstractLeastSquaresOptimizer.java:257) */
        levenbergMarquardtOptimizer.getChiSquare();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getChiSquare()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: chiSquare += residual * residual / residualsWeights[i];
 *  */
    @Test
    public void testGetChiSquare_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] residuals = {0.0};
        levenbergMarquardtOptimizer.residuals = residuals;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getChiSquare(AbstractLeastSquaresOptimizer.java:258) */
        levenbergMarquardtOptimizer.getChiSquare();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getMaxIterations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxIterations()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getMaxIterations()}
 * @utbot.returnsFrom {@code return maxIterations;}
 *  */
    @Test
    public void testGetMaxIterations_ReturnMaxIterations() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setMaxIterations(-255);
        
        int actual = levenbergMarquardtOptimizer.getMaxIterations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCovariances()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] jTj = new double[cols][cols];
 *  */
    @Test
    public void testGetCovariances_ThrowNegativeArraySizeException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[][] jacobian = {null};
        gaussNewtonOptimizer.jacobian = jacobian;
        gaussNewtonOptimizer.cols = -256;
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:278) */
        gaussNewtonOptimizer.getCovariances();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.MatrixUtils#createRealMatrix(double[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: new LUDecompositionImpl(MatrixUtils.createRealMatrix(jTj)).getSolver().getInverse()
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[][] jacobian = {null};
        gaussNewtonOptimizer.jacobian = jacobian;
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.MatrixUtils.createRealMatrix(MatrixUtils.java:107)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:293) */
        gaussNewtonOptimizer.getCovariances();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: updateJacobian();
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.rows = 1;
        double[] residualsWeights = {};
        levenbergMarquardtOptimizer.residualsWeights = residualsWeights;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:192)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:275) */
        levenbergMarquardtOptimizer.getCovariances();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] jTj = new double[cols][cols];
 *  */
    @Test
    public void testGetCovariances_ThrowNegativeArraySizeException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = -2147483647;
        levenbergMarquardtOptimizer.rows = 1;
        double[] residualsWeights = {0.0};
        levenbergMarquardtOptimizer.residualsWeights = residualsWeights;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.NegativeArraySizeException: -2147483647]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:278) */
        levenbergMarquardtOptimizer.getCovariances();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: updateJacobian();
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 3;
        levenbergMarquardtOptimizer.rows = 1;
        double[] residualsWeights = {0.0};
        levenbergMarquardtOptimizer.residualsWeights = residualsWeights;
        double[] point = {0.0, 0.0};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:194)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:275) */
        levenbergMarquardtOptimizer.getCovariances();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getCovariances()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateJacobian();
 *  */
    @Test
    public void testGetCovariances_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[][] jacobian = {null};
        gaussNewtonOptimizer.jacobian = jacobian;
        gaussNewtonOptimizer.rows = -256;
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances] produces [java.lang.NullPointerException]
            org.apache.commons.math.FunctionEvaluationException.<init>(FunctionEvaluationException.java:114)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:188)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getCovariances(AbstractLeastSquaresOptimizer.java:275) */
        gaussNewtonOptimizer.getCovariances();
    }
    ///endregion
    
    ///region Errors report for getCovariances
    
    public void testGetCovariances_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.optimization.general
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxEvaluations(int)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#setMaxEvaluations(int)}
 *  */
    @Test
    public void testSetMaxEvaluations() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setMaxEvaluations(-255);
        
        levenbergMarquardtOptimizer.setMaxEvaluations(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.setMaxIterations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxIterations(int)
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#setMaxIterations(int)}
 *  */
    @Test
    public void testSetMaxIterations() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setMaxIterations(-255);
        
        levenbergMarquardtOptimizer.setMaxIterations(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRMS()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getRMS()}
 * @utbot.returnsFrom {@code return Math.sqrt(criterion / rows);}
 *  */
    @Test
    public void testGetRMS_ReturnMathSqrt() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        
        double actual = levenbergMarquardtOptimizer.getRMS();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getRMS()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.returnsFrom {@code return Math.sqrt(criterion / rows);}
 *  */
    @Test
    public void testGetRMS_IterateForLoop() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] residualsWeights = {0.0};
        levenbergMarquardtOptimizer.residualsWeights = residualsWeights;
        levenbergMarquardtOptimizer.residuals = residualsWeights;
        
        double actual = levenbergMarquardtOptimizer.getRMS();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRMS()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getRMS()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double residual = residuals[i];
 *  */
    @Test
    public void testGetRMS_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] residuals = {};
        levenbergMarquardtOptimizer.residuals = residuals;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS(AbstractLeastSquaresOptimizer.java:242) */
        levenbergMarquardtOptimizer.getRMS();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getRMS()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: criterion += residual * residual * residualsWeights[i];
 *  */
    @Test
    public void testGetRMS_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        gaussNewtonOptimizer.rows = 1;
        double[] residualsWeights = {};
        gaussNewtonOptimizer.residualsWeights = residualsWeights;
        double[] residuals = {0.0};
        gaussNewtonOptimizer.residuals = residuals;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS(AbstractLeastSquaresOptimizer.java:243) */
        gaussNewtonOptimizer.getRMS();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getRMS()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double residual = residuals[i];
 *  */
    @Test
    public void testGetRMS_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS(AbstractLeastSquaresOptimizer.java:242) */
        levenbergMarquardtOptimizer.getRMS();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getRMS()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: criterion += residual * residual * residualsWeights[i];
 *  */
    @Test
    public void testGetRMS_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.rows = 1;
        double[] residuals = {0.0};
        levenbergMarquardtOptimizer.residuals = residuals;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getRMS(AbstractLeastSquaresOptimizer.java:243) */
        levenbergMarquardtOptimizer.getRMS();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getMaxEvaluations()}
 * @utbot.returnsFrom {@code return maxEvaluations;}
 *  */
    @Test
    public void testGetMaxEvaluations_ReturnMaxEvaluations() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setMaxEvaluations(-255);
        
        int actual = levenbergMarquardtOptimizer.getMaxEvaluations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateJacobian()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 *  */
    @Test
    public void testUpdateJacobian() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[][] jacobian = {null};
        gaussNewtonOptimizer.jacobian = jacobian;
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        double[][] initialGaussNewtonOptimizerJacobian = gaussNewtonOptimizer.jacobian;
        
        gaussNewtonOptimizer.updateJacobian();
        
        double[][] finalGaussNewtonOptimizerJacobian = gaussNewtonOptimizer.jacobian;
        int finalGaussNewtonOptimizerJacobianEvaluations = ((Integer) getFieldValue(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations"));
        
        assertFalse(initialGaussNewtonOptimizerJacobian == finalGaussNewtonOptimizerJacobian);
        
        assertEquals(-254, finalGaussNewtonOptimizerJacobianEvaluations);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; i++)} once
 *  */
    @Test
    public void testUpdateJacobian_MathSqrt() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        double[] residualsWeights = {0.0};
        levenbergMarquardtOptimizer.residualsWeights = residualsWeights;
        double[] point = {0.0, 0.0};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        double[][] initialLevenbergMarquardtOptimizerJacobian = levenbergMarquardtOptimizer.jacobian;
        
        levenbergMarquardtOptimizer.updateJacobian();
        
        double[][] finalLevenbergMarquardtOptimizerJacobian = levenbergMarquardtOptimizer.jacobian;
        int finalLevenbergMarquardtOptimizerJacobianEvaluations = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations"));
        
        assertFalse(initialLevenbergMarquardtOptimizerJacobian == finalLevenbergMarquardtOptimizerJacobian);
        
        assertEquals(-254, finalLevenbergMarquardtOptimizerJacobianEvaluations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateJacobian()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.executesCondition {@code (jacobian.length != rows): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double factor = -Math.sqrt(residualsWeights[i]);
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.rows = 1;
        double[] residualsWeights = {};
        levenbergMarquardtOptimizer.residualsWeights = residualsWeights;
        double[] point = {0.0, 0.0};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:192) */
        levenbergMarquardtOptimizer.updateJacobian();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jacobian = jF.value(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[] point = {0.0};
        gaussNewtonOptimizer.point = point;
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.gradient(HarmonicFitter.java:123)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1.value(CurveFitter.java:173)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:185) */
        gaussNewtonOptimizer.updateJacobian();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jacobian = jF.value(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.gradient(HarmonicFitter.java:122)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1.value(CurveFitter.java:173)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:185) */
        levenbergMarquardtOptimizer.updateJacobian();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jacobian = jF.value(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] point = {0.0, 0.0};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        observations.add(null);
        observations.add(null);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.gradient(HarmonicFitter.java:124)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1.value(CurveFitter.java:173)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:185) */
        levenbergMarquardtOptimizer.updateJacobian();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jacobian = jF.value(point);
 *  */
    @Test
    public void testUpdateJacobian_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:185) */
        levenbergMarquardtOptimizer.updateJacobian();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.executesCondition {@code (jacobian.length != rows): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double factor = -Math.sqrt(residualsWeights[i]);
 *  */
    @Test
    public void testUpdateJacobian_ThrowNullPointerException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[][] jacobian = {null};
        gaussNewtonOptimizer.jacobian = jacobian;
        gaussNewtonOptimizer.rows = 1;
        double[] point = {0.0, 0.0, 0.0};
        gaussNewtonOptimizer.point = point;
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:192) */
        gaussNewtonOptimizer.updateJacobian();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method updateJacobian()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: jacobian.length
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateJacobian_ThrowFunctionEvaluationException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[][] jacobian = {null};
        gaussNewtonOptimizer.jacobian = jacobian;
        gaussNewtonOptimizer.rows = 1;
        double[] point = {0.0};
        gaussNewtonOptimizer.point = point;
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        gaussNewtonOptimizer.updateJacobian();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: jacobian.length
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateJacobian_ThrowFunctionEvaluationException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] point = {0.0, 0.0, 0.0, 4.9E-324};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        ParametricGaussianFunction f = ((ParametricGaussianFunction) createInstance("org.apache.commons.math.optimization.fitting.ParametricGaussianFunction"));
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        levenbergMarquardtOptimizer.updateJacobian();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#updateJacobian()}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: jacobian.length
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateJacobian_ThrowFunctionEvaluationException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] point = {0.0, 0.0};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations", -255);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "f", f);
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        WeightedObservedPoint weightedObservedPoint = ((WeightedObservedPoint) createInstance("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setField(weightedObservedPoint, "org.apache.commons.math.optimization.fitting.WeightedObservedPoint", "x", 0.0);
        observations.add(weightedObservedPoint);
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        levenbergMarquardtOptimizer.updateJacobian();
    }
    ///endregion
    
    ///region Errors report for updateJacobian
    
    public void testUpdateJacobian_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.optimization.general
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.getEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractLeastSquaresOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer#getEvaluations()}
 * @utbot.returnsFrom {@code return objectiveEvaluations;}
 *  */
    @Test
    public void testGetEvaluations_ReturnObjectiveEvaluations() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -255);
        
        int actual = levenbergMarquardtOptimizer.getEvaluations();
        
        assertEquals(-255, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields737491772355100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields737491772355100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass737491772360400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields737491772355100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass737491772360400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields737491772674400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields737491772674400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass737491772677600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields737491772674400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass737491772677600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

