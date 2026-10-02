package org.apache.commons.math3.optim;

import org.junit.Test;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer;
import org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.apache.commons.math3.util.Incrementor.MaxCountExceededCallback;
import org.apache.commons.math3.exception.MaxCountExceededException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math3_optim_BaseOptimizerTest {
    ///region Test suites for executable org.apache.commons.math3.optim.BaseOptimizer.optimize
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} in: parseOptimizationData(optData);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize_ThrowNumberIsTooSmallException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] start = {-1.3965188338435315E42};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {128.25000000000003};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} 
 *  */
    @Test(expected = NoDataException.class)
    public void testOptimize_ThrowNoDataException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {2.8533620226719195E-77};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {2.8533620226719195E-77};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooSmallException} in: parseOptimizationData(optData);
 *  */
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize_ThrowNumberIsTooSmallException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {-1.491668146240423E-154};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-2.225073858507771E-308};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException_4() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] start = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        double[] upperBound = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NumberIsTooLargeException} in: parseOptimizationData(optData);
 *  */
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize_ThrowNumberIsTooLargeException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {6.924462078501613E274};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {6.210072369203036E231};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException_3() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {0.0, 0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", -3);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {1.780059086883471E-307};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {1.780059086883471E-307};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {1.780059086883471E-307};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException_2() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", -2);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Target target = ((Target) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Target"));
        double[] target1 = {1.58E-322};
        setField(target, "org.apache.commons.math3.optim.nonlinear.vector.Target", "target", target1);
        optimizationDataArray[0] = ((OptimizationData) target);
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: parseOptimizationData(optData);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_ThrowDimensionMismatchException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: return doOptimize();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_ThrowMathUnsupportedOperationException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathUnsupportedOperationException} in: return doOptimize();
 *  */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_ThrowMathUnsupportedOperationException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: return doOptimize();
 *  */
    @Test(expected = NullArgumentException.class)
    public void testOptimize_ThrowNullArgumentException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {3.7806450887165545E-276};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {3.7806450887165545E-276};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:145)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testOptimize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:161)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_5() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:145)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_6() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] start = {1.199423472914787E-305};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {1.199423472914787E-305};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:145)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parseOptimizationData(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_8() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:161)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.resetCount();
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_9() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        multiStartMultivariateOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parseOptimizationData(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:161)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parseOptimizationData(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:161)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parseOptimizationData(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:161)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#resetCount()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#resetCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iterations.resetCount();
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", target);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", target);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parseOptimizationData(optData);
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_7() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {2.3424637049414333E-269};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        data[0] = start;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:161)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#optimize(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.resetCount();
 *  */
    @Test
    public void testOptimize_ThrowNullPointerException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Target target = ((Target) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Target"));
        double[] target1 = {};
        setField(target, "org.apache.commons.math3.optim.nonlinear.vector.Target", "target", target1);
        optimizationDataArray[0] = ((OptimizationData) target);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test(expected = NoDataException.class)
    public void testOptimize1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        data[0] = start;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
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
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = {-0.0, 0.0};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        double[] upper = {};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", upper);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize5() throws Exception  {
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
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", target);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", target);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize6() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {-6.984919309616089E-10};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        double[] upperBound = {java.lang.Double.NaN};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize7() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        double[] start = new double[33];
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = new double[33];
        lower[3] = 2.0000000000000004;
        lower[4] = 1.73833895195875E-310;
        lower[5] = 1.390671161567E-309;
        lower[7] = -0.0;
        lower[11] = 5.562684646268003E-309;
        lower[26] = 4.9E-324;
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        double[] upper = {};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", upper);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NumberIsTooLargeException.class)
    public void testOptimize8() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        double[] upperBound = {java.lang.Double.NaN, java.lang.Double.NaN, 0.0};
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, 4.243991582E-314};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize9() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {java.lang.Double.NaN};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {1.60391980392498E306};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {-2.240698678073874E190};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize10() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[1] = ((OptimizationData) maxEval);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize11() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null,
            null,
            null
        };
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize12() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
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
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NonSquareMatrixException.class)
    public void testOptimize13() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        double[] start = {2.150964001522728E-247};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {2.150964001522728E-247};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
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
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = NullArgumentException.class)
    public void testOptimize14() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize15() throws Exception  {
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
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", target);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", target);
        double[] upperBound = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ModelFunction modelFunction = new ModelFunction(null);
        optimizationDataArray[0] = ((OptimizationData) modelFunction);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize16() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
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
            null,
            null
        };
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize17() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {1.0109982581969958E-173};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {java.lang.Double.NaN};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test(expected = DimensionMismatchException.class)
    public void testOptimize18() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", target);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method optimize([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    @Test
    public void testOptimize19() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 3 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:145)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize20() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:145)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize21() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[3];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[1] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.SimpleBounds.getLower(SimpleBounds.java:53)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.parseOptimizationData(BaseMultivariateOptimizer.java:93)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize22() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[3];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[1] = ((OptimizationData) maxEval);
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[2] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.clear(MultiStartMultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.doOptimize(BaseMultiStartMultivariateOptimizer.java:166)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize23() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[10];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[1] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.clear(MultiStartMultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.doOptimize(BaseMultiStartMultivariateOptimizer.java:166)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize24() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        optimizationDataArray[1] = ((OptimizationData) initialGuess);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.InitialGuess.getInitialGuess(InitialGuess.java:45)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.parseOptimizationData(BaseMultivariateOptimizer.java:88)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize25() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:161)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize26() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[11];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[2] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer.clear(MultiStartMultivariateOptimizer.java:89)
            org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.doOptimize(BaseMultiStartMultivariateOptimizer.java:166)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143) */
        multiStartMultivariateOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize27() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        InitialGuess initialGuess1 = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        optimizationDataArray[1] = ((OptimizationData) initialGuess1);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.InitialGuess.getInitialGuess(InitialGuess.java:45)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.parseOptimizationData(BaseMultivariateOptimizer.java:88)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        multiStartMultivariateOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize28() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        double[] start = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141) */
        multiStartMultivariateOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize29() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[11];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[2] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer.clear(MultiStartMultivariateOptimizer.java:89)
            org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.doOptimize(BaseMultiStartMultivariateOptimizer.java:166)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143) */
        multiStartMultivariateOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize30() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[9];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[1] = ((OptimizationData) maxEval);
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[3] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData(BaseOptimizer.java:196)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.parseOptimizationData(BaseMultivariateOptimizer.java:82)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize31() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[11];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[1] = ((OptimizationData) maxIter);
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[2] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData(BaseOptimizer.java:192)
            org.apache.commons.math3.optim.BaseMultivariateOptimizer.parseOptimizationData(BaseMultivariateOptimizer.java:82)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize32() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {1.742192675024389E-260, -0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {1.742192675024389E-260, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:161)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize33() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] start = {2.0800947927231114E236};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {2.0800947927231114E236};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", lowerBound);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:161)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize34() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        double[] start = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize35() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] start = {0.0, -0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-0.0, 0.0};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Target target = ((Target) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Target"));
        optimizationDataArray[0] = ((OptimizationData) target);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.Target.getTarget(Target.java:48)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:141)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize36() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] start = {1.029762863479029E-84, -0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {1.029762863479029E-84, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        optimizationDataArray[0] = ((OptimizationData) weight);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:65)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:145)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize37() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        double[] start = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", start);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize38() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        double[] start = {-9.36536089173062E-280};
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = {-9.36536089173062E-280};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        double[] upper = {0.0};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", upper);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize39() throws Exception  {
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
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", target);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", target);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize40() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        double[] start = {0.0};
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-0.0};
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.clear(MultiStartMultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.doOptimize(BaseMultiStartMultivariateOptimizer.java:166)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize41() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        double[] start = {9.851023277833383E115, -8.77059375927082E115};
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {java.lang.Double.NaN, java.lang.Double.NaN};
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize42() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", target);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", target);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", target);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize43() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        double[] start = {-4.93275E-319, java.lang.Double.NaN};
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] upperBound = {2.225082346498714E-308, 7.268387242956074E134};
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize44() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        double[] start = {1.075913984E9, 3.33761078776081E-308};
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-5.915816592227696E-272, 8.4E-323};
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer.clear(MultiStartMultivariateVectorOptimizer.java:92)
            org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.doOptimize(BaseMultiStartMultivariateOptimizer.java:166)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize45() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", target);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", target);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize46() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        double[] upperBound = {java.lang.Double.NaN, java.lang.Double.NaN};
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {9.778156604768E-311, java.lang.Double.POSITIVE_INFINITY};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer.clear(MultiStartMultivariateOptimizer.java:89)
            org.apache.commons.math3.optim.BaseMultiStartMultivariateOptimizer.doOptimize(BaseMultiStartMultivariateOptimizer.java:166)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143) */
        multiStartMultivariateOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize47() throws Exception  {
        MultiStartMultivariateVectorOptimizer multiStartMultivariateVectorOptimizer = ((MultiStartMultivariateVectorOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.MultiStartMultivariateVectorOptimizer"));
        double[] start = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(multiStartMultivariateVectorOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[1] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141) */
        multiStartMultivariateVectorOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize48() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
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
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize49() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        data[0] = target;
        double[] doubleArray = {4.01214975811175E137};
        data[1] = doubleArray;
        data[2] = doubleArray;
        data[3] = doubleArray;
        data[4] = doubleArray;
        data[5] = doubleArray;
        data[6] = doubleArray;
        data[7] = doubleArray;
        data[8] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {4.01214975811175E137};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", doubleArray);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize50() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[2];
        InitialGuess initialGuess = ((InitialGuess) createInstance("org.apache.commons.math3.optim.InitialGuess"));
        double[] init = {};
        setField(initialGuess, "org.apache.commons.math3.optim.InitialGuess", "init", init);
        optimizationDataArray[0] = ((OptimizationData) initialGuess);
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[1] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.checkParameters(MultivariateVectorOptimizer.java:161)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.parseOptimizationData(MultivariateVectorOptimizer.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.JacobianMultivariateVectorOptimizer.parseOptimizationData(JacobianMultivariateVectorOptimizer.java:99)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.parseOptimizationData(AbstractLeastSquaresOptimizer.java:244)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:137) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize51() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
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
        double[] start = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize52() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {java.lang.Double.NaN};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        double[] lowerBound = {-7.291177646455913E-304};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "lowerBound", lowerBound);
        double[] upperBound = {4.426323730270559E-221};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "upperBound", upperBound);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ModelFunctionJacobian modelFunctionJacobian = new ModelFunctionJacobian(null);
        optimizationDataArray[0] = ((OptimizationData) modelFunctionJacobian);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize53() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:141) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize54() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer.getWeightSquareRoot(AbstractLeastSquaresOptimizer.java:111)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:311)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:113)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize55() throws Exception  {
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
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize56() throws Exception  {
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
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        ModelFunction modelFunction = new ModelFunction(null);
        optimizationDataArray[0] = ((OptimizationData) modelFunction);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize57() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        SimpleBounds simpleBounds = ((SimpleBounds) createInstance("org.apache.commons.math3.optim.SimpleBounds"));
        double[] lower = {};
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "lower", lower);
        setField(simpleBounds, "org.apache.commons.math3.optim.SimpleBounds", "upper", target);
        optimizationDataArray[0] = ((OptimizationData) simpleBounds);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize58() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] target = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        double[] start = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseMultivariateOptimizer", "start", start);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:140) */
        levenbergMarquardtOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize59() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[32][];
        data[0] = ((double[]) null);
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        data[9] = ((double[]) null);
        data[10] = ((double[]) null);
        data[11] = ((double[]) null);
        data[12] = ((double[]) null);
        data[13] = ((double[]) null);
        data[14] = ((double[]) null);
        data[15] = ((double[]) null);
        data[16] = ((double[]) null);
        data[17] = ((double[]) null);
        data[18] = ((double[]) null);
        data[19] = ((double[]) null);
        data[20] = ((double[]) null);
        data[21] = ((double[]) null);
        data[22] = ((double[]) null);
        data[23] = ((double[]) null);
        data[24] = ((double[]) null);
        data[25] = ((double[]) null);
        data[26] = ((double[]) null);
        data[27] = ((double[]) null);
        data[28] = ((double[]) null);
        data[29] = ((double[]) null);
        data[30] = ((double[]) null);
        data[31] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", evaluations);
        SimpleVectorValueChecker checker = ((SimpleVectorValueChecker) createInstance("org.apache.commons.math3.optim.SimpleVectorValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:96)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:94)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:52)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    
    @Test
    public void testOptimize60() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] target = {4.9E-324};
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "target", target);
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[10][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        data[9] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer", "weightMatrix", weightMatrix);
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        SimpleUnivariateValueChecker checker = ((SimpleUnivariateValueChecker) createInstance("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "checker", checker);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.optimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.MultivariateVectorOptimizer.getWeight(MultivariateVectorOptimizer.java:96)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:94)
            org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer.doOptimize(GaussNewtonOptimizer.java:52)
            org.apache.commons.math3.optim.BaseOptimizer.optimize(BaseOptimizer.java:143) */
        gaussNewtonOptimizer.optimize(optimizationDataArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseOptimizationData([Lorg.apache.commons.math3.optim.OptimizationData;)
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException_1() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData] produces [java.lang.NullPointerException] */
        gaussNewtonOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException_3() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = {null};
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData] produces [java.lang.NullPointerException] */
        gaussNewtonOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(OptimizationData data: optData)
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData(BaseOptimizer.java:190) */
        gaussNewtonOptimizer.parseOptimizationData(null);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException_4() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-254);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData] produces [java.lang.NullPointerException] */
        gaussNewtonOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException_6() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        iterations.setMaximalCount(-254);
        setField(gaussNewtonOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData] produces [java.lang.NullPointerException] */
        gaussNewtonOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.setMaximalCount(((MaxEval) data).getMaxEval());
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException_2() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxEval maxEval = ((MaxEval) createInstance("org.apache.commons.math3.optim.MaxEval"));
        optimizationDataArray[0] = ((OptimizationData) maxEval);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData(BaseOptimizer.java:192) */
        multiStartMultivariateOptimizer.parseOptimizationData(optimizationDataArray);
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#parseOptimizationData(org.apache.commons.math3.optim.OptimizationData[])}
 * @utbot.iterates iterate the loop {@code for(OptimizationData data: optData)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iterations.setMaximalCount(((MaxIter) data).getMaxIter());
 *  */
    @Test
    public void testParseOptimizationData_ThrowNullPointerException_5() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        org.apache.commons.math3.optim.OptimizationData[] optimizationDataArray = new org.apache.commons.math3.optim.OptimizationData[1];
        MaxIter maxIter = ((MaxIter) createInstance("org.apache.commons.math3.optim.MaxIter"));
        optimizationDataArray[0] = ((OptimizationData) maxIter);
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.parseOptimizationData(BaseOptimizer.java:196) */
        multiStartMultivariateOptimizer.parseOptimizationData(optimizationDataArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.BaseOptimizer.incrementEvaluationCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method incrementEvaluationCount()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#incrementEvaluationCount()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#incrementCount()}
 *  */
    @Test
    public void testIncrementEvaluationCount_IncrementorIncrementCount() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(256);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 255);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        multiStartMultivariateOptimizer.incrementEvaluationCount();
        
        Incrementor incrementor = multiStartMultivariateOptimizer.evaluations;
        int finalMultiStartMultivariateOptimizerEvaluationsCount = ((Integer) getFieldValue(incrementor, "org.apache.commons.math3.util.Incrementor", "count"));
        
        assertEquals(256, finalMultiStartMultivariateOptimizerEvaluationsCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method incrementEvaluationCount()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#incrementEvaluationCount()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#incrementCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: evaluations.incrementCount();
 *  */
    @Test
    public void testIncrementEvaluationCount_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.incrementEvaluationCount] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.incrementEvaluationCount(BaseOptimizer.java:162) */
        gaussNewtonOptimizer.incrementEvaluationCount();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method incrementEvaluationCount()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#incrementEvaluationCount()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: evaluations.incrementCount();
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testIncrementEvaluationCount_ThrowTooManyEvaluationsException() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(2);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 2);
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        multiStartMultivariateOptimizer.incrementEvaluationCount();
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#incrementEvaluationCount()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyIterationsException} in: evaluations.incrementCount();
 *  */
    @Test(expected = TooManyIterationsException.class)
    public void testIncrementEvaluationCount_ThrowTooManyIterationsException() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(2);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 2);
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback");
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        multiStartMultivariateOptimizer.incrementEvaluationCount();
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#incrementEvaluationCount()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MaxCountExceededException} in: evaluations.incrementCount();
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testIncrementEvaluationCount_ThrowMaxCountExceededException() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(2);
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", 2);
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math3.util.Incrementor$1"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        multiStartMultivariateOptimizer.incrementEvaluationCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.BaseOptimizer.getConvergenceChecker
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getConvergenceChecker()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#getConvergenceChecker()}
 * @utbot.returnsFrom {@code return checker;}
 *  */
    @Test
    public void testGetConvergenceChecker_ReturnChecker() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        
        ConvergenceChecker actual = gaussNewtonOptimizer.getConvergenceChecker();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.BaseOptimizer.incrementIterationCount
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method incrementIterationCount()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#incrementIterationCount()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#incrementCount()}
 *  */
    @Test
    public void testIncrementIterationCount_IncrementorIncrementCount() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        iterations.setMaximalCount(256);
        setField(iterations, "org.apache.commons.math3.util.Incrementor", "count", 255);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        
        multiStartMultivariateOptimizer.incrementIterationCount();
        
        Incrementor incrementor = multiStartMultivariateOptimizer.iterations;
        int finalMultiStartMultivariateOptimizerIterationsCount = ((Integer) getFieldValue(incrementor, "org.apache.commons.math3.util.Incrementor", "count"));
        
        assertEquals(256, finalMultiStartMultivariateOptimizerIterationsCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method incrementIterationCount()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#incrementIterationCount()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#incrementCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iterations.incrementCount();
 *  */
    @Test
    public void testIncrementIterationCount_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.incrementIterationCount] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.incrementIterationCount(BaseOptimizer.java:173) */
        gaussNewtonOptimizer.incrementIterationCount();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method incrementIterationCount()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#incrementIterationCount()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyEvaluationsException} in: iterations.incrementCount();
 *  */
    @Test(expected = TooManyEvaluationsException.class)
    public void testIncrementIterationCount_ThrowTooManyEvaluationsException() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        iterations.setMaximalCount(2);
        setField(iterations, "org.apache.commons.math3.util.Incrementor", "count", 2);
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback");
        setField(iterations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        
        multiStartMultivariateOptimizer.incrementIterationCount();
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#incrementIterationCount()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.TooManyIterationsException} in: iterations.incrementCount();
 *  */
    @Test(expected = TooManyIterationsException.class)
    public void testIncrementIterationCount_ThrowTooManyIterationsException() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        iterations.setMaximalCount(2);
        setField(iterations, "org.apache.commons.math3.util.Incrementor", "count", 2);
        Object maxCountCallback = createInstance("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback");
        setField(iterations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        
        multiStartMultivariateOptimizer.incrementIterationCount();
    }
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#incrementIterationCount()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MaxCountExceededException} in: iterations.incrementCount();
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testIncrementIterationCount_ThrowMaxCountExceededException() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        iterations.setMaximalCount(2);
        setField(iterations, "org.apache.commons.math3.util.Incrementor", "count", 2);
        Incrementor.MaxCountExceededCallback maxCountCallback = ((Incrementor.MaxCountExceededCallback) createInstance("org.apache.commons.math3.util.Incrementor$1"));
        setField(iterations, "org.apache.commons.math3.util.Incrementor", "maxCountCallback", maxCountCallback);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        
        multiStartMultivariateOptimizer.incrementIterationCount();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.BaseOptimizer.getMaxEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxEvaluations()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#getMaxEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getMaximalCount()}
 * @utbot.returnsFrom {@code return evaluations.getMaximalCount();}
 *  */
    @Test
    public void testGetMaxEvaluations_IncrementorGetMaximalCount() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        evaluations.setMaximalCount(-255);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        int actual = multiStartMultivariateOptimizer.getMaxEvaluations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMaxEvaluations()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#getMaxEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getMaximalCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluations.getMaximalCount();
 *  */
    @Test
    public void testGetMaxEvaluations_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.getMaxEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.getMaxEvaluations(BaseOptimizer.java:60) */
        gaussNewtonOptimizer.getMaxEvaluations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.BaseOptimizer.getEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEvaluations()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#getEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getCount()}
 * @utbot.returnsFrom {@code return evaluations.getCount();}
 *  */
    @Test
    public void testGetEvaluations_IncrementorGetCount() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor evaluations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(evaluations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "evaluations", evaluations);
        
        int actual = multiStartMultivariateOptimizer.getEvaluations();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEvaluations()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#getEvaluations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return evaluations.getCount();
 *  */
    @Test
    public void testGetEvaluations_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.getEvaluations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.getEvaluations(BaseOptimizer.java:72) */
        gaussNewtonOptimizer.getEvaluations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.BaseOptimizer.getMaxIterations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMaxIterations()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#getMaxIterations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getMaximalCount()}
 * @utbot.returnsFrom {@code return iterations.getMaximalCount();}
 *  */
    @Test
    public void testGetMaxIterations_IncrementorGetMaximalCount() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        iterations.setMaximalCount(-255);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        
        int actual = multiStartMultivariateOptimizer.getMaxIterations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getMaxIterations()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#getMaxIterations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getMaximalCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iterations.getMaximalCount();
 *  */
    @Test
    public void testGetMaxIterations_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.getMaxIterations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.getMaxIterations(BaseOptimizer.java:81) */
        gaussNewtonOptimizer.getMaxIterations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optim.BaseOptimizer.getIterations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIterations()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#getIterations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getCount()}
 * @utbot.returnsFrom {@code return iterations.getCount();}
 *  */
    @Test
    public void testGetIterations_IncrementorGetCount() throws Exception  {
        MultiStartMultivariateOptimizer multiStartMultivariateOptimizer = ((MultiStartMultivariateOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.scalar.MultiStartMultivariateOptimizer"));
        Incrementor iterations = ((Incrementor) createInstance("org.apache.commons.math3.util.Incrementor"));
        setField(iterations, "org.apache.commons.math3.util.Incrementor", "count", -255);
        setField(multiStartMultivariateOptimizer, "org.apache.commons.math3.optim.BaseOptimizer", "iterations", iterations);
        
        int actual = multiStartMultivariateOptimizer.getIterations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIterations()
    
    /**
    @utbot.classUnderTest {@link BaseOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.BaseOptimizer#getIterations()}
 * @utbot.invokes {@link org.apache.commons.math3.util.Incrementor#getCount()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return iterations.getCount();
 *  */
    @Test
    public void testGetIterations_ThrowNullPointerException() throws Exception  {
        GaussNewtonOptimizer gaussNewtonOptimizer = ((GaussNewtonOptimizer) createInstance("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        
        /* This test fails because method [org.apache.commons.math3.optim.BaseOptimizer.getIterations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.BaseOptimizer.getIterations(BaseOptimizer.java:93) */
        gaussNewtonOptimizer.getIterations();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields715366580849000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields715366580849000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass715366580853700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715366580849000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715366580853700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields715366581253200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields715366581253200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass715366581255400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields715366581253200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass715366581255400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

