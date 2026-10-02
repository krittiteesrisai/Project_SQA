# JUnit 4 Test Suite สำหรับคลาส `Gamma`

```java
import static org.junit.Assert.*;

import org.apache.commons.math.MathException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.special.Gamma;
import org.junit.Test;

public class GammaTest {

    private static final double DELTA = 1e-6;

    // ---------------------------------------------------------
    // logGamma(double x)
    // ---------------------------------------------------------

    @Test
    public void testLogGamma_NaNInput() {
        // branch: Double.isNaN(x) == true -> NaN
        double result = Gamma.logGamma(Double.NaN);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testLogGamma_ZeroInput() {
        // branch: x <= 0.0 (x == 0) -> NaN
        double result = Gamma.logGamma(0.0);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testLogGamma_NegativeInput() {
        // branch: x <= 0.0 (x < 0) -> NaN
        double result = Gamma.logGamma(-5.0);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testLogGamma_OneInput() {
        // branch: else - normal computation, Gamma(1) = 1 -> log = 0
        double result = Gamma.logGamma(1.0);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    public void testLogGamma_HalfInput() {
        // branch: else - Gamma(0.5) = sqrt(pi)
        double expected = 0.5723649429247001; // ln(sqrt(pi))
        double result = Gamma.logGamma(0.5);
        assertEquals(expected, result, DELTA);
    }

    @Test
    public void testLogGamma_FiveInput() {
        // branch: else - Gamma(5) = 24
        double expected = Math.log(24.0);
        double result = Gamma.logGamma(5.0);
        assertEquals(expected, result, DELTA);
    }

    // ---------------------------------------------------------
    // regularizedGammaP(double a, double x)  -- 2-arg delegate
    // ---------------------------------------------------------

    @Test
    public void testRegularizedGammaP_TwoArgDelegate() throws MathException {
        // ensures delegate to 4-arg version with DEFAULT_EPSILON / MAX_VALUE
        double expected = 1.0 - Math.exp(-1.0); // P(1,1)
        double result = Gamma.regularizedGammaP(1.0, 1.0);
        assertEquals(expected, result, DELTA);
    }

    // ---------------------------------------------------------
    // regularizedGammaP(double a, double x, double epsilon, int maxIterations)
    // ---------------------------------------------------------

    @Test
    public void testRegularizedGammaP_NaN_A() throws MathException {
        // branch: Double.isNaN(a) -> NaN
        double result = Gamma.regularizedGammaP(Double.NaN, 1.0, 1e-9, 100);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaP_NaN_X() throws MathException {
        // branch: Double.isNaN(x) -> NaN
        double result = Gamma.regularizedGammaP(1.0, Double.NaN, 1e-9, 100);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaP_AZero() throws MathException {
        // branch: a <= 0.0 (a == 0) -> NaN
        double result = Gamma.regularizedGammaP(0.0, 1.0, 1e-9, 100);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaP_ANegative() throws MathException {
        // branch: a <= 0.0 (a < 0) -> NaN
        double result = Gamma.regularizedGammaP(-2.0, 1.0, 1e-9, 100);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaP_XNegative() throws MathException {
        // branch: x < 0.0 -> NaN
        double result = Gamma.regularizedGammaP(1.0, -1.0, 1e-9, 100);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaP_XZero() throws MathException {
        // branch: x == 0.0 -> 0.0
        double result = Gamma.regularizedGammaP(1.0, 0.0, 1e-9, 100);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    public void testRegularizedGammaP_AGreaterEqualOne_XGreaterThanA() throws MathException {
        // branch: a >= 1.0 && x > a  -> uses 1 - regularizedGammaQ
        // Known: P(1,2) = 1 - e^-2
        double expected = 1.0 - Math.exp(-2.0);
        double result = Gamma.regularizedGammaP(1.0, 2.0, 1e-9, 1000);
        assertEquals(expected, result, DELTA);
    }

    @Test
    public void testRegularizedGammaP_SeriesBranch_ALessThanOne() throws MathException {
        // branch: else (series calculation), a < 1 so first two conditions false
        // Known: P(0.5,1) = erf(1)
        double expected = 0.8427007929497149;
        double result = Gamma.regularizedGammaP(0.5, 1.0, 1e-9, 1000);
        assertEquals(expected, result, DELTA);
    }

    @Test
    public void testRegularizedGammaP_SeriesBranch_XLessEqualA() throws MathException {
        // branch: else (series calculation) when a>=1 but x<=a
        // Known: P(2,1) = 1 - e^-1*(1+1)
        double expected = 1.0 - Math.exp(-1.0) * 2.0;
        double result = Gamma.regularizedGammaP(2.0, 1.0, 1e-9, 1000);
        assertEquals(expected, result, DELTA);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaP_MaxIterationsExceeded() throws MathException {
        // branch: n >= maxIterations -> throws MaxIterationsExceededException
        // maxIterations = 0 forces loop to be skipped then the check n>=maxIterations true
        Gamma.regularizedGammaP(1.0, 0.5, 1e-9, 0);
    }

    // ---------------------------------------------------------
    // regularizedGammaQ(double a, double x) -- 2-arg delegate
    // ---------------------------------------------------------

    @Test
    public void testRegularizedGammaQ_TwoArgDelegate() throws MathException {
        // ensures delegate to 4-arg version with DEFAULT_EPSILON / MAX_VALUE
        double expected = Math.exp(-1.0); // Q(1,1)
        double result = Gamma.regularizedGammaQ(1.0, 1.0);
        assertEquals(expected, result, DELTA);
    }

    // ---------------------------------------------------------
    // regularizedGammaQ(double a, double x, double epsilon, int maxIterations)
    // ---------------------------------------------------------

    @Test
    public void testRegularizedGammaQ_NaN_A() throws MathException {
        // branch: Double.isNaN(a) -> NaN
        double result = Gamma.regularizedGammaQ(Double.NaN, 1.0, 1e-9, 100);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaQ_NaN_X() throws MathException {
        // branch: Double.isNaN(x) -> NaN
        double result = Gamma.regularizedGammaQ(1.0, Double.NaN, 1e-9, 100);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaQ_AZero() throws MathException {
        // branch: a <= 0.0 (a == 0) -> NaN
        double result = Gamma.regularizedGammaQ(0.0, 1.0, 1e-9, 100);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaQ_ANegative() throws MathException {
        // branch: a <= 0.0 (a < 0) -> NaN
        double result = Gamma.regularizedGammaQ(-3.0, 1.0, 1e-9, 100);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaQ_XNegative() throws MathException {
        // branch: x < 0.0 -> NaN
        double result = Gamma.regularizedGammaQ(1.0, -5.0, 1e-9, 100);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaQ_XZero() throws MathException {
        // branch: x == 0.0 -> 1.0
        double result = Gamma.regularizedGammaQ(1.0, 0.0, 1e-9, 100);
        assertEquals(1.0, result, DELTA);
    }

    @Test
    public void testRegularizedGammaQ_XLessThanA() throws MathException {
        // branch: x < a -> uses 1 - regularizedGammaP
        // Known: Q(2,1) = 1 - P(2,1) = e^-1*2
        double expected = Math.exp(-1.0) * 2.0;
        double result = Gamma.regularizedGammaQ(2.0, 1.0, 1e-9, 1000);
        assertEquals(expected, result, DELTA);
    }

    @Test
    public void testRegularizedGammaQ_ALessThanOne() throws MathException {
        // branch: a < 1.0 -> uses 1 - regularizedGammaP (even if x >= a)
        // Known: Q(0.5,1) = erfc(1)
        double expected = 0.15729920705028513;
        double result = Gamma.regularizedGammaQ(0.5, 1.0, 1e-9, 1000);
        assertEquals(expected, result, DELTA);
    }

    @Test
    public void testRegularizedGammaQ_ContinuedFractionBranch() throws MathException {
        // branch: else - uses continued fraction (a>=1 && x>=a)
        // Known: Q(1,2) = e^-2
        double expected = Math.exp(-2.0);
        double result = Gamma.regularizedGammaQ(1.0, 2.0, 1e-9, 1000);
        assertEquals(expected, result, DELTA);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaQ_ContinuedFraction_MaxIterationsExceeded()
            throws MathException {
        // branch: else - continued fraction, but maxIterations too low
        // to converge -> cf.evaluate() throws MaxIterationsExceededException
        // หมายเหตุ: พฤติกรรมนี้มาจาก ContinuedFraction.evaluate()
        // ซึ่งไม่ได้แสดง source ในที่นี้ แต่ throws ตาม signature ของ method
        Gamma.regularizedGammaQ(1.0, 2.0, 1e-9, 0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaQ_DelegateToP_MaxIterationsExceeded()
            throws MathException {
        // branch: x < a or a < 1.0 -> delegate to regularizedGammaP,
        // and that call's internal series loop throws when maxIterations=0
        Gamma.regularizedGammaQ(0.5, 1.0, 1e-9, 0);
    }
}
```

---

## สรุปตารางการครอบคลุม Branch/Condition

| เมธอดทดสอบ | เมธอดเป้าหมาย | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `testLogGamma_NaNInput` | `logGamma` | `Double.isNaN(x)` == true |
| `testLogGamma_ZeroInput` | `logGamma` | `x <= 0.0` (x=0) |
| `testLogGamma_NegativeInput` | `logGamma` | `x <= 0.0` (x<0) |
| `testLogGamma_OneInput` | `logGamma` | else branch, ค่าปกติ (x=1) |
| `testLogGamma_HalfInput` | `logGamma` | else branch, ค่าปกติ (x=0.5) |
| `testLogGamma_FiveInput` | `logGamma` | else branch, loop คำนวณ sum ครบ (x=5) |
| `testRegularizedGammaP_TwoArgDelegate` | `regularizedGammaP(a,x)` | การ delegate ไปยัง 4-arg |
| `testRegularizedGammaP_NaN_A` / `_NaN_X` | `regularizedGammaP(4-arg)` | `Double.isNaN(a)` / `Double.isNaN(x)` |
| `testRegularizedGammaP_AZero` / `_ANegative` | `regularizedGammaP(4-arg)` | `a <= 0.0` |
| `testRegularizedGammaP_XNegative` | `regularizedGammaP(4-arg)` | `x < 0.0` |
| `testRegularizedGammaP_XZero` | `regularizedGammaP(4-arg)` | `x == 0.0` -> 0.0 |
| `testRegularizedGammaP_AGreaterEqualOne_XGreaterThanA` | `regularizedGammaP(4-arg)` | `a>=1.0 && x>a` -> ใช้ Q |
| `testRegularizedGammaP_SeriesBranch_ALessThanOne` | `regularizedGammaP(4-arg)` | else (series), a<1 |
| `testRegularizedGammaP_SeriesBranch_XLessEqualA` | `regularizedGammaP(4-arg)` | else (series), a>=1 แต่ x<=a |
| `testRegularizedGammaP_MaxIterationsExceeded` | `regularizedGammaP(4-arg)` | `n >= maxIterations` -> throw exception |
| `testRegularizedGammaQ_TwoArgDelegate` | `regularizedGammaQ(a,x)` | การ delegate ไปยัง 4-arg |
| `testRegularizedGammaQ_NaN_A` / `_NaN_X` | `regularizedGammaQ(4-arg)` | `Double.isNaN(a)` / `Double.isNaN(x)` |
| `testRegularizedGammaQ_AZero` / `_ANegative` | `regularizedGammaQ(4-arg)` | `a <= 0.0` |
| `testRegularizedGammaQ_XNegative` | `regularizedGammaQ(4-arg)` | `x < 0.0` |
| `testRegularizedGammaQ_XZero` | `regularizedGammaQ(4-arg)` | `x == 0.0` -> 1.0 |
| `testRegularizedGammaQ_XLessThanA` | `regularizedGammaQ(4-arg)` | `x < a` -> ใช้ P |
| `testRegularizedGammaQ_ALessThanOne` | `regularizedGammaQ(4-arg)` | `a < 1.0` -> ใช้ P |
| `testRegularizedGammaQ_ContinuedFractionBranch` | `regularizedGammaQ(4-arg)` | else (continued fraction), a>=1 && x>=a |
| `testRegularizedGammaQ_ContinuedFraction_MaxIterationsExceeded` | `regularizedGammaQ(4-arg)` | else branch + exception จาก `cf.evaluate()` |
| `testRegularizedGammaQ_DelegateToP_MaxIterationsExceeded` | `regularizedGammaQ(4-arg)` | delegate ไป P และ exception จาก series loop |

**หมายเหตุสำคัญ:**
- การทดสอบ `MaxIterationsExceededException` ใน `regularizedGammaQ` ที่ใช้ continued fraction (`ContinuedFraction.evaluate()`) อ้างอิงจาก behavior ของ superclass ซึ่งไม่ได้แสดง source code มาด้วย จึงคาดหวังพฤติกรรมจาก exception signature ที่ throws ไว้ใน method signature เท่านั้น
- ค่าที่ใช้ตรวจสอบ (เช่น erf, erfc) อ้างอิงจากสูตรทางคณิตศาสตร์มาตรฐานที่เทียบเท่ากับ regularized incomplete gamma function เพื่อยืนยันความถูกต้องของผลลัพธ์ ไม่ได้เดา behavior จากโค้ด
- ใช้ `delta = 1e-6` สำหรับการเปรียบเทียบค่า floating point เนื่องจาก `DEFAULT_EPSILON = 10e-9` อาจทำให้ผลลัพธ์มีความแม่นยำใกล้เคียงแต่ไม่ exact