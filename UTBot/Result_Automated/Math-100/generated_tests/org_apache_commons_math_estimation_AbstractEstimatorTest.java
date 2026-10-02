package org.apache.commons.math.estimation;

import org.junit.Test;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_estimation_AbstractEstimatorTest {
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.incrementJacobianEvaluationsCounter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method incrementJacobianEvaluationsCounter()
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#incrementJacobianEvaluationsCounter()}
 *  */
    @Test
    public void testIncrementJacobianEvaluationsCounter() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        
        levenbergMarquardtEstimator.incrementJacobianEvaluationsCounter();
        
        int finalLevenbergMarquardtEstimatorJacobianEvaluations = ((Integer) getFieldValue(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations"));
        
        assertEquals(-254, finalLevenbergMarquardtEstimatorJacobianEvaluations);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.getJacobianEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJacobianEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getJacobianEvaluations()}
 * @utbot.returnsFrom {@code return jacobianEvaluations;}
 *  */
    @Test
    public void testGetJacobianEvaluations_ReturnJacobianEvaluations() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        
        int actual = levenbergMarquardtEstimator.getJacobianEvaluations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region FUZZER: TIMEOUTS for method getJacobianEvaluations()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator}
     * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getJacobianEvaluations()}
     */
    @Test(timeout = 1000L)
    public void testGetJacobianEvaluations() {
        GaussNewtonEstimator gaussNewtonEstimator = new GaussNewtonEstimator(-17, -1.0, -2.063650512248693E267);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        gaussNewtonEstimator.getJacobianEvaluations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.guessParametersErrors
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method guessParametersErrors(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#guessParametersErrors(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int m = problem.getMeasurements().length;
 *  */
    @Test
    public void testGuessParametersErrors_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.guessParametersErrors] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.guessParametersErrors(AbstractEstimator.java:201) */
        levenbergMarquardtEstimator.guessParametersErrors(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method guessParametersErrors(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#guessParametersErrors(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.executesCondition {@code (m <= p): True}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getAllParameters()}
 * @utbot.throwsException {@link org.apache.commons.math.estimation.EstimationException} when: m <= p
 *  */
    @Test(expected = EstimationException.class)
    public void testGuessParametersErrors_ThrowEstimationException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList parameters = new ArrayList();
        parameters.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "parameters", parameters);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", parameters);
        
        levenbergMarquardtEstimator.guessParametersErrors(simpleEstimationProblem);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateResidualsAndCost()
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++costEvaluations > maxCostEval): False}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 *  */
    @Test
    public void testUpdateResidualsAndCost_PrefixIncrementCostEvaluationsLessOrEqualMaxCostEval() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        levenbergMarquardtEstimator.cost = 0.0;
        levenbergMarquardtEstimator.setMaxCostEval(256);
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations", 255);
        
        levenbergMarquardtEstimator.updateResidualsAndCost();
        
        int finalLevenbergMarquardtEstimatorCostEvaluations = ((Integer) getFieldValue(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations"));
        
        assertEquals(256, finalLevenbergMarquardtEstimatorCostEvaluations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method updateResidualsAndCost()
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#updateResidualsAndCost()}
 * @utbot.executesCondition {@code (++costEvaluations > maxCostEval): True}
 * @utbot.throwsException {@link org.apache.commons.math.estimation.EstimationException} when: ++costEvaluations > maxCostEval
 *  */
    @Test(expected = EstimationException.class)
    public void testUpdateResidualsAndCost_ThrowEstimationException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        levenbergMarquardtEstimator.setMaxCostEval(-254);
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations", -254);
        
        levenbergMarquardtEstimator.updateResidualsAndCost();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateResidualsAndCost()
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#updateResidualsAndCost()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, index = 0; i < rows; i++, index += cols)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: WeightedMeasurement wm = measurements[i];
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        org.apache.commons.math.estimation.WeightedMeasurement[] measurements = {};
        levenbergMarquardtEstimator.measurements = measurements;
        levenbergMarquardtEstimator.rows = 1;
        levenbergMarquardtEstimator.cost = 0.0;
        levenbergMarquardtEstimator.setMaxCostEval(256);
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations", 255);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost(AbstractEstimator.java:106) */
        levenbergMarquardtEstimator.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#updateResidualsAndCost()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, index = 0; i < rows; i++, index += cols)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double residual = wm.getResidual();
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        org.apache.commons.math.estimation.WeightedMeasurement[] measurements = {null};
        levenbergMarquardtEstimator.measurements = measurements;
        levenbergMarquardtEstimator.rows = 1;
        levenbergMarquardtEstimator.cost = 0.0;
        levenbergMarquardtEstimator.setMaxCostEval(256);
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations", 255);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost(AbstractEstimator.java:107) */
        levenbergMarquardtEstimator.updateResidualsAndCost();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#updateResidualsAndCost()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, index = 0; i < rows; i++, index += cols)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WeightedMeasurement wm = measurements[i];
 *  */
    @Test
    public void testUpdateResidualsAndCost_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        levenbergMarquardtEstimator.rows = 1;
        levenbergMarquardtEstimator.cost = 0.0;
        levenbergMarquardtEstimator.setMaxCostEval(256);
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations", 255);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.updateResidualsAndCost(AbstractEstimator.java:106) */
        levenbergMarquardtEstimator.updateResidualsAndCost();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.updateJacobian
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateJacobian()
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#updateJacobian()}
 * @utbot.invokes {@link org.apache.commons.math.estimation.AbstractEstimator#incrementJacobianEvaluationsCounter()}
 * @utbot.invokes {@link java.util.Arrays#fill(double[],double)}
 *  */
    @Test
    public void testUpdateJacobian_ArraysFill() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        double[] jacobian = {0.0};
        levenbergMarquardtEstimator.jacobian = jacobian;
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        
        levenbergMarquardtEstimator.updateJacobian();
        
        int finalLevenbergMarquardtEstimatorJacobianEvaluations = ((Integer) getFieldValue(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations"));
        
        assertEquals(-254, finalLevenbergMarquardtEstimatorJacobianEvaluations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateJacobian()
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#updateJacobian()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, index = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: WeightedMeasurement wm = measurements[i];
 *  */
    @Test
    public void testUpdateJacobian_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        org.apache.commons.math.estimation.WeightedMeasurement[] measurements = {};
        levenbergMarquardtEstimator.measurements = measurements;
        double[] jacobian = {0.0};
        levenbergMarquardtEstimator.jacobian = jacobian;
        levenbergMarquardtEstimator.rows = 1;
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.updateJacobian] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.estimation.AbstractEstimator.updateJacobian(AbstractEstimator.java:76) */
        levenbergMarquardtEstimator.updateJacobian();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#updateJacobian()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, index = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double factor = -Math.sqrt(wm.getWeight());
 *  */
    @Test
    public void testUpdateJacobian_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        org.apache.commons.math.estimation.WeightedMeasurement[] measurements = {null};
        levenbergMarquardtEstimator.measurements = measurements;
        double[] jacobian = {0.0};
        levenbergMarquardtEstimator.jacobian = jacobian;
        levenbergMarquardtEstimator.rows = 1;
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.updateJacobian] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.updateJacobian(AbstractEstimator.java:77) */
        levenbergMarquardtEstimator.updateJacobian();
    }
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#updateJacobian()}
 * @utbot.iterates iterate the loop {@code for(int i = 0, index = 0; i < rows; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WeightedMeasurement wm = measurements[i];
 *  */
    @Test
    public void testUpdateJacobian_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        double[] jacobian = {0.0};
        levenbergMarquardtEstimator.jacobian = jacobian;
        levenbergMarquardtEstimator.rows = 1;
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.updateJacobian] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.updateJacobian(AbstractEstimator.java:76) */
        levenbergMarquardtEstimator.updateJacobian();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method updateJacobian()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator}
     * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#updateJacobian()}
     */
    @Test
    public void testUpdateJacobianThrowsNPE() {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = new LevenbergMarquardtEstimator();
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.updateJacobian] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.fill(Arrays.java:3357)
            org.apache.commons.math.estimation.AbstractEstimator.updateJacobian(AbstractEstimator.java:74) */
        levenbergMarquardtEstimator.updateJacobian();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.setMaxCostEval
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setMaxCostEval(int)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#setMaxCostEval(int)}
 *  */
    @Test
    public void testSetMaxCostEval() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        levenbergMarquardtEstimator.setMaxCostEval(-255);
        
        levenbergMarquardtEstimator.setMaxCostEval(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.getCostEvaluations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCostEvaluations()
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getCostEvaluations()}
 * @utbot.returnsFrom {@code return costEvaluations;}
 *  */
    @Test
    public void testGetCostEvaluations_ReturnCostEvaluations() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations", -255);
        
        int actual = levenbergMarquardtEstimator.getCostEvaluations();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.initializeEstimate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method initializeEstimate(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#initializeEstimate(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getUnboundParameters()}
 *  */
    @Test
    public void testInitializeEstimate_EstimationProblemGetUnboundParameters() throws Exception  {
        GaussNewtonEstimator gaussNewtonEstimator = ((GaussNewtonEstimator) createInstance("org.apache.commons.math.estimation.GaussNewtonEstimator"));
        org.apache.commons.math.estimation.EstimatedParameter[] parameters = {null};
        gaussNewtonEstimator.parameters = parameters;
        double[] jacobian = {0.0};
        gaussNewtonEstimator.jacobian = jacobian;
        gaussNewtonEstimator.cols = -255;
        gaussNewtonEstimator.rows = -255;
        gaussNewtonEstimator.residuals = jacobian;
        gaussNewtonEstimator.cost = 0.0;
        setField(gaussNewtonEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations", -255);
        setField(gaussNewtonEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList parameters1 = new ArrayList();
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "parameters", parameters1);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", parameters1);
        
        org.apache.commons.math.estimation.WeightedMeasurement[] initialGaussNewtonEstimatorMeasurements = gaussNewtonEstimator.measurements;
        org.apache.commons.math.estimation.EstimatedParameter[] initialGaussNewtonEstimatorParameters = gaussNewtonEstimator.parameters;
        double[] initialGaussNewtonEstimatorJacobian = gaussNewtonEstimator.jacobian;
        double[] initialGaussNewtonEstimatorResiduals = gaussNewtonEstimator.residuals;
        
        gaussNewtonEstimator.initializeEstimate(simpleEstimationProblem);
        
        org.apache.commons.math.estimation.WeightedMeasurement[] finalGaussNewtonEstimatorMeasurements = gaussNewtonEstimator.measurements;
        org.apache.commons.math.estimation.EstimatedParameter[] finalGaussNewtonEstimatorParameters = gaussNewtonEstimator.parameters;
        double[] finalGaussNewtonEstimatorJacobian = gaussNewtonEstimator.jacobian;
        int finalGaussNewtonEstimatorCols = gaussNewtonEstimator.cols;
        int finalGaussNewtonEstimatorRows = gaussNewtonEstimator.rows;
        double[] finalGaussNewtonEstimatorResiduals = gaussNewtonEstimator.residuals;
        double finalGaussNewtonEstimatorCost = gaussNewtonEstimator.cost;
        int finalGaussNewtonEstimatorCostEvaluations = ((Integer) getFieldValue(gaussNewtonEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations"));
        int finalGaussNewtonEstimatorJacobianEvaluations = ((Integer) getFieldValue(gaussNewtonEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations"));
        
        assertFalse(initialGaussNewtonEstimatorMeasurements == finalGaussNewtonEstimatorMeasurements);
        
        assertFalse(initialGaussNewtonEstimatorParameters == finalGaussNewtonEstimatorParameters);
        
        assertFalse(initialGaussNewtonEstimatorJacobian == finalGaussNewtonEstimatorJacobian);
        
        assertFalse(initialGaussNewtonEstimatorResiduals == finalGaussNewtonEstimatorResiduals);
        
        assertEquals(0, finalGaussNewtonEstimatorCols);
        
        assertEquals(0, finalGaussNewtonEstimatorRows);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalGaussNewtonEstimatorCost, 1.0E-6);
        
        assertEquals(0, finalGaussNewtonEstimatorCostEvaluations);
        
        assertEquals(0, finalGaussNewtonEstimatorJacobianEvaluations);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method initializeEstimate(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#initializeEstimate(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getUnboundParameters()}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: parameters = problem.getUnboundParameters();
 *  */
    @Test
    public void testInitializeEstimate_ThrowArrayStoreException() throws Exception  {
        GaussNewtonEstimator gaussNewtonEstimator = ((GaussNewtonEstimator) createInstance("org.apache.commons.math.estimation.GaussNewtonEstimator"));
        setField(gaussNewtonEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations", -255);
        setField(gaussNewtonEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList parameters = new ArrayList();
        Object object = createInstance("java.lang.Object");
        parameters.add(object);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "parameters", parameters);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", parameters);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.initializeEstimate] produces [java.lang.ArrayStoreException: arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, org.apache.commons.math.estimation.WeightedMeasurement]
            java.base/java.util.ArrayList.toArray(ArrayList.java:401)
            org.apache.commons.math.estimation.SimpleEstimationProblem.getMeasurements(SimpleEstimationProblem.java:86)
            org.apache.commons.math.estimation.AbstractEstimator.initializeEstimate(AbstractEstimator.java:230) */
        gaussNewtonEstimator.initializeEstimate(simpleEstimationProblem);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#initializeEstimate(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: measurements = problem.getMeasurements();
 *  */
    @Test
    public void testInitializeEstimate_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "costEvaluations", -255);
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.initializeEstimate] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.initializeEstimate(AbstractEstimator.java:230) */
        levenbergMarquardtEstimator.initializeEstimate(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.getChiSquare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getChiSquare(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getChiSquare(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.returnsFrom {@code return chiSquare;}
 *  */
    @Test
    public void testGetChiSquare_EstimationProblemGetMeasurements() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList measurements = new ArrayList();
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", measurements);
        
        double actual = levenbergMarquardtEstimator.getChiSquare(simpleEstimationProblem);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getChiSquare(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getChiSquare(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WeightedMeasurement[] wm = problem.getMeasurements();
 *  */
    @Test
    public void testGetChiSquare_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.getChiSquare] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.getChiSquare(AbstractEstimator.java:142) */
        levenbergMarquardtEstimator.getChiSquare(null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getChiSquare(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < wm.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double residual = wm[i].getResidual();
 *  */
    @Test
    public void testGetChiSquare_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList measurements = new ArrayList();
        measurements.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", measurements);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.getChiSquare] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.getChiSquare(AbstractEstimator.java:145) */
        levenbergMarquardtEstimator.getChiSquare(simpleEstimationProblem);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.getRMS
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRMS(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getRMS(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 * @utbot.returnsFrom {@code return Math.sqrt(criterion / wm.length);}
 *  */
    @Test
    public void testGetRMS_MathSqrt() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList measurements = new ArrayList();
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", measurements);
        
        double actual = levenbergMarquardtEstimator.getRMS(simpleEstimationProblem);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRMS(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getRMS(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: WeightedMeasurement[] wm = problem.getMeasurements();
 *  */
    @Test
    public void testGetRMS_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.getRMS] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.getRMS(AbstractEstimator.java:127) */
        levenbergMarquardtEstimator.getRMS(null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getRMS(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < wm.length; ++i)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double residual = wm[i].getResidual();
 *  */
    @Test
    public void testGetRMS_ThrowNullPointerException_1() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList measurements = new ArrayList();
        measurements.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", measurements);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.getRMS] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.getRMS(AbstractEstimator.java:130) */
        levenbergMarquardtEstimator.getRMS(simpleEstimationProblem);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.estimation.AbstractEstimator.getCovariances
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCovariances(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getCovariances(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: updateJacobian();
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        GaussNewtonEstimator gaussNewtonEstimator = ((GaussNewtonEstimator) createInstance("org.apache.commons.math.estimation.GaussNewtonEstimator"));
        org.apache.commons.math.estimation.WeightedMeasurement[] measurements = {};
        gaussNewtonEstimator.measurements = measurements;
        double[] jacobian = {};
        gaussNewtonEstimator.jacobian = jacobian;
        gaussNewtonEstimator.rows = 1;
        setField(gaussNewtonEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.estimation.AbstractEstimator.updateJacobian(AbstractEstimator.java:76)
            org.apache.commons.math.estimation.AbstractEstimator.getCovariances(AbstractEstimator.java:162) */
        gaussNewtonEstimator.getCovariances(null);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getCovariances(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cols; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += jacobian[k + i] * jacobian[k + j];
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        double[] jacobian = {};
        levenbergMarquardtEstimator.jacobian = jacobian;
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList parameters = new ArrayList();
        parameters.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "parameters", parameters);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", parameters);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.estimation.AbstractEstimator.getCovariances(AbstractEstimator.java:173) */
        levenbergMarquardtEstimator.getCovariances(simpleEstimationProblem);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getCovariances(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < cols; ++i)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += jacobian[k + i] * jacobian[k + j];
 *  */
    @Test
    public void testGetCovariances_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        GaussNewtonEstimator gaussNewtonEstimator = ((GaussNewtonEstimator) createInstance("org.apache.commons.math.estimation.GaussNewtonEstimator"));
        double[] jacobian = {0.0};
        gaussNewtonEstimator.jacobian = jacobian;
        setField(gaussNewtonEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList parameters = new ArrayList();
        parameters.add(null);
        parameters.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "parameters", parameters);
        ArrayList measurements = new ArrayList();
        measurements.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", measurements);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.getCovariances] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.estimation.AbstractEstimator.getCovariances(AbstractEstimator.java:173) */
        gaussNewtonEstimator.getCovariances(simpleEstimationProblem);
    }
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getCovariances(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int rows = problem.getMeasurements().length;
 *  */
    @Test
    public void testGetCovariances_ThrowNullPointerException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        double[] jacobian = {};
        levenbergMarquardtEstimator.jacobian = jacobian;
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.getCovariances] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.AbstractEstimator.getCovariances(AbstractEstimator.java:165) */
        levenbergMarquardtEstimator.getCovariances(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCovariances(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
    @utbot.classUnderTest {@link AbstractEstimator}
 * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getCovariances(org.apache.commons.math.estimation.EstimationProblem)}
 * @utbot.invokes {@link org.apache.commons.math.estimation.AbstractEstimator#updateJacobian()}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getMeasurements()}
 * @utbot.invokes {@link org.apache.commons.math.estimation.EstimationProblem#getAllParameters()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(jTj).inverse().getData();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetCovariances_ThrowIllegalArgumentException() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        double[] jacobian = {};
        levenbergMarquardtEstimator.jacobian = jacobian;
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList parameters = new ArrayList();
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "parameters", parameters);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", parameters);
        
        levenbergMarquardtEstimator.getCovariances(simpleEstimationProblem);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getCovariances(org.apache.commons.math.estimation.EstimationProblem)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator}
     * @utbot.methodUnderTest {@link org.apache.commons.math.estimation.AbstractEstimator#getCovariances(org.apache.commons.math.estimation.EstimationProblem)}
     */
    @Test
    public void testGetCovariancesThrowsNPE() throws EstimationException  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = new LevenbergMarquardtEstimator();
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.getCovariances] produces [java.lang.NullPointerException]
            java.base/java.util.Arrays.fill(Arrays.java:3357)
            org.apache.commons.math.estimation.AbstractEstimator.updateJacobian(AbstractEstimator.java:74)
            org.apache.commons.math.estimation.AbstractEstimator.getCovariances(AbstractEstimator.java:162) */
        levenbergMarquardtEstimator.getCovariances(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCovariances(org.apache.commons.math.estimation.EstimationProblem)
    
    @Test
    public void testGetCovariances1() throws Exception  {
        LevenbergMarquardtEstimator levenbergMarquardtEstimator = ((LevenbergMarquardtEstimator) createInstance("org.apache.commons.math.estimation.LevenbergMarquardtEstimator"));
        double[] jacobian = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        levenbergMarquardtEstimator.jacobian = jacobian;
        setField(levenbergMarquardtEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", 1);
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList measurements = new ArrayList();
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", measurements);
        
        /* This test fails because method [org.apache.commons.math.estimation.AbstractEstimator.getCovariances] produces [java.lang.NullPointerException]
            org.apache.commons.math.estimation.SimpleEstimationProblem.getAllParameters(SimpleEstimationProblem.java:58)
            org.apache.commons.math.estimation.AbstractEstimator.getCovariances(AbstractEstimator.java:166) */
        levenbergMarquardtEstimator.getCovariances(simpleEstimationProblem);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getCovariances(org.apache.commons.math.estimation.EstimationProblem)
    
    @Test(expected = EstimationException.class)
    public void testGetCovariances2() throws Exception  {
        GaussNewtonEstimator gaussNewtonEstimator = ((GaussNewtonEstimator) createInstance("org.apache.commons.math.estimation.GaussNewtonEstimator"));
        double[] jacobian = {};
        gaussNewtonEstimator.jacobian = jacobian;
        gaussNewtonEstimator.rows = -2147483647;
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList parameters = new ArrayList();
        parameters.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "parameters", parameters);
        ArrayList measurements = new ArrayList();
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", measurements);
        
        gaussNewtonEstimator.getCovariances(simpleEstimationProblem);
    }
    
    @Test(expected = EstimationException.class)
    public void testGetCovariances3() throws Exception  {
        GaussNewtonEstimator gaussNewtonEstimator = ((GaussNewtonEstimator) createInstance("org.apache.commons.math.estimation.GaussNewtonEstimator"));
        double[] jacobian = {0.0, 0.0};
        gaussNewtonEstimator.jacobian = jacobian;
        gaussNewtonEstimator.rows = -2147483647;
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList parameters = new ArrayList();
        parameters.add(null);
        parameters.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "parameters", parameters);
        ArrayList measurements = new ArrayList();
        measurements.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", measurements);
        
        gaussNewtonEstimator.getCovariances(simpleEstimationProblem);
    }
    
    @Test(expected = EstimationException.class)
    public void testGetCovariances4() throws Exception  {
        GaussNewtonEstimator gaussNewtonEstimator = ((GaussNewtonEstimator) createInstance("org.apache.commons.math.estimation.GaussNewtonEstimator"));
        double[] jacobian = {0.0, 0.0, 0.0};
        gaussNewtonEstimator.jacobian = jacobian;
        gaussNewtonEstimator.rows = -2147483647;
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList parameters = new ArrayList();
        parameters.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "parameters", parameters);
        ArrayList measurements = new ArrayList();
        measurements.add(null);
        measurements.add(null);
        measurements.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", measurements);
        
        gaussNewtonEstimator.getCovariances(simpleEstimationProblem);
    }
    
    @Test(expected = EstimationException.class)
    public void testGetCovariances5() throws Exception  {
        GaussNewtonEstimator gaussNewtonEstimator = ((GaussNewtonEstimator) createInstance("org.apache.commons.math.estimation.GaussNewtonEstimator"));
        double[] jacobian = {0.0};
        gaussNewtonEstimator.jacobian = jacobian;
        setField(gaussNewtonEstimator, "org.apache.commons.math.estimation.AbstractEstimator", "jacobianEvaluations", -255);
        SimpleEstimationProblem simpleEstimationProblem = ((SimpleEstimationProblem) createInstance("org.apache.commons.math.estimation.SimpleEstimationProblem"));
        ArrayList parameters = new ArrayList();
        parameters.add(null);
        parameters.add(null);
        parameters.add(null);
        parameters.add(null);
        parameters.add(null);
        parameters.add(null);
        parameters.add(null);
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "parameters", parameters);
        ArrayList measurements = new ArrayList();
        setField(simpleEstimationProblem, "org.apache.commons.math.estimation.SimpleEstimationProblem", "measurements", measurements);
        
        gaussNewtonEstimator.getCovariances(simpleEstimationProblem);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields709389596884100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields709389596884100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass709389596889900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields709389596884100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass709389596889900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields709389597318000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields709389597318000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass709389597319600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields709389597318000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass709389597319600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

