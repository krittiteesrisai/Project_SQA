package org.apache.commons.math.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.math.exception.NonMonotonousSequenceException;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {

    private static final double EPSILON = 1e-15;

    // =========================================================================
    // 1. Arithmetic & Overflow Tests (addAndCheck, subAndCheck, mulAndCheck)
    // =========================================================================

    @Test
    public void testAddAndCheckInt() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
        assertEquals(-5, MathUtils.addAndCheck(-2, -3));
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
        assertEquals(5L, MathUtils.addAndCheck(3L, 2L)); // symmetry a > b
        assertEquals(-5L, MathUtils.addAndCheck(-2L, -3L));
        assertEquals(-5L, MathUtils.addAndCheck(-3L, -2L));
        assertEquals(1L, MathUtils.addAndCheck(-2L, 3L)); // opposite sign
        assertEquals(1L, MathUtils.addAndCheck(3L, -2L));
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
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, MathUtils.subAndCheck(Integer.MIN_VALUE, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntPositiveOverflow() {
        MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
    }

    @Test
    public void testSubAndCheckLong() {
        assertEquals(-1L, MathUtils.subAndCheck(2L, 3L));
        assertEquals(0L, MathUtils.subAndCheck(Long.MIN_VALUE, Long.MIN_VALUE));
        assertEquals(-1L, MathUtils.subAndCheck(Long.MIN_VALUE + 1, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongMinValOverflow() {
        MathUtils.subAndCheck(0L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongOverflowPositive() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }

    @Test
    public void testMulAndCheckInt() {
        assertEquals(6, MathUtils.mulAndCheck(2, 3));
        assertEquals(-6, MathUtils.mulAndCheck(2, -3));
        assertEquals(0, MathUtils.mulAndCheck(0, Integer.MAX_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    @Test
    public void testMulAndCheckLong() {
        assertEquals(6L, MathUtils.mulAndCheck(2L, 3L));
        assertEquals(6L, MathUtils.mulAndCheck(3L, 2L)); // a > b
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
        assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongPositiveOverflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongNegativeOverflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongNegativeOverflowBothNegative() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
    }

    // =========================================================================
    // 2. Binomial & Factorial Tests
    // =========================================================================

    @Test
    public void testBinomialCoefficient() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
        assertEquals(10L, MathUtils.binomialCoefficient(5, 3)); // k > n/2 symmetry

        // n <= 61 naive implementation
        assertEquals(1144066L, MathUtils.binomialCoefficient(23, 10));

        // 61 < n <= 66
        assertTrue(MathUtils.binomialCoefficient(66, 3) > 0);

        // n > 66 with small k
        assertEquals(67L, MathUtils.binomialCoefficient(67, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientInvalidOrder() {
        MathUtils.binomialCoefficient(3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNegativeParameter() {
        MathUtils.binomialCoefficient(-1, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficientOverflow() {
        MathUtils.binomialCoefficient(67, 30);
    }

    @Test
    public void testBinomialCoefficientDouble() {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), EPSILON);
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), EPSILON);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), EPSILON);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), EPSILON);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 3), EPSILON);
        assertTrue(MathUtils.binomialCoefficientDouble(100, 10) > 0);
    }

    @Test
    public void testBinomialCoefficientLog() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), EPSILON);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), EPSILON);
        assertEquals(FastMath.log(5), MathUtils.binomialCoefficientLog(5, 1), EPSILON);
        assertEquals(FastMath.log(5), MathUtils.binomialCoefficientLog(5, 4), EPSILON);
        assertTrue(MathUtils.binomialCoefficientLog(50, 10) > 0);
        assertTrue(MathUtils.binomialCoefficientLog(1050, 5) > 0);
        assertTrue(MathUtils.binomialCoefficientLog(1050, 1045) > 0); // k > n/2 for large n
    }

    @Test
    public void testFactorial() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(1L, MathUtils.factorial(1));
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
        assertEquals(1.0, MathUtils.factorialDouble(0), EPSILON);
        assertTrue(MathUtils.factorialDouble(25) > 0);
        assertEquals(0.0, MathUtils.factorialLog(0), EPSILON);
        assertTrue(MathUtils.factorialLog(25) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        MathUtils.factorial(-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialOverflow() {
        MathUtils.factorial(21);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDoubleNegative() {
        MathUtils.factorialDouble(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }

    // =========================================================================
    // 3. GCD & LCM Tests
    // =========================================================================

    @Test
    public void testGcdInt() {
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(5, MathUtils.gcd(5, 0));
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(6, MathUtils.gcd(-12, 18));
        assertEquals(6, MathUtils.gcd(12, -18));
        assertEquals(6, MathUtils.gcd(-12, -18));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdIntOverflow1() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdIntOverflow2() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test
    public void testGcdLong() {
        assertEquals(0L, MathUtils.gcd(0L, 0L));
        assertEquals(5L, MathUtils.gcd(0L, 5L));
        assertEquals(5L, MathUtils.gcd(5L, 0L));
        assertEquals(6L, MathUtils.gcd(12L, 18L));
        assertEquals(6L, MathUtils.gcd(-12L, 18L));
        assertEquals(6L, MathUtils.gcd(12L, -18L));
        assertEquals(6L, MathUtils.gcd(-12L, -18L));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdLongOverflow1() {
        MathUtils.gcd(Long.MIN_VALUE, 0L);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdLongOverflow2() {
        MathUtils.gcd(Long.MIN_VALUE, Long.MIN_VALUE);
    }

    @Test
    public void testLcmInt() {
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
        assertEquals(36, MathUtils.lcm(12, 18));
        assertEquals(36, MathUtils.lcm(-12, 18));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmIntOverflow() {
        MathUtils.lcm(Integer.MAX_VALUE, 2);
    }

    @Test
    public void testLcmLong() {
        assertEquals(0L, MathUtils.lcm(0L, 5L));
        assertEquals(0L, MathUtils.lcm(5L, 0L));
        assertEquals(36L, MathUtils.lcm(12L, 18L));
        assertEquals(36L, MathUtils.lcm(-12L, 18L));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmLongOverflow() {
        MathUtils.lcm(Long.MAX_VALUE, 2L);
    }

    // =========================================================================
    // 4. Equality & Comparison Tests
    // =========================================================================

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
        assertFalse(MathUtils.equals(1.0, Double.NaN));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
    }

    @Test
    public void testEqualsIncludingNaNDouble() {
        assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equalsIncludingNaN(1.0, 1.0));
        assertFalse(MathUtils.equalsIncludingNaN(1.0, 2.0));
    }

    @Test
    public void testEqualsWithEpsilon() {
        assertTrue(MathUtils.equals(1.0, 1.05, 0.1));
        assertFalse(MathUtils.equals(1.0, 1.15, 0.1));
        assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN, 0.1));
        assertTrue(MathUtils.equalsIncludingNaN(1.0, 1.05, 0.1));
        assertFalse(MathUtils.equalsIncludingNaN(1.0, 1.15, 0.1));
    }

    @Test
    public void testEqualsWithUlps() {
        assertTrue(MathUtils.equals(1.0, Math.nextUp(1.0), 1));
        assertFalse(MathUtils.equals(1.0, 2.0, 1));
        assertFalse(MathUtils.equals(1.0, Double.NaN, 1));
        assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN, 1));
        assertTrue(MathUtils.equals(-1.0, -1.0, 1));
    }

    @Test
    public void testEqualsArray() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 2.0}));
        assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));

        // equalsIncludingNaN array
        assertTrue(MathUtils.equalsIncludingNaN((double[]) null, (double[]) null));
        assertFalse(MathUtils.equalsIncludingNaN(new double[]{1.0}, null));
        assertFalse(MathUtils.equalsIncludingNaN(null, new double[]{1.0}));
        assertFalse(MathUtils.equalsIncludingNaN(new double[]{1.0}, new double[]{1.0, 2.0}));
        assertTrue(MathUtils.equalsIncludingNaN(new double[]{Double.NaN}, new double[]{Double.NaN}));
        assertFalse(MathUtils.equalsIncludingNaN(new double[]{1.0}, new double[]{Double.NaN}));
    }

    @Test
    public void testCompareTo() {
        assertEquals(0, MathUtils.compareTo(1.0, 1.05, 0.1));
        assertEquals(-1, MathUtils.compareTo(1.0, 1.2, 0.1));
        assertEquals(1, MathUtils.compareTo(1.2, 1.0, 0.1));
    }

    // =========================================================================
    // 5. Rounding & Indicator/Sign Tests
    // =========================================================================

    @Test
    public void testRoundDouble() {
        assertEquals(1.23, MathUtils.round(1.234, 2), EPSILON);
        assertEquals(1.24, MathUtils.round(1.235, 2), EPSILON);
        assertEquals(Double.NaN, MathUtils.round(Double.NaN, 2), EPSILON);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), EPSILON);

        // Rounding modes
        assertEquals(1.3, MathUtils.round(1.21, 1, BigDecimal.ROUND_UP), EPSILON);
        assertEquals(1.2, MathUtils.round(1.29, 1, BigDecimal.ROUND_DOWN), EPSILON);
        assertEquals(1.3, MathUtils.round(1.21, 1, BigDecimal.ROUND_CEILING), EPSILON);
        assertEquals(-1.2, MathUtils.round(-1.21, 1, BigDecimal.ROUND_CEILING), EPSILON);
        assertEquals(1.2, MathUtils.round(1.29, 1, BigDecimal.ROUND_FLOOR), EPSILON);
        assertEquals(-1.3, MathUtils.round(-1.21, 1, BigDecimal.ROUND_FLOOR), EPSILON);
        assertEquals(1.2, MathUtils.round(1.25, 1, BigDecimal.ROUND_HALF_DOWN), EPSILON);
        assertEquals(1.3, MathUtils.round(1.26, 1, BigDecimal.ROUND_HALF_DOWN), EPSILON);
        assertEquals(1.2, MathUtils.round(1.25, 1, BigDecimal.ROUND_HALF_EVEN), EPSILON);
        assertEquals(1.4, MathUtils.round(1.35, 1, BigDecimal.ROUND_HALF_EVEN), EPSILON);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundUnnecessaryException() {
        MathUtils.round(1.234, 2, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundInvalidMethod() {
        MathUtils.round(1.234, 2, -999);
    }

    @Test
    public void testRoundFloat() {
        assertEquals(1.23f, MathUtils.round(1.234f, 2), 1e-5f);
        assertEquals(1.3f, MathUtils.round(1.21f, 1, BigDecimal.ROUND_UP), 1e-5f);
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

        assertEquals(1.0f, MathUtils.indicator(5.0f), EPSILON);
        assertEquals(1.0f, MathUtils.indicator(0.0f), EPSILON);
        assertEquals(-1.0f, MathUtils.indicator(-5.0f), EPSILON);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));

        assertEquals(1.0, MathUtils.indicator(5.0), EPSILON);
        assertEquals(1.0, MathUtils.indicator(0.0), EPSILON);
        assertEquals(-1.0, MathUtils.indicator(-5.0), EPSILON);
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

        assertEquals(1.0f, MathUtils.sign(5.0f), EPSILON);
        assertEquals(0.0f, MathUtils.sign(0.0f), EPSILON);
        assertEquals(-1.0f, MathUtils.sign(-5.0f), EPSILON);
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));

        assertEquals(1.0, MathUtils.sign(5.0), EPSILON);
        assertEquals(0.0, MathUtils.sign(0.0), EPSILON);
        assertEquals(-1.0, MathUtils.sign(-5.0), EPSILON);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }

    // =========================================================================
    // 6. Pow Tests (int, long, BigInteger)
    // =========================================================================

    @Test
    public void testPow() {
        assertEquals(8, MathUtils.pow(2, 3));
        assertEquals(1, MathUtils.pow(2, 0));
        assertEquals(8L, MathUtils.pow(2L, 3));
        assertEquals(8L, MathUtils.pow(2L, 3L));
        assertEquals(8, MathUtils.pow(2, 3L));

        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), 3));
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), 3L));
        assertEquals(BigInteger.valueOf(8), MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(3)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowNegativeIntInt() {
        MathUtils.pow(2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowNegativeIntLong() {
        MathUtils.pow(2, -1L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowNegativeLongInt() {
        MathUtils.pow(2L, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowNegativeLongLong() {
        MathUtils.pow(2L, -1L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowNegativeBigIntegerInt() {
        MathUtils.pow(BigInteger.valueOf(2), -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowNegativeBigIntegerLong() {
        MathUtils.pow(BigInteger.valueOf(2), -1L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowNegativeBigIntegerBigInteger() {
        MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(-1));
    }

    // =========================================================================
    // 7. Array, Distance & CheckOrder Tests
    // =========================================================================

    @Test
    public void testDistances() {
        double[] p1 = new double[]{1.0, 2.0};
        double[] p2 = new double[]{4.0, 6.0};
        assertEquals(7.0, MathUtils.distance1(p1, p2), EPSILON);
        assertEquals(5.0, MathUtils.distance(p1, p2), EPSILON);
        assertEquals(4.0, MathUtils.distanceInf(p1, p2), EPSILON);

        int[] ip1 = new int[]{1, 2};
        int[] ip2 = new int[]{4, 6};
        assertEquals(7, MathUtils.distance1(ip1, ip2));
        assertEquals(5.0, MathUtils.distance(ip1, ip2), EPSILON);
        assertEquals(4, MathUtils.distanceInf(ip1, ip2));
    }

    @Test
    public void testCheckOrder() {
        MathUtils.checkOrder(new double[]{1.0, 2.0, 3.0});
        MathUtils.checkOrder(new double[]{1.0, 2.0, 3.0}, MathUtils.OrderDirection.INCREASING, true);
        MathUtils.checkOrder(new double[]{1.0, 2.0, 2.0}, MathUtils.OrderDirection.INCREASING, false);
        MathUtils.checkOrder(new double[]{3.0, 2.0, 1.0}, MathUtils.OrderDirection.DECREASING, true);
        MathUtils.checkOrder(new double[]{3.0, 2.0, 2.0}, MathUtils.OrderDirection.DECREASING, false);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderFailIncreasingStrict() {
        MathUtils.checkOrder(new double[]{1.0, 2.0, 2.0}, MathUtils.OrderDirection.INCREASING, true);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderFailIncreasingNonStrict() {
        MathUtils.checkOrder(new double[]{2.0, 1.0}, MathUtils.OrderDirection.INCREASING, false);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderFailDecreasingStrict() {
        MathUtils.checkOrder(new double[]{3.0, 2.0, 2.0}, MathUtils.OrderDirection.DECREASING, true);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrderFailDecreasingNonStrict() {
        MathUtils.checkOrder(new double[]{1.0, 2.0}, MathUtils.OrderDirection.DECREASING, false);
    }

    // =========================================================================
    // 8. Normalization & Special Math Functions
    // =========================================================================

    @Test
    public void testNormalizeArray() {
        double[] input = new double[]{1.0, 2.0, 3.0, Double.NaN};
        double[] expected = new double[]{5.0 / 6.0, 10.0 / 6.0, 15.0 / 6.0, Double.NaN};
        double[] actual = MathUtils.normalizeArray(input, 5.0);
        assertTrue(MathUtils.equalsIncludingNaN(expected, actual));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArrayInfiniteTarget() {
        MathUtils.normalizeArray(new double[]{1.0, 2.0}, Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArrayNaNTarget() {
        MathUtils.normalizeArray(new double[]{1.0, 2.0}, Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArrayInfiniteElement() {
        MathUtils.normalizeArray(new double[]{1.0, Double.POSITIVE_INFINITY}, 5.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArrayZeroSum() {
        MathUtils.normalizeArray(new double[]{1.0, -1.0}, 5.0);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(FastMath.PI * 4, 0.0), 1e-10);
        assertEquals(FastMath.PI, MathUtils.normalizeAngle(-FastMath.PI, FastMath.PI), 1e-10);
    }

    @Test
    public void testScalb() {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), EPSILON);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
        assertTrue(Double.isInfinite(MathUtils.scalb(Double.POSITIVE_INFINITY, 5)));
        assertEquals(8.0, MathUtils.scalb(2.0, 2), EPSILON);
    }

    @Test
    public void testCoshSinhLogHash() {
        assertEquals(1.0, MathUtils.cosh(0.0), EPSILON);
        assertEquals(0.0, MathUtils.sinh(0.0), EPSILON);
        assertEquals(2.0, MathUtils.log(2.0, 4.0), EPSILON);
        assertEquals(new Double(5.0).hashCode(), MathUtils.hash(5.0));
        assertEquals(java.util.Arrays.hashCode(new double[]{1.0, 2.0}), MathUtils.hash(new double[]{1.0, 2.0}));
    }

    @Test
    public void testSafeNorm() {
        // rdwarf ~ 3.834e-20, rgiant ~ 1.304e+19
        assertEquals(5.0, MathUtils.safeNorm(new double[]{3.0, 4.0}), EPSILON);
        assertEquals(0.0, MathUtils.safeNorm(new double[]{0.0, 0.0}), EPSILON);

        // Giant values triggering s1 path
        double giant = 1e20;
        assertEquals(giant * Math.sqrt(2.0), MathUtils.safeNorm(new double[]{giant, giant}), 1e5);

        // Dwarf values triggering s3 path
        double dwarf = 1e-25;
        assertEquals(dwarf * Math.sqrt(2.0), MathUtils.safeNorm(new double[]{dwarf, dwarf}), 1e-35);

        // Mixed normal + dwarf
        assertEquals(5.0, MathUtils.safeNorm(new double[]{3.0, 4.0, 1e-25}), EPSILON);
    }
}