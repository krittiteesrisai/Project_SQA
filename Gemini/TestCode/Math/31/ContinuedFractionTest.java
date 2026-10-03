package org.apache.commons.math3.util;

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Comprehensive Unit Tests for {@link ContinuedFraction} focusing on Branch Coverage
 * and Edge Cases.
 */
public class ContinuedFractionTest {

    /**
     * Test normal evaluation using Golden Ratio continued fraction:
     * a_0 = 1, a_n = 1, b_n = 1 for all n >= 1.
     * Evaluates all overloaded evaluate() methods.
     */
    @Test
    public void testGoldenRatioConvergenceAndOverloads() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                return 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                return 1.0;
            }
        };

        final double expectedGoldenRatio = 1.618033988749895;
        final double eps = 1e-8;

        // Test evaluate(x)
        double result1 = cf.evaluate(0.0);
        Assert.assertEquals(expectedGoldenRatio, result1, eps);

        // Test evaluate(x, epsilon)
        double result2 = cf.evaluate(0.0, 1e-5);
        Assert.assertEquals(expectedGoldenRatio, result2, 1e-4);

        // Test evaluate(x, maxIterations)
        double result3 = cf.evaluate(0.0, 50);
        Assert.assertEquals(expectedGoldenRatio, result3, eps);

        // Test evaluate(x, epsilon, maxIterations)
        double result4 = cf.evaluate(0.0, 1e-8, 100);
        Assert.assertEquals(expectedGoldenRatio, result4, eps);
    }

    /**
     * Test initial term hPrev == 0.0 to trigger Precision.equals(hPrev, 0.0, small).
     * e.g., tan(x) continued fraction or a simple fraction starting at 0.
     */
    @Test
    public void testZeroInitialTerm() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                if (n == 0) {
                    return 0.0;
                }
                return 2.0;
            }

            @Override
            protected double getB(int n, double x) {
                return 1.0;
            }
        };

        // Continues: 0 + 1 / (2 + 1 / (2 + ...)) = sqrt(2) - 1 ≈ 0.414213562373095
        double result = cf.evaluate(0.0, 1e-9, 50);
        Assert.assertEquals(FastMath.sqrt(2.0) - 1.0, result, 1e-7);
    }

    /**
     * Test maximum iterations exceeded branch (throws MaxCountExceededException).
     */
    @Test(expected = MaxCountExceededException.class)
    public void testMaxCountExceededException() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                return 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                return 1.0;
            }
        };

        // Only 1 iteration allowed, which is not enough to converge with epsilon 1e-12
        cf.evaluate(0.0, 1e-12, 1);
    }

    /**
     * Test NaN divergence branch when coefficients produce NaN.
     */
    @Test(expected = ConvergenceException.class)
    public void testNaNDivergence() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                return (n == 2) ? Double.NaN : 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                return 1.0;
            }
        };

        cf.evaluate(0.0, 1e-8, 10);
    }

    /**
     * Test Infinite scaling where scale <= 0 (throws ConvergenceException).
     */
    @Test(expected = ConvergenceException.class)
    public void testInfiniteScalingScaleNonPositiveThrows() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                return (n == 1) ? -Double.MAX_VALUE : -1.0;
            }

            @Override
            protected double getB(int n, double x) {
                return (n == 1) ? -Double.MAX_VALUE : -1.0;
            }
        };

        cf.evaluate(0.0, 1e-8, 10);
    }

    /**
     * Test Infinite scaling loop where a > b and a != 0.
     */
    @Test
    public void testInfiniteScalingBranchAGreaterThanB() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                if (n == 1) {
                    return Double.MAX_VALUE;
                }
                return 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                if (n == 1) {
                    return 1.0;
                }
                return 1.0;
            }
        };

        double result = cf.evaluate(0.0, 1e-5, 10);
        Assert.assertFalse(Double.isNaN(result));
    }

    /**
     * Test Infinite scaling loop where b >= a and b != 0.
     */
    @Test
    public void testInfiniteScalingBranchBGreaterThanA() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                if (n == 1) {
                    return 1.0;
                }
                return 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                if (n == 1) {
                    return Double.MAX_VALUE;
                }
                return 1.0;
            }
        };

        double result = cf.evaluate(0.0, 1e-5, 10);
        Assert.assertFalse(Double.isNaN(result));
    }

    /**
     * Test direct Infinity divergence throwing ConvergenceException.
     */
    @Test(expected = ConvergenceException.class)
    public void testDirectInfinityDivergence() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                return 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                if (n == 1) {
                    return Double.POSITIVE_INFINITY;
                }
                return 1.0;
            }
        };

        cf.evaluate(0.0, 1e-8, 10);
    }
}