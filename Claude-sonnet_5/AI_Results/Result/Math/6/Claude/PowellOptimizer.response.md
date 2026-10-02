# PowellOptimizerTest.java

ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับ `PowellOptimizer` ที่ครอบคลุม constructor validation, exception paths, การ optimize ทั้ง MINIMIZE/MAXIMIZE, branch ของ `doOptimize()` (รวมถึง direction-replacement branch `t < 0.0`), และ edge case ต่าง ๆ

```java
package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.junit.Test;

public class PowellOptimizerTest {

    // ===================================================================
    // Constructor validation
    // ===================================================================

    /** rel < MIN_RELATIVE_TOLERANCE (2*ulp(1d)) -> NumberIsTooSmallException. */
    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorRelTooSmall() {
        new PowellOptimizer(1e-20, 1e-10);
    }

    /** abs == 0 -> NotStrictlyPositiveException. */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsZero() {
        new PowellOptimizer(1e-7, 0);
    }

    /** abs < 0 -> NotStrictlyPositiveException. */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAbsNegative() {
        new PowellOptimizer(1e-7, -1e-10);
    }

    /** Boundary: rel == MIN_RELATIVE_TOLERANCE exactly should NOT throw. */
    @Test
    public void testConstructorRelAtBoundaryAccepted() {
        double minRel = 2 * Math.ulp(1d);
        PowellOptimizer optimizer = new PowellOptimizer(minRel, 1e-10);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorTwoArgDelegatesToNullChecker() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-7, 1e-10);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorWithChecker() {
        ConvergenceChecker<PointValuePair> checker =
            new ConvergenceChecker<PointValuePair>() {
                public boolean converged(int it, PointValuePair p, PointValuePair c) {
                    return false;
                }
            };
        PowellOptimizer optimizer = new PowellOptimizer(1e-7, 1e-10, checker);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorFourArgs() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-7, 1e-10, 1e-7, 1e-10);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorFiveArgsFullPath() {
        ConvergenceChecker<PointValuePair> checker =
            new ConvergenceChecker<PointValuePair>() {
                public boolean converged(int it, PointValuePair p, PointValuePair c) {
                    return false;
                }
            };
        PowellOptimizer optimizer =
            new PowellOptimizer(1e-7, 1e-10, 1e-7, 1e-10, checker);
        assertNotNull(optimizer);
    }

    // ===================================================================
    // checkParameters() -> bounds not supported
    // ===================================================================

    /** getLowerBound()/getUpperBound() != null -> MathUnsupportedOperationException. */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimizeWithBoundsThrows() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-7, 1e-10);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 1) * (point[0] - 1);
            }
        };
        optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0}),
            new SimpleBounds(new double[]{-10}, new double[]{10})
        );
    }

    // ===================================================================
    // Core doOptimize(): MINIMIZE / MAXIMIZE, 1D and 2D
    // ===================================================================

    @Test
    public void testOptimize1DQuadraticMinimize() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0];
                return (x - 3) * (x - 3) + 5;
            }
        };
        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0})
        );
        assertEquals(3.0, result.getPoint()[0], 1e-4);
        assertEquals(5.0, result.getValue(), 1e-4);
    }

    @Test
    public void testOptimize1DQuadraticMaximize() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0];
                return -(x - 2) * (x - 2) + 10;
            }
        };
        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(f),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[]{0})
        );
        assertEquals(2.0, result.getPoint()[0], 1e-4);
        assertEquals(10.0, result.getValue(), 1e-4);
    }

    /** 2D, exercises the inner for-loop over dimensions (i=0,1) and bigInd update. */
    @Test
    public void test2DQuadraticMinimize() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0], y = point[1];
                return (x - 1) * (x - 1) + (y - 2) * (y - 2);
            }
        };
        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0, 0})
        );
        assertEquals(1.0, result.getPoint()[0], 1e-4);
        assertEquals(2.0, result.getPoint()[1], 1e-4);
        assertEquals(0.0, result.getValue(), 1e-4);
    }

    /**
     * Rosenbrock function: nontrivial curved valley, likely to exercise the
     * "fX > fX2" branch together with "t < 0.0" branch (direction replacement
     * logic), which simple separable quadratics do not trigger.
     */
    @Test
    public void testRosenbrockFunctionMinimize() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction rosenbrock = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0], y = point[1];
                return 100 * (y - x * x) * (y - x * x) + (1 - x) * (1 - x);
            }
        };
        PointValuePair result = optimizer.optimize(
            new MaxEval(100000),
            new ObjectiveFunction(rosenbrock),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{-1.2, 1})
        );
        assertEquals(1.0, result.getPoint()[0], 1e-3);
        assertEquals(1.0, result.getPoint()[1], 1e-3);
        assertEquals(0.0, result.getValue(), 1e-3);
    }

    // ===================================================================
    // Convergence checker: user-defined stop condition
    // ===================================================================

    /** checker.converged() == true -> stop = true via user-defined branch. */
    @Test
    public void testOptimizeWithCustomCheckerAlwaysConverged() {
        ConvergenceChecker<PointValuePair> checker =
            new ConvergenceChecker<PointValuePair>() {
                public boolean converged(int it, PointValuePair p, PointValuePair c) {
                    return true;
                }
            };
        PowellOptimizer optimizer = new PowellOptimizer(1e-14, 1e-14, checker);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 5) * (point[0] - 5);
            }
        };
        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0})
        );
        assertNotNull(result);
    }

    /** checker.converged() == false -> relies on default stopping criterion. */
    @Test
    public void testOptimizeWithCustomCheckerNeverConverged() {
        ConvergenceChecker<PointValuePair> checker =
            new ConvergenceChecker<PointValuePair>() {
                public boolean converged(int it, PointValuePair p, PointValuePair c) {
                    return false;
                }
            };
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10, checker);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 5) * (point[0] - 5);
            }
        };
        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0})
        );
        assertEquals(5.0, result.getPoint()[0], 1e-3);
    }

    // ===================================================================
    // Boundary / exceptional evaluation-count behavior
    // ===================================================================

    /** Very small MaxEval should trigger TooManyEvaluationsException. */
    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimizeTooManyEvaluations() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-12, 1e-12);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 5) * (point[0] - 5)
                     + (point[1] + 3) * (point[1] + 3);
            }
        };
        optimizer.optimize(
            new MaxEval(3), // too small to converge
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0, 0})
        );
    }

    // ===================================================================
    // Starting exactly at the optimum: fVal == fX at first iteration,
    // exercising the default-stop boundary (2*(fX-fVal) <= threshold).
    // ===================================================================

    @Test
    public void testOptimizeStartAtMinimum() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 2) * (point[0] - 2);
            }
        };
        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{2})
        );
        assertEquals(2.0, result.getPoint()[0], 1e-6);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimizeSingleDimensionAbsFunction() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-8, 1e-8);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return Math.abs(point[0] - 7) + 1;
            }
        };
        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0})
        );
        assertEquals(7.0, result.getPoint()[0], 1e-3);
    }

    // ===================================================================
    // Edge case: zero-dimensional input.
    // NOTE: ซอร์สโค้ดไม่ได้ validate ความยาวของ guess อย่างชัดเจน
    // เราจึงทดสอบว่าเมื่อ n=0 อัลกอริทึมไม่ throw และคืนค่าได้
    // (ไม่ guess behavior อื่นนอกจากไม่ throw/ terminate)
    // ===================================================================

    @Test
    public void testOptimizeZeroDimensionDoesNotThrow() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-7, 1e-10);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return 42.0; // constant, independent of (empty) point
            }
        };
        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{})
        );
        assertEquals(42.0, result.getValue(), 1e-9);
        assertEquals(0, result.getPoint().length);
    }

    // ===================================================================
    // Negative / asymmetric function values for MINIMIZE direction branch
    // ===================================================================

    @Test
    public void testOptimizeNegativeValuedFunction() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0];
                return -100 + (x + 4) * (x + 4);
            }
        };
        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{10})
        );
        assertEquals(-4.0, result.getPoint()[0], 1e-3);
        assertEquals(-100.0, result.getValue(), 1e-3);
    }
}
```

## หมายเหตุสำคัญ (ตามข้อกำหนดที่ 4)

- Branch `return (fVal < fX) ? current : previous;` (และฉบับ MAXIMIZE) ไม่สามารถ control ได้ตรง ๆ จาก black-box test เพราะขึ้นกับพฤติกรรม internal ของ Brent line-search ในแต่ละรอบ — การทดสอบของเราครอบคลุม "ฝั่งปรับปรุงได้" (fVal ดีกว่า) เป็นหลัก ฝั่ง `previous` เป็น branch ที่ยากจะบังคับโดยไม่ mock internal state จึงไม่ได้สร้าง test แยกเฉพาะ และไม่ขอเดา behavior เพิ่มเติม
- Branch `t < 0.0` (การแทนที่ direction vector) คาดว่าจะถูกกระตุ้นโดย Rosenbrock test (ฟังก์ชันไม่ separable/มี curvature) แต่ไม่สามารถยืนยัน 100% จาก source เพียงอย่างเดียวว่าจะเกิดขึ้นแน่นอนในทุกรัน — ใส่คอมเมนต์กำกับไว้แล้ว
- การทดสอบ `testOptimizeZeroDimensionDoesNotThrow` เป็นการทดสอบ edge case ที่ source ไม่ได้ validate ไว้อย่างชัดเจน จึงทดสอบเพียงว่าไม่ throw exception ไม่ guess ผลลัพธ์อื่นเกินจากที่ logic แสดงไว้

## ตารางสรุป Test → Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorRelTooSmall` | `if (rel < MIN_RELATIVE_TOLERANCE)` → true, throw `NumberIsTooSmallException` |
| `testConstructorAbsZero` | `if (abs <= 0)` → true (abs==0), throw `NotStrictlyPositiveException` |
| `testConstructorAbsNegative` | `if (abs <= 0)` → true (abs<0) |
| `testConstructorRelAtBoundaryAccepted` | `if (rel < MIN_RELATIVE_TOLERANCE)` → false (boundary case, equal) |
| `testConstructorTwoArgDelegatesToNullChecker` | Constructor overload 2-arg → delegate to `this(rel, abs, null)` |
| `testConstructorWithChecker` | Constructor overload 3-arg (rel, abs, checker) |
| `testConstructorFourArgs` | Constructor overload 4-arg (rel, abs, lineRel, lineAbs) |
| `testConstructorFiveArgsFullPath` | Constructor overload 5-arg เต็มรูปแบบ |
| `testOptimizeWithBoundsThrows` | `checkParameters()`: `getLowerBound()!=null \|\| getUpperBound()!=null` → true, throw `MathUnsupportedOperationException` |
| `testOptimize1DQuadraticMinimize` | `doOptimize()` main loop, `goal==GoalType.MINIMIZE`, stop=true, `fVal<fX`→return `current` |
| `testOptimize1DQuadraticMaximize` | `goal!=MINIMIZE` (else), `fVal>fX`→return `current` |
| `test2DQuadraticMinimize` | inner `for (i=0;i<n;i++)` loop (n=2), `bigInd` update branch `(fX2-fVal)>delta` |
| `testRosenbrockFunctionMinimize` | `if (fX > fX2)` → true, และ (คาดว่า) `if (t<0.0)` → true, direction replace |
| `testOptimizeWithCustomCheckerAlwaysConverged` | `if (!stop)` → true, `checker!=null`→true, `checker.converged()`→true |
| `testOptimizeWithCustomCheckerNeverConverged` | `checker.converged()`→false, rely on default stop condition |
| `testOptimizeTooManyEvaluations` | Exception path จาก `line.search()`/`computeObjectiveValue()` เมื่อ eval เกิน MaxEval |
| `testOptimizeStartAtMinimum` | Default stop condition boundary: `2*(fX-fVal) <= threshold` ตั้งแต่ iteration แรก |
| `testOptimizeSingleDimensionAbsFunction` | n=1 (minimal loop body), non-smooth function |
| `testOptimizeZeroDimensionDoesNotThrow` | n=0, loop `for(i=0;i<n;i++)` ไม่ execute เลย (edge case) |
| `testOptimizeNegativeValuedFunction` | ค่า function เป็นลบ, ทดสอบ `relativeThreshold*(abs(fX)+abs(fVal))` คำนวณถูกต้องกับค่าลบ |