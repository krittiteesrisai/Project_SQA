# CMAESOptimizerTest.java

ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับ `CMAESOptimizer` (Defects4J: Math-20b)
**หมายเหตุสำคัญ:** เมธอด `optimize(...)`, `getEvaluations()` และตัวสร้าง (constructor) ทั้งหมดไม่ได้แสดงอยู่ใน source ที่ให้มาโดยตรง (เป็นเมธอดจากคลาสฐาน `BaseAbstractMultivariateSimpleBoundsOptimizer` / `BaseOptimizer` ใน Apache Commons Math 3.0) จึงอ้างอิงตาม public API ที่ทราบแน่ชัดของเวอร์ชันนี้ และมีคอมเมนต์กำกับไว้ทุกจุดที่เป็น "สมมติฐานจาก API ที่สืบทอด" ไม่ได้เดา behavior ภายในที่ไม่มีใน source

```java
package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;

import org.junit.Test;

/**
 * ชุดทดสอบ JUnit4 สำหรับ CMAESOptimizer (Defects4J Math-20b)
 *
 * หมายเหตุ: เมธอด optimize(...) และ getEvaluations() เป็นเมธอด public
 * ที่สืบทอดมาจาก BaseAbstractMultivariateSimpleBoundsOptimizer /
 * BaseOptimizer ซึ่งไม่ได้แสดงใน source ที่ให้มา แต่เป็น public API
 * มาตรฐานของ Apache Commons Math 3.0 - ใช้ตามความเข้าใจ API สาธารณะ
 * ไม่ได้เดา behavior ภายในของ CMAESOptimizer เอง
 */
public class CMAESOptimizerTest {

    /** ฟังก์ชัน sphere: sum(x_i^2) จุดต่ำสุดที่ 0 ทุกมิติ ใช้เป็นฟังก์ชันทดสอบหลัก */
    private static class Sphere implements MultivariateFunction {
        public double value(double[] x) {
            double sum = 0;
            for (double v : x) {
                sum += v * v;
            }
            return sum;
        }
    }

    // ---------------------------------------------------------------
    // Constructor delegation branches
    // ---------------------------------------------------------------

    /** Covers: default constructor -> lambda=0 -> auto lambda branch (lambda<=0 true) */
    @Test
    public void testDefaultConstructorAutoLambda() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        double[] start = {1.0, 1.0};
        PointValuePair result = optimizer.optimize(5000, new Sphere(), GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertFalse(Double.isNaN(result.getValue()));
    }

    /** Covers: two-arg constructor (lambda, inputSigma) delegation */
    @Test
    public void testTwoArgConstructor() {
        double[] start = {1.0, 1.0};
        double[] sigma = {0.3, 0.3};
        CMAESOptimizer optimizer = new CMAESOptimizer(8, sigma);
        PointValuePair result = optimizer.optimize(3000, new Sphere(), GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertFalse(Double.isNaN(result.getValue()));
    }

    /** Covers: full constructor with explicit ConvergenceChecker (non-deprecated overload) */
    @Test
    public void testConstructorWithExplicitConvergenceChecker() {
        double[] start = {1.0, 1.0};
        ConvergenceChecker<PointValuePair> checker = new SimpleValueChecker(1e-10, 1e-10);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 500, 0,
                true, 0, 0, new MersenneTwister(13), false, checker);
        PointValuePair result = optimizer.optimize(3000, new Sphere(), GoalType.MINIMIZE, start);
        assertNotNull(result);
    }

    /** Covers: lambda negative -> same auto-calc branch as lambda<=0 */
    @Test
    public void testNegativeLambdaTriggersAutoCalculation() {
        double[] start = {1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(-3, null, 500, 0,
                true, 0, 0, new MersenneTwister(15), false);
        PointValuePair result = optimizer.optimize(3000, new Sphere(), GoalType.MINIMIZE, start);
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // checkParameters(): boundary branches
    // ---------------------------------------------------------------

    /** Covers: hasFiniteBounds=false (all infinite) -> boundaries=null, no exception */
    @Test
    public void testAllInfiniteBoundsNoException() {
        double[] start = {0.0, 0.0};
        double[] lower = {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        double[] upper = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY};
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 1000, 0,
                true, 0, 0, new MersenneTwister(1), false);
        PointValuePair result =
            optimizer.optimize(2000, new Sphere(), GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
    }

    /** Covers: hasFiniteBounds=true, hasInfiniteBounds=false -> boundaries set normally */
    @Test
    public void testFiniteBoundsOptimumWithinBounds() {
        double[] start = {0.0, 0.0};
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 2000, 0,
                true, 0, 0, new MersenneTwister(42), false);
        PointValuePair result =
            optimizer.optimize(5000, new Sphere(), GoalType.MINIMIZE, start, lower, upper);
        double[] p = result.getPoint();
        for (int i = 0; i < p.length; i++) {
            assertTrue(p[i] >= lower[i] - 1e-9);
            assertTrue(p[i] <= upper[i] + 1e-9);
        }
    }

    /** Covers: hasFiniteBounds=true AND hasInfiniteBounds=true -> throw MathUnsupportedOperationException */
    @Test(expected = MathUnsupportedOperationException.class)
    public void testMixedBoundsThrowsException() {
        double[] start = {0.0, 0.0};
        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, Double.POSITIVE_INFINITY}; // dim0 finite, dim1 upper infinite
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 1000, 0,
                true, 0, 0, new MersenneTwister(1), false);
        optimizer.optimize(1000, new Sphere(), GoalType.MINIMIZE, start, lower, upper);
    }

    // ---------------------------------------------------------------
    // checkParameters(): inputSigma branches
    // ---------------------------------------------------------------

    /** Covers: inputSigma.length != init.length -> DimensionMismatchException */
    @Test(expected = DimensionMismatchException.class)
    public void testInputSigmaDimensionMismatch() {
        double[] start = {0.0, 0.0};
        double[] badSigma = {0.5}; // length 1 != 2
        CMAESOptimizer optimizer = new CMAESOptimizer(5, badSigma, 1000, 0,
                true, 0, 0, new MersenneTwister(1), false);
        optimizer.optimize(100, new Sphere(), GoalType.MINIMIZE, start);
    }

    /** Covers: inputSigma[i] < 0 -> NotPositiveException */
    @Test(expected = NotPositiveException.class)
    public void testInputSigmaNegative() {
        double[] start = {0.0, 0.0};
        double[] badSigma = {0.5, -0.1};
        CMAESOptimizer optimizer = new CMAESOptimizer(5, badSigma, 1000, 0,
                true, 0, 0, new MersenneTwister(1), false);
        optimizer.optimize(100, new Sphere(), GoalType.MINIMIZE, start);
    }

    /** Covers: boundaries != null AND inputSigma[i] > range -> OutOfRangeException */
    @Test(expected = OutOfRangeException.class)
    public void testInputSigmaOutOfRange() {
        double[] start = {0.0, 0.0};
        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, 1.0};
        double[] badSigma = {5.0, 0.5}; // 5.0 > range(2.0)
        CMAESOptimizer optimizer = new CMAESOptimizer(5, badSigma, 1000, 0,
                true, 0, 0, new MersenneTwister(1), false);
        optimizer.optimize(100, new Sphere(), GoalType.MINIMIZE, start, lower, upper);
    }

    // ---------------------------------------------------------------
    // doOptimize(): isActiveCMA / diagonalOnly branches
    // ---------------------------------------------------------------

    /** Covers: isActiveCMA = false -> updateCovariance() "else" (non-active) branch */
    @Test
    public void testIsActiveCMAFalse() {
        double[] start = {1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(8, null, 500, 0,
                false, 0, 0, new MersenneTwister(7), false);
        PointValuePair result = optimizer.optimize(3000, new Sphere(), GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertFalse(Double.isNaN(result.getValue()));
    }

    /** Covers: diagonalOnly > 0 -> updateCovarianceDiagonalOnly() path used in generation loop */
    @Test
    public void testDiagonalOnlyPositive() {
        double[] start = {1.0, 1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 500, 0,
                true, 3, 0, new MersenneTwister(3), false);
        PointValuePair result = optimizer.optimize(3000, new Sphere(), GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertFalse(Double.isNaN(result.getValue()));
    }

    // ---------------------------------------------------------------
    // generateStatistics branch
    // ---------------------------------------------------------------

    /** Covers: generateStatistics = true -> history lists get populated */
    @Test
    public void testGenerateStatisticsPopulatesHistories() {
        double[] start = {1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 300, 0,
                true, 0, 0, new MersenneTwister(5), true);
        optimizer.optimize(3000, new Sphere(), GoalType.MINIMIZE, start);
        assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertFalse(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertFalse(optimizer.getStatisticsMeanHistory().isEmpty());
        assertFalse(optimizer.getStatisticsDHistory().isEmpty());
    }

    /** Covers: generateStatistics = false -> history lists remain empty (opposite branch) */
    @Test
    public void testGenerateStatisticsFalseKeepsHistoriesEmpty() {
        double[] start = {1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 300, 0,
                true, 0, 0, new MersenneTwister(21), false);
        optimizer.optimize(3000, new Sphere(), GoalType.MINIMIZE, start);
        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
    }

    // ---------------------------------------------------------------
    // termination criteria branches
    // ---------------------------------------------------------------

    /** Covers: stopFitness != 0 branch -> early break when bestFitness < stopFitness */
    @Test
    public void testStopFitnessTerminatesEarly() {
        double[] start = {5.0, 5.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 10000, 1.0e6,
                true, 0, 0, new MersenneTwister(9), false);
        PointValuePair result = optimizer.optimize(1000000, new Sphere(), GoalType.MINIMIZE, start);
        assertNotNull(result);
        // สมมติฐาน: getEvaluations() เป็น public API สืบทอดจาก BaseOptimizer
        assertTrue(optimizer.getEvaluations() < 1000000);
    }

    /**
     * Covers: maxIterations = 0 -> generation loop ไม่ execute เลย
     * (boundary: iterations(1) <= maxIterations(0) เป็น false ตั้งแต่รอบแรก)
     * ผลลัพธ์ที่คืนค่าต้องเท่ากับ startPoint เดิม (optimum เริ่มต้น)
     */
    @Test
    public void testMaxIterationsZeroReturnsStartPoint() {
        double[] start = {2.0, 3.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(5, null, 0, 0,
                true, 0, 0, new MersenneTwister(1), false);
        PointValuePair result = optimizer.optimize(1000, new Sphere(), GoalType.MINIMIZE, start);
        assertArrayEquals(start, result.getPoint(), 1e-12);
    }

    /**
     * Covers: TooManyEvaluationsException ภายใน offspring loop -> catch -> break generationLoop
     * (maxEval ตั้งค่าน้อยมากเพื่อให้เกิด exception เร็ว)
     */
    @Test
    public void testTooManyEvaluationsBreaksGenerationLoopGracefully() {
        double[] start = {2.0, 2.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 10000, 0,
                true, 0, 0, new MersenneTwister(2), false);
        PointValuePair result = optimizer.optimize(5, new Sphere(), GoalType.MINIMIZE, start);
        assertNotNull(result);
    }

    /**
     * Covers: flat fitness landscape -> "bestValue == fitness[...]" และ
     * "historyWorst-historyBest == 0" branches ที่ปรับ sigma เพิ่มขึ้น
     */
    @Test
    public void testFlatFitnessLandscapeHandledWithoutException() {
        double[] start = {0.0, 0.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(8, null, 50, 0,
                true, 0, 0, new MersenneTwister(4), false);
        PointValuePair result = optimizer.optimize(2000, new MultivariateFunction() {
            public double value(double[] x) {
                return 5.0; // ค่าคงที่ -> flat fitness
            }
        }, GoalType.MINIMIZE, start);
        assertNotNull(result);
        assertFalse(Double.isNaN(result.getValue()));
    }

    // ---------------------------------------------------------------
    // offspring feasibility regeneration branch
    // ---------------------------------------------------------------

    /** Covers: checkFeasableCount > 0 -> regenerate random offspring when infeasible */
    @Test
    public void testCheckFeasableCountPositiveRegeneratesInfeasiblePoints() {
        double[] start = {0.0, 0.0};
        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 500, 0,
                true, 0, 3, new MersenneTwister(11), false);
        PointValuePair result =
            optimizer.optimize(5000, new Sphere(), GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
    }

    // ---------------------------------------------------------------
    // GoalType.MAXIMIZE branch (isMinimize = false)
    // ---------------------------------------------------------------

    /** Covers: isMinimize = false -> ปรับ sign logic ใน value()/penalty()/stopFitness compare */
    @Test
    public void testMaximizeGoalType() {
        double[] start = {1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 500, 0,
                true, 0, 0, new MersenneTwister(6), false);
        PointValuePair result = optimizer.optimize(3000, new MultivariateFunction() {
            public double value(double[] x) {
                double sum = 0;
                for (double v : x) {
                    sum += v * v;
                }
                return -sum; // ค่ามากสุดที่ x=0
            }
        }, GoalType.MAXIMIZE, start);
        assertNotNull(result);
        assertFalse(Double.isNaN(result.getValue()));
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDefaultConstructorAutoLambda` | Constructor chain `()`→`(lambda)`; `initializeCMA`: `lambda <= 0` = true |
| `testTwoArgConstructor` | Constructor `(lambda, inputSigma)` delegation |
| `testConstructorWithExplicitConvergenceChecker` | Constructor overload ที่รับ `ConvergenceChecker` ตรง ๆ |
| `testNegativeLambdaTriggersAutoCalculation` | `lambda <= 0` = true (ค่า negative) |
| `testAllInfiniteBoundsNoException` | `checkParameters`: `hasFiniteBounds` = false → `boundaries = null` |
| `testFiniteBoundsOptimumWithinBounds` | `hasFiniteBounds` = true, `hasInfiniteBounds` = false → ตั้งค่า `boundaries` |
| `testMixedBoundsThrowsException` | `hasFiniteBounds` = true และ `hasInfiniteBounds` = true → throw `MathUnsupportedOperationException` |
| `testInputSigmaDimensionMismatch` | `inputSigma.length != init.length` → `DimensionMismatchException` |
| `testInputSigmaNegative` | `inputSigma[i] < 0` → `NotPositiveException` |
| `testInputSigmaOutOfRange` | `boundaries != null` และ `inputSigma[i] > range` → `OutOfRangeException` |
| `testIsActiveCMAFalse` | `isActiveCMA == false` branch ใน `updateCovariance` (else path) |
| `testDiagonalOnlyPositive` | `diagonalOnly > 0` → `updateCovarianceDiagonalOnly` path ใน generation loop |
| `testGenerateStatisticsPopulatesHistories` | `generateStatistics == true` branch |
| `testGenerateStatisticsFalseKeepsHistoriesEmpty` | `generateStatistics == false` branch (opposite) |
| `testStopFitnessTerminatesEarly` | `stopFitness != 0` → early `break generationLoop` |
| `testMaxIterationsZeroReturnsStartPoint` | Loop condition `iterations <= maxIterations` = false ตั้งแต่ต้น (boundary: ไม่ loop เลย) |
| `testTooManyEvaluationsBreaksGenerationLoopGracefully` | `catch (TooManyEvaluationsException)` → `break generationLoop` |
| `testFlatFitnessLandscapeHandledWithoutException` | `bestValue == fitness[...]` และ `historyWorst-historyBest == 0` branches (sigma adjust) |
| `testCheckFeasableCountPositiveRegeneratesInfeasiblePoints` | `checkFeasableCount > 0` → regenerate `arz` เมื่อ `!isFeasible` |
| `testMaximizeGoalType` | `isMinimize == false` branch (GoalType.MAXIMIZE) ส่งผลต่อ sign logic หลายจุด |

**ข้อจำกัดที่ยอมรับได้ (ไม่สามารถเทสได้ตรง ๆ จาก public API):**
- Branch ภายใน `updateBD` (eigen decomposition correction เมื่อ `min(diagD) <= 0` หรือ `max(diagD) > 1e14*min(diagD)`) ไม่สามารถ trigger ได้ง่ายผ่าน public API โดยตรงโดยไม่พึ่งพาเลขสุ่มที่เจาะจงมาก — ไม่ได้เขียนเทสเฉพาะเจาะจงเพื่อเลี่ยงการเดา behavior
- Branch `negccov > negcovMax` ใน `updateCovariance` (active CMA) ถูก exercise โดยอ้อมผ่านการรัน active-CMA หลายรอบ (เทส sphere/diagonal/maximize ทั้งหมดที่ `isActiveCMA=true`) แต่ไม่ได้ assert ค่าภายในเพราะเป็น private state