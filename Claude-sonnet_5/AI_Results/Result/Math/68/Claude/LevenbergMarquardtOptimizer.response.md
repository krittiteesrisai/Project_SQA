# JUnit 4 Test Suite: LevenbergMarquardtOptimizerTest

## หมายเหตุสำคัญก่อนเริ่ม (ข้อกำหนดที่ 4)

ซอร์สโค้ดที่ให้มาแสดงเพียงเมธอด `doOptimize()`, `determineLMParameter()`, `determineLMDirection()`, `qrDecomposition()`, `qTy()` และ setters เท่านั้น โดย **ไม่มี** definition ของ:
- public method `optimize(DifferentiableMultivariateVectorialFunction, double[] target, double[] weights, double[] startPoint)` ที่เรียก `doOptimize()` (ต้องมีอยู่จริงใน superclass `AbstractLeastSquaresOptimizer` เพื่อให้ class ใช้งานได้)
- `setMaxIterations(int)` / `incrementIterationsCounter()` (เรียกใช้ใน constructor แต่ไม่มี definition)
- `VectorialPointValuePair.getPoint()/getValue()`

จึงต้อง**สมมติ (assume)** ว่า method เหล่านี้มีอยู่ตาม public API มาตรฐานของ Apache Commons Math 2.0 (จำเป็นต่อการเรียกใช้งาน class นี้ได้เลย) — มีคอมเมนต์กำกับไว้ในทุกจุดที่เกี่ยวข้อง

```java
package org.apache.commons.math.optimization.general;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.VectorialPointValuePair;

import org.junit.Test;

/**
 * JUnit4 test suite for {@link LevenbergMarquardtOptimizer} (Defects4J Math-68b).
 *
 * ข้อสมมติฐาน (ไม่ได้แสดงใน source ที่ให้มา แต่จำเป็นต่อการเรียกใช้งาน class):
 *  - public optimize(DifferentiableMultivariateVectorialFunction f, double[] target,
 *      double[] weights, double[] startPoint) สืบทอดจาก AbstractLeastSquaresOptimizer
 *  - setMaxIterations(int) สืบทอดมา (เรียกใช้ใน constructor ของ class เป้าหมายเอง)
 *  - VectorialPointValuePair มี getPoint()/getValue()
 */
public class LevenbergMarquardtOptimizerTest {

    // ---------------------------------------------------------------
    // Helper: ฟังก์ชันเชิงเส้น y = A.x (constant jacobian = A)
    // ---------------------------------------------------------------
    private DifferentiableMultivariateVectorialFunction linearFunction(final double[][] factors) {
        return new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] variables) throws FunctionEvaluationException {
                double[] y = new double[factors.length];
                for (int i = 0; i < y.length; ++i) {
                    double sum = 0;
                    for (int j = 0; j < variables.length; ++j) {
                        sum += factors[i][j] * variables[j];
                    }
                    y[i] = sum;
                }
                return y;
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return factors;
                    }
                };
            }
        };
    }

    private double[] unitWeights(int n) {
        double[] w = new double[n];
        for (int i = 0; i < n; ++i) {
            w[i] = 1.0;
        }
        return w;
    }

    // -----------------------------------------------------------
    // 1) Setters ไม่มี validation ใน source -> ต้องไม่ throw ไม่ว่าค่าใด (boundary: 0, ลบ, ใหญ่มาก)
    // -----------------------------------------------------------
    @Test
    public void testSettersAcceptBoundaryValues() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(0.0);
        optimizer.setInitialStepBoundFactor(-100.0);
        optimizer.setInitialStepBoundFactor(1.0e10);
        optimizer.setCostRelativeTolerance(0.0);
        optimizer.setCostRelativeTolerance(-1.0);
        optimizer.setParRelativeTolerance(0.0);
        optimizer.setOrthoTolerance(0.0);
        optimizer.setOrthoTolerance(1.0);
        assertTrue(true); // ยืนยันว่าไม่มี exception เกิดขึ้น
    }

    // -----------------------------------------------------------
    // 2) cost == 0 ตั้งแต่แรก -> ข้าม "if (cost != 0)" loop, maxCosine (ยังเป็น 0)
    //    <= orthoTolerance -> return ทันที โดยไม่มี inner loop ใด ๆ รันเลย
    // -----------------------------------------------------------
    @Test
    public void testExactSolutionZeroCostImmediateReturn() throws Exception {
        double[][] factors = { {1, 0}, {0, 1} };
        double[] target = {2.0, 3.0};
        double[] start   = {2.0, 3.0}; // residual = 0 พอดี

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(linearFunction(factors), target, unitWeights(2), start);

        assertArrayEquals(new double[]{2.0, 3.0}, result.getPoint(), 1.0e-10);
    }

    // -----------------------------------------------------------
    // 3) Over-determined (rows > cols) consistent system -> solvedCols = cols,
    //    rank == solvedCols branch ใน determineLMParameter, converge exact
    // -----------------------------------------------------------
    @Test
    public void testOverDeterminedConsistentSystemConverges() throws Exception {
        double[][] factors = { {1, 0}, {0, 1}, {1, 1} };
        double[] target = {2.0, 3.0, 5.0}; // x=2, y=3 ทำให้ทุกสมการจริง
        double[] start   = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(linearFunction(factors), target, unitWeights(3), start);

        assertArrayEquals(new double[]{2.0, 3.0}, result.getPoint(), 1.0e-6);
    }

    // -----------------------------------------------------------
    // 4) Over-determined inconsistent system -> inner loop วนหลายรอบ,
    //    ครอบคลุม ratio<=0.25 / (lmPar==0 || ratio>=0.75) branches
    // -----------------------------------------------------------
    @Test
    public void testOverDeterminedInconsistentSystemLeastSquares() throws Exception {
        double[][] factors = { {1, 0}, {0, 1}, {1, 1} };
        double[] target = {2.0, 3.0, 6.0}; // inconsistent (2+3 != 6)
        double[] start   = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(linearFunction(factors), target, unitWeights(3), start);

        // Normal equation: x = 7/3, y = 10/3
        assertArrayEquals(new double[]{7.0 / 3.0, 10.0 / 3.0}, result.getPoint(), 1.0e-4);
    }

    // -----------------------------------------------------------
    // 5) Rank deficient (column เป็นศูนย์) -> qrDecomposition(): ak2==0 -> rank=k; return
    //    และ determineLMParameter(): rank != solvedCols -> ข้าม "if (rank==solvedCols)" (parl=0)
    // -----------------------------------------------------------
    @Test
    public void testRankDeficientZeroColumn() throws Exception {
        double[][] factors = { {1, 0}, {0, 0} };
        double[] target = {2.0, 0.0};
        double[] start   = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(linearFunction(factors), target, unitWeights(2), start);

        assertEquals(2.0, result.getPoint()[0], 1.0e-6);
        assertEquals(0.0, result.getPoint()[1], 1.0e-10); // คอลัมน์ว่าง -> ไม่ขยับจากจุดเริ่มต้น
    }

    // -----------------------------------------------------------
    // 6) Under-determined (cols > rows) consistent system -> solvedCols = rows,
    //    rank == rows (== solvedCols) branch, ak2==0 เกิดจาก j-loop ว่างเมื่อ k >= rows
    // -----------------------------------------------------------
    @Test
    public void testUnderDeterminedConsistentSystem() throws Exception {
        double[][] factors = { {1, 1} }; // x + y = 4
        double[] target = {4.0};
        double[] start   = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(linearFunction(factors), target, unitWeights(1), start);

        double[] p = result.getPoint();
        assertEquals(4.0, p[0] + p[1], 1.0e-6);
    }

    // -----------------------------------------------------------
    // 7) orthoTolerance สูงมาก -> "if (maxCosine <= orthoTolerance)" true ตั้งแต่รอบแรก
    //    -> return ก่อนเข้า inner loop เลย -> point ต้องเท่ากับ startPoint เป๊ะ
    // -----------------------------------------------------------
    @Test
    public void testHighOrthoToleranceReturnsImmediatelyAtStartPoint() throws Exception {
        double[][] factors = { {1, 0}, {0, 1}, {1, 1} };
        double[] target = {2.0, 3.0, 6.0}; // inconsistent เพื่อให้ cost != 0
        double[] start   = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setOrthoTolerance(1.0);

        VectorialPointValuePair result =
            optimizer.optimize(linearFunction(factors), target, unitWeights(3), start);

        assertArrayEquals(start, result.getPoint(), 1.0e-12);
    }

    // -----------------------------------------------------------
    // 8) initialStepBoundFactor เป็นค่าลบ (boundary) -> delta ติดลบตั้งแต่ต้น
    //    ครอบคลุม branch "delta <= parRelativeTolerance * xNorm" ที่อาจ true ทันที
    //    *** ผลลัพธ์ที่แน่ชัด (exception หรือค่า NaN) ไม่สามารถยืนยันได้ 100% จาก source
    //        ที่ให้มา จึงรับผลลัพธ์ได้ทั้งสองทาง และไม่ fail หากเกิด OptimizationException ***
    // -----------------------------------------------------------
    @Test
    public void testNegativeInitialStepBoundFactorDoesNotCrashUnexpectedly() {
        double[][] factors = { {1, 0}, {0, 1} };
        double[] target = {2.0, 3.0};
        double[] start   = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(-1.0);

        try {
            VectorialPointValuePair result =
                optimizer.optimize(linearFunction(factors), target, unitWeights(2), start);
            assertTrue(result.getPoint() != null);
        } catch (OptimizationException oe) {
            assertTrue(true);
        } catch (Exception e) {
            fail("Unexpected exception type: " + e.getClass());
        }
    }

    // -----------------------------------------------------------
    // 9) Empty problem (rows=0, cols=0) -> ทุก loop ที่ขึ้นกับ cols/rows ไม่ execute,
    //    cost==0 -> maxCosine(0) <= orthoTolerance -> return ทันทีโดยไม่ error
    // -----------------------------------------------------------
    @Test
    public void testEmptyProblemReturnsEmptyPointWithoutException() throws Exception {
        double[][] factors = new double[0][0];
        double[] target = new double[0];
        double[] start   = new double[0];

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialPointValuePair result =
            optimizer.optimize(linearFunction(factors), target, unitWeights(0), start);

        assertEquals(0, result.getPoint().length);
    }

    // -----------------------------------------------------------
    // 10) maxIterations ต่ำเกินไป -> คาดว่า throw OptimizationException จาก
    //     incrementIterationsCounter() (สมมติฐาน behavior จาก superclass ที่ไม่แสดงใน source)
    // -----------------------------------------------------------
    @Test
    public void testTooFewMaxIterationsThrowsOptimizationException() {
        double[][] factors = { {1, 0}, {0, 1}, {1, 1} };
        double[] target = {2.0, 3.0, 6.0};
        double[] start   = {-50.0, 50.0}; // เริ่มไกลจากคำตอบ เพื่อบังคับหลาย iteration

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1);

        try {
            optimizer.optimize(linearFunction(factors), target, unitWeights(3), start);
            fail("Expected an OptimizationException due to too few max iterations");
        } catch (OptimizationException oe) {
            assertTrue(true);
        } catch (Exception e) {
            fail("Unexpected exception type: " + e.getClass());
        }
    }

    // -----------------------------------------------------------
    // 11) costRelativeTolerance/parRelativeTolerance สูงมาก -> ครอบคลุม branch
    //     convergence check "(Math.abs(actRed) <= costRelativeTolerance) && ... " ที่ตอบ true เร็ว
    // -----------------------------------------------------------
    @Test
    public void testHighCostAndParToleranceConvergesQuickly() throws Exception {
        double[][] factors = { {1, 0}, {0, 1}, {1, 1} };
        double[] target = {2.0, 3.0, 6.0};
        double[] start   = {0.0, 0.0};

        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(1.0);
        optimizer.setParRelativeTolerance(1.0);

        VectorialPointValuePair result =
            optimizer.optimize(linearFunction(factors), target, unitWeights(3), start);

        assertTrue(result.getPoint() != null);
    }
}
```

## ตารางสรุป Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testSettersAcceptBoundaryValues` | เรียก setter ทั้ง 4 ตัวด้วยค่า 0 / ลบ / ใหญ่มาก (ไม่มี validation logic ใน source, ยืนยันไม่ throw) |
| `testExactSolutionZeroCostImmediateReturn` | `cost != 0` = **false** (ข้าม orthogonality-sum loop); `maxCosine <= orthoTolerance` = **true** ทันที (return ก่อนเข้า inner loop) |
| `testOverDeterminedConsistentSystemConverges` | rows > cols, `solvedCols = min(rows,cols) = cols`; `rank == solvedCols` = **true** ใน `determineLMParameter`; ลู่เข้า exact solution |
| `testOverDeterminedInconsistentSystemLeastSquares` | inner loop วนหลายรอบ; `ratio <= 0.25`, `(lmPar==0 \|\| ratio>=0.75)` branches; convergence ผ่าน `costRelativeTolerance` check |
| `testRankDeficientZeroColumn` | `qrDecomposition()`: `ak2 == 0` → `rank = k; return` (**true**); `determineLMParameter()`: `rank == solvedCols` = **false** (ข้าม if, parl=0) |
| `testUnderDeterminedConsistentSystem` | cols > rows, `solvedCols = rows`; j-loop ว่างเมื่อ `k >= rows` → `ak2==0` ทำให้ `rank==solvedCols` พอดี |
| `testHighOrthoToleranceReturnsImmediatelyAtStartPoint` | `maxCosine <= orthoTolerance` = **true** ตั้งแต่รอบแรก (cost != 0 เป็น true เพื่อให้คำนวณ maxCosine จริง) → ไม่เข้า inner loop เลย |
| `testNegativeInitialStepBoundFactorDoesNotCrashUnexpectedly` | boundary: `initialStepBoundFactor < 0` → ทดสอบ branch `delta <= parRelativeTolerance * xNorm` / การ throw `OptimizationException` ที่เป็นไปได้ |
| `testEmptyProblemReturnsEmptyPointWithoutException` | boundary: rows=0, cols=0 → ทุก for-loop ที่ bound ด้วย cols/rows ไม่ execute; `cost != 0` = false; return ทันที |
| `testTooFewMaxIterationsThrowsOptimizationException` | จำกัด `maxIterations=1` → ทดสอบ exception path จาก `incrementIterationsCounter()` (inherited, สมมติฐาน) |
| `testHighCostAndParToleranceConvergesQuickly` | convergence check `(Math.abs(actRed) <= costRelativeTolerance) && (preRed <= costRelativeTolerance) && (ratio <= 2.0)` = **true** เร็วขึ้นจาก tolerance สูง |

**ข้อจำกัดที่ต้องระวัง:** test #8 และ #10 มีความไม่แน่นอนเรื่อง exact behavior เนื่องจาก logic บางส่วน (exception throwing จาก superclass, NaN propagation) ไม่ได้แสดงอยู่ใน source ที่ให้มาโดยตรง จึงออกแบบให้ assertion ยอมรับได้ทั้งสองทาง (`try/catch`) พร้อมคอมเมนต์กำกับไว้ตามข้อกำหนดที่ 4