package org.apache.commons.math.util;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * High coverage and edge-case test suite for MathUtils.
 */
public class MathUtilsTest {

    // ==========================================
    // 1. ADD & SUB & MUL (INT & LONG)
    // ==========================================

    @Test
    public void testAddAndCheckInt() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
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
        assertEquals(5L, MathUtils.addAndCheck(3L, 2L)); // a > b branch
        assertEquals(-5L, MathUtils.addAndCheck(-3L, -2L));
        assertEquals(-1L, MathUtils.addAndCheck(-3L, 2L)); // opposite signs
        assertEquals(0L, MathUtils.addAndCheck(0L, 0L));
        assertEquals(Long.MAX_VALUE, MathUtils.addAndCheck(Long.MAX_VALUE - 1L, 1L));
        assertEquals(Long.MIN_VALUE, MathUtils.addAndCheck(Long.MIN_VALUE + 1L, -1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongPositiveOverflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongNegativeOverflow() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testSubAndCheckInt() {
        assertEquals(-1, MathUtils.subAndCheck(2, 3));
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE - 1, -1));
        assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE + 1, 1));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflow() {
        MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntUnderflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testSubAndCheckLong() {
        assertEquals(-1L, MathUtils.subAndCheck(2L, 3L));
        assertEquals(-1L, MathUtils.subAndCheck(-2L, Long.MIN_VALUE + 1L + 2L)); // b != MIN_VALUE
        assertEquals(0L, MathUtils.subAndCheck(Long.MIN_VALUE, Long.MIN_VALUE)); // b == MIN_VALUE, a < 0
        assertEquals(-1L, MathUtils.subAndCheck(Long.MIN_VALUE - 1L + 2L, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongOverflow() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongMinValueSubtrahendOverflow() {
        MathUtils.subAndCheck(0L, Long.MIN_VALUE); // b == MIN_VALUE, a >= 0
    }

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
        assertEquals(6L, MathUtils.mulAndCheck(3L, 2L)); // a > b
        assertEquals(6L, MathUtils.mulAndCheck(-3L, -2L)); // a < 0, b < 0
        assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L)); // a < 0, b > 0
        assertEquals(0L, MathUtils.mulAndCheck(-2L, 0L)); // a < 0, b == 0
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L)); // a == 0
        assertEquals(0L, MathUtils.mulAndCheck(0L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongPositiveOverflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongNegativeOverflowBothNeg() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongNegativeOverflowDiffSigns() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    // ==========================================
    // 2. BINOMIAL COEFFICIENT & FACTORIAL
    // ==========================================

    @Test
    public void testBinomialCoefficient() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 3)); // symmetry k > n/2

        // Branch n <= 61
        assertEquals(1144066L, MathUtils.binomialCoefficient(23, 10));
        // Branch 61 < n <= 66
        assertEquals(7219428434016265740L, MathUtils.binomialCoefficient(66, 33));
        // Branch n > 66 (small k so it does not overflow)
        assertEquals(2211L, MathUtils.binomialCoefficient(67, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNLessThanK() {
        MathUtils.binomialCoefficient(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNegativeN() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficientOverflow() {
        MathUtils.binomialCoefficient(70, 35);
    }

    @Test
    public void testBinomialCoefficientDouble() {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), 1e-9);
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), 1e-9);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), 1e-9);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), 1e-9);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 3), 1e-9); // k > n/2
        assertEquals(2211.0, MathUtils.binomialCoefficientDouble(67, 2), 1e-9); // n >= 67
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDoubleNLessThanK() {
        MathUtils.binomialCoefficientDouble(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDoubleNegativeN() {
        MathUtils.binomialCoefficientDouble(-1, 0);
    }

    @Test
    public void testBinomialCoefficientLog() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), 1e-9);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), 1e-9);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), 1e-9);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 4), 1e-9);
        assertEquals(Math.log(10.0), MathUtils.binomialCoefficientLog(5, 2), 1e-9); // n < 67
        assertEquals(Math.log(MathUtils.binomialCoefficientDouble(70, 10)), MathUtils.binomialCoefficientLog(70, 10), 1e-9); // 67 <= n < 1030

        // n >= 1030
        double logLarge = MathUtils.binomialCoefficientLog(1050, 10);
        assertTrue(logLarge > 0.0);
        assertEquals(logLarge, MathUtils.binomialCoefficientLog(1050, 1040), 1e-5); // symmetry k > n/2
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLogNLessThanK() {
        MathUtils.binomialCoefficientLog(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLogNegativeN() {
        MathUtils.binomialCoefficientLog(-1, 0);
    }

    @Test
    public void testFactorial() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(1L, MathUtils.factorial(1));
        assertEquals(120L, MathUtils.factorial(5));
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
    public void testFactorialDouble() {
        assertEquals(1.0, MathUtils.factorialDouble(0), 1e-9);
        assertEquals(120.0, MathUtils.factorialDouble(5), 1e-9);
        assertEquals(Math.floor(Math.exp(MathUtils.factorialLog(25)) + 0.5), MathUtils.factorialDouble(25), 1e-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDoubleNegative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialLog() {
        assertEquals(0.0, MathUtils.factorialLog(0), 1e-9);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), 1e-9);
        assertTrue(MathUtils.factorialLog(25) > 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }

    // ==========================================
    // 3. GCD & LCM
    // ==========================================

    @Test
    public void testGcd() {
        assertEquals(6, MathUtils.gcd(54, 24));
        assertEquals(6, MathUtils.gcd(-54, 24));
        assertEquals(6, MathUtils.gcd(54, -24));
        assertEquals(6, MathUtils.gcd(-54, -24));
        assertEquals(5, MathUtils.gcd(5, 0));
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(1, MathUtils.gcd(17, 13));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdOverflowBothMinValue() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test
    public void testLcm() {
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
        assertEquals(12, MathUtils.lcm(4, 6));
        assertEquals(12, MathUtils.lcm(-4, 6));
        assertEquals(12, MathUtils.lcm(4, -6));
    }

    // ==========================================
    // 4. FLOATING-POINT, ROUNDING & UTILITIES
    // ==========================================

    @Test
    public void testCoshSinh() {
        assertEquals(1.0, MathUtils.cosh(0.0), 1e-9);
        assertEquals(0.0, MathUtils.sinh(0.0), 1e-9);
        assertEquals(MathUtils.cosh(2.5), MathUtils.cosh(-2.5), 1e-9);
        assertEquals(-MathUtils.sinh(2.5), MathUtils.sinh(-2.5), 1e-9);
    }

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
        assertFalse(MathUtils.equals(1.0, Double.NaN));
        assertTrue(MathUtils.equals(1.23, 1.23));
        assertFalse(MathUtils.equals(1.23, 1.24));
    }

    @Test
    public void testEqualsDoubleWithEps() {
        assertTrue(MathUtils.equals(1.0, 1.0, 0.1));
        assertTrue(MathUtils.equals(1.0, 1.05, 0.1)); // x < y and x + eps >= y
        assertFalse(MathUtils.equals(1.0, 1.15, 0.1)); // x < y and x + eps < y
        assertTrue(MathUtils.equals(1.05, 1.0, 0.1)); // x > y and x <= y + eps
        assertFalse(MathUtils.equals(1.15, 1.0, 0.1)); // x > y and x > y + eps
    }

    @Test
    public void testEqualsDoubleArray() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[]{1.0, Double.NaN}, new double[]{1.0, Double.NaN}));
        assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    @Test
    public void testHash() {
        assertEquals(Double.valueOf(3.14).hashCode(), MathUtils.hash(3.14));
        assertEquals(java.util.Arrays.hashCode(new double[]{1.0, 2.0}), MathUtils.hash(new double[]{1.0, 2.0}));
        assertEquals(0, MathUtils.hash((double[]) null));
    }

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

        assertEquals(1.0, MathUtils.indicator(5.0), 1e-9);
        assertEquals(1.0, MathUtils.indicator(0.0), 1e-9);
        assertEquals(-1.0, MathUtils.indicator(-5.0), 1e-9);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));

        assertEquals(1.0f, MathUtils.indicator(5.0f), 1e-9f);
        assertEquals(1.0f, MathUtils.indicator(0.0f), 1e-9f);
        assertEquals(-1.0f, MathUtils.indicator(-5.0f), 1e-9f);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
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

        assertEquals(1.0, MathUtils.sign(5.0), 1e-9);
        assertEquals(0.0, MathUtils.sign(0.0), 1e-9);
        assertEquals(-1.0, MathUtils.sign(-5.0), 1e-9);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));

        assertEquals(1.0f, MathUtils.sign(5.0f), 1e-9f);
        assertEquals(0.0f, MathUtils.sign(0.0f), 1e-9f);
        assertEquals(-1.0f, MathUtils.sign(-5.0f), 1e-9f);
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
    }

    @Test
    public void testLog() {
        assertEquals(2.0, MathUtils.log(2.0, 4.0), 1e-9);
        assertEquals(3.0, MathUtils.log(10.0, 1000.0), 1e-9);
    }

    @Test
    public void testScalb() {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 1e-9);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
        assertTrue(Double.isInfinite(MathUtils.scalb(Double.POSITIVE_INFINITY, 5)));
        assertEquals(8.0, MathUtils.scalb(2.0, 2), 1e-9);
        assertEquals(0.5, MathUtils.scalb(2.0, -2), 1e-9);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), 1e-9);
        assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), 1e-9);
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), 1e-9);
    }

    @Test
    public void testNextAfter() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertTrue(Double.isInfinite(MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0)));
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);

        // Increase mantissa
        double d = 1.0;
        double nextUp = MathUtils.nextAfter(d, 2.0);
        assertTrue(nextUp > d);

        // Decrease mantissa
        double nextDown = MathUtils.nextAfter(d, 0.0);
        assertTrue(nextDown < d);
    }

    @Test
    public void testRoundDouble() {
        assertEquals(1.23, MathUtils.round(1.234, 2), 1e-9);
        assertEquals(1.24, MathUtils.round(1.235, 2), 1e-9);
        assertTrue(Double.isInfinite(MathUtils.round(Double.POSITIVE_INFINITY, 2, BigDecimal.ROUND_HALF_UP)));
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2, BigDecimal.ROUND_HALF_UP)));
    }

    @Test
    public void testRoundFloatAllModes() {
        assertEquals(1.23f, MathUtils.round(1.234f, 2), 1e-5f);

        // ROUND_CEILING
        assertEquals(2.0f, MathUtils.round(1.1f, 0, BigDecimal.ROUND_CEILING), 1e-5f);
        assertEquals(-1.0f, MathUtils.round(-1.1f, 0, BigDecimal.ROUND_CEILING), 1e-5f);

        // ROUND_DOWN
        assertEquals(1.0f, MathUtils.round(1.9f, 0, BigDecimal.ROUND_DOWN), 1e-5f);

        // ROUND_FLOOR
        assertEquals(1.0f, MathUtils.round(1.9f, 0, BigDecimal.ROUND_FLOOR), 1e-5f);
        assertEquals(-2.0f, MathUtils.round(-1.1f, 0, BigDecimal.ROUND_FLOOR), 1e-5f);

        // ROUND_HALF_DOWN
        assertEquals(1.0f, MathUtils.round(1.5f, 0, BigDecimal.ROUND_HALF_DOWN), 1e-5f);
        assertEquals(2.0f, MathUtils.round(1.6f, 0, BigDecimal.ROUND_HALF_DOWN), 1e-5f);

        // ROUND_HALF_EVEN
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f); // even
        assertEquals(4.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f); // odd
        assertEquals(1.0f, MathUtils.round(1.4f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f);
        assertEquals(2.0f, MathUtils.round(1.6f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-5f);

        // ROUND_HALF_UP
        assertEquals(2.0f, MathUtils.round(1.5f, 0, BigDecimal.ROUND_HALF_UP), 1e-5f);
        assertEquals(1.0f, MathUtils.round(1.4f, 0, BigDecimal.ROUND_HALF_UP), 1e-5f);

        // ROUND_UP
        assertEquals(2.0f, MathUtils.round(1.1f, 0, BigDecimal.ROUND_UP), 1e-5f);
        
        // ROUND_UNNECESSARY
        assertEquals(2.0f, MathUtils.round(2.0f, 0, BigDecimal.ROUND_UNNECESSARY), 1e-5f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloatUnnecessaryException() {
        MathUtils.round(1.5f, 0, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloatInvalidRoundingMethod() {
        MathUtils.round(1.5f, 0, -999);
    }
}