package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage Unit Tests for {@link BaseSecantSolver}.
 */
public class BaseSecantSolverTest {

    /**
     * Concrete implementation for testing the abstract BaseSecantSolver.
     */
    private static class DummySecantSolver extends BaseSecantSolver {
        protected DummySecantSolver(final double absoluteAccuracy, final Method method) {
            super(absoluteAccuracy, method);
        }

        protected DummySecantSolver(final double relativeAccuracy,
                                    final double absoluteAccuracy,
                                    final Method method) {
            super(relativeAccuracy, absoluteAccuracy, method);
        }

        protected DummySecantSolver(final double relativeAccuracy,
                                    final double absoluteAccuracy,
                                    final double functionValueAccuracy,
                                    final Method method) {
            super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, method);
        }
    }

    // --- 1. Constructor and Accuracy Tests ---

    @Test
    public void testConstructors() {
        DummySecantSolver s1 = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        Assert.assertEquals(1e-6, s1.getAbsoluteAccuracy(), 1e-15);

        DummySecantSolver s2 = new DummySecantSolver(1e-14, 1e-6, BaseSecantSolver.Method.PEGASUS);
        Assert.assertEquals(1e-14, s2.getRelativeAccuracy(), 1e-15);
        Assert.assertEquals(1e-6, s2.getAbsoluteAccuracy(), 1e-15);

        DummySecantSolver s3 = new DummySecantSolver(1e-14, 1e-6, 1e-10, BaseSecantSolver.Method.REGULA_FALSI);
        Assert.assertEquals(1e-14, s3.getRelativeAccuracy(), 1e-15);
        Assert.assertEquals(1e-6, s3.getAbsoluteAccuracy(), 1e-15);
        Assert.assertEquals(1e-10, s3.getFunctionValueAccuracy(), 1e-15);
    }

    // --- 2. Exact Boundary Roots & Immediate Hits ---

    @Test
    public void testExactRootAtMinBound() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        DummySecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double root = solver.solve(100, f, 2.0, 5.0, AllowedSolution.LEFT_SIDE);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    @Test
    public void testExactRootAtMaxBound() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 5.0;
            }
        };
        DummySecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        double root = solver.solve(100, f, 2.0, 5.0, AllowedSolution.RIGHT_SIDE);
        Assert.assertEquals(5.0, root, 1e-15);
    }

    @Test
    public void testExactRootOnFirstIterationStep() {
        // Linear function where secant step lands exactly on the root fx == 0.0
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x - 4.0;
            }
        };
        DummySecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.PEGASUS);
        double root = solver.solve(100, f, 0.0, 4.0);
        Assert.assertEquals(2.0, root, 1e-15);
    }

    // --- 3. Invalid States & Exception Handling ---

    @Test(expected = NoBracketingException.class)
    public void testNoBracketingException() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0; // Always positive
            }
        };
        DummySecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, f, 1.0, 3.0);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testInvalidIntervalMinGreaterThanMax() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        DummySecantSolver solver = new DummySecantSolver(1e-6, BaseSecantSolver.Method.ILLINOIS);
        solver.solve(100, f, 5.0, 1.0);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testExceedMaxEvaluations() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return FastMath.sin(x);
            }
        };
        DummySecantSolver solver = new DummySecantSolver(1e-12, BaseSecantSolver.Method.REGULA_FALSI);
        // maxEval=2 only evaluates bounds (min, max), secant step throws TooManyEvaluationsException
        solver.solve(2, f, 3.0, 4.0);
    }

    // --- 4. Secant Method Branches (ILLINOIS, PEGASUS, REGULA_FALSI) ---

    @Test
    public void testMethodIllinois() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return FastMath.exp(x) - 3.0; // root around ln(3) ~ 1.0986122886681
            }
        };
        DummySecantSolver solver = new DummySecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.ILLINOIS);
        double root = solver.solve(100, f, 0.0, 3.0, 1.5, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.log(3.0), root, 1e-6);
    }

    @Test
    public void testMethodPegasus() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 2.0 * x - 5.0; // root around 2.0945514815
            }
        };
        DummySecantSolver solver = new DummySecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.PEGASUS);
        double root = solver.solve(100, f, 1.0, 4.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0945514815, root, 1e-5);
    }

    @Test
    public void testMethodRegulaFalsi() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return FastMath.sin(x);
            }
        };
        DummySecantSolver solver = new DummySecantSolver(1e-14, 1e-7, BaseSecantSolver.Method.REGULA_FALSI);
        double root = solver.solve(100, f, 3.0, 4.0, 3.5);
        Assert.assertEquals(FastMath.PI, root, 1e-6);
    }

    // --- 5. AllowedSolution Branch Coverage (Interval Convergence) ---

    @Test
    public void testAllowedSolutionsWithIntervalConvergence() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 2.0; // root sqrt(2) ~ 1.41421356
            }
        };

        // ftol set to 0 to force interval-length convergence (atol)
        DummySecantSolver solver = new DummySecantSolver(1e-14, 1e-6, 0.0, BaseSecantSolver.Method.ILLINOIS);

        double rootAny = solver.solve(100, f, 1.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.sqrt(2.0), rootAny, 1e-5);

        double rootLeft = solver.solve(100, f, 1.0, 2.0, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue("Left side solution must be <= root", rootLeft <= FastMath.sqrt(2.0));

        double rootRight = solver.solve(100, f, 1.0, 2.0, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue("Right side solution must be >= root", rootRight >= FastMath.sqrt(2.0));

        double rootBelow = solver.solve(100, f, 1.0, 2.0, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue("Below side solution must yield f(x) <= 0", f.value(rootBelow) <= 0.0);

        double rootAbove = solver.solve(100, f, 1.0, 2.0, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue("Above side solution must yield f(x) >= 0", f.value(rootAbove) >= 0.0);
    }

    // --- 6. Function-Value Accuracy Convergence (`FastMath.abs(f1) <= ftol`) ---

    @Test
    public void testAllowedSolutionsWithFunctionValueConvergence() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 8.0; // root at 2.0
            }
        };

        // Large ftol (0.5) so that convergence hits `FastMath.abs(f1) <= ftol` immediately
        DummySecantSolver solver = new DummySecantSolver(1e-14, 1e-12, 0.5, BaseSecantSolver.Method.PEGASUS);

        double rootAny = solver.solve(100, f, 1.0, 3.0, AllowedSolution.ANY_SIDE);
        Assert.assertTrue(FastMath.abs(f.value(rootAny)) <= 0.5);

        double rootLeft = solver.solve(100, f, 1.0, 3.0, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(rootLeft <= 2.0 + 1e-4);

        double rootRight = solver.solve(100, f, 1.0, 3.0, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(rootRight >= 2.0 - 1e-4);

        double rootBelow = solver.solve(100, f, 1.0, 3.0, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(f.value(rootBelow) <= 0.0 + 1e-6);

        double rootAbove = solver.solve(100, f, 1.0, 3.0, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(f.value(rootAbove) >= 0.0 - 1e-6);
    }

    // --- 7. Inverted Interval Boundary Coverage (Decreasing Function) ---

    @Test
    public void testInvertedIntervalCasesDecreasingFunction() {
        // Monotonically decreasing function to invert bound transitions
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 4.0 - x * x; // root at 2.0 for [0, 3]
            }
        };

        DummySecantSolver solver = new DummySecantSolver(1e-14, 1e-6, 0.0, BaseSecantSolver.Method.ILLINOIS);

        double rootLeft = solver.solve(100, f, 0.0, 3.0, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue("Decreasing func: Left side must be <= 2.0", rootLeft <= 2.0);

        double rootRight = solver.solve(100, f, 0.0, 3.0, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue("Decreasing func: Right side must be >= 2.0", rootRight >= 2.0);

        double rootBelow = solver.solve(100, f, 0.0, 3.0, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue("Decreasing func: Below side f(x) <= 0", f.value(rootBelow) <= 0.0);

        double rootAbove = solver.solve(100, f, 0.0, 3.0, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue("Decreasing func: Above side f(x) >= 0", f.value(rootAbove) >= 0.0);
    }
}