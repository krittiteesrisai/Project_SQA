package org.apache.commons.math.util;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class MathUtilsTest {

    private static final double EPSILON = 1e-12;

    // --- addAndCheck Tests ---

    @Test
    public void testAddAndCheckInt() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
        assertEquals(-5, MathUtils.addAndCheck(-2, -3));
        assertEquals(1, MathUtils.addAndCheck(-2, 3));
        assertEquals(Integer.MAX_VALUE, MathUtils.addAndCheck(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, MathUtils.addAndCheck(Integer.MIN_VALUE, 0));
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
    public void testAddAndCheckLong() {
        assertEquals(5L, MathUtils.addAndCheck(2L, 3L));
        assertEquals(5L, MathUtils.addAndCheck(3L, 2L)); // symmetry a > b
        assertEquals(-5L, MathUtils.addAndCheck(-2L, -3L));
        assertEquals(-5L, MathUtils.addAndCheck(-3L, -2L));
        assertEquals(1L, MathUtils.addAndCheck(-2L, 3L));
        assertEquals(1L, MathUtils.addAndCheck(3L, -2L));
        assertEquals(Long.MAX_VALUE, MathUtils.addAndCheck(Long.MAX_VALUE, 0L));
        assertEquals(Long.MIN_VALUE, MathUtils.addAndCheck(Long.MIN_VALUE, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflowPositive() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongOverflowNegative() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    // --- subAndCheck Tests ---

    @Test
    public void testSubAndCheckInt() {
        assertEquals(-1, MathUtils.subAndCheck(2, 3));
        assertEquals(1, MathUtils.subAndCheck(3, 2));
        assertEquals(Integer.MAX_VALUE, MathUtils.subAndCheck(Integer.MAX_VALUE, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflowPositive() {
        MathUtils.subAndCheck(Integer.MAX_VALUE, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflowNegative() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    @Test
    public void testSubAndCheckLong() {
        assertEquals(1L, MathUtils.subAndCheck(3L, 2L));
        assertEquals(-1L, MathUtils.subAndCheck(2L, 3L));
        assertEquals(-1L, MathUtils.subAndCheck(-1L - Long.MIN_VALUE, Long.MIN_VALUE));
        assertEquals(-1L, MathUtils.subAndCheck(-2L, -1L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongMinValOverflow() {
        MathUtils.subAndCheck(0L, Long.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongOverflow() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }

    // --- mulAndCheck Tests ---

    @Test
    public void testMulAndCheckInt() {
        assertEquals(6, MathUtils.mulAndCheck(2, 3));
        assertEquals(-6, MathUtils.mulAndCheck(2, -3));
        assertEquals(0, MathUtils.mulAndCheck(0, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    @Test
    public void testMulAndCheckLong() {
        assertEquals(6L, MathUtils.mulAndCheck(2L, 3L));
        assertEquals(6L, MathUtils.mulAndCheck(3L, 2L)); // symmetry a > b
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
        assertEquals(0L, MathUtils.mulAndCheck(5L, 0L));
        assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
        assertEquals(-6L, MathUtils.mulAndCheck(-2L, 3L));
        assertEquals(-6L, MathUtils.mulAndCheck(3L, -2L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflowPosPos() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflowNegNeg() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongOverflowNegPos() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    // --- gcd & lcm Tests ---

    @Test
    public void testGcd() {
        assertEquals(6, MathUtils.gcd(12, 18));
        assertEquals(6, MathUtils.gcd(-12, 18));
        assertEquals(6, MathUtils.gcd(12, -18));
        assertEquals(6, MathUtils.gcd(-12, -18));
        assertEquals(12, MathUtils.gcd(12, 0));
        assertEquals(18, MathUtils.gcd(0, 18));
        assertEquals(0, MathUtils.gcd(0, 0));
        assertEquals(1, MathUtils.gcd(17, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdOverflow() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }

    @Test
    public void testLcm() {
        assertEquals(36, MathUtils.lcm(12, 18));
        assertEquals(36, MathUtils.lcm(-12, 18));
        assertEquals(0, MathUtils.lcm(0, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmOverflow() {
        MathUtils.lcm(Integer.MAX_VALUE, 2);
    }

    // --- binomialCoefficient Tests ---

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
    public void testBinomialCoefficientKLargerThanN() {
        MathUtils.binomialCoefficient(4, 5);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficientOverflow() {
        MathUtils.binomialCoefficient(67, 30);
    }

    @Test
    public void testBinomialCoefficientDoubleAndLog() {
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 0), EPSILON);
        assertEquals(1.0, MathUtils.binomialCoefficientDouble(5, 5), EPSILON);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 1), EPSILON);
        assertEquals(5.0, MathUtils.binomialCoefficientDouble(5, 4), EPSILON);
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), EPSILON);

        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), EPSILON);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), EPSILON);
        assertTrue(MathUtils.binomialCoefficientLog(10, 5) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDoubleInvalid() {
        MathUtils.binomialCoefficientDouble(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLogNegativeN() {
        MathUtils.binomialCoefficientLog(-1, 0);
    }

    // --- factorial Tests ---

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
    public void testFactorialDoubleAndLog() {
        assertEquals(1.0, MathUtils.factorialDouble(0), EPSILON);
        assertEquals(120.0, MathUtils.factorialDouble(5), EPSILON);
        assertTrue(MathUtils.factorialDouble(25) > 0);

        assertEquals(0.0, MathUtils.factorialLog(0), EPSILON);
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), EPSILON);
        assertTrue(MathUtils.factorialLog(25) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDoubleNegative() {
        MathUtils.factorialDouble(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }

    // --- equals Tests ---

    @Test
    public void testEqualsDouble() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
        assertTrue(MathUtils.equals(1.0, 1.0));
        assertFalse(MathUtils.equals(1.0, 2.0));
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
        assertFalse(MathUtils.equals(1.0, Double.NaN));
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

    // --- sign & indicator Tests ---

    @Test
    public void testIndicators() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        assertEquals((byte) -1, MathUtils.indicator((byte) -5));

        assertEquals((short) 1, MathUtils.indicator((short) 0));
        assertEquals((short) 1, MathUtils.indicator((short) 5));
        assertEquals((short) -1, MathUtils.indicator((short) -5));

        assertEquals(1, MathUtils.indicator(0));
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(-1, MathUtils.indicator(-5));

        assertEquals(1L, MathUtils.indicator(0L));
        assertEquals(1L, MathUtils.indicator(5L));
        assertEquals(-1L, MathUtils.indicator(-5L));

        assertEquals(1.0f, MathUtils.indicator(0.0f), EPSILON);
        assertEquals(1.0f, MathUtils.indicator(5.0f), EPSILON);
        assertEquals(-1.0f, MathUtils.indicator(-5.0f), EPSILON);
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));

        assertEquals(1.0, MathUtils.indicator(0.0), EPSILON);
        assertEquals(1.0, MathUtils.indicator(5.0), EPSILON);
        assertEquals(-1.0, MathUtils.indicator(-5.0), EPSILON);
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }

    @Test
    public void testSigns() {
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 5));
        assertEquals((byte) -1, MathUtils.sign((byte) -5));

        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) 1, MathUtils.sign((short) 5));
        assertEquals((short) -1, MathUtils.sign((short) -5));

        assertEquals(0, MathUtils.sign(0));
        assertEquals(1, MathUtils.sign(5));
        assertEquals(-1, MathUtils.sign(-5));

        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(1L, MathUtils.sign(5L));
        assertEquals(-1L, MathUtils.sign(-5L));

        assertEquals(0.0f, MathUtils.sign(0.0f), EPSILON);
        assertEquals(1.0f, MathUtils.sign(5.0f), EPSILON);
        assertEquals(-1.0f, MathUtils.sign(-5.0f), EPSILON);
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));

        assertEquals(0.0, MathUtils.sign(0.0), EPSILON);
        assertEquals(1.0, MathUtils.sign(5.0), EPSILON);
        assertEquals(-1.0, MathUtils.sign(-5.0), EPSILON);
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }

    // --- Rounding Tests ---

    @Test
    public void testRoundDouble() {
        assertEquals(1.23, MathUtils.round(1.2345, 2), EPSILON);
        assertEquals(1.24, MathUtils.round(1.2355, 2), EPSILON);
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.round(Double.POSITIVE_INFINITY, 2), EPSILON);
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2)));
    }

    @Test
    public void testRoundFloatModes() {
        assertEquals(1.24f, MathUtils.round(1.234f, 2, BigDecimal.ROUND_CEILING), EPSILON);
        assertEquals(-1.23f, MathUtils.round(-1.234f, 2, BigDecimal.ROUND_CEILING), EPSILON);

        assertEquals(1.23f, MathUtils.round(1.239f, 2, BigDecimal.ROUND_DOWN), EPSILON);

        assertEquals(1.23f, MathUtils.round(1.239f, 2, BigDecimal.ROUND_FLOOR), EPSILON);
        assertEquals(-1.24f, MathUtils.round(-1.231f, 2, BigDecimal.ROUND_FLOOR), EPSILON);

        assertEquals(1.23f, MathUtils.round(1.235f, 2, BigDecimal.ROUND_HALF_DOWN), EPSILON);
        assertEquals(1.24f, MathUtils.round(1.236f, 2, BigDecimal.ROUND_HALF_DOWN), EPSILON);

        assertEquals(1.24f, MathUtils.round(1.235f, 2, BigDecimal.ROUND_HALF_EVEN), EPSILON); // 3 is odd -> ceil
        assertEquals(1.24f, MathUtils.round(1.245f, 2, BigDecimal.ROUND_HALF_EVEN), EPSILON); // 4 is even -> floor
        assertEquals(1.24f, MathUtils.round(1.236f, 2, BigDecimal.ROUND_HALF_EVEN), EPSILON);
        assertEquals(1.23f, MathUtils.round(1.234f, 2, BigDecimal.ROUND_HALF_EVEN), EPSILON);

        assertEquals(1.24f, MathUtils.round(1.235f, 2, BigDecimal.ROUND_HALF_UP), EPSILON);
        assertEquals(1.23f, MathUtils.round(1.234f, 2, BigDecimal.ROUND_HALF_UP), EPSILON);

        assertEquals(1.24f, MathUtils.round(1.231f, 2, BigDecimal.ROUND_UP), EPSILON);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundUnnecessaryException() {
        MathUtils.round(1.234f, 2, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundInvalidMode() {
        MathUtils.round(1.234f, 2, -99);
    }

    // --- Miscellaneous Math Functions Tests ---

    @Test
    public void testNextAfter() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.nextAfter(Double.POSITIVE_INFINITY, 1.0), EPSILON);
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);

        double nextUp = MathUtils.nextAfter(1.0, 2.0);
        assertTrue(nextUp > 1.0);
        double nextDown = MathUtils.nextAfter(1.0, 0.0);
        assertTrue(nextDown < 1.0);
    }

    @Test
    public void testScalb() {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0);
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 5), 0.0);
        assertEquals(8.0, MathUtils.scalb(2.0, 2), EPSILON);
    }

    @Test
    public void testNormalizeAngle() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, 0.0), EPSILON);
        assertEquals(0.0, MathUtils.normalizeAngle(2 * Math.PI, 0.0), EPSILON);
        assertEquals(Math.PI, MathUtils.normalizeAngle(3 * Math.PI, Math.PI), EPSILON);
    }

    @Test
    public void testHyperbolicFunctions() {
        assertEquals(1.0, MathUtils.cosh(0.0), EPSILON);
        assertEquals(0.0, MathUtils.sinh(0.0), EPSILON);
    }

    @Test
    public void testLog() {
        assertEquals(2.0, MathUtils.log(10.0, 100.0), EPSILON);
    }

    @Test
    public void testHash() {
        assertEquals(new Double(1.234).hashCode(), MathUtils.hash(1.234));
        assertEquals(java.util.Arrays.hashCode(new double[]{1.0, 2.0}), MathUtils.hash(new double[]{1.0, 2.0}));
        assertEquals(0, MathUtils.hash((double[]) null));
    }
}