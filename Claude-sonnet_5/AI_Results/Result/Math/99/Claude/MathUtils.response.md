# MathUtilsTest.java

```java
package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;

public class MathUtilsTest {

    private static final double DELTA = 1e-9;
    private static final float FDELTA = 1e-5f;

    // ---------- addAndCheck(int,int) ----------
    @Test
    public void testAddAndCheckInt() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
        assertEquals(-1, MathUtils.addAndCheck(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntOverflow() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    // ---------- addAndCheck(long,long) : covers swap / neg-safe / neg-overflow / opposite-sign / pos-safe / pos-overflow ----------
    @Test
    public void testAddAndCheckLongBranches() {
        assertEquals(8L, MathUtils.addAndCheck(5L, 3L));          // a>b -> swap, then positive-safe
        assertEquals(-8L, MathUtils.addAndCheck(-5L, -3L));       // both negative, safe
        assertEquals(-2L, MathUtils.addAndCheck(-5L, 3L));        // opposite sign, always safe

        try {
            MathUtils.addAndCheck(Long.MAX_VALUE, 1L);             // positive overflow
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { /* ok */ }

        try {
            MathUtils.addAndCheck(Long.MIN_VALUE, -1L);            // negative overflow
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { /* ok */ }
    }

    // ---------- binomialCoefficient ----------
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNLessThanK() {
        MathUtils.binomialCoefficient(2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNNegative() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test
    public void testBinomialCoefficientExceptions() {
        // covered above; placeholder kept for naming clarity in summary table
    }

    @Test
    public void testBinomialCoefficientBaseCases() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));  // n==k
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));  // k==0
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));  // k==1
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));  // k==n-1
    }

    @Test
    public void testBinomialCoefficientSymmetryAndRanges() {
        assertEquals(10L, MathUtils.binomialCoefficient(5, 3));   // k > n/2 -> symmetry
        assertEquals(120L, MathUtils.binomialCoefficient(10, 3)); // n <= 61 loop
        assertEquals(2016L, MathUtils.binomialCoefficient(64, 2)); // 61 < n <= 66
        assertEquals(2211L, MathUtils.binomialCoefficient(67, 2)); // n > 66 (mulAndCheck path)
    }

    // ---------- binomialCoefficientDouble ----------
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDoubleNLessThanK() {
        MathUtils.binomialCoefficientDouble(2, 5);
    }

    @Test
    public void testBinomialCoefficientDoubleBranches() {
        assertEquals(1d, MathUtils.binomialCoefficientDouble(5, 5), DELTA);
        assertEquals(1d, MathUtils.binomialCoefficientDouble(5, 0), DELTA);
        assertEquals(5d, MathUtils.binomialCoefficientDouble(5, 1), DELTA);
        assertEquals(5d, MathUtils.binomialCoefficientDouble(5, 4), DELTA);
        assertEquals(120d, MathUtils.binomialCoefficientDouble(10, 7), DELTA); // symmetry k>n/2
        assertEquals(120d, MathUtils.binomialCoefficientDouble(10, 3), DELTA); // n<67 delegate
        assertEquals(2415d, MathUtils.binomialCoefficientDouble(70, 2), DELTA); // n>=67 loop
    }

    // ---------- binomialCoefficientLog ----------
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLogNLessThanK() {
        MathUtils.binomialCoefficientLog(2, 5);
    }

    @Test
    public void testBinomialCoefficientLogBranches() {
        assertEquals(0d, MathUtils.binomialCoefficientLog(5, 5), DELTA);     // n==k
        assertEquals(0d, MathUtils.binomialCoefficientLog(5, 0), DELTA);     // k==0
        assertEquals(Math.log(5d), MathUtils.binomialCoefficientLog(5, 1), DELTA); // k==1
        assertEquals(Math.log(5d), MathUtils.binomialCoefficientLog(5, 4), DELTA); // k==n-1
        assertEquals(Math.log(120d), MathUtils.binomialCoefficientLog(10, 3), DELTA); // n<67
        assertEquals(Math.log(MathUtils.binomialCoefficientDouble(100, 3)),
                MathUtils.binomialCoefficientLog(100, 3), DELTA); // 67<=n<1030
        // n>=1030, k<=n/2 : direct sum-of-logs loop
        double direct = MathUtils.binomialCoefficientLog(1035, 300);
        assertTrue(direct > 0);
        // n>=1030, k>n/2 : recursive symmetry branch, must equal the mirrored value
        double viaSymmetry = MathUtils.binomialCoefficientLog(1035, 735); // 1035-735=300
        assertEquals(direct, viaSymmetry, 1e-6);
    }

    // ---------- cosh ----------
    @Test
    public void testCosh() {
        assertEquals(1.0, MathUtils.cosh(0.0), DELTA);
    }

    // ---------- equals(double,double) ----------
    @Test
    public void testEqualsTwoArg() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
    }

    // ---------- equals(double,double,eps) ----------
    @Test
    public void testEqualsWithEpsilon() {
        assertTrue(MathUtils.equals(5.0, 5.0, 0.1));       // x==y
        assertTrue(MathUtils.equals(1.0, 1.05, 0.1));      // x<y within eps
        assertTrue(MathUtils.equals(1.05, 1.0, 0.1));      // x>y within eps
        assertFalse(MathUtils.equals(1.0, 2.0, 0.1));      // out of range
    }

    // ---------- equals(double[],double[]) ----------
    @Test
    public void testEqualsArray() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 2.0}));
        assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    // ---------- factorial ----------
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        MathUtils.factorial(-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialTooLarge() {
        MathUtils.factorial(21);
    }

    @Test
    public void testFactorial() {
        assertEquals(120L, MathUtils.factorial(5));
        assertEquals(2432902008176640000L, MathUtils.factorial(20)); // boundary n=20
    }

    // ---------- factorialDouble ----------
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDoubleNegative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialDouble() {
        assertEquals(3628800d, MathUtils.factorialDouble(10), DELTA); // n<21
        assertTrue(MathUtils.factorialDouble(25) > 0);                 // n>=21
    }

    // ---------- factorialLog ----------
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testFactorialLog() {
        assertEquals(Math.log(120d), MathUtils.factorialLog(5), DELTA); // n<21
        assertTrue(MathUtils.factorialLog(25) > 0);                      // n>=21 loop
    }

    // ---------- gcd ----------
    @Test
    public void testGcdBasic() {
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(6, MathUtils.gcd(-12, 18));
    }

    /**
     * หมายเหตุ: ตาม javadoc ของ gcd ระบุว่า gcd(Integer.MIN_VALUE, Integer.MIN_VALUE)
     * ต้อง throw ArithmeticException เนื่องจากผลลัพธ์ที่แท้จริงคือ 2^31 ซึ่งเกินขอบเขต int
     * ทดสอบนี้อ้างอิงจาก contract ใน javadoc (เป็นส่วนหนึ่งของซอร์สที่ให้มา)
     */
    @Test(expected = ArithmeticException.class)
    public void testGcdMinValueMinValueThrows() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /**
     * หมายเหตุสำคัญ (Known defect - Math-99b):
     * ตาม javadoc, gcd(Integer.MIN_VALUE, 0) ต้อง throw ArithmeticException
     * แต่ branch แรกของโค้ด (u==0 || v==0) คำนวณ Math.abs(u)+Math.abs(v) โดยไม่ตรวจ overflow
     * ทำให้ Math.abs(Integer.MIN_VALUE) overflow กลับเป็น Integer.MIN_VALUE และไม่ throw จริง
     * -> เทสนี้เขียนตาม contract ที่ถูกต้อง เพื่อ "ดักจับ" fault นี้
     * คาดว่าจะ FAIL บนซอร์สโค้ดที่ให้มา (ซึ่งคือจุดประสงค์ของการทดสอบนี้)
     */
    @Test(expected = ArithmeticException.class)
    public void testGcdOverflowKnownDefect() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }

    // ---------- hash ----------
    @Test
    public void testHash() {
        assertEquals(Double.valueOf(1.0).hashCode(), MathUtils.hash(1.0));
        assertEquals(0, MathUtils.hash((double[]) null));
        double[] arr = {1.0, 2.0};
        assertEquals(java.util.Arrays.hashCode(arr), MathUtils.hash(arr));
    }

    // ---------- indicator (all overloads) ----------
    @Test
    public void testIndicatorAllTypes() {
        // byte
        assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        assertEquals((byte) -1, MathUtils.indicator((byte) -5));
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        // double
        assertEquals(1.0, MathUtils.indicator(5.0), DELTA);
        assertEquals(-1.0, MathUtils.indicator(-5.0), DELTA);
        assertEquals(1.0, MathUtils.indicator(0.0), DELTA);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
        // float
        assertEquals(1.0f, MathUtils.indicator(5.0f), FDELTA);
        assertEquals(-1.0f, MathUtils.indicator(-5.0f), FDELTA);
        assertEquals(1.0f, MathUtils.indicator(0.0f), FDELTA);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
        // int
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(-1, MathUtils.indicator(-5));
        assertEquals(1, MathUtils.indicator(0));
        // long
        assertEquals(1L, MathUtils.indicator(5L));
        assertEquals(-1L, MathUtils.indicator(-5L));
        assertEquals(1L, MathUtils.indicator(0L));
        // short
        assertEquals((short) 1, MathUtils.indicator((short) 5));
        assertEquals((short) -1, MathUtils.indicator((short) -5));
        assertEquals((short) 1, MathUtils.indicator((short) 0));
    }

    // ---------- lcm ----------
    @Test
    public void testLcmBasic() {
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
        assertEquals(12, MathUtils.lcm(4, 6));
    }

    /**
     * Known defect - Math-99b: javadoc ระบุว่า lcm(Integer.MIN_VALUE, n) ที่ abs(n)
     * เป็น power of 2 ต้อง throw ArithmeticException แต่การคำนวณจริงเกิด int overflow
     * ใน Math.abs(Integer.MIN_VALUE) และไม่ throw คืนค่าผิด (ติดลบ) แทน
     * เทสนี้เขียนตาม contract เดิมเพื่อดักจับ fault -> คาดว่า FAIL บนโค้ดนี้
     */
    @Test(expected = ArithmeticException.class)
    public void testLcmOverflowKnownDefect() {
        MathUtils.lcm(Integer.MIN_VALUE, 2);
    }

    // ---------- log ----------
    @Test
    public void testLog() {
        assertEquals(3.0, MathUtils.log(2.0, 8.0), DELTA);
    }

    // ---------- mulAndCheck(int,int) ----------
    @Test
    public void testMulAndCheckInt() {
        assertEquals(12, MathUtils.mulAndCheck(3, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    // ---------- mulAndCheck(long,long) : covers swap / pos-safe / pos-overflow / neg*neg-safe / neg*neg-overflow / neg*pos-safe / neg*pos-overflow / neg*zero / pos*zero / zero*zero ----------
    @Test
    public void testMulAndCheckLongBranches() {
        assertEquals(15L, MathUtils.mulAndCheck(5L, 3L));     // a>b swap, then positive-safe
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));    // negative*negative safe (with swap inside)
        assertEquals(-6L, MathUtils.mulAndCheck(-3L, 2L));    // negative*positive safe
        assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));     // negative * zero
        assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));      // positive * zero (swap -> a==0 branch)
        assertEquals(0L, MathUtils.mulAndCheck(0L, 0L));      // zero * zero

        try {
            MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);         // positive overflow
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { /* ok */ }

        try {
            MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);        // negative*negative overflow
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { /* ok */ }

        try {
            MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);         // negative*positive overflow
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { /* ok */ }
    }

    // ---------- nextAfter ----------
    @Test
    public void testNextAfter() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);

        assertTrue(MathUtils.nextAfter(1.0, 2.0) > 1.0);  // increase mantissa normal
        assertTrue(MathUtils.nextAfter(1.0, 0.0) < 1.0);  // decrease mantissa normal

        // mantissa == all-ones on increase -> exponent carries into Infinity
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY), 0.0);

        // decrease branch, mantissa == 0 case
        double result = MathUtils.nextAfter(2.0, 0.0);
        assertTrue(result < 2.0 && result > 1.9999999999999);
    }

    // ---------- scalb ----------
    @Test
    public void testScalb() {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.scalb(Double.POSITIVE_INFINITY, 5), 0.0);
        assertEquals(8.0, MathUtils.scalb(1.0, 3), DELTA);
        assertEquals(0.5, MathUtils.scalb(1.0, -1), DELTA);
    }

    // ---------- normalizeAngle ----------
    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-6);
        assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), 1e-6);
        assertEquals(-Math.PI, MathUtils.normalizeAngle(Math.PI, 0.0), 1e-6);
    }

    // ---------- round(double,...) ----------
    @Test
    public void testRoundDoubleDefaultAndSpecialValues() {
        assertEquals(1.23, MathUtils.round(1.234, 2), DELTA);
        assertEquals(1.24, MathUtils.round(1.235, 2), DELTA);
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));            // NumberFormatException path, not infinite
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.round(Double.POSITIVE_INFINITY, 2), 0.0);           // NumberFormatException path, infinite
    }

    // ---------- round(float,...) : covers roundUnscaled switch (all branches) ----------
    @Test
    public void testRoundFloatSwitchBranches() {
        // CEILING
        assertEquals(3.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_CEILING), FDELTA);
        assertEquals(-2.0f, MathUtils.round(-2.5f, 0, BigDecimal.ROUND_CEILING), FDELTA);

        // DOWN (truncate toward zero)
        assertEquals(2.0f, MathUtils.round(2.7f, 0, BigDecimal.ROUND_DOWN), FDELTA);
        assertEquals(-2.0f, MathUtils.round(-2.7f, 0, BigDecimal.ROUND_DOWN), FDELTA);

        // FLOOR
        assertEquals(2.0f, MathUtils.round(2.7f, 0, BigDecimal.ROUND_FLOOR), FDELTA);
        assertEquals(-3.0f, MathUtils.round(-2.7f, 0, BigDecimal.ROUND_FLOOR), FDELTA);

        // HALF_DOWN
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_DOWN), FDELTA);
        assertEquals(3.0f, MathUtils.round(2.6f, 0, BigDecimal.ROUND_HALF_DOWN), FDELTA);

        // HALF_EVEN
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_EVEN), FDELTA); // even
        assertEquals(4.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_HALF_EVEN), FDELTA); // odd
        assertEquals(3.0f, MathUtils.round(2.6f, 0, BigDecimal.ROUND_HALF_EVEN), FDELTA); // fraction>0.5
        assertEquals(2.0f, MathUtils.round(2.4f, 0, BigDecimal.ROUND_HALF_EVEN), FDELTA); // fraction<0.5

        // HALF_UP
        assertEquals(3.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_UP), FDELTA);
        assertEquals(2.0f, MathUtils.round(2.4f, 0, BigDecimal.ROUND_HALF_UP), FDELTA);

        // UP
        assertEquals(3.0f, MathUtils.round(2.1f, 0, BigDecimal.ROUND_UP), FDELTA);
        assertEquals(-3.0f, MathUtils.round(-2.1f, 0, BigDecimal.ROUND_UP), FDELTA);

        // UNNECESSARY - exact (no exception)
        assertEquals(3.0f, MathUtils.round(3.0f, 0, BigDecimal.ROUND_UNNECESSARY), FDELTA);

        // UNNECESSARY - inexact (exception)
        try {
            MathUtils.round(2.5f, 0, BigDecimal.ROUND_UNNECESSARY);
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { /* ok */ }

        // default branch -> invalid rounding method
        try {
            MathUtils.round(1.0f, 0, 999);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { /* ok */ }

        // round(float,int) default method (HALF_UP)
        assertEquals(3.0f, MathUtils.round(2.5f, 0), FDELTA);
    }

    // ---------- sign (all overloads) ----------
    @Test
    public void testSignAllTypes() {
        // byte
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 5));
        assertEquals((byte) -1, MathUtils.sign((byte) -5));
        // double
        assertEquals(0.0, MathUtils.sign(0.0), DELTA);
        assertEquals(1.0, MathUtils.sign(5.0), DELTA);
        assertEquals(-1.0, MathUtils.sign(-5.0), DELTA);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
        // float
        assertEquals(0.0f, MathUtils.sign(0.0f), FDELTA);
        assertEquals(1.0f, MathUtils.sign(5.0f), FDELTA);
        assertEquals(-1.0f, MathUtils.sign(-5.0f), FDELTA);
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
        // int
        assertEquals(0, MathUtils.sign(0));
        assertEquals(1, MathUtils.sign(5));
        assertEquals(-1, MathUtils.sign(-5));
        // long
        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(1L, MathUtils.sign(5L));
        assertEquals(-1L, MathUtils.sign(-5L));
        // short
        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) 1, MathUtils.sign((short) 5));
        assertEquals((short) -1, MathUtils.sign((short) -5));
    }

    // ---------- subAndCheck(int,int) ----------
    @Test
    public void testSubAndCheckInt() {
        assertEquals(2, MathUtils.subAndCheck(5, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    // ---------- subAndCheck(long,long) ----------
    @Test
    public void testSubAndCheckLongBranches() {
        assertEquals(7L, MathUtils.subAndCheck(10L, 3L));                           // normal path via addAndCheck

        assertEquals(9223372036854775803L,
                MathUtils.subAndCheck(-5L, Long.MIN_VALUE));                         // b==MIN_VALUE, a<0 safe

        try {
            MathUtils.subAndCheck(5L, Long.MIN_VALUE);                               // b==MIN_VALUE, a>=0 -> throw
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { /* ok */ }

        try {
            MathUtils.subAndCheck(Long.MIN_VALUE, 1L);                               // via addAndCheck overflow
            fail("expected ArithmeticException");
        } catch (ArithmeticException expected) { /* ok */ }
    }
}
```

# สรุปการครอบคลุม Branch/Condition

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testAddAndCheckInt / testAddAndCheckIntOverflow | `addAndCheck(int,int)`: ปกติ, overflow throw |
| testAddAndCheckLongBranches | swap (a>b), neg-neg safe, opposite-sign, neg-neg overflow, pos overflow |
| testBinomialCoefficientNLessThanK / NNegative | exception `n<k`, `n<0` |
| testBinomialCoefficientBaseCases | `n==k`, `k==0`, `k==1`, `k==n-1` |
| testBinomialCoefficientSymmetryAndRanges | `k>n/2`, `n<=61`, `61<n<=66`, `n>66` |
| testBinomialCoefficientDoubleBranches | เงื่อนไขเดียวกันสำหรับ double-version รวม loop `n>=67` |
| testBinomialCoefficientLogBranches | `n<67`, `67<=n<1030`, `n>=1030` symmetry + sum-loop |
| testCosh | formula ปกติ |
| testEqualsTwoArg | NaN/NaN, equal, not-equal, NaN/non-NaN |
| testEqualsWithEpsilon | x==y, x<y in-eps, x>y in-eps, out-of-eps |
| testEqualsArray | null/null, null/non-null, length mismatch, equal, element mismatch |
| testFactorial* | n<0, n>20, ปกติ, boundary n=20 |
| testFactorialDouble* | n<0, n<21, n>=21 |
| testFactorialLog* | n<0, n<21, loop n>=21 |
| testGcdBasic | u==0\|\|v==0, ปกติ, ค่าลบ |
| testGcdMinValueMinValueThrows | k==31 overflow branch |
| testGcdOverflowKnownDefect | known defect (abs overflow) – คาดว่า fail |
| testHash | hash(double), hash(null array), hash(array) |
| testIndicatorAllTypes | ทุก overload: >=0 และ <0, NaN (double/float) |
| testLcmBasic | a==0\|\|b==0, ปกติ |
| testLcmOverflowKnownDefect | known defect – คาดว่า fail |
| testLog | formula ปกติ |
| testMulAndCheckInt* | ปกติ, overflow |
| testMulAndCheckLongBranches | swap, pos-safe/overflow, neg*neg safe/overflow, neg*pos safe/overflow, *0 cases |
| testNextAfter | NaN, Infinite, d==0 (ทั้งสองทิศทาง), increase/decrease mantissa ปกติและ edge (all-ones, zero) |
| testScalb | d==0, NaN, Infinite, ปกติ (บวก/ลบ exponent) |
| testNormalizeAngle | floor formula หลายค่า รวม boundary |
| testRoundDoubleDefaultAndSpecialValues | ปกติ, NaN (NumberFormatException,ไม่ infinite), Infinite (NumberFormatException,infinite) |
| testRoundFloatSwitchBranches | ทุก case ของ `roundUnscaled` switch: CEILING(+/-), DOWN, FLOOR(+/-), HALF_DOWN, HALF_EVEN(even/odd), HALF_UP, UP(+/-), UNNECESSARY(exact/inexact), default(invalid) |
| testSignAllTypes | ทุก overload: >0, ==0, <0, NaN (double/float) |
| testSubAndCheckInt* | ปกติ, overflow |
| testSubAndCheckLongBranches | b==MIN_VALUE (a<0 / a>=0), else-branch ปกติและ overflow ผ่าน addAndCheck |

**หมายเหตุสำคัญ:** `testGcdOverflowKnownDefect` และ `testLcmOverflowKnownDefect` เขียนตาม **contract ใน javadoc** ของซอร์สที่ให้มา เพื่อจงใจดักจับ known defect (Math-99b) เรื่อง integer overflow ใน `Math.abs(Integer.MIN_VALUE)` — คาดว่าจะ **FAIL** เมื่อรันกับซอร์สโค้ดฉบับนี้ ซึ่งเป็นจุดประสงค์ของการทดสอบ (fault detection)