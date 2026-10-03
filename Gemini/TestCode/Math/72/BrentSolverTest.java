package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * High-coverage branch and condition tests for {@link BrentSolver}.
 */
public class BrentSolverTest {

    private BrentSolver solver;

    @Before
    public void setUp() {
        solver = new BrentSolver();
    }

    // ------------------------------------------------------------------------
    // Tests for solve(f, min, max, initial)
    // ------------------------------------------------------------------------

    @Test
    public void testSolveWithInitialRootAtInitial() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        // initial is the exact root
        double result = solver.solve(f, 0.0, 4.0, 2.0);
        Assert.assertEquals(2.0, result, 1e-6);
        Assert.assertEquals(0, solver.getIterationCount());
    }

    @Test
    public void testSolveWithInitialRootAtMinBoundary() throws Exception {
        // Function where min (3.0) is a root
        // Defects4J Math-72 bug check: returns min, not yMin (0.0)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 3.0) * (x - 10.0);
            }
        };
        double result = solver.solve(f, 3.0, 5.0, 4.0);
        Assert.assertEquals(3.0, result, 1e-6);
    }

    @Test
    public void testSolveWithInitialRootAtMaxBoundary() throws Exception {
        // Function where max (5.0) is a root
        // Defects4J Math-72 bug check: returns max, not yMax (0.0)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 5.0);
            }
        };
        double result = solver.solve(f, 2.0, 5.0, 3.0);
        Assert.assertEquals(5.0, result, 1e-6);
    }

    @Test
    public void testSolveWithInitialBracketingMinInitial() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x - 3.0; // root is 1.5
            }
        };
        // min=1.0 (y=-1), initial=2.0 (y=1), max=5.0 (y=7) -> min & initial bracket root
        double result = solver.solve(f, 1.0, 5.0, 2.0);
        Assert.assertEquals(1.5, result, 1e-6);
    }

    @Test
    public void testSolveWithInitialBracketingInitialMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x - 7.0; // root is 3.5
            }
        };
        // min=1.0 (y=-5), initial=2.0 (y=-3), max=4.0 (y=1) -> initial & max bracket root
        double result = solver.solve(f, 1.0, 4.0, 2.0);
        Assert.assertEquals(3.5, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitialNoSignChangeThrowsException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 1.0; // strictly positive
            }
        };
        solver.solve(f, 1.0, 4.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitialInvalidSequenceMinGreaterInitial() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        solver.solve(f, 3.0, 4.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithInitialInvalidSequenceInitialGreaterMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        solver.solve(f, 1.0, 2.0, 3.0);
    }

    // ------------------------------------------------------------------------
    // Tests for solve(f, min, max)
    // ------------------------------------------------------------------------

    @Test
    public void testSolveExactRootAtMin() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 2.0) * (x - 6.0);
            }
        };
        double result = solver.solve(f, 2.0, 5.0);
        Assert.assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testSolveExactRootAtMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 5.0);
            }
        };
        double result = solver.solve(f, 2.0, 5.0);
        Assert.assertEquals(5.0, result, 1e-6);
    }

    @Test
    public void testSolveSignGreaterThanZeroMinCloseToZero() throws Exception {
        // min evaluates within functionValueAccuracy
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x == 1.0) ? 1e-15 : 2.0;
            }
        };
        double result = solver.solve(f, 1.0, 3.0);
        Assert.assertEquals(1.0, result, 1e-6);
    }

    @Test
    public void testSolveSignGreaterThanZeroMaxCloseToZero() throws Exception {
        // max evaluates within functionValueAccuracy
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x == 3.0) ? 1e-15 : 2.0;
            }
        };
        double result = solver.solve(f, 1.0, 3.0);
        Assert.assertEquals(3.0, result, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveSignGreaterThanZeroNoRootThrowsException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 2.0;
            }
        };
        solver.solve(f, 1.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveInvalidIntervalMinEqualsMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        solver.solve(f, 2.0, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveInvalidIntervalMinGreaterThanMax() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x;
            }
        };
        solver.solve(f, 5.0, 2.0);
    }

    @Test
    public void testSolveOppositeSignsLinear() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 3.0 * x - 6.0;
            }
        };
        double result = solver.solve(f, 0.0, 4.0);
        Assert.assertEquals(2.0, result, 1e-6);
    }

    // ------------------------------------------------------------------------
    // Tests for Brent Internal Iteration Logic & Edge Cases
    // ------------------------------------------------------------------------

    @Test
    public void testSolveCubicFunction() throws Exception {
        // Tests Inverse Quadratic Interpolation & Bisection switching
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 2.0) * (x - 3.0);
            }
        };
        // bracket root 2.0
        double result = solver.solve(f, 1.5, 2.8, 1.7);
        Assert.assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testSolveSinFunction() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };
        // root around Pi (3.14159265...)
        double result = solver.solve(f, 3.0, 4.0);
        Assert.assertEquals(Math.PI, result, 1e-6);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.pow(x - 2.0, 5); // very flat around root
            }
        };
        solver.setMaximalIterationCount(1);
        solver.setAbsoluteAccuracy(1e-15);
        solver.setRelativeAccuracy(1e-15);
        solver.solve(f, 1.0, 3.0);
    }

    // ------------------------------------------------------------------------
    // Deprecated Methods and Legacy Constructor Support
    // ------------------------------------------------------------------------

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedConstructorAndSolve() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return 2.0 * x - 4.0;
            }
        };
        BrentSolver legacySolver = new BrentSolver(f);
        double result1 = legacySolver.solve(0.0, 5.0);
        Assert.assertEquals(2.0, result1, 1e-6);

        double result2 = legacySolver.solve(0.0, 5.0, 1.0);
        Assert.assertEquals(2.0, result2, 1e-6);
    }
}