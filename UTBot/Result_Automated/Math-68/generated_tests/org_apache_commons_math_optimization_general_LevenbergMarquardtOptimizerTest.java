package org.apache.commons.math.optimization.general;

import org.junit.Test;
import org.apache.commons.math.optimization.fitting.CurveFitter;
import java.util.ArrayList;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.apache.commons.math.optimization.fitting.WeightedObservedPoint;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_optimization_general_LevenbergMarquardtOptimizerTest {
    ///region Test suites for executable org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.invokes {@link java.lang.Math#min(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#updateResidualsAndCost()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 *  */
    @Test
    public void testDoOptimize_MaxCosineLessOrEqualOrthoTolerance() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        double[] jacNorm = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", -255);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmPar", 0.0);
        levenbergMarquardtOptimizer.setInitialStepBoundFactor(0.0);
        levenbergMarquardtOptimizer.setOrthoTolerance(-0.0);
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        double[] objective = {0.0, 0.0};
        levenbergMarquardtOptimizer.objective = objective;
        double[] residuals = {0.0};
        levenbergMarquardtOptimizer.residuals = residuals;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxIterations(313269266);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", 313269265);
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$01 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        setField(this$01, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$01);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        double[] initialLevenbergMarquardtOptimizerDiagR = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR"));
        double[] initialLevenbergMarquardtOptimizerJacNorm = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm"));
        double[] initialLevenbergMarquardtOptimizerBeta = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta"));
        int[] initialLevenbergMarquardtOptimizerPermutation = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        double[] initialLevenbergMarquardtOptimizerLmDir = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir"));
        double[][] initialLevenbergMarquardtOptimizerJacobian = levenbergMarquardtOptimizer.jacobian;
        double[] initialLevenbergMarquardtOptimizerObjective = levenbergMarquardtOptimizer.objective;
        
        VectorialPointValuePair actual = levenbergMarquardtOptimizer.doOptimize();
        
        VectorialPointValuePair expected = ((VectorialPointValuePair) createInstance("org.apache.commons.math.optimization.VectorialPointValuePair"));
        double[] point1 = {};
        setField(expected, "org.apache.commons.math.optimization.VectorialPointValuePair", "point", point1);
        double[] value = {};
        setField(expected, "org.apache.commons.math.optimization.VectorialPointValuePair", "value", value);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double[] expectedValue = expected.getValue();
        double[] actualValue = actual.getValue();
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue, 1.0E-6);
        
        int finalLevenbergMarquardtOptimizerSolvedCols = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols"));
        double[] finalLevenbergMarquardtOptimizerDiagR = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR"));
        double[] finalLevenbergMarquardtOptimizerJacNorm = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm"));
        double[] finalLevenbergMarquardtOptimizerBeta = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta"));
        int[] finalLevenbergMarquardtOptimizerPermutation = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerRank = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank"));
        double[] finalLevenbergMarquardtOptimizerLmDir = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir"));
        double[][] finalLevenbergMarquardtOptimizerJacobian = levenbergMarquardtOptimizer.jacobian;
        double[] finalLevenbergMarquardtOptimizerObjective = levenbergMarquardtOptimizer.objective;
        int finalLevenbergMarquardtOptimizerIterations = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations"));
        int finalLevenbergMarquardtOptimizerObjectiveEvaluations = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations"));
        int finalLevenbergMarquardtOptimizerJacobianEvaluations = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations"));
        
        assertFalse(initialLevenbergMarquardtOptimizerDiagR == finalLevenbergMarquardtOptimizerDiagR);
        
        assertFalse(initialLevenbergMarquardtOptimizerJacNorm == finalLevenbergMarquardtOptimizerJacNorm);
        
        assertFalse(initialLevenbergMarquardtOptimizerBeta == finalLevenbergMarquardtOptimizerBeta);
        
        assertFalse(initialLevenbergMarquardtOptimizerPermutation == finalLevenbergMarquardtOptimizerPermutation);
        
        assertFalse(initialLevenbergMarquardtOptimizerLmDir == finalLevenbergMarquardtOptimizerLmDir);
        
        assertFalse(initialLevenbergMarquardtOptimizerJacobian == finalLevenbergMarquardtOptimizerJacobian);
        
        assertFalse(initialLevenbergMarquardtOptimizerObjective == finalLevenbergMarquardtOptimizerObjective);
        
        assertEquals(0, finalLevenbergMarquardtOptimizerSolvedCols);
        
        assertEquals(0, finalLevenbergMarquardtOptimizerRank);
        
        assertEquals(313269266, finalLevenbergMarquardtOptimizerIterations);
        
        assertEquals(Integer.MIN_VALUE, finalLevenbergMarquardtOptimizerObjectiveEvaluations);
        
        assertEquals(1, finalLevenbergMarquardtOptimizerJacobianEvaluations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: diagR = new double[cols];
 *  */
    @Test
    public void testDoOptimize_ThrowNegativeArraySizeException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        levenbergMarquardtOptimizer.cols = -255;
        levenbergMarquardtOptimizer.rows = -255;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NegativeArraySizeException: -255]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:225) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] oldRes = new double[rows];
 *  */
    @Test
    public void testDoOptimize_ThrowNegativeArraySizeException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = -2147483646;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NegativeArraySizeException: -2147483646]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:236) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: updateResidualsAndCost();
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        double[] jacNorm = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        levenbergMarquardtOptimizer.targetValues = lmDir;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.objective = lmDir;
        levenbergMarquardtOptimizer.residuals = point;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
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
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:220)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:242) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: updateResidualsAndCost();
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        double[] jacNorm = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        double[] targetValues = {};
        levenbergMarquardtOptimizer.targetValues = targetValues;
        levenbergMarquardtOptimizer.point = targetValues;
        levenbergMarquardtOptimizer.objective = lmDir;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
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
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:219)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:242) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: updateResidualsAndCost();
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] jacNorm = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        levenbergMarquardtOptimizer.targetValues = lmDir;
        double[] residualsWeights = {};
        levenbergMarquardtOptimizer.residualsWeights = residualsWeights;
        levenbergMarquardtOptimizer.point = residualsWeights;
        levenbergMarquardtOptimizer.objective = lmDir;
        levenbergMarquardtOptimizer.residuals = lmDir;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
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
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:221)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:242) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: updateResidualsAndCost();
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        double[] diagR = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] beta = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", beta);
        levenbergMarquardtOptimizer.cols = 2;
        levenbergMarquardtOptimizer.rows = 2;
        levenbergMarquardtOptimizer.point = beta;
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
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
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.value(HarmonicFitter.java:114)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction.value(CurveFitter.java:190)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:211)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:242) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double xk = dk * point[k];
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        double[] diagR = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] beta = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmPar", 0.0);
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        double[] residuals = {0.0};
        levenbergMarquardtOptimizer.residuals = residuals;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxIterations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", Integer.MAX_VALUE);
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:275) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: updateResidualsAndCost();
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        double[] diagR = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 2;
        levenbergMarquardtOptimizer.rows = 2;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
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
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.value(HarmonicFitter.java:113)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction.value(CurveFitter.java:190)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:211)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:242) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: updateResidualsAndCost();
 *  */
    @Test
    public void testDoOptimize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        double[] diagR = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        double[] point = {0.0, 0.0};
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
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
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.optimization.fitting.HarmonicFitter$ParametricHarmonicFunction.value(HarmonicFitter.java:115)
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction.value(CurveFitter.java:190)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:211)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:242) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateResidualsAndCost();
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.FunctionEvaluationException.<init>(FunctionEvaluationException.java:113)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:208)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:242) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: updateResidualsAndCost();
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testDoOptimize_ThrowFunctionEvaluationException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", diagR);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", diagR);
        levenbergMarquardtOptimizer.cols = 2;
        levenbergMarquardtOptimizer.rows = 2;
        levenbergMarquardtOptimizer.point = diagR;
        levenbergMarquardtOptimizer.objective = diagR;
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: incrementIterationsCounter();
 *  */
    @Test(expected = OptimizationException.class)
    public void testDoOptimize_ThrowOptimizationException() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] jacNorm = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmPar", 0.0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", jacNorm);
        levenbergMarquardtOptimizer.point = jacNorm;
        levenbergMarquardtOptimizer.objective = jacNorm;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: incrementIterationsCounter();
 *  */
    @Test(expected = OptimizationException.class)
    public void testDoOptimize_ThrowOptimizationException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        double[] jacNorm = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmPar", 0.0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", jacNorm);
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        levenbergMarquardtOptimizer.targetValues = jacNorm;
        levenbergMarquardtOptimizer.residualsWeights = jacNorm;
        double[] point = {};
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.objective = jacNorm;
        levenbergMarquardtOptimizer.residuals = jacNorm;
        levenbergMarquardtOptimizer.cost = 0.0;
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
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
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
 * @utbot.throwsException {@link org.apache.commons.math.FunctionEvaluationException} in: updateResidualsAndCost();
 *  */
    @Test(expected = FunctionEvaluationException.class)
    public void testDoOptimize_ThrowFunctionEvaluationException_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 2;
        levenbergMarquardtOptimizer.rows = 2;
        double[] point = new double[11];
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.objective = lmDir;
        levenbergMarquardtOptimizer.setMaxEvaluations(Integer.MIN_VALUE);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", Integer.MAX_VALUE);
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
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method doOptimize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer}
     * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#doOptimize()}
     */
    @Test
    public void testDoOptimizeThrowsNPE() throws FunctionEvaluationException, OptimizationException  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = new LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer.setMaxEvaluations(1);
        levenbergMarquardtOptimizer.setMaxIterations(0);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:211)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:242) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doOptimize()
    
    @Test
    public void testDoOptimize1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] diagR = new double[12];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] jacNorm = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmPar", 0.0);
        levenbergMarquardtOptimizer.setInitialStepBoundFactor(java.lang.Double.NaN);
        levenbergMarquardtOptimizer.setOrthoTolerance(2.225073858507202E-308);
        levenbergMarquardtOptimizer.cols = 1;
        double[] point = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.cost = 0.0;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -2);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -786434);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$01 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        setField(this$01, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$01);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        double[] initialLevenbergMarquardtOptimizerDiagR = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR"));
        double[] initialLevenbergMarquardtOptimizerJacNorm = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm"));
        double[] initialLevenbergMarquardtOptimizerBeta = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta"));
        int[] initialLevenbergMarquardtOptimizerPermutation = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        double[] initialLevenbergMarquardtOptimizerLmDir = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir"));
        double[][] initialLevenbergMarquardtOptimizerJacobian = levenbergMarquardtOptimizer.jacobian;
        double[] initialLevenbergMarquardtOptimizerObjective = levenbergMarquardtOptimizer.objective;
        
        VectorialPointValuePair actual = levenbergMarquardtOptimizer.doOptimize();
        
        VectorialPointValuePair expected = ((VectorialPointValuePair) createInstance("org.apache.commons.math.optimization.VectorialPointValuePair"));
        double[] point1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        setField(expected, "org.apache.commons.math.optimization.VectorialPointValuePair", "point", point1);
        double[] value = {};
        setField(expected, "org.apache.commons.math.optimization.VectorialPointValuePair", "value", value);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double[] expectedValue = expected.getValue();
        double[] actualValue = actual.getValue();
        int expectedValueSize = expectedValue.length;
        assertEquals(expectedValueSize, actualValue.length);
        assertArrayEquals(expectedValue, actualValue, 1.0E-6);
        
        double[] finalLevenbergMarquardtOptimizerDiagR = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR"));
        double[] finalLevenbergMarquardtOptimizerJacNorm = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm"));
        double[] finalLevenbergMarquardtOptimizerBeta = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta"));
        int[] finalLevenbergMarquardtOptimizerPermutation = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        double[] finalLevenbergMarquardtOptimizerLmDir = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir"));
        double[][] finalLevenbergMarquardtOptimizerJacobian = levenbergMarquardtOptimizer.jacobian;
        double[] finalLevenbergMarquardtOptimizerObjective = levenbergMarquardtOptimizer.objective;
        int finalLevenbergMarquardtOptimizerIterations = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations"));
        int finalLevenbergMarquardtOptimizerObjectiveEvaluations = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations"));
        int finalLevenbergMarquardtOptimizerJacobianEvaluations = ((Integer) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jacobianEvaluations"));
        
        assertFalse(initialLevenbergMarquardtOptimizerDiagR == finalLevenbergMarquardtOptimizerDiagR);
        
        assertFalse(initialLevenbergMarquardtOptimizerJacNorm == finalLevenbergMarquardtOptimizerJacNorm);
        
        assertFalse(initialLevenbergMarquardtOptimizerBeta == finalLevenbergMarquardtOptimizerBeta);
        
        assertFalse(initialLevenbergMarquardtOptimizerPermutation == finalLevenbergMarquardtOptimizerPermutation);
        
        assertFalse(initialLevenbergMarquardtOptimizerLmDir == finalLevenbergMarquardtOptimizerLmDir);
        
        assertFalse(initialLevenbergMarquardtOptimizerJacobian == finalLevenbergMarquardtOptimizerJacobian);
        
        assertFalse(initialLevenbergMarquardtOptimizerObjective == finalLevenbergMarquardtOptimizerObjective);
        
        assertEquals(-1, finalLevenbergMarquardtOptimizerIterations);
        
        assertEquals(-786433, finalLevenbergMarquardtOptimizerObjectiveEvaluations);
        
        assertEquals(1, finalLevenbergMarquardtOptimizerJacobianEvaluations);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doOptimize()
    
    @Test
    public void testDoOptimize2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] diagR = {0.0, 0.0, 0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] beta = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        levenbergMarquardtOptimizer.cols = 8;
        levenbergMarquardtOptimizer.rows = 1;
        double[] point = {0.0, 0.0, 0.0, 0.0, 0.0};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -37945351);
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
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:219)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:242) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = new double[16];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        double[] beta = new double[16];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmPar", 0.0);
        double[] lmDir = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 2;
        levenbergMarquardtOptimizer.cost = 0.0;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -2);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -2);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$01 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        setField(this$01, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$01);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:275) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] diagR = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] beta = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        levenbergMarquardtOptimizer.point = beta;
        levenbergMarquardtOptimizer.setMaxEvaluations(67108864);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 40357633);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        Object f = createInstance("org.apache.commons.math.optimization.fitting.PolynomialFitter$ParametricPolynomial");
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
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction.value(CurveFitter.java:190)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateResidualsAndCost(AbstractLeastSquaresOptimizer.java:211)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:242) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    @Test
    public void testDoOptimize5() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmPar", 0.0);
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.cost = 0.0;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -2);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -524290);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$01 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations1 = new ArrayList();
        observations1.add(null);
        setField(this$01, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations1);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$01);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1.value(CurveFitter.java:173)
            org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer.updateJacobian(AbstractLeastSquaresOptimizer.java:184)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize(LevenbergMarquardtOptimizer.java:252) */
        levenbergMarquardtOptimizer.doOptimize();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method doOptimize()
    
    @Test(expected = FunctionEvaluationException.class)
    public void testDoOptimize6() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] diagR = new double[20];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] beta = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        levenbergMarquardtOptimizer.cols = 9;
        levenbergMarquardtOptimizer.rows = 2;
        double[] point = {0.0, 0.0, 0.0};
        levenbergMarquardtOptimizer.point = point;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", -35684354);
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
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    
    @Test(expected = OptimizationException.class)
    public void testDoOptimize7() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = new double[17];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmPar", 0.0);
        double[] lmDir = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.setInitialStepBoundFactor(java.lang.Double.NaN);
        levenbergMarquardtOptimizer.setOrthoTolerance(java.lang.Double.NaN);
        levenbergMarquardtOptimizer.cols = 1;
        double[] point = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        levenbergMarquardtOptimizer.point = point;
        levenbergMarquardtOptimizer.cost = 0.0;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "iterations", -2);
        levenbergMarquardtOptimizer.setMaxEvaluations(1073741824);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "objectiveEvaluations", 1072955390);
        Object function = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$0 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        ArrayList observations = new ArrayList();
        setField(this$0, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(function, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$0);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "function", function);
        MultivariateMatrixFunction jF = ((MultivariateMatrixFunction) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        Object this$1 = createInstance("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction");
        CurveFitter this$01 = ((CurveFitter) createInstance("org.apache.commons.math.optimization.fitting.CurveFitter"));
        setField(this$01, "org.apache.commons.math.optimization.fitting.CurveFitter", "observations", observations);
        setField(this$1, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction", "this$0", this$01);
        setField(jF, "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1", "this$1", this$1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer", "jF", jF);
        
        levenbergMarquardtOptimizer.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setOrthoTolerance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setOrthoTolerance(double)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#setOrthoTolerance(double)}
 *  */
    @Test
    public void testSetOrthoTolerance() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setOrthoTolerance(0.0);
        
        levenbergMarquardtOptimizer.setOrthoTolerance(java.lang.Double.NaN);
        
        double finalLevenbergMarquardtOptimizerOrthoTolerance = ((Double) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "orthoTolerance"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalLevenbergMarquardtOptimizerOrthoTolerance, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method qrDecomposition()
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 *  */
    @Test
    public void testQrDecomposition() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -255);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", -255);
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 *  */
    @Test
    public void testQrDecomposition_Ak2EqualsZero() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        
        int[] levenbergMarquardtOptimizerPermutation = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerPermutation0 = ((Integer) get(levenbergMarquardtOptimizerPermutation, 0));
        
        assertEquals(0, finalLevenbergMarquardtOptimizerPermutation0);
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} twice
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 *  */
    @Test
    public void testQrDecomposition_Norm2LessOrEqualAk2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255, -255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 2;
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        
        int[] levenbergMarquardtOptimizerPermutation = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerPermutation0 = ((Integer) get(levenbergMarquardtOptimizerPermutation, 0));
        int[] levenbergMarquardtOptimizerPermutation1 = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerPermutation1 = ((Integer) get(levenbergMarquardtOptimizerPermutation1, 1));
        
        assertEquals(0, finalLevenbergMarquardtOptimizerPermutation0);
        
        assertEquals(1, finalLevenbergMarquardtOptimizerPermutation1);
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 *  */
    @Test
    public void testQrDecomposition_AkkGreaterThanZero() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] jacNorm = {4.345847379897E-311, 4.345847379897E-311};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        double[] beta = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {1.2014947790656485E-77};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        
        double[] levenbergMarquardtOptimizerDiagR = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR"));
        double finalLevenbergMarquardtOptimizerDiagR0 = ((Double) get(levenbergMarquardtOptimizerDiagR, 0));
        double[] levenbergMarquardtOptimizerJacNorm = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm"));
        double finalLevenbergMarquardtOptimizerJacNorm0 = ((Double) get(levenbergMarquardtOptimizerJacNorm, 0));
        double[] levenbergMarquardtOptimizerBeta = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta"));
        double finalLevenbergMarquardtOptimizerBeta0 = ((Double) get(levenbergMarquardtOptimizerBeta, 0));
        int[] levenbergMarquardtOptimizerPermutation = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerPermutation0 = ((Integer) get(levenbergMarquardtOptimizerPermutation, 0));
        double finalLevenbergMarquardtOptimizerJacobian00 = levenbergMarquardtOptimizer.jacobian[0][0];
        
        org.junit.Assert.assertEquals(-1.2014947790656485E-77, finalLevenbergMarquardtOptimizerDiagR0, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.2014947790656485E-77, finalLevenbergMarquardtOptimizerJacNorm0, 1.0E-6);
        
        org.junit.Assert.assertEquals(3.463588016541716E153, finalLevenbergMarquardtOptimizerBeta0, 1.0E-6);
        
        assertEquals(0, finalLevenbergMarquardtOptimizerPermutation0);
        
        org.junit.Assert.assertEquals(2.402989558131297E-77, finalLevenbergMarquardtOptimizerJacobian00, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method qrDecomposition()
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: permutation[k] = k;
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:767) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double akk = jacobian[i][k];
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:770) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jacNorm[k] = Math.sqrt(norm2);
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:773) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jacNorm[k] = Math.sqrt(norm2);
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:773) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: permutation[k] = k;
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 2;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:767) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: beta[pk] = betak;
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {2.0237E-320};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        double[] beta = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {-255, -255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {0.00711299566953739};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:810) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: diagR[pk] = alpha;
 *  */
    @Test
    public void testQrDecomposition_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] diagR = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        double[] jacNorm = {3.2379E-319};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        double[] beta = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {-255, -255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {4.2310768069368556E-155, 0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:813) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: permutation[k] = k;
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:767) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double akk = jacobian[i][k];
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:770) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < jacobian.length; ++i)
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:769) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jacNorm[k] = Math.sqrt(norm2);
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:773) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: beta[pk] = betak;
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {2.0237E-320};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {-2.019172731787013};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:810) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: diagR[pk] = alpha;
 *  */
    @Test
    public void testQrDecomposition_ThrowNullPointerException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {1.295163E-318};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        double[] beta = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {0, 0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {1.4571701550031269};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:813) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method qrDecomposition()
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: rows
 *  */
    @Test(expected = OptimizationException.class)
    public void testQrDecomposition_ThrowOptimizationException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {3.2379E-319, 3.2379E-319};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {2.420999787701195E154, 0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qrDecomposition()}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: rows
 *  */
    @Test(expected = OptimizationException.class)
    public void testQrDecomposition_ThrowOptimizationException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {java.lang.Double.NaN};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {java.lang.Double.NaN};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method qrDecomposition()
    
    @Test
    public void testQrDecomposition1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[4][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        jacobian[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        jacobian[1] = doubleArray1;
        jacobian[2] = doubleArray1;
        jacobian[3] = doubleArray1;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 2;
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        
        int[] levenbergMarquardtOptimizerPermutation = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerPermutation1 = ((Integer) get(levenbergMarquardtOptimizerPermutation, 1));
        
        assertEquals(1, finalLevenbergMarquardtOptimizerPermutation1);
    }
    
    @Test
    public void testQrDecomposition2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = new int[11];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[2][];
        double[] doubleArray = new double[11];
        jacobian[0] = doubleArray;
        jacobian[1] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 3;
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        
        int[] levenbergMarquardtOptimizerPermutation = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerPermutation1 = ((Integer) get(levenbergMarquardtOptimizerPermutation, 1));
        int[] levenbergMarquardtOptimizerPermutation1 = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerPermutation2 = ((Integer) get(levenbergMarquardtOptimizerPermutation1, 2));
        
        assertEquals(1, finalLevenbergMarquardtOptimizerPermutation1);
        
        assertEquals(2, finalLevenbergMarquardtOptimizerPermutation2);
    }
    
    @Test
    public void testQrDecomposition3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = new double[22];
        jacNorm[0] = java.lang.Double.NaN;
        jacNorm[1] = java.lang.Double.NaN;
        jacNorm[2] = java.lang.Double.NaN;
        jacNorm[3] = java.lang.Double.NaN;
        jacNorm[4] = java.lang.Double.NaN;
        jacNorm[5] = java.lang.Double.NaN;
        jacNorm[6] = java.lang.Double.NaN;
        jacNorm[7] = java.lang.Double.NaN;
        jacNorm[8] = java.lang.Double.NaN;
        jacNorm[9] = java.lang.Double.NaN;
        jacNorm[10] = java.lang.Double.NaN;
        jacNorm[11] = java.lang.Double.NaN;
        jacNorm[12] = java.lang.Double.NaN;
        jacNorm[13] = java.lang.Double.NaN;
        jacNorm[14] = java.lang.Double.NaN;
        jacNorm[15] = java.lang.Double.NaN;
        jacNorm[16] = java.lang.Double.NaN;
        jacNorm[17] = java.lang.Double.NaN;
        jacNorm[18] = java.lang.Double.NaN;
        jacNorm[19] = java.lang.Double.NaN;
        jacNorm[20] = java.lang.Double.NaN;
        jacNorm[21] = java.lang.Double.NaN;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = new int[24];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = new double[16];
        doubleArray[0] = 3.443996259609378E-232;
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 4;
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        
        double[] levenbergMarquardtOptimizerJacNorm = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm"));
        double finalLevenbergMarquardtOptimizerJacNorm0 = ((Double) get(levenbergMarquardtOptimizerJacNorm, 0));
        double[] levenbergMarquardtOptimizerJacNorm1 = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm"));
        double finalLevenbergMarquardtOptimizerJacNorm1 = ((Double) get(levenbergMarquardtOptimizerJacNorm1, 1));
        double[] levenbergMarquardtOptimizerJacNorm2 = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm"));
        double finalLevenbergMarquardtOptimizerJacNorm2 = ((Double) get(levenbergMarquardtOptimizerJacNorm2, 2));
        double[] levenbergMarquardtOptimizerJacNorm3 = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm"));
        double finalLevenbergMarquardtOptimizerJacNorm3 = ((Double) get(levenbergMarquardtOptimizerJacNorm3, 3));
        int[] levenbergMarquardtOptimizerPermutation = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerPermutation1 = ((Integer) get(levenbergMarquardtOptimizerPermutation, 1));
        int[] levenbergMarquardtOptimizerPermutation1 = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerPermutation2 = ((Integer) get(levenbergMarquardtOptimizerPermutation1, 2));
        int[] levenbergMarquardtOptimizerPermutation2 = ((int[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation"));
        int finalLevenbergMarquardtOptimizerPermutation3 = ((Integer) get(levenbergMarquardtOptimizerPermutation2, 3));
        
        org.junit.Assert.assertEquals(0.0, finalLevenbergMarquardtOptimizerJacNorm0, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalLevenbergMarquardtOptimizerJacNorm1, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalLevenbergMarquardtOptimizerJacNorm2, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalLevenbergMarquardtOptimizerJacNorm3, 1.0E-6);
        
        assertEquals(1, finalLevenbergMarquardtOptimizerPermutation1);
        
        assertEquals(2, finalLevenbergMarquardtOptimizerPermutation2);
        
        assertEquals(3, finalLevenbergMarquardtOptimizerPermutation3);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method qrDecomposition()
    
    @Test
    public void testQrDecomposition4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[10][];
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        jacobian[0] = doubleArray;
        jacobian[1] = doubleArray;
        jacobian[2] = doubleArray;
        jacobian[3] = doubleArray;
        jacobian[4] = doubleArray;
        jacobian[5] = doubleArray;
        jacobian[6] = doubleArray;
        jacobian[7] = doubleArray;
        jacobian[8] = doubleArray;
        jacobian[9] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition(LevenbergMarquardtOptimizer.java:773) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method qrDecomposition()
    
    @Test(expected = OptimizationException.class)
    public void testQrDecomposition5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] jacNorm = new double[22];
        jacNorm[0] = 5.43230922487E-312;
        jacNorm[1] = 5.43230922487E-312;
        jacNorm[2] = 5.43230922487E-312;
        jacNorm[3] = 5.43230922487E-312;
        jacNorm[4] = 5.43230922487E-312;
        jacNorm[5] = 5.43230922487E-312;
        jacNorm[6] = 5.43230922487E-312;
        jacNorm[7] = 5.43230922487E-312;
        jacNorm[8] = 5.43230922487E-312;
        jacNorm[9] = 5.43230922487E-312;
        jacNorm[10] = 5.43230922487E-312;
        jacNorm[11] = 5.43230922487E-312;
        jacNorm[12] = 5.43230922487E-312;
        jacNorm[13] = 5.43230922487E-312;
        jacNorm[14] = 5.43230922487E-312;
        jacNorm[15] = 5.43230922487E-312;
        jacNorm[16] = 5.43230922487E-312;
        jacNorm[17] = 5.43230922487E-312;
        jacNorm[18] = 5.43230922487E-312;
        jacNorm[19] = 5.43230922487E-312;
        jacNorm[20] = 5.43230922487E-312;
        jacNorm[21] = 5.43230922487E-312;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "jacNorm", jacNorm);
        int[] permutation = new int[24];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = new double[16];
        doubleArray[0] = java.lang.Double.NaN;
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 4;
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Method qrDecompositionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qrDecomposition");
        qrDecompositionMethod.setAccessible(true);
        java.lang.Object[] qrDecompositionMethodArguments = new java.lang.Object[0];
        try {
            qrDecompositionMethod.invoke(levenbergMarquardtOptimizer, qrDecompositionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method qTy([D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 *  */
    @Test
    public void testQTy() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) null);
        qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 *  */
    @Test
    public void testQTy_IterateForLoop() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] beta = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {1, -255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        levenbergMarquardtOptimizer.cols = 1;
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) null);
        qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 *  */
    @Test
    public void testQTy_IterateForLoop_1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] beta = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        jacobian[0] = beta;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        double[] doubleArray = {0.0};
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method qTyMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("qTy", doubleArrayType);
        qTyMethod.setAccessible(true);
        java.lang.Object[] qTyMethodArguments = new java.lang.Object[1];
        qTyMethodArguments[0] = ((Object) doubleArray);
        qTyMethod.invoke(levenbergMarquardtOptimizer, qTyMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method qTy([D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int pk = permutation[k];
 *  */
    @Test
    public void testQTy_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:841) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gamma += jacobian[i][pk] * y[i];
 *  */
    @Test
    public void testQTy_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:844) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gamma += jacobian[i][pk] * y[i];
 *  */
    @Test
    public void testQTy_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:844) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gamma += jacobian[i][pk] * y[i];
 *  */
    @Test
    public void testQTy_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {65};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 2]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:844) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: gamma *= beta[pk];
 *  */
    @Test
    public void testQTy_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] beta = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "beta", beta);
        int[] permutation = {129};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:846) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pk = permutation[k];
 *  */
    @Test
    public void testQTy_ThrowNullPointerException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:841) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gamma += jacobian[i][pk] * y[i];
 *  */
    @Test
    public void testQTy_ThrowNullPointerException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:844) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gamma += jacobian[i][pk] * y[i];
 *  */
    @Test
    public void testQTy_ThrowNullPointerException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:844) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gamma += jacobian[i][pk] * y[i];
 *  */
    @Test
    public void testQTy_ThrowNullPointerException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:844) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gamma *= beta[pk];
 *  */
    @Test
    public void testQTy_ThrowNullPointerException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = 1;
        levenbergMarquardtOptimizer.rows = 1;
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:846) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#qTy(double[])}
 * @utbot.iterates iterate the loop {@code for(int k = 0; k < cols; ++k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: gamma *= beta[pk];
 *  */
    @Test
    public void testQTy_ThrowNullPointerException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(LevenbergMarquardtOptimizer.java:846) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setParRelativeTolerance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setParRelativeTolerance(double)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#setParRelativeTolerance(double)}
 *  */
    @Test
    public void testSetParRelativeTolerance() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setParRelativeTolerance(0.0);
        
        levenbergMarquardtOptimizer.setParRelativeTolerance(java.lang.Double.NaN);
        
        double finalLevenbergMarquardtOptimizerParRelativeTolerance = ((Double) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "parRelativeTolerance"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalLevenbergMarquardtOptimizerParRelativeTolerance, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setInitialStepBoundFactor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setInitialStepBoundFactor(double)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#setInitialStepBoundFactor(double)}
 *  */
    @Test
    public void testSetInitialStepBoundFactor() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setInitialStepBoundFactor(0.0);
        
        levenbergMarquardtOptimizer.setInitialStepBoundFactor(java.lang.Double.NaN);
        
        double finalLevenbergMarquardtOptimizerInitialStepBoundFactor = ((Double) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "initialStepBoundFactor"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalLevenbergMarquardtOptimizerInitialStepBoundFactor, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method determineLMDirection([D, [D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} twice
 *  */
    @Test
    public void testDetermineLMDirection_NSingLessOrEqualZero() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDiag[j] = dpj;
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_13() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:661) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Arrays.fill(lmDiag, j + 1, lmDiag.length, 0);
 *  */
    @Test
    public void testDetermineLMDirection_ThrowIllegalArgumentException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {2.781342323134002E-309, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.IllegalArgumentException: fromIndex(1) > toIndex(0)]
            java.base/java.util.Arrays.rangeCheck(Arrays.java:718)
            java.base/java.util.Arrays.fill(Arrays.java:3379)
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:659) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double rkk = jacobian[k][pk];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_17() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {java.lang.Double.NaN};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {4.9E-324};
        double[] doubleArray2 = {java.lang.Double.NaN};
        double[] doubleArray3 = {0.0, 0.0};
        double[] doubleArray4 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:676) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double dpj = diag[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_12() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:657) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDiag[j] = jacobian[j][permutation[j]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_14() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1, -255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {5.304989477E-315};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = {};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray = {4.9E-324};
        double[] doubleArray1 = {0.0, -0.0};
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:707) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDiag[j] = jacobian[j][permutation[j]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_15() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {1.295163E-318};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {java.lang.Double.NaN, 0.0};
        double[] doubleArray2 = {0.0, -0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:707) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[2] = ((Object) lmDir);
        determineLMDirectionMethodArguments[3] = ((Object) lmDir);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double rkk = jacobian[k][pk];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_16() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {2.1729236899484E-311, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = {};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:676) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class lmDirType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", lmDirType, lmDirType, lmDirType, lmDirType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) lmDir);
        determineLMDirectionMethodArguments[1] = ((Object) lmDir);
        determineLMDirectionMethodArguments[2] = ((Object) lmDir);
        determineLMDirectionMethodArguments[3] = ((Object) lmDir);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = work[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_18() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {2.6755485217387732E-197};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {2.716154612436E-312, -0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {4.9E-324};
        double[] doubleArray2 = {0.0, -0.0};
        double[] doubleArray3 = {3.31561842E-316};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = work[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = work[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {536870912};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 536870912 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int pj = permutation[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:643) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j] = qy[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:648) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jacobian[i][pj] = jacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:645) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jacobian[i][pj] = jacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {1, 1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        jacobian[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        jacobian[1] = doubleArray1;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:645) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jacobian[i][pj] = jacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {
            null,
            null
        };
        levenbergMarquardtOptimizer.jacobian = jacobian;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:645) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: jacobian[i][pj] = jacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255, 65};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        jacobian[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        jacobian[1] = doubleArray1;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 65 out of bounds for length 2]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:645) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work[j] = qy[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:648) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[j] = diagR[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:647) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[j] = diagR[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {33};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 33 out of bounds for length 2]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:647) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[j] = diagR[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 2);
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1, 1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        jacobian[0] = doubleArray;
        jacobian[1] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:647) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDiag[j] = dpj;
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_12() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {java.lang.Double.NaN};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {6.7903865311E-313, 0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:661) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Arrays.fill(lmDiag, j + 1, lmDiag.length, 0);
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_13() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, java.lang.Double.NaN};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1, -255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {7.9E-323, 7.9E-323};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {4.9E-324};
        double[] doubleArray1 = {java.lang.Double.NaN, 4.9E-324};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:659) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDiag[j] = jacobian[j][permutation[j]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_15() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {3.4766779039175E-310, -0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:707) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double rkk = jacobian[k][pk];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_16() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, java.lang.Double.NaN};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray = {4.9E-324};
        double[] doubleArray1 = {1.295163E-318, 4.9E-324};
        double[] doubleArray2 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:676) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double dpj = diag[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_11() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:657) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDiag[j] = jacobian[j][permutation[j]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_14() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {4.9E-324, 4.9E-324};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {0.0, -0.0};
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:707) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int j = 0; j < lmDir.length; ++j)
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:735) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = work[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pj = permutation[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:643) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jacobian[i][pj] = jacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255, -255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = {
            null,
            null
        };
        levenbergMarquardtOptimizer.jacobian = jacobian;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:645) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jacobian[i][pj] = jacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-255, 1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        jacobian[0] = doubleArray;
        jacobian[1] = ((double[]) null);
        levenbergMarquardtOptimizer.jacobian = jacobian;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:645) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[j] = qy[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_10() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:648) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (nSing > 0): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < lmDir.length; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = work[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: jacobian[i][pj] = jacobian[j][permutation[i]];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 2);
        int[] permutation = {-254};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:645) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work[j] = qy[j];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:648) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[j] = diagR[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:647) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMDirection(double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[j] = diagR[pj];
 *  */
    @Test
    public void testDetermineLMDirection_ThrowNullPointerException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:647) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {
            1.295163E-318, 1.295163E-318, 1.295163E-318, 1.295163E-318, 1.295163E-318, 1.295163E-318,
            1.295163E-318, 1.295163E-318, 1.295163E-318
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = new double[9][];
        double[] doubleArray = {
            -7.4024364295717E-310, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        jacobian[0] = doubleArray;
        jacobian[1] = ((double[]) null);
        jacobian[2] = ((double[]) null);
        jacobian[3] = ((double[]) null);
        jacobian[4] = ((double[]) null);
        jacobian[5] = ((double[]) null);
        jacobian[6] = ((double[]) null);
        jacobian[7] = ((double[]) null);
        jacobian[8] = ((double[]) null);
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray2 = {
            -2.299098222802919E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray3 = {2.781342323134002E-309, 2.781342323134002E-309};
        double[] doubleArray4 = {
            1.295163E-318, 1.295163E-318, 1.295163E-318, 1.295163E-318, 1.295163E-318, 1.295163E-318,
            1.295163E-318, 1.295163E-318, 1.295163E-318
        };
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray3);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray4);
        determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        
        double finalLevenbergMarquardtOptimizerJacobian00 = levenbergMarquardtOptimizer.jacobian[0][0];
        double[] finalLevenbergMarquardtOptimizerJacobian1 = levenbergMarquardtOptimizer.jacobian[1];
        double[] finalLevenbergMarquardtOptimizerJacobian2 = levenbergMarquardtOptimizer.jacobian[2];
        double[] finalLevenbergMarquardtOptimizerJacobian3 = levenbergMarquardtOptimizer.jacobian[3];
        double[] finalLevenbergMarquardtOptimizerJacobian4 = levenbergMarquardtOptimizer.jacobian[4];
        double[] finalLevenbergMarquardtOptimizerJacobian5 = levenbergMarquardtOptimizer.jacobian[5];
        double[] finalLevenbergMarquardtOptimizerJacobian6 = levenbergMarquardtOptimizer.jacobian[6];
        double[] finalLevenbergMarquardtOptimizerJacobian7 = levenbergMarquardtOptimizer.jacobian[7];
        double[] finalLevenbergMarquardtOptimizerJacobian8 = levenbergMarquardtOptimizer.jacobian[8];
        
        double finalDoubleArray30 = doubleArray3[0];
        double finalDoubleArray31 = doubleArray3[1];
        
        double finalDoubleArray40 = doubleArray4[0];
        
        org.junit.Assert.assertEquals(0.0, finalLevenbergMarquardtOptimizerJacobian00, 1.0E-6);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian1);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian2);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian3);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian4);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian5);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian6);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian7);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian8);
        
        org.junit.Assert.assertEquals(-2.3002896001601463E-308, finalDoubleArray30, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalDoubleArray31, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.0, finalDoubleArray40, 1.0E-6);
    }
    
    @Test
    public void testDetermineLMDirection2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {
            8.4879831639E-314, 8.4879831639E-314, 8.4879831639E-314, 8.4879831639E-314, 8.4879831639E-314, 8.4879831639E-314,
            8.4879831639E-314, 8.4879831639E-314, 8.4879831639E-314
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = new double[9][];
        double[] doubleArray = {
            -2.8480945388892178E-306, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        jacobian[0] = doubleArray;
        jacobian[1] = ((double[]) null);
        jacobian[2] = ((double[]) null);
        jacobian[3] = ((double[]) null);
        jacobian[4] = ((double[]) null);
        jacobian[5] = ((double[]) null);
        jacobian[6] = ((double[]) null);
        jacobian[7] = ((double[]) null);
        jacobian[8] = ((double[]) null);
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {
            0.0, 1.0118E-320, 1.0118E-320, 1.0118E-320, 1.0118E-320, 1.0118E-320,
            1.0118E-320, 1.0118E-320, 1.0118E-320
        };
        double[] doubleArray2 = {
            -5.006416181641203E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray3 = {0.0};
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray3);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray1);
        determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        
        double[] levenbergMarquardtOptimizerLmDir = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir"));
        double finalLevenbergMarquardtOptimizerLmDir0 = ((Double) get(levenbergMarquardtOptimizerLmDir, 0));
        double[] levenbergMarquardtOptimizerLmDir1 = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir"));
        double finalLevenbergMarquardtOptimizerLmDir3 = ((Double) get(levenbergMarquardtOptimizerLmDir1, 3));
        double finalLevenbergMarquardtOptimizerJacobian00 = levenbergMarquardtOptimizer.jacobian[0][0];
        double[] finalLevenbergMarquardtOptimizerJacobian1 = levenbergMarquardtOptimizer.jacobian[1];
        double[] finalLevenbergMarquardtOptimizerJacobian2 = levenbergMarquardtOptimizer.jacobian[2];
        double[] finalLevenbergMarquardtOptimizerJacobian3 = levenbergMarquardtOptimizer.jacobian[3];
        double[] finalLevenbergMarquardtOptimizerJacobian4 = levenbergMarquardtOptimizer.jacobian[4];
        double[] finalLevenbergMarquardtOptimizerJacobian5 = levenbergMarquardtOptimizer.jacobian[5];
        double[] finalLevenbergMarquardtOptimizerJacobian6 = levenbergMarquardtOptimizer.jacobian[6];
        double[] finalLevenbergMarquardtOptimizerJacobian7 = levenbergMarquardtOptimizer.jacobian[7];
        double[] finalLevenbergMarquardtOptimizerJacobian8 = levenbergMarquardtOptimizer.jacobian[8];
        
        double finalDoubleArray10 = doubleArray1[0];
        
        double finalDoubleArray30 = doubleArray3[0];
        
        double finalDoubleArray101 = doubleArray1[0];
        
        org.junit.Assert.assertEquals(-0.0, finalLevenbergMarquardtOptimizerLmDir0, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.0118E-320, finalLevenbergMarquardtOptimizerLmDir3, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalLevenbergMarquardtOptimizerJacobian00, 1.0E-6);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian1);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian2);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian3);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian4);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian5);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian6);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian7);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian8);
        
        org.junit.Assert.assertEquals(-0.0, finalDoubleArray10, 1.0E-6);
        
        org.junit.Assert.assertEquals(-2.848534521951413E-306, finalDoubleArray30, 1.0E-6);
        
        org.junit.Assert.assertEquals(-0.0, finalDoubleArray101, 1.0E-6);
    }
    
    @Test
    public void testDetermineLMDirection3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
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
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {
            0.0, 1.7809282562817405E-307, 1.7809282562817405E-307, 1.7809282562817405E-307, 1.7809282562817405E-307, 1.7809282562817405E-307,
            1.7809282562817405E-307, 1.7809282562817405E-307, 1.7809282562817405E-307, 1.7809282562817405E-307
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = new double[9][];
        double[] doubleArray = {
            5.180654E-318, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        jacobian[0] = doubleArray;
        jacobian[1] = ((double[]) null);
        jacobian[2] = ((double[]) null);
        jacobian[3] = ((double[]) null);
        jacobian[4] = ((double[]) null);
        jacobian[5] = ((double[]) null);
        jacobian[6] = ((double[]) null);
        jacobian[7] = ((double[]) null);
        jacobian[8] = ((double[]) null);
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {
            2.0000000000000004, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray2 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray);
        determineLMDirectionMethodArguments[3] = ((Object) lmDir);
        determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        
        double[] levenbergMarquardtOptimizerLmDir = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir"));
        double finalLevenbergMarquardtOptimizerLmDir0 = ((Double) get(levenbergMarquardtOptimizerLmDir, 0));
        double finalLevenbergMarquardtOptimizerJacobian00 = levenbergMarquardtOptimizer.jacobian[0][0];
        double[] finalLevenbergMarquardtOptimizerJacobian1 = levenbergMarquardtOptimizer.jacobian[1];
        double[] finalLevenbergMarquardtOptimizerJacobian2 = levenbergMarquardtOptimizer.jacobian[2];
        double[] finalLevenbergMarquardtOptimizerJacobian3 = levenbergMarquardtOptimizer.jacobian[3];
        double[] finalLevenbergMarquardtOptimizerJacobian4 = levenbergMarquardtOptimizer.jacobian[4];
        double[] finalLevenbergMarquardtOptimizerJacobian5 = levenbergMarquardtOptimizer.jacobian[5];
        double[] finalLevenbergMarquardtOptimizerJacobian6 = levenbergMarquardtOptimizer.jacobian[6];
        double[] finalLevenbergMarquardtOptimizerJacobian7 = levenbergMarquardtOptimizer.jacobian[7];
        double[] finalLevenbergMarquardtOptimizerJacobian8 = levenbergMarquardtOptimizer.jacobian[8];
        
        double finalDoubleArray0 = doubleArray[0];
        
        double finalLmDir0 = lmDir[0];
        
        org.junit.Assert.assertEquals(1.0, finalLevenbergMarquardtOptimizerLmDir0, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalLevenbergMarquardtOptimizerJacobian00, 1.0E-6);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian1);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian2);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian3);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian4);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian5);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian6);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian7);
        
        assertNull(finalLevenbergMarquardtOptimizerJacobian8);
        
        org.junit.Assert.assertEquals(2.0000000000000004, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.0, finalLmDir0, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method determineLMDirection([D, [D, [D, [D)
    
    @Test
    public void testDetermineLMDirection4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -2147483647);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
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
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
    public void testDetermineLMDirection5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            2.716154612436E-312, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {
            0, 5091, 5091, 5091, 5091, 5091, 5091, 5091,
            5091
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = new double[9][];
        double[] doubleArray = {
            5.9666725849601654E-154, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        jacobian[0] = doubleArray;
        jacobian[1] = ((double[]) null);
        jacobian[2] = ((double[]) null);
        jacobian[3] = ((double[]) null);
        jacobian[4] = ((double[]) null);
        jacobian[5] = ((double[]) null);
        jacobian[6] = ((double[]) null);
        jacobian[7] = ((double[]) null);
        jacobian[8] = ((double[]) null);
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {
            java.lang.Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray2 = {
            -16.000000000000004, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray3 = {java.lang.Double.NaN, java.lang.Double.NaN};
        double[] doubleArray4 = {
            1.69759663277E-313, 1.69759663277E-313, 1.69759663277E-313, 1.69759663277E-313, 1.69759663277E-313, 1.69759663277E-313,
            1.69759663277E-313, 1.69759663277E-313, 1.69759663277E-313
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5091 out of bounds for length 9]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
    public void testDetermineLMDirection6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {0, 3};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {
            1.265E-321, 1.265E-321, 1.265E-321, 1.265E-321, 1.265E-321, 1.265E-321,
            1.265E-321, 1.265E-321, 1.265E-321
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = new double[9][];
        double[] doubleArray = {
            4.778309744572025E-299, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        jacobian[0] = doubleArray;
        jacobian[1] = diagR;
        jacobian[2] = diagR;
        jacobian[3] = diagR;
        jacobian[4] = diagR;
        jacobian[5] = diagR;
        jacobian[6] = diagR;
        jacobian[7] = diagR;
        jacobian[8] = diagR;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray2 = {
            4.778309744572025E-299, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray3 = {3.31561842E-316};
        double[] doubleArray4 = {
            5.304989477E-315, 5.304989477E-315, 5.304989477E-315, 5.304989477E-315, 5.304989477E-315, 5.304989477E-315,
            5.304989477E-315, 5.304989477E-315, 5.304989477E-315
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:736) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            0.0, 6.7903865311E-313, 6.7903865311E-313, 6.7903865311E-313, 6.7903865311E-313, 6.7903865311E-313,
            6.7903865311E-313, 6.7903865311E-313, 6.7903865311E-313
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = new int[32];
        permutation[1] = 5091;
        permutation[2] = 5091;
        permutation[3] = 5091;
        permutation[4] = 5091;
        permutation[5] = 5091;
        permutation[6] = 5091;
        permutation[7] = 5091;
        permutation[8] = 5091;
        permutation[9] = 5091;
        permutation[10] = 5091;
        permutation[11] = 5091;
        permutation[12] = 5091;
        permutation[13] = 5091;
        permutation[14] = 5091;
        permutation[15] = 5091;
        permutation[16] = 5091;
        permutation[17] = 5091;
        permutation[18] = 5091;
        permutation[19] = 5091;
        permutation[20] = 5091;
        permutation[21] = 5091;
        permutation[22] = 5091;
        permutation[23] = 5091;
        permutation[24] = 5091;
        permutation[25] = 5091;
        permutation[26] = 5091;
        permutation[27] = 5091;
        permutation[28] = 5091;
        permutation[29] = 5091;
        permutation[30] = 5091;
        permutation[31] = 5091;
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            2.5032080908206016E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray2 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        double[] doubleArray3 = {
            1.1125369292536007E-308, 1.1125369292536007E-308, 1.1125369292536007E-308, 1.1125369292536007E-308, 1.1125369292536007E-308, 1.1125369292536007E-308,
            1.1125369292536007E-308, 1.1125369292536007E-308
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:676) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 3);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[][] jacobian = new double[10][];
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        jacobian[0] = doubleArray;
        jacobian[1] = doubleArray;
        jacobian[2] = doubleArray;
        jacobian[3] = doubleArray;
        jacobian[4] = doubleArray;
        jacobian[5] = doubleArray;
        jacobian[6] = doubleArray;
        jacobian[7] = doubleArray;
        jacobian[8] = doubleArray;
        jacobian[9] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        double[] doubleArray2 = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:647) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Method determineLMDirectionMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMDirection", doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMDirectionMethod.setAccessible(true);
        java.lang.Object[] determineLMDirectionMethodArguments = new java.lang.Object[4];
        determineLMDirectionMethodArguments[0] = ((Object) null);
        determineLMDirectionMethodArguments[1] = ((Object) doubleArray1);
        determineLMDirectionMethodArguments[2] = ((Object) doubleArray2);
        determineLMDirectionMethodArguments[3] = ((Object) doubleArray2);
        try {
            determineLMDirectionMethod.invoke(levenbergMarquardtOptimizer, determineLMDirectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDetermineLMDirection9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 2);
        double[] diagR = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", diagR);
        double[][] jacobian = new double[10][];
        jacobian[0] = diagR;
        jacobian[1] = diagR;
        jacobian[2] = diagR;
        jacobian[3] = diagR;
        jacobian[4] = diagR;
        jacobian[5] = diagR;
        jacobian[6] = diagR;
        jacobian[7] = diagR;
        jacobian[8] = diagR;
        jacobian[9] = diagR;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(LevenbergMarquardtOptimizer.java:657) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setCostRelativeTolerance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCostRelativeTolerance(double)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#setCostRelativeTolerance(double)}
 *  */
    @Test
    public void testSetCostRelativeTolerance() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.setCostRelativeTolerance(0.0);
        
        levenbergMarquardtOptimizer.setCostRelativeTolerance(java.lang.Double.NaN);
        
        double finalLevenbergMarquardtOptimizerCostRelativeTolerance = ((Double) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "costRelativeTolerance"));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalLevenbergMarquardtOptimizerCostRelativeTolerance, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method determineLMParameter([D, double, [D, [D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): True}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testDetermineLMParameter_FpLessOrEqual0dMultiplyDelta() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -2147483647);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmPar", 0.0);
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        double[] doubleArray2 = {};
        double[] doubleArray3 = {};
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = java.lang.Double.POSITIVE_INFINITY;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray2);
        determineLMParameterMethodArguments[4] = ((Object) doubleArray3);
        determineLMParameterMethodArguments[5] = ((Object) null);
        determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method determineLMParameter([D, double, [D, [D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {Integer.MIN_VALUE};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:493) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: work1[pj] = s;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:494) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): False}
 * @utbot.executesCondition {@code (rank == solvedCols): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += jacobian[i][pj] * qy[i];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0, 5091};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", -536870912);
        double[] lmDir = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        levenbergMarquardtOptimizer.cols = -1610612480;
        double[] doubleArray1 = {0.0};
        double[] doubleArray2 = {0.0};
        double[] doubleArray3 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:534) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = -1.1941136683033774E77;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray2);
        determineLMParameterMethodArguments[4] = ((Object) doubleArray3);
        determineLMParameterMethodArguments[5] = ((Object) null);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link LevenbergMarquardtOptimizer}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): False}
 * @utbot.executesCondition {@code (rank == solvedCols): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += jacobian[i][pj] * qy[i];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_12() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0, 0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {};
        double[] doubleArray2 = {0.0};
        double[] doubleArray3 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:534) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArray1Type = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArray1Type, doubleType, doubleArray1Type, doubleArray1Type, doubleArray1Type, doubleArray1Type);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[1] = -9.016580681431383E-131;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray2);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray3);
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-256};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:474) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int k = rank - 1; k >= 0; --k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int pk = permutation[k];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {0, 0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", Integer.MIN_VALUE);
        levenbergMarquardtOptimizer.cols = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 2]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:480) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int pj = permutation[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:492) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:493) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): False}
 * @utbot.executesCondition {@code (rank == solvedCols): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += jacobian[i][pj] * qy[i];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_10() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0, 0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = {};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:534) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = -3.0;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < cols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = 0;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_13() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        double[] lmDir = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 2;
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:477) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:474) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < cols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = 0;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {Integer.MIN_VALUE};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:477) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int k = rank - 1; k >= 0; --k)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double ypk = lmDir[pk] / diagR[pk];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_14() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] diagR = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        double[] lmDir = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 1;
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:481) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:474) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < cols; ++j)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: lmDir[permutation[j]] = 0;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", -1);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:477) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:493) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: work1[pj] = s;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_9() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:494) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): False}
 * @utbot.executesCondition {@code (rank == solvedCols): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sum += jacobian[i][pj] * qy[i];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_10() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0, 0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0};
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:534) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = -5.269033859781099E-305;
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): False}
 * @utbot.executesCondition {@code (rank == solvedCols): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sum += jacobian[i][pj] * qy[i];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_11() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = new double[1][];
        double[] doubleArray = {0.0};
        jacobian[0] = doubleArray;
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray1 = {0.0, 0.0};
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:534) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = -6.080583174246157;
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.executesCondition {@code (fp <= 0.1 * delta): False}
 * @utbot.executesCondition {@code (rank == solvedCols): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sum += jacobian[i][pj] * qy[i];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_12() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0, 5091};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        double[][] jacobian = {null};
        levenbergMarquardtOptimizer.jacobian = jacobian;
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:534) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = -1.2812576293945315;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int k = rank - 1; k >= 0; --k)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_14() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", diagR);
        levenbergMarquardtOptimizer.cols = 1;
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:493) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_2() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:474) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int k = rank - 1; k >= 0; --k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pk = permutation[k];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_3() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", Integer.MIN_VALUE);
        levenbergMarquardtOptimizer.cols = Integer.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:480) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pj = permutation[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:492) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_8() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:493) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) null);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < cols; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < solvedCols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double s = diag[pj] * lmDir[pj];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_15() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:493) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {-255};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:474) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < cols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = 0;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:477) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.iterates iterate the loop {@code for(int k = rank - 1; k >= 0; --k)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double ypk = lmDir[pk] / diagR[pk];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_13() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {1};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        double[] lmDir = {0.0, 0.0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 1;
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:481) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < rank; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = qy[j];
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_1() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:474) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer#determineLMParameter(double[],double,double[],double[],double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int j = rank; j < cols; ++j)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lmDir[permutation[j]] = 0;
 *  */
    @Test
    public void testDetermineLMParameter_ThrowNullPointerException_4() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        levenbergMarquardtOptimizer.cols = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:477) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method determineLMParameter([D, double, [D, [D, [D, [D)
    
    @Test
    public void testDetermineLMParameter1() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -2147483647);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 2;
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray);
        determineLMParameterMethodArguments[4] = ((Object) doubleArray);
        determineLMParameterMethodArguments[5] = ((Object) doubleArray);
        determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
    }
    
    @Test
    public void testDetermineLMParameter2() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 3;
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray);
        determineLMParameterMethodArguments[4] = ((Object) doubleArray);
        determineLMParameterMethodArguments[5] = ((Object) doubleArray);
        determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
    }
    
    @Test
    public void testDetermineLMParameter3() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", -2147483647);
        double[] diagR = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {0, 0};
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", diagR);
        levenbergMarquardtOptimizer.cols = 2;
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = -0.0;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
        determineLMParameterMethodArguments[3] = ((Object) null);
        determineLMParameterMethodArguments[4] = ((Object) doubleArray1);
        determineLMParameterMethodArguments[5] = ((Object) doubleArray);
        determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        
        double[] levenbergMarquardtOptimizerDiagR = ((double[]) getFieldValue(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR"));
        double finalLevenbergMarquardtOptimizerDiagR0 = ((Double) get(levenbergMarquardtOptimizerDiagR, 0));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalLevenbergMarquardtOptimizerDiagR0, 1.0E-6);
    }
    
    @Test
    public void testDetermineLMParameter4() throws Exception  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] diagR = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = new int[11];
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", diagR);
        levenbergMarquardtOptimizer.cols = 3;
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) null);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray);
        determineLMParameterMethodArguments[4] = ((Object) doubleArray);
        determineLMParameterMethodArguments[5] = ((Object) doubleArray);
        determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method determineLMParameter([D, double, [D, [D, [D, [D)
    
    @Test
    public void testDetermineLMParameter5() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        double[] diagR = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", diagR);
        levenbergMarquardtOptimizer.cols = 2;
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:534) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray);
        determineLMParameterMethodArguments[4] = ((Object) doubleArray);
        determineLMParameterMethodArguments[5] = ((Object) doubleArray);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDetermineLMParameter6() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 2);
        double[] diagR = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "diagR", diagR);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "rank", 1);
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", diagR);
        levenbergMarquardtOptimizer.cols = -2147483646;
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:534) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray);
        determineLMParameterMethodArguments[4] = ((Object) doubleArray);
        determineLMParameterMethodArguments[5] = ((Object) doubleArray);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDetermineLMParameter7() throws Throwable  {
        LevenbergMarquardtOptimizer levenbergMarquardtOptimizer = ((LevenbergMarquardtOptimizer) createInstance("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "solvedCols", 1);
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "permutation", permutation);
        double[] lmDir = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(levenbergMarquardtOptimizer, "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer", "lmDir", lmDir);
        levenbergMarquardtOptimizer.cols = 2;
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        /* This test fails because method [org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(LevenbergMarquardtOptimizer.java:534) */
        Class levenbergMarquardtOptimizerClazz = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class doubleArrayType = Class.forName("[D");
        Class doubleType = double.class;
        Method determineLMParameterMethod = levenbergMarquardtOptimizerClazz.getDeclaredMethod("determineLMParameter", doubleArrayType, doubleType, doubleArrayType, doubleArrayType, doubleArrayType, doubleArrayType);
        determineLMParameterMethod.setAccessible(true);
        java.lang.Object[] determineLMParameterMethodArguments = new java.lang.Object[6];
        determineLMParameterMethodArguments[0] = ((Object) doubleArray);
        determineLMParameterMethodArguments[1] = java.lang.Double.NaN;
        determineLMParameterMethodArguments[2] = ((Object) doubleArray);
        determineLMParameterMethodArguments[3] = ((Object) doubleArray);
        determineLMParameterMethodArguments[4] = ((Object) doubleArray);
        determineLMParameterMethodArguments[5] = ((Object) doubleArray);
        try {
            determineLMParameterMethod.invoke(levenbergMarquardtOptimizer, determineLMParameterMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields738253743653000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields738253743653000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass738253743658100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields738253743653000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass738253743658100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields738253744032900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields738253744032900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass738253744034500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields738253744032900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass738253744034500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

