package org.apache.commons.math.optimization.general;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTest {

    // Concrete implementation สำหรับทดสอบ Abstract Class
    private static class DummyOptimizer extends AbstractLeastSquaresOptimizer {
        private boolean triggerUpdateResiduals = false;
        private boolean triggerUpdateJacobian = false;

        @Override
        protected VectorialPointValuePair doOptimize() throws FunctionEvaluationException, OptimizationException {
            if (triggerUpdateResiduals) {
                updateResidualsAndCost();
            }
            if (triggerUpdateJacobian) {
                updateJacobian();
            }
            return new VectorialPointValuePair(point, objective, cost);
        }

        // Expose protected methods & fields for testing
        public void testIncrementIterationsCounter() throws OptimizationException {
            incrementIterationsCounter();
        }

        public void testUpdateJacobian() throws FunctionEvaluationException {
            updateJacobian();
        }

        public void testUpdateResidualsAndCost() throws FunctionEvaluationException {
            updateResidualsAndCost();
        }

        public double[][] getJacobianInternal() {
            return jacobian;
        }

        public double[] getResidualsInternal() {
            return residuals;
        }

        public double getCostInternal() {
            return cost;
        }
    }

    private DummyOptimizer optimizer;

    @Before
    public void setUp() {
        optimizer = new DummyOptimizer();
    }

    @Test
    public void testDefaultConfiguration() {
        Assert.assertEquals(AbstractLeastSquaresOptimizer.DEFAULT_MAX_ITERATIONS, optimizer.getMaxIterations());
        Assert.assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        Assert.assertEquals(0, optimizer.getIterations());
        Assert.assertEquals(0, optimizer.getEvaluations());
        Assert.assertEquals(0, optimizer.getJacobianEvaluations());
        Assert.assertNotNull(optimizer.getConvergenceChecker());

        // Setter & Getter tests
        optimizer.setMaxIterations(50);
        Assert.assertEquals(50, optimizer.getMaxIterations());

        optimizer.setMaxEvaluations(100);
        Assert.assertEquals(100, optimizer.getMaxEvaluations());

        SimpleVectorialValueChecker checker = new SimpleVectorialValueChecker(1e-4, 1e-4);
        optimizer.setConvergenceChecker(checker);
        Assert.assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testIncrementIterationsCounterSuccessAndExceeded() {
        optimizer.setMaxIterations(2);

        try {
            optimizer.testIncrementIterationsCounter();
            Assert.assertEquals(1, optimizer.getIterations());
            optimizer.testIncrementIterationsCounter();
            Assert.assertEquals(2, optimizer.getIterations());
        } catch (OptimizationException e) {
            Assert.fail("Should not fail before exceeding maxIterations");
        }

        try {
            optimizer.testIncrementIterationsCounter();
            Assert.fail("Expected OptimizationException on iteration > maxIterations");
        } catch (OptimizationException e) {
            Assert.assertEquals(3, optimizer.getIterations());
        }
    }

    @Test(expected = OptimizationException.class)
    public void testOptimizeDimensionMismatchTargetAndWeights() throws Exception {
        DifferentiableMultivariateVectorialFunction func = createMockFunction(new double[]{1.0}, new double[][]{{1.0}});
        double[] target = new double[]{1.0, 2.0};
        double[] weights = new double[]{1.0}; // length mismatch
        double[] startPoint = new double[]{0.0};

        optimizer.optimize(func, target, weights, startPoint);
    }

    @Test
    public void testUpdateResidualsAndCostSuccess() throws Exception {
        DifferentiableMultivariateVectorialFunction func = createMockFunction(
                new double[]{2.0, 3.0},
                new double[][]{{1.0}, {1.0}}
        );
        double[] target = new double[]{4.0, 7.0};
        double[] weights = new double[]{1.0, 4.0};
        double[] startPoint = new double[]{0.0};

        optimizer.optimize(func, target, weights, startPoint);
        optimizer.testUpdateResidualsAndCost();

        // residual_0 = 4.0 - 2.0 = 2.0; residual_1 = 7.0 - 3.0 = 4.0
        // cost = sqrt(1.0 * (2.0^2) + 4.0 * (4.0^2)) = sqrt(4 + 64) = sqrt(68)
        double[] residuals = optimizer.getResidualsInternal();
        Assert.assertEquals(2.0, residuals[0], 1e-10);
        Assert.assertEquals(4.0, residuals[1], 1e-10);
        Assert.assertEquals(Math.sqrt(68.0), optimizer.getCostInternal(), 1e-10);
        Assert.assertEquals(1, optimizer.getEvaluations());
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsMaxEvaluationsExceeded() throws Exception {
        DifferentiableMultivariateVectorialFunction func = createMockFunction(new double[]{1.0}, new double[][]{{1.0}});
        optimizer.setMaxEvaluations(1);

        optimizer.optimize(func, new double[]{1.0}, new double[]{1.0}, new double[]{0.0});
        optimizer.testUpdateResidualsAndCost(); // 1st evaluation
        optimizer.testUpdateResidualsAndCost(); // 2nd evaluation -> Exceeded
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateResidualsDimensionMismatch() throws Exception {
        // Return 2 values while rows is 1
        DifferentiableMultivariateVectorialFunction func = createMockFunction(new double[]{1.0, 2.0}, new double[][]{{1.0}});
        optimizer.optimize(func, new double[]{1.0}, new double[]{1.0}, new double[]{0.0});
        optimizer.testUpdateResidualsAndCost();
    }

    @Test
    public void testUpdateJacobianSuccess() throws Exception {
        DifferentiableMultivariateVectorialFunction func = createMockFunction(
                new double[]{0.0, 0.0},
                new double[][]{{2.0, 3.0}, {4.0, 5.0}}
        );
        double[] target = new double[]{1.0, 1.0};
        double[] weights = new double[]{4.0, 9.0}; // sqrt = 2, 3 -> factors = -2, -3
        double[] startPoint = new double[]{0.0, 0.0};

        optimizer.optimize(func, target, weights, startPoint);
        optimizer.testUpdateJacobian();

        double[][] jac = optimizer.getJacobianInternal();
        Assert.assertEquals(2.0 * -2.0, jac[0][0], 1e-10);
        Assert.assertEquals(3.0 * -2.0, jac[0][1], 1e-10);
        Assert.assertEquals(4.0 * -3.0, jac[1][0], 1e-10);
        Assert.assertEquals(5.0 * -3.0, jac[1][1], 1e-10);
        Assert.assertEquals(1, optimizer.getJacobianEvaluations());
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testUpdateJacobianDimensionMismatch() throws Exception {
        // Target rows = 2, but Jacobian matrix has only 1 row
        DifferentiableMultivariateVectorialFunction func = createMockFunction(
                new double[]{1.0, 2.0},
                new double[][]{{1.0}}
        );
        optimizer.optimize(func, new double[]{1.0, 2.0}, new double[]{1.0, 1.0}, new double[]{0.0});
        optimizer.testUpdateJacobian();
    }

    @Test
    public void testRMSAndChiSquare() throws Exception {
        DifferentiableMultivariateVectorialFunction func = createMockFunction(
                new double[]{1.0, 2.0},
                new double[][]{{1.0}, {1.0}}
        );
        double[] target = new double[]{3.0, 6.0}; // residuals = [2.0, 4.0]
        double[] weights = new double[]{2.0, 0.5};
        double[] startPoint = new double[]{0.0};

        optimizer.optimize(func, target, weights, startPoint);
        optimizer.testUpdateResidualsAndCost();

        // RMS = sqrt((2^2 * 2.0 + 4^2 * 0.5) / 2) = sqrt((8 + 8) / 2) = sqrt(8)
        Assert.assertEquals(Math.sqrt(8.0), optimizer.getRMS(), 1e-10);

        // ChiSquare = 2^2 / 2.0 + 4^2 / 0.5 = 4 / 2.0 + 16 / 0.5 = 2 + 32 = 34.0
        Assert.assertEquals(34.0, optimizer.getChiSquare(), 1e-10);
    }

    @Test
    public void testGetCovariancesSuccess() throws Exception {
        // Orthogonal jacobian
        DifferentiableMultivariateVectorialFunction func = createMockFunction(
                new double[]{0.0, 0.0},
                new double[][]{{1.0, 0.0}, {0.0, 1.0}}
        );
        double[] target = new double[]{0.0, 0.0};
        double[] weights = new double[]{1.0, 1.0};
        double[] startPoint = new double[]{0.0, 0.0};

        optimizer.optimize(func, target, weights, startPoint);

        double[][] covar = optimizer.getCovariances();
        Assert.assertEquals(2, covar.length);
        Assert.assertEquals(1.0, covar[0][0], 1e-10);
        Assert.assertEquals(0.0, covar[0][1], 1e-10);
        Assert.assertEquals(0.0, covar[1][0], 1e-10);
        Assert.assertEquals(1.0, covar[1][1], 1e-10);
    }

    @Test(expected = OptimizationException.class)
    public void testGetCovariancesSingularMatrix() throws Exception {
        // Colinear jacobian columns -> Singular Matrix
        DifferentiableMultivariateVectorialFunction func = createMockFunction(
                new double[]{0.0, 0.0},
                new double[][]{{1.0, 1.0}, {2.0, 2.0}}
        );
        double[] target = new double[]{0.0, 0.0};
        double[] weights = new double[]{1.0, 1.0};
        double[] startPoint = new double[]{0.0, 0.0};

        optimizer.optimize(func, target, weights, startPoint);
        optimizer.getCovariances();
    }

    @Test(expected = OptimizationException.class)
    public void testGuessParametersErrorsNoDegreesOfFreedom() throws Exception {
        // rows <= cols (rows = 2, cols = 2)
        DifferentiableMultivariateVectorialFunction func = createMockFunction(
                new double[]{0.0, 0.0},
                new double[][]{{1.0, 0.0}, {0.0, 1.0}}
        );
        optimizer.optimize(func, new double[]{0.0, 0.0}, new double[]{1.0, 1.0}, new double[]{0.0, 0.0});
        optimizer.guessParametersErrors();
    }

    @Test
    public void testGuessParametersErrorsSuccess() throws Exception {
        // rows = 3, cols = 2 (rows > cols)
        final double[][] jData = new double[][]{
                {1.0, 0.0},
                {0.0, 1.0},
                {1.0, 1.0}
        };
        DifferentiableMultivariateVectorialFunction func = createMockFunction(
                new double[]{1.0, 1.0, 1.0},
                jData
        );
        double[] target = new double[]{2.0, 3.0, 4.0}; // residuals = [1.0, 2.0, 3.0]
        double[] weights = new double[]{1.0, 1.0, 1.0};
        double[] startPoint = new double[]{0.0, 0.0};

        optimizer.optimize(func, target, weights, startPoint);
        optimizer.testUpdateResidualsAndCost();

        double[] errors = optimizer.guessParametersErrors();
        Assert.assertNotNull(errors);
        Assert.assertEquals(2, errors.length);
        Assert.assertTrue(errors[0] > 0);
        Assert.assertTrue(errors[1] > 0);
    }

    // Helper method เพื่อสร้าง Function และ Jacobian จำลองโดยไม่ต้องพึ่งพา Mockito
    private DifferentiableMultivariateVectorialFunction createMockFunction(
            final double[] valueToReturn,
            final double[][] jacobianToReturn) {

        return new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return valueToReturn;
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return jacobianToReturn;
                    }
                };
            }
        };
    }
}