package org.apache.commons.math3.optimization.direct;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit tests for {@link CMAESOptimizer}.
 */
public class CMAESOptimizerTest {

    // Simple Sphere Function: f(x) = sum(x_i^2)
    private static final MultivariateFunction SPHERE = new MultivariateFunction() {
        @Override
        public double value(double[] point) {
            double sum = 0;
            for (double v : point) {
                sum += v * v;
            }
            return sum;
        }
    };

    // Constant flat function to trigger flat fitness branches
    private static final MultivariateFunction CONSTANT_FUN = new MultivariateFunction() {
        @Override
        public double value(double[] point) {
            return 42.0;
        }
    };

    @Test
    public void testConstructorsAndGetters() {
        CMAESOptimizer opt1 = new CMAESOptimizer();
        Assert.assertNotNull(opt1);

        CMAESOptimizer opt2 = new CMAESOptimizer(10);
        Assert.assertNotNull(opt2);

        double[] sigma = new double[] { 0.2, 0.2 };
        CMAESOptimizer opt3 = new CMAESOptimizer(10, sigma);
        Assert.assertNotNull(opt3);

        @SuppressWarnings("deprecation")
        CMAESOptimizer opt4 = new CMAESOptimizer(10, sigma, 100, 1e-4, true, 0, 0,
                new MersenneTwister(13), true);
        Assert.assertTrue(opt4.getStatisticsSigmaHistory().isEmpty());
        Assert.assertTrue(opt4.getStatisticsMeanHistory().isEmpty());
        Assert.assertTrue(opt4.getStatisticsFitnessHistory().isEmpty());
        Assert.assertTrue(opt4.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testOptimizeSphereMinimizeWithoutBounds() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10, new double[] { 0.5, 0.5 },
                2000, 1e-8, true, 0, 0, new MersenneTwister(42), false,
                new SimpleValueChecker(1e-6, 1e-6));

        double[] start = new double[] { 1.0, 1.0 };
        PointValuePair result = optimizer.optimize(10000, SPHERE, GoalType.MINIMIZE, start);

        Assert.assertEquals(0.0, result.getValue(), 1e-2);
        Assert.assertEquals(0.0, result.getPoint()[0], 1e-1);
        Assert.assertEquals(0.0, result.getPoint()[1], 1e-1);
    }

    @Test
    public void testOptimizeSphereMaximize() {
        MultivariateFunction invertedSphere = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return -(point[0] * point[0] + point[1] * point[1]);
            }
        };

        CMAESOptimizer optimizer = new CMAESOptimizer(8, new double[] { 0.5, 0.5 },
                1000, -1e-6, true, 0, 0, new MersenneTwister(42), false);

        double[] start = new double[] { 0.5, -0.5 };
        PointValuePair result = optimizer.optimize(5000, invertedSphere, GoalType.MAXIMIZE, start);

        Assert.assertEquals(0.0, result.getValue(), 1e-1);
    }

    @Test
    public void testOptimizeWithBoundedDomain() {
        double[] lower = new double[] { -2.0, -2.0 };
        double[] upper = new double[] { 2.0, 2.0 };
        double[] start = new double[] { 1.5, 1.5 };
        double[] sigma = new double[] { 0.5, 0.5 };

        CMAESOptimizer optimizer = new CMAESOptimizer(10, sigma, 1000, 1e-8,
                true, 0, 2, new MersenneTwister(123), true);

        PointValuePair result = optimizer.optimize(5000, SPHERE, GoalType.MINIMIZE, start, lower, upper);

        Assert.assertTrue(result.getValue() < 1e-2);
        Assert.assertTrue(result.getPoint()[0] >= lower[0] && result.getPoint()[0] <= upper[0]);
        Assert.assertTrue(result.getPoint()[1] >= lower[1] && result.getPoint()[1] <= upper[1]);

        // Check statistics populated
        Assert.assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsMeanHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsFitnessHistory().isEmpty());
        Assert.assertFalse(optimizer.getStatisticsDHistory().isEmpty());
    }

    @Test
    public void testOptimizeDiagonalOnlyAndSwitching() {
        // diagonalOnly > 1 switches back to full covariance when iterations > diagonalOnly
        double[] start = new double[] { 0.8, 0.8 };
        CMAESOptimizer optimizer = new CMAESOptimizer(8, new double[] { 0.3, 0.3 },
                200, 1e-6, false, 2, 0, new MersenneTwister(42), false);

        PointValuePair result = optimizer.optimize(3000, SPHERE, GoalType.MINIMIZE, start);
        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimizeDiagonalOnlyPermanent() {
        // diagonalOnly = 1 keeps diagonal covariance always
        double[] start = new double[] { 0.5, 0.5 };
        CMAESOptimizer optimizer = new CMAESOptimizer(8, new double[] { 0.2, 0.2 },
                100, 1e-6, false, 1, 0, new MersenneTwister(42), false);

        PointValuePair result = optimizer.optimize(2000, SPHERE, GoalType.MINIMIZE, start);
        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimizeNonActiveCMA() {
        double[] start = new double[] { 0.5, 0.5 };
        CMAESOptimizer optimizer = new CMAESOptimizer(8, new double[] { 0.2, 0.2 },
                200, 1e-6, false, 0, 0, new MersenneTwister(42), false);

        PointValuePair result = optimizer.optimize(2000, SPHERE, GoalType.MINIMIZE, start);
        Assert.assertNotNull(result);
    }

    @Test
    public void testFlatFitnessFunction() {
        double[] start = new double[] { 1.0, 2.0 };
        CMAESOptimizer optimizer = new CMAESOptimizer(6, new double[] { 0.2, 0.2 },
                20, 0.0, true, 0, 0, new MersenneTwister(42), false);

        PointValuePair result = optimizer.optimize(50, CONSTANT_FUN, GoalType.MINIMIZE, start);
        Assert.assertEquals(42.0, result.getValue(), 1e-9);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testTooManyEvaluations() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        optimizer.optimize(5, SPHERE, GoalType.MINIMIZE, new double[] { 1.0, 1.0 });
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testMixedFiniteAndInfiniteBounds() {
        double[] start = new double[] { 0.0, 0.0 };
        double[] lower = new double[] { -1.0, Double.NEGATIVE_INFINITY };
        double[] upper = new double[] { 1.0, 1.0 };

        CMAESOptimizer optimizer = new CMAESOptimizer(4);
        optimizer.optimize(100, SPHERE, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testBoundDifferenceOverflow() {
        double[] start = new double[] { 0.0 };
        double[] lower = new double[] { -Double.MAX_VALUE };
        double[] upper = new double[] { Double.MAX_VALUE };

        CMAESOptimizer optimizer = new CMAESOptimizer(4);
        optimizer.optimize(100, SPHERE, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testInputSigmaDimensionMismatch() {
        double[] start = new double[] { 0.0, 0.0 };
        double[] sigma = new double[] { 0.5 }; // length 1 != 2

        CMAESOptimizer optimizer = new CMAESOptimizer(4, sigma);
        optimizer.optimize(100, SPHERE, GoalType.MINIMIZE, start);
    }

    @Test(expected = NotPositiveException.class)
    public void testInputSigmaNegative() {
        double[] start = new double[] { 0.0, 0.0 };
        double[] sigma = new double[] { 0.5, -0.1 };

        CMAESOptimizer optimizer = new CMAESOptimizer(4, sigma);
        optimizer.optimize(100, SPHERE, GoalType.MINIMIZE, start);
    }

    @Test(expected = OutOfRangeException.class)
    public void testInputSigmaOutOfRangeBoundaries() {
        double[] start = new double[] { 0.0, 0.0 };
        double[] lower = new double[] { 0.0, 0.0 };
        double[] upper = new double[] { 1.0, 1.0 };
        double[] sigma = new double[] { 0.5, 2.0 }; // 2.0 > (1.0 - 0.0)

        CMAESOptimizer optimizer = new CMAESOptimizer(4, sigma);
        optimizer.optimize(100, SPHERE, GoalType.MINIMIZE, start, lower, upper);
    }

    @Test
    public void testEarlyConvergenceWithCustomChecker() {
        ConvergenceChecker<PointValuePair> immediateChecker = new ConvergenceChecker<PointValuePair>() {
            @Override
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                return iteration >= 2;
            }
        };

        CMAESOptimizer optimizer = new CMAESOptimizer(6, new double[] { 0.2, 0.2 },
                100, 0.0, true, 0, 0, new MersenneTwister(42), false, immediateChecker);

        PointValuePair res = optimizer.optimize(1000, SPHERE, GoalType.MINIMIZE, new double[] { 1.0, 1.0 });
        Assert.assertNotNull(res);
    }
}