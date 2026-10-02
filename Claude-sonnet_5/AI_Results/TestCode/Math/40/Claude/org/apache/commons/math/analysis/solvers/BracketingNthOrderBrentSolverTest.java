package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;

import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.exception.NoBracketingException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.junit.Test;

public class BracketingNthOrderBrentSolverTest {

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testDefaultConstructor() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        assertEquals(5, solver.getMaximalOrder());
    }

    @Test
    public void testConstructorAbsoluteAccuracyAndOrder_valid() {
        BracketingNthOrderBrentSolver solver =
            new BracketingNthOrderBrentSolver(1e-8, 3);
        assertEquals(3, solver.getMaximalOrder());
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorAbsoluteAccuracyAndOrder_invalidOrderThrows() {
        new BracketingNthOrderBrentSolver(1e-8, 1); // order < 2
    }

    @Test
    public void testConstructorRelAbsOrder_valid() {
        BracketingNthOrderBrentSolver solver =
            new BracketingNthOrderBrentSolver(1e-10, 1e-8, 4);
        assertEquals(4, solver.getMaximalOrder());
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelAbsOrder_invalidOrderThrows() {
        new BracketingNthOrderBrentSolver(1e-10, 1e-8, 0); // order < 2
    }

    @Test
    public void testConstructorRelAbsFuncOrder_valid() {
        BracketingNthOrderBrentSolver solver =
            new BracketingNthOrderBrentSolver(1e-10, 1e-8, 1e-9, 2); // boundary order = 2
        assertEquals(2, solver.getMaximalOrder());
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelAbsFuncOrder_invalidOrderThrows() {
        new BracketingNthOrderBrentSolver(1e-10, 1e-8, 1e-9, -5); // order < 2
    }

    @Test
    public void testGetMaximalOrder() {
        BracketingNthOrderBrentSolver solver =
            new BracketingNthOrderBrentSolver(1e-6, 7);
        assertEquals(7, solver.getMaximalOrder());
    }

    // ---------------------------------------------------------------
    // doSolve(): immediate-return branches (perfect root cases)
    // ---------------------------------------------------------------

    @Test
    public void testSolveReturnsStartValueWhenPerfectRoot() {
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x;
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        // y[1] = f(startValue) = 0 -> return x[1] immediately
        double root = solver.solve(100, f, -2, 2, 0, AllowedSolution.ANY_SIDE);
        assertEquals(0.0, root, 0.0);
    }

    @Test
    public void testSolveReturnsMinWhenPerfectRootAtMin() {
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x - 1;
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        // y[1] != 0, y[0] = f(min) = 0 -> return x[0]
        double root = solver.solve(100, f, 1, 5, 3, AllowedSolution.ANY_SIDE);
        assertEquals(1.0, root, 0.0);
    }

    @Test
    public void testSolveReturnsMaxWhenPerfectRootAtMax() {
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x - 5;
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        // y[0]*y[1] > 0 -> else branch; y[2] = f(max) = 0 -> return x[2]
        double root = solver.solve(100, f, 0, 5, 1, AllowedSolution.ANY_SIDE);
        assertEquals(5.0, root, 0.0);
    }

    // ---------------------------------------------------------------
    // doSolve(): sign-change branches
    // ---------------------------------------------------------------

    @Test
    public void testSolveSignChangeBeforeStart() {
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x - 2;
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        // y[0]*y[1] < 0 -> nbPoints = 2, signChangeIndex = 1
        double root = solver.solve(1000, f, 0, 5, 3, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, 1e-5);
    }

    @Test
    public void testSolveSignChangeAfterStart() {
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x - 4;
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        // y[0]*y[1] > 0 -> else; y[1]*y[2] < 0 -> nbPoints = 3, signChangeIndex = 2
        double root = solver.solve(1000, f, 0, 5, 1, AllowedSolution.ANY_SIDE);
        assertEquals(4.0, root, 1e-5);
    }

    @Test(expected = NoBracketingException.class)
    public void testSolveNoBracketingThrows() {
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x + 1; // always positive, never brackets a root
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        solver.solve(100, f, -5, 5, 0, AllowedSolution.ANY_SIDE);
    }

    // ---------------------------------------------------------------
    // doSolve(): AllowedSolution switch-case branches.
    // Crafted so that (xB - xA) <= xTol is already true right after the
    // initial bracket (xA = x[1] = 1, yA = -1 ; xB = x[2] = 5, yB = 3) is
    // established, so the switch statement executes on the very first loop
    // pass (no additional interpolation iterations needed).
    // f(x) = x - 2 over [0,5], startValue = 1.
    // ---------------------------------------------------------------

    private UnivariateFunction linearRootAt2() {
        return new UnivariateFunction() {
            public double value(double x) {
                return x - 2;
            }
        };
    }

    @Test
    public void testAllowedSolutionAnySide() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(10.0, 2);
        double root = solver.solve(100, linearRootAt2(), 0, 5, 1, AllowedSolution.ANY_SIDE);
        // absYA(1) < absYB(3) -> xA
        assertEquals(1.0, root, 0.0);
    }

    @Test
    public void testAllowedSolutionLeftSide() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(10.0, 2);
        double root = solver.solve(100, linearRootAt2(), 0, 5, 1, AllowedSolution.LEFT_SIDE);
        assertEquals(1.0, root, 0.0);
    }

    @Test
    public void testAllowedSolutionRightSide() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(10.0, 2);
        double root = solver.solve(100, linearRootAt2(), 0, 5, 1, AllowedSolution.RIGHT_SIDE);
        assertEquals(5.0, root, 0.0);
    }

    @Test
    public void testAllowedSolutionBelowSide() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(10.0, 2);
        double root = solver.solve(100, linearRootAt2(), 0, 5, 1, AllowedSolution.BELOW_SIDE);
        // yA(-1) <= 0 -> xA
        assertEquals(1.0, root, 0.0);
    }

    @Test
    public void testAllowedSolutionAboveSide() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(10.0, 2);
        double root = solver.solve(100, linearRootAt2(), 0, 5, 1, AllowedSolution.ABOVE_SIDE);
        // yA(-1) < 0 -> xB
        assertEquals(5.0, root, 0.0);
    }

    // ---------------------------------------------------------------
    // solve(4-arg) overload (no explicit startValue).
    // NOTE: the internal default start value comes from the superclass
    // (not shown in the provided source), so we only check the functional
    // correctness of the returned root rather than an internal branch path.
    // ---------------------------------------------------------------

    @Test
    public void testSolveFourArgOverloadFindsRoot() {
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, linearRootAt2(), 0, 5, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, 1e-5);
    }

    // ---------------------------------------------------------------
    // Functional tests exercising the main search loop
    // (guessX interpolation, aging counters, insertion logic).
    // We cannot assert internal private state directly, so we assert the
    // final numerical result, which can only be correct if the loop and
    // its sub-branches executed properly.
    // ---------------------------------------------------------------

    @Test
    public void testSolveNonlinearFunctionConvergence() {
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x * x - 2; // root = cbrt(2)
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(1000, f, 0, 2, 1, AllowedSolution.ANY_SIDE);
        assertEquals(Math.cbrt(2.0), root, 1e-5);
    }

    @Test
    public void testSolveSmallMaximalOrderTriggersPointDropping() {
        // maximalOrder = 2 -> x.length == 3. The initial sign change occurs
        // after start, giving nbPoints == 3 == x.length right away. This is
        // designed to exercise the "nbPoints == x.length" point-dropping
        // branch together with the array-shift sub-branch
        // (signChangeIndex(2) >= (x.length+1)/2(2)).
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x * x - 4; // root = cbrt(4)
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver(1e-9, 2);
        double root = solver.solve(1000, f, 0, 5, 1, AllowedSolution.ANY_SIDE);
        assertEquals(Math.cbrt(4.0), root, 1e-4);
    }

    @Test
    public void testSolveStepFunctionTriggersInterpolationOrderReduction() {
        // A piecewise-constant function produces many equal y-values among
        // sampled points, which is designed to make the divided-difference
        // computation inside guessX() divide by zero (NaN). This should
        // force the "drop lowest/highest point and retry" logic and,
        // eventually, the bisection fallback branch. We do NOT assert the
        // exact internal path (not observable / not fully specified for
        // every input in the given source) -- only that the solver still
        // converges close to the discontinuity at x = 2.
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x < 2 ? -1 : 1;
            }
        };
        BracketingNthOrderBrentSolver solver = new BracketingNthOrderBrentSolver();
        double root = solver.solve(10000, f, 0, 4, 1, AllowedSolution.ANY_SIDE);
        assertEquals(2.0, root, 1e-3);
    }
}
