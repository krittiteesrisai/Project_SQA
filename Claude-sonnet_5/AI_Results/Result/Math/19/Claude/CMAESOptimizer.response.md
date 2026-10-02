# CMAESOptimizerTest.java

```java
package org.apache.commons.math3.optimization.direct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.SimpleValueChecker;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.RandomGenerator;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link CMAESOptimizer} (Defects4J Math-19b).
 *
 * หมายเหตุสำคัญ:
 * - เมธอด optimize(int,FUNC,GoalType,double[],double[],double[]) อ้างอิงจาก Javadoc
 *   ของคลาสเป้าหมายโดยตรง (comment เหนือคลาส) จึงมั่นใจได้ว่ามี signature นี้จริง
 * - พฤติกรรมภายในของ BaseAbstractMultivariateSimpleBoundsOptimizer (เช่นกลไกนับ
 *   evaluation ที่โยน TooManyEvaluationsException) ไม่ได้แสดงในซอร์สที่ให้มา
 *   จึงอนุมานจาก pattern มาตรฐานของ Commons-Math และจาก usage ใน doOptimize()
 *   (ซึ่งมี catch (TooManyEvaluationsException e) ชัดเจนในซอร์ส) — กำกับไว้เป็น assumption
 */
@SuppressWarnings("deprecation")
public class CMAESOptimizerTest {

    /** Sphere function: sum(x_i^2), minimum = 0 at origin. */
    private static class SphereFunction implements MultivariateFunction {
        public double value(double[] x) {
            double sum = 0;
            for (double v : x) {
                sum += v * v;
            }
            return sum;
        }
    }

    private static double[] point(int dim, double value) {
        double[] p = new double[dim];
        for (int i = 0; i < dim; i++) {
            p[i] = value;
        }
        return p;
    }

    private static double[] unboundedLower(int dim) {
        return point(dim, Double.NEGATIVE_INFINITY);
    }

    private static double[] unboundedUpper(int dim) {
        return point(dim, Double.POSITIVE_INFINITY);
    }

    // ---------- 1. Default constructor + unbounded (hasFiniteBounds=false) ----------
    @Test
    public void testDefaultConstructorUnboundedOptimization() {
        CMAESOptimizer optimizer = new CMAESOptimizer();
        double[] start = {10.0, 10.0};
        PointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start, unboundedLower(2), unboundedUpper(2));
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    // ---------- 2. Explicit lambda, finite bounds (hasFiniteBounds=true, hasInfiniteBounds=false) ----------
    @Test
    public void testBoundedFiniteOptimization() {
        RandomGenerator rng = new MersenneTwister(1234);
        CMAESOptimizer optimizer = new CMAESOptimizer(20, null, 2000, 0,
                true, 0, 0, rng, false);
        double[] start = {5.0, -5.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        PointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    // ---------- 3. inputSigma != null และถูกต้อง (ไม่เกิน exception) ----------
    @Test
    public void testWithValidInputSigma() {
        double[] inputSigma = {1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, inputSigma);
        double[] start = {2.0, 2.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        PointValuePair result = optimizer.optimize(10000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
    }

    // ---------- 4. hasFiniteBounds=true และ hasInfiniteBounds=true -> Exception ----------
    @Test(expected = MathUnsupportedOperationException.class)
    public void testMixedBoundsThrowsException() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        double[] start = {0.0, 0.0};
        double[] lower = {-10.0, Double.NEGATIVE_INFINITY};
        double[] upper = {10.0, Double.POSITIVE_INFINITY};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
    }

    // ---------- 5. inputSigma.length != init.length ----------
    @Test(expected = DimensionMismatchException.class)
    public void testInputSigmaDimensionMismatch() {
        double[] inputSigma = {1.0}; // length 1 vs start length 2
        CMAESOptimizer optimizer = new CMAESOptimizer(10, inputSigma);
        double[] start = {0.0, 0.0};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, start,
                unboundedLower(2), unboundedUpper(2));
    }

    // ---------- 6. inputSigma[i] < 0 ----------
    @Test(expected = NotPositiveException.class)
    public void testInputSigmaNegative() {
        double[] inputSigma = {-1.0, 1.0};
        CMAESOptimizer optimizer = new CMAESOptimizer(10, inputSigma);
        double[] start = {0.0, 0.0};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, start,
                unboundedLower(2), unboundedUpper(2));
    }

    // ---------- 7. boundaries != null && inputSigma[i] > range ----------
    @Test(expected = OutOfRangeException.class)
    public void testInputSigmaExceedsBoundaryRange() {
        double[] inputSigma = {25.0, 1.0}; // range = 20 (-10..10), 25 > 20
        CMAESOptimizer optimizer = new CMAESOptimizer(10, inputSigma);
        double[] start = {0.0, 0.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        optimizer.optimize(1000, new SphereFunction(), GoalType.MINIMIZE, start, lower, upper);
    }

    // ---------- 8. generateStatistics = true -> histories populated ----------
    @Test
    public void testGenerateStatisticsPopulatesHistories() {
        RandomGenerator rng = new MersenneTwister(42);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1000, 0,
                true, 0, 0, rng, true);
        double[] start = {3.0, 3.0};
        optimizer.optimize(5000, new SphereFunction(), GoalType.MINIMIZE, start,
                unboundedLower(2), unboundedUpper(2));
        assertFalse(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertFalse(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertFalse(optimizer.getStatisticsMeanHistory().isEmpty());
        assertFalse(optimizer.getStatisticsDHistory().isEmpty());
    }

    // ---------- 9. generateStatistics = false -> histories remain empty ----------
    @Test
    public void testDefaultHistoriesEmptyWhenStatisticsDisabled() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        double[] start = {1.0, 1.0};
        optimizer.optimize(2000, new SphereFunction(), GoalType.MINIMIZE, start,
                unboundedLower(2), unboundedUpper(2));
        assertTrue(optimizer.getStatisticsSigmaHistory().isEmpty());
        assertTrue(optimizer.getStatisticsFitnessHistory().isEmpty());
        assertTrue(optimizer.getStatisticsMeanHistory().isEmpty());
        assertTrue(optimizer.getStatisticsDHistory().isEmpty());
    }

    // ---------- 10. isActiveCMA = false (branch else ใน updateCovariance) ----------
    @Test
    public void testIsActiveCMAFalse() {
        RandomGenerator rng = new MersenneTwister(7);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 2000, 0,
                false, 0, 0, rng, false);
        double[] start = {4.0, -4.0};
        PointValuePair result = optimizer.optimize(10000, new SphereFunction(),
                GoalType.MINIMIZE, start, unboundedLower(2), unboundedUpper(2));
        assertNotNull(result);
    }

    // ---------- 11. diagonalOnly > 0 (updateCovarianceDiagonalOnly branch) ----------
    @Test
    public void testDiagonalOnlyPositive() {
        RandomGenerator rng = new MersenneTwister(55);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 500, 0,
                true, 2, 0, rng, false);
        double[] start = {2.0, 2.0};
        PointValuePair result = optimizer.optimize(5000, new SphereFunction(),
                GoalType.MINIMIZE, start, unboundedLower(2), unboundedUpper(2));
        assertNotNull(result);
    }

    // ---------- 12. maxIterations = 1 -> for(iterations<=maxIterations) loop false ทันทีหลังรอบแรก ----------
    @Test
    public void testSmallMaxIterationsTerminates() {
        RandomGenerator rng = new MersenneTwister(99);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1, 0,
                true, 0, 0, rng, false);
        double[] start = {1.0, 1.0};
        PointValuePair result = optimizer.optimize(100000, new SphereFunction(),
                GoalType.MINIMIZE, start, unboundedLower(2), unboundedUpper(2));
        assertNotNull(result);
    }

    // ---------- 13. maxEval = 0 -> exception ก่อนเข้า generationLoop (นอก try/catch) ----------
    // Assumption: ตรวจสอบจำนวน evaluation ของ base class (ไม่มีซอร์สให้ดู)
    @Test(expected = TooManyEvaluationsException.class)
    public void testZeroMaxEvalThrows() {
        CMAESOptimizer optimizer = new CMAESOptimizer(10);
        double[] start = {1.0, 1.0};
        optimizer.optimize(0, new SphereFunction(), GoalType.MINIMIZE, start,
                unboundedLower(2), unboundedUpper(2));
    }

    // ---------- 14. maxEval น้อยแต่ไม่ใช่ 0 -> catch ภายใน k-loop (break generationLoop แทนการ throw) ----------
    @Test
    public void testSmallMaxEvalNoExceptionPropagated() {
        RandomGenerator rng = new MersenneTwister(3);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 1000, 0,
                true, 0, 0, rng, false);
        double[] start = {1.0, 1.0};
        PointValuePair result = optimizer.optimize(15, new SphereFunction(),
                GoalType.MINIMIZE, start, unboundedLower(2), unboundedUpper(2));
        assertNotNull(result);
    }

    // ---------- 15. stopFitness != 0 (branch true ใน doOptimize) ----------
    @Test
    public void testStopFitnessBranch() {
        RandomGenerator rng = new MersenneTwister(11);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 5000, 50.0,
                true, 0, 0, rng, false);
        double[] start = {10.0, 10.0};
        PointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start, unboundedLower(2), unboundedUpper(2));
        assertNotNull(result);
    }

    // ---------- 16. checkFeasableCount > 0 (loop regenerate arz เมื่อ infeasible, มี boundaries) ----------
    @Test
    public void testCheckFeasableCountPositiveWithBounds() {
        RandomGenerator rng = new MersenneTwister(21);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 2000, 0,
                true, 0, 3, rng, false);
        double[] start = {0.0, 0.0};
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};
        PointValuePair result = optimizer.optimize(10000, new SphereFunction(),
                GoalType.MINIMIZE, start, lower, upper);
        assertNotNull(result);
    }

    // ---------- 17. Full constructor พร้อม ConvergenceChecker ----------
    @Test
    public void testFullConstructorWithConvergenceChecker() {
        RandomGenerator rng = new MersenneTwister(123);
        CMAESOptimizer optimizer = new CMAESOptimizer(8, null, 1000, 0,
                true, 0, 0, rng, false, new SimpleValueChecker());
        double[] start = {6.0, -6.0};
        PointValuePair result = optimizer.optimize(10000, new SphereFunction(),
                GoalType.MINIMIZE, start, unboundedLower(2), unboundedUpper(2));
        assertNotNull(result);
    }

    // ---------- 18. GoalType.MAXIMIZE (isMinimize=false branch) ----------
    @Test
    public void testMaximizeGoalType() {
        RandomGenerator rng = new MersenneTwister(5);
        CMAESOptimizer optimizer = new CMAESOptimizer(10, null, 2000, 0,
                true, 0, 0, rng, false);
        double[] start = {1.0, 1.0};
        MultivariateFunction negSphere = new MultivariateFunction() {
            public double value(double[] x) {
                double sum = 0;
                for (double v : x) {
                    sum += v * v;
                }
                return -sum;
            }
        };
        PointValuePair result = optimizer.optimize(10000, negSphere,
                GoalType.MAXIMIZE, start, unboundedLower(2), unboundedUpper(2));
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    // ---------- 19. lambda <= 0 -> default formula ใน initializeCMA ----------
    @Test
    public void testNonPositiveLambdaUsesDefaultFormula() {
        CMAESOptimizer optimizer = new CMAESOptimizer(0);
        double[] start = {1.0, 1.0, 1.0};
        PointValuePair result = optimizer.optimize(20000, new SphereFunction(),
                GoalType.MINIMIZE, start, unboundedLower(3), unboundedUpper(3));
        assertNotNull(result);
    }

    // ---------- 20. 1-dimensional edge case ----------
    @Test
    public void testOneDimensionalProblem() {
        CMAESOptimizer optimizer = new CMAESOptimizer(5);
        double[] start = {7.0};
        PointValuePair result = optimizer.optimize(5000, new SphereFunction(),
                GoalType.MINIMIZE, start, unboundedLower(1), unboundedUpper(1));
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
    }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testDefaultConstructorUnboundedOptimization | Default constructor → `lambda<=0`; `checkParameters`: `hasFiniteBounds=false` → `boundaries=null` |
| testBoundedFiniteOptimization | `hasFiniteBounds=true`, `hasInfiniteBounds=false` → `boundaries` ถูกตั้งค่า; `isActiveCMA=true` default path |
| testWithValidInputSigma | `inputSigma != null`, dimension ตรงกัน, ไม่เกิน exception (loop ผ่านทุก index) |
| testMixedBoundsThrowsException | `hasFiniteBounds=true` และ `hasInfiniteBounds=true` → `MathUnsupportedOperationException` |
| testInputSigmaDimensionMismatch | `inputSigma.length != init.length` → `DimensionMismatchException` |
| testInputSigmaNegative | `inputSigma[i] < 0` → `NotPositiveException` |
| testInputSigmaExceedsBoundaryRange | `boundaries != null` และ `inputSigma[i] > range` → `OutOfRangeException` |
| testGenerateStatisticsPopulatesHistories | `if (generateStatistics)` = true ใน doOptimize loop |
| testDefaultHistoriesEmptyWhenStatisticsDisabled | `if (generateStatistics)` = false |
| testIsActiveCMAFalse | `updateCovariance`: else branch (non-active CMA) |
| testDiagonalOnlyPositive | `diagonalOnly <= 0` = false → `updateCovarianceDiagonalOnly`; `if (diagonalOnly>1 && iterations>diagonalOnly)` |
| testSmallMaxIterationsTerminates | for-loop `iterations <= maxIterations` boundary (maxIterations=1) |
| testZeroMaxEvalThrows | Exception path ก่อนเข้า try/catch (การเรียก `fitfun.value(guess)` ครั้งแรก) |
| testSmallMaxEvalNoExceptionPropagated | `try { fitness[k] = fitfun.value(...) } catch (TooManyEvaluationsException e) { break generationLoop; }` |
| testStopFitnessBranch | `if (stopFitness != 0)` = true branch |
| testCheckFeasableCountPositiveWithBounds | inner for-loop `for (i < checkFeasableCount+1)` + `isFeasible` regenerate arz branch |
| testFullConstructorWithConvergenceChecker | Constructor พร้อม `ConvergenceChecker`; `getConvergenceChecker() != null` branch ใน doOptimize |
| testMaximizeGoalType | `isMinimize = getGoalType().equals(GoalType.MINIMIZE)` = false branch (sign-flip ทุกจุด) |
| testNonPositiveLambdaUsesDefaultFormula | `if (lambda <= 0)` = true ใน `initializeCMA` |
| testOneDimensionalProblem | dimension = 1 edge case (loop ขนาดเล็กสุด) |

**หมายเหตุ:** บาง branch เช่น "flat fitness adjustment" (`bestValue == fitness[arindex[...]]`) หรือเงื่อนไข `max(diagD)/min(diagD) > 1e7` ขึ้นกับ randomness ภายในที่ไม่สามารถบังคับ deterministic ได้จาก public API โดยไม่เดา internal behavior เพิ่มเติม จึงไม่ได้เขียนเทสเฉพาะเจาะจงสำหรับ branch เหล่านี้ตามข้อกำหนดที่ 4