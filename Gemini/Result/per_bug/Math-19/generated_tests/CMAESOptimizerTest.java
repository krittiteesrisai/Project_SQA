package org.apache.commons.math3.optimization.direct;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimplePointChecker;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.junit.Assert;
import org.junit.Test;

public class CMAESOptimizerTest {

    // Sphere function: f(x) = sum(x_i^2)
    private static final MultivariateFunction SPHERE = new MultivariateFunction() {
        public double value(double[] point) {
            double sum = 0.0;
            for (double v : point) {
                sum += v * v;
            }
            return sum;
        }
    };

    // Linear function: f(x) = sum(x_i)
    private static final MultivariateFunction LINEAR = new MultivariateFunction() {
        public double value(double[] point) {
            double sum = 0.0;
            for (double v : point) {
                sum += v;
            }
            return sum;
        }
    };

    @Test
    public void testConstructors() {
        CMAESOptimizer opt1 = new CMAESOptimizer();
        Assert.assertNotNull(opt1);

        CMAESOptimizer opt2 = new CMAESOptimizer(10);
        Assert.assertNotNull(opt2);

        CMAESOptimizer opt3 = new CMAESOptimizer(10, new double[]{0.2});
        Assert.assertNotNull(opt3);

        @SuppressWarnings("deprecation")
        CMAESOptimizer opt4 = new CMAESOptimizer(
                10, new double[]{0.2}, 100, 1e-6,
                true, 0, 0, new MersenneTwister(42L), false);
        Assert.assertNotNull(opt4);

        CMAESOptimizer opt5 = new CMAESOptimizer(
                10, new double[]{0.2}, 100, 1e-6,
                true, 0, 0, new MersenneTwister(42L), true,
                new SimpleValueChecker(1e-3, 1e-3));
        Assert.assertNotNull(opt5);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParametersMixedInfiniteAndFiniteBounds() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        double[] start = new double[]{1.0, 1.0};
        double[] lower = new double[]{0.0, Double.NEGATIVE_INFINITY};
        double[] upper = new double[]{2.0, Double.POSITIVE_INFINITY};

        optimizer.optimize(200, SPHERE, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testCheckParametersInputSigmaDimensionMismatch() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.1});
        double[] start = new double[]{1.0, 2.0};
        double[] lower = new double[]{-5.0, -5.0};
        double[] upper = new double[]{5.0, 5.0};

        optimizer.optimize(200, SPHERE, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test(expected = NotPositiveException.class)
    public void testCheckParametersNegativeInputSigma() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{-0.5, 0.5});
        double[] start = new double[]{1.0, 1.0};
        double[] lower = new double[]{-5.0, -5.0};
        double[] upper = new double[]{5.0, 5.0};

        optimizer.optimize(200, SPHERE, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test(expected = OutOfRangeException.class)
    public void testCheckParametersInputSigmaExceedsBoundaryRange() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{15.0, 0.5});
        double[] start = new double[]{1.0, 1.0};
        double[] lower = new double[]{0.0, 0.0};
        double[] upper = new double[]{10.0, 10.0}; // range is 10.0 < 15.0

        optimizer.optimize(200, SPHERE, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test
    public void testOptimizeUnboundedMinimize() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[]{0.3, 0.3});
        double[] start = new double[]{2.0, -2.0};
        double[] lower = new double[]{Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        double[] upper = new double[]{Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};

        PointValuePair result = optimizer.optimize(3000, SPHERE, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertEquals(0.0, result.getValue(), 1e-1);
    }

    @Test
    public void testOptimizeBoundedMinimizeWithActiveCMAAndStatistics() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5, 0.5}, 500, 1e-4,
                true, 0, 2, new MersenneTwister(42L), true,
                new SimpleValueChecker(1e-3, 1e-3));

        double[] start = new double[]{1.5, 1.5};
        double[] lower = new double[]{0.0, 0.0};
        double[] upper = new double[]{3.0, 3.0};

        PointValuePair result = optimizer.optimize(1500, SPHERE, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertTrue(result.getValue() <= 1.0);
        Assert.assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsFitnessHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsMeanHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testOptimizeBoundedMaximizeWithoutActiveCMA() {
        // Negated sphere for maximization: maximum at [0, 0]
        MultivariateFunction negSphere = new MultivariateFunction() {
            public double value(double[] point) {
                return -SPHERE.value(point);
            }
        };

        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.3, 0.3}, 500, -1e-4,
                false, 0, 0, new MersenneTwister(42L), false,
                new SimpleValueChecker(1e-3, 1e-3));

        double[] start = new double[]{1.0, -1.0};
        double[] lower = new double[]{-2.0, -2.0};
        double[] upper = new double[]{2.0, 2.0};

        PointValuePair result = optimizer.optimize(1500, negSphere, GoalType.MAXIMIZE, start, lower, upper);
        Assert.assertTrue(result.getValue() >= -0.5);
    }

    @Test
    public void testOptimizeDiagonalOnlyConstant() {
        // diagonalOnly = 1 (keeps covariance diagonal)
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5, 0.5}, 500, 1e-4,
                true, 1, 0, new MersenneTwister(42L), false,
                new SimpleValueChecker(1e-3, 1e-3));

        double[] start = new double[]{2.0, 2.0};
        double[] lower = new double[]{-5.0, -5.0};
        double[] upper = new double[]{5.0, 5.0};

        PointValuePair result = optimizer.optimize(1000, SPHERE, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertTrue(result.getValue() < 1.0);
    }

    @Test
    public void testOptimizeDiagonalOnlySwitching() {
        // diagonalOnly = 2 (switches from diagonal to full covariance after 2 iterations)
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5, 0.5}, 500, 1e-4,
                true, 2, 0, new MersenneTwister(42L), false,
                new SimpleValueChecker(1e-3, 1e-3));

        double[] start = new double[]{2.0, 2.0};
        double[] lower = new double[]{-5.0, -5.0};
        double[] upper = new double[]{5.0, 5.0};

        PointValuePair result = optimizer.optimize(1000, SPHERE, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertTrue(result.getValue() < 1.0);
    }

    @Test
    public void testOptimizeStopFitnessTriggered() {
        // stopFitness set to 0.5, optimization should terminate early
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5, 0.5}, 500, 0.5,
                true, 0, 0, new MersenneTwister(42L), false,
                null);

        double[] start = new double[]{2.0, 2.0};
        double[] lower = new double[]{-5.0, -5.0};
        double[] upper = new double[]{5.0, 5.0};

        PointValuePair result = optimizer.optimize(1000, SPHERE, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertTrue(result.getValue() <= 0.5);
    }

    @Test
    public void testOptimizeTooManyEvaluationsHandling() {
        // Very low max evaluations: generationLoop catches TooManyEvaluationsException and breaks cleanly
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.5, 0.5}, 500, 0,
                true, 0, 0, new MersenneTwister(42L), false,
                null);

        double[] start = new double[]{3.0, 3.0};
        double[] lower = new double[]{-5.0, -5.0};
        double[] upper = new double[]{5.0, 5.0};

        PointValuePair result = optimizer.optimize(12, SPHERE, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimizeWithConvergenceChecker() {
        ConvergenceChecker<PointValuePair> customChecker = new SimplePointChecker<PointValuePair>(1e-1, 1e-1);
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, new double[]{0.2, 0.2}, 200, 0,
                true, 0, 0, new MersenneTwister(42L), false,
                customChecker);

        double[] start = new double[]{0.5, 0.5};
        double[] lower = new double[]{-2.0, -2.0};
        double[] upper = new double[]{2.0, 2.0};

        PointValuePair result = optimizer.optimize(500, SPHERE, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertNotNull(result);
    }

    @Test
    public void testBoundaryRepairAndFeasibility() {
        // Start near boundary and force search to hit boundaries and trigger repair & penalty
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, new double[]{0.8}, 200, 0,
                true, 0, 5, new MersenneTwister(42L), false,
                new SimpleValueChecker(1e-3, 1e-3));

        double[] start = new double[]{4.5};
        double[] lower = new double[]{0.0};
        double[] upper = new double[]{5.0};

        PointValuePair result = optimizer.optimize(1000, LINEAR, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertTrue(result.getPoint()[0] >= 0.0 && result.getPoint()[0] <= 5.0);
    }
}