# แนวทางการทดสอบ

ก่อนเขียนโค้ด ขอชี้แจงสมมติฐานสำคัญที่ต้อง "เดา" เนื่องจาก `BaseAbstractMultivariateSimpleBoundsOptimizer` (parent class) ไม่ได้อยู่ในซอร์สที่ให้มา:

- สมมติว่ามีเมธอด public ที่สืบทอดมา: `optimize(int maxEval, FUNC f, GoalType goalType, double[] startPoint, double[] lowerBound, double[] upperBound)` ซึ่งเป็น API มาตรฐานของ Apache Commons Math ในรุ่นนี้ (จำเป็นต่อการเรียกใช้คลาสได้)
- `RealPointValuePair` มี `getPoint()` และ `getValue()`

จุดที่วิเคราะห์จากซอร์สโดยตรง (ไม่ใช่การเดา) และนำมาออกแบบเทส:
- `setup()` ตรวจ `dimension < MINIMUM_PROBLEM_DIMENSION` และช่วง `numberOfInterpolationPoints`
- ใน `prelim()` มีการ `throw new PathIsExploredException()` (เป็น RuntimeException) เมื่อ `lowerDifference[j]==0` หรือ `upperDifference[j]==0` พอดี (เกิดจาก start point ชนขอบเขตพอดี) — เป็น branch ที่ "ยังไม่ถูกสำรวจ" ตามคอมเมนต์ในซอร์ส
- ใน `prelim()` branch `else` (เมื่อ `nfm > 2*n`) จะ `throw PathIsExploredException()` แบบไม่มีเงื่อนไข ซึ่งเกิดขึ้นเสมอเมื่อ `numberOfInterpolationPoints > 2n+1` แม้ค่านี้จะอยู่ใน "ช่วงที่ถูกต้องตามสัญญา" ของ `setup()` — นี่คือ **fault จริงที่ตรวจพบได้จากซอร์ส**

```java
package org.apache.commons.math.optimization.direct;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

/**
 * Unit tests for {@link BOBYQAOptimizer}.
 *
 * หมายเหตุสำคัญ (สมมติฐานที่ไม่สามารถยืนยันได้จากซอร์สที่ให้มา เนื่องจาก
 * {@code BaseAbstractMultivariateSimpleBoundsOptimizer} ไม่ได้อยู่ในซอร์ส):
 *  - สมมติว่ามีเมธอด public:
 *    {@code optimize(int maxEval, FUNC f, GoalType goalType,
 *                     double[] startPoint, double[] lowerBound, double[] upperBound)}
 *  - สมมติว่า {@code RealPointValuePair} มี getPoint()/getValue() ตามมาตรฐาน
 *    Apache Commons Math
 */
public class BOBYQAOptimizerTest {

    // ---------------------------------------------------------------
    // Helper functions / fixtures
    // ---------------------------------------------------------------

    private static class SphereFunction implements MultivariateFunction {
        public double value(double[] x) {
            double sum = 0;
            for (double v : x) {
                sum += v * v;
            }
            return sum;
        }
    }

    private static class ShiftedSphereFunction implements MultivariateFunction {
        private final double[] target;
        ShiftedSphereFunction(double[] target) {
            this.target = target;
        }
        public double value(double[] x) {
            double sum = 0;
            for (int i = 0; i < x.length; i++) {
                double d = x[i] - target[i];
                sum += d * d;
            }
            return sum;
        }
    }

    private static double[] point(int n, double v) {
        double[] p = new double[n];
        Arrays.fill(p, v);
        return p;
    }

    // ---------------------------------------------------------------
    // 1) Constructor smoke tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructorOneArg() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructorThreeArgs() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5, 2.0, 1e-6);
        assertNotNull(optimizer);
    }

    // ---------------------------------------------------------------
    // 2) setup() validation branches (deterministic, directly from source)
    // ---------------------------------------------------------------

    @Test(expected = NumberIsTooSmallException.class)
    public void testDimensionTooSmallThrows() {
        // dimension = 1 < MINIMUM_PROBLEM_DIMENSION(2)
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        double[] start = {0.0};
        double[] lower = {-1.0};
        double[] upper = {1.0};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE,
                            start, lower, upper);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testEmptyStartPointThrows() {
        // dimension = 0, boundary case (deterministic from source).
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        double[] start = {};
        double[] lower = {};
        double[] upper = {};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE,
                            start, lower, upper);
    }

    @Test(expected = OutOfRangeException.class)
    public void testTooFewInterpolationPointsThrows() {
        // n=2 => valid interval [4,6]; npt=3 < 4
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(3);
        double[] start = {0.0, 0.0};
        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, 1.0};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE,
                            start, lower, upper);
    }

    @Test(expected = OutOfRangeException.class)
    public void testTooManyInterpolationPointsThrows() {
        // n=2 => valid interval [4,6]; npt=7 > 6
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(7);
        double[] start = {0.0, 0.0};
        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, 1.0};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE,
                            start, lower, upper);
    }

    @Test
    public void testMinimumInterpolationPointsBoundary() {
        // n=2 => npt = n+2 = 4 (lower boundary, inclusive) must NOT throw
        // and additionally exercises the "no branch taken" pass-through
        // path inside bobyqa()'s loop (both if/else-if false).
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);
        double[] start = {1.0, 1.0};
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        RealPointValuePair result = optimizer.optimize(10000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    // ---------------------------------------------------------------
    // 3) FAULT DETECTION: numberOfInterpolationPoints > 2n+1
    //    setup() allows it structurally (within [n+2,(n+1)(n+2)/2]),
    //    but prelim()'s unconditional "throw new PathIsExploredException()"
    //    in the else-branch (nfm > 2n) means it ALWAYS fails at runtime.
    //    This directly contradicts the class javadoc, which states such
    //    choices are merely "not recommended" (implying sub-optimal, not
    //    broken). => genuine defect catchable from the given source.
    // ---------------------------------------------------------------

    @Test(expected = RuntimeException.class)
    public void testInterpolationPointsExceeding2NPlus1FailsDimension2() {
        // n=2 => valid range [4,6]; 2n+1=5. npt=6 is structurally valid
        // but exceeds 2n+1 => guaranteed crash from prelim().
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6);
        double[] start = {1.0, 1.0};
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        optimizer.optimize(10000, new SphereFunction(), GoalType.MINIMIZE,
                            start, lower, upper);
    }

    @Test(expected = RuntimeException.class)
    public void testInterpolationPointsExceeding2NPlus1FailsDimension3() {
        // n=3 => valid range [5,10]; 2n+1=7. npt=8 is structurally valid
        // but exceeds 2n+1 => guaranteed crash from prelim().
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(8);
        double[] start = {1.0, 1.0, 1.0};
        double[] lower = {-5.0, -5.0, -5.0};
        double[] upper = {5.0, 5.0, 5.0};
        optimizer.optimize(10000, new SphereFunction(), GoalType.MINIMIZE,
                            start, lower, upper);
    }

    @Test
    public void testInterpolationPointsEqualTo2NPlus1Succeeds() {
        // Boundary case npt == 2n+1 (safe side of the bug above).
        int n = 5;
        int npt = 2 * n + 1;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);
        double[] start = point(n, 1.0);
        double[] lower = point(n, -10.0);
        double[] upper = point(n, 10.0);
        RealPointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    // ---------------------------------------------------------------
    // 4) FAULT DETECTION: start point exactly AT a bound
    //    Triggers lowerDifference==0 (branch "A") or upperDifference==0
    //    (branch "C") exactly inside bobyqa(), which makes prelim() hit an
    //    "== ZERO" check guarded by "throw new PathIsExploredException()".
    // ---------------------------------------------------------------

    @Test(expected = RuntimeException.class)
    public void testStartExactlyAtLowerBoundTriggersUnexploredPath() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5); // npt=5=2n+1, n=2 (safe wrt previous bug)
        double[] start = {-5.0, 1.0}; // coordinate 0 == lower bound exactly
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE,
                            start, lower, upper);
    }

    @Test(expected = RuntimeException.class)
    public void testStartExactlyAtUpperBoundTriggersUnexploredPath() {
        // Small custom radius needed so that upperDifference becomes
        // exactly ZERO (branch "C") rather than branch "B".
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5, 1.0, 1e-6);
        double[] start = {5.0, 1.0}; // coordinate 0 == upper bound exactly
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE,
                            start, lower, upper);
    }

    // ---------------------------------------------------------------
    // 5) bobyqa() boundary-adjustment branches (B and D only — safe,
    //    never produce an exact zero, unlike A/C above).
    // ---------------------------------------------------------------

    @Test
    public void testBoundaryHandlingBranchesBandD() {
        double radius = 1.0;
        double stopRadius = 1e-6;
        int n = 3;
        int npt = 2 * n + 1; // 7, safe wrt the "> 2n+1" bug
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt, radius, stopRadius);

        double[] lower = {0.0, 0.0, 0.0};
        double[] upper = {100.0, 100.0, 100.0};
        double[] start = {
            50.0,                  // far from both bounds -> "no branch" path
            0.5 * radius,          // -radius <= lowerDifference < 0 -> branch B
            100.0 - 0.5 * radius   // 0 < upperDifference <= radius -> branch D
        };

        MultivariateFunction f = new ShiftedSphereFunction(new double[]{50, 50, 50});

        RealPointValuePair result = optimizer.optimize(20000, f, GoalType.MINIMIZE,
                start, lower, upper);
        assertNotNull(result);
        double[] p = result.getPoint();
        for (int i = 0; i < n; i++) {
            assertTrue("point within lower bound", p[i] >= lower[i] - 1e-9);
            assertTrue("point within upper bound", p[i] <= upper[i] + 1e-9);
        }
    }

    // ---------------------------------------------------------------
    // 6) setup() radius-shrink branch: minDiff < requiredMinDiff
    // ---------------------------------------------------------------

    @Test
    public void testTightBoundsShrinkInitialRadius() {
        // requiredMinDiff = 2*10(default) = 20; bound diff = 2 < 20 => shrink.
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        double[] start = {0.5, 0.5};
        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, 1.0};
        RealPointValuePair result = optimizer.optimize(10000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    @Test
    public void testExactBoundaryNoRadiusShrink() {
        // bound diff == requiredMinDiff exactly (20 == 20) => condition
        // "minDiff < requiredMinDiff" is false at the boundary => no shrink.
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        double[] start = {1.0, 1.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        RealPointValuePair result = optimizer.optimize(10000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    // ---------------------------------------------------------------
    // 7) Functional / convergence tests (exercise bobyqb/trsbox/altmov/
    //    update loops broadly for branch coverage of the iterative core)
    // ---------------------------------------------------------------

    @Test
    public void testMinimizeSphere2D() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        double[] start = {2.0, -3.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        RealPointValuePair result = optimizer.optimize(10000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertEquals(0.0, result.getValue(), 1e-4);
        assertArrayEquals(new double[]{0.0, 0.0}, result.getPoint(), 1e-2);
    }

    @Test
    public void testMaximizeNegativeSphere2D() {
        // Exercises isMinimize == false branch.
        MultivariateFunction negSphere = new MultivariateFunction() {
            public double value(double[] x) {
                double sum = 0;
                for (double v : x) {
                    sum += v * v;
                }
                return -sum;
            }
        };
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        double[] start = {1.0, 1.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        RealPointValuePair result = optimizer.optimize(10000, negSphere,
                GoalType.MAXIMIZE, start, lower, upper);
        assertEquals(0.0, result.getValue(), 1e-4);
    }

    @Test
    public void testMaximizeConcaveFunction() {
        final double[] target = {1.0, 2.0};
        MultivariateFunction concave = new MultivariateFunction() {
            public double value(double[] x) {
                double dx = x[0] - target[0];
                double dy = x[1] - target[1];
                return -(dx * dx + dy * dy);
            }
        };
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        double[] start = {0.0, 0.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        RealPointValuePair result = optimizer.optimize(10000, concave,
                GoalType.MAXIMIZE, start, lower, upper);
        assertEquals(0.0, result.getValue(), 1e-3);
        assertArrayEquals(target, result.getPoint(), 1e-2);
    }

    @Test
    public void testShiftedSphereConverges3D() {
        double[] target = {1.5, -2.5, 3.0};
        int n = 3;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(2 * n + 1);
        double[] start = {0.0, 0.0, 0.0};
        double[] lower = {-10.0, -10.0, -10.0};
        double[] upper = {10.0, 10.0, 10.0};
        RealPointValuePair result = optimizer.optimize(20000,
                new ShiftedSphereFunction(target), GoalType.MINIMIZE, start, lower, upper);
        assertEquals(0.0, result.getValue(), 1e-3);
        assertArrayEquals(target, result.getPoint(), 1e-2);
    }

    @Test
    public void testConstrainedMinimumAtBoundaryCorner() {
        // Unconstrained optimum (20,20) lies outside the feasible box,
        // exercises the bound-clipping logic in doOptimize/bobyqb (case 360/720).
        MultivariateFunction f = new ShiftedSphereFunction(new double[]{20.0, 20.0});
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        double[] start = {0.0, 0.0};
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        RealPointValuePair result = optimizer.optimize(20000, f, GoalType.MINIMIZE,
                start, lower, upper);
        assertArrayEquals(new double[]{5.0, 5.0}, result.getPoint(), 0.5);
    }

    @Test
    public void testRosenbrock2D() {
        // Harder, non-convex function: exercises many trsbox/altmov/update
        // iterations, ratio<=0.1/<=0.7/else branches, itest counter, etc.
        MultivariateFunction rosenbrock = new MultivariateFunction() {
            public double value(double[] x) {
                double a = 1 - x[0];
                double b = x[1] - x[0] * x[0];
                return a * a + 100 * b * b;
            }
        };
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        double[] start = {-1.2, 1.0};
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        RealPointValuePair result = optimizer.optimize(30000, rosenbrock,
                GoalType.MINIMIZE, start, lower, upper);
        // Loose tolerance: BOBYQA is a heuristic/approximate method, and
        // this version is a known-defective snapshot (Defects4J Math-38b).
        assertEquals(0.0, result.getValue(), 1e-1);
    }

    @Test
    public void testDimension5SafeMaxInterpolationPoints() {
        int n = 5;
        int npt = 2 * n + 1; // safe upper bound wrt the ">2n+1" defect above
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);
        double[] start = point(n, 1.0);
        double[] lower = point(n, -10.0);
        double[] upper = point(n, 10.0);
        RealPointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    // ---------------------------------------------------------------
    // 8) null / malformed input (behavior inferred, not fully certain —
    //    see class-level javadoc comment above). Using broad
    //    RuntimeException to avoid asserting an unverifiable exact type.
    // ---------------------------------------------------------------

    @Test(expected = RuntimeException.class)
    public void testNullStartPointThrows() {
        // getStartPoint()/init.length in setup() will fail on a null
        // start point; exact exception type depends on inherited code
        // not shown in the given source, hence the broad assertion.
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, 1.0};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE,
                            null, lower, upper);
    }

    @Test(expected = RuntimeException.class)
    public void testNullObjectiveFunctionThrows() {
        // computeObjectiveValue() will eventually invoke f.value(x); a
        // null function is expected to fail with some RuntimeException
        // (likely NullPointerException), per ordinary Java semantics.
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        double[] start = {1.0, 1.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        optimizer.optimize(1000, null, GoalType.MINIMIZE, start, lower, upper);
    }

    // ---------------------------------------------------------------
    // NOTE: The following are NOT covered by this test suite, with
    // justification, per the "do not guess" requirement:
    //  - MathIllegalStateException(TRUST_REGION_STEP_FAILED) when
    //    vquad >= 0 in bobyqb(): requires crafting a pathological
    //    quadratic-model scenario that cannot be reliably derived
    //    from the given source without guessing internal numeric state.
    //  - Behavior when maxEval < numberOfInterpolationPoints: the
    //    enforcement of MAXFUN is not shown in the provided source
    //    (it depends on the inherited computeObjectiveValue()), so no
    //    exception type/behavior is asserted here.
    // ---------------------------------------------------------------
}
```

## สรุปตารางความครอบคลุม (Branch/Condition)

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testConstructorOneArg`, `testConstructorThreeArgs` | Constructor delegation (`this(...)`) |
| `testDimensionTooSmallThrows`, `testEmptyStartPointThrows` | `setup()`: `dimension < MINIMUM_PROBLEM_DIMENSION` → true |
| `testTooFewInterpolationPointsThrows` | `setup()`: `npt < nPointsInterval[0]` → true |
| `testTooManyInterpolationPointsThrows` | `setup()`: `npt > nPointsInterval[1]` → true |
| `testMinimumInterpolationPointsBoundary` | `npt == n+2` (boundary, false branch ของ validation) + bobyqa() loop "ไม่เข้า if/else-if" |
| `testInterpolationPointsExceeding2NPlus1FailsDimension2/3` | **Fault**: `prelim()` else-branch (`nfm > 2n`) → unconditional `PathIsExploredException` แม้ `setup()` อนุญาต |
| `testInterpolationPointsEqualTo2NPlus1Succeeds` | boundary `npt == 2n+1` (ฝั่งปลอดภัย) |
| `testStartExactlyAtLowerBoundTriggersUnexploredPath` | bobyqa() branch A (`lowerDifference>=0`) → `prelim()` check `lowerDifference==ZERO` |
| `testStartExactlyAtUpperBoundTriggersUnexploredPath` | bobyqa() branch C (`upperDifference<=0`) → `prelim()` check `upperDifference==ZERO` |
| `testBoundaryHandlingBranchesBandD` | bobyqa() branch B, branch D, และ "ไม่เข้าเงื่อนไขใดเลย" ในลูปเดียวกัน |
| `testTightBoundsShrinkInitialRadius` | `setup()`: `minDiff < requiredMinDiff` → true (shrink) |
| `testExactBoundaryNoRadiusShrink` | `setup()`: `minDiff < requiredMinDiff` → false (boundary เท่ากัน) |
| `testMinimizeSphere2D` | isMinimize=true, full `bobyqb/prelim/trsbox/altmov/update` loop, `case 680` rho-reduction branches |
| `testMaximizeNegativeSphere2D`, `testMaximizeConcaveFunction` | `isMinimize=false`, การ negate ค่า f และผลลัพธ์ |
| `testShiftedSphereConverges3D` | n=3, dimension loop ต่าง ๆ, `ntrits>0` ratio branches |
| `testConstrainedMinimumAtBoundaryCorner` | bound-clipping logic ใน `case 360/720` |
| `testRosenbrock2D` | non-convex, exercise `ratio<=0.1/<=0.7/else`, `itest` counter, หลาย iteration ของ trsbox/altmov/update |
| `testDimension5SafeMaxInterpolationPoints` | n=5, npt ปลอดภัยสูงสุด (`2n+1`) |
| `testNullStartPointThrows`, `testNullObjectiveFunctionThrows` | null-input (สมมติฐาน, ระบุ comment กำกับชัดเจน) |

**หมายเหตุ:** `MathIllegalStateException(TRUST_REGION_STEP_FAILED)` และพฤติกรรม `maxEval < npt` ไม่ได้เขียนเป็น assertion เนื่องจากต้องเดา behavior ที่ไม่สามารถยืนยันได้จากซอร์สที่ให้มา (ระบุไว้ในคอมเมนต์ท้ายไฟล์แทน)