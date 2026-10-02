# วิเคราะห์และชุดทดสอบ JUnit 4 สำหรับ `BrentSolver`

## หมายเหตุสำคัญ (สมมติฐานที่ไม่สามารถยืนยันจาก source ที่ให้มา)

- `UnivariateRealSolverImpl` ไม่ได้แสดง source มาด้วย จึงสมมติ behavior มาตรฐานของ Apache Commons Math ยุคนั้น:
  - มี public setter: `setFunctionValueAccuracy(double)`, `setMaximalIterationCount(int)`
  - `verifyInterval(min,max)` throw `IllegalArgumentException` เมื่อ `min >= max`
  - `verifySequence(min,initial,max)` throw `IllegalArgumentException` เมื่อ `initial` ไม่อยู่ระหว่าง `min` และ `max`
- จากการวิเคราะห์ static ของ `solve(f,min,max,initial)` พบว่า branch สุดท้าย `return solve(f, min, yMin, max, yMax, initial, yInitial);` (full Brent fallback) **ไม่สามารถ reach ได้จริงด้วยค่า accuracy ปกติ (>=0)** เพราะเงื่อนไข sign ทางคณิตศาสตร์ขัดแย้งกันเอง — จึงไม่เขียนเทสเฉพาะสำหรับ branch นี้ เพื่อไม่เดา behavior ที่ไม่ยืนยันได้
- ใช้ค่า literal คงที่ (deterministic) ในการเปรียบเทียบผลลัพธ์ของ branch ที่เป็น "defect" (bug-for-bug) เพื่อสะท้อน behavior จริงของซอร์ส Math-72b (ไม่ได้ "เดา" แต่ยืนยันจากการอ่านโค้ดตรงๆ)

```java
package org.apache.commons.math.analysis.solvers;

import static org.junit.Assert.*;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Test;

public class BrentSolverTest {

    // ---------- Helper functions ----------

    /** f(x) = x - root : ฟังก์ชันเชิงเส้น ใช้ทดสอบ convergence ที่ชัดเจน/exact */
    private static UnivariateRealFunction linear(final double root) {
        return new UnivariateRealFunction() {
            public double value(double x) {
                return x - root;
            }
        };
    }

    /** f(x) = x^3 - 2x - 5 : ฟังก์ชัน cubic classic (root ~ 2.0945514815423265) */
    private static UnivariateRealFunction cubic() {
        return new UnivariateRealFunction() {
            public double value(double x) {
                return x * x * x - 2 * x - 5;
            }
        };
    }

    /** f(x) = sin(x) */
    private static UnivariateRealFunction sine() {
        return new UnivariateRealFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };
    }

    /** f(x) = x*x - 2 (root = sqrt(2)) */
    private static UnivariateRealFunction square() {
        return new UnivariateRealFunction() {
            public double value(double x) {
                return x * x - 2;
            }
        };
    }

    /** ฟังก์ชันที่ throw เสมอ - ใช้ยืนยันว่าไม่ถูกเรียก (verify order-of-operations) */
    private static UnivariateRealFunction neverCalled() {
        return new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(x);
            }
        };
    }

    /**
     * ฟังก์ชัน "stub" ที่ตอบค่าตามจุดที่กำหนดไว้ล่วงหน้าเท่านั้น
     * ถ้าถูกเรียกด้วย x ที่ไม่ได้กำหนด -> throw เพื่อยืนยันว่า
     * ไม่มีการ evaluate เกินกว่าที่คาดไว้ (ช่วย detect fault เรื่อง evaluation order)
     */
    private static UnivariateRealFunction pointFunction(final double[] xs, final double[] ys) {
        return new UnivariateRealFunction() {
            public double value(double x) {
                for (int i = 0; i < xs.length; i++) {
                    if (x == xs[i]) {
                        return ys[i];
                    }
                }
                throw new IllegalStateException("Unexpected evaluation point: " + x);
            }
        };
    }

    private static final double EPS = 1e-6;

    // =========================================================
    // solve(f, min, max)  -- 2-argument version
    // =========================================================

    @Test
    public void testSolveMinMax_OppositeSign_LinearRoot() throws Exception {
        BrentSolver solver = new BrentSolver();
        double result = solver.solve(linear(3.0), 0.0, 10.0);
        assertEquals(3.0, result, EPS);
    }

    @Test
    public void testSolveMinMax_SignPositive_YMinNearZero_ReturnsMin() throws Exception {
        // sign>0 (ทั้งสองค่าบวก), yMin ใกล้ศูนย์ -> คืน min (ไม่มี defect ใน branch นี้)
        UnivariateRealFunction f = pointFunction(
            new double[]{0.0, 10.0},
            new double[]{5e-7, 3.0});
        BrentSolver solver = new BrentSolver();
        solver.setFunctionValueAccuracy(1e-6);
        double result = solver.solve(f, 0.0, 10.0);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testSolveMinMax_SignPositive_YMaxNearZero_ReturnsMax() throws Exception {
        // sign>0 (ทั้งสองค่าลบ), yMax ใกล้ศูนย์ -> คืน max
        UnivariateRealFunction f = pointFunction(
            new double[]{0.0, 10.0},
            new double[]{-3.0, -5e-7});
        BrentSolver solver = new BrentSolver();
        solver.setFunctionValueAccuracy(1e-6);
        double result = solver.solve(f, 0.0, 10.0);
        assertEquals(10.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveMinMax_SameSignNotNearZero_Throws() throws Exception {
        UnivariateRealFunction f = pointFunction(
            new double[]{0.0, 10.0},
            new double[]{3.0, 5.0});
        BrentSolver solver = new BrentSolver();
        solver.setFunctionValueAccuracy(1e-6);
        solver.solve(f, 0.0, 10.0);
    }

    @Test
    public void testSolveMinMax_SignZero_YMinExactlyZero_ReturnsMin() throws Exception {
        UnivariateRealFunction f = pointFunction(
            new double[]{0.0, 10.0},
            new double[]{0.0, 7.0});
        BrentSolver solver = new BrentSolver();
        double result = solver.solve(f, 0.0, 10.0);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testSolveMinMax_SignZero_YMaxExactlyZero_ReturnsMax() throws Exception {
        UnivariateRealFunction f = pointFunction(
            new double[]{0.0, 10.0},
            new double[]{4.0, 0.0});
        BrentSolver solver = new BrentSolver();
        double result = solver.solve(f, 0.0, 10.0);
        assertEquals(10.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveMinMax_InvalidInterval_Throws() throws Exception {
        // min >= max -> verifyInterval ควร throw ก่อนเรียก f.value() เลย
        BrentSolver solver = new BrentSolver();
        solver.solve(neverCalled(), 5.0, 5.0);
    }

    // =========================================================
    // solve(f, min, max, initial) -- 3-argument version
    // =========================================================

    @Test
    public void testSolveMinMaxInitial_InitialNearZero_ReturnsInitial() throws Exception {
        UnivariateRealFunction f = pointFunction(
            new double[]{5.0},
            new double[]{5e-7});
        BrentSolver solver = new BrentSolver();
        solver.setFunctionValueAccuracy(1e-6);
        double result = solver.solve(f, 0.0, 10.0, 5.0);
        assertEquals(5.0, result, 0.0);
    }

    /**
     * ทดสอบ branch "yMin near zero" ใน solve(f,min,max,initial)
     * ซอร์สโค้ดมี defect: setResult(yMin, 0) ซึ่งเก็บค่า "ค่าฟังก์ชัน" แทนตำแหน่ง "min"
     * เทสนี้ยืนยัน behavior จริงตามซอร์ส (bug-for-bug), ไม่ใช่ behavior ที่ควรจะเป็น
     */
    @Test
    public void testSolveMinMaxInitial_YMinNearZero_ExposesDefect() throws Exception {
        UnivariateRealFunction f = pointFunction(
            new double[]{5.0, 0.0},
            new double[]{2.0, -5e-7}); // initial=5 -> 2.0 (ไม่ใกล้ศูนย์), min=0 -> -5e-7 (ใกล้ศูนย์)
        BrentSolver solver = new BrentSolver();
        solver.setFunctionValueAccuracy(1e-6);
        double result = solver.solve(f, 0.0, 10.0, 5.0);
        // ตามซอร์ส: ผลลัพธ์ควรเท่ากับค่า yMin (-5e-7) ไม่ใช่ตำแหน่ง min(=0.0)
        assertEquals(-5e-7, result, 0.0);
        assertNotEquals(0.0, result); // ยืนยันว่าไม่ใช่ min จริง ๆ (เพื่อให้เห็น defect ชัดขึ้น)
    }

    @Test
    public void testSolveMinMaxInitial_YInitialTimesYMinNegative_Reduces() throws Exception {
        // branch: yInitial*yMin < 0 -> reduce interval [min, initial]
        BrentSolver solver = new BrentSolver();
        double result = solver.solve(linear(3.0), 0.0, 10.0, 5.0);
        assertEquals(3.0, result, EPS);
    }

    /**
     * ทดสอบ branch "yMax near zero" ใน solve(f,min,max,initial)
     * เช่นเดียวกับ min-branch, ซอร์สมี defect: setResult(yMax, 0)
     */
    @Test
    public void testSolveMinMaxInitial_YMaxNearZero_ExposesDefect() throws Exception {
        UnivariateRealFunction f = pointFunction(
            new double[]{5.0, 0.0, 10.0},
            new double[]{-4.0, -9.0, 5e-7});
        // yInitial=-4 (ไม่ใกล้ศูนย์), yMin=-9 (ไม่ใกล้ศูนย์), product=36>0 -> skip reduce1
        // yMax=5e-7 (ใกล้ศูนย์) -> trigger defect branch
        BrentSolver solver = new BrentSolver();
        solver.setFunctionValueAccuracy(1e-6);
        double result = solver.solve(f, 0.0, 10.0, 5.0);
        assertEquals(5e-7, result, 0.0);
        assertNotEquals(10.0, result);
    }

    @Test
    public void testSolveMinMaxInitial_YInitialTimesYMaxNegative_Reduces() throws Exception {
        // branch: yInitial*yMax < 0 -> reduce interval [initial, max]
        BrentSolver solver = new BrentSolver();
        double result = solver.solve(linear(7.0), 0.0, 10.0, 2.0);
        assertEquals(7.0, result, EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveMinMaxInitial_YMinTimesYMaxPositive_Throws() throws Exception {
        // f(x) = x^2 + 5 : ไม่มี root จริง, ทุกค่าเป็นบวกและไม่ใกล้ศูนย์
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return x * x + 5;
            }
        };
        BrentSolver solver = new BrentSolver();
        solver.setFunctionValueAccuracy(1e-6);
        solver.solve(f, -2.0, 2.0, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveMinMaxInitial_InitialOutOfRange_Throws() throws Exception {
        // สมมติฐาน: verifySequence ตรวจ initial ต้องอยู่ใน [min,max]
        BrentSolver solver = new BrentSolver();
        solver.solve(neverCalled(), 0.0, 10.0, 20.0);
    }

    @Test
    public void testSolveMinMaxInitial_NonlinearConvergence() throws Exception {
        // ผสาน branch "yInitial*yMin<0" กับ full Brent iteration หลาย step (cubic)
        BrentSolver solver = new BrentSolver();
        double result = solver.solve(cubic(), 2.0, 3.0, 2.5);
        assertEquals(2.0945514815423265, result, 1e-6);
    }

    // =========================================================
    // Private core algorithm (เข้าถึงผ่าน public entry points)
    // =========================================================

    @Test
    public void testFullBrentAlgorithm_CubicFunction() throws Exception {
        // ครอบคลุม: swap, linear & inverse-quadratic interpolation,
        // bisection fallback, bracket update ((y1>0)==(y2>0))
        BrentSolver solver = new BrentSolver();
        double result = solver.solve(cubic(), 2.0, 3.0);
        assertEquals(2.0945514815423265, result, 1e-6);
    }

    @Test
    public void testFullBrentAlgorithm_SineFunction() throws Exception {
        BrentSolver solver = new BrentSolver();
        double result = solver.solve(sine(), 3.0, 4.0);
        assertEquals(Math.PI, result, 1e-6);
    }

    @Test
    public void testFullBrentAlgorithm_SquareRootFunction() throws Exception {
        BrentSolver solver = new BrentSolver();
        double result = solver.solve(square(), 0.0, 2.0);
        assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded() throws Exception {
        // ตั้ง maximalIterationCount=0 เพื่อบังคับให้ loop ไม่ถูก execute แม้แต่ครั้งเดียว
        // แล้ว throw MaxIterationsExceededException ทันทีที่จบ while
        BrentSolver solver = new BrentSolver();
        solver.setMaximalIterationCount(0);
        // ใช้ linear function ที่ไป trigger branch "yInitial*yMax<0" (ไม่ชน near-zero shortcut)
        solver.solve(linear(3.0), 0.0, 10.0, 1.0);
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testFunctionEvaluationExceptionPropagates() throws Exception {
        BrentSolver solver = new BrentSolver();
        solver.solve(neverCalled(), 0.0, 10.0);
    }

    // =========================================================
    // Deprecated methods (constructor with function + 2 deprecated solve)
    // =========================================================

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedSolveMinMax() throws Exception {
        BrentSolver solver = new BrentSolver(linear(3.0));
        double result = solver.solve(0.0, 10.0);
        assertEquals(3.0, result, EPS);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testDeprecatedSolveMinMaxInitial() throws Exception {
        BrentSolver solver = new BrentSolver(linear(3.0));
        double result = solver.solve(0.0, 10.0, 1.0);
        assertEquals(3.0, result, EPS);
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testSolveMinMax_OppositeSign_LinearRoot` | `solve(f,min,max)`: `sign<0` → ใช้ endpoint เป็น initial guess + full private algorithm (linear interpolation, exact convergence) |
| `testSolveMinMax_SignPositive_YMinNearZero_ReturnsMin` | `sign>0`, `abs(yMin)<=accuracy` → `ret=min` |
| `testSolveMinMax_SignPositive_YMaxNearZero_ReturnsMax` | `sign>0`, `abs(yMin)>accuracy`, `abs(yMax)<=accuracy` → `ret=max` |
| `testSolveMinMax_SameSignNotNearZero_Throws` | `sign>0`, ทั้งสองไม่ใกล้ศูนย์ → `throw IllegalArgumentException` |
| `testSolveMinMax_SignZero_YMinExactlyZero_ReturnsMin` | `sign==0`, `yMin==0.0` → `ret=min` |
| `testSolveMinMax_SignZero_YMaxExactlyZero_ReturnsMax` | `sign==0`, `yMin!=0.0` → `ret=max` |
| `testSolveMinMax_InvalidInterval_Throws` | `verifyInterval` throw ก่อน evaluate f (min>=max) |
| `testSolveMinMaxInitial_InitialNearZero_ReturnsInitial` | `abs(yInitial)<=accuracy` → return initial |
| `testSolveMinMaxInitial_YMinNearZero_ExposesDefect` | `abs(yMin)<=accuracy` → **defect**: `setResult(yMin,0)` |
| `testSolveMinMaxInitial_YInitialTimesYMinNegative_Reduces` | `yInitial*yMin<0` → reduce `[min,initial]` |
| `testSolveMinMaxInitial_YMaxNearZero_ExposesDefect` | `abs(yMax)<=accuracy` → **defect**: `setResult(yMax,0)` |
| `testSolveMinMaxInitial_YInitialTimesYMaxNegative_Reduces` | `yInitial*yMax<0` → reduce `[initial,max]` |
| `testSolveMinMaxInitial_YMinTimesYMaxPositive_Throws` | `yMin*yMax>0` → throw |
| `testSolveMinMaxInitial_InitialOutOfRange_Throws` | `verifySequence` throw (initial นอกช่วง) |
| `testSolveMinMaxInitial_NonlinearConvergence` | เส้นทาง reduce + หลาย iteration ของ private algorithm (cubic) |
| `testFullBrentAlgorithm_CubicFunction` | swap (`abs(y2)<abs(y1)`), inverse-quadratic interpolation, bracket update `(y1>0)==(y2>0)` |
| `testFullBrentAlgorithm_SineFunction` | bisection fallback, การวนหลาย iteration ของฟังก์ชัน non-polynomial |
| `testFullBrentAlgorithm_SquareRootFunction` | linear interpolation ตอนเริ่ม (`x0==x2`), convergence ผ่าน `dx<=tolerance` |
| `testMaxIterationsExceeded` | loop ไม่ execute (`i<maximalIterationCount` เป็น false ทันที) → throw `MaxIterationsExceededException` |
| `testFunctionEvaluationExceptionPropagates` | การ propagate `FunctionEvaluationException` จาก `f.value()` |
| `testDeprecatedSolveMinMax` | deprecated `solve(min,max)` → delegate ไป `solve(f,min,max)` |
| `testDeprecatedSolveMinMaxInitial` | deprecated `solve(min,max,initial)` → delegate ไป `solve(f,min,max,initial)` |

### Branch ที่ไม่ได้ครอบคลุม (พร้อมเหตุผล)
- `return solve(f, min, yMin, max, yMax, initial, yInitial);` (full-Brent fallback บรรทัดสุดท้ายของ `solve(f,min,max,initial)`) — จากการวิเคราะห์ sign algebra พบว่า **ไม่สามารถ reach ได้จริง** ด้วยค่า `functionValueAccuracy >= 0** ตามปกติ จึงไม่เขียนเทสเฉพาะเพื่อหลีกเลี่ยงการ "เดา" behavior ที่ไม่สามารถยืนยันได้
- เงื่อนไขปลีกย่อยบางจุดใน private algorithm เช่น `dx>0` vs `dx<=0` (เมื่อ `abs(delta)<=tolerance`) ไม่ได้ assert แยก เนื่องจากเป็น floating-point edge case ที่ depend on การคำนวณภายในแต่ละ iteration — คาดว่าถูก exercise โดยอัตโนมัติจาก `testFullBrentAlgorithm_*` แต่ไม่สามารถยืนยัน exact iteration ที่เกิดได้โดยไม่ trace ภายใน