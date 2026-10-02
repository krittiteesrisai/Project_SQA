# วิเคราะห์โค้ดเป้าหมาย

`ContinuedFraction` เป็น abstract class ที่ต้องสร้าง subclass เพื่อกำหนดค่า `getA(n,x)` / `getB(n,x)` การทดสอบจึงต้องออกแบบ subclass ที่ "บังคับ" ให้ branch ต่าง ๆ ภายใน `evaluate(x, epsilon, maxIterations)` ถูก execute ได้จริง (hPrev==0, scale<=0, NaN divergence, Infinity divergence ทั้งก่อน/หลัง scaling, a>b vs b!=0, loop ที่ไม่ converge ฯลฯ)

```java
package org.apache.commons.math3.util;

import static org.junit.Assert.assertEquals;

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.junit.Test;

/**
 * JUnit4 tests for {@link ContinuedFraction} (Defects4J Math-31b).
 *
 * หมายเหตุ: ContinuedFraction เป็น abstract class จึงต้องสร้าง subclass สำหรับทดสอบ
 * โดยกำหนดค่า a(n,x), b(n,x) ตามแต่ละกรณี เพื่อบังคับ branch ต่าง ๆ ภายใน evaluate()
 * ค่าตัวเลขทั้งหมดถูกคำนวณด้วยมือ (trace โค้ดจริง) ไม่ได้เดา behavior ที่ไม่มีในซอร์ส
 */
public class ContinuedFractionTest {

    /** ค่าอ้างอิง golden ratio = (1+sqrt5)/2 สำหรับ continued fraction a0=1, an=1, bn=1 (n>=1) */
    private static final double GOLDEN_RATIO = (1.0 + Math.sqrt(5.0)) / 2.0;

    /**
     * Helper subclass: กำหนดค่า a และ b ผ่าน array; ถ้า n เกินขนาด array
     * จะคืนค่าตัวสุดท้ายของ array ซ้ำไปเรื่อย ๆ (tail-repeat) เพื่อจำลองสัมประสิทธิ์คงที่
     */
    private static class ArrayContinuedFraction extends ContinuedFraction {
        private final double[] aVals;
        private final double[] bVals;

        ArrayContinuedFraction(double[] aVals, double[] bVals) {
            this.aVals = aVals;
            this.bVals = bVals;
        }

        @Override
        protected double getA(int n, double x) {
            return n < aVals.length ? aVals[n] : aVals[aVals.length - 1];
        }

        @Override
        protected double getB(int n, double x) {
            return n < bVals.length ? bVals[n] : bVals[bVals.length - 1];
        }
    }

    /** Subclass สำหรับตรวจสอบว่า x ถูกส่งต่อไปยัง getA/getB อย่างถูกต้อง (fault-detection) */
    private static class RecordingContinuedFraction extends ContinuedFraction {
        double lastAX = Double.NaN;
        double lastBX = Double.NaN;

        @Override
        protected double getA(int n, double x) {
            lastAX = x;
            return n == 0 ? 5.0 : 1.0;
        }

        @Override
        protected double getB(int n, double x) {
            lastBX = x;
            return 0.0;
        }
    }

    // ---------- 1. ลู่เข้าทันที (immediate convergence), hPrev != 0 ----------
    @Test
    public void testEvaluateImmediateConvergence() {
        // a0=5.0 (hPrev!=0), a(n>=1)=1.0, b(n>=1)=0.0
        // -> deltaN = 1.0 พอดีตั้งแต่รอบแรก -> break ทันที, คืนค่า a0
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {5.0, 1.0},
                new double[] {0.0, 0.0});
        double result = cf.evaluate(0.0, 1e-9, 1000);
        assertEquals(5.0, result, 1e-12);
    }

    // ---------- 2. hPrev == 0 ถูกแทนที่ด้วยค่า small (1e-50) ----------
    @Test
    public void testEvaluateHPrevZeroReplacedBySmall() {
        // a0=0.0 -> Precision.equals(hPrev,0.0,small) เป็น true -> hPrev = small
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {0.0, 1.0},
                new double[] {0.0, 0.0});
        double result = cf.evaluate(0.0, 1e-9, 1000);
        assertEquals(1e-50, result, 0.0);
    }

    // ---------- 3. วนหลายรอบก่อนลู่เข้า (golden ratio) ----------
    @Test
    public void testEvaluateMultiIterationConvergence() {
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, 1.0},
                new double[] {0.0, 1.0});
        double result = cf.evaluate(0.0, 1e-9, 10000);
        assertEquals(GOLDEN_RATIO, result, 1e-6);
    }

    // ---------- 4. evaluate(x) overload 1 argument ----------
    @Test
    public void testEvaluateSingleArgOverload() {
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, 1.0},
                new double[] {0.0, 1.0});
        double result = cf.evaluate(0.0);
        assertEquals(GOLDEN_RATIO, result, 1e-6);
    }

    // ---------- 5. evaluate(x, epsilon) overload 2 argument ----------
    @Test
    public void testEvaluateXEpsilonOverload() {
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, 1.0},
                new double[] {0.0, 1.0});
        double result = cf.evaluate(0.0, 1e-4);
        assertEquals(GOLDEN_RATIO, result, 1e-2);
    }

    // ---------- 6. evaluate(x, maxIterations) overload (double,int) ----------
    @Test
    public void testEvaluateXMaxIterationsOverload() {
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, 1.0},
                new double[] {0.0, 1.0});
        double result = cf.evaluate(0.0, 1000);
        assertEquals(GOLDEN_RATIO, result, 1e-6);
    }

    // ---------- 7. MaxCountExceededException: loop ไม่ถูก execute เลย (maxIterations=1) ----------
    @Test(expected = MaxCountExceededException.class)
    public void testMaxCountExceededException_NoIterationAllowed() {
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, 1.0},
                new double[] {0.0, 1.0});
        cf.evaluate(0.0, 1e-9, 1);
    }

    // ---------- 7b. Boundary: maxIterations = 0 ----------
    @Test(expected = MaxCountExceededException.class)
    public void testMaxCountExceededException_ZeroMaxIterations() {
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, 1.0},
                new double[] {0.0, 1.0});
        cf.evaluate(0.0, 1e-9, 0);
    }

    // ---------- 8. MaxCountExceededException: loop รันหลายรอบแต่ยังไม่ลู่เข้า ----------
    @Test(expected = MaxCountExceededException.class)
    public void testMaxCountExceededException_LoopRunsButNotConverge() {
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, 1.0},
                new double[] {0.0, 1.0});
        // epsilon เข้มมากจนไม่สามารถลู่เข้าได้ภายใน 5 รอบ
        cf.evaluate(0.0, 1e-300, 5);
    }

    // ---------- 8b. Edge-case: epsilon = 0.0 ทำให้เงื่อนไข "< epsilon" เป็น false เสมอ
    //              แม้ deltaN ลู่เข้าพอดี (abs=0) ก็ไม่ break -> วนจน maxIterations แล้ว throw
    @Test(expected = MaxCountExceededException.class)
    public void testEvaluateEpsilonZero_NeverBreaksOnExactConvergence() {
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {5.0, 1.0},
                new double[] {0.0, 0.0});
        cf.evaluate(0.0, 0.0, 5);
    }

    // ---------- 9. ConvergenceException: NaN divergence (0/0) ----------
    @Test(expected = ConvergenceException.class)
    public void testConvergenceException_NaNDivergence() {
        // a0=1(hPrev!=0), a(n>=1)=0, b(n>=1)=0 -> cN=0,q2=0 -> deltaN=0/0=NaN -> hN=NaN
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, 0.0},
                new double[] {0.0, 0.0});
        cf.evaluate(0.0, 1e-9, 1000);
    }

    // ---------- 10. ConvergenceException: scale<=0 ("Can't scale") ----------
    @Test(expected = ConvergenceException.class)
    public void testConvergenceException_CantScale() {
        // a1=-Infinity, b1=0 -> cN,q2=-Infinity, scale=max(-Inf,0)=0 <= 0
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, Double.NEGATIVE_INFINITY},
                new double[] {0.0, 0.0});
        cf.evaluate(0.0, 1e-9, 1000);
    }

    // ---------- 11. Scaling branch: a!=0 && a>b -> break ทันที, ลู่เข้าแบบ exact ----------
    @Test
    public void testScalingBranch_AGreaterThanB_ConvergesExactly() {
        // a1=+Infinity, b1=1.0 -> top-level cN เป็น Infinity -> เข้า scaling block
        // scale=max(Inf,1)=Inf -> a>b true -> คำนวณใหม่ได้ finite ทันที (i=0) แล้ว break
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, Double.POSITIVE_INFINITY},
                new double[] {0.0, 1.0});
        double result = cf.evaluate(0.0, 1e-9, 1000);
        assertEquals(1.0, result, 1e-12);
    }

    // ---------- 12. Scaling branch: b!=0 (ไม่ใช่ a>b) -> break แล้วยัง hN เป็น Infinity ----------
    @Test(expected = ConvergenceException.class)
    public void testScalingBranch_BNotZero_ThenInfinityDivergence() {
        // a1=1.0, b1=+Infinity -> top-level cN=Infinity (จาก b*p0)
        // scale=max(1,Inf)=Inf -> a>b false -> เข้า else-if(b!=0) -> ได้ cN,q2 finite -> break
        // แต่ deltaN=cN/q2/cPrev กลายเป็น Infinity -> hN=Infinity -> throw
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, 1.0},
                new double[] {0.0, Double.POSITIVE_INFINITY});
        cf.evaluate(0.0, 1e-9, 1000);
    }

    // ---------- 13. ตรวจสอบว่า x ถูกส่งต่อไปยัง getA/getB อย่างถูกต้อง ----------
    @Test
    public void testXPassedThroughToCoefficients() {
        RecordingContinuedFraction cf = new RecordingContinuedFraction();
        double x = 3.14159;
        double result = cf.evaluate(x, 1e-9, 1000);
        assertEquals(x, cf.lastAX, 0.0);
        assertEquals(x, cf.lastBX, 0.0);
        assertEquals(5.0, result, 1e-12);
    }

    // ---------- 14. ค่า x เป็นลบ (boundary ของพารามิเตอร์ x) ----------
    @Test
    public void testEvaluateWithNegativeX() {
        // subclass นี้ไม่ได้ใช้ x ในการคำนวณ a/b เอง จึงคาดหวังผลลัพธ์เท่ากับกรณี x=0
        ArrayContinuedFraction cf = new ArrayContinuedFraction(
                new double[] {1.0, 1.0},
                new double[] {0.0, 1.0});
        double result = cf.evaluate(-5.0, 1e-9, 10000);
        assertEquals(GOLDEN_RATIO, result, 1e-6);
    }
}
```

> **หมายเหตุ (ตามข้อกำหนด #4):** branch ที่ `for (int i = 0; i < maxPower; i++)` วนเกิน `i=0` โดยที่ `cN`/`q2` ยังคง infinite อยู่ (ไม่ `break`) นั้น พยายามสร้างอินพุตแล้วแต่ด้วยคุณสมบัติของ double arithmetic การหารด้วย `scale` ที่มีค่าเท่ากับ `max(a,b)` มักทำให้ค่าลด magnitude ลงจนกลายเป็น finite ตั้งแต่ `i=0` เสมอในทุกกรณีที่ลองคำนวณด้วยมือ จึงไม่ได้เขียนเทสสำหรับ branch ย่อยนี้เพื่อไม่ให้เดา behavior ที่ไม่สามารถยืนยันได้จริง

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| เทสเมธอด | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testEvaluateImmediateConvergence` | `hPrev != 0` (if เป็น false), loop รัน 1 ครั้ง, `abs(deltaN-1.0) < epsilon` = true → break, ไม่เข้า scaling block |
| `testEvaluateHPrevZeroReplacedBySmall` | `Precision.equals(hPrev,0.0,small)` = true → `hPrev = small` |
| `testEvaluateMultiIterationConvergence` | loop วนหลายรอบ, `abs(deltaN-1.0) < epsilon` = false หลายครั้งก่อน true, block ท้าย loop (`dPrev=q1; cPrev=...; n++`) |
| `testEvaluateSingleArgOverload` | overload `evaluate(double x)` |
| `testEvaluateXEpsilonOverload` | overload `evaluate(double x, double epsilon)` |
| `testEvaluateXMaxIterationsOverload` | overload `evaluate(double x, int maxIterations)` |
| `testMaxCountExceededException_NoIterationAllowed` | `while(n<maxIterations)` false ตั้งแต่แรก (maxIterations=1), `if(n>=maxIterations)` = true |
| `testMaxCountExceededException_ZeroMaxIterations` | boundary `maxIterations=0` |
| `testMaxCountExceededException_LoopRunsButNotConverge` | loop รันจนครบ maxIterations แล้วไม่ converge |
| `testEvaluateEpsilonZero_NeverBreaksOnExactConvergence` | boundary `epsilon=0.0` ทำให้ `< epsilon` false เสมอแม้ deltaN=1 พอดี |
| `testConvergenceException_NaNDivergence` | `isInfinite` = false, `Double.isNaN(hN)` = true → throw NAN_DIVERGENCE |
| `testConvergenceException_CantScale` | `isInfinite(cN)||isInfinite(q2)` true, `scale <= 0` → throw "Can't scale" |
| `testScalingBranch_AGreaterThanB_ConvergesExactly` | เข้า scaling block, `a != 0 && a > b` = true, break ที่ `i=0`, ไม่ throw |
| `testScalingBranch_BNotZero_ThenInfinityDivergence` | เข้า scaling block, `a>b` false → `else if (b != 0)` = true, break, แต่ `Double.isInfinite(hN)` = true → throw |
| `testXPassedThroughToCoefficients` | ยืนยันค่า `x` ถูกส่งต่อไปยัง `getA`/`getB` ถูกต้อง (fault-detection) |
| `testEvaluateWithNegativeX` | boundary ค่า `x` เป็นลบ |

**ข้อจำกัดที่ยังไม่ครอบคลุม:** branch ที่ for-loop scaling วนเกิน `i=0` แล้วยังไม่ break (ตามหมายเหตุด้านบน) เนื่องจากไม่สามารถยืนยัน input ที่ทำให้เกิด behavior นี้ได้อย่างแน่นอนด้วย double arithmetic