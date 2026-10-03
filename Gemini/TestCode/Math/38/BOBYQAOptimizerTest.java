package org.apache.commons.math.optimization.direct;

import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class BOBYQAOptimizerTest {

    private static final double TOLERANCE = 1e-4;

    // 1. Boundary & Dimension Exception Tests

    @Test(expected = NumberIsTooSmallException.class)
    public void testDimensionTooSmall() {
        // Dimension = 1 (< MINIMUM_PROBLEM_DIMENSION which is 2)
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(3);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        optimizer.optimize(100, f, GoalType.MINIMIZE, new double[]{1.0}, new double[]{-10.0}, new double[]{10.0});
    }

    @Test(expected = OutOfRangeException.class)
    public void testInterpolationPointsTooSmall() {
        // Dimension = 2, lower bound interval = n + 2 = 4. Passing npt = 3
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(3);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        optimizer.optimize(100, f, GoalType.MINIMIZE, new double[]{1.0, 1.0}, new double[]{-10.0, -10.0}, new double[]{10.0, 10.0});
    }

    @Test(expected = OutOfRangeException.class)
    public void testInterpolationPointsTooLarge() {
        // Dimension = 2, upper bound interval = (n + 1)(n + 2) / 2 = 6. Passing npt = 7
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(7);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        optimizer.optimize(100, f, GoalType.MINIMIZE, new double[]{1.0, 1.0}, new double[]{-10.0, -10.0}, new double[]{10.0, 10.0});
    }

    // 2. Bound Differences & Radius Adjustment Tests

    @Test
    public void testTightBoundDifferenceAdjustment() {
        // minDiff < 2 * initialTrustRegionRadius triggers radius adjustment
        // Default radius = 10.0 -> requiredMinDiff = 20.0
        // Set bounds diff = 5.0 -> radius becomes 5.0 / 3.0
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 1.0) * (point[0] - 1.0) + (point[1] - 1.0) * (point[1] - 1.0);
            }
        };
        RealPointValuePair result = optimizer.optimize(
                500, f, GoalType.MINIMIZE,
                new double[]{0.5, 0.5},
                new double[]{0.0, 0.0},
                new double[]{5.0, 5.0}
        );
        Assert.assertEquals(0.0, result.getValue(), TOLERANCE);
        Assert.assertEquals(1.0, result.getPoint()[0], TOLERANCE);
        Assert.assertEquals(1.0, result.getPoint()[1], TOLERANCE);
    }

    // 3. Start Point Boundary Adjustments (Lower & Upper Differences branches)

    @Test
    public void testStartPointAtLowerBound() {
        // Start point == lowerBound triggers lowerDifference >= 0 branch in bobyqa()
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        RealPointValuePair result = optimizer.optimize(
                500, f, GoalType.MINIMIZE,
                new double[]{0.0, 0.0},
                new double[]{0.0, 0.0},
                new double[]{10.0, 10.0}
        );
        Assert.assertEquals(0.0, result.getValue(), TOLERANCE);
    }

    @Test
    public void testStartPointNearLowerBound() {
        // Start point close to lowerBound (lowerDifference >= -initialTrustRegionRadius && < 0)
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6, 2.0, 1e-8);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 2.0) * (point[0] - 2.0) + (point[1] - 2.0) * (point[1] - 2.0);
            }
        };
        RealPointValuePair result = optimizer.optimize(
                500, f, GoalType.MINIMIZE,
                new double[]{1.0, 1.0},
                new double[]{0.0, 0.0},
                new double[]{10.0, 10.0}
        );
        Assert.assertEquals(0.0, result.getValue(), TOLERANCE);
    }

    @Test
    public void testStartPointAtUpperBound() {
        // Start point == upperBound triggers upperDifference <= 0 branch in bobyqa()
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 5.0) * (point[0] - 5.0) + (point[1] - 5.0) * (point[1] - 5.0);
            }
        };
        RealPointValuePair result = optimizer.optimize(
                500, f, GoalType.MINIMIZE,
                new double[]{10.0, 10.0},
                new double[]{0.0, 0.0},
                new double[]{10.0, 10.0}
        );
        Assert.assertEquals(0.0, result.getValue(), TOLERANCE);
    }

    @Test
    public void testStartPointNearUpperBound() {
        // Start point close to upperBound (upperDifference <= initialTrustRegionRadius && > 0)
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6, 2.0, 1e-8);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 5.0) * (point[0] - 5.0) + (point[1] - 5.0) * (point[1] - 5.0);
            }
        };
        RealPointValuePair result = optimizer.optimize(
                500, f, GoalType.MINIMIZE,
                new double[]{9.0, 9.0},
                new double[]{0.0, 0.0},
                new double[]{10.0, 10.0}
        );
        Assert.assertEquals(0.0, result.getValue(), TOLERANCE);
    }

    // 4. Maximize Goal Type Optimization

    @Test
    public void testMaximizeGoal() {
        // Tests isMinimize = false branch
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                // Inverted paraboloid with max at (2, 3) and value = 10
                return 10.0 - (point[0] - 2.0) * (point[0] - 2.0) - (point[1] - 3.0) * (point[1] - 3.0);
            }
        };
        RealPointValuePair result = optimizer.optimize(
                500, f, GoalType.MAXIMIZE,
                new double[]{0.0, 0.0},
                new double[]{-10.0, -10.0},
                new double[]{10.0, 10.0}
        );
        Assert.assertEquals(10.0, result.getValue(), TOLERANCE);
        Assert.assertEquals(2.0, result.getPoint()[0], TOLERANCE);
        Assert.assertEquals(3.0, result.getPoint()[1], TOLERANCE);
    }

    // 5. Multi-dimensional / Higher NPT (Quadratic Interpolation branches)

    @Test
    public void testHigherDimensionOptimization() {
        // Dimension = 4, npt = 9 (between 4+2=6 and 5*6/2=15)
        int dim = 4;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(9);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                double sum = 0;
                for (int i = 0; i < point.length; i++) {
                    sum += (point[i] - (i + 1)) * (point[i] - (i + 1));
                }
                return sum;
            }
        };
        double[] start = new double[]{0, 0, 0, 0};
        double[] lower = new double[]{-5, -5, -5, -5};
        double[] upper = new double[]{10, 10, 10, 10};

        RealPointValuePair result = optimizer.optimize(1000, f, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertEquals(0.0, result.getValue(), TOLERANCE);
        for (int i = 0; i < dim; i++) {
            Assert.assertEquals((double) (i + 1), result.getPoint()[i], TOLERANCE);
        }
    }

    // 6. Minimum NPT configuration (n + 2)

    @Test
    public void testMinimumInterpolationPoints() {
        // Dimension = 3, npt = 5 (n + 2)
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 1.0) * (point[0] - 1.0)
                        + (point[1] - 2.0) * (point[1] - 2.0)
                        + (point[2] - 3.0) * (point[2] - 3.0);
            }
        };
        RealPointValuePair result = optimizer.optimize(
                500, f, GoalType.MINIMIZE,
                new double[]{0.0, 0.0, 0.0},
                new double[]{-10.0, -10.0, -10.0},
                new double[]{10.0, 10.0, 10.0}
        );
        Assert.assertEquals(0.0, result.getValue(), TOLERANCE);
        Assert.assertEquals(1.0, result.getPoint()[0], TOLERANCE);
        Assert.assertEquals(2.0, result.getPoint()[1], TOLERANCE);
        Assert.assertEquals(3.0, result.getPoint()[2], TOLERANCE);
    }
}