# การวิเคราะห์และชุดทดสอบ JUnit 4 สำหรับ `BrentSolver`

## หมายเหตุสำคัญก่อนเริ่ม

1. ไม่มีซอร์สของ `UnivariateRealSolverImpl` ให้มา จึงใช้เฉพาะสิ่งที่ `BrentSolver` เปิดเผยผ่าน public API (constructor + `solve(min,max,initial)` + `solve(min,max)`) และยึดตาม **Javadoc ที่ให้มาจริง** (เช่น "`throws IllegalArgumentException if min is not less than max`")
2. จากการวิเคราะห์โค้ด พบรูปแบบที่น่าสงสัยอย่างมาก (คาดว่าเป็น defect จริงของ Math-97b):
   - `setResult(yMin, 0)` ควรเป็น `setResult(min, 0)` (เพราะ `setResult` ควรรับค่า **x** ของราก ไม่ใช่ค่าฟังก์ชัน)
   - `setResult(yMax, 0)` ควรเป็น `setResult(max, 0)` เช่นกัน
   
   จึงออกแบบ `testSolveThreeArg_MinIsRoot_ExposesSetResultBug` และ `testSolveThreeArg_MaxIsRoot_ExposesSetResultBug` ให้ assert ค่าที่ **ถูกต้องทางคณิตศาสตร์** เพื่อดักจับ fault นี้โดยตรง (จะ fail บนโค้ดที่มี defect)
3. กรณีที่ไม่สามารถพิสูจน์ผลลัพธ์แน่ชัดได้จากการอ่านโค้ดเพียงอย่างเดียว (เช่น จำนวนรอบ loop ที่แท้จริงก่อน throw `MaxIterationsExceededException`) จะเขียนเทสแบบยอมรับได้ทั้งสองผลลัพธ์ พร้อมคอมเมนต์กำกับความไม่แน่ใจตามข้อกำหนด

---

```java
package org.apache.commons.math.analysis;

import static org.junit.Assert.*;
import org.junit.Test;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;

/**
 * JUnit 4 test suite for {@link BrentSolver} (Defects4J Math-97b).
 */
public class BrentSolverTest {

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------

    @Test
    public void testConstructorDoesNotThrow() {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x; }
        };
        BrentSolver solver = new BrentSolver(f);
        assertNotNull(solver);
    }

    // ---------------------------------------------------------------
    // solve(min, max, initial) - guard: (initial-min)*(max-initial) < 0
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSolveThreeArg_InitialBelowMin_ThrowsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(0, 10, -1); // initial < min
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveThreeArg_InitialAboveMax_ThrowsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(0, 10, 11); // initial > max
    }

    @Test
    public void testSolveThreeArg_InitialEqualsMinBoundary_NoException() throws Exception {
        // boundary: (initial-min)*(max-initial) == 0 (ไม่ < 0) จึงไม่ throw
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 5; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(5, 10, 5); // initial == min == root
        assertEquals(5.0, result, 1e-6);
    }

    @Test
    public void testSolveThreeArg_DegenerateInterval_MinEqualsMaxEqualsInitial() throws Exception {
        // solve(min,max,initial) ไม่เรียก verifyInterval จึงไม่ validate min<max
        // -> อนุญาตช่วงที่กว้าง 0 ได้ (ต่างจาก solve(min,max) สองพารามิเตอร์)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 5; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(5, 5, 5);
        assertEquals(5.0, result, 1e-9);
    }

    // ---------------------------------------------------------------
    // solve(min, max, initial) - early-return branches
    // ---------------------------------------------------------------

    @Test
    public void testSolveThreeArg_InitialIsRoot() throws Exception {
        // yInitial ~ 0 -> setResult(initial, 0) ซึ่งถูกต้อง (ไม่มี defect ในสาขานี้)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0, 10, 2);
        assertEquals(2.0, result, 1e-9);
    }

    @Test
    public void testSolveThreeArg_MinIsRoot_ExposesSetResultBug() throws Exception {
        // yMin == 0 (f(min)=0) แต่โค้ดเรียก setResult(yMin,0) แทนที่จะเป็น setResult(min,0)
        // คาดหวังค่าที่ถูกต้องทางคณิตศาสตร์คือ min=3 แต่โค้ดจะคืนค่า 0 (ค่า yMin)
        // -> เทสนี้ถูกออกแบบมาเพื่อดักจับ fault นี้โดยเฉพาะ
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 3; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(3, 10, 7);
        assertEquals(3.0, result, 1e-9); // คาดว่าจะ FAIL หากมี defect ตามที่วิเคราะห์
    }

    @Test
    public void testSolveThreeArg_MinInitialBracket() throws Exception {
        // yInitial * yMin < 0 -> solve(min,yMin,initial,yInitial,min,yMin)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0, 10, 5);
        assertEquals(2.0, result, 1e-4);
    }

    @Test
    public void testSolveThreeArg_MaxIsRoot_ExposesSetResultBug() throws Exception {
        // yMax == 0 แต่โค้ดเรียก setResult(yMax,0) แทน setResult(max,0)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 8; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0, 8, 4);
        assertEquals(8.0, result, 1e-9); // คาดว่าจะ FAIL หากมี defect ตามที่วิเคราะห์
    }

    @Test
    public void testSolveThreeArg_InitialMaxBracket() throws Exception {
        // yInitial * yMax < 0 -> solve(initial,yInitial,max,yMax,initial,yInitial)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 7; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0, 10, 3);
        assertEquals(7.0, result, 1e-4);
    }

    @Test
    public void testSolveThreeArg_NegativeRootViaInitialMaxBracket() throws Exception {
        // ทดสอบด้วยค่าลบ + ลำดับ branch: MinInitial(false) -> InitialMax(true)
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x * x * x - x; } // roots: -1,0,1
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(-2, -0.5, -1.5);
        assertEquals(-1.0, result, 1e-4);
    }

    @Test
    public void testSolveThreeArg_CubicPositiveRoot_MinInitialBracket() throws Exception {
        // ใช้ cubic เพื่อกระตุ้น inverse-quadratic-interpolation branch ภายใน private solve()
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x * x * x - x; } // roots: -1,0,1
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0.5, 2, 1.5);
        assertEquals(1.0, result, 1e-4);
    }

    @Test
    public void testSolveThreeArg_FullBrentFallThrough_NoSignChangeAtAnyPoint() throws Exception {
        // ครอบคลุม branch สุดท้าย (fallthrough): ไม่มีจุดใดที่ f ใกล้ 0
        // และไม่มีคู่ใดที่ sign ต่างกัน -> เรียก solve(min,yMin,max,yMax,initial,yInitial) เต็มรูปแบบ
        //
        // หมายเหตุ (ไม่แน่ใจ behavior แน่ชัด เพราะไม่ได้รันจริง):
        // เนื่องจาก f(x)=x^2+1 ไม่มีรากจริงในช่วงนี้ จึงไม่สามารถยืนยันแน่ชัดว่าโค้ดจะลู่เข้า
        // ค่าใดค่าหนึ่งแล้ว return หรือจะ throw MaxIterationsExceededException เมื่อครบรอบ
        // เทสนี้จึงยอมรับทั้งสองผลลัพธ์ที่เป็นไปได้ เพื่อยืนยันเพียงว่า branch ถูกเรียกใช้จริง
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x * x + 1; }
        };
        BrentSolver solver = new BrentSolver(f);
        try {
            double result = solver.solve(0, 10, 5);
            assertFalse(Double.isNaN(result));
        } catch (MaxIterationsExceededException e) {
            assertTrue(true); // ผลลัพธ์ที่ยอมรับได้เมื่อไม่พบราก
        }
    }

    // ---------------------------------------------------------------
    // Exception propagation
    // ---------------------------------------------------------------

    @Test(expected = FunctionEvaluationException.class)
    public void testSolveThreeArg_PropagatesFunctionEvaluationException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(x);
            }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(0, 10, 5);
    }

    @Test(expected = NullPointerException.class)
    public void testSolveThreeArg_NullFunction_ThrowsNPE() throws Exception {
        // ไม่มีการตรวจสอบ null ในซอร์ส -> คาดว่าจะเกิด NPE ตอนเรียก f.value()
        BrentSolver solver = new BrentSolver(null);
        solver.solve(0, 10, 5);
    }

    // ---------------------------------------------------------------
    // solve(min, max)
    // ---------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArg_SameSign_ThrowsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x * x + 1; } // always positive
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(0, 10);
    }

    @Test
    public void testSolveTwoArg_OppositeSign_Converges() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        double result = solver.solve(0, 10);
        assertEquals(2.0, result, 1e-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArg_MinGreaterThanMax_ThrowsIllegalArgumentException() throws Exception {
        // ตาม Javadoc ของ solve(min,max): throws IllegalArgumentException if min is not less than max
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveTwoArg_MinEqualsMax_ThrowsIllegalArgumentException() throws Exception {
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) { return x - 2; }
        };
        BrentSolver solver = new BrentSolver(f);
        solver.solve(5, 5);
    }
}
```

---

## ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testConstructorDoesNotThrow` | เรียก constructor พื้นฐาน (ไม่มี branch แต่จำเป็นต้องมี) |
| `testSolveThreeArg_InitialBelowMin_...` | `(initial-min)*(max-initial) < 0` → true (initial < min) |
| `testSolveThreeArg_InitialAboveMax_...` | เงื่อนไขเดียวกัน → true (initial > max) |
| `testSolveThreeArg_InitialEqualsMinBoundary_...` | boundary: นิพจน์ `== 0` → false, ผ่านเข้าสาขา InitialIsRoot |
| `testSolveThreeArg_DegenerateInterval_...` | boundary min=max=initial, ยืนยันว่าไม่มี verifyInterval ใน overload นี้ |
| `testSolveThreeArg_InitialIsRoot` | `abs(yInitial) <= functionValueAccuracy` → true, `setResult(initial,0)` (ไม่มี defect) |
| `testSolveThreeArg_MinIsRoot_ExposesSetResultBug` | `abs(yMin) <= functionValueAccuracy` → true, ดักจับ fault `setResult(yMin,0)` |
| `testSolveThreeArg_MinInitialBracket` | `yInitial*yMin < 0` → true, เรียก private solve แบบ bracket min-initial |
| `testSolveThreeArg_MaxIsRoot_ExposesSetResultBug` | `abs(yMax) <= functionValueAccuracy` → true, ดักจับ fault `setResult(yMax,0)` |
| `testSolveThreeArg_InitialMaxBracket` | `yInitial*yMax < 0` → true, เรียก private solve แบบ bracket initial-max |
| `testSolveThreeArg_NegativeRootViaInitialMaxBracket` | ลำดับ: MinInitial bracket=false → InitialMax bracket=true (ค่าลบ) |
| `testSolveThreeArg_CubicPositiveRoot_MinInitialBracket` | MinInitial bracket=true + private solve: inverse-quadratic interpolation (x0 != x2) |
| `testSolveThreeArg_FullBrentFallThrough_...` | ทุก early-return/bracket เป็น false → fallthrough เรียก full Brent; loop swap branch, bisection-fallback branch (ผลลัพธ์ไม่ยืนยันแน่ชัด – มีคอมเมนต์กำกับ) |
| `testSolveThreeArg_PropagatesFunctionEvaluationException` | `f.value()` throw `FunctionEvaluationException` ตั้งแต่ครั้งแรก |
| `testSolveThreeArg_NullFunction_ThrowsNPE` | null function → NPE (ไม่มี explicit validation ในซอร์ส) |
| `testSolveTwoArg_SameSign_...` | `sign >= 0` → true → throw IllegalArgumentException |
| `testSolveTwoArg_OppositeSign_Converges` | `sign >= 0` → false (else) → เรียก private solve ด้วย x0==x2 (linear interpolation บน iteration แรก) |
| `testSolveTwoArg_MinGreaterThanMax_...` | `verifyInterval` throw ตาม Javadoc (min > max) |
| `testSolveTwoArg_MinEqualsMax_...` | `verifyInterval` throw ตาม Javadoc (min == max, boundary) |

**หมายเหตุความครอบคลุมเพิ่มเติม:** branch ย่อยภายใน private `solve()` เช่น `(Math.abs(delta) > tolerance)` vs `else if (dx>0.0)` vs `else if (dx<=0.0)` ถูกกระตุ้นทางอ้อมผ่านเทสที่ให้ลู่เข้าสู่คำตอบ (เช่น `testSolveTwoArg_OppositeSign_Converges`, cubic tests) แต่ไม่ได้มีเทสเฉพาะเจาะจงแยกทีละ sub-branch เนื่องจากต้องควบคุมค่าตัวเลขละเอียดระดับ floating-point ซึ่งไม่สามารถยืนยัน exact path ได้จากการอ่านซอร์สเพียงอย่างเดียว (ตามข้อกำหนดห้ามเดา behavior)