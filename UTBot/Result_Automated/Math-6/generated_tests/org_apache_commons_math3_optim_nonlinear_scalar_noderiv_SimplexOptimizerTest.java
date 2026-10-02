package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.junit.Test;
import org.apache.commons.math3.optim.OptimizationData;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.MaxIter;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import java.lang.reflect.Method;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.linear.LinearObjectiveFunction;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.linear.RealVector;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math3_optim_nonlinear_scalar_noderiv_SimplexOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} 
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize_ThrowNumberIsTooSmallException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {-9.671627917845918E24};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {5.208279103562059E-259};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} 
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {1.288229753919427E-231};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        double[] upperBound = {0.0, 0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} 
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException_1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {0.0, 0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} 
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize_ThrowNumberIsTooSmallException_1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {-3.18773957608437E-58};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {3.4561541737086955E-77};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} 
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException_2() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {0.0, 0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        iterations.setMaximalCount(-255);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} 
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_ThrowMathUnsupportedOperationException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] lowerBound = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(iterations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} 
 *  */
    @Test(expected = NullArgumentException.class)
    public void testOptimize_ThrowNullArgumentException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} 
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_ThrowMathUnsupportedOperationException_1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        MultiDirectionalSimplex simplex = ((MultiDirectionalSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
     */
    @Test(expected = NullArgumentException.class)
    public void testOptimizeThrowsNAEWithEmptyObjectArray() {
        SimplexOptimizer simplexOptimizer = new SimplexOptimizer(0.0, -1.0);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
     */
    @Test(expected = NullArgumentException.class)
    public void testOptimizeThrowsNAEWithEmptyObjectArray1() {
        SimplexOptimizer simplexOptimizer = new SimplexOptimizer(1.1125369333981237E-308, -1.0);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NullArgumentException.class)
    public void testOptimize2() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NullArgumentException.class)
    public void testOptimize3() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NullArgumentException.class)
    public void testOptimize4() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NullArgumentException.class)
    public void testOptimize5() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {java.lang.Double.NaN};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-0.5319215060007992};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize6() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = new double[33];
        start[0] = -7.0891643673614E-310;
        start[1] = 2.0090637207043667;
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = new double[33];
        upperBound[0] = -7.0891643673614E-310;
        upperBound[1] = 4.378231042964651E-289;
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize7() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] upperBound = {1.000000000000001, -3.054283267828426E-306, 0.0, 0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {-3.940200619639451E115, 2.1426162719726562, 7.9E-323, 5.43230922487E-312};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize8() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {
            java.lang.Double.NaN, 9.567191580401318E-299, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {
            -8.990269031668635E307, 7.522640954534073E-304, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NullArgumentException.class)
    public void testOptimize9() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize10() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize11() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {
            java.lang.Double.NaN, 5.564948185503982E173, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {
            -8.988638572401544E307, -1.0151796393702037E-115, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NullArgumentException.class)
    public void testOptimize12() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NullArgumentException.class)
    public void testOptimize13() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {java.lang.Double.NaN};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = {-0.7539062574506944};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        double[] upper = {-0.6250000000003412};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", upper);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize14() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] start = {1.5000008800161666};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {1.7800658788501145E-307};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {java.lang.Double.NaN};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NullArgumentException.class)
    public void testOptimize15() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {java.lang.Double.NaN};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize16() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] lowerBound = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        NelderMeadSimplex nelderMeadSimplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        optimizationDataArray[0] = ((OptimizationData) nelderMeadSimplex);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize17() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize18() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] start = {1.056718040428346E270};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {java.lang.Double.NaN};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ObjectiveFunction objectiveFunction = new ObjectiveFunction(null);
        optimizationDataArray[0] = ((OptimizationData) objectiveFunction);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize19() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        NelderMeadSimplex nelderMeadSimplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        optimizationDataArray[0] = ((OptimizationData) nelderMeadSimplex);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize20() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        GoalType goalType = GoalType.MINIMIZE;
        optimizationDataArray[0] = ((OptimizationData) goalType);
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize21() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test
    public void testOptimize22() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(SimplexOptimizer.java:122) */
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize23() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] lowerBound = {0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {0.0};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(SimplexOptimizer.java:122) */
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize24() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(SimplexOptimizer.java:122) */
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize25() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[3];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[1] = ((OptimizationData) maxIter);
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[2] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData(BaseOptimizer.java:192)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.parseOptimizationData(BaseMultivariateOptimizer.java:82)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.parseOptimizationData(MultivariateOptimizer.java:81)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.parseOptimizationData(SimplexOptimizer.java:192)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(SimplexOptimizer.java:122) */
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize26() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(SimplexOptimizer.java:122) */
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize27() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] upperBound = {java.lang.Double.NaN, 0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {java.lang.Double.POSITIVE_INFINITY, 0.0};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(SimplexOptimizer.java:122) */
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize28() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {1.651598395260938E-309, java.lang.Double.NaN};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {java.lang.Double.NaN, -2.225141762372513E-308};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(SimplexOptimizer.java:122) */
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize29() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        GoalType goalType = GoalType.MINIMIZE;
        optimizationDataArray[0] = ((OptimizationData) goalType);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex.build(AbstractSimplex.java:217)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:89)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(SimplexOptimizer.java:122) */
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize30() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex.build(AbstractSimplex.java:217)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:89)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(SimplexOptimizer.java:122) */
        simplexOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize31() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        NelderMeadSimplex nelderMeadSimplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        optimizationDataArray[0] = ((OptimizationData) nelderMeadSimplex);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex.build(AbstractSimplex.java:217)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:89)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.optimize(BaseMultivariateOptimizer.java:66)
            org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer.optimize(MultivariateOptimizer.java:64)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.optimize(SimplexOptimizer.java:122) */
        simplexOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.checkParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (simplex == null): False}
 * @utbot.executesCondition {@code (getLowerBound() != null): False}
 * @utbot.executesCondition {@code (getUpperBound() != null): False}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#getLowerBound()}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#getUpperBound()}
 *  */
    @Test
    public void testCheckParameters_GetUpperBoundEqualsNull() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        
        Class simplexOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Method checkParametersMethod = simplexOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        checkParametersMethod.invoke(simplexOptimizer, checkParametersMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkParameters()
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (simplex == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: simplex == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testCheckParameters_ThrowNullArgumentException() throws Throwable  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        
        Class simplexOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Method checkParametersMethod = simplexOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(simplexOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (simplex == null): False}
 * @utbot.executesCondition {@code (getLowerBound() != null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} when: getLowerBound() != null || getUpperBound() != null
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_ThrowMathUnsupportedOperationException() throws Throwable  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] lowerBound = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        
        Class simplexOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Method checkParametersMethod = simplexOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(simplexOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#checkParameters()}
 * @utbot.executesCondition {@code (simplex == null): False}
 * @utbot.executesCondition {@code (getLowerBound() != null): False}
 * @utbot.executesCondition {@code (getUpperBound() != null): True}
 * @utbot.invokes {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#getUpperBound()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} when: getLowerBound() != null || getUpperBound() != null
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_ThrowMathUnsupportedOperationException_1() throws Throwable  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] upperBound = {1.0E-323};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        Class simplexOptimizerClazz = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Method checkParametersMethod = simplexOptimizerClazz.getDeclaredMethod("checkParameters");
        checkParametersMethod.setAccessible(true);
        java.lang.Object[] checkParametersMethodArguments = new java.lang.Object[0];
        try {
            checkParametersMethod.invoke(simplexOptimizer, checkParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.parseOptimizationData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 *  */
    @Test
    public void testParseOptimizationData() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 *  */
    @Test
    public void testParseOptimizationData_2() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {4.9E-324};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 *  */
    @Test
    public void testParseOptimizationData_3() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {4.9E-324};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {4.9E-324};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 *  */
    @Test
    public void testParseOptimizationData_DataInstanceOfAbstractSimplex() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        NelderMeadSimplex nelderMeadSimplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        optimizationDataArray[0] = ((OptimizationData) nelderMeadSimplex);
        
        AbstractSimplex initialSimplexOptimizerSimplex = ((AbstractSimplex) getFieldValue(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex"));
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
        
        AbstractSimplex finalSimplexOptimizerSimplex = ((AbstractSimplex) getFieldValue(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex"));
        
        assertFalse(initialSimplexOptimizerSimplex == finalSimplexOptimizerSimplex);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 *  */
    @Test
    public void testParseOptimizationData_NotDataNotInstanceOfAbstractSimplex() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        GoalType goalType = GoalType.MINIMIZE;
        optimizationDataArray[0] = ((OptimizationData) goalType);
        
        GoalType initialSimplexOptimizerGoal = ((GoalType) getFieldValue(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal"));
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
        
        GoalType finalSimplexOptimizerGoal = ((GoalType) getFieldValue(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal"));
        
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 *  */
    @Test
    public void testParseOptimizationData_NotDataNotInstanceOfAbstractSimplex_1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ObjectiveFunction objectiveFunction = new ObjectiveFunction(null);
        optimizationDataArray[0] = ((OptimizationData) objectiveFunction);
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 *  */
    @Test
    public void testParseOptimizationData_1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 *  */
    @Test
    public void testParseOptimizationData_NotDataNotInstanceOfAbstractSimplex_2() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = {4.778309726875548E-299, 3.4766779039175E-310};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        double[] upper = {0.0};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", upper);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        double[] initialSimplexOptimizerLowerBound = ((double[]) getFieldValue(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound"));
        double[] initialSimplexOptimizerUpperBound = ((double[]) getFieldValue(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound"));
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
        
        double[] finalSimplexOptimizerLowerBound = ((double[]) getFieldValue(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound"));
        double[] finalSimplexOptimizerUpperBound = ((double[]) getFieldValue(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound"));
        
        assertFalse(initialSimplexOptimizerLowerBound == finalSimplexOptimizerLowerBound);
        
        assertFalse(initialSimplexOptimizerUpperBound == finalSimplexOptimizerUpperBound);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 *  */
    @Test
    public void testParseOptimizationData_NotDataNotInstanceOfAbstractSimplex_3() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {0.0, 2.652494739E-315};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        double[] initialSimplexOptimizerStart = ((double[]) getFieldValue(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start"));
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
        
        double[] finalSimplexOptimizerStart = ((double[]) getFieldValue(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start"));
        
        assertFalse(initialSimplexOptimizerStart == finalSimplexOptimizerStart);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testParseOptimizationData_ThrowDimensionMismatchException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {0.0, 0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testParseOptimizationData_ThrowDimensionMismatchException_1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        double[] upperBound = {0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testParseOptimizationData_ThrowNumberIsTooSmallException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {-5.178637665985403E58};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {2.444236146044257E-249};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testParseOptimizationData_ThrowDimensionMismatchException_2() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {0.0, 0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        iterations.setMaximalCount(-255);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testParseOptimizationData_ThrowNumberIsTooSmallException_1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {-4.472340217856E12};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {6.750013383155213E-284};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} in: super.parseOptimizationData(optData);
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testParseOptimizationData_ThrowNumberIsTooLargeException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] start = {1.5324984638691635E54};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {-1.838626450851627E-186};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        simplexOptimizer.parseOptimizationData(optimizationDataArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: checkParameters();
 *  */
    @Test(expected = NullArgumentException.class)
    public void testDoOptimize_ThrowNullArgumentException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        
        simplexOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testDoOptimize_ThrowMathUnsupportedOperationException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] lowerBound = {-0.0, 0.0};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        
        simplexOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: checkParameters();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testDoOptimize_ThrowMathUnsupportedOperationException_1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] upperBound = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        
        simplexOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: simplex.build(getStartPoint());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDoOptimize_ThrowDimensionMismatchException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "dimension", -3);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        GoalType goal = GoalType.MINIMIZE;
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {2.1729236899484E-311, 2.848094538930663E-306};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        simplexOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyIterationsException} 
 *  */
    @Test(expected = TooManyIterationsException.class)
    public void testDoOptimize_ThrowTooManyIterationsException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        org.apache.commons.math3.optim.PointValuePair[] simplex1 = {null};
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "simplex", simplex1);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        GoalType goal = GoalType.MAXIMIZE;
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        simplexOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} 
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testDoOptimize_ThrowTooManyEvaluationsException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        org.apache.commons.math3.optim.PointValuePair[] simplex1 = {null};
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "simplex", simplex1);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        GoalType goal = GoalType.MINIMIZE;
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        simplexOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} 
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDoOptimize_ThrowDimensionMismatchException_1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(coefficients, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        GoalType goal = GoalType.MAXIMIZE;
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(Integer.MIN_VALUE);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", Integer.MAX_VALUE);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        simplexOptimizer.doOptimize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: simplex.build(getStartPoint());
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        MultiDirectionalSimplex simplex = ((MultiDirectionalSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        org.apache.commons.math3.optim.PointValuePair[] simplex1 = {null};
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "simplex", simplex1);
        double[][] startConfiguration = {};
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "startConfiguration", startConfiguration);
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "dimension", 1);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        GoalType goal = GoalType.MAXIMIZE;
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {4.452320640704351E-308};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex.build(AbstractSimplex.java:227)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:151) */
        simplexOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: simplex.build(getStartPoint());
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        org.apache.commons.math3.optim.PointValuePair[] simplex1 = {null};
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "simplex", simplex1);
        double[][] startConfiguration = new double[1][];
        double[] doubleArray = {0.0};
        startConfiguration[0] = doubleArray;
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "startConfiguration", startConfiguration);
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "dimension", 2);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        double[] start = {2.225073858507202E-308, 1.1125369292536007E-308};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex.build(AbstractSimplex.java:230)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:151) */
        simplexOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doOptimize()
    
    @Test(expected = OutOfRangeException.class)
    public void testDoOptimize1() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        org.apache.commons.math3.optim.PointValuePair[] simplex1 = {null, null, null, null, null, null, null, null, null};
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "simplex", simplex1);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "constantTerm", 0.0);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        simplexOptimizer.doOptimize();
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testDoOptimize2() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math3.linear.RealVector$2"));
        RealVector val$v = ((RealVector) createInstance("org.apache.commons.math3.linear.RealVector$2"));
        ArrayRealVector val$v1 = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(val$v1, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(val$v, "org.apache.commons.math3.linear.RealVector$2", "val$v", val$v1);
        setField(coefficients, "org.apache.commons.math3.linear.RealVector$2", "val$v", val$v);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "constantTerm", java.lang.Double.NaN);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        double[] start = {};
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        simplexOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doOptimize()
    
    @Test
    public void testDoOptimize3() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        NelderMeadSimplex simplex = ((NelderMeadSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        double[][] startConfiguration = new double[9][];
        double[] doubleArray = new double[11];
        startConfiguration[0] = doubleArray;
        startConfiguration[1] = ((double[]) null);
        startConfiguration[2] = ((double[]) null);
        startConfiguration[3] = ((double[]) null);
        startConfiguration[4] = ((double[]) null);
        startConfiguration[5] = ((double[]) null);
        startConfiguration[6] = ((double[]) null);
        startConfiguration[7] = ((double[]) null);
        startConfiguration[8] = ((double[]) null);
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "startConfiguration", startConfiguration);
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "dimension", 7);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        GoalType goal = GoalType.MINIMIZE;
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        double[] start = {
            0.0, -0.0, 0.0, 7.291122128202582E-304, 0.0, 2.2250738585072014E-308,
            2.225073858507202E-308
        };
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex.build(AbstractSimplex.java:230)
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:151) */
        simplexOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize4() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        MultiDirectionalSimplex simplex = ((MultiDirectionalSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        org.apache.commons.math3.optim.PointValuePair[] simplex1 = {null, null, null, null, null, null, null, null, null};
        setField(simplex, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.AbstractSimplex", "simplex", simplex1);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "constantTerm", 0.0);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        GoalType goal = GoalType.MINIMIZE;
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", data);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:163) */
        simplexOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize5() throws Exception  {
        SimplexOptimizer simplexOptimizer = ((SimplexOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        MultiDirectionalSimplex simplex = ((MultiDirectionalSimplex) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.MultiDirectionalSimplex"));
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer", "simplex", simplex);
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optim.linear.LinearObjectiveFunction"));
        RealVector coefficients = ((RealVector) createInstance("org.apache.commons.math3.linear.RealVector$2"));
        ArrayRealVector val$v = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(val$v, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        setField(coefficients, "org.apache.commons.math3.linear.RealVector$2", "val$v", val$v);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "coefficients", coefficients);
        setField(function, "org.apache.commons.math3.optim.linear.LinearObjectiveFunction", "constantTerm", 0.0);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "function", function);
        GoalType goal = GoalType.MINIMIZE;
        setField(simplexOptimizer, "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer", "goal", goal);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", data);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -2);
        setField(simplexOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer.doOptimize(SimplexOptimizer.java:163) */
        simplexOptimizer.doOptimize();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields715913310030600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields715913310030600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass715913310038800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715913310030600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715913310038800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields715913310799800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields715913310799800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass715913310804000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715913310799800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715913310804000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

