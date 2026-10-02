# MathUtilsTest.java

```java
package org.apache.commons.math.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;

/**
 * JUnit 4 test suite for org.apache.commons.math.util.MathUtils (Defects4J Math-94b)
 * เป้าหมาย: ครอบคลุม branch/condition ให้มากที่สุดเท่าที่วิเคราะห์ได้จากซอร์สที่ให้มา
 *
 * หมายเหตุ (ตามข้อกำหนดที่ 4):
 * - ไม่สามารถสร้าง test case ที่ trigger branch "k == 31" ใน gcd() ได้จริง
 *   เพราะต้องการ u,v ที่เป็นพหุคูณของ 2^31 ซึ่งเกินขอบเขตของ int (ยกเว้น 0 ซึ่งถูกจับโดย
 *   branch u*v==0 ไปก่อนแล้ว) จึงข้ามการทดสอบ branch นี้
 * - ไม่สามารถสร้าง input ที่ทำให้ binomialCoefficient()/factorial() คืนค่า Long.MAX_VALUE
 *   พอดี (เพื่อ trigger throw ArithmeticException เพราะผลลัพธ์ "ใหญ่เกินไป") ได้อย่างแน่นอน
 *   จึงข้ามการทดสอบ branch นี้เช่นกัน
 */
public class MathUtilsTest {

    private static final double DELTA = 1e-9;

    // ---------------------------------------------------------------
    // addAndCheck(int,int)
    // ---------------------------------------------------------------
    @Test
    public void testAddAndCheckInt_normal() {
        assertEquals(8, MathUtils.addAndCheck(5, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckInt_overflow() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    // ---------------------------------------------------------------
    // addAndCheck(long,long)  -> ครอบคลุม branch ของ private addAndCheck(a,b,msg)
    // ---------------------------------------------------------------
    @Test
    public void testAddAndCheckLong_swap() {
        // a > b -> เข้า branch swap (recursive call)
        assertEquals(8L, MathUtils.addAndCheck(5L, 3L));
    }

    @Test
    public void testAddAndCheckLong_negNeg_noOverflow() {
        // a<0, b<0, ไม่เกิด overflow
        assertEquals(-7L, MathUtils.addAndCheck(-4L, -3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_negNeg_overflow() {
        // a<0, b<0, เกิด negative overflow
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testAddAndCheckLong_oppositeSign_safe() {
        // a<0, b>=0 -> always safe branch
        assertEquals(5L, MathUtils.addAndCheck(-5L, 10L));
    }

    @Test
    public void testAddAndCheckLong_posPos_noOverflow() {
        // a>=0, b>=0, ไม่เกิด overflow
        assertEquals(7L, MathUtils.addAndCheck(3L, 4L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_posPos_overflow() {
        // a>=0, b>=0, เกิด positive overflow (ผ่าน swap ก่อน)
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    // ---------------------------------------------------------------
    // binomialCoefficient
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_nLessThanK() {
        MathUtils.binomialCoefficient(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficient_negativeN() {
        // n<k เป็น false (-1<-1 false) แต่ n<0 เป็น true -> เข้า branch n<0
        MathUtils.binomialCoefficient(-1, -1);
    }

    @Test
    public void testBinomialCoefficient_nEqualsK() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 5));
    }

    @Test
    public void testBinomialCoefficient_kEqualsZero() {
        assertEquals(1L, MathUtils.binomialCoefficient(5, 0));
    }

    @Test
    public void testBinomialCoefficient_kEqualsOne() {
        assertEquals(5L, MathUtils.binomialCoefficient(5, 1));
    }

    @Test
    public void testBinomialCoefficient_kEqualsNMinusOne() {
        assertEquals(5L, MathUtils.binomialCoefficient(5, 4));
    }

    @Test
    public void testBinomialCoefficient_generalCase() {
        assertEquals(10L, MathUtils.binomialCoefficient(5, 2));
    }

    // ---------------------------------------------------------------
    // binomialCoefficientDouble
    // ---------------------------------------------------------------
    @Test
    public void testBinomialCoefficientDouble_general() {
        assertEquals(10.0, MathUtils.binomialCoefficientDouble(5, 2), DELTA);
    }

    // ---------------------------------------------------------------
    // binomialCoefficientLog
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_nLessThanK() {
        MathUtils.binomialCoefficientLog(2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinomialCoefficientLog_negativeN() {
        MathUtils.binomialCoefficientLog(-1, -1);
    }

    @Test
    public void testBinomialCoefficientLog_nEqualsKOrKEqualsZero() {
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 5), DELTA);
        assertEquals(0.0, MathUtils.binomialCoefficientLog(5, 0), DELTA);
    }

    @Test
    public void testBinomialCoefficientLog_kEqualsOneOrNMinusOne() {
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 1), DELTA);
        assertEquals(Math.log(5.0), MathUtils.binomialCoefficientLog(5, 4), DELTA);
    }

    @Test
    public void testBinomialCoefficientLog_generalCase_loops() {
        double expected = Math.log(10.0); // C(5,2)=10
        assertEquals(expected, MathUtils.binomialCoefficientLog(5, 2), 1e-6);
    }

    // ---------------------------------------------------------------
    // cosh
    // ---------------------------------------------------------------
    @Test
    public void testCosh() {
        assertEquals(1.0, MathUtils.cosh(0.0), DELTA);
        assertEquals((Math.E + 1 / Math.E) / 2.0, MathUtils.cosh(1.0), DELTA);
    }

    // ---------------------------------------------------------------
    // equals(double,double)
    // ---------------------------------------------------------------
    @Test
    public void testEqualsDouble_bothNaN() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
    }

    @Test
    public void testEqualsDouble_oneNaN() {
        assertFalse(MathUtils.equals(Double.NaN, 1.0));
    }

    @Test
    public void testEqualsDouble_equalValues() {
        assertTrue(MathUtils.equals(1.5, 1.5));
    }

    @Test
    public void testEqualsDouble_differentValues() {
        assertFalse(MathUtils.equals(1.5, 2.5));
    }

    // ---------------------------------------------------------------
    // equals(double[],double[])
    // ---------------------------------------------------------------
    @Test
    public void testEqualsArray_bothNull() {
        assertTrue(MathUtils.equals((double[]) null, (double[]) null));
    }

    @Test
    public void testEqualsArray_oneNull() {
        assertFalse(MathUtils.equals(new double[] {1.0}, null));
        assertFalse(MathUtils.equals(null, new double[] {1.0}));
    }

    @Test
    public void testEqualsArray_differentLength() {
        assertFalse(MathUtils.equals(new double[] {1.0}, new double[] {1.0, 2.0}));
    }

    @Test
    public void testEqualsArray_allEqualIncludingNaN() {
        double[] x = {1.0, Double.NaN, 3.0};
        double[] y = {1.0, Double.NaN, 3.0};
        assertTrue(MathUtils.equals(x, y));
    }

    @Test
    public void testEqualsArray_elementMismatch() {
        double[] x = {1.0, 2.0};
        double[] y = {1.0, 3.0};
        assertFalse(MathUtils.equals(x, y));
    }

    // ---------------------------------------------------------------
    // factorial / factorialDouble / factorialLog
    // ---------------------------------------------------------------
    @Test
    public void testFactorial_normal() {
        assertEquals(1L, MathUtils.factorial(0));
        assertEquals(120L, MathUtils.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_negative() {
        MathUtils.factorial(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDouble_negative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialDouble_normal() {
        assertEquals(1.0, MathUtils.factorialDouble(0), DELTA);
        assertEquals(120.0, MathUtils.factorialDouble(5), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLog_negative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testFactorialLog_zero_loopNotEntered() {
        assertEquals(0.0, MathUtils.factorialLog(0), DELTA);
        assertEquals(0.0, MathUtils.factorialLog(1), DELTA);
    }

    @Test
    public void testFactorialLog_loopEntered() {
        double expected = Math.log(2.0) + Math.log(3.0);
        assertEquals(expected, MathUtils.factorialLog(3), DELTA);
    }

    // ---------------------------------------------------------------
    // gcd
    // ---------------------------------------------------------------
    @Test
    public void testGcd_zeroBranch() {
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(5, MathUtils.gcd(5, 0));
        assertEquals(0, MathUtils.gcd(0, 0));
    }

    @Test
    public void testGcd_positiveNumbers() {
        assertEquals(6, MathUtils.gcd(12, 18));
    }

    @Test
    public void testGcd_negativeU() {
        // u>0 -> negate u
        assertEquals(6, MathUtils.gcd(-12, 18));
    }

    @Test
    public void testGcd_negativeV() {
        // v>0 -> negate v
        assertEquals(6, MathUtils.gcd(12, -18));
    }

    @Test
    public void testGcd_bothNegative() {
        assertEquals(6, MathUtils.gcd(-12, -18));
    }

    @Test
    public void testGcd_powerOfTwoLoop() {
        // ทั้งคู่เป็นเลขคู่หลายรอบ -> เข้า while loop (B1)
        assertEquals(4, MathUtils.gcd(8, 12));
    }

    // ---------------------------------------------------------------
    // hash
    // ---------------------------------------------------------------
    @Test
    public void testHashDouble() {
        assertEquals(new Double(3.14).hashCode(), MathUtils.hash(3.14));
    }

    @Test
    public void testHashDoubleArray() {
        double[] arr = {1.0, 2.0, 3.0};
        assertEquals(Arrays.hashCode(arr), MathUtils.hash(arr));
        assertEquals(Arrays.hashCode((double[]) null), MathUtils.hash((double[]) null));
    }

    // ---------------------------------------------------------------
    // indicator (byte/double/float/int/long/short)
    // ---------------------------------------------------------------
    @Test
    public void testIndicatorByte() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        assertEquals((byte) -1, MathUtils.indicator((byte) -5));
        assertEquals((byte) 1, MathUtils.indicator((byte) 0)); // 0 >= 0 -> +1
    }

    @Test
    public void testIndicatorDouble() {
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
        assertEquals(1.0, MathUtils.indicator(5.0), DELTA);
        assertEquals(-1.0, MathUtils.indicator(-5.0), DELTA);
        assertEquals(1.0, MathUtils.indicator(0.0), DELTA);
    }

    @Test
    public void testIndicatorFloat() {
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
        assertEquals(1.0F, MathUtils.indicator(5.0F), DELTA);
        assertEquals(-1.0F, MathUtils.indicator(-5.0F), DELTA);
        assertEquals(1.0F, MathUtils.indicator(0.0F), DELTA);
    }

    @Test
    public void testIndicatorInt() {
        assertEquals(1, MathUtils.indicator(5));
        assertEquals(-1, MathUtils.indicator(-5));
        assertEquals(1, MathUtils.indicator(0));
    }

    @Test
    public void testIndicatorLong() {
        assertEquals(1L, MathUtils.indicator(5L));
        assertEquals(-1L, MathUtils.indicator(-5L));
        assertEquals(1L, MathUtils.indicator(0L));
    }

    @Test
    public void testIndicatorShort() {
        assertEquals((short) 1, MathUtils.indicator((short) 5));
        assertEquals((short) -1, MathUtils.indicator((short) -5));
        assertEquals((short) 1, MathUtils.indicator((short) 0));
    }

    // ---------------------------------------------------------------
    // lcm
    // ---------------------------------------------------------------
    @Test
    public void testLcm_normal() {
        assertEquals(12, MathUtils.lcm(4, 6));
    }

    @Test
    public void testLcm_zero() {
        assertEquals(0, MathUtils.lcm(0, 5));
    }

    // ---------------------------------------------------------------
    // log
    // ---------------------------------------------------------------
    @Test
    public void testLog() {
        assertEquals(3.0, MathUtils.log(2, 8), DELTA);
    }

    // ---------------------------------------------------------------
    // mulAndCheck(int,int)
    // ---------------------------------------------------------------
    @Test
    public void testMulAndCheckInt_normal() {
        assertEquals(12, MathUtils.mulAndCheck(3, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckInt_overflow() {
        MathUtils.mulAndCheck(Integer.MAX_VALUE, 2);
    }

    // ---------------------------------------------------------------
    // mulAndCheck(long,long) -> ครอบคลุมหลาย branch
    // ---------------------------------------------------------------
    @Test
    public void testMulAndCheckLong_swap() {
        assertEquals(15L, MathUtils.mulAndCheck(5L, 3L));
    }

    @Test
    public void testMulAndCheckLong_negNeg_noOverflow() {
        assertEquals(12L, MathUtils.mulAndCheck(-4L, -3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_negNeg_overflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -2L);
    }

    @Test
    public void testMulAndCheckLong_negPos_noOverflow() {
        assertEquals(-12L, MathUtils.mulAndCheck(-4L, 3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_negPos_overflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, 2L);
    }

    @Test
    public void testMulAndCheckLong_negZero() {
        assertEquals(0L, MathUtils.mulAndCheck(-4L, 0L));
    }

    @Test
    public void testMulAndCheckLong_posPos_noOverflow() {
        assertEquals(15L, MathUtils.mulAndCheck(3L, 5L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_posPos_overflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test
    public void testMulAndCheckLong_zeroBranch() {
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
    }

    // ---------------------------------------------------------------
    // nextAfter
    // ---------------------------------------------------------------
    @Test
    public void testNextAfter_NaN() {
        assertTrue(Double.isNaN(MathUtils.nextAfter(Double.NaN, 1.0)));
    }

    @Test
    public void testNextAfter_Infinite() {
        assertEquals(Double.POSITIVE_INFINITY,
            MathUtils.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY,
            MathUtils.nextAfter(Double.NEGATIVE_INFINITY, 0.0), 0.0);
    }

    @Test
    public void testNextAfter_zeroNegativeDirection() {
        assertEquals(-Double.MIN_VALUE, MathUtils.nextAfter(0.0, -1.0), 0.0);
    }

    @Test
    public void testNextAfter_zeroNonNegativeDirection() {
        assertEquals(Double.MIN_VALUE, MathUtils.nextAfter(0.0, 1.0), 0.0);
    }

    @Test
    public void testNextAfter_increaseMantissa() {
        double result = MathUtils.nextAfter(1.0, 2.0);
        assertTrue(result > 1.0);
    }

    @Test
    public void testNextAfter_decreaseMantissa() {
        double result = MathUtils.nextAfter(1.0, 0.0);
        assertTrue(result < 1.0);
    }

    @Test
    public void testNextAfter_mantissaOverflow_increase() {
        // d0 = double ที่อยู่ก่อนหน้า 2.0 ทันที (mantissa == 0x000fffffffffffffL)
        double d0 = Double.longBitsToDouble(Double.doubleToLongBits(2.0) - 1L);
        double result = MathUtils.nextAfter(d0, 2.0);
        assertEquals(2.0, result, 0.0);
    }

    @Test
    public void testNextAfter_mantissaZero_decrease() {
        // d = 2.0 มี mantissa == 0 -> ลดค่าทำให้ borrow จาก exponent
        double expected = Double.longBitsToDouble(Double.doubleToLongBits(2.0) - 1L);
        double result = MathUtils.nextAfter(2.0, 1.0);
        assertEquals(expected, result, 0.0);
    }

    // ---------------------------------------------------------------
    // scalb
    // ---------------------------------------------------------------
    @Test
    public void testScalb_zero() {
        assertEquals(0.0, MathUtils.scalb(0.0, 5), 0.0);
    }

    @Test
    public void testScalb_NaN() {
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 5)));
    }

    @Test
    public void testScalb_Infinite() {
        assertEquals(Double.POSITIVE_INFINITY,
            MathUtils.scalb(Double.POSITIVE_INFINITY, 5), 0.0);
    }

    @Test
    public void testScalb_positiveNormal() {
        assertEquals(8.0, MathUtils.scalb(1.0, 3), DELTA);
    }

    @Test
    public void testScalb_negativeValue() {
        assertEquals(-8.0, MathUtils.scalb(-1.0, 3), DELTA);
    }

    @Test
    public void testScalb_negativeScaleFactor() {
        assertEquals(1.0, MathUtils.scalb(8.0, -3), DELTA);
    }

    // ---------------------------------------------------------------
    // normalizeAngle
    // ---------------------------------------------------------------
    @Test
    public void testNormalizeAngle_basic() {
        double result = MathUtils.normalizeAngle(3 * Math.PI, 0.0);
        assertEquals(-Math.PI, result, 1e-9);
    }

    @Test
    public void testNormalizeAngle_alreadyInRange() {
        double result = MathUtils.normalizeAngle(0.5, 0.0);
        assertEquals(0.5, result, DELTA);
    }

    // ---------------------------------------------------------------
    // round(double, scale)  (wrapper -> ROUND_HALF_UP)
    // ---------------------------------------------------------------
    @Test
    public void testRoundDoubleScale_default() {
        assertEquals(3.0, MathUtils.round(2.5, 0), DELTA);
        assertEquals(-3.0, MathUtils.round(-2.5, 0), DELTA);
    }

    // ---------------------------------------------------------------
    // round(double, scale, roundingMethod) -> NumberFormatException branch
    // ---------------------------------------------------------------
    @Test
    public void testRoundDouble_NaN_returnsNaN() {
        double result = MathUtils.round(Double.NaN, 2, BigDecimal.ROUND_HALF_UP);
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRoundDouble_PositiveInfinity_returnsSame() {
        double result = MathUtils.round(Double.POSITIVE_INFINITY, 2, BigDecimal.ROUND_HALF_UP);
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testRoundDouble_NegativeInfinity_returnsSame() {
        double result = MathUtils.round(Double.NEGATIVE_INFINITY, 2, BigDecimal.ROUND_HALF_UP);
        assertEquals(Double.NEGATIVE_INFINITY, result, 0.0);
    }

    // ---------------------------------------------------------------
    // round(float, scale) wrapper
    // ---------------------------------------------------------------
    @Test
    public void testRoundFloatScale_default() {
        assertEquals(3.0F, MathUtils.round(2.5F, 0), DELTA);
    }

    // ---------------------------------------------------------------
    // round(float, scale, roundingMethod) -> ครอบคลุม roundUnscaled() ทุก case
    // ---------------------------------------------------------------
    @Test
    public void testRoundFloat_CEILING_positive() {
        assertEquals(2.0F, MathUtils.round(1.4F, 0, BigDecimal.ROUND_CEILING), DELTA);
    }

    @Test
    public void testRoundFloat_CEILING_negative() {
        assertEquals(-1.0F, MathUtils.round(-1.4F, 0, BigDecimal.ROUND_CEILING), DELTA);
    }

    @Test
    public void testRoundFloat_DOWN_positive() {
        assertEquals(1.0F, MathUtils.round(1.9F, 0, BigDecimal.ROUND_DOWN), DELTA);
    }

    @Test
    public void testRoundFloat_DOWN_negative() {
        assertEquals(-1.0F, MathUtils.round(-1.9F, 0, BigDecimal.ROUND_DOWN), DELTA);
    }

    @Test
    public void testRoundFloat_FLOOR_positive() {
        assertEquals(1.0F, MathUtils.round(1.6F, 0, BigDecimal.ROUND_FLOOR), DELTA);
    }

    @Test
    public void testRoundFloat_FLOOR_negative() {
        assertEquals(-2.0F, MathUtils.round(-1.6F, 0, BigDecimal.ROUND_FLOOR), DELTA);
    }

    @Test
    public void testRoundFloat_HALF_DOWN_exactHalf() {
        assertEquals(0.0F, MathUtils.round(0.5F, 0, BigDecimal.ROUND_HALF_DOWN), DELTA);
    }

    @Test
    public void testRoundFloat_HALF_DOWN_aboveHalf() {
        assertEquals(1.0F, MathUtils.round(0.6F, 0, BigDecimal.ROUND_HALF_DOWN), DELTA);
    }

    @Test
    public void testRoundFloat_HALF_EVEN_even() {
        assertEquals(0.0F, MathUtils.round(0.5F, 0, BigDecimal.ROUND_HALF_EVEN), DELTA);
    }

    @Test
    public void testRoundFloat_HALF_EVEN_odd() {
        assertEquals(2.0F, MathUtils.round(1.5F, 0, BigDecimal.ROUND_HALF_EVEN), DELTA);
    }

    @Test
    public void testRoundFloat_HALF_EVEN_belowHalf() {
        assertEquals(0.0F, MathUtils.round(0.4F, 0, BigDecimal.ROUND_HALF_EVEN), DELTA);
    }

    @Test
    public void testRoundFloat_HALF_EVEN_aboveHalf() {
        assertEquals(1.0F, MathUtils.round(0.6F, 0, BigDecimal.ROUND_HALF_EVEN), DELTA);
    }

    @Test
    public void testRoundFloat_HALF_UP_half() {
        assertEquals(1.0F, MathUtils.round(0.5F, 0, BigDecimal.ROUND_HALF_UP), DELTA);
    }

    @Test
    public void testRoundFloat_HALF_UP_belowHalf() {
        assertEquals(0.0F, MathUtils.round(0.4F, 0, BigDecimal.ROUND_HALF_UP), DELTA);
    }

    @Test
    public void testRoundFloat_UNNECESSARY_exact() {
        assertEquals(2.0F, MathUtils.round(2.0F, 0, BigDecimal.ROUND_UNNECESSARY), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloat_UNNECESSARY_inexact() {
        MathUtils.round(2.5F, 0, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test
    public void testRoundFloat_UP_positive() {
        assertEquals(2.0F, MathUtils.round(1.1F, 0, BigDecimal.ROUND_UP), DELTA);
    }

    @Test
    public void testRoundFloat_UP_negative() {
        assertEquals(-2.0F, MathUtils.round(-1.1F, 0, BigDecimal.ROUND_UP), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloat_invalidMethod() {
        MathUtils.round(1.0F, 0, -999);
    }

    // ---------------------------------------------------------------
    // sign (byte/double/float/int/long/short)
    // ---------------------------------------------------------------
    @Test
    public void testSignByte() {
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 5));
        assertEquals((byte) -1, MathUtils.sign((byte) -5));
    }

    @Test
    public void testSignDouble() {
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
        assertEquals(0.0, MathUtils.sign(0.0), DELTA);
        assertEquals(1.0, MathUtils.sign(5.0), DELTA);
        assertEquals(-1.0, MathUtils.sign(-5.0), DELTA);
    }

    @Test
    public void testSignFloat() {
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
        assertEquals(0.0F, MathUtils.sign(0.0F), DELTA);
        assertEquals(1.0F, MathUtils.sign(5.0F), DELTA);
        assertEquals(-1.0F, MathUtils.sign(-5.0F), DELTA);
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

    // ---------------------------------------------------------------
    // sinh
    // ---------------------------------------------------------------
    @Test
    public void testSinh() {
        assertEquals(0.0, MathUtils.sinh(0.0), DELTA);
        assertEquals((Math.E - 1 / Math.E) / 2.0, MathUtils.sinh(1.0), DELTA);
    }

    // ---------------------------------------------------------------
    // subAndCheck(int,int)
    // ---------------------------------------------------------------
    @Test
    public void testSubAndCheckInt_normal() {
        assertEquals(2, MathUtils.subAndCheck(5, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckInt_overflow() {
        MathUtils.subAndCheck(Integer.MIN_VALUE, 1);
    }

    // ---------------------------------------------------------------
    // subAndCheck(long,long)
    // ---------------------------------------------------------------
    @Test
    public void testSubAndCheckLong_bMinValue_aNegative() {
        // b == Long.MIN_VALUE, a < 0 -> ret = a - b
        assertEquals(Long.MAX_VALUE, MathUtils.subAndCheck(-1L, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_bMinValue_aNonNegative() {
        // b == Long.MIN_VALUE, a >= 0 -> throw
        MathUtils.subAndCheck(0L, Long.MIN_VALUE);
    }

    @Test
    public void testSubAndCheckLong_normalPath() {
        // b != MIN_VALUE -> ใช้ addAndCheck(a,-b)
        assertEquals(2L, MathUtils.subAndCheck(5L, 3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_normalPath_overflow() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }
}
```

# ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testAddAndCheckInt_normal/_overflow | addAndCheck(int,int): s ไม่เกิน/เกินขอบเขต int |
| testAddAndCheckLong_* (6 methods) | private addAndCheck(long,long,msg): swap(a>b), a<0&&b<0(overflow/ไม่overflow), a<0&&b>=0, a>=0&&b>=0(overflow/ไม่overflow) |
| testBinomialCoefficient_* (7 methods) | n<k throw, n<0 throw, n==k\|\|k==0, k==1\|\|k==n-1, general case |
| testBinomialCoefficientDouble_general | เส้นทางคำนวณปกติ |
| testBinomialCoefficientLog_* (6 methods) | เงื่อนไขเดียวกับ binomialCoefficient + for-loop ทั้งสองลูป (entered/not entered) |
| testCosh | คำนวณปกติ (ไม่มี branch) |
| testEqualsDouble_* (4 methods) | NaN&&NaN, NaN เดี่ยว, เท่ากัน, ไม่เท่ากัน |
| testEqualsArray_* (5 methods) | null ทั้งคู่, null เดี่ยว, length ต่างกัน, เท่ากันทั้งหมด(รวม NaN), ไม่เท่ากัน (loop break) |
| testFactorial_*/testFactorialDouble_*/testFactorialLog_* (7 methods) | n<0 throw, n==0 (loop ไม่เข้า), n>0 (loop เข้า) |
| testGcd_* (6 methods) | u*v==0, u>0 negate, v>0 negate, both negative, while-loop power-of-two |
| testHashDouble/testHashDoubleArray | ค่าปกติ + null array |
| testIndicator* (6 methods) | x>=0 / x<0 ทุก type, NaN (double/float) |
| testLcm_normal/_zero | เส้นทางปกติ และ a/gcd=0 |
| testLog | คำนวณปกติ |
| testMulAndCheckInt_* (2) | overflow/ไม่overflow |
| testMulAndCheckLong_* (8 methods) | swap, a<0&&b<0(overflow/ไม่), a<0&&b>0(overflow/ไม่), a<0&&b==0, a>0&&b>0(overflow/ไม่), a==0 |
| testNextAfter_* (8 methods) | NaN, Infinite, d==0(direction<0/>=0), เพิ่ม/ลด mantissa ปกติ, mantissa overflow (carry เพิ่ม/ลด exponent) |
| testScalb_* (6 methods) | d==0, NaN, Infinite, บวก, ลบ (sign bit), scaleFactor ลบ |
| testNormalizeAngle_* (2) | คำนวณสูตรด้วยค่าต่าง ๆ |
| testRoundDoubleScale_default | wrapper เรียก ROUND_HALF_UP |
| testRoundDouble_NaN/_PosInf/_NegInf | catch NumberFormatException: isInfinite true/false |
| testRoundFloatScale_default | wrapper float |
| testRoundFloat_* (17 methods) | roundUnscaled: CEILING(sign=-1/not), DOWN, FLOOR(sign=-1/not), HALF_DOWN(=0.5/>0.5), HALF_EVEN(even/odd/<0.5/>0.5), HALF_UP(=0.5/<0.5), UNNECESSARY(exact/inexact throw), UP(บวก/ลบ), default throw IllegalArgumentException |
| testSign* (6 methods) | x==0, x>0, x<0 ทุก type, NaN (double/float) |
| testSinh | คำนวณปกติ |
| testSubAndCheckInt_* (2) | overflow/ไม่overflow |
| testSubAndCheckLong_* (4 methods) | b==MIN_VALUE(a<0/a>=0 throw), b!=MIN_VALUE(ปกติ/overflow) |

**หมายเหตุสำคัญ:** ข้ามการทดสอบ branch `k==31` ใน `gcd()` และ branch `result==Long.MAX_VALUE` ใน `binomialCoefficient()`/`factorial()` เนื่องจากไม่สามารถสร้าง input ที่ trigger ได้จริงภายใต้ขอบเขตของ `int`/`long` ตามที่ระบุไว้ในคอมเมนต์ท้ายไฟล์ทดสอบ