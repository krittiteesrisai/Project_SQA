package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Comprehensive test suite for BaseSecantSolver to achieve high Branch/Condition Coverage
 * and catch edge-case faults.
 */
public class BaseSecantSolverTest {

    /**
     * Concrete helper implementation of BaseSecantSolver for testing.
     */
    private static class ConcreteSecantSolver extends BaseSecantSolver {
        protected ConcreteSecantSolver(final double absoluteAccuracy, final Method method) {
            super(absoluteAccuracy, method);
        }

        protected ConcreteSecantSolver(final double relativeAccuracy,
                                       final double absoluteAccuracy,
                                       final Method method) {
            super(relativeAccuracy, absoluteAccuracy, method);
        }

        protected ConcreteSecantSolver(final double relativeAccuracy,
                                       final double absoluteAccuracy,
                                       final double functionValueAccuracy,
                                       final Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }
    }

    // -------------------------------------------------------------------------
    // 1. Boundary & Exact Root Tests (f0 == 0.0, f1 == 0.0, fx == 0.0)
    // -------------------------------------------------------------------------

    @Test
    public void testRootAtMinBoundary() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        // Root is exactly at min (2.0)
        double root = solver.solve(100, f, 2.0, 5.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    @Test
    public void testRootAtMaxBoundary() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.PEGASUS);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 5.0;
            }
        };
        // Root is exactly at max (5.0)
        double root = solver.solve(100, f, 2.0, 5.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(5.0, root, 1e-15);
    }

    @Test
    public void testRootCalculatedExactlyDuringIteration() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.REGULA_FALSI);
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x - 4.0;
            }
        };
        // Root is at x = 2.0. With linear function, the first secant step lands exactly on 2.0
        double root = solver.solve(100, f, 0.0, 4.0);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    // -------------------------------------------------------------------------
    // 2. Algorithm Methods (ILLINOIS, PEGASUS, REGULA_FALSI)
    // -------------------------------------------------------------------------

    @Test
    public void testIllinoisMethod() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-10, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new QuinticFunction();
        double root = solver.solve(200, f, -0.2, 0.3, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(0.0, root, 1e-8);
    }

    @Test
    public void testPegasusMethod() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-10, BaseSecantSolver.Method.PEGASUS);
        UnivariateRealFunction f = new QuinticFunction();
        double root = solver.solve(200, f, -0.2, 0.3, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(0.0, root, 1e-8);
    }

    @Test
    public void testRegulaFalsiMethod() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-10, BaseSecantSolver.Method.REGULA_FALSI);
        UnivariateRealFunction f = new QuinticFunction();
        double root = solver.solve(200, f, -0.2, 0.3, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(0.0, root, 1e-8);
    }

    // -------------------------------------------------------------------------
    // 3. AllowedSolution Strategies Coverage
    // -------------------------------------------------------------------------

    @Test
    public void testAllowedSolutionLeftSide() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        double root = solver.solve(100, f, 3.0, 4.0, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(root <= FastMath.PI);
        Assert.assertEquals(FastMath.PI, root, 1e-6);
    }

    @Test
    public void testAllowedSolutionRightSide() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        double root = solver.solve(100, f, 3.0, 4.0, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(root >= FastMath.PI);
        Assert.assertEquals(FastMath.PI, root, 1e-6);
    }

    @Test
    public void testAllowedSolutionBelowSide() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        // Over [3, 4], sin(x) decreases from positive to negative through pi
        double root = solver.solve(100, f, 3.0, 4.0, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(f.value(root) <= 0.0);
        Assert.assertEquals(FastMath.PI, root, 1e-6);
    }

    @Test
    public void testAllowedSolutionAboveSide() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        double root = solver.solve(100, f, 3.0, 4.0, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(f.value(root) >= 0.0);
        Assert.assertEquals(FastMath.PI, root, 1e-6);
    }

    @Test
    public void testAllowedSolutionWithFunctionValueAccuracyStop() {
        // High ftol to trigger stopping on function value tolerance early
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-14, 1e-14, 1e-2, BaseSecantSolver.Method.PEGASUS);
        UnivariateRealFunction f = new SinFunction();

        double rootLeft = solver.solve(100, f, 3.0, 4.0, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(rootLeft <= FastMath.PI);

        double rootRight = solver.solve(100, f, 3.0, 4.0, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(rootRight >= FastMath.PI);

        double rootBelow = solver.solve(100, f, 3.0, 4.0, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(f.value(rootBelow) <= 0.0);

        double rootAbove = solver.solve(100, f, 3.0, 4.0, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(f.value(rootAbove) >= 0.0);
    }

    // -------------------------------------------------------------------------
    // 4. Constructors & Overloaded solve() Method Signatures
    // -------------------------------------------------------------------------

    @Test
    public void testConstructorsAndSolveSignatures() {
        UnivariateRealFunction f = new SinFunction();

        // 1-arg constructor
        BaseSecantSolver s1 = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double r1 = s1.solve(100, f, 3.0, 4.0, 3.5);
        Assert.assertEquals(FastMath.PI, r1, 1e-5);

        // 2-args constructor
        BaseSecantSolver s2 = new ConcreteSecantSolver(1e-10, 1e-6, BaseSecantSolver.Method.PEGASUS);
        double r2 = s2.solve(100, f, 3.0, 4.0, 3.2, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.PI, r2, 1e-5);

        // 3-args constructor
        BaseSecantSolver s3 = new ConcreteSecantSolver(1e-10, 1e-6, 1e-6, BaseSecantSolver.Method.REGULA_FALSI);
        double r3 = s3.solve(100, f, 3.0, 4.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.PI, r3, 1e-5);
    }

    // -------------------------------------------------------------------------
    // 5. Invalid States, Boundary Limits & Exceptions
    // -------------------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testNullFunction() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, null, 1.0, 2.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testInvalidEndpointsMinGreaterThanMax() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        solver.solve(100, f, 4.0, 3.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NoBracketingException.class)
    public void testNoBracketingException() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        UnivariateRealFunction f = new SinFunction();
        // Over [1.0, 2.0], sin(x) is strictly positive -> no sign change
        solver.solve(100, f, 1.0, 2.0, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testExceedMaxEvaluations() {
        BaseSecantSolver solver = new ConcreteSecantSolver(1e-15, 1e-15, BaseSecantSolver.Method.REGULA_FALSI);
        UnivariateRealFunction f = new QuinticFunction();
        // Give only 2 evaluations (minimum required for setup) so it immediately throws
        solver.solve(2, f, -0.2, 0.3, AllowedSolution.ANY_SIDE);
    }
}