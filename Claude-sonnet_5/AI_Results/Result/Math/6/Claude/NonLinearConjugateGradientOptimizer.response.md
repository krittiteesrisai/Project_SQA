# NonLinearConjugateGradientOptimizerTest

ด้านล่างนี้คือชุดทดสอบ JUnit 4 ที่ครอบคลุม branch/condition ต่าง ๆ ของคลาส `NonLinearConjugateGradientOptimizer` โดยวิเคราะห์จาก source code ที่ให้มา

```java
package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner;
import org.junit.Test;

public class NonLinearConjugateGradientOptimizerTest {

    private static final double REL_TOL = 1e-9;
    private static final double ABS_TOL = 1e-9;

    private SimplePointChecker<PointValuePair> defaultChecker() {
        return new SimplePointChecker<PointValuePair>(REL_TOL, ABS_TOL);
    }

    // ---------------------------------------------------------------
    // Helper functions
    // ---------------------------------------------------------------

    /** f(x,y) = (x-1)^2 + (y-2)^2 , min = 0 at (1,2) */
    private static MultivariateFunction quadratic2D() {
        return new MultivariateFunction() {
            public double value(double[] p) {
                double dx = p[0] - 1;
                double dy = p[1] - 2;
                return dx * dx + dy * dy;
            }
        };
    }

    private static MultivariateVectorFunction quadratic2DGradient() {
        return new MultivariateVectorFunction() {
            public double[] value(double[] p) {
                return new double[] { 2 * (p[0] - 1), 2 * (p[1] - 2) };
            }
        };
    }

    /** f(x,y) = -(x-1)^2 - (y-2)^2 , max = 0 at (1,2) */
    private static MultivariateFunction negQuadratic2D() {
        return new MultivariateFunction() {
            public double value(double[] p) {
                double dx = p[0] - 1;
                double dy = p[1] - 2;
                return -(dx * dx) - (dy * dy);
            }
        };
    }

    private static MultivariateVectorFunction negQuadratic2DGradient() {
        return new MultivariateVectorFunction() {
            public double[] value(double[] p) {
                return new double[] { -2 * (p[0] - 1), -2 * (p[1] - 2) };
            }
        };
    }

    /** f(x) = (x-5)^2 , 1-D function, min at x = 5 */
    private static MultivariateFunction quadratic1D() {
        return new MultivariateFunction() {
            public double value(double[] p) {
                double dx = p[0] - 5;
                return dx * dx;
            }
        };
    }

    private static MultivariateVectorFunction quadratic1DGradient() {
        return new MultivariateVectorFunction() {
            public double[] value(double[] p) {
                return new double[] { 2 * (p[0] - 5) };
            }
        };
    }

    /** f(x) = x (linear, constant gradient != 0) -> used to force bracket failure */
    private static MultivariateFunction linear1D() {
        return new MultivariateFunction() {
            public double value(double[] p) {
                return p[0];
            }
        };
    }

    private static MultivariateVectorFunction linear1DGradient() {
        return new MultivariateVectorFunction() {
            public double[] value(double[] p) {
                return new double[] { 1.0 };
            }
        };
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructorWithDefaultSolverAndPreconditioner() {
        // Covers: constructor (Formula, checker) -> delegates to full constructor
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(quadratic2D()),
            new ObjectiveFunctionGradient(quadratic2DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0, 0 }),
            new MaxEval(1000));

        assertEquals(1.0, result.getPoint()[0], 1e-4);
        assertEquals(2.0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testConstructorWithCustomSolver() {
        // Covers: constructor (Formula, checker, solver) -> delegates with IdentityPreconditioner
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.POLAK_RIBIERE, defaultChecker(), new BrentSolver());

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(quadratic2D()),
            new ObjectiveFunctionGradient(quadratic2DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { -3, -3 }),
            new MaxEval(1000));

        assertEquals(1.0, result.getPoint()[0], 1e-4);
        assertEquals(2.0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testConstructorWithCustomPreconditioner() {
        // Covers: full constructor with custom (non-identity) Preconditioner
        Preconditioner scalePrecond = new Preconditioner() {
            public double[] precondition(double[] variables, double[] r) {
                double[] out = new double[r.length];
                for (int i = 0; i < r.length; i++) {
                    out[i] = r[i] * 2.0; // simple scaling, still same optimum
                }
                return out;
            }
        };

        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker(),
                new BrentSolver(), scalePrecond);

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(quadratic2D()),
            new ObjectiveFunctionGradient(quadratic2DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 5, 5 }),
            new MaxEval(1000));

        assertEquals(1.0, result.getPoint()[0], 1e-3);
        assertEquals(2.0, result.getPoint()[1], 1e-3);
    }

    // ---------------------------------------------------------------
    // doOptimize(): main branch coverage
    // ---------------------------------------------------------------

    @Test
    public void testOptimizeMinimizeFletcherReeves() {
        // Covers: goal==MINIMIZE branch (true, both occurrences),
        // switch-case FLETCHER_REEVES, previous!=null->converged check eventually true
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(quadratic2D()),
            new ObjectiveFunctionGradient(quadratic2DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 10, 10 }),
            new MaxEval(1000));

        assertEquals(1.0, result.getPoint()[0], 1e-4);
        assertEquals(2.0, result.getPoint()[1], 1e-4);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimizeMinimizePolakRibiere() {
        // Covers: switch-case POLAK_RIBIERE (deltaMid computation branch)
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.POLAK_RIBIERE, defaultChecker());

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(quadratic2D()),
            new ObjectiveFunctionGradient(quadratic2DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { -10, 20 }),
            new MaxEval(1000));

        assertEquals(1.0, result.getPoint()[0], 1e-4);
        assertEquals(2.0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testOptimizeMaximizeGoal() {
        // Covers: goal == GoalType.MINIMIZE false-branch (gradient NOT negated)
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(negQuadratic2D()),
            new ObjectiveFunctionGradient(negQuadratic2DGradient()),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[] { 0, 0 }),
            new MaxEval(1000));

        assertEquals(1.0, result.getPoint()[0], 1e-4);
        assertEquals(2.0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testOptimizeSingleVariable_IterModNAlwaysTrue() {
        // n = 1 -> iter % n == 0 always true -> search direction reset every iteration
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(quadratic1D()),
            new ObjectiveFunctionGradient(quadratic1DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0 }),
            new MaxEval(1000));

        assertEquals(5.0, result.getPoint()[0], 1e-4);
    }

    @Test
    public void testOptimizeMultiVariableManyIterations_BetaBranches() {
        // Non-trivial function with n=3 to exercise both beta<0 and beta>=0 paths
        // across several iterations (exact branch hit cannot be asserted directly,
        // but this test is designed to exercise many code paths for coverage).
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] p) {
                double a = p[0] * p[0] + p[1] * p[1] + p[2] * p[2];
                double b = Math.sin(p[0]) + Math.cos(p[1]);
                return a + b;
            }
        };
        MultivariateVectorFunction g = new MultivariateVectorFunction() {
            public double[] value(double[] p) {
                return new double[] {
                    2 * p[0] + Math.cos(p[0]),
                    2 * p[1] - Math.sin(p[1]),
                    2 * p[2]
                };
            }
        };

        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.POLAK_RIBIERE, defaultChecker());

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(f),
            new ObjectiveFunctionGradient(g),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 3, -2, 5 }),
            new MaxEval(5000));

        // Just assert it converges to something finite near a stationary point.
        assertTrue(Double.isFinite(result.getValue()));
    }

    // ---------------------------------------------------------------
    // parseOptimizationData(): BracketingStep branch
    // ---------------------------------------------------------------

    @Test
    public void testOptimizeWithBracketingStepProvided() {
        // Covers: data instanceof BracketingStep == true -> initialStep updated, break
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(quadratic2D()),
            new ObjectiveFunctionGradient(quadratic2DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0, 0 }),
            new MaxEval(1000),
            new BracketingStep(0.25));

        assertEquals(1.0, result.getPoint()[0], 1e-4);
        assertEquals(2.0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testOptimizeWithoutBracketingStep_UsesDefaultInitialStep() {
        // Covers: no element instanceof BracketingStep -> loop falls through
        // without ever executing the if-body (default initialStep = 1 retained)
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(quadratic2D()),
            new ObjectiveFunctionGradient(quadratic2DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0, 0 }),
            new MaxEval(1000));

        assertEquals(1.0, result.getPoint()[0], 1e-4);
        assertEquals(2.0, result.getPoint()[1], 1e-4);
    }

    // ---------------------------------------------------------------
    // checkParameters(): bounds branch
    // ---------------------------------------------------------------

    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParametersThrowsWhenBoundsProvided() {
        // Covers: getLowerBound()!=null || getUpperBound()!=null -> true -> throw
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        optimizer.optimize(
            new ObjectiveFunction(quadratic2D()),
            new ObjectiveFunctionGradient(quadratic2DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0, 0 }),
            new MaxEval(1000),
            new SimpleBounds(new double[] { -1, -1 }, new double[] { 10, 10 }));
    }

    @Test
    public void testCheckParametersDoesNotThrowWithoutBounds() {
        // Covers: both bounds null -> false branch -> no exception
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        PointValuePair result = optimizer.optimize(
            new ObjectiveFunction(quadratic2D()),
            new ObjectiveFunctionGradient(quadratic2DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0, 0 }),
            new MaxEval(1000));

        assertTrue(Double.isFinite(result.getValue()));
    }

    // ---------------------------------------------------------------
    // TooManyEvaluationsException
    // ---------------------------------------------------------------

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimizeThrowsTooManyEvaluationsException() {
        // Covers: maxEval exhausted inside doOptimize / solver.solve
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        optimizer.optimize(
            new ObjectiveFunction(quadratic2D()),
            new ObjectiveFunctionGradient(quadratic2DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 100, 100 }),
            new MaxEval(1)); // Too small to converge
    }

    // ---------------------------------------------------------------
    // findUpperBound(): bracket failure branch (private method, tested indirectly)
    // ---------------------------------------------------------------

    @Test(expected = MathIllegalStateException.class)
    public void testFindUpperBoundFailureThrowsMathIllegalStateException() {
        // Linear function => constant-sign line-search function => never brackets
        // a root => findUpperBound loops until step >= Double.MAX_VALUE and throws.
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        optimizer.optimize(
            new ObjectiveFunction(linear1D()),
            new ObjectiveFunctionGradient(linear1DGradient()),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0 }),
            new MaxEval(100000));
    }

    // ---------------------------------------------------------------
    // Null / malformed input
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void testOptimizeWithNullOptimizationDataArrayThrowsNPE() {
        // Covers: for-each loop over optData in parseOptimizationData when
        // optData itself is null -> NullPointerException expected.
        // NOTE: exact exception source not explicitly documented in javadoc,
        // but is the direct consequence of "for (OptimizationData data : optData)"
        // when optData == null. Marked here based on direct code inspection.
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        optimizer.optimize((org.apache.commons.math3.optim.OptimizationData[]) null);
    }

    @Test
    public void testOptimizeWithEmptyOptimizationDataArray() {
        // Covers: optData array length==0 -> for loop body never runs (false branch)
        // but required data (ObjectiveFunction/Gradient/GoalType/InitialGuess) are
        // missing. Exact resulting exception type is NOT explicitly specified in
        // the given source (depends on base-class behavior), so we only assert
        // that SOME exception is thrown, without asserting a specific type.
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, defaultChecker());

        boolean thrown = false;
        try {
            optimizer.optimize();
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue("Expected some exception when required optimization data is missing", thrown);
    }

    // ---------------------------------------------------------------
    // Nested static/inner helper classes
    // ---------------------------------------------------------------

    @Test
    public void testIdentityPreconditionerReturnsClonedArray() {
        // Covers: IdentityPreconditioner.precondition() directly
        IdentityPreconditioner precond = new IdentityPreconditioner();
        double[] r = { 1.0, 2.0, 3.0 };
        double[] result = precond.precondition(new double[] { 0, 0, 0 }, r);

        assertArrayEquals(r, result, 0.0);
        assertNotSame(r, result); // must be a clone, not the same reference
    }

    @Test
    public void testBracketingStepGetter() {
        // Covers: BracketingStep constructor + getBracketingStep()
        BracketingStep step = new BracketingStep(0.42);
        assertEquals(0.42, step.getBracketingStep(), 0.0);
    }

    @Test
    public void testBracketingStepBoundaryZero() {
        // Boundary case: step = 0
        BracketingStep step = new BracketingStep(0.0);
        assertEquals(0.0, step.getBracketingStep(), 0.0);
    }
}
```

> **หมายเหตุสำคัญ:**
> - `Preconditioner` เป็น interface ใน package เดียวกัน (`org.apache.commons.math3.optim.nonlinear.scalar.gradient`) จึงไม่ต้อง import แยก
> - สาขา `default:` ใน `switch (updateFormula)` และ `MathInternalError` ไม่สามารถทดสอบได้ผ่าน public API เพราะ `Formula` enum มีแค่ 2 ค่า — ไม่ได้เขียนเทสสำหรับจุดนี้ตามข้อกำหนดที่ 4 (ห้ามเดา behavior)
> - `findUpperBound()` และ `checkParameters()` เป็น private method จึงถูกทดสอบทางอ้อมผ่าน `optimize()`

## สรุป Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorWithDefaultSolverAndPreconditioner` | Constructor (Formula, checker) → delegation chain |
| `testConstructorWithCustomSolver` | Constructor (Formula, checker, solver) → delegation |
| `testConstructorWithCustomPreconditioner` | Constructor เต็มรูปแบบ (4 args) พร้อม custom Preconditioner |
| `testOptimizeMinimizeFletcherReeves` | `goal==MINIMIZE` (true, ทั้ง 2 จุด), `switch FLETCHER_REEVES`, `previous!=null` true, `checker.converged` true |
| `testOptimizeMinimizePolakRibiere` | `switch POLAK_RIBIERE` (deltaMid loop) |
| `testOptimizeMaximizeGoal` | `goal==MINIMIZE` false branch (ไม่ negate gradient) |
| `testOptimizeSingleVariable_IterModNAlwaysTrue` | `iter % n == 0` true (n=1) → reset search direction เสมอ |
| `testOptimizeMultiVariableManyIterations_BetaBranches` | พยายามครอบคลุมทั้ง `beta<0` true/false ผ่านหลาย iteration (n=3) |
| `testOptimizeWithBracketingStepProvided` | `data instanceof BracketingStep` true → break |
| `testOptimizeWithoutBracketingStep_UsesDefaultInitialStep` | loop ผ่าน optData โดยไม่มี BracketingStep (false ทุก element) |
| `testCheckParametersThrowsWhenBoundsProvided` | `checkParameters()`: bounds != null → throw `MathUnsupportedOperationException` |
| `testCheckParametersDoesNotThrowWithoutBounds` | `checkParameters()`: bounds == null → ไม่ throw |
| `testOptimizeThrowsTooManyEvaluationsException` | maxEval หมดระหว่าง loop → `TooManyEvaluationsException` |
| `testFindUpperBoundFailureThrowsMathIllegalStateException` | `findUpperBound()`: ไม่พบ bracket → throw `MathIllegalStateException` (loop จนถึง Double.MAX_VALUE) |
| `testOptimizeWithNullOptimizationDataArrayThrowsNPE` | optData เป็น null → NPE ใน for-each loop |
| `testOptimizeWithEmptyOptimizationDataArray` | optData ว่าง → ข้อมูลที่ต้องใช้ขาด (exception ทั่วไป, ไม่ฟันธง type) |
| `testIdentityPreconditionerReturnsClonedArray` | `IdentityPreconditioner.precondition()` คืนค่า clone |
| `testBracketingStepGetter` / `testBracketingStepBoundaryZero` | `BracketingStep` constructor/getter + boundary value 0 |