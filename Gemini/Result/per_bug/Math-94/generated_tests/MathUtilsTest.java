package org.apache.commons.math.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import org.junit.Test;

public class MathUtilsTest {

    // -------------------------------------------------------------------------
    // GCD & LCM Tests (Math-94 bug targeting & branch coverage)
    // -------------------------------------------------------------------------

    @Test
    public void testGcdOverflowDetectionMath94() {
        // 2^30 * 4 = 2^32 = 0 in 32-bit signed int arithmetic (overflow).
        // Correct GCD(1073741824, 4) must be 4, NOT 1073741824 + 4 = 1073741828.
        assertEquals(4, MathUtils.gcd(1073741824, 4));
        assertEquals(4, MathUtils.gcd(4, 1073741824));
    }

    @Test
    public void testGcd() {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(6, MathUtils.gcd(0, 6));
        assertEquals(6, MathUtils.gcd(6, 0));
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(6, MathUtils.gcd(-12, 18));
        assertEquals(6, MathUtils.gcd(12, -18));
        assertEquals(6, MathUtils.gcd(-12, -18));
        assertEquals(1, MathUtils.gcd(17, 19));
        assertEquals(3, MathUtils.gcd(9, 15));
        assertEquals(1 << 15, MathUtils.gcd(1 << 15, 1 << 16));
    }

    @Test
    public void testLcm() {
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
        assertEquals(36, MathUtils.lcm(12, 18));
        assertEquals(36, MathUtils.lcm(-12, 18));
        assertEquals(36, MathUtils.lcm(12, -18));
        assertEquals(36, MathUtils.lcm(-12, -18));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmOverflow() {
        MathUtils.lcm(Integer.MAX_VALUE, 2);
    }

    // -------------------------------------------------------------------------
    // addAndCheck Tests
    // -------------------------------------------------------------------------

    @Test
    public void testAddAndCheckInt() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
        assertEquals(-1, MathUtils.addAndCheck(2, -3));
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE - 1, 1));
        assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE + 1, -1));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntPositiveOverflow() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntNegativeOverflow() {
        MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testAddAndCheckLong() {
        assertEquals(5L, MathUtils.addAndCheck(2L, 3L));
        assertEquals(-1L, MathUtils.addAndCheck(2L, -3L));
        assertEquals(Long.MAX_VALUE, MathUtils.addAndCheck(Long.MAX_VALUE - 1L, 1L));
        assertEquals(Long.MIN_VALUE, MathUtils.addAndCheck(Long.MIN_VALUE + 1L, -1L));
        assertEquals(0L, MathUtils.addAndCheck(0L, 0L));
        assertEquals(5L, MathUtils.addAndCheck(5L, 0L));
        assertEquals(-5L, MathUtils.addAndCheck(-5L, 0L));
        // Test symmetry branch: a > b
        assertEquals(10L, MathUtils.addAndCheck(7L, 3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongPositiveOverflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongNegativeOverflow() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    // -------------------------------------------------------------------------
    // subAndCheck Tests
    // -------------------------------------------------------------------------

    @Test
    public void testSubAndCheckInt() {
        assertEquals(-1, MathUtils.subAndCheck(2, 3));
        assertEquals(5, MathUtils.subAndCheck(2, -3));
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE - 1, -1));
        assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE + 1, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntPositiveOverflow() {
        MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntNegativeOverflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testSubAndCheckLong() {
        assertEquals(-1L, MathUtils.subAndCheck(2L, 3L));
        assertEquals(5L, MathUtils.subAndCheck(2L, -3L));
        assertEquals(Long.MAX_VALUE, MathUtils.subAndCheck(Long.MAX_VALUE - 1L, -1L));
        assertEquals(Long.MIN_VALUE, MathUtils.subAndCheck(Long.MIN_VALUE + 1L, 1L));
        // Boundary case: b == Long.MIN_VALUE
        assertEquals(-1L, MathUtils.subAndCheck(-1L, Long.MIN_VALUE + 1L + Long.MAX_VALUE));
        assertEquals(0L, MathUtils.subAndCheck(Long.MIN_VALUE, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongMinValOverflow() {
        MathUtils.subAndCheck(0L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongPositiveOverflow() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongNegativeOverflow() {
        MathUtils.subAndCheck(Long.MIN_VALUE, 1L);
    }

    // -------------------------------------------------------------------------
    // mulAndCheck Tests
    // -------------------------------------------------------------------------

    @Test
    public void testMulAndCheckInt() {
        assertEquals(6, MathUtils.mulAndCheck(2, 3));
        assertEquals(-6, MathUtils.mulAndCheck(2, -3));
        assertEquals(0, MathUtils.mulAndCheck(0, 10));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntUnderflow() {
        MathUtils.mulAndCheck(Integer.MIN_VALUE, 2);
    }

    @Test
    public void testMulAndCheckLong() {
        assertEquals(6L, MathUtils.mulAndCheck(2L, 3L));
        assertEquals(-6L, MathUtils.mulAndCheck(2L, -3L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, -5L));
        assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
        // Symmetry: a > b
        assertEquals(6L, MathUtils.mulAndCheck(3L, 2L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongPositiveOverflowBothPositive() {
        MathUtils.mulAndCheck(Long.MAX_VALUE / 2 + 1, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongPositiveOverflowBothNegative() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongNegativeOverflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE / 2 - 1, 2L);
    }

    // -------------------------------------------------------------------------
    // Binomial Coefficient & Factorial Tests
    // -------------------------------------------------------------------------

    @Test
    public void testBinomialCoefficient() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 3));
        assertEquals(2598960L, MathUtils.binomialCoefficient(52, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNegativeN() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientKGreaterThanN() {
        MathUtils.binomialCoefficient(4, 5);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficientOverflow() {
        MathUtils.binomialCoefficient(67, 30);
    }

    @Test
    public void testBinomialCoefficientDoubleAndLog() {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), 1e-9);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), 1e-9);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), 1e-9);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), 1e-9);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), 1e-9);
        assertEquals(Math.log(5), MathUtils.binomialCoefficientLog(5, 1), 1e-9);
        assertEquals(Math.log(5), MathUtils.binomialCoefficientLog(5, 4), 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLogInvalid() {
        MathUtils.binomialCoefficientLog(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLogNegative() {
        MathUtils.binomialCoefficientLog(-2, 1);
    }

    @Test
    public void testFactorial() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(1L, MathUtils.factorial(1));
        assertEquals(2L, MathUtils.factorial(2));
        assertEquals(6L, MathUtils.factorial(3));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        MathUtils.factorial(-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialOverflow() {
        MathUtils.factorial(21);
    }

    @Test
    public void testFactorialDoubleAndLog() {
        assertEquals(1.0, MathUtils.factorialDouble(0), 1e-9);
        assertEquals(120.0, MathUtils.factorialDouble(5), 1e-9);
        assertEquals(0.0, MathUtils.factorialLog(0), 1e-9);
        assertEquals(0.0, MathUtils.factorialLog(1), 1e-9);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDoubleNegative() {
        MathUtils.factorialDouble(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }

    // -------------------------------------------------------------------------
    // Equals & Hash Tests
    // -------------------------------------------------------------------------

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
        assertFalse(MathUtils.equals(1.0, Double.NaN));
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
    }

    @Test
    public void testEqualsDoubleArray() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(new double[] { 1.0 }, null));
        assertFalse(MathUtils.equals(null, new double[] { 1.0 }));
        assertFalse(MathUtils.equals(new double[] { 1.0 }, new double[] { 1.0, 2.0 }));
        assertTrue(MathUtils.equals(new double[] { 1.0, Double.NaN }, new double[] { 1.0, Double.NaN }));
        assertFalse(MathUtils.equals(new double[] { 1.0, 2.0 }, new double[] { 1.0, 3.0 }));
    }

    @Test
    public void testHash() {
        assertEquals(Double.valueOf(1.23).hashCode(), MathUtils.hash(1.23));
        double[] arr = new double[] { 1.0, 2.0 };
        assertEquals(java.util.Arrays.hashCode(arr), MathUtils.hash(arr));
        assertEquals(0, MathUtils.hash((double[]) null));
    }

    // -------------------------------------------------------------------------
    // Indicator & Sign Tests
    // -------------------------------------------------------------------------

    @Test
    public void testIndicator() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) -1, MathUtils.indicator((byte) -5));

        assertEquals((short) 1, MathUtils.indicator((short) 5));
        assertEquals((short) 1, MathUtils.indicator((short) 0));
        assertEquals((short) -1, MathUtils.indicator((short) -5));

        assertEquals(1, MathUtils.indicator(5));
        assertEquals(1, MathUtils.indicator(0));
        assertEquals(-1, MathUtils.indicator(-5));

        assertEquals(1L, MathUtils.indicator(5L));
        assertEquals(1L, MathUtils.indicator(0L));
        assertEquals(-1L, MathUtils.indicator(-5L));

        assertEquals(1.0f, MathUtils.indicator(5.0f), 1e-6f);
        assertEquals(1.0f, MathUtils.indicator(0.0f), 1e-6f);
        assertEquals(-1.0f, MathUtils.indicator(-5.0f), 1e-6f);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));

        assertEquals(1.0, MathUtils.indicator(5.0), 1e-9);
        assertEquals(1.0, MathUtils.indicator(0.0), 1e-9);
        assertEquals(-1.0, MathUtils.indicator(-5.0), 1e-9);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }

    @Test
    public void testSign() {
        assertEquals((byte) 1, MathUtils.sign((byte) 5));
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) -1, MathUtils.sign((byte) -5));

        assertEquals((short) 1, MathUtils.sign((short) 5));
        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) -1, MathUtils.sign((short) -5));

        assertEquals(1, MathUtils.sign(5));
        assertEquals(0, MathUtils.sign(0));
        assertEquals(-1, MathUtils.sign(-5));

        assertEquals(1L, MathUtils.sign(5L));
        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(-1L, MathUtils.sign(-5L));

        assertEquals(1.0f, MathUtils.sign(5.0f), 1e-6f);
        assertEquals(0.0f, MathUtils.sign(0.0f), 1e-6f);
        assertEquals(-1.0f, MathUtils.sign(-5.0f), 1e-6f);
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));

        assertEquals(1.0, MathUtils.sign(5.0), 1e-9);
        assertEquals(0.0, MathUtils.sign(0.0), 1e-9);
        assertEquals(-1.0, MathUtils.sign(-5.0), 1e-9);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }

    // -------------------------------------------------------------------------
    // Hyperbolic & Log & Scalb & NormalizeAngle & NextAfter Tests
    // -------------------------------------------------------------------------

    @Test
    public void testHyperbolic() {
        assertEquals(1.0, MathUtils.cosh(0.0), 1e-9);
        assertEquals((Math.E + 1.0 / Math.E) / 2.0, MathUtils.cosh(1.0), 1e-9);
        assertEquals(0.0, MathUtils.sinh(0.0), 1e-9);
        assertEquals((Math.E - 1.0 / Math.E) / 2.0, MathUtils.sinh(1.0), 1e-9);
    }

    @Test
    public void testLog() {
        assertEquals(3.0, MathUtils.log(2.0, 8.0), 1e-9);
        assertEquals(2.0, MathUtils.log(10.0, 100.0), 1e-9);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-9);
        assertEquals(Math.PI / 2.0, MathUtils.normalizeAngle(2.5 * Math.PI, 0.0), 1e-9);
        assertEquals(-Math.PI / 2.0, MathUtils.normalizeAngle(-2.5 * Math.PI, 0.0), 1e-9);
    }

    @Test
    public void testScalb() {
        assertEquals(0.0, MathUtils.scalb(0.0, 2), 1e-9);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 2)));
        assertTrue(Double.isInfinite(MathUtils.scalb(Double.POSITIVE_INFINITY, 2)));
        assertEquals(8.0, MathUtils.scalb(2.0, 2), 1e-9);
        assertEquals(1.0, MathUtils.scalb(4.0, -2), 1e-9);
    }

    @Test
    public void testNextAfter() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertTrue(Double.isInfinite(MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0)));
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);

        // Increase mantissa
        double d1 = 1.0;
        assertTrue(MathUtils.nextAfter(d1, 2.0) > d1);

        // Decrease mantissa
        assertTrue(MathUtils.nextAfter(d1, 0.0) < d1);

        // Mantissa boundary check (all 1s)
        double nearPow2 = Math.nextUp(1.0) - Math.ulp(1.0); // power boundary
        assertTrue(MathUtils.nextAfter(nearPow2, 2.0) > nearPow2);

        // Mantissa boundary check (all 0s, e.g. 2.0)
        double pow2 = 2.0;
        assertTrue(MathUtils.nextAfter(pow2, 1.0) < pow2);
    }

    // -------------------------------------------------------------------------
    // Rounding Tests (All BigDecimal Modes for Double and Float)
    // -------------------------------------------------------------------------

    @Test
    public void testRoundDouble() {
        assertEquals(1.23, MathUtils.round(1.234, 2), 1e-9);
        assertEquals(1.24, MathUtils.round(1.235, 2), 1e-9);
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
        assertTrue(Double.isInfinite(MathUtils.round(Double.POSITIVE_INFINITY, 2)));
    }

    @Test
    public void testRoundFloatAllModes() {
        float valPos = 1.255f;
        float valNeg = -1.255f;

        // ROUND_CEILING
        assertEquals(1.26f, MathUtils.round(valPos, 2, BigDecimal.ROUND_CEILING), 1e-4f);
        assertEquals(-1.25f, MathUtils.round(valNeg, 2, BigDecimal.ROUND_CEILING), 1e-4f);

        // ROUND_DOWN
        assertEquals(1.25f, MathUtils.round(valPos, 2, BigDecimal.ROUND_DOWN), 1e-4f);
        assertEquals(-1.25f, MathUtils.round(valNeg, 2, BigDecimal.ROUND_DOWN), 1e-4f);

        // ROUND_FLOOR
        assertEquals(1.25f, MathUtils.round(valPos, 2, BigDecimal.ROUND_FLOOR), 1e-4f);
        assertEquals(-1.26f, MathUtils.round(valNeg, 2, BigDecimal.ROUND_FLOOR), 1e-4f);

        // ROUND_HALF_DOWN
        assertEquals(1.25f, MathUtils.round(1.255f, 2, BigDecimal.ROUND_HALF_DOWN), 1e-4f);
        assertEquals(1.26f, MathUtils.round(1.256f, 2, BigDecimal.ROUND_HALF_DOWN), 1e-4f);

        // ROUND_HALF_UP
        assertEquals(1.26f, MathUtils.round(1.255f, 2, BigDecimal.ROUND_HALF_UP), 1e-4f);
        assertEquals(1.25f, MathUtils.round(1.254f, 2, BigDecimal.ROUND_HALF_UP), 1e-4f);

        // ROUND_HALF_EVEN
        assertEquals(1.26f, MathUtils.round(1.255f, 2, BigDecimal.ROUND_HALF_EVEN), 1e-4f);
        assertEquals(1.24f, MathUtils.round(1.245f, 2, BigDecimal.ROUND_HALF_EVEN), 1e-4f);
        assertEquals(1.24f, MathUtils.round(1.244f, 2, BigDecimal.ROUND_HALF_EVEN), 1e-4f);
        assertEquals(1.25f, MathUtils.round(1.246f, 2, BigDecimal.ROUND_HALF_EVEN), 1e-4f);

        // ROUND_UP
        assertEquals(1.26f, MathUtils.round(valPos, 2, BigDecimal.ROUND_UP), 1e-4f);
        assertEquals(-1.26f, MathUtils.round(valNeg, 2, BigDecimal.ROUND_UP), 1e-4f);

        // Default Rounding
        assertEquals(1.26f, MathUtils.round(valPos, 2), 1e-4f);

        // ROUND_UNNECESSARY
        assertEquals(1.25f, MathUtils.round(1.25f, 2, BigDecimal.ROUND_UNNECESSARY), 1e-4f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloatUnnecessaryException() {
        MathUtils.round(1.255f, 2, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloatInvalidMode() {
        MathUtils.round(1.255f, 2, 9999);
    }
}