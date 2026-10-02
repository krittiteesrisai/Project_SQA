# วิเคราะห์ Branch ในคลาส `BrentOptimizer`

ก่อนเขียนเทส ได้วิเคราะห์ branch/condition หลักที่พบในซอร์สโค้ด (เมธอด `localMin` ซึ่งเป็น private แต่ถูกเรียกผ่าน `optimize(...)` ทั้งสอง overload):

- `eps <= 0` → throw `NotStrictlyPositiveException`
- `t <= 0` → throw `NotStrictlyPositiveException`
- `lo < hi` vs `else` (สลับ a,b)
- `goalType == GoalType.MAXIMIZE` (ทั้งตอนคำนวณ fx เริ่มต้น และ fu ในลูป)
- `while (count < maximalIterationCount)` → true/false (ตก throw `MaxIterationsExceededException`)
- `Math.abs(x - m) > tol2 - 0.5 * (b - a)` → true (ทำงานต่อ) / false (terminate)
- `Math.abs(e) > tol1` → parabola fit / golden section
- `q > 0` → `p = -p` / else `q = -q`
- เงื่อนไข parabolic step (`p > q*(a-x) && p < q*(b-x) && |p| < |0.5*q*r|`) → true/false
- `u - a < tol2 || b - u < tol2` → true/false
- `x <= m` → `d = tol1` / `d = -tol1`
- `x < m` (golden section, 2 ที่)
- `Math.abs(d) < tol1` → true/false
- `d >= 0` → `u = x+tol1` / `u = x-tol1`
- `fu <= fx` → update (b=x/a=x) / else (a=u/b=u)
- `u < x` (สองที่ ใน if/else ข้างบน)
- `fu <= fw || w == x` → update w / else if
- `fu <= fv || v == x || v == w` → update v

**หมายเหตุสำคัญ:** พารามิเตอร์ `isMinim` ถูกส่งเข้า `localMin` แต่ไม่ถูกใช้ภายในฟังก์ชันเลย (dead code) — จึงไม่ต้องเทส branch นี้

เนื่องจากไม่มีซอร์สของ `AbstractUnivariateRealOptimizer` ให้ดู จึงต้อง**สมมติ** ว่ามี public/protected method มาตรฐานตาม Commons-Math API เช่น `setMaxEvaluations`, `setMaximalIterationCount`, `setAbsoluteAccuracy`, `setRelativeAccuracy` (ไม่มี validation เพิ่มเติมนอกจากที่เห็นใน `localMin`) — จุดนี้คอมเมนต์กำกับไว้ในโค้ดแล้ว

```java
package org.apache.commons.math.optimization.univariate;

import static org.junit.Assert.*;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.optimization.GoalType;
import org.junit.Test;

public class BrentOptimizerTest {

    // f(x) = (x-2)^2 ; minimum at x = 2
    private static final UnivariateRealFunction QUADRATIC = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return (x - 2) * (x - 2);
        }
    };

    // g(x) = -(x-2)^2 ; maximum at x = 2 (ใช้คู่กับ GoalType.MAXIMIZE)
    private static final UnivariateRealFunction NEG_QUADRATIC = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return -((x - 2) * (x - 2));
        }
    };

    // ฟังก์ชันหลายยอด (multimodal) เพื่อบังคับให้เกิดหลาย iteration
    // และผ่านทั้งเส้นทาง parabolic-interpolation และ golden-section
    private static final UnivariateRealFunction MULTIMODAL = new UnivariateRealFunction() {
        public double value(double x) throws FunctionEvaluationException {
            return Math.sin(x) + 0.1 * x * x;
        }
    };

    @Test
    public void testOptimizeMinimizeQuadratic_5arg() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testOptimizeMaximizeQuadratic_5arg() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(NEG_QUADRATIC, GoalType.MAXIMIZE, -10.0, 10.0, 0.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testOptimize_4argOverload_usesGoldenSectionStart() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // ทดสอบ overload ที่คำนวณ startValue = min + GOLDEN_SECTION*(max-min)
        double result = optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, -10.0, 10.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testLoGreaterThanHi_swapBranch() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // min > max จะเข้า branch else ที่ a=hi, b=lo
        double result = optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, 10.0, -10.0, 0.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testMinEqualsMax_pointOptimization() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // lo == hi -> a == b, เงื่อนไข stop ควรเป็นจริงทันที (count=0)
        double result = optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, 3.0, 3.0, 3.0);
        assertEquals(3.0, result, 1e-9);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testRelativeAccuracyNotPositive_throws() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // NOTE: สมมติว่า setRelativeAccuracy ไม่ validate เอง
        // จึงปล่อยให้ localMin() เป็นผู้ throw NotStrictlyPositiveException เมื่อ eps<=0
        optimizer.setRelativeAccuracy(0.0);
        optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testRelativeAccuracyNegative_throws() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setRelativeAccuracy(-1.0e-5);
        optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testAbsoluteAccuracyNotPositive_throws() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // NOTE: สมมติเช่นเดียวกันสำหรับค่า t (absolute accuracy)
        optimizer.setAbsoluteAccuracy(0.0);
        optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded_zeroIterations() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // maximalIterationCount=0 -> while loop ไม่ทำงานเลย -> ตก throw ท้ายเมธอด
        optimizer.setMaximalIterationCount(0);
        optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testMaxIterationsExceeded_tooFewIterations() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // NOTE: สมมติว่า 1 iteration ไม่พอให้ลู่เข้าตาม tolerance ปกติ (1e-10/1e-14)
        optimizer.setMaximalIterationCount(1);
        optimizer.optimize(MULTIMODAL, GoalType.MINIMIZE, -10.0, 10.0, -9.9);
    }

    @Test
    public void testFunctionEvaluationExceptionPropagates() {
        BrentOptimizer optimizer = new BrentOptimizer();
        UnivariateRealFunction throwingFunction = new UnivariateRealFunction() {
            public double value(double x) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(x);
            }
        };
        try {
            optimizer.optimize(throwingFunction, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
            fail("Expected FunctionEvaluationException to be thrown");
        } catch (FunctionEvaluationException expected) {
            // expected
        } catch (MaxIterationsExceededException unexpected) {
            fail("Expected FunctionEvaluationException, got MaxIterationsExceededException");
        }
    }

    @Test(expected = NullPointerException.class)
    public void testNullFunction_throwsNPE() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // NOTE: ไม่มี null-check ใน source; สมมติว่า computeObjectiveValue(f,x)
        // เรียก f.value(x) โดยตรง ทำให้เกิด NPE เมื่อ f เป็น null
        optimizer.optimize(null, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
    }

    @Test
    public void testNullGoalType_treatedAsMinimize() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // goalType ถูกใช้ด้วยการเปรียบเทียบ reference (==) กับ GoalType.MAXIMIZE เท่านั้น
        // หาก goalType เป็น null การเปรียบเทียบจะเป็น false เสมอ -> ทำงานเหมือน MINIMIZE
        double result = optimizer.optimize(QUADRATIC, null, -10.0, 10.0, 0.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testOptimizeMultimodalFunction_coversParabolicAndGoldenSectionBranches() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // ฟังก์ชันนี้ต้องใช้หลาย iteration จึงมีโอกาสผ่านทั้ง branch
        // parabolic-interpolation และ golden-section รวมถึง branch อัพเดต a/b/v/w/x ต่าง ๆ
        double result = optimizer.optimize(MULTIMODAL, GoalType.MINIMIZE, -10.0, 10.0, -5.0);
        assertTrue(result >= -10.0 && result <= 10.0);
    }

    @Test
    public void testOptimizeNarrowInterval_toleranceHandling() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // ช่วงแคบมาก เพื่อทดสอบการคำนวณ tol1/tol2 ที่ขอบ
        double result = optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, 1.9999, 2.0001, 2.00005);
        assertEquals(2.0, result, 1e-3);
    }

    @Test
    public void testOptimizeStartValueAtBoundary_lowerBound() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        // start value = lower bound -> ทดสอบ branch "x < m" / "x <= m" ในกรณีขอบ
        double result = optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, -10.0, 10.0, -10.0);
        assertEquals(2.0, result, 1e-6);
    }

    @Test
    public void testOptimizeStartValueAtBoundary_upperBound() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        double result = optimizer.optimize(QUADRATIC, GoalType.MINIMIZE, -10.0, 10.0, 10.0);
        assertEquals(2.0, result, 1e-6);
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testOptimizeMinimizeQuadratic_5arg` | path หลัก MINIMIZE, lo<hi, golden-section เริ่มต้น, terminate branch |
| `testOptimizeMaximizeQuadratic_5arg` | `goalType == MAXIMIZE` (negation ของ fx/fu ทั้งสองจุด) |
| `testOptimize_4argOverload_usesGoldenSectionStart` | overload 4-arg (คำนวณ startValue ด้วย GOLDEN_SECTION) |
| `testLoGreaterThanHi_swapBranch` | `lo < hi` = false → branch สลับ a,b |
| `testMinEqualsMax_pointOptimization` | กรณี a==b, เงื่อนไข stop เป็นจริงทันที (count=0) |
| `testRelativeAccuracyNotPositive_throws` | `eps <= 0` → throw NotStrictlyPositiveException |
| `testRelativeAccuracyNegative_throws` | `eps <= 0` (ค่า negative) |
| `testAbsoluteAccuracyNotPositive_throws` | `t <= 0` → throw NotStrictlyPositiveException |
| `testMaxIterationsExceeded_zeroIterations` | `while(count<maximalIterationCount)` = false ทันที → throw MaxIterationsExceededException |
| `testMaxIterationsExceeded_tooFewIterations` | loop ทำงานน้อยรอบแล้วไม่ converge → throw ตอนจบ |
| `testFunctionEvaluationExceptionPropagates` | การ propagate `FunctionEvaluationException` จาก `computeObjectiveValue` |
| `testNullFunction_throwsNPE` | ค่า null function (edge case) |
| `testNullGoalType_treatedAsMinimize` | `goalType == GoalType.MAXIMIZE` = false (null) ทั้งสองจุดใช้งาน |
| `testOptimizeMultimodalFunction_coversParabolicAndGoldenSectionBranches` | `abs(e)>tol1` true/false, `q>0`, เงื่อนไข parabolic step, อัพเดต a/b/v/w/x หลายรูปแบบ |
| `testOptimizeNarrowInterval_toleranceHandling` | คำนวณ tol1/tol2 ในช่วงแคบ, `abs(d)<tol1` |
| `testOptimizeStartValueAtBoundary_lowerBound` | `x < m` / `x <= m` กรณี start อยู่ขอบล่าง |
| `testOptimizeStartValueAtBoundary_upperBound` | `x < m` / `x <= m` กรณี start อยู่ขอบบน |

**หมายเหตุ:** บาง branch (เช่น `u - a < tol2 || b - u < tol2`, `fu <= fw || w == x`, `fu <= fv || v==x || v==w`) ไม่สามารถบังคับให้เกิดตรงจุดได้โดยตรงจาก public API เนื่องจากเป็น internal state ของอัลกอริทึม จึงอาศัย `testOptimizeMultimodalFunction_...` และเทสที่ใช้หลาย iteration เพื่อเพิ่มโอกาส cover โดย probabilistic coverage — ไม่ได้ assert ผลลัพธ์ภายในแต่ละ branch ตรง ๆ