package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Comprehensive test suite for {@link BaseSecantSolver}.
 */
public class BaseSecantSolverTest {

    /**
     * Concrete implementation for testing abstract BaseSecantSolver.
     */
    private static class ConcreteSecantSolver extends BaseSecantSolver {
        ConcreteSecantSolver(final double absoluteAccuracy, final Method method) {
            super(absoluteAccuracy, method);
        }

        ConcreteSecantSolver(final double relativeAccuracy,
                             final double absoluteAccuracy,
                             final Method method) {
            super(relativeAccuracy, absoluteAccuracy, method);
        }

        ConcreteSecantSolver(final double relativeAccuracy,
                             final double absoluteAccuracy,
                             final double functionValueAccuracy,
                             final Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }
    }

    // Common Test Functions
    private static final UnivariateRealFunction LINEAR = new UnivariateRealFunction() {
        public double value(double x) {
            return 2.0 * x - 4.0; // Root at x = 2.0
        }
    };

    private static final UnivariateRealFunction CUBIC = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x * x - x - 2.0; // Root near x ≈ 1.5213797
        }
    };

    private static final UnivariateRealFunction EXP_MINUS_TWO = new UnivariateRealFunction() {
        public double value(double x) {
            return FastMath.exp(x) - 2.0; // Root at x = ln(2) ≈ 0.69314718
        }
    };

    @Test
    public void testConstructorsAndGetters() {
        ConcreteSecantSolver s1 = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        Assert.assertEquals(1e-6, s1.getAbsoluteAccuracy(), 1e-15);

        ConcreteSecantSolver s2 = new ConcreteSecantSolver(1e-10, 1e-6, BaseSecantSolver.Method.PEGASUS);
        Assert.assertEquals(1e-10, s2.getRelativeAccuracy(), 1e-15);
        Assert.assertEquals(1e-6, s2.getAbsoluteAccuracy(), 1e-15);

        ConcreteSecantSolver s3 = new ConcreteSecantSolver(1e-10, 1e-6, 1e-8, BaseSecantSolver.Method.REGULA_FALSI);
        Assert.assertEquals(1e-10, s3.getRelativeAccuracy(), 1e-15);
        Assert.assertEquals(1e-6, s3.getAbsoluteAccuracy(), 1e-15);
        Assert.assertEquals(1e-8, s3.getFunctionValueAccuracy(), 1e-15);
    }

    @Test
    public void testExactRootAtLowerBound() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        // Root is exactly at min = 2.0
        double root = solver.solve(100, LINEAR, 2.0, 5.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    @Test
    public void testExactRootAtUpperBound() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.PEGASUS);
        // Root is exactly at max = 2.0
        double root = solver.solve(100, LINEAR, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    @Test
    public void testExactRootDuringIteration() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.REGULA_FALSI);
        // Linear function step from [1, 5] lands directly on x = 2.0 where fx == 0.0
        double root = solver.solve(100, LINEAR, 1.0, 5.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    @Test
    public void testMethodsIllinoisAndPegasusConvergence() {
        BaseSecantSolver illinois = new ConcreteSecantSolver(1e-14, 1e-8, BaseSecantSolver.Method.ILLINOIS);
        double rootIll = illinois.solve(100, CUBIC, 1.0, 3.0);
        Assert.assertEquals(1.5213797068, rootIll, 1e-6);

        BaseSecantSolver pegasus = new ConcreteSecantSolver(1e-14, 1e-8, BaseSecantSolver.Method.PEGASUS);
        double rootPeg = pegasus.solve(100, CUBIC, 1.0, 3.0);
        Assert.assertEquals(1.5213797068, rootPeg, 1e-6);
    }

    @Test
    public void testSolveOverloads() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        
        // 4-param solve (min, max, startValue)
        double r1 = solver.solve(100, EXP_MINUS_TWO, 0.0, 2.0, 0.5);
        Assert.assertEquals(FastMath.log(2.0), r1, 1e-5);

        // 5-param solve (min, max, startValue, allowedSolution)
        double r2 = solver.solve(100, EXP_MINUS_TWO, 0.0, 2.0, 0.5, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.log(2.0), r2, 1e-5);

        // 4-param solve (min, max, allowedSolution)
        double r3 = solver.solve(100, EXP_MINUS_TWO, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.log(2.0), r3, 1e-5);
    }

    @Test
    public void testAllowedSolutionsWithIntervalAccuracy() {
        // High ftol precision ensures stopping via interval accuracy (atol/rtol)
        double atol = 1e-4;
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-15, atol, 1e-15, BaseSecantSolver.Method.ILLINOIS);
        double exactRoot = FastMath.log(2.0);

        // ANY_SIDE
        double rAny = solver.solve(100, EXP_MINUS_TWO, 0.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(exactRoot, rAny, atol);

        // LEFT_SIDE <= exact root
        double rLeft = solver.solve(100, EXP_MINUS_TWO, 0.0, 2.0, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(rLeft <= exactRoot);

        // RIGHT_SIDE >= exact root
        double rRight = solver.solve(100, EXP_MINUS_TWO, 0.0, 2.0, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(rRight >= exactRoot);

        // BELOW_SIDE -> f(x) <= 0
        double rBelow = solver.solve(100, EXP_MINUS_TWO, 0.0, 2.0, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(EXP_MINUS_TWO.value(rBelow) <= 0.0);

        // ABOVE_SIDE -> f(x) >= 0
        double rAbove = solver.solve(100, EXP_MINUS_TWO, 0.0, 2.0, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(EXP_MINUS_TWO.value(rAbove) >= 0.0);
    }

    @Test
    public void testAllowedSolutionsWithFunctionValueAccuracy() {
        // Setting a loose ftol so it triggers FastMath.abs(f1) <= ftol early
        double ftol = 1e-2;
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-15, 1e-15, ftol, BaseSecantSolver.Method.ILLINOIS);

        // Test each branch under ftol stop condition
        double rAny = solver.solve(100, CUBIC, 1.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertTrue(FastMath.abs(CUBIC.value(rAny)) <= ftol);

        double rLeft = solver.solve(100, CUBIC, 1.0, 2.0, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(FastMath.abs(CUBIC.value(rLeft)) <= ftol);

        double rRight = solver.solve(100, CUBIC, 1.0, 2.0, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(FastMath.abs(CUBIC.value(rRight)) <= ftol);

        double rBelow = solver.solve(100, CUBIC, 1.0, 2.0, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(CUBIC.value(rBelow) <= 0.0 || FastMath.abs(CUBIC.value(rBelow)) <= ftol);

        double rAbove = solver.solve(100, CUBIC, 1.0, 2.0, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(CUBIC.value(rAbove) >= 0.0 || FastMath.abs(CUBIC.value(rAbove)) <= ftol);
    }

    @Test(expected = NoBracketingException.class)
    public void testNoBracketingExceptionSameSign() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        // CUBIC values on [2.0, 3.0] are both positive (4.0 and 22.0)
        solver.solve(100, CUBIC, 2.0, 3.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testInvalidIntervalMinGreaterThanMax() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, CUBIC, 3.0, 1.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testMaxEvaluationsExceeded() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-15, 1e-15, BaseSecantSolver.Method.ILLINOIS);
        // Only 2 evaluations allowed; cannot converge
        solver.solve(2, CUBIC, 1.0, 3.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NullArgumentException.class)
    public void testNullFunction() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, null, 1.0, 3.0, AllowedSolution.ANY_SIDE);
    }
}