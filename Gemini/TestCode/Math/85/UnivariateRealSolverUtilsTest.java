package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Comprehensive test suite for {@link UnivariateRealSolverUtils}.
 * Focuses on high Branch/Condition Coverage and Edge Cases.
 */
public class UnivariateRealSolverUtilsTest {

    // Simple continuous function f(x) = x
    private final UnivariateRealFunction identityFunction = new UnivariateRealFunction() {
        public double value(double x) {
            return x;
        }
    };

    // Quadratic function f(x) = x^2 - 4 (roots at -2 and 2)
    private final UnivariateRealFunction quadraticFunction = new UnivariateRealFunction() {
        public double value(double x) {
            return (x * x) - 4.0;
        }
    };

    // Constant positive function f(x) = 1.0 (no roots)
    private final UnivariateRealFunction constantPositiveFunction = new UnivariateRealFunction() {
        public double value(double x) {
            return 1.0;
        }
    };

    // ------------------------------------------------------------------------
    // Tests for solve(...)
    // ------------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSolveNullFunction() throws Exception {
        UnivariateRealSolverUtils.solve(null, 0.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveNullFunctionWithAccuracy() throws Exception {
        UnivariateRealSolverUtils.solve(null, 0.0, 1.0, 1e-6);
    }

    @Test
    public void testSolveValidFunction() throws Exception {
        SinFunction sin = new SinFunction();
        double root = UnivariateRealSolverUtils.solve(sin, 3.0, 4.0);
        Assert.assertEquals(Math.PI, root, 1e-4);
    }

    @Test
    public void testSolveValidFunctionWithAccuracy() throws Exception {
        SinFunction sin = new SinFunction();
        double root = UnivariateRealSolverUtils.solve(sin, 3.0, 4.0, 1e-8);
        Assert.assertEquals(Math.PI, root, 1e-8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveInvalidEndpoints() throws Exception {
        // f(1) * f(2) > 0 for f(x) = x (both positive)
        UnivariateRealSolverUtils.solve(identityFunction, 1.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveInvalidAccuracy() throws Exception {
        SinFunction sin = new SinFunction();
        // Negative or zero accuracy is invalid
        UnivariateRealSolverUtils.solve(sin, 3.0, 4.0, -1e-6);
    }

    // ------------------------------------------------------------------------
    // Tests for bracket(...) - Input Validation & Exceptions
    // ------------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testBracketNullFunction() throws Exception {
        UnivariateRealSolverUtils.bracket(null, 1.0, 0.0, 2.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketZeroMaxIterations() throws Exception {
        UnivariateRealSolverUtils.bracket(identityFunction, 1.0, 0.0, 2.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketNegativeMaxIterations() throws Exception {
        UnivariateRealSolverUtils.bracket(identityFunction, 1.0, 0.0, 2.0, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketInitialLessThanLowerBound() throws Exception {
        UnivariateRealSolverUtils.bracket(identityFunction, -1.0, 0.0, 2.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketInitialGreaterThanUpperBound() throws Exception {
        UnivariateRealSolverUtils.bracket(identityFunction, 3.0, 0.0, 2.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketLowerBoundEqualsUpperBound() throws Exception {
        UnivariateRealSolverUtils.bracket(identityFunction, 1.0, 1.0, 1.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracketLowerBoundGreaterThanUpperBound() throws Exception {
        UnivariateRealSolverUtils.bracket(identityFunction, 1.0, 2.0, 0.0, 10);
    }

    // ------------------------------------------------------------------------
    // Tests for bracket(...) - Execution Paths & Loop Coverage
    // ------------------------------------------------------------------------

    @Test
    public void testBracketSuccessDefaultMaxIterations() throws Exception {
        // Initial = 0.5, expands to a = -0.5, b = 1.5 -> f(a)=-0.5, f(b)=1.5 -> fa * fb < 0
        double[] result = UnivariateRealSolverUtils.bracket(identityFunction, 0.5, -10.0, 10.0);
        Assert.assertEquals(2, result.length);
        Assert.assertTrue(result[0] < 0.5);
        Assert.assertTrue(result[1] > 0.5);
        Assert.assertTrue(identityFunction.value(result[0]) * identityFunction.value(result[1]) <= 0.0);
    }

    @Test
    public void testBracketSuccessMultipleIterations() throws Exception {
        // Root of x^2 - 4 is at 2. Initial = 0.5 -> expands outwards until b > 2.0
        double[] result = UnivariateRealSolverUtils.bracket(quadraticFunction, 0.5, -5.0, 5.0, 10);
        Assert.assertEquals(2, result.length);
        Assert.assertTrue(result[0] <= 0.5);
        Assert.assertTrue(result[1] >= 0.5);
        Assert.assertTrue(quadraticFunction.value(result[0]) * quadraticFunction.value(result[1]) <= 0.0);
    }

    @Test
    public void testBracketHitLowerBoundFirst() throws Exception {
        // lowerBound is close (-0.5), upperBound is far (10.0)
        // a will hit lowerBound in 1st iteration (0.0 -> -0.5), b will keep expanding
        double[] result = UnivariateRealSolverUtils.bracket(identityFunction, 0.0, -0.5, 10.0, 5);
        Assert.assertEquals(-0.5, result[0], 1e-15);
        Assert.assertEquals(1.0, result[1], 1e-15);
        Assert.assertTrue(identityFunction.value(result[0]) * identityFunction.value(result[1]) <= 0.0);
    }

    @Test
    public void testBracketHitUpperBoundFirst() throws Exception {
        // upperBound is close (0.5), lowerBound is far (-10.0)
        // b will hit upperBound in 1st iteration (0.0 -> 0.5), a will keep expanding
        double[] result = UnivariateRealSolverUtils.bracket(identityFunction, 0.0, -10.0, 0.5, 5);
        Assert.assertEquals(-1.0, result[0], 1e-15);
        Assert.assertEquals(0.5, result[1], 1e-15);
        Assert.assertTrue(identityFunction.value(result[0]) * identityFunction.value(result[1]) <= 0.0);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracketExceedMaxIterations() throws Exception {
        // Needs multiple iterations to bracket root at 2, but maxIterations is 1
        UnivariateRealSolverUtils.bracket(quadraticFunction, 0.0, -5.0, 5.0, 1);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracketHitBothBoundsWithoutRoot() throws Exception {
        // Constant function has no root; bounds will be hit quickly
        UnivariateRealSolverUtils.bracket(constantPositiveFunction, 5.0, 4.0, 6.0, 10);
    }

    // ------------------------------------------------------------------------
    // Tests for midpoint(...)
    // ------------------------------------------------------------------------

    @Test
    public void testMidpoint() {
        Assert.assertEquals(2.5, UnivariateRealSolverUtils.midpoint(2.0, 3.0), 1e-15);
        Assert.assertEquals(0.0, UnivariateRealSolverUtils.midpoint(-2.0, 2.0), 1e-15);
        Assert.assertEquals(-3.0, UnivariateRealSolverUtils.midpoint(-4.0, -2.0), 1e-15);
        Assert.assertEquals(0.0, UnivariateRealSolverUtils.midpoint(0.0, 0.0), 1e-15);
    }
}