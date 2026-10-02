# วิเคราะห์โค้ดเป้าหมาย

จุดที่ต้องทดสอบหลัก ๆ ในคลาส `HarmonicFitter` และ `ParameterGuesser`:

1. **Constructor ของ `ParameterGuesser`** — boundary check `observations.length < 4` (0,1,2,3 → throw, 4 → ผ่าน), และกรณี `null`
2. **`sortObservations()`** — branch `curr.getX() < prec.getX()` (true/false) และ nested while loop (`i-- != 0` true/false)
3. **`guessAOmega()`** — if/else branch `(c1/c2 < 0) || (c2/c3 < 0)` และ `xRange == 0` → `ZeroException` (ตาม Javadoc)
4. **`guessPhi()`** — loop คำนวณค่าเฉลี่ย ไม่มี branch แต่ต้องตรวจช่วงผลลัพธ์
5. **`fit()` / `fit(double[])`** — การเชื่อมต่อกับ optimizer และ guesser

> **หมายเหตุสำคัญ (fault-finding):** จากการไล่สมการในเมธอด `guessAOmega()` พบว่า กรณีที่ `xRange == 0` (จุดทุกจุดมี x เท่ากันหมด) จะทำให้ `dx = 0` และ `fPrime2StepIntegral = dy²/0 = Infinity` จากนั้น `x = 0` ทำให้ `sxz += x * fPrime2Integral = 0 * Infinity = NaN` (ตาม IEEE754) ส่งผลให้ `c1`, `c2` กลายเป็น `NaN` และการเปรียบเทียบ `c1/c2 < 0` จะได้ `false` เสมอ (การเทียบ NaN คืน false เสมอ) **จึงไม่เข้า if-branch และไม่ throw `ZeroException` ตามที่ Javadoc ระบุ** — นี่คือสิ่งที่เทสต้อง "พิสูจน์พฤติกรรมจริง" แทนการเดา

```java
package org.apache.commons.math3.optimization.fitting;

import static org.junit.Assert.*;

import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.fitting.HarmonicFitter.ParameterGuesser;
import org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.util.FastMath;
import org.junit.Test;

/**
 * Unit test สำหรับ {@link HarmonicFitter} และ {@link HarmonicFitter.ParameterGuesser}
 * (Defects4J: Math-25b)
 *
 * หมายเหตุทั่วไป:
 * - fit(double[]) และ fit() พึ่งพา CurveFitter (superclass) ซึ่งไม่ได้ให้ source มา
 *   ดังนั้นจะไม่เดา behavior กรณี initialGuess ผิดรูปแบบ/ผิดขนาด ตามข้อกำหนด
 * - ค่าต่าง ๆ ที่ได้จาก guess() เป็นเพียงค่าประมาณเบื้องต้น ไม่ใช่ค่าที่ fit สุดท้าย
 *   จึงใช้ tolerance ที่กว้างพอสมควรในการเทียบ
 */
public class HarmonicFitterTest {

    // ---------- helper ----------
    private static WeightedObservedPoint wp(double x, double y) {
        return new WeightedObservedPoint(1.0, x, y);
    }

    private static WeightedObservedPoint[] harmonicSample(double a, double omega, double phi,
                                                            double start, double end, int n) {
        WeightedObservedPoint[] pts = new WeightedObservedPoint[n];
        double step = (end - start) / (n - 1);
        for (int i = 0; i < n; i++) {
            double t = start + i * step;
            double y = a * FastMath.cos(omega * t + phi);
            pts[i] = wp(t, y);
        }
        return pts;
    }

    // ================================================================
    // 1) Constructor ของ ParameterGuesser: boundary ของจำนวน observation
    // ================================================================

    @Test(expected = NumberIsTooSmallException.class)
    public void testGuesserConstructor_EmptyArray_Throws() {
        new ParameterGuesser(new WeightedObservedPoint[0]);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testGuesserConstructor_OnePoint_Throws() {
        new ParameterGuesser(new WeightedObservedPoint[] { wp(0, 0) });
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testGuesserConstructor_TwoPoints_Throws() {
        new ParameterGuesser(new WeightedObservedPoint[] { wp(0, 0), wp(1, 1) });
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testGuesserConstructor_ThreePoints_Throws() {
        new ParameterGuesser(new WeightedObservedPoint[] { wp(0, 0), wp(1, 1), wp(2, 2) });
    }

    @Test
    public void testGuesserConstructor_ExactlyFourPoints_NoException() {
        // boundary: length == 4 ต้องไม่ throw (ขอบเขตล่างสุดที่ยอมรับได้)
        WeightedObservedPoint[] pts = harmonicSample(2.0, 1.0, 0.3, 0.0, 3.0, 4);
        ParameterGuesser g = new ParameterGuesser(pts);
        double[] result = g.guess();
        assertNotNull(result);
        assertEquals(3, result.length);
    }

    @Test(expected = NullPointerException.class)
    public void testGuesserConstructor_NullArray_ThrowsNPE() {
        // ซอร์สไม่มี null-check ชัดเจน การเรียก observations.length บน null
        // จะทำให้เกิด NPE ตามธรรมชาติของ Java ไม่ใช่ exception ที่ Javadoc ระบุ
        new ParameterGuesser(null);
    }

    // ================================================================
    // 2) sortObservations(): if-branch (curr.getX() < prec.getX()) และ while loop
    // ================================================================

    @Test
    public void testGuess_SortObservations_AlreadySorted() {
        // ไม่มีการสลับเลย -> branch "curr.getX() < prec.getX()" = false ทุกครั้ง
        WeightedObservedPoint[] sorted = harmonicSample(3.0, 1.2, 0.5, 0.0, 10.0, 8);
        double[] result = new ParameterGuesser(sorted).guess();
        for (double v : result) {
            assertFalse(Double.isNaN(v));
        }
    }

    @Test
    public void testGuess_SortObservations_SingleInversion() {
        // สลับตำแหน่งแค่คู่เดียว -> while loop shift แค่ 1 รอบ (ครอบคลุม i--!=0 = false ทันที)
        WeightedObservedPoint[] sorted = harmonicSample(2.5, 1.0, 0.2, 0.0, 8.0, 6);
        WeightedObservedPoint[] shuffled = sorted.clone();
        WeightedObservedPoint tmp = shuffled[1];
        shuffled[1] = shuffled[2];
        shuffled[2] = tmp;

        double[] expected = new ParameterGuesser(sorted).guess();
        double[] actual = new ParameterGuesser(shuffled).guess();

        // invariant: ถ้า sort ทำงานถูกต้อง ผลลัพธ์ต้องตรงกันไม่ว่าจะป้อนลำดับใด
        assertArrayEquals(expected, actual, 1e-9);
    }

    @Test
    public void testGuess_SortObservations_FullyReversed() {
        // กลับลำดับทั้งหมด -> บังคับ shift สูงสุดในแต่ละการแทรก
        // ครอบคลุมทั้ง i--!=0 == true (หลาย element) และ == false (ถึง index 0)
        WeightedObservedPoint[] sorted = harmonicSample(1.8, 0.9, -0.4, 0.0, 12.0, 7);
        WeightedObservedPoint[] reversed = new WeightedObservedPoint[sorted.length];
        for (int i = 0; i < sorted.length; i++) {
            reversed[i] = sorted[sorted.length - 1 - i];
        }

        double[] expected = new ParameterGuesser(sorted).guess();
        double[] actual = new ParameterGuesser(reversed).guess();

        assertArrayEquals(expected, actual, 1e-9);
    }

    // ================================================================
    // 3) guessAOmega(): else-branch (well-conditioned case)
    // ================================================================

    @Test
    public void testGuessAOmega_WellConditioned_ReturnsFiniteReasonableValues() {
        double trueA = 4.0;
        double trueOmega = 1.3;
        double truePhi = 0.6;
        WeightedObservedPoint[] pts = harmonicSample(trueA, trueOmega, truePhi, 0.0, 20.0, 40);
        double[] guess = new ParameterGuesser(pts).guess();

        assertFalse(Double.isNaN(guess[0]));
        assertFalse(Double.isNaN(guess[1]));
        assertFalse(Double.isNaN(guess[2]));
        assertTrue(guess[0] > 0); // amplitude ควรเป็นบวก (สมมติฐานของอัลกอริทึม)
        assertTrue(guess[1] > 0); // omega ควรเป็นบวก (sqrt ของ ratio ที่ไม่ติดลบ)
        assertEquals(trueOmega, guess[1], 0.5); // เป็นแค่ guess เบื้องต้น tolerance กว้าง
    }

    // ================================================================
    // 4) guessAOmega(): xRange == 0 -> ตาม Javadoc ควร throw ZeroException
    //    แต่จากการวิเคราะห์พบ NaN-masking ทำให้ไม่ถูก throw จริง (ดูคำอธิบายด้านบน)
    // ================================================================

    @Test
    public void testGuessAOmega_AllSameX_DoesNotThrowZeroException_ProducesNaN() {
        WeightedObservedPoint[] pts = new WeightedObservedPoint[] {
            wp(5.0, 1.0), wp(5.0, 2.0), wp(5.0, 3.0), wp(5.0, 4.0)
        };
        // ไม่ wrap ด้วย expected-exception เพราะต้องการพิสูจน์ว่า "ไม่" throw
        double[] result = new ParameterGuesser(pts).guess();
        assertTrue(Double.isNaN(result[0]));
        assertTrue(Double.isNaN(result[1]));
        // คอมเมนต์: กรณีนี้ขัดกับ Javadoc ของ guessAOmega() ที่ระบุว่าควร throw ZeroException
    }

    // ================================================================
    // 5) guessPhi(): ตรวจช่วงผลลัพธ์ของ atan2 -> (-pi, pi]
    // ================================================================

    @Test
    public void testGuessPhi_WithinAtan2Range() {
        WeightedObservedPoint[] pts = harmonicSample(2.0, 2.0, 1.0, 0.0, 6.0, 10);
        double[] guess = new ParameterGuesser(pts).guess();
        assertTrue(guess[2] >= -Math.PI && guess[2] <= Math.PI);
    }

    // ================================================================
    // 6) HarmonicFitter.fit(double[]) / fit() - integration
    // ================================================================

    @Test
    public void testFit_WithExplicitInitialGuess() {
        HarmonicFitter fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());
        double trueA = 3.0, trueOmega = 1.5, truePhi = 0.4;
        for (int i = 0; i < 30; i++) {
            double t = i * 0.2;
            double y = trueA * FastMath.cos(trueOmega * t + truePhi);
            fitter.addObservedPoint(t, y);
        }
        double[] initialGuess = { trueA * 0.8, trueOmega * 0.9, truePhi * 0.9 };
        double[] fitted = fitter.fit(initialGuess);

        assertEquals(trueA, Math.abs(fitted[0]), 1e-2);
        assertEquals(trueOmega, Math.abs(fitted[1]), 1e-2);
    }

    @Test
    public void testFit_AutomaticInitialGuess() {
        HarmonicFitter fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());
        double trueA = 2.5, trueOmega = 1.0, truePhi = -0.3;
        for (int i = 0; i < 50; i++) {
            double t = i * 0.15;
            double y = trueA * FastMath.cos(trueOmega * t + truePhi);
            fitter.addObservedPoint(t, y);
        }
        double[] fitted = fitter.fit();

        assertEquals(trueA, Math.abs(fitted[0]), 1e-2);
        assertEquals(trueOmega, Math.abs(fitted[1]), 1e-2);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testFit_TooFewObservations_Throws() {
        HarmonicFitter fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());
        fitter.addObservedPoint(0.0, 1.0);
        fitter.addObservedPoint(1.0, 2.0);
        fitter.fit(); // ภายในเรียก ParameterGuesser constructor -> length < 4
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testFit_NoObservations_Throws() {
        HarmonicFitter fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());
        fitter.fit(); // observations.length == 0
    }
}
```

## สรุปการครอบคลุม Branch/Condition

| เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGuesserConstructor_EmptyArray_Throws` ถึง `testGuesserConstructor_ThreePoints_Throws` | `if (observations.length < 4)` = true (boundary 0,1,2,3) |
| `testGuesserConstructor_ExactlyFourPoints_NoException` | `if (observations.length < 4)` = false (boundary = 4) |
| `testGuesserConstructor_NullArray_ThrowsNPE` | กรณี null input (ไม่มี null-check ในซอร์ส → NPE ธรรมชาติ) |
| `testGuess_SortObservations_AlreadySorted` | `sortObservations()` branch `curr.getX()<prec.getX()` = false ทุกครั้ง |
| `testGuess_SortObservations_SingleInversion` | branch = true 1 ครั้ง, while loop iterate 1 รอบ, `i--!=0` = false ทันที |
| `testGuess_SortObservations_FullyReversed` | branch = true หลายครั้ง, while loop multi-iterate, `i--!=0` ทั้ง true/false |
| `testGuessAOmega_WellConditioned_ReturnsFiniteReasonableValues` | `guessAOmega()` else-branch (well-conditioned, `c1/c2`, `c2/c3` ≥ 0) |
| `testGuessAOmega_AllSameX_DoesNotThrowZeroException_ProducesNaN` | พิสูจน์ NaN-masking ทำให้ if-branch (`xRange==0` → `ZeroException`) ไม่ถูกเข้าถึงจริงตาม Javadoc |
| `testGuessPhi_WithinAtan2Range` | loop ใน `guessPhi()`, ตรวจช่วงผลลัพธ์ `atan2` |
| `testFit_WithExplicitInitialGuess` | `fit(double[])` ทำงานร่วมกับ optimizer จริง |
| `testFit_AutomaticInitialGuess` | `fit()` → `ParameterGuesser.guess()` → optimizer (integration เต็ม pipeline) |
| `testFit_TooFewObservations_Throws` | `fit()` กรณี observations < 4 ผ่าน public API |
| `testFit_NoObservations_Throws` | `fit()` กรณี observations = 0 (boundary ล่างสุด) |

**ข้อจำกัดที่ยังไม่ครอบคลุม (ตามข้อกำหนดข้อ 4):** การสร้าง dataset ที่มี `xRange != 0` แต่ทำให้ `(c1/c2 < 0) || (c2/c3 < 0)` เป็น `true` จริง (ill-conditioned case ตาม MATH-844) ต้องใช้ข้อมูลเฉพาะที่ได้จากการวิเคราะห์เชิงตัวเลขอย่างละเอียด ซึ่งไม่สามารถคำนวณด้วยมือได้อย่างมั่นใจในขอบเขตนี้ จึงไม่ได้สร้างเทสสำหรับ sub-branch นี้โดยตรง เพื่อไม่ assert behavior ที่ไม่แน่ใจ