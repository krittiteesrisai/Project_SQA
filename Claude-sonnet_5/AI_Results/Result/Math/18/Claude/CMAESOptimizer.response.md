# วิเคราะห์และแนวทางการทดสอบ

**ข้อสังเกตสำคัญ:**
- เมธอด `doOptimize()`, `checkParameters()`, `initializeCMA()`, `updateCovariance*()`, `updateBD()` เป็น **private** จึงทดสอบได้เฉพาะผ่าน public API คือ constructors และ `optimize(...)` ที่สืบทอดมาจาก `BaseAbstractMultivariateSimpleBoundsOptimizer<MultivariateFunction>`
- **สมมติฐาน (ไม่มีซอร์สของ base class ให้ดู):** `optimize(int maxEval, FUNC f, GoalType goalType, double[] startPoint)` และ `optimize(int maxEval, FUNC f, GoalType goalType, double[] startPoint, double[] lower, double[] upper)` เป็น signature มาตรฐานของ commons-math3 — กำกับไว้ด้วยคอมเมนต์ในโค้ด
- Branch ใน `checkParameters()` ทดสอบได้แบบ deterministic 100% เพราะเรียกก่อนมีการใช้ random ใดๆ
- Branch ใน `doOptimize()` loop ทดสอบแบบ smoke-test โดยใช้ seeded `MersenneTwister` เพื่อลดความไม่แน่นอน และใช้ tolerance แบบหลวมเพื่อลด flakiness

```java
package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.junit.Test;

/**
 * Unit tests for {@link CMAESOptimizer} (Defects4J Math-18b).
 *
 * หมายเหตุ: optimize(...) เป็นเมธอดที่สืบทอดมาจาก
 * BaseAbstractMultivariateSimpleBoundsOptimizer ซึ่งไม่มีซอร์สให้ในโจทย์
 * จึงสมมติ signature มาตรฐานของ commons-math3:
 *   optimize(int maxEval, FUNC f, GoalType goalType, double[] startPoint)
 *   optimize(int maxEval, FUNC f, GoalType goalType, double[] startPoint,
 *            double[] lower, double[] upper)
 * หากสมมติฐานนี้ผิด ต้องปรับ test ให้ตรงกับ signature จริง
 */
public class CMAESOptimizerTest {

    // ---------- Helper objective functions ----------------------------------

    /** f(x) = sum(x_i^2), global minimum = 0 at x = 0. */
    private static class SphereFunction implements MultivariateFunction {
        public double value(double[] x) {
            double s = 0;
            for (double v : x) {
                s += v * v;
            }
            return s;
        }
    }

    /** f(x) = -sum(x_i^2), global maximum = 0 at x = 0. */
    private static class NegSphereFunction implements MultivariateFunction {
        public double value(double[] x) {
            double s = 0;
            for (double v : x) {
                s += v * v;
            }
            return -s;
        }
    }

    private static double[] point(int n, double value) {
        double[] d = new double[n];
        Arrays.fill(d, value);
        return d;
    }

    // ===================== checkParameters() branches =======================

    /** ไม่มี bound เลย (ทุกมิติ -Inf/+Inf) -> hasFiniteBounds=false, boundaries=null. */
    @Test
    public void testNoBoundsBranch() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0, point(2, 0.3));
        double[] start = {1.0, 1.0};
        PointValuePair result = optimizer.optimize(2000, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertEquals(2, result.getPoint().length);
    }

    /** bound ที่จำกัดครบทุกมิติ -> hasFiniteBounds=true, hasInfiniteBounds=false. */
    @Test
    public void testFiniteBoundsBranch() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0, point(2, 0.3));
        double[] start = {0.5, 0.5};
        double[] lower = {0.0, 0.0};
        double[] upper = {1.0, 1.0};
        PointValuePair result = optimizer.optimize(2000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
        for (int i = 0; i < 2; i++) {
            assertTrue(result.getPoint()[i] >= lower[i] - 1e-9);
            assertTrue(result.getPoint()[i] <= upper[i] + 1e-9);
        }
    }

    /** ผสมกันระหว่าง bound จำกัดและ infinite -> ต้อง throw MathUnsupportedOperationException. */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testMixedFiniteInfiniteBoundsThrows() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        double[] start = {0.0, 0.0};
        double[] lower = {-1.0, Double.NEGATIVE_INFINITY};
        double[] upper = {1.0, Double.POSITIVE_INFINITY};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
    }

    /** ขอบเขตทำให้ (upper - lower) overflow เป็น Infinity -> NumberIsTooLargeException. */
    @Test(expected = NumberIsTooLargeException.class)
    public void testBoundsOverflowThrows() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        double[] start = {0.0};
        double[] lower = {-Double.MAX_VALUE};
        double[] upper = {Double.MAX_VALUE};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
    }

    /** inputSigma.length != init.length -> DimensionMismatchException. */
    @Test(expected = DimensionMismatchException.class)
    public void testInputSigmaDimensionMismatchThrows() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0, new double[] {1.0, 2.0});
        double[] start = {0.0, 0.0, 0.0}; // length 3 != sigma length 2
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, start);
    }

    /** inputSigma[i] < 0 -> NotPositiveException. */
    @Test(expected = NotPositiveException.class)
    public void testInputSigmaNegativeThrows() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0, new double[] {1.0, -0.5});
        double[] start = {0.0, 0.0};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, start);
    }

    /** inputSigma[i] > (upper[i]-lower[i]) เมื่อมี boundaries -> OutOfRangeException. */
    @Test(expected = OutOfRangeException.class)
    public void testInputSigmaOutOfRangeThrows() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0, new double[] {5.0, 5.0});
        double[] start = {0.0, 0.0};
        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, 1.0}; // range = 2 < sigma 5
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
    }

    /** inputSigma == null -> ข้าม block ตรวจสอบ sigma ทั้งหมด (ไม่ throw). */
    @Test
    public void testNullInputSigmaDoesNotThrow() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0, null);
        double[] start = {1.0, 1.0};
        PointValuePair result = optimizer.optimize(2000, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
    }

    // ===================== initializeCMA() / doOptimize() branches ==========

    /** lambda <= 0 -> คำนวณ population size อัตโนมัติ (ไม่ throw, ได้ผลลัพธ์สมเหตุสมผล). */
    @Test
    public void testAutoLambdaComputation() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                0, point(2, 0.3), 1000, 0, true, 0, 0,
                new MersenneTwister(42L), false, new SimpleValueChecker(1e-13, 1e-13));
        double[] start = {3.0, -3.0};
        PointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
        // ไม่ assert ค่าแบบเข้มงวดเกินไปเพราะเป็น stochastic algorithm
        assertEquals(0.0, result.getValue(), 1.0);
    }

    /** lambda กำหนดเอง (explicit > 0) -> ข้าม branch auto-computation. */
    @Test
    public void testExplicitLambda() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, point(2, 0.3), 1000, 0, true, 0, 0,
                new MersenneTwister(1234L), false, new SimpleValueChecker(1e-13, 1e-13));
        double[] start = {2.0, 2.0};
        PointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1.0);
    }

    /** isActiveCMA = true -> branch "active CMA" ใน updateCovariance(). */
    @Test
    public void testActiveCMATrueBranch() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, point(2, 0.3), 2000, 0, true, 0, 0,
                new MersenneTwister(7L), false, new SimpleValueChecker(1e-13, 1e-13));
        double[] start = {2.0, 2.0};
        PointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1.0);
    }

    /** isActiveCMA = false -> branch "non-active CMA" (else) ใน updateCovariance(). */
    @Test
    public void testActiveCMAFalseBranch() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, point(2, 0.3), 2000, 0, false, 0, 0,
                new MersenneTwister(7L), false, new SimpleValueChecker(1e-13, 1e-13));
        double[] start = {2.0, 2.0};
        PointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1.0);
    }

    /** diagonalOnly > 0 -> ใช้ updateCovarianceDiagonalOnly() และมีโอกาสเปลี่ยนกลับเป็น full matrix
     *  เมื่อ diagonalOnly > 1 && iterations > diagonalOnly. */
    @Test
    public void testDiagonalOnlyBranchAndTransition() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                10, point(3, 0.3), 5000, 0, true, 2, 0,
                new MersenneTwister(99L), false, new SimpleValueChecker(1e-13, 1e-13));
        double[] start = {1.5, -1.5, 1.0};
        PointValuePair result = optimizer.optimize(30000, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertEquals(3, result.getPoint().length);
    }

    /** stopFitness == 0 (default) -> branch "if (stopFitness != 0)" เป็น false เสมอ. */
    @Test
    public void testStopFitnessZeroBranch() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0); // stopFitness = DEFAULT_STOPFITNESS = 0
        double[] start = {1.0, 1.0};
        PointValuePair result = optimizer.optimize(2000, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
    }

    /** GoalType.MAXIMIZE -> isMinimize=false, ครอบคลุม sign-handling ใน FitnessFunction/doOptimize. */
    @Test
    public void testMaximizeGoalType() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, point(2, 0.3), 2000, 0, true, 0, 0,
                new MersenneTwister(55L), false, new SimpleValueChecker(1e-13, 1e-13));
        double[] start = {1.5, -1.5};
        PointValuePair result = optimizer.optimize(20000, new NegSphereFunction(),
                GoalType.MAXIMIZE, start);
        assertNotNull(result);
        // ค่าสูงสุดของ -sum(x^2) คือ 0
        assertEquals(0.0, result.getValue(), 1.0);
    }

    /** checkFeasableCount > 0 -> loop regenerate arz เมื่อตัวแปรหลุด bound,
     *  และผลลัพธ์สุดท้ายต้องอยู่ใน [lower, upper] เพราะผ่าน repairAndDecode. */
    @Test
    public void testCheckFeasableCountRegeneratesOffspring() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                6, point(2, 0.3), 2000, 0, true, 0, 3,
                new MersenneTwister(21L), false, new SimpleValueChecker(1e-13, 1e-13));
        double[] start = {0.5, 0.5};
        double[] lower = {0.0, 0.0};
        double[] upper = {1.0, 1.0};
        PointValuePair result = optimizer.optimize(5000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
        for (int i = 0; i < 2; i++) {
            assertTrue(result.getPoint()[i] >= lower[i] - 1e-9);
            assertTrue(result.getPoint()[i] <= upper[i] + 1e-9);
        }
    }

    /** maxEval เล็กมากจนเกิด TooManyEvaluationsException ทันทีในรอบแรก
     *  -> break generationLoop ก่อนมีการอัปเดต optimum ใดๆ เลย (ทดสอบ catch-branch). */
    @Test
    public void testTinyMaxEvalTriggersImmediateBreak() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0); // ไม่มี sigma, lambda auto
        double[] start = {2.0, 3.0};
        // maxEval = 1: ใช้ไปแล้ว 1 ครั้งสำหรับ bestValue เริ่มต้น
        // -> การ evaluate ตัวแรกใน generation loop (k=0) ต้อง throw ทันที
        PointValuePair result = optimizer.optimize(1, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
        // optimum ต้องยังเป็นค่าเริ่มต้น (ไม่มีการอัปเดตเกิดขึ้น)
        assertArrayEquals(start, result.getPoint(), 1e-12);
        assertEquals(13.0, result.getValue(), 1e-12); // 2^2+3^2 = 13
    }

    // ===================== generateStatistics branch =========================

    /** generateStatistics = false (default) -> ไม่มีการบันทึกสถิติใดๆ. */
    @Test
    public void testStatisticsNotCollectedWhenFlagFalse() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0); // generateStatistics=false
        double[] start = {1.0, 1.0};
        optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE, start);
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    /** generateStatistics = true -> ต้องมีการบันทึกสถิติหลังรันไปหลาย generation. */
    @Test
    public void testStatisticsCollectedWhenFlagTrue() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                8, point(2, 0.3), 5000, 0, true, 0, 0,
                new MersenneTwister(123L), true, // generateStatistics = true
                new SimpleValueChecker(1e-30, 1e-30));
        double[] start = {2.0, 2.0};
        optimizer.optimize(20000, new SphereFunction(), GoalType.MINIMIZE, start);
        assertTrue(optimizer.getStatisticsSigmaHistory().size() > 0);
        assertTrue(optimizer.getStatisticsFitnessHistory().size() > 0);
        assertTrue(optimizer.getStatisticsMeanHistory().size() > 0);
        assertTrue(optimizer.getStatisticsDHistory().size() > 0);
    }

    /** ก่อนเรียก optimize ใดๆ ประวัติสถิติต้องว่างเสมอ (ค่า default ของ field). */
    @Test
    public void testStatisticsListsInitiallyEmpty() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        assertNotNull(optimizer.getStatisticsSigmaHistory());
        assertEquals(0, optimizer.getStatisticsSigmaHistory().size());
        assertNotNull(optimizer.getStatisticsMeanHistory());
        assertEquals(0, optimizer.getStatisticsMeanHistory().size());
        assertNotNull(optimizer.getStatisticsFitnessHistory());
        assertEquals(0, optimizer.getStatisticsFitnessHistory().size());
        assertNotNull(optimizer.getStatisticsDHistory());
        assertEquals(0, optimizer.getStatisticsDHistory().size());
    }

    // ===================== Constructor variants ================================

    /** Default constructor ไม่ throw และสามารถ optimize ได้ (inputSigma=null, lambda=0). */
    @Test
    public void testDefaultConstructorRuns() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        double[] start = {3.0, 3.0};
        PointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertEquals(2, result.getPoint().length);
    }

    /** Deprecated constructor (ไม่มี checker explicit) ต้องใช้งานได้ปกติ. */
    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedConstructorRuns() {
        CMAESOptimizer optimizer = new CMAESOptimizer(
                6, point(2, 0.3), 1000, 0, true, 0, 0,
                new MersenneTwister(11L), false);
        double[] start = {1.0, 1.0};
        PointValuePair result = optimizer.optimize(5000, new SphereFunction(),
                GoalType.MINIMIZE, start);
        assertNotNull(result);
    }
}
```

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testNoBoundsBranch` | `checkParameters()`: `hasFiniteBounds == false` → `boundaries = null` |
| `testFiniteBoundsBranch` | `checkParameters()`: `hasFiniteBounds == true`, `hasInfiniteBounds == false`, ไม่ overflow |
| `testMixedFiniteInfiniteBoundsThrows` | `checkParameters()`: `hasInfiniteBounds == true` → `MathUnsupportedOperationException` |
| `testBoundsOverflowThrows` | `checkParameters()`: `Double.isInfinite(upper-lower)` → `NumberIsTooLargeException` |
| `testInputSigmaDimensionMismatchThrows` | `inputSigma.length != init.length` → `DimensionMismatchException` |
| `testInputSigmaNegativeThrows` | `inputSigma[i] < 0` → `NotPositiveException` |
| `testInputSigmaOutOfRangeThrows` | `inputSigma[i] > range` เมื่อมี `boundaries` → `OutOfRangeException` |
| `testNullInputSigmaDoesNotThrow` | `inputSigma == null` → ข้าม block ตรวจสอบ sigma ทั้งหมด |
| `testAutoLambdaComputation` | `initializeCMA()`: `lambda <= 0` → คำนวณอัตโนมัติ |
| `testExplicitLambda` | `initializeCMA()`: `lambda > 0` → ข้าม auto-computation |
| `testActiveCMATrueBranch` | `updateCovariance()`: `isActiveCMA == true` branch |
| `testActiveCMAFalseBranch` | `updateCovariance()`: `isActiveCMA == false` (else) branch |
| `testDiagonalOnlyBranchAndTransition` | `diagonalOnly > 0` → `updateCovarianceDiagonalOnly()`, และ transition `diagonalOnly>1 && iterations>diagonalOnly` |
| `testStopFitnessZeroBranch` | `doOptimize()`: `if (stopFitness != 0)` → false branch |
| `testMaximizeGoalType` | `isMinimize == false` sign-handling ใน `FitnessFunction.value/penalty` และ `doOptimize()` |
| `testCheckFeasableCountRegeneratesOffspring` | inner loop `for (i < checkFeasableCount+1)` + regenerate `arz.setColumn` branch + `isFeasible()` true/false |
| `testTinyMaxEvalTriggersImmediateBreak` | `catch (TooManyEvaluationsException e) { break generationLoop; }` |
| `testStatisticsNotCollectedWhenFlagFalse` | `if (generateStatistics)` → false branch |
| `testStatisticsCollectedWhenFlagTrue` | `if (generateStatistics)` → true branch |
| `testStatisticsListsInitiallyEmpty` | Getter methods, state ก่อนรัน `optimize()` |
| `testDefaultConstructorRuns` | Constructor `CMAESOptimizer()` → delegate chain ทั้งหมด |
| `testDeprecatedConstructorRuns` | Constructor `@Deprecated` (ไม่มี checker) → delegate ไปยัง `SimpleValueChecker` default |

**ข้อจำกัดที่ต้องตระหนัก:** การทดสอบที่พึ่งพาผลลัพธ์เชิงตัวเลขจาก `doOptimize()` (เช่น `testAutoLambdaComputation`, `testMaximizeGoalType`) เป็น stochastic algorithm แม้ใช้ seeded `MersenneTwister` เพื่อลดความแปรปรวน แต่ไม่สามารถยืนยัน 100% ว่าจะผ่านทุกครั้งในทุกสภาพแวดล้อม JVM/library version — ได้ตั้ง tolerance แบบหลวมเพื่อลดความเสี่ยง (flakiness) ไว้แล้ว