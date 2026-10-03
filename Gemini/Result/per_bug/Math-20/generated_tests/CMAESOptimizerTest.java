package org.apache.commons.math3.optimization.direct;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CMAESOptimizerTest {

    // Sphere function f(x) = sum(x_i^2)
    private static final MultivariateFunction SPHERE = new MultivariateFunction() {
        public double value(double[] point) {
            double sum = 0;
            for (double v : point) {
                sum += v * v;
            }
            return sum;
        }
    };

    // Constant flat function to trigger flat fitness branches
    private static final MultivariateFunction CONSTANT = new MultivariateFunction() {
        public double value(double[] point) {
            return 42.0;
        }
    };

    @Test
    public void testOptimizeSphereMinimizeWithoutBounds() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.2, 0.2}, 100, 1e-6,
                true, 0, 0, new MersenneTwister(42), true);

        PointValuePair result = optimizer.optimize(1000, SPHERE, GoalType.MINIMIZE, new double[]{1.0, 1.0});

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-1);
        Assert.assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsFitnessHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsMeanHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testOptimizeSphereMaximize() {
        MultivariateFunction invertedSphere = new MultivariateFunction() {
            public double value(double[] point) {
                return - (point[0] * point[0] + point[1] * point[1]);
            }
        };

        CMAESOptimizer optimizer = new CMAESOptimizer(8, new double[]{0.5, 0.5}, 50, -1e-4,
                false, 0, 0, new MersenneTwister(13), false);

        PointValuePair result = optimizer.optimize(500, invertedSphere, GoalType.MAXIMIZE, new double[]{2.0, -2.0});
        Assert.assertNotNull(result);
        Assert.assertTrue(result.getValue() >= -0.5);
    }

    @Test
    public void testOptimizeWithBoundedDomainAndFeasibleRetries() {
        double[] lower = new double[]{0.5, 0.5};
        double[] upper = new double[]{2.0, 2.0};
        double[] init = new double[]{1.0, 1.0};
        double[] sigma = new double[]{0.3, 0.3};

        CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma, 50, 0.0,
                true, 0, 5, new MersenneTwister(42), false);

        PointValuePair result = optimizer.optimize(1000, SPHERE, GoalType.MINIMIZE, init, lower, upper);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.getPoint()[0] >= lower[0] - 1e-6);
        Assert.assertTrue(result.getPoint()[1] >= lower[1] - 1e-6);
        Assert.assertTrue(result.getPoint()[0] <= upper[0] + 1e-6);
        Assert.assertTrue(result.getPoint()[1] <= upper[1] + 1e-6);
    }

    @Test
    public void testDiagonalOnlyMode() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.3, 0.3}, 30, 1e-5,
                false, 1, 0, new MersenneTwister(42), false);

        PointValuePair result = optimizer.optimize(500, SPHERE, GoalType.MINIMIZE, new double[]{1.5, 1.5});
        Assert.assertNotNull(result);
    }

    @Test
    public void testDiagonalSwitchToFullCovariance() {
        // diagonalOnly > 1 and iterations will exceed diagonalOnly, triggering switch to full covariance
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.3, 0.3}, 20, 1e-6,
                false, 2, 0, new MersenneTwister(42), false);

        PointValuePair result = optimizer.optimize(500, SPHERE, GoalType.MINIMIZE, new double[]{1.0, 1.0});
        Assert.assertNotNull(result);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParametersMixedInfiniteAndFiniteBounds() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        double[] init = new double[]{1.0, 1.0};
        double[] lower = new double[]{0.0, Double.NEGATIVE_INFINITY};
        double[] upper = new double[]{2.0, 2.0};

        optimizer.optimize(100, SPHERE, GoalType.MINIMIZE, init, lower, upper);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckParametersInputSigmaDimensionMismatch() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.2, 0.2, 0.2});
        optimizer.optimize(100, SPHERE, GoalType.MINIMIZE, new double[]{1.0, 1.0});
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckParametersNegativeInputSigma() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{-0.1, 0.2});
        optimizer.optimize(100, SPHERE, GoalType.MINIMIZE, new double[]{1.0, 1.0});
    }

    @Test(expected = OutOfRangeException.class)
    public void testCheckParametersInputSigmaExceedsBoundaryRange() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{5.0, 0.1});
        double[] lower = new double[]{0.0, 0.0};
        double[] upper = new double[]{2.0, 2.0};
        optimizer.optimize(100, SPHERE, GoalType.MINIMIZE, new double[]{1.0, 1.0}, lower, upper);
    }

    @Test
    public void testAllInfiniteBoundsHandledAsNoBounds() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.2, 0.2}, 10, 0.0,
                true, 0, 0, new MersenneTwister(42), false);
        double[] lower = new double[]{Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        double[] upper = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};

        PointValuePair result = optimizer.optimize(200, SPHERE, GoalType.MINIMIZE, new double[]{1.0, 1.0}, lower, upper);
        Assert.assertNotNull(result);
    }

    @Test
    public void testDefaultConstructors() {
        CMAESOptimizer opt1 = new CMAESOptimizer();
        Assert.assertNotNull(opt1);
        CMAESOptimizer opt2 = new CMAESOptimizer(12);
        Assert.assertNotNull(opt2);
        CMAESOptimizer opt3 = new CMAESOptimizer(12, new double[]{0.1, 0.1});
        Assert.assertNotNull(opt3);
    }

    @Test
    public void testFlatFitnessFunctionAdjustsSigma() {
        // Runs against constant function to hit flat fitness branches
        CMAESOptimizer optimizer = new CMAESOptimizer(8, new double[]{0.1, 0.1}, 10, 0.0,
                true, 0, 0, new MersenneTwister(42), false);

        PointValuePair result = optimizer.optimize(300, CONSTANT, GoalType.MINIMIZE, new double[]{0.0, 0.0});
        Assert.assertEquals(42.0, result.getValue(), 1e-9);
    }

    @Test
    public void testEvaluationLimitBreaksGenerationLoop() {
        // Set max evaluations lower than evaluations needed for generation loop
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.2, 0.2}, 100, 0.0,
                true, 0, 0, new MersenneTwister(42), false);

        // Max evaluations = 15, lambda = 10 -> will break during second generation offspring evaluations
        PointValuePair result = optimizer.optimize(15, SPHERE, GoalType.MINIMIZE, new double[]{1.0, 1.0});
        Assert.assertNotNull(result);
    }

    @Test
    public void testCustomConvergenceChecker() {
        SimplePointChecker<PointValuePair> checker = new SimplePointChecker<PointValuePair>(1e-2, 1e-2);
        CMAESOptimizer optimizer = new CMAESOptimizer(8, new double[]{0.2, 0.2}, 100, 0.0,
                true, 0, 0, new MersenneTwister(42), false, checker);

        PointValuePair result = optimizer.optimize(500, SPHERE, GoalType.MINIMIZE, new double[]{0.5, 0.5});
        Assert.assertNotNull(result);
    }

    @Test
    public void testStopFitnessTermination() {
        // Set a reachable stopFitness threshold
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.2, 0.2}, 100, 0.5,
                true, 0, 0, new MersenneTwister(42), false);

        PointValuePair result = optimizer.optimize(1000, SPHERE, GoalType.MINIMIZE, new double[]{0.8, 0.8});
        Assert.assertTrue(result.getValue() <= 0.5);
    }

    @Test
    public void testBoundariesDecodingDefectEdgeCase() {
        // Math-20 specific regression scenario: bounded optimization with start point near boundary
        double[] lower = new double[]{-1.0, -1.0};
        double[] upper = new double[]{1.0, 1.0};
        double[] init = new double[]{0.5, 0.5};

        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.1, 0.1}, 20, 0.0,
                true, 0, 2, new MersenneTwister(123), false);

        PointValuePair result = optimizer.optimize(400, SPHERE, GoalType.MINIMIZE, init, lower, upper);
        double[] point = result.getPoint();
        Assert.assertTrue("Point[0] must be within upper bound", point[0] <= upper[0]);
        Assert.assertTrue("Point[0] must be within lower bound", point[0] >= lower[0]);
        Assert.assertTrue("Point[1] must be within upper bound", point[1] <= upper[1]);
        Assert.assertTrue("Point[1] must be within lower bound", point[1] >= lower[1]);
    }
}