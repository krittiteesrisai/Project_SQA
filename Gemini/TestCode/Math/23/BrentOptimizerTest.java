package org.apache.commons.math3.optimization.univariate;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.SinFunction;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * High branch/condition coverage tests for BrentOptimizer.
 */
public class BrentOptimizerTest {

    private static final double MIN_REL_TOL = 2 * FastMath.ulp(1d);

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelativeThresholdTooSmall() {
        new BrentOptimizer(MIN_REL_TOL - 1e-20, 1e-8);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsoluteThresholdZero() {
        new BrentOptimizer(1e-10, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsoluteThresholdNegative() {
        new BrentOptimizer(1e-10, -1e-8);
    }

    @Test
    public void testConstructorValidWithDefaultChecker() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-8);
        Assert.assertNotNull(optimizer);
        Assert.assertNull(optimizer.getConvergenceChecker());
    }

    @Test
    public void testOptimizeSinFunctionMinimization() {
        UnivariateFunction f = new SinFunction();
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        // Interval containing minimum at 3*pi/2 (~4.71238898)
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 4.0, 5.0, 4.5);
        Assert.assertEquals(3.0 * Math.PI / 2.0, result.getPoint(), 1e-8);
        Assert.assertEquals(-1.0, result.getValue(), 1e-8);
    }

    @Test
    public void testOptimizeSinFunctionMaximization() {
        UnivariateFunction f = new SinFunction();
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        // Interval containing maximum at pi/2 (~1.5707963)
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MAXIMIZE, 1.0, 2.0, 1.5);
        Assert.assertEquals(Math.PI / 2.0, result.getPoint(), 1e-8);
        Assert.assertEquals(1.0, result.getValue(), 1e-8);
    }

    @Test
    public void testInvertedIntervalMinMax() {
        // lo > hi branch trigger
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        // min=5.0, max=0.0 (inverted boundaries)
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 5.0, 0.0, 2.5);
        Assert.assertEquals(2.0, result.getPoint(), 1e-8);
        Assert.assertEquals(0.0, result.getValue(), 1e-8);
    }

    @Test
    public void testCustomConvergenceCheckerEarlyStop() {
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 3.0) * (x - 3.0) + 1.0;
            }
        };

        ConvergenceChecker<UnivariatePointValuePair> earlyChecker = new ConvergenceChecker<UnivariatePointValuePair>() {
            @Override
            public boolean converged(int iteration, UnivariatePointValuePair previous, UnivariatePointValuePair current) {
                // Terminate early at iteration >= 2
                return iteration >= 2;
            }
        };

        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, earlyChecker);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 6.0, 1.0);
        Assert.assertNotNull(result);
        Assert.assertTrue(optimizer.getIterations() <= 3);
    }

    @Test
    public void testImmediateConvergenceInitialPointOptimal() {
        // Interval where initial guess already satisfies stopping criterion
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return x * x;
            }
        };
        // Very wide tolerance causing immediate stop (previous == null branch in best())
        BrentOptimizer optimizer = new BrentOptimizer(1e-2, 2.0);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, -0.1, 0.1, 0.0);
        Assert.assertEquals(0.0, result.getPoint(), 1e-5);
    }

    @Test
    public void testParabolicStepNearBoundary() {
        // Forces parabola fit step near the boundaries to trigger u - a < tol2 / b - u < tol2
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return Math.pow(x - 0.001, 2);
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-10);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 1.0, 0.002);
        Assert.assertEquals(0.001, result.getPoint(), 1e-5);
    }

    @Test
    public void testComplexFunctionWithMultipleBranchUpdates() {
        // Non-symmetric function triggering alternative update branches (fu > fx, w==x, v==w updates)
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                if (x < 0) {
                    return -x;
                } else if (x == 0) {
                    return 0;
                } else {
                    return x * x * (x - 2.0) + Math.cos(x);
                }
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariatePointValuePair resultMin = optimizer.optimize(100, f, GoalType.MINIMIZE, -1.0, 3.0, 0.5);
        Assert.assertNotNull(resultMin);

        UnivariatePointValuePair resultMax = optimizer.optimize(100, f, GoalType.MAXIMIZE, 0.0, 2.0, 0.2);
        Assert.assertNotNull(resultMax);
    }

    @Test
    public void testBestPointSelectedWhenPreviousIsBetter() {
        // Defects4J Math-23 core regression test: ensures best() returns the lowest value
        // even if the last iteration produced a slightly worse step
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                if (x < 0) {
                    return 0;
                }
                return Math.sin(x);
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariatePointValuePair result = optimizer.optimize(200, f, GoalType.MINIMIZE, -0.5, 3.0, 0.0);
        Assert.assertTrue(result.getValue() <= 0.0);
    }
}