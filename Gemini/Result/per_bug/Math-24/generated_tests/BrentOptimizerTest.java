package org.apache.commons.math3.optimization.univariate;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.SinFunction;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit tests for {@link BrentOptimizer}.
 */
public class BrentOptimizerTest {

    private static final double MIN_REL_TOL = 2 * FastMath.ulp(1d);

    // =========================================================================
    // 1. Boundary & Constructor Exception Tests
    // =========================================================================

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelTooSmall() {
        new BrentOptimizer(MIN_REL_TOL - 1e-20, 1e-10);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsZero() {
        new BrentOptimizer(1e-10, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsNegative() {
        new BrentOptimizer(1e-10, -1.0);
    }

    @Test
    public void testConstructorBoundaryValid() {
        BrentOptimizer optimizer = new BrentOptimizer(MIN_REL_TOL, 1e-14);
        Assert.assertNotNull(optimizer);
    }

    // =========================================================================
    // 2. Goal Type & Bounds Inversion Tests
    // =========================================================================

    @Test
    public void testMinimizeQuadratic() {
        // f(x) = (x - 2)^2 + 3 -> minimum at x = 2, f(x) = 3
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 2.0) * (x - 2.0) + 3.0;
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 5.0, 0.5);

        Assert.assertEquals(2.0, result.getPoint(), 1e-6);
        Assert.assertEquals(3.0, result.getValue(), 1e-6);
    }

    @Test
    public void testMaximizeQuadratic() {
        // f(x) = -(x - 3)^2 + 10 -> maximum at x = 3, f(x) = 10
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return -((x - 3.0) * (x - 3.0)) + 10.0;
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MAXIMIZE, 0.0, 6.0, 1.0);

        Assert.assertEquals(3.0, result.getPoint(), 1e-6);
        Assert.assertEquals(10.0, result.getValue(), 1e-6);
    }

    @Test
    public void testInvertedBoundsLoGreaterThanHi() {
        // lo > hi (min=5.0, max=0.0) -> triggers a = hi, b = lo branch
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 1.5) * (x - 1.5);
            }
        };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 5.0, 0.0, 2.5);

        Assert.assertEquals(1.5, result.getPoint(), 1e-6);
    }

    // =========================================================================
    // 3. Convergence Checker & Early Exit Tests
    // =========================================================================

    @Test
    public void testCustomConvergenceChecker() {
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x;
            }
        };

        // Checker that stops after iteration 2
        ConvergenceChecker<UnivariatePointValuePair> checker =
                new ConvergenceChecker<UnivariatePointValuePair>() {
                    public boolean converged(int iteration,
                                             UnivariatePointValuePair previous,
                                             UnivariatePointValuePair current) {
                        return iteration >= 2;
                    }
                };

        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, -2.0, 2.0, 1.0);
        Assert.assertNotNull(result);
    }

    // =========================================================================
    // 4. Parabolic vs Golden Section & Point Update Branches
    // =========================================================================

    @Test
    public void testGoldenSectionBranchWithNonDifferentiableFunction() {
        // Non-smooth V-shape function: f(x) = |x - 2.7|
        // Parabolic steps often fail or get rejected, forcing Golden section steps
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.abs(x - 2.7);
            }
        };

        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariatePointValuePair result = optimizer.optimize(200, f, GoalType.MINIMIZE, 0.0, 5.0, 0.5);

        Assert.assertEquals(2.7, result.getPoint(), 1e-5);
    }

    @Test
    public void testStepNearBoundaryAndSmallStepCorrection() {
        // Minimum near upper boundary to trigger (b - u < tol2) and small step enforcement (d < tol1)
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 4.999999) * (x - 4.999999);
            }
        };

        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-10);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 5.0, 4.99);

        Assert.assertEquals(4.999999, result.getPoint(), 1e-4);
    }

    @Test
    public void testStepNearLowerBoundary() {
        // Minimum near lower boundary to trigger (u - a < tol2)
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 0.000001) * (x - 0.000001);
            }
        };

        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-10);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 5.0, 0.001);

        Assert.assertEquals(0.000001, result.getPoint(), 1e-4);
    }

    @Test
    public void testUpdatePointsMultiBranchCoverage() {
        // Polynomial with local structures triggering fu > fx and variations in fu <= fw / fu <= fv
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.cos(x) + 0.1 * x * x;
            }
        };

        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, -4.0, 4.0, 2.0);

        Assert.assertTrue(result.getPoint() > -4.0 && result.getPoint() < 4.0);
    }

    @Test
    public void testSinFunctionDefects4JMath24Regression() {
        // Specific scenario for Math-24: SinFunction on [3, 4] with startValue=3.5
        // Tests the final evaluated point vs best point selection
        UnivariateFunction f = new SinFunction();
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 3.0, 4.0, 3.5);

        // Minimum of sin(x) in [3, 4] is at 3 * pi / 2 ~ 4.71, so on [3, 4] it is at 4.0
        Assert.assertEquals(4.0, result.getPoint(), 1e-4);
    }
}