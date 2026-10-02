package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;

public class MathUtilsTest {

    private static final double DELTA = 1e-12;
    private static final float  FDELTA = 1e-6f;

    // ---------------- addAndCheck(int,int) ----------------
    @Test
    public void testAddAndCheckIntNormal() {
        assertEquals(7, MathUtils.addAndCheck(3, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckIntOverflow() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    // ---------------- addAndCheck(long,long) -> private addAndCheck(a,b,msg) ----------------
    @Test
    public void testAddAndCheckLongSwap() {
        // a > b -> symmetry swap branch
        assertEquals(8L, MathUtils.addAndCheck(5L, 3L));
    }

    @Test
    public void testAddAndCheckLongBothNegativeNoOverflow() {
        assertEquals(-7L, MathUtils.addAndCheck(-3L, -4L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongBothNegativeOverflow() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testAddAndCheckLongOppositeSign() {
        assertEquals(2L, MathUtils.addAndCheck(-3L, 5L));
    }

    @Test
    public void testAddAndCheckLongBothPositiveNoOverflow() {
        assertEquals(7L, MathUtils.addAndCheck(3L, 4L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLongBothPositiveOverflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    // ---------------- binomialCoefficient ----------------
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNLessThanK() {
        MathUtils.binomialCoefficient(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientNegativeN() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    @Test
    public void testBinomialCoefficientKZero() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
    }

    @Test
    public void testBinomialCoefficientNEqualsK() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
    }

    @Test
    public void testBinomialCoefficientKOne() {
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
    }

    @Test
    public void testBinomialCoefficientKEqualsNMinusOne() {
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
    }

    @Test
    public void testBinomialCoefficientGeneral() {
        assertEquals(120L, MathUtils.binomialCoefficient(10, 3));
    }

    // ---------------- binomialCoefficientDouble (เรียกผ่าน path เดียวกับ log) ----------------
    @Test
    public void testBinomialCoefficientDouble() {
        assertEquals(120.0, MathUtils.binomialCoefficientDouble(10, 3), DELTA);
    }

    // ---------------- binomialCoefficientLog ----------------
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLogNLessThanK() {
        MathUtils.binomialCoefficientLog(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLogNegativeN() {
        MathUtils.binomialCoefficientLog(-1, 0);
    }

    @Test
    public void testBinomialCoefficientLogKZero() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), DELTA);
    }

    @Test
    public void testBinomialCoefficientLogNEqualsK() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), DELTA);
    }

    @Test
    public void testBinomialCoefficientLogKOne() {
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), DELTA);
    }

    @Test
    public void testBinomialCoefficientLogKEqualsNMinusOne() {
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 4), DELTA);
    }

    @Test
    public void testBinomialCoefficientLogGeneral() {
        assertEquals(Math.log(120.0), MathUtils.binomialCoefficientLog(10, 3), DELTA);
    }

    // ---------------- cosh / sinh ----------------
    @Test
    public void testCoshZero() {
        assertEquals(1.0, MathUtils.cosh(0.0), DELTA);
    }

    @Test
    public void testCoshNormal() {
        assertEquals((Math.exp(2) + Math.exp(-2)) / 2.0, MathUtils.cosh(2.0), DELTA);
    }

    @Test
    public void testSinhZero() {
        assertEquals(0.0, MathUtils.sinh(0.0), DELTA);
    }

    @Test
    public void testSinhNormal() {
        assertEquals((Math.exp(2) - Math.exp(-2)) / 2.0, MathUtils.sinh(2.0), DELTA);
    }

    // ---------------- equals(double,double) ----------------
    @Test
    public void testEqualsBothNaN() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
    }

    @Test
    public void testEqualsOneNaN() {
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
    }

    @Test
    public void testEqualsEqualValues() {
        assertTrue(MathUtils.equals(1.5, 1.5));
    }

    @Test
    public void testEqualsDifferentValues() {
        assertFalse(MathUtils.equals(1.5, 2.5));
    }

    // ---------------- equals(double[],double[]) ----------------
    @Test
    public void testEqualsArrayBothNull() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
    }

    @Test
    public void testEqualsArrayOneNull() {
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
    }

    @Test
    public void testEqualsArrayDifferentLength() {
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
    }

    @Test
    public void testEqualsArraySameContent() {
        assertTrue(MathUtils.equals(new double[]{1.0, 2.0, Double.NaN},
                                     new double[]{1.0, 2.0, Double.NaN}));
    }

    @Test
    public void testEqualsArrayDifferentContent() {
        assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    @Test
    public void testEqualsArrayEmpty() {
        assertTrue(MathUtils.equals(new double[0], new double[0]));
    }

    // ---------------- factorial / factorialDouble / factorialLog ----------------
    @Test
    public void testFactorialZero() {
        assertEquals(1L, MathUtils.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1L, MathUtils.factorial(1));
    }

    @Test
    public void testFactorialBoundaryTwenty() {
        // ขอบเขตบนสุดของ array factorials (index 0..20)
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        MathUtils.factorial(-1);
    }

    @Test
    public void testFactorialAboveTwentyoneExpectedArithmeticException() {
        /*
         * ตามสเปค Javadoc: ถ้า n > 20 ควรจะ throw ArithmeticException
         * ("factorial value is too large to fit in a long")
         * แต่จากซอร์สโค้ดจริง เมธอด factorial(n) คำนวณ result จาก factorialDouble(n)
         * แล้วเช็คเฉพาะ (result == Long.MAX_VALUE) ก่อน return โดย "return factorials[n]"
         * (ไม่ใช่ return result) ทำให้เมื่อ n=21 ซึ่ง index เกินขนาด array (factorials.length=21, index 0-20)
         * จะเกิด ArrayIndexOutOfBoundsException แทน ArithmeticException ตามที่ Javadoc ระบุ
         * -> นี่คือ known fault (Defects4J Math-93b) ที่ test นี้ถูกออกแบบมาเพื่อดักจับ
         * Test นี้จะ FAIL กับโค้ดที่มี fault (เพราะได้ ArrayIndexOutOfBoundsException จริง)
         */
        try {
            MathUtils.factorial(21);
            fail("Expected an exception for n=21");
        } catch (ArithmeticException e) {
            // พฤติกรรมที่ถูกต้องตาม Javadoc
        } catch (ArrayIndexOutOfBoundsException e) {
            fail("FAULT DETECTED: got ArrayIndexOutOfBoundsException instead of ArithmeticException (Defects4J Math-93b)");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDoubleNegative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialDoubleZero() {
        assertEquals(1.0, MathUtils.factorialDouble(0), DELTA);
    }

    @Test
    public void testFactorialDoubleNormal() {
        assertEquals(120.0, MathUtils.factorialDouble(5), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLogNegative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testFactorialLogZero() {
        // loop ไม่ execute เลย (i=2 > n=0)
        assertEquals(0.0, MathUtils.factorialLog(0), DELTA);
    }

    @Test
    public void testFactorialLogNormal() {
        assertEquals(Math.log(120.0), MathUtils.factorialLog(5), DELTA);
    }

    // ---------------- gcd ----------------
    @Test
    public void testGcdUZero() {
        assertEquals(5, MathUtils.gcd(0, 5));
    }

    @Test
    public void testGcdVZero() {
        assertEquals(5, MathUtils.gcd(5, 0));
    }

    @Test
    public void testGcdBothZero() {
        assertEquals(0, MathUtils.gcd(0, 0));
    }

    @Test
    public void testGcdNormalPositive() {
        assertEquals(6, MathUtils.gcd(12, 18));
    }

    @Test
    public void testGcdUNegative() {
        // u<0 ; v>0 -> trigger "if (v>0) v=-v"
        assertEquals(6, MathUtils.gcd(12, -18));
    }

    @Test
    public void testGcdVNegative() {
        // u>0 -> trigger "if (u>0) u=-u"
        assertEquals(6, MathUtils.gcd(-12, 18));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdOverflowTwoToThirtyOne() {
        // u=v=Integer.MIN_VALUE -> k จะกลายเป็น 31 -> throw
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    // ---------------- hash ----------------
    @Test
    public void testHashDouble() {
        double v = 3.14;
        assertEquals(new Double(v).hashCode(), MathUtils.hash(v));
    }

    @Test
    public void testHashDoubleArrayNull() {
        assertEquals(java.util.Arrays.hashCode((double[]) null), MathUtils.hash((double[]) null));
    }

    @Test
    public void testHashDoubleArrayNormal() {
        double[] arr = {1.0, 2.0, 3.0};
        assertEquals(java.util.Arrays.hashCode(arr), MathUtils.hash(arr));
    }

    // ---------------- indicator ----------------
    @Test
    public void testIndicatorByte() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) -1, MathUtils.indicator((byte) -5));
    }

    @Test
    public void testIndicatorDoubleNaN() {
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }

    @Test
    public void testIndicatorDoublePositiveAndZero() {
        assertEquals(1.0, MathUtils.indicator(5.0), DELTA);
        assertEquals(1.0, MathUtils.indicator(0.0), DELTA);
    }

    @Test
    public void testIndicatorDoubleNegative() {
        assertEquals(-1.0, MathUtils.indicator(-5.0), DELTA);
    }

    @Test
    public void testIndicatorFloatNaN() {
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
    }

    @Test
    public void testIndicatorFloatPositiveAndZero() {
        assertEquals(1.0f, MathUtils.indicator(5.0f), FDELTA);
        assertEquals(1.0f, MathUtils.indicator(0.0f), FDELTA);
    }

    @Test
    public void testIndicatorFloatNegative() {
        assertEquals(-1.0f, MathUtils.indicator(-5.0f), FDELTA);
    }

    @Test
    public void testIndicatorInt() {
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(1, MathUtils.indicator(0));
        assertEquals(-1, MathUtils.indicator(-5));
    }

    @Test
    public void testIndicatorLong() {
        assertEquals(1L, MathUtils.indicator(5L));
        assertEquals(1L, MathUtils.indicator(0L));
        assertEquals(-1L, MathUtils.indicator(-5L));
    }

    @Test
    public void testIndicatorShort() {
        assertEquals((short) 1, MathUtils.indicator((short) 5));
        assertEquals((short) 1, MathUtils.indicator((short) 0));
        assertEquals((short) -1, MathUtils.indicator((short) -5));
    }

    // ---------------- lcm ----------------
    @Test
    public void testLcmNormal() {
        assertEquals(12, MathUtils.lcm(4, 6));
    }

    @Test
    public void testLcmZero() {
        assertEquals(0, MathUtils.lcm(0, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmOverflow() {
        MathUtils.lcm(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }

    // ---------------- log ----------------
    @Test
    public void testLogNormal() {
        assertEquals(3.0, MathUtils.log(2, 8), DELTA);
        assertEquals(2.0, MathUtils.log(10, 100), DELTA);
    }

    // ---------------- mulAndCheck(int,int) ----------------
    @Test
    public void testMulAndCheckIntNormal() {
        assertEquals(12, MathUtils.mulAndCheck(3, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckIntOverflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    // ---------------- mulAndCheck(long,long) ----------------
    @Test
    public void testMulAndCheckLongSwap() {
        assertEquals(15L, MathUtils.mulAndCheck(5L, 3L));
    }

    @Test
    public void testMulAndCheckLongBothNegativeNoOverflow() {
        assertEquals(12L, MathUtils.mulAndCheck(-3L, -4L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongBothNegativeOverflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testMulAndCheckLongNegativePositiveNoOverflow() {
        assertEquals(-12L, MathUtils.mulAndCheck(-3L, 4L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongNegativePositiveOverflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test
    public void testMulAndCheckLongNegativeTimesZero() {
        assertEquals(0L, MathUtils.mulAndCheck(-5L, 0L));
    }

    @Test
    public void testMulAndCheckLongBothPositiveNoOverflow() {
        assertEquals(12L, MathUtils.mulAndCheck(3L, 4L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLongBothPositiveOverflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test
    public void testMulAndCheckLongAZero() {
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
    }

    // ---------------- nextAfter ----------------
    @Test
    public void testNextAfterNaN() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
    }

    @Test
    public void testNextAfterInfinite() {
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
    }

    @Test
    public void testNextAfterZeroDirectionNegative() {
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
    }

    @Test
    public void testNextAfterZeroDirectionPositive() {
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
    }

    @Test
    public void testNextAfterIncreaseMantissa() {
        double result = MathUtils.nextAfter(1.0, 2.0);
        assertTrue(result > 1.0);
    }

    @Test
    public void testNextAfterDecreaseMantissa() {
        double result = MathUtils.nextAfter(1.0, 0.0);
        assertTrue(result < 1.0);
    }

    @Test
    public void testNextAfterMantissaOverflowToExponent() {
        // สร้างค่าที่ mantissa เป็น 0x000fffffffffffffL (ทุกบิตเป็น 1) เพื่อ trigger
        // branch ที่ exponent ต้องเพิ่มขึ้นเมื่อ mantissa ล้น
        double d = Double.longBitsToDouble(0x000fffffffffffffL);
        double result = MathUtils.nextAfter(d, Double.POSITIVE_INFINITY);
        assertTrue(result > d);
    }

    @Test
    public void testNextAfterMantissaZeroDecreaseExponent() {
        // mantissa==0 กรณีลดค่า -> exponent ต้องลดลงและ mantissa กลายเป็น all 1s
        double d = Double.longBitsToDouble(0x0010000000000000L); // mantissa = 0
        double result = MathUtils.nextAfter(d, Double.NEGATIVE_INFINITY);
        assertTrue(result < d);
    }

    // ---------------- scalb ----------------
    @Test
    public void testScalbZero() {
        assertEquals(0.0, MathUtils.scalb(0.0, 3), 0.0);
    }

    @Test
    public void testScalbNaN() {
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 3)));
    }

    @Test
    public void testScalbInfinite() {
        assertEquals(Double.POSITIVE_INFINITY, MathUtils.scalb(Double.POSITIVE_INFINITY, 3), 0.0);
    }

    @Test
    public void testScalbNormalPositive() {
        assertEquals(8.0, MathUtils.scalb(1.0, 3), DELTA);
    }

    @Test
    public void testScalbNormalNegative() {
        assertEquals(1.0, MathUtils.scalb(8.0, -3), DELTA);
    }

    // ---------------- normalizeAngle ----------------
    @Test
    public void testNormalizeAngleZeroCenter() {
        double result = MathUtils.normalizeAngle(3 * Math.PI, 0.0);
        assertTrue(result >= -Math.PI - DELTA && result <= Math.PI + DELTA);
    }

    @Test
    public void testNormalizeAngleWithPiCenter() {
        double result = MathUtils.normalizeAngle(-Math.PI / 2, Math.PI);
        assertTrue(result >= 0.0 - DELTA && result <= 2 * Math.PI + DELTA);
    }

    // ---------------- round(double, scale) / round(double, scale, method) ----------------
    @Test
    public void testRoundDoubleDefaultHalfUpPositive() {
        assertEquals(3.0, MathUtils.round(2.5, 0), DELTA);
    }

    @Test
    public void testRoundDoubleDefaultHalfUpNegative() {
        assertEquals(-3.0, MathUtils.round(-2.5, 0), DELTA);
    }

    @Test
    public void testRoundDoubleScaleTwo() {
        assertEquals(1.23, MathUtils.round(1.2345, 2), DELTA);
    }

    @Test
    public void testRoundDoubleNaN() {
        // Double.toString(NaN) -> BigDecimal throws NumberFormatException -> catch -> isInfinite=false -> return NaN
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2, BigDecimal.ROUND_HALF_UP)));
    }

    @Test
    public void testRoundDoubleInfinite() {
        // Double.toString(Infinity) -> NumberFormatException -> catch -> isInfinite=true -> return x
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.round(Double.POSITIVE_INFINITY, 2, BigDecimal.ROUND_HALF_UP), 0.0);
    }

    // ---------------- round(float, scale) / round(float, scale, method) -> roundUnscaled branches ----------------
    @Test
    public void testRoundFloatCeilingPositive() {
        assertEquals(3.0f, MathUtils.round(2.3f, 0, BigDecimal.ROUND_CEILING), FDELTA);
    }

    @Test
    public void testRoundFloatCeilingNegative() {
        assertEquals(-2.0f, MathUtils.round(-2.3f, 0, BigDecimal.ROUND_CEILING), FDELTA);
    }

    @Test
    public void testRoundFloatDownPositive() {
        assertEquals(2.0f, MathUtils.round(2.7f, 0, BigDecimal.ROUND_DOWN), FDELTA);
    }

    @Test
    public void testRoundFloatDownNegative() {
        assertEquals(-2.0f, MathUtils.round(-2.7f, 0, BigDecimal.ROUND_DOWN), FDELTA);
    }

    @Test
    public void testRoundFloatFloorPositive() {
        assertEquals(2.0f, MathUtils.round(2.3f, 0, BigDecimal.ROUND_FLOOR), FDELTA);
    }

    @Test
    public void testRoundFloatFloorNegative() {
        assertEquals(-3.0f, MathUtils.round(-2.3f, 0, BigDecimal.ROUND_FLOOR), FDELTA);
    }

    @Test
    public void testRoundFloatHalfDownExactHalf() {
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_DOWN), FDELTA);
    }

    @Test
    public void testRoundFloatHalfDownAboveHalf() {
        assertEquals(3.0f, MathUtils.round(2.6f, 0, BigDecimal.ROUND_HALF_DOWN), FDELTA);
    }

    @Test
    public void testRoundFloatHalfDownBelowHalf() {
        assertEquals(2.0f, MathUtils.round(2.4f, 0, BigDecimal.ROUND_HALF_DOWN), FDELTA);
    }

    @Test
    public void testRoundFloatHalfEvenExactHalfEven() {
        assertEquals(2.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_EVEN), FDELTA);
    }

    @Test
    public void testRoundFloatHalfEvenExactHalfOdd() {
        assertEquals(4.0f, MathUtils.round(3.5f, 0, BigDecimal.ROUND_HALF_EVEN), FDELTA);
    }

    @Test
    public void testRoundFloatHalfEvenAboveHalf() {
        assertEquals(3.0f, MathUtils.round(2.6f, 0, BigDecimal.ROUND_HALF_EVEN), FDELTA);
    }

    @Test
    public void testRoundFloatHalfEvenBelowHalf() {
        assertEquals(2.0f, MathUtils.round(2.4f, 0, BigDecimal.ROUND_HALF_EVEN), FDELTA);
    }

    @Test
    public void testRoundFloatHalfUpAtHalf() {
        assertEquals(3.0f, MathUtils.round(2.5f, 0, BigDecimal.ROUND_HALF_UP), FDELTA);
    }

    @Test
    public void testRoundFloatHalfUpBelowHalf() {
        assertEquals(2.0f, MathUtils.round(2.4f, 0, BigDecimal.ROUND_HALF_UP), FDELTA);
    }

    @Test
    public void testRoundFloatDefaultMethodIsHalfUp() {
        assertEquals(3.0f, MathUtils.round(2.5f, 0), FDELTA);
    }

    @Test
    public void testRoundFloatUnnecessaryExact() {
        assertEquals(2.0f, MathUtils.round(2.0f, 0, BigDecimal.ROUND_UNNECESSARY), FDELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloatUnnecessaryInexact() {
        MathUtils.round(2.5f, 0, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test
    public void testRoundFloatUpPositive() {
        assertEquals(3.0f, MathUtils.round(2.3f, 0, BigDecimal.ROUND_UP), FDELTA);
    }

    @Test
    public void testRoundFloatUpNegative() {
        assertEquals(-3.0f, MathUtils.round(-2.3f, 0, BigDecimal.ROUND_UP), FDELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloatInvalidRoundingMethod() {
        MathUtils.round(2.5f, 0, 999);
    }

    // ---------------- sign ----------------
    @Test
    public void testSignByte() {
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 5));
        assertEquals((byte) -1, MathUtils.sign((byte) -5));
    }

    @Test
    public void testSignDoubleNaN() {
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }

    @Test
    public void testSignDoubleZeroPositiveNegative() {
        assertEquals(0.0, MathUtils.sign(0.0), DELTA);
        assertEquals(1.0, MathUtils.sign(5.0), DELTA);
        assertEquals(-1.0, MathUtils.sign(-5.0), DELTA);
    }

    @Test
    public void testSignFloatNaN() {
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
    }

    @Test
    public void testSignFloatZeroPositiveNegative() {
        assertEquals(0.0f, MathUtils.sign(0.0f), FDELTA);
        assertEquals(1.0f, MathUtils.sign(5.0f), FDELTA);
        assertEquals(-1.0f, MathUtils.sign(-5.0f), FDELTA);
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

    // ---------------- subAndCheck(int,int) ----------------
    @Test
    public void testSubAndCheckIntNormal() {
        assertEquals(7, MathUtils.subAndCheck(10, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckIntOverflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    // ---------------- subAndCheck(long,long) ----------------
    @Test
    public void testSubAndCheckLongBMinValueANegative() {
        assertEquals(Long.MAX_VALUE, MathUtils.subAndCheck(-1L, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongBMinValueANonNegative() {
        MathUtils.subAndCheck(5L, Long.MIN_VALUE);
    }

    @Test
    public void testSubAndCheckLongNormal() {
        assertEquals(7L, MathUtils.subAndCheck(10L, 3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLongOverflowViaAdd() {
        MathUtils.subAndCheck(Long.MIN_VALUE, 1L);
    }
}
