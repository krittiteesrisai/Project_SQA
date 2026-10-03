package org.apache.commons.math.util;

import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class MathUtilsTest {

    private static final double EPS = 1e-12;

    // --- addAndCheck (int & long) ---
    @Test
    public void testAddAndCheckIntValid() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntOverflowPositive() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntOverflowNegative() {
        MathUtils.addAndCheck(Integer.MIN_VALUE, -1);
    }

    @Test
    public void testAddAndCheckLongValid() {
        assertEquals(10L, MathUtils.addAndCheck(7L, 3L));
        assertEquals(-5L, MathUtils.addAndCheck(-2L, -3L));
        assertEquals(2L, MathUtils.addAndCheck(-5L, 7L)); // opposite sign
        assertEquals(5L, MathUtils.addAndCheck(7L, -2L)); // symmetry branch (a > b)
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflowPositive() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflowNegative() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongSymmetryOverflow() {
        MathUtils.addAndCheck(1L, Long.MAX_VALUE); // triggers a > b branch -> addAndCheck(Long.MAX_VALUE, 1L)
    }

    // --- subAndCheck ---
    @Test
    public void testSubAndCheckInt() {
        assertEquals(2, MathUtils.subAndCheck(5, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testSubAndCheckLong() {
        assertEquals(4L, MathUtils.subAndCheck(7L, 3L));
        assertEquals(-9L, MathUtils.subAndCheck(Long.MIN_VALUE, -1L)); // b == Long.MIN_VALUE, a < 0
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongMinValOverflow() {
        MathUtils.subAndCheck(1L, Long.MIN_VALUE); // b == Long.MIN_VALUE, a >= 0 -> throws exception
    }

    // --- mulAndCheck ---
    @Test
    public void testMulAndCheckInt() {
        assertEquals(15, MathUtils.mulAndCheck(3, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    @Test
    public void testMulAndCheckLong() {
        assertEquals(20L, MathUtils.mulAndCheck(4L, 5L));
        assertEquals(-20L, MathUtils.mulAndCheck(-4L, 5L));
        assertEquals(20L, MathUtils.mulAndCheck(-4L, -5L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
        assertEquals(20L, MathUtils.mulAndCheck(5L, 4L)); // symmetry (a > b)
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflowPositive() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflowNegative() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongSymmetryOverflow() {
        MathUtils.mulAndCheck(2L, Long.MAX_VALUE);
    }

    // --- Binomial Coefficient ---
    @Test
    public void testBinomialCoefficient() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 3)); // k > n/2 symmetry
        assertEquals(2598960L, MathUtils.binomialCoefficient(52, 5)); // n <= 61
        assertEquals(84510040015215L, MathUtils.binomialCoefficient(65, 30)); // 61 < n <= 66
        assertEquals(374421606701077760L, MathUtils.binomialCoefficient(68, 30)); // n > 66
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialPreconditionNK() {
        MathUtils.binomialCoefficient(3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialPreconditionNegative() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test
    public void testBinomialCoefficientDouble() {
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 3), EPS);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), EPS);
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), EPS);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), EPS); // k > n/2
        assertEquals(2598960.0, MathUtils.binomialCoefficientDouble(52, 5), EPS); // n < 67
        assertTrue(MathUtils.binomialCoefficientDouble(200, 100) > 0); // n >= 67
    }

    @Test
    public void testBinomialCoefficientLog() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), EPS);
        assertEquals(Math.log(5), MathUtils.binomialCoefficientLog(5, 1), EPS);
        assertEquals(Math.log(10), MathUtils.binomialCoefficientLog(5, 2), EPS); // n < 67
        assertEquals(Math.log(2598960.0), MathUtils.binomialCoefficientLog(52, 5), EPS); // n < 1030
        assertEquals(MathUtils.binomialCoefficientLog(200, 90), MathUtils.binomialCoefficientLog(200, 110), EPS); // k > n/2 symmetry
        assertTrue(MathUtils.binomialCoefficientLog(2000, 500) > 0); // n >= 1030
    }

    // --- GCD & LCM ---
    @Test
    public void testGcd() {
        assertEquals(6, MathUtils.gcd(54, 24));
        assertEquals(6, MathUtils.gcd(-54, 24));
        assertEquals(6, MathUtils.gcd(54, -24));
        assertEquals(24, MathUtils.gcd(0, 24));
        assertEquals(54, MathUtils.gcd(54, 0));
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(1, MathUtils.gcd(13, 17)); // binary gcd path with odd/even and shifts
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdMinValZero() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdZeroMinVal() {
        MathUtils.gcd(0, Integer.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdMinValMinVal() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdOverflowK31() {
        // Triggers k == 31 loop termination exception
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE); 
    }

    @Test
    public void testLcm() {
        assertEquals(12, MathUtils.lcm(4, 6));
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmOverflow() {
        MathUtils.lcm(Integer.MIN_VALUE, 2);
    }

    // --- Factorial ---
    @Test
    public void testFactorial() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(120L, MathUtils.factorial(5));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        MathUtils.factorial(-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialTooLarge() {
        MathUtils.factorial(21);
    }

    @Test
    public void testFactorialDouble() {
        assertEquals(120.0, MathUtils.factorialDouble(5), EPS);
        assertEquals(120.0, MathUtils.factorialDouble(20), EPS);
        assertTrue(MathUtils.factorialDouble(171) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDoubleNegative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialLog() {
        assertEquals(Math.log(120), MathUtils.factorialLog(5), EPS);
        assertEquals(Math.log(1.0), MathUtils.factorialLog(20), EPS); // check within 21
        assertTrue(MathUtils.factorialLog(25) > 0); // n >= 21 loop
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }

    // --- Equals & CompareTo ---
    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
        assertTrue(MathUtils.equals(5.0, 5.0));

        assertTrue(MathUtils.equals(5.0, 5.1, 0.2));
        assertFalse(MathUtils.equals(5.0, 5.5, 0.1));

        assertTrue(MathUtils.equals(1.0, 1.000000000000001, 2));
        assertFalse(MathUtils.equals(1.0, 2.0, 2));
    }

    @Test
    public void testEqualsArray() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[]{1.0, Double.NaN}, new double[]{1.0, Double.NaN}));
        assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    @Test
    public void testCompareTo() {
        assertEquals(0, MathUtils.compareTo(5.0, 5.1, 0.2));
        assertEquals(-1, MathUtils.compareTo(5.0, 5.5, 0.1));
        assertEquals(1, MathUtils.compareTo(5.5, 5.0, 0.1));
    }

    // --- Indicator & Sign ---
    @Test
    public void testIndicator() {
        assertEquals(1, MathUtils.indicator((byte) 5));
        assertEquals(-1, MathUtils.indicator((byte) -5));
        assertEquals(1.0, MathUtils.indicator(5.0), EPS);
        assertEquals(-1.0, MathUtils.indicator(-5.0), EPS);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
        assertEquals(1.0f, MathUtils.indicator(5.0f), EPS);
        assertEquals(-1.0f, MathUtils.indicator(-5.0f), EPS);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(-1, MathUtils.indicator(-5));
        assertEquals(1L, MathUtils.indicator(5L));
        assertEquals(-1L, MathUtils.indicator(-5L));
        assertEquals(1, MathUtils.indicator((short) 5));
        assertEquals(-1, MathUtils.indicator((short) -5));
    }

    @Test
    public void testSign() {
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 5));
        assertEquals((byte) -1, MathUtils.sign((byte) -5));

        assertEquals(0.0, MathUtils.sign(0.0), EPS);
        assertEquals(1.0, MathUtils.sign(5.0), EPS);
        assertEquals(-1.0, MathUtils.sign(-5.0), EPS);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));

        assertEquals(0.0f, MathUtils.sign(0.0f), EPS);
        assertEquals(1.0f, MathUtils.sign(5.0f), EPS);
        assertEquals(-1.0f, MathUtils.sign(-5.0f), EPS);
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));

        assertEquals(0, MathUtils.sign(0));
        assertEquals(1, MathUtils.sign(5));
        assertEquals(-1, MathUtils.sign(-5));

        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(1L, MathUtils.sign(5L));
        assertEquals(-1L, MathUtils.sign(-5L));

        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) 1, MathUtils.sign((short) 5));
        assertEquals((short) -1, MathUtils.sign((short) -5));
    }

    // --- Pow ---
    @Test
    public void testPowIntInt() {
        assertEquals(8, MathUtils.pow(2, 3));
        assertEquals(1, MathUtils.pow(2, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowIntIntNegative() {
        MathUtils.pow(2, -1);
    }

    @Test
    public void testPowIntLong() {
        assertEquals(8, MathUtils.pow(2, 3L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowIntLongNegative() {
        MathUtils.pow(2, -1L);
    }

    @Test
    public void testPowLongInt() {
        assertEquals(8L, MathUtils.pow(2L, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowLongIntNegative() {
        MathUtils.pow(2L, -1);
    }

    @Test
    public void testPowLongLong() {
        assertEquals(8L, MathUtils.pow(2L, 3L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowLongLongNegative() {
        MathUtils.pow(2L, -1L);
    }

    @Test
    public void testPowBigInteger() {
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), 3));
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), 3L));
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(3)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerIntNegative() {
        MathUtils.pow(BigInteger.valueOf(2), -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerLongNegative() {
        MathUtils.pow(BigInteger.valueOf(2), -1L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerBigIntegerNegative() {
        MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(-1));
    }

    // --- Trigonometric / Hyperbolic / Log / Misc ---
    @Test
    public void testCoshSinh() {
        assertEquals(Math.cosh(1.5), MathUtils.cosh(1.5), EPS);
        assertEquals(Math.sinh(1.5), MathUtils.sinh(1.5), EPS);
    }

    @Test
    public void testLogBase() {
        assertEquals(2.0, MathUtils.log(2.0, 4.0), EPS);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(Math.PI * 2, Math.PI), EPS);
    }

    @Test
    public void testNormalizeArray() {
        double[] input = {1.0, 2.0, Double.NaN, 3.0};
        double[] result = MathUtils.normalizeArray(input, 12.0);
        assertArrayEquals(new double[]{2.0, 4.0, Double.NaN, 6.0}, result, EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArrayInfiniteSum() {
        MathUtils.normalizeArray(new double[]{1.0}, Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArrayNanSum() {
        MathUtils.normalizeArray(new double[]{1.0}, Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArrayInfiniteElement() {
        MathUtils.normalizeArray(new double[]{Double.POSITIVE_INFINITY}, 10.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArrayZeroSum() {
        MathUtils.normalizeArray(new double[]{0.0, 0.0}, 10.0);
    }

    @Test
    public void testDistances() {
        double[] p1 = {1.0, 2.0};
        double[] p2 = {4.0, 6.0};
        int[] ip1 = {1, 2};
        int[] ip2 = {4, 6};

        assertEquals(7.0, MathUtils.distance1(p1, p2), EPS);
        assertEquals(7, MathUtils.distance1(ip1, ip2));
        assertEquals(5.0, MathUtils.distance(p1, p2), EPS);
        assertEquals(5.0, MathUtils.distance(ip1, ip2), EPS);
        assertEquals(4.0, MathUtils.distanceInf(p1, p2), EPS);
        assertEquals(4, MathUtils.distanceInf(ip1, ip2));
    }

    @Test
    public void testHashAndNextAfter() {
        assertEquals(new Double(5.5).hashCode(), MathUtils.hash(5.5));
        assertEquals(java.util.Arrays.hashCode(new double[]{1.0}), MathUtils.hash(new double[]{1.0}));

        assertEquals(Double.NaN, MathUtils.nextAfter(Double.NaN, 1.0), EPS);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), EPS);
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), EPS);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), EPS);
        assertTrue(MathUtils.nextAfter(1.0, 2.0) > 1.0);
        assertTrue(MathUtils.nextAfter(1.0, 0.0) < 1.0);
        // Test mantissa max/min bounds in nextAfter
        double maxDouble = Double.MAX_VALUE;
        assertTrue(MathUtils.nextAfter(maxDouble, Double.POSITIVE_INFINITY) > maxDouble);
    }

    @Test
    public void testScalb() {
        assertEquals(5.0, MathUtils.scalb(5.0, 0), EPS);
        assertEquals(0.0, MathUtils.scalb(0.0, 2), EPS);
        assertEquals(Double.NaN, MathUtils.scalb(Double.NaN, 2), EPS);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 2), EPS);
        assertEquals(10.0, MathUtils.scalb(5.0, 1), EPS);
    }

    // --- Rounding Comprehensive Coverage ---
    @Test
    public void testRoundDouble() {
        assertEquals(3.14, MathUtils.round(3.1416, 2), EPS);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), EPS);
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }

    @Test
    public void testRoundFloat() {
        assertEquals(3.14f, MathUtils.round(3.1416f, 2), 1e-3f);
    }

    @Test
    public void testRoundUnscaledAllModes() {
        // Test all BigDecimal rounding modes via float round with specific scales/signs
        assertEquals(4.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_CEILING), 1e-3f);
        assertEquals(-3.0f, MathUtils.round(-3.5f, 0, BigDecimal.ROUND_CEILING), 1e-3f);
        
        assertEquals(3.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_DOWN), 1e-3f);
        assertEquals(-3.0f, MathUtils.round(-3.5f, 0, BigDecimal.ROUND_DOWN), 1e-3f);

        assertEquals(3.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_FLOOR), 1e-3f);
        assertEquals(-4.0f, MathUtils.round(-3.5f, 0, BigDecimal.ROUND_FLOOR), 1e-3f);

        assertEquals(3.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_HALF_DOWN), 1e-3f);
        assertEquals(4.0f, MathUtils.round(3.6f, 0, BigDecimal.ROUND_HALF_DOWN), 1e-3f);

        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-3f); // even floor
        assertEquals(3.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-3f); // odd ceil
        assertEquals(4.0f, MathUtils.round(3.6f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-3f);
        assertEquals(3.0f, MathUtils.round(3.4f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-3f);

        assertEquals(4.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_HALF_UP), 1e-3f);
        assertEquals(3.0f, MathUtils.round(3.4f, 0, BigDecimal.ROUND_HALF_UP), 1e-3f);

        assertEquals(4.0f, MathUtils.round(4.0f, 0, BigDecimal.ROUND_UNNECESSARY), 1e-3f);
        
        assertEquals(4.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_UP), 1e-3f);
        assertEquals(-4.0f, MathUtils.round(-3.5f, 0, BigDecimal.ROUND_UP), 1e-3f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundUnnecessaryException() {
        MathUtils.round(3.5f, 0, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundInvalidMethod() {
        MathUtils.round(3.5f, 0, -999);
    }
}