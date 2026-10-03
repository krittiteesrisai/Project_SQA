package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage unit tests for BrentSolver targeting condition branches,
 * boundary limits, and edge cases.
 */
public class BrentSolverTest {

    private BrentSolver solver;

    @Before
    public void setUp() {
        solver = new BrentSolver();
    }

    // -------------------------------------------------------------------------
    // Constructors and Deprecated Wrapper Tests
    // -------------------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructorsAndSolve() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };

        BrentSolver solverWithFunc = new BrentSolver(f);
        Assert.assertEquals(2.0, solverWithFunc.solve(1.0, 3.0), 1e-6);
        Assert.assertEquals(2.0, solverWithFunc.solve(1.0, 3.0, 1.5), 1e-6);
    }

    // -------------------------------------------------------------------------
    // Input Validation & Boundary Checks
    // -------------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSolve2ArgsInvalidInterval() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // min >= max must throw IllegalArgumentException
        solver.solve(f, 2.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve3ArgsInvalidSequenceInitialLessThanMin() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // initial <= min must throw IllegalArgumentException
        solver.solve(f, 2.0, 5.0, 1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve3ArgsInvalidSequenceInitialGreaterThanMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        // initial >= max must throw IllegalArgumentException
        solver.solve(f, 2.0, 5.0, 6.0);
    }

    // -------------------------------------------------------------------------
    // solve(f, min, max, initial) - Specific Branches
    // -------------------------------------------------------------------------

    @Test
    public void testSolve3ArgsInitialGoodEnough() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 4.0;
            }
        };
        // initial guess is exactly at the root (yInitial == 0 <= accuracy)
        double result = solver.solve(f, 0.0, 5.0, 2.0);
        Assert.assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testSolve3ArgsMinGoodEnough() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        // min is exactly at root (yMin == 0 <= accuracy)
        double result = solver.solve(f, 1.0, 5.0, 3.0);
        Assert.assertEquals(1.0, solver.getResult(), 1e-6);
    }

    @Test
    public void testSolve3ArgsMaxGoodEnough() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 5.0) * (x + 1.0);
            }
        };
        // max is root (yMax == 0 <= accuracy), initial does not bracket with min
        // f(2)= -3*3 = -9, f(1)= -4*2 = -8, f(5)= 0
        double result = solver.solve(f, 1.0, 5.0, 2.0);
        Assert.assertEquals(5.0, solver.getResult(), 1e-6);
    }

    @Test
    public void testSolve3ArgsBracketMinInitial() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        // Root at 2.0. Bracket is between min (1.0) and initial (3.0), max is 10.0
        double result = solver.solve(f, 1.0, 10.0, 3.0);
        Assert.assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testSolve3ArgsBracketInitialMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 8.0;
            }
        };
        // Root at 8.0. Bracket is between initial (5.0) and max (10.0), min is 1.0
        double result = solver.solve(f, 1.0, 10.0, 5.0);
        Assert.assertEquals(8.0, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve3ArgsNoBracketingThrowsException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0; // Strictly positive, no root
            }
        };
        // Neither [min, initial] nor [initial, max] brackets a root
        solver.solve(f, 1.0, 5.0, 2.0);
    }

    // -------------------------------------------------------------------------
    // solve(f, min, max) - Specific Branches
    // -------------------------------------------------------------------------

    @Test
    public void testSolve2ArgsRootAtMin() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 3.0);
            }
        };
        // yMin == 0.0
        double result = solver.solve(f, 1.0, 2.5);
        Assert.assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolve2ArgsRootAtMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 3.0);
            }
        };
        // yMax == 0.0
        double result = solver.solve(f, 1.5, 3.0);
        Assert.assertEquals(3.0, result, 1e-6);
    }

    @Test
    public void testSolve2ArgsSignGreaterThanZeroMinCloseToZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                // f(min) = 1e-7 which is <= functionValueAccuracy (1e-6)
                // f(max) = 2.0 -> sign > 0
                return x == 1.0 ? 1e-7 : 2.0;
            }
        };
        double result = solver.solve(f, 1.0, 5.0);
        Assert.assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolve2ArgsSignGreaterThanZeroMaxCloseToZero() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                // f(min) = 2.0
                // f(max) = 1e-7 <= functionValueAccuracy -> sign > 0
                return x == 5.0 ? 1e-7 : 2.0;
            }
        };
        double result = solver.solve(f, 1.0, 5.0);
        Assert.assertEquals(5.0, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve2ArgsNonBracketingThrowsException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 2.0; // Strictly positive
            }
        };
        solver.solve(f, 1.0, 5.0);
    }

    // -------------------------------------------------------------------------
    // solve(f, x0, y0, x1, y1, x2, y2) - Internal Algorithm Branches
    // -------------------------------------------------------------------------

    @Test
    public void testSolveInverseQuadraticInterpolation() throws Exception {
        // Polynomial with known root triggering Inverse Quadratic Interpolation
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 2 * x - 5.0; // Root near ~ 2.09455148
            }
        };
        double root = solver.solve(f, 1.0, 4.0);
        Assert.assertEquals(2.09455148, root, 1e-5);
    }

    @Test
    public void testSolveLinearInterpolationPath() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x - 4.0;
            }
        };
        // Straight line hits x0 == x2 condition initially
        double root = solver.solve(f, 0.0, 5.0, 0.0001);
        Assert.assertEquals(2.0, root, 1e-5);
    }

    @Test
    public void testSolveFallbackToBisection() throws Exception {
        // High steepness forcing bisection fallback
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                if (x < 0) {
                    return -1.0;
                } else if (x > 0) {
                    return 1.0;
                }
                return 0.0;
            }
        };
        double root = solver.solve(f, -2.0, 2.0);
        Assert.assertEquals(0.0, root, 1e-5);
    }

    @Test
    public void testSolveStepWithNegativeDx() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };
        // Solving across boundary where dx adjustment direction flips
        double root = solver.solve(f, 3.0, 4.0);
        Assert.assertEquals(Math.PI, root, 1e-5);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.cos(x) - x;
            }
        };
        solver.setMaximalIterationCount(1); // Force failure after 1 iteration
        solver.solve(f, 0.0, 2.0);
    }
}