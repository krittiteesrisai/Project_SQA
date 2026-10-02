# คำตอบ: JUnit 4 Test Suite สำหรับ `CMAESOptimizer`

## การวิเคราะห์ก่อนเขียนเทส

จากซอร์สโค้ด พบจุดที่ควรทดสอบ (branch/condition) ดังนี้:
- `Sigma` constructor: วนลูปเช็ค `s[i] < 0` → throw `NotPositiveException`
- `PopulationSize` constructor: เช็ค `size <= 0` → throw `NotStrictlyPositiveException`
- `checkParameters()`: `inputSigma != null` branch, dimension mismatch, out-of-range sigma
- `initializeCMA()`: `lambda <= 0` → throw `NotStrictlyPositiveException`
- `doOptimize()`: loop `generationLoop`, branch `diagonalOnly <= 0`, `checkFeasableCount` retry loop, `TooManyEvaluationsException` (ทั้งแบบ propagate และแบบถูก catch), `stopFitness != 0`, convergence checker branch, `isActiveCMA` branch, `generateStatistics` branch, GoalType MIN/MAX

⚠️ หมายเหตุสำคัญ: ภายใน loop หลัก `fitness[k] = fitfun.value(...)` ถูก wrap ด้วย `try/catch(TooManyEvaluationsException e){ break generationLoop; }` ซึ่ง**ไม่ throw ออกไปนอก** `optimize()` แต่การเรียก `fitfun.value(guess)` ตอน*เริ่มต้น* (ก่อนเข้า loop) **ไม่ได้** wrap ด้วย try/catch จึงสามารถ propagate ออกมาได้ — ผมแยกทดสอบทั้งสองกรณีนี้ตามซอร์สจริง ไม่เดา behavior

```java
package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.PopulationSize;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer.Sigma;
import org.apache.commons.math3.random.JDKRandomGenerator;

/**
 * JUnit4 test suite for {@link CMAESOptimizer} (Defects4J Math-6b).
 * ครอบคลุม boundary, null/empty, malformed input และ branch/loop ต่าง ๆ
 * ที่วิเคราะห์ได้จากซอร์สที่ให้มา
 */
public class CMAESOptimizerTest {

    // ---------- Helper: simple sphere objective f(x) = sum(x_i^2) ----------
    private static final MultivariateFunction SPHERE = new MultivariateFunction() {
        @Override
        public double value(double[] x) {
            double s = 0;
            for (double xi : x) {
                s += xi * xi;
            }
            return s;
        }
    };

    private JDKRandomGenerator newSeededRandom() {
        JDKRandomGenerator rng = new JDKRandomGenerator();
        rng.setSeed(1234567890L);
        return rng;
    }

    // =========================================================
    // 1. Sigma inner class
    // =========================================================

    @Test
    public void testSigma_ValidValuesStored() {
        double[] in = {1.0, 2.5, 0.0}; // 0.0 เป็นขอบ (boundary) ที่ยังถูกต้อง (ไม่ < 0)
        Sigma s = new Sigma(in);
        assertArrayEquals(in, s.getSigma(), 0.0);
    }

    @Test(expected = NotPositiveException.class)
    public void testSigma_NegativeValueThrows() {
        new Sigma(new double[] {1.0, -0.0001, 2.0});
    }

    @Test
    public void testSigma_EmptyArrayAllowed() {
        // อินพุตว่าง: ไม่มี element ให้เช็ค ดังนั้นไม่ throw
        Sigma s = new Sigma(new double[0]);
        assertEquals(0, s.getSigma().length);
    }

    @Test
    public void testSigma_GetterReturnsDefensiveCopy() {
        double[] in = {1.0, 2.0};
        Sigma s = new Sigma(in);
        double[] copy1 = s.getSigma();
        copy1[0] = 999.0; // แก้ไข copy ที่ได้กลับมา
        double[] copy2 = s.getSigma();
        assertEquals(1.0, copy2[0], 0.0); // internal state ต้องไม่เปลี่ยน
    }

    // =========================================================
    // 2. PopulationSize inner class
    // =========================================================

    @Test
    public void testPopulationSize_ValidValue() {
        PopulationSize p = new PopulationSize(10);
        assertEquals(10, p.getPopulationSize());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSize_ZeroThrows() {
        new PopulationSize(0); // boundary: size <= 0
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testPopulationSize_NegativeThrows() {
        new PopulationSize(-5);
    }

    // =========================================================
    // 3. checkParameters() ผ่านการเรียก optimize()
    // =========================================================

    @Test(expected = DimensionMismatchException.class)
    public void testOptimize_SigmaDimensionMismatchThrows() {
        CMAESOptimizer opt = new CMAESOptimizer(
            1000, 0, true, 0, 0, newSeededRandom(), false, null);

        opt.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0}), // dimension = 2
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {1.0, 1.0, 1.0}),    // dimension = 3 -> mismatch
            new PopulationSize(6));
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimize_SigmaOutOfRangeThrows() {
        CMAESOptimizer opt = new CMAESOptimizer(
            1000, 0, true, 0, 0, newSeededRandom(), false, null);

        opt.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {0.0, 0.0}),
            new SimpleBounds(new double[] {-1, -1}, new double[] {1, 1}), // range = 2
            new Sigma(new double[] {5.0, 1.0}), // 5.0 > (uB-lB)=2 -> OutOfRangeException
            new PopulationSize(6));
    }

    // =========================================================
    // 4. initializeCMA(): lambda <= 0
    // =========================================================

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_MissingPopulationSizeThrows() {
        // ไม่ใส่ PopulationSize -> lambda field คงค่า default = 0
        CMAESOptimizer opt = new CMAESOptimizer(
            1000, 0, true, 0, 0, newSeededRandom(), false, null);

        opt.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {0.0, 0.0}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.5, 0.5}));
            // ไม่มี PopulationSize -> lambda <= 0 -> NotStrictlyPositiveException
    }

    // =========================================================
    // 5. Full optimize(): MINIMIZE sphere, ตรวจผลลัพธ์
    // =========================================================

    @Test(timeout = 10000)
    public void testOptimize_SphereMinimizeConverges() {
        CMAESOptimizer opt = new CMAESOptimizer(
            2000, 0, true, 0, 0, newSeededRandom(), false, null);

        PointValuePair result = opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {2.0, 2.0}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.5, 0.5}),
            new PopulationSize(8));

        assertNotNull(result);
        // ค่า optimum ของ sum(x^2) ควรเข้าใกล้ 0
        assertEquals(0.0, result.getValue(), 0.2);
        assertEquals(0.0, result.getPoint()[0], 0.5);
        assertEquals(0.0, result.getPoint()[1], 0.5);
    }

    // =========================================================
    // 6. GoalType.MAXIMIZE + bounds (ทดสอบ isMinimize=false branch & repair)
    // =========================================================

    @Test(timeout = 10000)
    public void testOptimize_SphereMaximizeWithBounds() {
        // maximize sum(x^2) บน [-1,1]^2 -> optimum ที่มุมขอบเขต value ~2.0
        CMAESOptimizer opt = new CMAESOptimizer(
            2000, 0, true, 0, 0, newSeededRandom(), false, null);

        PointValuePair result = opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[] {0.1, 0.1}),
            new SimpleBounds(new double[] {-1, -1}, new double[] {1, 1}),
            new Sigma(new double[] {0.3, 0.3}),
            new PopulationSize(8));

        assertNotNull(result);
        // ไม่ assert เป๊ะเนื่องจากเป็น stochastic algorithm, เช็คว่าอยู่ในทิศทางถูกต้อง (ใกล้ขอบเขตบน)
        assertTrue("expected value close to boundary optimum (~2.0)",
                   result.getValue() > 1.0);
    }

    // =========================================================
    // 7. generateStatistics = true / false
    // =========================================================

    @Test(timeout = 10000)
    public void testOptimize_GenerateStatisticsTrue_HistoriesPopulated() {
        CMAESOptimizer opt = new CMAESOptimizer(
            50, 0, true, 0, 0, newSeededRandom(), true, null);

        opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.5, 0.5}),
            new PopulationSize(6));

        assertFalse(opt.getStatisticsSigmaHistory().isEmpty());
        assertFalse(opt.getStatisticsFitnessHistory().isEmpty());
        assertFalse(opt.getStatisticsMeanHistory().isEmpty());
        assertFalse(opt.getStatisticsDHistory().isEmpty());
    }

    @Test(timeout = 10000)
    public void testOptimize_GenerateStatisticsFalse_HistoriesEmpty() {
        CMAESOptimizer opt = new CMAESOptimizer(
            50, 0, true, 0, 0, newSeededRandom(), false, null);

        opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.5, 0.5}),
            new PopulationSize(6));

        assertTrue(opt.getStatisticsSigmaHistory().isEmpty());
        assertTrue(opt.getStatisticsFitnessHistory().isEmpty());
        assertTrue(opt.getStatisticsMeanHistory().isEmpty());
        assertTrue(opt.getStatisticsDHistory().isEmpty());
    }

    // =========================================================
    // 8. isActiveCMA true/false
    // =========================================================

    @Test(timeout = 10000)
    public void testOptimize_ActiveCMA_True_RunsWithoutError() {
        CMAESOptimizer opt = new CMAESOptimizer(
            500, 0, true, 0, 0, newSeededRandom(), false, null);

        PointValuePair result = opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.5, 0.5}),
            new PopulationSize(8));

        assertNotNull(result);
    }

    @Test(timeout = 10000)
    public void testOptimize_ActiveCMA_False_RunsWithoutError() {
        CMAESOptimizer opt = new CMAESOptimizer(
            500, 0, false, 0, 0, newSeededRandom(), false, null);

        PointValuePair result = opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.5, 0.5}),
            new PopulationSize(8));

        assertNotNull(result);
    }

    // =========================================================
    // 9. diagonalOnly > 0 branch (updateCovarianceDiagonalOnly)
    // =========================================================

    @Test(timeout = 10000)
    public void testOptimize_DiagonalOnlyPositive_RunsWithoutError() {
        CMAESOptimizer opt = new CMAESOptimizer(
            200, 0, true, 5, 0, newSeededRandom(), false, null);

        PointValuePair result = opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0, 1.0}),
            new SimpleBounds(new double[] {-10, -10, -10}, new double[] {10, 10, 10}),
            new Sigma(new double[] {0.5, 0.5, 0.5}),
            new PopulationSize(8));

        assertNotNull(result);
    }

    @Test(timeout = 10000)
    public void testOptimize_DiagonalOnlyTransitionToFullCovariance() {
        // diagonalOnly > 1 และ iterations > diagonalOnly -> สลับไปใช้ full covariance
        CMAESOptimizer opt = new CMAESOptimizer(
            50, 0, true, 2, 0, newSeededRandom(), false, null);

        PointValuePair result = opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0, 1.0}),
            new SimpleBounds(new double[] {-10, -10, -10}, new double[] {10, 10, 10}),
            new Sigma(new double[] {0.5, 0.5, 0.5}),
            new PopulationSize(8));

        assertNotNull(result);
    }

    // =========================================================
    // 10. stopFitness != 0 termination branch
    // =========================================================

    @Test(timeout = 10000)
    public void testOptimize_StopFitnessNonZero_EarlyTerminationHandled() {
        // stopFitness ที่เอื้อมถึงได้ง่าย เพื่อให้ branch (bestFitness < stopFitness) เกิดขึ้น
        CMAESOptimizer opt = new CMAESOptimizer(
            2000, 1.0, true, 0, 0, newSeededRandom(), false, null);

        PointValuePair result = opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {0.5, 0.5}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.5, 0.5}),
            new PopulationSize(6));

        assertNotNull(result);
        // ไม่ assert ค่า exact เพราะ stochastic, เพียงยืนยันว่าทำงานจบได้โดยไม่ error
    }

    // =========================================================
    // 11. checkFeasableCount > 0 + tight bounds -> regenerate branch
    // =========================================================

    @Test(timeout = 10000)
    public void testOptimize_CheckFeasableCountWithTightBounds() {
        // bounds แคบมาก เทียบกับ sigma จะบีบให้ค่าที่ sample บ่อยครั้ง infeasible
        // บังคับให้เข้า branch "regenerate random arguments" (arz.setColumn)
        CMAESOptimizer opt = new CMAESOptimizer(
            200, 0, true, 0, 5, newSeededRandom(), false, null);

        PointValuePair result = opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {0.0, 0.0}),
            new SimpleBounds(new double[] {-0.01, -0.01}, new double[] {0.01, 0.01}),
            new Sigma(new double[] {0.01, 0.01}),
            new PopulationSize(8));

        assertNotNull(result);
        // ผลลัพธ์ต้องอยู่ในขอบเขตเสมอ เพราะ repair() บีบค่าให้อยู่ใน bound
        assertTrue(result.getPoint()[0] >= -0.01 && result.getPoint()[0] <= 0.01);
        assertTrue(result.getPoint()[1] >= -0.01 && result.getPoint()[1] <= 0.01);
    }

    // =========================================================
    // 12. ConvergenceChecker branch
    // =========================================================

    @Test(timeout = 10000)
    public void testOptimize_ConvergenceCheckerForcesEarlyStop() {
        // threshold หลวมมาก ทำให้ converged() เป็น true ตั้งแต่รอบแรก ๆ
        SimplePointChecker<PointValuePair> checker =
            new SimplePointChecker<PointValuePair>(1e10, 1e10);

        CMAESOptimizer opt = new CMAESOptimizer(
            500, 0, true, 0, 0, newSeededRandom(), true, checker);

        opt.optimize(
            new MaxEval(20000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.5, 0.5}),
            new PopulationSize(6));

        // เมื่อ converge เร็วมาก ควร break ก่อนถึงโค้ด push statistics ด้านล่างของ loop
        // (ตามลำดับโค้ดใน doOptimize) -> history ควรมีรายการน้อยมากหรือว่าง
        assertTrue(opt.getStatisticsSigmaHistory().size() <= 1);
    }

    // =========================================================
    // 13. TooManyEvaluationsException: 2 กรณีตามซอร์สจริง
    // =========================================================

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_MaxEvalZero_ThrowsImmediately() {
        // MaxEval(0): การเรียก fitfun.value(guess) ครั้งแรก (ก่อนเข้า generationLoop)
        // ไม่ได้ถูก wrap ด้วย try/catch -> exception ต้อง propagate ออกมา
        CMAESOptimizer opt = new CMAESOptimizer(
            1000, 0, true, 0, 0, newSeededRandom(), false, null);

        opt.optimize(
            new MaxEval(0),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.5, 0.5}),
            new PopulationSize(6));
    }

    @Test(timeout = 10000)
    public void testOptimize_MaxEvalExceededDuringLoop_HandledGracefully() {
        // MaxEval เล็กพอให้ eval แรกผ่าน แต่ระหว่าง generationLoop evaluations เกิน
        // ตาม source: catch(TooManyEvaluationsException e){ break generationLoop; }
        // ดังนั้น optimize() ไม่ควร throw exception ออกมา แต่คืนผลลัพธ์ล่าสุดที่มี
        CMAESOptimizer opt = new CMAESOptimizer(
            1000, 0, true, 0, 0, newSeededRandom(), false, null);

        PointValuePair result = opt.optimize(
            new MaxEval(3), // น้อยกว่า lambda -> จะเกินใน loop แรก แต่ eval แรก (ก่อน loop) ผ่าน
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.5, 0.5}),
            new PopulationSize(8));

        assertNotNull(result);
    }

    // =========================================================
    // 14. Boundary: inputSigma มีค่า 0 ทุกตัว (sigma=0) -> ไม่ throw แต่ max(insigma)=0
    //     หมายเหตุ: พฤติกรรมเมื่อ sigma=0 ทั้งหมดไม่ได้ระบุชัดใน spec
    //     (อาจทำให้ไม่มีการสุ่ม exploration เลย) — ทดสอบแค่ว่าไม่ throw exception ที่ไม่คาดคิด
    // =========================================================

    @Test(timeout = 10000)
    public void testOptimize_AllZeroSigma_DoesNotThrowUnexpectedException() {
        CMAESOptimizer opt = new CMAESOptimizer(
            10, 0, true, 0, 0, newSeededRandom(), false, null);

        PointValuePair result = opt.optimize(
            new MaxEval(5000),
            new ObjectiveFunction(SPHERE),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] {1.0, 1.0}),
            new SimpleBounds(new double[] {-10, -10}, new double[] {10, 10}),
            new Sigma(new double[] {0.0, 0.0}), // boundary sigma = 0, Sigma constructor อนุญาต
            new PopulationSize(6));

        assertNotNull(result);
    }
}
```

## สรุปตารางความครอบคลุม (Branch/Condition Coverage)

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testSigma_ValidValuesStored` | `Sigma`: loop ผ่านทุก element โดยไม่เข้า if (s[i]<0) |
| `testSigma_NegativeValueThrows` | `Sigma`: if (s[i] < 0) → throw `NotPositiveException` |
| `testSigma_EmptyArrayAllowed` | `Sigma`: boundary length=0, loop ไม่รัน |
| `testSigma_GetterReturnsDefensiveCopy` | `getSigma()` clone behavior |
| `testPopulationSize_ValidValue` | `PopulationSize`: else-branch (size>0) |
| `testPopulationSize_ZeroThrows` | `PopulationSize`: if (size<=0) boundary =0 |
| `testPopulationSize_NegativeThrows` | `PopulationSize`: if (size<=0) ค่า<0 |
| `testOptimize_SigmaDimensionMismatchThrows` | `checkParameters`: if (inputSigma.length != init.length) |
| `testOptimize_SigmaOutOfRangeThrows` | `checkParameters`: if (inputSigma[i] > uB[i]-lB[i]) |
| `testOptimize_MissingPopulationSizeThrows` | `initializeCMA`: if (lambda <= 0) |
| `testOptimize_SphereMinimizeConverges` | main generationLoop, `isMinimize=true`, full flow ปกติ |
| `testOptimize_SphereMaximizeWithBounds` | `isMinimize=false` branch, repair/penalty logic |
| `testOptimize_GenerateStatisticsTrue_HistoriesPopulated` | `if (generateStatistics)` = true |
| `testOptimize_GenerateStatisticsFalse_HistoriesEmpty` | `if (generateStatistics)` = false |
| `testOptimize_ActiveCMA_True_RunsWithoutError` | `isActiveCMA` = true branch ใน `updateCovariance` |
| `testOptimize_ActiveCMA_False_RunsWithoutError` | `isActiveCMA` = false (else) branch |
| `testOptimize_DiagonalOnlyPositive_RunsWithoutError` | `if (diagonalOnly <= 0)` = false → `updateCovarianceDiagonalOnly` |
| `testOptimize_DiagonalOnlyTransitionToFullCovariance` | `if (diagonalOnly > 1 && iterations > diagonalOnly)` switch to full covariance |
| `testOptimize_StopFitnessNonZero_EarlyTerminationHandled` | `if (stopFitness != 0)` branch |
| `testOptimize_CheckFeasableCountWithTightBounds` | retry-loop `for (i < checkFeasableCount+1)`, `isFeasible()` false branch, regenerate `randn` |
| `testOptimize_ConvergenceCheckerForcesEarlyStop` | `if (getConvergenceChecker()!=null && lastResult!=null)` → break generationLoop |
| `testOptimize_MaxEvalZero_ThrowsImmediately` | `fitfun.value(guess)` (ไม่มี try/catch) → exception propagate |
| `testOptimize_MaxEvalExceededDuringLoop_HandledGracefully` | `try/catch(TooManyEvaluationsException){break generationLoop;}` ภายใน k-loop |
| `testOptimize_AllZeroSigma_DoesNotThrowUnexpectedException` | boundary sigma = 0 ทุกตัว (ไม่ throw ตาม `Sigma` constructor) |

**หมายเหตุทั่วไป:** เนื่องจาก CMA-ES เป็น stochastic algorithm จึงไม่ assert ค่าตัวเลขแบบ exact ในหลาย ๆ เทส แต่ใช้ seeded random generator (`JDKRandomGenerator` + fixed seed) เพื่อให้ผลลัพธ์ reproducible ได้ในระดับที่ยอมรับได้ และบางจุด (เช่น sigma ทั้งหมดเป็น 0) ไม่มีสเปกชัดเจนว่าควรมี behavior อย่างไร จึงเทสเพียงว่าไม่ throw exception ที่ไม่คาดคิด ตามข้อกำหนดห้ามเดา behavior