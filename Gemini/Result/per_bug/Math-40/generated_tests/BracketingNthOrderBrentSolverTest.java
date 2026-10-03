package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.function.Expm1;
import org.apache.commons.math.analysis.function.Sin;
import org.apache.commons.math.exception.MathInternalError;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class BracketingNthOrderBrentSolverTest {

    @Test
    public void testDefaultConstructor() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        Assert.assertEquals(5, solver.getMaximalOrder());
        Assert.assertEquals(1e-6, solver.getAbsoluteAccuracy(), 1e-15);
    }

    @Test
    public void testConstructorsWithValidMaximalOrder() {
        BracketingNthOrderBrentSolver solver1 = new BracketingNthOrderBrentSolver(1e-4, 3);
        Assert.assertEquals(3, solver1.getMaximalOrder());
        Assert.assertEquals(1e-4, solver1.getAbsoluteAccuracy(), 1e-15);

        BracketingNthOrderBrentSolver solver2 = new BracketingNthOrderBrentSolver(1e-8, 1e-5, 4);
        Assert.assertEquals(4, solver2.getMaximalOrder());
        Assert.assertEquals(1e-8, solver2.getRelativeAccuracy(), 1e-15);
        Assert.assertEquals(1e-5, solver2.getAbsoluteAccuracy(), 1e-15);

        BracketingNthOrderBrentSolver solver3 = new BracketingNthOrderBrentSolver(1e-8, 1e-5, 1e-7, 6);
        Assert.assertEquals(6, solver3.getMaximalOrder());
        Assert.assertEquals(1e-7, solver3.getFunctionValueAccuracy(), 1e-15);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor1OrderTooSmall() {
        new BracketingNthOrderBrentSolver(1e-6, 1);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor2OrderTooSmall() {
        new BracketingNthOrderBrentSolver(1e-6, 1e-6, 0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor3OrderTooSmall() {
        new BracketingNthOrderBrentSolver(1e-6, 1e-6, 1e-6, -1);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testInvalidSequenceMinMax() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        solver.solve(100, new SinFunction(), 2.0, 1.0, 1.5, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testInvalidSequenceStartOutOfRange() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        solver.solve(100, new SinFunction(), 1.0, 2.0, 0.5, AllowedSolution.ANY_SIDE);
    }

    @Test(expected = NoBracketingException.class)
    public void testNoBracketing() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x + 1.0; // Strictly positive
            }
        };
        solver.solve(100, f, 1.0, 5.0, 2.0, AllowedSolution.ANY_SIDE);
    }

    @Test
    public void testExactRootAtStartValue() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        UnivariateFunction f = new SinFunction();
        // sin(0) = 0, startValue = 0
        double root = solver.solve(100, f, -1.0, 1.0, 0.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(0.0, root, 1e-15);
        Assert.assertEquals(1, solver.getEvaluations());
    }

    @Test
    public void testExactRootAtMin() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        UnivariateFunction f = new SinFunction();
        // sin(0) = 0, min = 0
        double root = solver.solve(100, f, 0.0, 2.0, 1.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(0.0, root, 1e-15);
        Assert.assertEquals(2, solver.getEvaluations()); // evaluated start, then min
    }

    @Test
    public void testExactRootAtMax() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        UnivariateFunction f = new SinFunction();
        // sin(Math.PI) ~ 0
        double root = solver.solve(100, f, 1.0, FastMath.PI, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.PI, root, 1e-15);
    }

    @Test
    public void testRootInLeftSubInterval() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        // Root is at x = 1.0. Bracket [-1.0, 3.0], start at 2.0 -> left sub-interval [-1.0, 2.0] contains root
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x - 1.0;
            }
        };
        double root = solver.solve(100, f, -1.0, 3.0, 2.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.0, root, 1e-6);
    }

    @Test
    public void testRootInRightSubInterval() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        // Root is at x = 2.0. Bracket [-1.0, 3.0], start at 0.5 -> right sub-interval [0.5, 3.0] contains root
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x - 2.0;
            }
        };
        double root = solver.solve(100, f, -1.0, 3.0, 0.5, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-6);
    }

    @Test
    public void testAllowedSolutions() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-10, 1e-4, 5);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.sin(x);
            }
        };

        // Root is at pi
        double rootAny = solver.solve(100, f, 3.0, 3.3, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(FastMath.PI, rootAny, 1e-4);

        double rootLeft = solver.solve(100, f, 3.0, 3.3, AllowedSolution.LEFT_SIDE);
        Assert.assertTrue(rootLeft <= FastMath.PI);

        double rootRight = solver.solve(100, f, 3.0, 3.3, AllowedSolution.RIGHT_SIDE);
        Assert.assertTrue(rootRight >= FastMath.PI);

        double rootBelow = solver.solve(100, f, 3.0, 3.3, AllowedSolution.BELOW_SIDE);
        Assert.assertTrue(f.value(rootBelow) <= 0.0);

        double rootAbove = solver.solve(100, f, 3.0, 3.3, AllowedSolution.ABOVE_SIDE);
        Assert.assertTrue(f.value(rootAbove) >= 0.0);
    }

    @Test
    public void testAgingMechanism() {
        // High-order polynomial to trigger aging branches (agingA / agingB >= 2)
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.pow(x, 11) - 1.0;
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-12, 1e-10, 1e-12, 5);
        double root = solver.solve(100, f, 0.0, 2.0, 0.5, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(1.0, root, 1e-8);
    }

    @Test
    public void testBufferFullAndPointDropping() {
        // Minimal order = 2 (so buffer size = 3). Forces frequent buffer-full branch execution
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-14, 1e-12, 2);
        UnivariateFunction f = new QuinticFunction();
        double root = solver.solve(200, f, 0.2, 0.7, 0.4, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(0.5, root, 1e-10);
    }

    @Test
    public void testHighOrderConvergence() {
        // Higher order solver
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-14, 1e-12, 10);
        UnivariateFunction f = new Expm1();
        double root = solver.solve(100, f, -1.0, 2.0, 0.2, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(0.0, root, 1e-10);
    }

    @Test
    public void testBisectionFallbackUnderExtremeCondition() {
        // Step function causing same y-values or invalid inverse polynomial roots
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                if (x < 0.5) {
                    return -1.0;
                } else if (x > 0.5) {
                    return 1.0;
                } else {
                    return 0.0;
                }
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-8, 1e-6, 5);
        double root = solver.solve(100, f, 0.0, 1.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(0.5, root, 1e-5);
    }

    @Test
    public void testExactHitDuringIteration() {
        // Function where bisection/interpolation lands exactly on an integer root
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return 2.0 * x - 4.0;
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(100, f, 0.0, 6.0, 1.0, AllowedSolution.ANY_SIDE);
        Assert.assertEquals(2.0, root, 1e-10);
    }
}