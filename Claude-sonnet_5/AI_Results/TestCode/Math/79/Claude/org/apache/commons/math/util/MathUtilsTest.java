package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * JUnit 4 test suite for org.apache.commons.math.util.MathUtils (Math-79b)
 * มุ่งเน้น branch/condition coverage ให้มากที่สุดเท่าที่วิเคราะห์ได้จาก source
 */
public class MathUtilsTest {

    private static final double DELTA = 1e-9;

    // ------------------------------------------------------------------
    // addAndCheck(int,int)
    // ------------------------------------------------------------------
    @Test
    public void testAddAndCheckInt_normal() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckInt_overflow() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    // ------------------------------------------------------------------
    // addAndCheck(long,long) -> private addAndCheck(a,b,msg)
    // ------------------------------------------------------------------
    @Test
    public void testAddAndCheckLong_swapBranch() {
        // a > b => recursive swap branch
        assertEquals(8L, MathUtils.addAndCheck(5L, 3L));
    }

    @Test
    public void testAddAndCheckLong_bothNegative_ok() {
        assertEquals(-8L, MathUtils.addAndCheck(-3L, -5L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_bothNegative_overflow() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testAddAndCheckLong_oppositeSign() {
        assertEquals(5L, MathUtils.addAndCheck(-5L, 10L));
    }

    @Test
    public void testAddAndCheckLong_bothPositive_ok() {
        assertEquals(300L, MathUtils.addAndCheck(100L, 200L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_bothPositive_overflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    // ------------------------------------------------------------------
    // checkBinomial / binomialCoefficient
    // ------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_nLessThanK_throws() {
        MathUtils.binomialCoefficient(3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_nNegative_throws() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test
    public void testBinomialCoefficient_nEqualsK() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
    }

    @Test
    public void testBinomialCoefficient_kZero() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
    }

    @Test
    public void testBinomialCoefficient_kOne() {
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
    }

    @Test
    public void testBinomialCoefficient_kEqualsNMinus1() {
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
    }

    @Test
    public void testBinomialCoefficient_symmetryLargeK() {
        // n=6,k=4 -> k>n/2 => symmetry to (6,2)=15
        assertEquals(15L, MathUtils.binomialCoefficient(6, 4));
    }

    @Test
    public void testBinomialCoefficient_nLE61() {
        assertEquals(120L, MathUtils.binomialCoefficient(10, 3));
    }

    @Test
    public void testBinomialCoefficient_n62to66() {
        assertEquals(2016L, MathUtils.binomialCoefficient(64, 2));
    }

    @Test
    public void testBinomialCoefficient_nGreater66() {
        assertEquals(2415L, MathUtils.binomialCoefficient(70, 2));
    }

    // ------------------------------------------------------------------
    // binomialCoefficientDouble
    // ------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientDouble_nLessThanK_throws() {
        MathUtils.binomialCoefficientDouble(3, 5);
    }

    @Test
    public void testBinomialCoefficientDouble_nEqualsK() {
        assertEquals(1d, MathUtils.binomialCoefficientDouble(5, 5), DELTA);
    }

    @Test
    public void testBinomialCoefficientDouble_kZero() {
        assertEquals(1d, MathUtils.binomialCoefficientDouble(5, 0), DELTA);
    }

    @Test
    public void testBinomialCoefficientDouble_kOneOrNMinus1() {
        assertEquals(5d, MathUtils.binomialCoefficientDouble(5, 1), DELTA);
        assertEquals(5d, MathUtils.binomialCoefficientDouble(5, 4), DELTA);
    }

    @Test
    public void testBinomialCoefficientDouble_symmetry() {
        assertEquals(15d, MathUtils.binomialCoefficientDouble(6, 4), DELTA);
    }

    @Test
    public void testBinomialCoefficientDouble_nLess67() {
        assertEquals(120d, MathUtils.binomialCoefficientDouble(10, 3), DELTA);
    }

    @Test
    public void testBinomialCoefficientDouble_nGE67_loop() {
        assertEquals(2415d, MathUtils.binomialCoefficientDouble(70, 2), DELTA);
    }

    // ------------------------------------------------------------------
    // binomialCoefficientLog
    // ------------------------------------------------------------------
    @Test
    public void testBinomialCoefficientLog_nEqualsKOrKZero() {
        assertEquals(0d, MathUtils.binomialCoefficientLog(5, 5), DELTA);
        assertEquals(0d, MathUtils.binomialCoefficientLog(5, 0), DELTA);
    }

    @Test
    public void testBinomialCoefficientLog_kOne() {
        assertEquals(Math.log(5), MathUtils.binomialCoefficientLog(5, 1), DELTA);
    }

    @Test
    public void testBinomialCoefficientLog_nLess67() {
        assertEquals(Math.log(120), MathUtils.binomialCoefficientLog(10, 3), DELTA);
    }

    @Test
    public void testBinomialCoefficientLog_nLess1030() {
        assertEquals(Math.log(161700d), MathUtils.binomialCoefficientLog(100, 3), 1e-6);
    }

    @Test
    public void testBinomialCoefficientLog_largeN_symmetryBranch() {
        // k > n/2 branch (n>=1030)
        double v = MathUtils.binomialCoefficientLog(1200, 700);
        assertTrue(Double.isFinite(v) && v > 0);
    }

    @Test
    public void testBinomialCoefficientLog_largeN_sumLoopBranch() {
        // direct sum-of-logs branch (n>=1030, k<=n/2)
        double v = MathUtils.binomialCoefficientLog(1200, 400);
        assertTrue(Double.isFinite(v) && v > 0);
    }

    // ------------------------------------------------------------------
    // compareTo
    // ------------------------------------------------------------------
    @Test
    public void testCompareTo_equalsBranch() {
        assertEquals(0, MathUtils.compareTo(1.0, 1.00000001, 0.001));
    }

    @Test
    public void testCompareTo_lessBranch() {
        assertEquals(-1, MathUtils.compareTo(1.0, 5.0, 0.0));
    }

    @Test
    public void testCompareTo_greaterBranch() {
        assertEquals(1, MathUtils.compareTo(5.0, 1.0, 0.0));
    }

    // ------------------------------------------------------------------
    // cosh / sinh
    // ------------------------------------------------------------------
    @Test
    public void testCosh() {
        assertEquals(1.0, MathUtils.cosh(0.0), DELTA);
    }

    @Test
    public void testSinh() {
        assertEquals(0.0, MathUtils.sinh(0.0), DELTA);
    }

    // ------------------------------------------------------------------
    // equals(double,double)
    // ------------------------------------------------------------------
    @Test
    public void testEquals2_bothNaN() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
    }

    @Test
    public void testEquals2_equalValues() {
        assertTrue(MathUtils.equals(1.0, 1.0));
    }

    @Test
    public void testEquals2_notEqual() {
        assertFalse(MathUtils.equals(1.0, 2.0));
    }

    // ------------------------------------------------------------------
    // equals(double,double,double eps)
    // ------------------------------------------------------------------
    @Test
    public void testEquals3_exactEqualsBranch() {
        assertTrue(MathUtils.equals(1.0, 1.0, 0.0));
    }

    @Test
    public void testEquals3_withinEps() {
        assertTrue(MathUtils.equals(1.0, 1.0005, 0.001));
    }

    @Test
    public void testEquals3_outsideEps() {
        assertFalse(MathUtils.equals(1.0, 2.0, 0.001));
    }

    // ------------------------------------------------------------------
    // equals(double,double,int maxUlps)
    // ------------------------------------------------------------------
    @Test
    public void testEqualsUlps_zeroAndNegativeZero() {
        assertTrue(MathUtils.equals(0.0, -0.0, 1));
    }

    @Test
    public void testEqualsUlps_negativeValuesEqual() {
        assertTrue(MathUtils.equals(-1.0, -1.0, 1));
    }

    @Test
    public void testEqualsUlps_closeValuesTrue() {
        double x = 1.0;
        double y = Double.longBitsToDouble(Double.doubleToLongBits(x) + 1);
        assertTrue(MathUtils.equals(x, y, 1));
    }

    @Test
    public void testEqualsUlps_farValuesFalse() {
        double x = 1.0;
        double y = Double.longBitsToDouble(Double.doubleToLongBits(x) + 5);
        assertFalse(MathUtils.equals(x, y, 1));
    }

    // ------------------------------------------------------------------
    // equals(double[],double[])
    // ------------------------------------------------------------------
    @Test
    public void testEqualsArray_bothNull() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
    }

    @Test
    public void testEqualsArray_oneNull() {
        assertFalse(MathUtils.equals(new double[]{1.0}, (double[]) null));
        assertFalse(MathUtils.equals((double[]) null, new double[]{1.0}));
    }

    @Test
    public void testEqualsArray_differentLength() {
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
    }

    @Test
    public void testEqualsArray_equalIncludingNaN() {
        double[] a = {1.0, Double.NaN, 3.0};
        double[] b = {1.0, Double.NaN, 3.0};
        assertTrue(MathUtils.equals(a, b));
    }

    @Test
    public void testEqualsArray_notEqualElement() {
        double[] a = {1.0, 2.0};
        double[] b = {1.0, 3.0};
        assertFalse(MathUtils.equals(a, b));
    }

    // ------------------------------------------------------------------
    // factorial
    // ------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_negative_throws() {
        MathUtils.factorial(-1);
    }

    @Test
    public void testFactorial_zero() {
        assertEquals(1L, MathUtils.factorial(0));
    }

    @Test
    public void testFactorial_twenty() {
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorial_tooLarge_throws() {
        MathUtils.factorial(21);
    }

    // ------------------------------------------------------------------
    // factorialDouble
    // ------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDouble_negative_throws() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialDouble_lessThan21() {
        assertEquals(120d, MathUtils.factorialDouble(5), DELTA);
    }

    @Test
    public void testFactorialDouble_largeValue() {
        double v = MathUtils.factorialDouble(30);
        assertTrue(v > 0 && !Double.isNaN(v));
    }

    // ------------------------------------------------------------------
    // factorialLog
    // ------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLog_negative_throws() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testFactorialLog_lessThan21() {
        assertEquals(Math.log(120), MathUtils.factorialLog(5), DELTA);
    }

    @Test
    public void testFactorialLog_largeLoop() {
        double v = MathUtils.factorialLog(30);
        assertTrue(v > 0);
    }

    // ------------------------------------------------------------------
    // gcd
    // ------------------------------------------------------------------
    @Test
    public void testGcd_bothZero() {
        assertEquals(0, MathUtils.gcd(0, 0));
    }

    @Test
    public void testGcd_zeroAndNonzero() {
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(5, MathUtils.gcd(5, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_minValueWithZero_throws() {
        MathUtils.gcd(Integer.MIN_VALUE, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_zeroWithMinValue_throws() {
        MathUtils.gcd(0, Integer.MIN_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void testGcd_bothMinValue_k31_throws() {
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Test
    public void testGcd_bothOdd_noShift() {
        assertEquals(1, MathUtils.gcd(3, 5));
    }

    @Test
    public void testGcd_normalWithShift() {
        assertEquals(6, MathUtils.gcd(12, 18));
    }

    @Test
    public void testGcd_negativeInputs() {
        assertEquals(6, MathUtils.gcd(-12, 18));
    }

    // ------------------------------------------------------------------
    // hash
    // ------------------------------------------------------------------
    @Test
    public void testHashDouble() {
        assertEquals(new Double(2.5).hashCode(), MathUtils.hash(2.5));
    }

    @Test
    public void testHashDoubleArray() {
        double[] arr = {1.0, 2.0};
        assertEquals(java.util.Arrays.hashCode(arr), MathUtils.hash(arr));
    }

    @Test
    public void testHashDoubleArray_null() {
        assertEquals(java.util.Arrays.hashCode((double[]) null), MathUtils.hash((double[]) null));
    }

    // ------------------------------------------------------------------
    // indicator (byte/double/float/int/long/short)
    // ------------------------------------------------------------------
    @Test
    public void testIndicatorByte() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        assertEquals((byte) -1, MathUtils.indicator((byte) -5));
    }

    @Test
    public void testIndicatorDouble() {
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
        assertEquals(1.0, MathUtils.indicator(0.0), DELTA);
        assertEquals(1.0, MathUtils.indicator(3.0), DELTA);
        assertEquals(-1.0, MathUtils.indicator(-3.0), DELTA);
    }

    @Test
    public void testIndicatorFloat() {
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
        assertEquals(1.0f, MathUtils.indicator(0.0f), 1e-6f);
        assertEquals(-1.0f, MathUtils.indicator(-3.0f), 1e-6f);
    }

    @Test
    public void testIndicatorInt() {
        assertEquals(1, MathUtils.indicator(0));
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(-1, MathUtils.indicator(-5));
    }

    @Test
    public void testIndicatorLong() {
        assertEquals(1L, MathUtils.indicator(0L));
        assertEquals(-1L, MathUtils.indicator(-5L));
    }

    @Test
    public void testIndicatorShort() {
        assertEquals((short) 1, MathUtils.indicator((short) 0));
        assertEquals((short) -1, MathUtils.indicator((short) -1));
    }

    // ------------------------------------------------------------------
    // lcm
    // ------------------------------------------------------------------
    @Test
    public void testLcm_aZero() {
        assertEquals(0, MathUtils.lcm(0, 5));
    }

    @Test
    public void testLcm_bZero() {
        assertEquals(0, MathUtils.lcm(5, 0));
    }

    @Test
    public void testLcm_normal() {
        assertEquals(12, MathUtils.lcm(4, 6));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcm_overflow_throws() {
        MathUtils.lcm(Integer.MIN_VALUE, 2);
    }

    // ------------------------------------------------------------------
    // log(base,x)
    // ------------------------------------------------------------------
    @Test
    public void testLog() {
        assertEquals(3.0, MathUtils.log(2.0, 8.0), DELTA);
    }

    // ------------------------------------------------------------------
    // mulAndCheck(int,int)
    // ------------------------------------------------------------------
    @Test
    public void testMulAndCheckInt_normal() {
        assertEquals(10000, MathUtils.mulAndCheck(100, 100));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckInt_overflow() {
        MathUtils.mulAndCheck(50000, 50000);
    }

    // ------------------------------------------------------------------
    // mulAndCheck(long,long)
    // ------------------------------------------------------------------
    @Test
    public void testMulAndCheckLong_swapBranch() {
        assertEquals(15L, MathUtils.mulAndCheck(5L, 3L));
    }

    @Test
    public void testMulAndCheckLong_bothNegative_ok() {
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_bothNegative_overflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE + 1, -2L);
    }

    @Test
    public void testMulAndCheckLong_negPos_ok() {
        assertEquals(-15L, MathUtils.mulAndCheck(-5L, 3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_negPos_overflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test
    public void testMulAndCheckLong_negZero() {
        assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
    }

    @Test
    public void testMulAndCheckLong_posPos_ok() {
        assertEquals(20000L, MathUtils.mulAndCheck(100L, 200L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_posPos_overflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test
    public void testMulAndCheckLong_aZero() {
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
    }

    // ------------------------------------------------------------------
    // nextAfter
    // ------------------------------------------------------------------
    @Test
    public void testNextAfter_NaN() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
    }

    @Test
    public void testNextAfter_Infinite() {
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
    }

    @Test
    public void testNextAfter_zero_directionNegative() {
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
    }

    @Test
    public void testNextAfter_zero_directionPositive() {
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
    }

    @Test
    public void testNextAfter_increaseMantissa() {
        double r = MathUtils.nextAfter(1.0, 2.0);
        assertTrue(r > 1.0);
    }

    @Test
    public void testNextAfter_increaseMantissaOverflowToInfinity() {
        double r = MathUtils.nextAfter(Double.MAX_VALUE, Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, r, 0.0);
    }

    @Test
    public void testNextAfter_decreaseMantissa() {
        double r = MathUtils.nextAfter(2.0, 1.0);
        assertTrue(r < 2.0);
    }

    @Test
    public void testNextAfter_decreaseMantissaZeroBoundary() {
        double r = MathUtils.nextAfter(Double.MIN_NORMAL, 0.0);
        assertTrue(r < Double.MIN_NORMAL);
    }

    // ------------------------------------------------------------------
    // scalb
    // ------------------------------------------------------------------
    @Test
    public void testScalb_zero() {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0);
    }

    @Test
    public void testScalb_NaN() {
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 2)));
    }

    @Test
    public void testScalb_Infinite() {
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.scalb(Double.POSITIVE_INFINITY, 2), 0.0);
    }

    @Test
    public void testScalb_normal() {
        assertEquals(2.0, MathUtils.scalb(1.0, 1), DELTA);
        assertEquals(0.5, MathUtils.scalb(1.0, -1), DELTA);
    }

    // ------------------------------------------------------------------
    // normalizeAngle
    // ------------------------------------------------------------------
    @Test
    public void testNormalizeAngle_noShift() {
        assertEquals(0.0, MathUtils.normalizeAngle(0.0, Math.PI), DELTA);
    }

    @Test
    public void testNormalizeAngle_shift() {
        assertEquals(-Math.PI, MathUtils.normalizeAngle(3 * Math.PI, 0.0), 1e-9);
    }

    // ------------------------------------------------------------------
    // normalizeArray
    // ------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArray_infiniteSum_throws() {
        MathUtils.normalizeArray(new double[]{1.0, 2.0}, Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArray_NaNSum_throws() {
        MathUtils.normalizeArray(new double[]{1.0, 2.0}, Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArray_infiniteElement_throws() {
        MathUtils.normalizeArray(new double[]{1.0, Double.POSITIVE_INFINITY}, 10.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArray_sumZero_throws() {
        MathUtils.normalizeArray(new double[]{1.0, -1.0}, 5.0);
    }

    @Test
    public void testNormalizeArray_withNaNIgnored() {
        double[] out = MathUtils.normalizeArray(new double[]{1.0, 2.0, Double.NaN}, 9.0);
        assertEquals(3.0, out[0], DELTA);
        assertEquals(6.0, out[1], DELTA);
        assertTrue(Double.isNaN(out[2]));
    }

    // ------------------------------------------------------------------
    // round(double,...)
    // ------------------------------------------------------------------
    @Test
    public void testRoundDouble_default() {
        assertEquals(3.0, MathUtils.round(2.5, 0), DELTA);
    }

    @Test
    public void testRoundDouble_NaN_returnsNaN() {
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2, BigDecimal.ROUND_HALF_UP)));
    }

    @Test
    public void testRoundDouble_Infinite_returnsSame() {
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.round(Double.POSITIVE_INFINITY, 2, BigDecimal.ROUND_HALF_UP), 0.0);
    }

    // ------------------------------------------------------------------
    // round(float,...) -> roundUnscaled branches
    // ------------------------------------------------------------------
    @Test
    public void testRoundFloat_default() {
        assertEquals(3.0f, MathUtils.round(2.5f, 0), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_CEILING_positive() {
        assertEquals(3.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_CEILING), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_CEILING_negative() {
        assertEquals(-2.0f, MathUtils.round(-2.5f, 0, BigDecimal.ROUND_CEILING), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_DOWN_positive() {
        assertEquals(2.0f, MathUtils.round(2.7f, 0, BigDecimal.ROUND_DOWN), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_DOWN_negative() {
        assertEquals(-2.0f, MathUtils.round(-2.7f, 0, BigDecimal.ROUND_DOWN), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_FLOOR_positive() {
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_FLOOR), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_FLOOR_negative() {
        assertEquals(-3.0f, MathUtils.round(-2.5f, 0, BigDecimal.ROUND_FLOOR), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_HALF_DOWN_atHalf() {
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_DOWN), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_HALF_DOWN_aboveHalf() {
        assertEquals(3.0f, MathUtils.round(2.6f, 0, BigDecimal.ROUND_HALF_DOWN), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_HALF_EVEN_evenCase() {
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_HALF_EVEN_oddCase() {
        assertEquals(4.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_HALF_EVEN_belowHalf() {
        assertEquals(2.0f, MathUtils.round(2.3f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_HALF_EVEN_aboveHalf() {
        assertEquals(3.0f, MathUtils.round(2.7f, 0, BigDecimal.ROUND_HALF_EVEN), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_HALF_UP_atOrAboveHalf() {
        assertEquals(3.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_UP), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_HALF_UP_belowHalf() {
        assertEquals(2.0f, MathUtils.round(2.4f, 0, BigDecimal.ROUND_HALF_UP), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_UNNECESSARY_exact() {
        assertEquals(3.0f, MathUtils.round(3.0f, 0, BigDecimal.ROUND_UNNECESSARY), 1e-6f);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundUnscaled_UNNECESSARY_inexact_throws() {
        MathUtils.round(3.5f, 0, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test
    public void testRoundUnscaled_UP_positive() {
        assertEquals(3.0f, MathUtils.round(2.1f, 0, BigDecimal.ROUND_UP), 1e-6f);
    }

    @Test
    public void testRoundUnscaled_UP_negative() {
        assertEquals(-3.0f, MathUtils.round(-2.1f, 0, BigDecimal.ROUND_UP), 1e-6f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundUnscaled_invalidMethod_throws() {
        MathUtils.round(2.1f, 0, 999);
    }

    // ------------------------------------------------------------------
    // sign (byte/double/float/int/long/short)
    // ------------------------------------------------------------------
    @Test
    public void testSignByte() {
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 5));
        assertEquals((byte) -1, MathUtils.sign((byte) -5));
    }

    @Test
    public void testSignDouble() {
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
        assertEquals(0.0, MathUtils.sign(0.0), 0.0);
        assertEquals(1.0, MathUtils.sign(5.0), 0.0);
        assertEquals(-1.0, MathUtils.sign(-5.0), 0.0);
    }

    @Test
    public void testSignFloat() {
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
        assertEquals(0.0f, MathUtils.sign(0.0f), 0.0f);
        assertEquals(1.0f, MathUtils.sign(5.0f), 0.0f);
        assertEquals(-1.0f, MathUtils.sign(-5.0f), 0.0f);
    }

    @Test
    public void testSignInt() {
        assertEquals(0, MathUtils.sign(0));
        assertEquals(1, MathUtils.sign(5));
        assertEquals(-1, MathUtils.sign(-5));
    }

    @Test
    public void testSignLong() {
        assertEquals(0L, MathUtils.sign(0L));
        assertEquals(1L, MathUtils.sign(5L));
        assertEquals(-1L, MathUtils.sign(-5L));
    }

    @Test
    public void testSignShort() {
        assertEquals((short) 0, MathUtils.sign((short) 0));
        assertEquals((short) 1, MathUtils.sign((short) 5));
        assertEquals((short) -1, MathUtils.sign((short) -5));
    }

    // ------------------------------------------------------------------
    // subAndCheck(int,int)
    // ------------------------------------------------------------------
    @Test
    public void testSubAndCheckInt_normal() {
        assertEquals(2, MathUtils.subAndCheck(5, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckInt_overflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    // ------------------------------------------------------------------
    // subAndCheck(long,long)
    // ------------------------------------------------------------------
    @Test
    public void testSubAndCheckLong_bMin_aNegative_ok() {
        long r = MathUtils.subAndCheck(-5L, Long.MIN_VALUE);
        assertEquals(-5L - Long.MIN_VALUE, r);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_bMin_aNonNegative_throws() {
        MathUtils.subAndCheck(5L, Long.MIN_VALUE);
    }

    @Test
    public void testSubAndCheckLong_normal() {
        assertEquals(7L, MathUtils.subAndCheck(10L, 3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_overflow_viaAddAndCheck() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }

    // ------------------------------------------------------------------
    // pow overloads
    // ------------------------------------------------------------------
    @Test
    public void testPowIntInt_normal() {
        assertEquals(1024, MathUtils.pow(2, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowIntInt_negativeExp_throws() {
        MathUtils.pow(2, -1);
    }

    @Test
    public void testPowIntLong_normal() {
        assertEquals(1024, MathUtils.pow(2, 10L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowIntLong_negativeExp_throws() {
        MathUtils.pow(2, -1L);
    }

    @Test
    public void testPowLongInt_normal() {
        assertEquals(1024L, MathUtils.pow(2L, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowLongInt_negativeExp_throws() {
        MathUtils.pow(2L, -1);
    }

    @Test
    public void testPowLongLong_normal() {
        assertEquals(1024L, MathUtils.pow(2L, 10L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowLongLong_negativeExp_throws() {
        MathUtils.pow(2L, -1L);
    }

    @Test
    public void testPowBigIntegerInt_normal() {
        assertEquals(BigInteger.valueOf(1024), MathUtils.pow(BigInteger.valueOf(2), 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerInt_negativeExp_throws() {
        MathUtils.pow(BigInteger.valueOf(2), -1);
    }

    @Test
    public void testPowBigIntegerLong_normal() {
        assertEquals(BigInteger.valueOf(1024), MathUtils.pow(BigInteger.valueOf(2), 10L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerLong_negativeExp_throws() {
        MathUtils.pow(BigInteger.valueOf(2), -1L);
    }

    @Test
    public void testPowBigIntegerBigInteger_normal() {
        assertEquals(BigInteger.valueOf(1024),
                MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(10)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerBigInteger_negativeExp_throws() {
        MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(-1));
    }

    // ------------------------------------------------------------------
    // distance* methods
    // ------------------------------------------------------------------
    @Test
    public void testDistance1Double() {
        double[] p1 = {0, 0};
        double[] p2 = {3, -4};
        assertEquals(7.0, MathUtils.distance1(p1, p2), DELTA);
    }

    @Test
    public void testDistance1Int() {
        int[] p1 = {0, 0};
        int[] p2 = {3, -4};
        assertEquals(7, MathUtils.distance1(p1, p2));
    }

    @Test
    public void testDistanceDouble() {
        double[] p1 = {0, 0};
        double[] p2 = {3, 4};
        assertEquals(5.0, MathUtils.distance(p1, p2), DELTA);
    }

    @Test
    public void testDistanceInt() {
        int[] p1 = {0, 0};
        int[] p2 = {3, 4};
        assertEquals(5.0, MathUtils.distance(p1, p2), DELTA);
    }

    @Test
    public void testDistanceInfDouble() {
        double[] p1 = {0, 0};
        double[] p2 = {3, -4};
        assertEquals(4.0, MathUtils.distanceInf(p1, p2), DELTA);
    }

    @Test
    public void testDistanceInfInt() {
        int[] p1 = {0, 0};
        int[] p2 = {3, -4};
        assertEquals(4, MathUtils.distanceInf(p1, p2));
    }
}
