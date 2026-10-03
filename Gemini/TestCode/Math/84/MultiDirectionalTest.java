package org.apache.commons.math.optimization.direct;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxEvaluationsExceededException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealConvergenceChecker;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.SimpleScalarValueChecker;
import org.junit.Assert;
import org.junit.Test;

public class MultiDirectionalTest {

    // -------------------------------------------------------------------------
    // Test Functions
    // -------------------------------------------------------------------------

    /** 2D Rosenbrock function: f(x, y) = 100*(y - x^2)^2 + (1 - x)^2 */
    private static class RosenbrockFunction implements MultivariateRealFunction {
        public double value(double[] point) {
            double x = point[0];
            double y = point[1];
            return 100.0 * Math.pow(y - x * x, 2) + Math.pow(1.0 - x, 2);
        }
    }

    /** 2D Sphere/Paraboloid function: f(x, y) = x^2 + y^2 */
    private static class SphereFunction implements MultivariateRealFunction {
        public double value(double[] point) {
            double sum = 0;
            for (double v : point) {
                sum += v * v;
            }
            return sum;
        }
    }

    /** Linear Downhill function along direction (1, 1, ...): f(x) = -(x_0 + x_1 + ...) */
    private static class LinearDownhillFunction implements MultivariateRealFunction {
        public double value(double[] point) {
            double sum = 0;
            for (double v : point) {
                sum += v;
            }
            return -sum; // Minimizing this encourages continuous expansion
        }
    }

    /** Constant function: f(x) = C (all points evaluate equally) */
    private static class ConstantFunction implements MultivariateRealFunction {
        private final double constant;
        public ConstantFunction(double constant) {
            this.constant = constant;
        }
        public double value(double[] point) {
            return constant;
        }
    }

    // -------------------------------------------------------------------------
    // Constructors & Basic Properties
    // -------------------------------------------------------------------------

    @Test
    public void testDefaultConstructor() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(1000);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1e-6, 1e-6));

        RealPointValuePair result = optimizer.optimize(
            new SphereFunction(), GoalType.MINIMIZE, new double[] { 1.0, 1.0 }
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-2);
    }

    @Test
    public void testCustomCoefficientsConstructor() throws Exception {
        // Custom khi (expansion = 3.0) and gamma (contraction = 0.25)
        MultiDirectional optimizer = new MultiDirectional(3.0, 0.25);
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(1000);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1e-6, 1e-6));

        RealPointValuePair result = optimizer.optimize(
            new SphereFunction(), GoalType.MINIMIZE, new double[] { 2.0, -2.0 }
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-2);
    }

    // -------------------------------------------------------------------------
    // Branch Coverage: Reflection & Expansion Logic
    // -------------------------------------------------------------------------

    /**
     * Branch 1a: Reflected is better than best, but Expanded is not better than Reflected.
     * (comparator.compare(reflected, expanded) <= 0) -> Accept reflected simplex.
     */
    @Test
    public void testReflectionBetterThanBestAndBetterThanExpansion() throws Exception {
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        optimizer.setMaxIterations(50);
        optimizer.setMaxEvaluations(500);

        // A function with a sharp local minimum right at the reflection step
        MultivariateRealFunction f = new MultivariateRealFunction() {
            public double value(double[] point) {
                // Optimal around (-1, -1)
                return Math.pow(point[0] + 1.0, 2) + Math.pow(point[1] + 1.0, 2);
            }
        };

        optimizer.setStartConfiguration(new double[] { 1.0, 1.0 });
        RealPointValuePair result = optimizer.optimize(f, GoalType.MINIMIZE, new double[] { 0.0, 0.0 });
        Assert.assertTrue(result.getValue() < 1.0);
    }

    /**
     * Branch 1b: Reflected is better than best, and Expanded is strictly better than Reflected.
     * (comparator.compare(reflected, expanded) > 0) -> Accept expanded simplex.
     */
    @Test
    public void testExpansionBetterThanReflection() throws Exception {
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        optimizer.setMaxIterations(10);
        optimizer.setMaxEvaluations(100);

        // Linear downhill guarantees expanding will always produce a strictly smaller value
        RealPointValuePair result = optimizer.optimize(
            new LinearDownhillFunction(), GoalType.MINIMIZE, new double[] { 0.0, 0.0 }
        );

        Assert.assertNotNull(result);
        Assert.assertTrue("Function value should decrease", result.getValue() < 0.0);
    }

    /**
     * Branch 2: Reflected is worse than best, but Contracted is better than best.
     * (comparator.compare(contracted, best) < 0) -> Accept contracted simplex.
     */
    @Test
    public void testContractionBetterThanBest() throws Exception {
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(500);

        // Starting at (10, 10) with large step will overshoot in reflection, forcing contraction
        optimizer.setStartConfiguration(new double[] { 50.0, 50.0 });
        RealPointValuePair result = optimizer.optimize(
            new SphereFunction(), GoalType.MINIMIZE, new double[] { 5.0, 5.0 }
        );

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getValue() < 50.0);
    }

    /**
     * GoalType: MAXIMIZE coverage to verify comparator inversion.
     */
    @Test
    public void testMaximizeGoal() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(1000);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1e-6, 1e-6));

        MultivariateRealFunction invertedSphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                return -(point[0] * point[0] + point[1] * point[1]);
            }
        };

        RealPointValuePair result = optimizer.optimize(
            invertedSphere, GoalType.MAXIMIZE, new double[] { 1.0, 1.0 }
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-2);
    }

    // -------------------------------------------------------------------------
    // Edge Cases, Boundaries, and Fault Triggers
    // -------------------------------------------------------------------------

    /**
     * Branch 3 / Fault condition (Math-84):
     * Constant function where neither Reflection nor Contraction improves over best.
     * Optimizer must not enter an infinite loop; it should throw MaxIterationsExceededException or MaxEvaluationsExceededException.
     */
    @Test
    public void testConstantFunctionTermination() {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(20);
        optimizer.setMaxEvaluations(100);

        try {
            optimizer.optimize(new ConstantFunction(42.0), GoalType.MINIMIZE, new double[] { 1.0, 1.0 });
            // If convergence checker stops it cleanly or max limits stop it, both are valid exits
        } catch (OptimizationException e) {
            Assert.assertTrue(e instanceof MaxIterationsExceededException || e instanceof MaxEvaluationsExceededException);
        } catch (FunctionEvaluationException e) {
            Assert.fail("Unexpected FunctionEvaluationException: " + e.getMessage());
        }
    }

    @Test(expected = OptimizationException.class)
    public void testMaxIterationsExceeded() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        // Extremely low iteration limit
        optimizer.setMaxIterations(1);
        optimizer.setMaxEvaluations(1000);
        optimizer.optimize(new RosenbrockFunction(), GoalType.MINIMIZE, new double[] { -1.2, 1.0 });
    }

    @Test(expected = OptimizationException.class)
    public void testMaxEvaluationsExceeded() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(1000);
        // Extremely low evaluations limit (less than simplex initialization requires)
        optimizer.setMaxEvaluations(2);
        optimizer.optimize(new SphereFunction(), GoalType.MINIMIZE, new double[] { 1.0, 1.0, 1.0 });
    }

    @Test
    public void testOneDimensionalOptimization() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(500);

        MultivariateRealFunction f1D = new MultivariateRealFunction() {
            public double value(double[] point) {
                return (point[0] - 3.0) * (point[0] - 3.0);
            }
        };

        RealPointValuePair result = optimizer.optimize(f1D, GoalType.MINIMIZE, new double[] { 0.0 });
        Assert.assertEquals(3.0, result.getPoint()[0], 1e-2);
        Assert.assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test
    public void testRosenbrockOptimization() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(2000);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1e-4, 1e-4));

        RealPointValuePair result = optimizer.optimize(
            new RosenbrockFunction(), GoalType.MINIMIZE, new double[] { -1.2, 1.0 }
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(1.0, result.getPoint()[0], 1e-1);
        Assert.assertEquals(1.0, result.getPoint()[1], 1e-1);
    }

    @Test
    public void testCustomConvergenceChecker() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(50);
        optimizer.setMaxEvaluations(500);

        // Always converges on second iteration
        RealConvergenceChecker customChecker = new RealConvergenceChecker() {
            public boolean converged(int iteration, RealPointValuePair previous, RealPointValuePair current) {
                return iteration >= 2;
            }
        };
        optimizer.setConvergenceChecker(customChecker);

        RealPointValuePair result = optimizer.optimize(
            new SphereFunction(), GoalType.MINIMIZE, new double[] { 5.0, 5.0 }
        );

        Assert.assertNotNull(result);
        Assert.assertTrue(optimizer.getIterations() <= 3);
    }

    @Test(expected = NullPointerException.class)
    public void testNullFunctionThrowsException() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.optimize(null, GoalType.MINIMIZE, new double[] { 1.0 });
    }

    @Test(expected = NullPointerException.class)
    public void testNullStartPointThrowsException() throws Exception {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.optimize(new SphereFunction(), GoalType.MINIMIZE, null);
    }
}