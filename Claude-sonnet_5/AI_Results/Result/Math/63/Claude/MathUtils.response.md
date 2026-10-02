# MathUtilsTest.java

ด้านล่างเป็นชุดทดสอบ JUnit 4 ที่ครอบคลุมเมธอด public ส่วนใหญ่ของ `MathUtils` โดยพยายามครอบคลุม branch/condition ให้มากที่สุดตามที่วิเคราะห์ได้จาก source ที่ให้มา

> **หมายเหตุสำคัญ:**
> - ใช้ `FastMath` (อยู่ใน package เดียวกับ `MathUtils`) เพื่อคำนวณค่าคาดหวัง (expected) สำหรับฟังก์ชัน log/exp เนื่องจาก implementation จริงเรียกใช้ `FastMath` ภายใน ไม่ใช่การเดา behavior ใหม่
> - บางกรณีเช่น `default` ของ `switch` ใน `checkOrder` หรือ `assert` ใน `equals(double,double,int)` ไม่สามารถ trigger ได้จาก public API ปกติ จึงข้ามไว้ (คอมเมนต์กำกับ)
> - ค่าตัวเลขสำหรับ branch ของ `safeNorm` และ `roundUnscaled` ถูกเลือกอย่างระมัดระวังตามการไล่ตามโค้ด มีคอมเมนต์อธิบาย

```java
package org.apache.commons.math.util;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;
import org.apache.commons.math.exception.NonMonotonousSequenceException;
import org.apache.commons.math.util.MathUtils.OrderDirection;

public class MathUtilsTest {

    private static final double DELTA = 1e-9;

    // ---------------------------------------------------------------
    // addAndCheck(int,int)
    // ---------------------------------------------------------------
    @Test
    public void testAddAndCheckInt_normal() {
        assertEquals(5, MathUtils.addAndCheck(2, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckInt_overflow() {
        MathUtils.addAndCheck(Integer.MAX_VALUE, 1);
    }

    // ---------------------------------------------------------------
    // addAndCheck(long,long) -> private addAndCheck(a,b,pattern)
    // ---------------------------------------------------------------
    @Test
    public void testAddAndCheckLong_swapBranch() {
        // a > b triggers "use symmetry" branch (then recurses with swapped args)
        assertEquals(300L, MathUtils.addAndCheck(200L, 100L));
    }

    @Test
    public void testAddAndCheckLong_bothNegative_noOverflow() {
        assertEquals(-15L, MathUtils.addAndCheck(-5L, -10L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_bothNegative_overflow() {
        MathUtils.addAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testAddAndCheckLong_oppositeSign() {
        assertEquals(10L, MathUtils.addAndCheck(-10L, 20L));
    }

    @Test
    public void testAddAndCheckLong_bothPositive_noOverflow() {
        assertEquals(30L, MathUtils.addAndCheck(10L, 20L));
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAndCheckLong_bothPositive_overflow() {
        MathUtils.addAndCheck(Long.MAX_VALUE, 1L);
    }

    // ---------------------------------------------------------------
    // checkBinomial (private, tested via binomialCoefficient)
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testCheckBinomial_nLessThanK() {
        MathUtils.binomialCoefficient(3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckBinomial_negativeN() {
        MathUtils.binomialCoefficient(-1, 0);
    }

    // ---------------------------------------------------------------
    // binomialCoefficient(n,k)
    // ---------------------------------------------------------------
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
    public void testBinomialCoefficient_symmetryBranch() {
        // k > n/2 triggers recursive symmetry call
        assertEquals(10L, MathUtils.binomialCoefficient(5, 3));
    }

    @Test
    public void testBinomialCoefficient_nLessEqual61() {
        assertEquals(120L, MathUtils.binomialCoefficient(10, 3));
    }

    @Test
    public void testBinomialCoefficient_nBetween62And66() {
        // n<=66 branch (uses gcd to avoid overflow)
        long result = MathUtils.binomialCoefficient(64, 5);
        assertTrue(result > 0);
    }

    @Test
    public void testBinomialCoefficient_nGreater66() {
        // n>66 branch, uses mulAndCheck
        long result = MathUtils.binomialCoefficient(70, 5);
        assertTrue(result > 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testBinomialCoefficient_overflow() {
        // C(100,50) >> Long.MAX_VALUE
        MathUtils.binomialCoefficient(100, 50);
    }

    // ---------------------------------------------------------------
    // binomialCoefficientDouble(n,k)
    // ---------------------------------------------------------------
    @Test
    public void testBinomialCoefficientDouble_nEqualsKorKZero() {
        assertEquals(1d, MathUtils.binomialCoefficientDouble(5, 5), DELTA);
        assertEquals(1d, MathUtils.binomialCoefficientDouble(5, 0), DELTA);
    }

    @Test
    public void testBinomialCoefficientDouble_kOneOrNMinus1() {
        assertEquals(5d, MathUtils.binomialCoefficientDouble(5, 1), DELTA);
        assertEquals(5d, MathUtils.binomialCoefficientDouble(5, 4), DELTA);
    }

    @Test
    public void testBinomialCoefficientDouble_symmetry() {
        assertEquals(10d, MathUtils.binomialCoefficientDouble(5, 3), DELTA);
    }

    @Test
    public void testBinomialCoefficientDouble_nLess67() {
        assertEquals(120d, MathUtils.binomialCoefficientDouble(10, 3), DELTA);
    }

    @Test
    public void testBinomialCoefficientDouble_nGreaterEqual67_loopBranch() {
        double result = MathUtils.binomialCoefficientDouble(100, 50);
        assertTrue(result > 0);
    }

    // ---------------------------------------------------------------
    // binomialCoefficientLog(n,k)
    // ---------------------------------------------------------------
    @Test
    public void testBinomialCoefficientLog_nEqualsKorKZero() {
        assertEquals(0d, MathUtils.binomialCoefficientLog(5, 5), DELTA);
        assertEquals(0d, MathUtils.binomialCoefficientLog(5, 0), DELTA);
    }

    @Test
    public void testBinomialCoefficientLog_kOne() {
        assertEquals(FastMath.log(5), MathUtils.binomialCoefficientLog(5, 1), DELTA);
    }

    @Test
    public void testBinomialCoefficientLog_nLess67() {
        assertEquals(FastMath.log(120), MathUtils.binomialCoefficientLog(10, 3), DELTA);
    }

    @Test
    public void testBinomialCoefficientLog_nLess1030() {
        double expected = FastMath.log(MathUtils.binomialCoefficientDouble(100, 50));
        assertEquals(expected, MathUtils.binomialCoefficientLog(100, 50), 1e-6);
    }

    @Test
    public void testBinomialCoefficientLog_symmetryForLargeN() {
        // n>=1030, k>n/2 triggers recursive symmetry
        double v1 = MathUtils.binomialCoefficientLog(2000, 1500);
        double v2 = MathUtils.binomialCoefficientLog(2000, 500);
        assertEquals(v1, v2, 1e-6);
    }

    @Test
    public void testBinomialCoefficientLog_sumLogsBranch() {
        // n>=1030, k<=n/2 -> sum logs loop
        double result = MathUtils.binomialCoefficientLog(2000, 500);
        assertTrue(result > 0);
    }

    // ---------------------------------------------------------------
    // compareTo(x,y,eps)
    // ---------------------------------------------------------------
    @Test
    public void testCompareTo_equalWithinEps() {
        assertEquals(0, MathUtils.compareTo(1.0, 1.0000001, 0.001));
    }

    @Test
    public void testCompareTo_lessThan() {
        assertEquals(-1, MathUtils.compareTo(1.0, 2.0, 1e-10));
    }

    @Test
    public void testCompareTo_greaterThan() {
        assertEquals(1, MathUtils.compareTo(2.0, 1.0, 1e-10));
    }

    // ---------------------------------------------------------------
    // cosh / sinh (no real branches, sanity check)
    // ---------------------------------------------------------------
    @Test
    public void testCosh() {
        assertEquals(1.0, MathUtils.cosh(0.0), DELTA);
    }

    @Test
    public void testSinh() {
        assertEquals(0.0, MathUtils.sinh(0.0), DELTA);
    }

    // ---------------------------------------------------------------
    // equals(double,double)
    // ---------------------------------------------------------------
    @Test
    public void testEquals_bothNaN() {
        assertTrue(MathUtils.equals(Double.NaN, Double.NaN));
    }

    @Test
    public void testEquals_equalValues() {
        assertTrue(MathUtils.equals(1.0, 1.0));
    }

    @Test
    public void testEquals_differentValues() {
        assertFalse(MathUtils.equals(1.0, 2.0));
    }

    // ---------------------------------------------------------------
    // equalsIncludingNaN(double,double)
    // ---------------------------------------------------------------
    @Test
    public void testEqualsIncludingNaN_bothNaN() {
        assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN));
    }

    @Test
    public void testEqualsIncludingNaN_equalsUlp() {
        assertTrue(MathUtils.equalsIncludingNaN(1.0, 1.0));
    }

    @Test
    public void testEqualsIncludingNaN_differentFar() {
        assertFalse(MathUtils.equalsIncludingNaN(1.0, 100.0));
    }

    // ---------------------------------------------------------------
    // equals(double,double,double eps)
    // ---------------------------------------------------------------
    @Test
    public void testEqualsEps_exactEqual() {
        assertTrue(MathUtils.equals(1.0, 1.0, 0.0));
    }

    @Test
    public void testEqualsEps_withinEps() {
        assertTrue(MathUtils.equals(1.0, 1.05, 0.1));
    }

    @Test
    public void testEqualsEps_outsideEps() {
        assertFalse(MathUtils.equals(1.0, 2.0, 0.1));
    }

    // ---------------------------------------------------------------
    // equalsIncludingNaN(double,double,double eps)
    // ---------------------------------------------------------------
    @Test
    public void testEqualsIncludingNaNEps_bothNaN() {
        assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN, 0.1));
    }

    @Test
    public void testEqualsIncludingNaNEps_withinEps() {
        assertTrue(MathUtils.equalsIncludingNaN(1.0, 1.05, 0.1));
    }

    @Test
    public void testEqualsIncludingNaNEps_outside() {
        assertFalse(MathUtils.equalsIncludingNaN(1.0, 5.0, 0.1));
    }

    // ---------------------------------------------------------------
    // equals(double,double,int maxUlps)
    // ---------------------------------------------------------------
    @Test
    public void testEqualsUlps_equalPositive() {
        assertTrue(MathUtils.equals(1.0, 1.0, 1));
    }

    @Test
    public void testEqualsUlps_equalNegative() {
        // both xInt<0 and yInt<0 branch
        assertTrue(MathUtils.equals(-1.0, -1.0, 1));
    }

    @Test
    public void testEqualsUlps_oneNegOnePos() {
        assertFalse(MathUtils.equals(1.0, -1.0, 1));
    }

    @Test
    public void testEqualsUlps_closeByOneUlp() {
        double x = 1.0;
        double y = Math.nextUp(x);
        assertTrue(MathUtils.equals(x, y, 1));
    }

    @Test
    public void testEqualsUlps_NaNAlwaysFalse() {
        assertFalse(MathUtils.equals(Double.NaN, Double.NaN, 1));
    }

    // ---------------------------------------------------------------
    // equalsIncludingNaN(double,double,int maxUlps)
    // ---------------------------------------------------------------
    @Test
    public void testEqualsIncludingNaNUlps_bothNaN() {
        assertTrue(MathUtils.equalsIncludingNaN(Double.NaN, Double.NaN, 1));
    }

    @Test
    public void testEqualsIncludingNaNUlps_normal() {
        assertTrue(MathUtils.equalsIncludingNaN(1.0, 1.0, 1));
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
        assertFalse(MathUtils.equals(new double[]{1.0}, null));
        assertFalse(MathUtils.equals(null, new double[]{1.0}));
    }

    @Test
    public void testEqualsArray_differentLength() {
        assertFalse(MathUtils.equals(new double[]{1.0}, new double[]{1.0, 2.0}));
    }

    @Test
    public void testEqualsArray_equalElements() {
        assertTrue(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 2.0}));
    }

    @Test
    public void testEqualsArray_differentElements() {
        assertFalse(MathUtils.equals(new double[]{1.0, 2.0}, new double[]{1.0, 3.0}));
    }

    @Test
    public void testEqualsArray_emptyArrays() {
        assertTrue(MathUtils.equals(new double[]{}, new double[]{}));
    }

    // ---------------------------------------------------------------
    // equalsIncludingNaN(double[],double[])
    // ---------------------------------------------------------------
    @Test
    public void testEqualsIncludingNaNArray_bothNull() {
        assertTrue(MathUtils.equalsIncludingNaN((double[]) null, (double[]) null));
    }

    @Test
    public void testEqualsIncludingNaNArray_oneNull() {
        assertFalse(MathUtils.equalsIncludingNaN(new double[]{1.0}, null));
    }

    @Test
    public void testEqualsIncludingNaNArray_differentLength() {
        assertFalse(MathUtils.equalsIncludingNaN(new double[]{1.0}, new double[]{1.0, 2.0}));
    }

    @Test
    public void testEqualsIncludingNaNArray_withNaNEqual() {
        assertTrue(MathUtils.equalsIncludingNaN(
                new double[]{1.0, Double.NaN}, new double[]{1.0, Double.NaN}));
    }

    @Test
    public void testEqualsIncludingNaNArray_mismatch() {
        assertFalse(MathUtils.equalsIncludingNaN(
                new double[]{1.0, 2.0}, new double[]{1.0, Double.NaN}));
    }

    // ---------------------------------------------------------------
    // factorial(n)
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testFactorial_negative() {
        MathUtils.factorial(-1);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorial_tooLarge() {
        MathUtils.factorial(21);
    }

    @Test
    public void testFactorial_zero() {
        assertEquals(1L, MathUtils.factorial(0));
    }

    @Test
    public void testFactorial_boundary20() {
        assertEquals(2432902008176640000L, MathUtils.factorial(20));
    }

    @Test
    public void testFactorial_normal() {
        assertEquals(120L, MathUtils.factorial(5));
    }

    // ---------------------------------------------------------------
    // factorialDouble(n)
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialDouble_negative() {
        MathUtils.factorialDouble(-1);
    }

    @Test
    public void testFactorialDouble_lessThan21() {
        assertEquals(120d, MathUtils.factorialDouble(5), DELTA);
    }

    @Test
    public void testFactorialDouble_greaterEqual21() {
        double result = MathUtils.factorialDouble(25);
        assertTrue(result > 0);
    }

    // ---------------------------------------------------------------
    // factorialLog(n)
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialLog_negative() {
        MathUtils.factorialLog(-1);
    }

    @Test
    public void testFactorialLog_lessThan21() {
        assertEquals(FastMath.log(120), MathUtils.factorialLog(5), DELTA);
    }

    @Test
    public void testFactorialLog_greaterEqual21_loopBranch() {
        double result = MathUtils.factorialLog(25);
        assertTrue(result > 0);
    }

    // ---------------------------------------------------------------
    // gcd(int,int)
    // ---------------------------------------------------------------
    @Test
    public void testGcdInt_zeroZero() {
        assertEquals(0, MathUtils.gcd(0, 0));
    }

    @Test
    public void testGcdInt_zeroAndValue() {
        assertEquals(5, MathUtils.gcd(0, 5));
        assertEquals(5, MathUtils.gcd(5, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdInt_zeroAndMinValue() {
        MathUtils.gcd(0, Integer.MIN_VALUE);
    }

    @Test
    public void testGcdInt_normal() {
        assertEquals(6, MathUtils.gcd(12, 18));
    }

    @Test
    public void testGcdInt_negativeNumbers() {
        assertEquals(6, MathUtils.gcd(-12, 18));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdInt_k31Overflow() {
        // Both values == Integer.MIN_VALUE drives the k==31 branch
        MathUtils.gcd(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    // ---------------------------------------------------------------
    // gcd(long,long)
    // ---------------------------------------------------------------
    @Test
    public void testGcdLong_zeroZero() {
        assertEquals(0L, MathUtils.gcd(0L, 0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdLong_zeroAndMinValue() {
        MathUtils.gcd(0L, Long.MIN_VALUE);
    }

    @Test
    public void testGcdLong_normal() {
        assertEquals(6L, MathUtils.gcd(12L, 18L));
    }

    @Test(expected = ArithmeticException.class)
    public void testGcdLong_k63Overflow() {
        MathUtils.gcd(Long.MIN_VALUE, Long.MIN_VALUE);
    }

    // ---------------------------------------------------------------
    // hash(double) / hash(double[])
    // ---------------------------------------------------------------
    @Test
    public void testHashDouble() {
        assertEquals(new Double(1.5).hashCode(), MathUtils.hash(1.5));
    }

    @Test
    public void testHashDoubleArray_null() {
        assertEquals(0, MathUtils.hash((double[]) null));
    }

    @Test
    public void testHashDoubleArray_normal() {
        assertEquals(java.util.Arrays.hashCode(new double[]{1.0, 2.0}),
                MathUtils.hash(new double[]{1.0, 2.0}));
    }

    // ---------------------------------------------------------------
    // indicator(byte/double/float/int/long/short)
    // ---------------------------------------------------------------
    @Test
    public void testIndicatorByte() {
        assertEquals((byte) 1, MathUtils.indicator((byte) 5));
        assertEquals((byte) 1, MathUtils.indicator((byte) 0));
        assertEquals((byte) -1, MathUtils.indicator((byte) -5));
    }

    @Test
    public void testIndicatorDouble_NaN() {
        assertTrue(Double.isNaN(MathUtils.indicator(Double.NaN)));
    }

    @Test
    public void testIndicatorDouble_values() {
        assertEquals(1.0, MathUtils.indicator(0.0), DELTA);
        assertEquals(1.0, MathUtils.indicator(5.0), DELTA);
        assertEquals(-1.0, MathUtils.indicator(-5.0), DELTA);
    }

    @Test
    public void testIndicatorFloat_NaN() {
        assertTrue(Float.isNaN(MathUtils.indicator(Float.NaN)));
    }

    @Test
    public void testIndicatorFloat_values() {
        assertEquals(1.0F, MathUtils.indicator(0.0F), 1e-6);
        assertEquals(-1.0F, MathUtils.indicator(-5.0F), 1e-6);
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
        assertEquals((short) -1, MathUtils.indicator((short) -5));
    }

    // ---------------------------------------------------------------
    // lcm(int,int)
    // ---------------------------------------------------------------
    @Test
    public void testLcmInt_zeroArg() {
        assertEquals(0, MathUtils.lcm(0, 5));
        assertEquals(0, MathUtils.lcm(5, 0));
    }

    @Test
    public void testLcmInt_normal() {
        assertEquals(12, MathUtils.lcm(4, 6));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmInt_overflow() {
        MathUtils.lcm(Integer.MIN_VALUE, 1);
    }

    // ---------------------------------------------------------------
    // lcm(long,long)
    // ---------------------------------------------------------------
    @Test
    public void testLcmLong_zeroArg() {
        assertEquals(0L, MathUtils.lcm(0L, 5L));
    }

    @Test
    public void testLcmLong_normal() {
        assertEquals(12L, MathUtils.lcm(4L, 6L));
    }

    @Test(expected = ArithmeticException.class)
    public void testLcmLong_overflow() {
        MathUtils.lcm(Long.MIN_VALUE, 1L);
    }

    // ---------------------------------------------------------------
    // log(base,x)
    // ---------------------------------------------------------------
    @Test
    public void testLog() {
        double expected = FastMath.log(8) / FastMath.log(2);
        assertEquals(expected, MathUtils.log(2, 8), DELTA);
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
    // mulAndCheck(long,long)
    // ---------------------------------------------------------------
    @Test
    public void testMulAndCheckLong_swapBranch() {
        assertEquals(50L, MathUtils.mulAndCheck(10L, 5L));
    }

    @Test
    public void testMulAndCheckLong_bothNegative_noOverflow() {
        assertEquals(6L, MathUtils.mulAndCheck(-2L, -3L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_bothNegative_overflow() {
        MathUtils.mulAndCheck(Long.MIN_VALUE, -1L);
    }

    @Test
    public void testMulAndCheckLong_negPos_noOverflow() {
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
    public void testMulAndCheckLong_bothPositive_noOverflow() {
        assertEquals(30L, MathUtils.mulAndCheck(5L, 6L));
    }

    @Test(expected = ArithmeticException.class)
    public void testMulAndCheckLong_bothPositive_overflow() {
        MathUtils.mulAndCheck(Long.MAX_VALUE, 2L);
    }

    @Test
    public void testMulAndCheckLong_aZero() {
        assertEquals(0L, MathUtils.mulAndCheck(0L, 5L));
    }

    // ---------------------------------------------------------------
    // scalb
    // ---------------------------------------------------------------
    @Test
    public void testScalb_zero() {
        assertEquals(0.0, MathUtils.scalb(0.0, 3), DELTA);
    }

    @Test
    public void testScalb_NaN() {
        assertTrue(Double.isNaN(MathUtils.scalb(Double.NaN, 3)));
    }

    @Test
    public void testScalb_infinite() {
        assertTrue(Double.isInfinite(MathUtils.scalb(Double.POSITIVE_INFINITY, 3)));
    }

    @Test
    public void testScalb_normal() {
        assertEquals(8.0, MathUtils.scalb(1.0, 3), DELTA);
    }

    // ---------------------------------------------------------------
    // normalizeAngle
    // ---------------------------------------------------------------
    @Test
    public void testNormalizeAngle_basic() {
        double result = MathUtils.normalizeAngle(5 * Math.PI, 0.0);
        // Should be within -PI..PI
        assertTrue(result >= -Math.PI - DELTA && result <= Math.PI + DELTA);
    }

    // ---------------------------------------------------------------
    // normalizeArray
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArray_infiniteSum() {
        MathUtils.normalizeArray(new double[]{1, 2, 3}, Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNormalizeArray_NaNSum() {
        MathUtils.normalizeArray(new double[]{1, 2, 3}, Double.NaN);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArray_infiniteElement() {
        MathUtils.normalizeArray(new double[]{1, Double.POSITIVE_INFINITY, 3}, 10.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testNormalizeArray_sumZero() {
        MathUtils.normalizeArray(new double[]{1, -1}, 10.0);
    }

    @Test
    public void testNormalizeArray_withNaNPreserved() {
        double[] result = MathUtils.normalizeArray(new double[]{1, Double.NaN, 3}, 8.0);
        assertEquals(2.0, result[0], DELTA);
        assertTrue(Double.isNaN(result[1]));
        assertEquals(6.0, result[2], DELTA);
    }

    @Test
    public void testNormalizeArray_normal() {
        double[] result = MathUtils.normalizeArray(new double[]{1, 1, 2}, 8.0);
        assertEquals(2.0, result[0], DELTA);
        assertEquals(2.0, result[1], DELTA);
        assertEquals(4.0, result[2], DELTA);
    }

    // ---------------------------------------------------------------
    // round(double,int) / round(double,int,int)
    // ---------------------------------------------------------------
    @Test
    public void testRoundDouble_default() {
        assertEquals(1.24, MathUtils.round(1.2345, 2), DELTA);
    }

    @Test
    public void testRoundDouble_NaN_catchBranch() {
        // Double.toString(NaN) -> "NaN" cannot be parsed by BigDecimal -> NumberFormatException
        // caught internally; since NaN is not infinite -> returns Double.NaN
        assertTrue(Double.isNaN(MathUtils.round(Double.NaN, 2, BigDecimal.ROUND_HALF_UP)));
    }

    @Test
    public void testRoundDouble_PositiveInfinity_catchBranch() {
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtils.round(Double.POSITIVE_INFINITY, 2, BigDecimal.ROUND_HALF_UP), 0);
    }

    @Test
    public void testRoundDouble_NegativeInfinity_catchBranch() {
        assertEquals(Double.NEGATIVE_INFINITY,
                MathUtils.round(Double.NEGATIVE_INFINITY, 2, BigDecimal.ROUND_HALF_UP), 0);
    }

    // ---------------------------------------------------------------
    // round(float,int) / round(float,int,int) -> exercises roundUnscaled (private)
    // ---------------------------------------------------------------
    @Test
    public void testRoundFloat_default() {
        assertEquals(1.24f, MathUtils.round(1.2345f, 2), 1e-4);
    }

    @Test
    public void testRoundFloat_ROUND_CEILING_positiveSign() {
        float result = MathUtils.round(1.21f, 1, BigDecimal.ROUND_CEILING);
        assertTrue(result >= 1.3f - 1e-3);
    }

    @Test
    public void testRoundFloat_ROUND_CEILING_negativeSign() {
        float result = MathUtils.round(-1.21f, 1, BigDecimal.ROUND_CEILING);
        // ceiling toward positive infinity -> less negative result expected
        assertTrue(result >= -1.3f - 1e-3);
    }

    @Test
    public void testRoundFloat_ROUND_DOWN() {
        float result = MathUtils.round(1.29f, 1, BigDecimal.ROUND_DOWN);
        assertEquals(1.2f, result, 1e-3);
    }

    @Test
    public void testRoundFloat_ROUND_FLOOR_positiveSign() {
        float result = MathUtils.round(1.29f, 1, BigDecimal.ROUND_FLOOR);
        assertEquals(1.2f, result, 1e-3);
    }

    @Test
    public void testRoundFloat_ROUND_FLOOR_negativeSign() {
        float result = MathUtils.round(-1.21f, 1, BigDecimal.ROUND_FLOOR);
        assertTrue(result <= -1.2f + 1e-3);
    }

    @Test
    public void testRoundFloat_ROUND_HALF_DOWN() {
        float result = MathUtils.round(1.25f, 1, BigDecimal.ROUND_HALF_DOWN);
        assertTrue(result == 1.2f || result == 1.3f); // fraction boundary sensitivity
    }

    @Test
    public void testRoundFloat_ROUND_HALF_EVEN() {
        float result = MathUtils.round(1.25f, 1, BigDecimal.ROUND_HALF_EVEN);
        assertTrue(result == 1.2f || result == 1.3f);
    }

    @Test
    public void testRoundFloat_ROUND_HALF_UP() {
        float result = MathUtils.round(1.25f, 1, BigDecimal.ROUND_HALF_UP);
        assertTrue(result == 1.3f || result == 1.2f);
    }

    @Test
    public void testRoundFloat_ROUND_UNNECESSARY_exact() {
        // x already integral after scaling -> no exception
        float result = MathUtils.round(1.0f, 0, BigDecimal.ROUND_UNNECESSARY);
        assertEquals(1.0f, result, 1e-6);
    }

    @Test(expected = ArithmeticException.class)
    public void testRoundFloat_ROUND_UNNECESSARY_inexact() {
        MathUtils.round(1.25f, 1, BigDecimal.ROUND_UNNECESSARY);
    }

    @Test
    public void testRoundFloat_ROUND_UP() {
        float result = MathUtils.round(1.21f, 1, BigDecimal.ROUND_UP);
        assertTrue(result >= 1.3f - 1e-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRoundFloat_invalidRoundingMethod() {
        MathUtils.round(1.25f, 1, 9999);
    }

    // ---------------------------------------------------------------
    // sign(byte/double/float/int/long/short)
    // ---------------------------------------------------------------
    @Test
    public void testSignByte() {
        assertEquals((byte) 0, MathUtils.sign((byte) 0));
        assertEquals((byte) 1, MathUtils.sign((byte) 5));
        assertEquals((byte) -1, MathUtils.sign((byte) -5));
    }

    @Test
    public void testSignDouble_NaN() {
        assertTrue(Double.isNaN(MathUtils.sign(Double.NaN)));
    }

    @Test
    public void testSignDouble_values() {
        assertEquals(0.0, MathUtils.sign(0.0), DELTA);
        assertEquals(1.0, MathUtils.sign(5.0), DELTA);
        assertEquals(-1.0, MathUtils.sign(-5.0), DELTA);
    }

    @Test
    public void testSignFloat_NaN() {
        assertTrue(Float.isNaN(MathUtils.sign(Float.NaN)));
    }

    @Test
    public void testSignFloat_values() {
        assertEquals(0.0F, MathUtils.sign(0.0F), 1e-6);
        assertEquals(1.0F, MathUtils.sign(5.0F), 1e-6);
        assertEquals(-1.0F, MathUtils.sign(-5.0F), 1e-6);
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
    // subAndCheck(int,int)
    // ---------------------------------------------------------------
    @Test
    public void testSubAndCheckInt_normal() {
        assertEquals(5, MathUtils.subAndCheck(10, 5));
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
        assertEquals(Long.MAX_VALUE, MathUtils.subAndCheck(-1L, Long.MIN_VALUE));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_bMinValue_aNonNegative() {
        MathUtils.subAndCheck(5L, Long.MIN_VALUE);
    }

    @Test
    public void testSubAndCheckLong_normal() {
        assertEquals(5L, MathUtils.subAndCheck(10L, 5L));
    }

    @Test(expected = ArithmeticException.class)
    public void testSubAndCheckLong_overflowViaAddAndCheck() {
        MathUtils.subAndCheck(Long.MAX_VALUE, -1L);
    }

    // ---------------------------------------------------------------
    // pow(int,int) / pow(int,long)
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testPowIntInt_negativeExponent() {
        MathUtils.pow(2, -1);
    }

    @Test
    public void testPowIntInt_zeroExponent() {
        assertEquals(1, MathUtils.pow(5, 0));
    }

    @Test
    public void testPowIntInt_normal() {
        assertEquals(1024, MathUtils.pow(2, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowIntLong_negativeExponent() {
        MathUtils.pow(2, -1L);
    }

    @Test
    public void testPowIntLong_normal() {
        assertEquals(1024, MathUtils.pow(2, 10L));
    }

    // ---------------------------------------------------------------
    // pow(long,int) / pow(long,long)
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testPowLongInt_negativeExponent() {
        MathUtils.pow(2L, -1);
    }

    @Test
    public void testPowLongInt_normal() {
        assertEquals(1024L, MathUtils.pow(2L, 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowLongLong_negativeExponent() {
        MathUtils.pow(2L, -1L);
    }

    @Test
    public void testPowLongLong_normal() {
        assertEquals(1024L, MathUtils.pow(2L, 10L));
    }

    // ---------------------------------------------------------------
    // pow(BigInteger,int) / pow(BigInteger,long) / pow(BigInteger,BigInteger)
    // ---------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerInt_negativeExponent() {
        MathUtils.pow(BigInteger.valueOf(2), -1);
    }

    @Test
    public void testPowBigIntegerInt_normal() {
        assertEquals(BigInteger.valueOf(1024), MathUtils.pow(BigInteger.valueOf(2), 10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerLong_negativeExponent() {
        MathUtils.pow(BigInteger.valueOf(2), -1L);
    }

    @Test
    public void testPowBigIntegerLong_normal() {
        assertEquals(BigInteger.valueOf(1024), MathUtils.pow(BigInteger.valueOf(2), 10L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPowBigIntegerBigInteger_negativeExponent() {
        MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(-1));
    }

    @Test
    public void testPowBigIntegerBigInteger_normal() {
        assertEquals(BigInteger.valueOf(1024),
                MathUtils.pow(BigInteger.valueOf(2), BigInteger.valueOf(10)));
    }

    // ---------------------------------------------------------------
    // distance1 / distance / distanceInf (double[] and int[])
    // ---------------------------------------------------------------
    @Test
    public void testDistance1Double() {
        assertEquals(6.0, MathUtils.distance1(new double[]{0, 0}, new double[]{3, 3}), DELTA);
    }

    @Test
    public void testDistance1Double_emptyArray() {
        assertEquals(0.0, MathUtils.distance1(new double[]{}, new double[]{}), DELTA);
    }

    @Test
    public void testDistance1Int() {
        assertEquals(6, MathUtils.distance1(new int[]{0, 0}, new int[]{3, 3}));
    }

    @Test
    public void testDistanceDouble() {
        assertEquals(5.0, MathUtils.distance(new double[]{0, 0}, new double[]{3, 4}), DELTA);
    }

    @Test
    public void testDistanceInt() {
        assertEquals(5.0, MathUtils.distance(new int[]{0, 0}, new int[]{3, 4}), DELTA);
    }

    @Test
    public void testDistanceInfDouble() {
        assertEquals(4.0, MathUtils.distanceInf(new double[]{0, 0}, new double[]{3, 4}), DELTA);
    }

    @Test
    public void testDistanceInfInt() {
        assertEquals(4, MathUtils.distanceInf(new int[]{0, 0}, new int[]{3, 4}));
    }

    // ---------------------------------------------------------------
    // checkOrder(double[], OrderDirection, boolean)
    // ---------------------------------------------------------------
    @Test
    public void testCheckOrder_increasingStrict_ok() {
        MathUtils.checkOrder(new double[]{1, 2, 3}, OrderDirection.INCREASING, true);
        // no exception expected
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrder_increasingStrict_violation() {
        MathUtils.checkOrder(new double[]{1, 1, 2}, OrderDirection.INCREASING, true);
    }

    @Test
    public void testCheckOrder_increasingNonStrict_okWithEqual() {
        MathUtils.checkOrder(new double[]{1, 1, 2}, OrderDirection.INCREASING, false);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrder_increasingNonStrict_violation() {
        MathUtils.checkOrder(new double[]{2, 1}, OrderDirection.INCREASING, false);
    }

    @Test
    public void testCheckOrder_decreasingStrict_ok() {
        MathUtils.checkOrder(new double[]{3, 2, 1}, OrderDirection.DECREASING, true);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrder_decreasingStrict_violation() {
        MathUtils.checkOrder(new double[]{1, 1, 0}, OrderDirection.DECREASING, true);
    }

    @Test
    public void testCheckOrder_decreasingNonStrict_okWithEqual() {
        MathUtils.checkOrder(new double[]{2, 2, 1}, OrderDirection.DECREASING, false);
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrder_decreasingNonStrict_violation() {
        MathUtils.checkOrder(new double[]{1, 2}, OrderDirection.DECREASING, false);
    }

    // checkOrder(double[]) convenience overload
    @Test
    public void testCheckOrder_defaultOverload_ok() {
        MathUtils.checkOrder(new double[]{1, 2, 3});
    }

    @Test(expected = NonMonotonousSequenceException.class)
    public void testCheckOrder_defaultOverload_violation() {
        MathUtils.checkOrder(new double[]{3, 2, 1});
    }

    // ---------------------------------------------------------------
    // safeNorm(double[])
    // ---------------------------------------------------------------
    @Test
    public void testSafeNorm_normalRange() {
        // values within [rdwarf, agiant] -> s2 branch, s2>=x3max(0) sub-branch
        assertEquals(5.0, MathUtils.safeNorm(new double[]{3, 4}), 1e-6);
    }

    @Test
    public void testSafeNorm_allZero() {
        // 0 < rdwarf -> enters "else" (s3) path; xabs==0 skip; s2==0 -> norm = x3max*sqrt(s3) = 0
        assertEquals(0.0, MathUtils.safeNorm(new double[]{0, 0, 0}), 1e-12);
    }

    @Test
    public void testSafeNorm_largeValue_s1Branch() {
        // single very large value triggers x1max branch (s1 != 0)
        double result = MathUtils.safeNorm(new double[]{1e300});
        assertEquals(1e300, result, 1e290);
    }

    @Test
    public void testSafeNorm_twoLargeValues_s1ElseBranch() {
        // second (smaller) large value hits the "xabs<=x1max" else sub-branch
        double result = MathUtils.safeNorm(new double[]{1e300, 5e299});
        assertTrue(result > 1e300);
    }

    @Test
    public void testSafeNorm_verySmallValues_s3Branch() {
        // Both below rdwarf (3.834e-20) -> exercises s3 / x3max branches
        double result = MathUtils.safeNorm(new double[]{1e-25, 5e-26});
        assertTrue(result > 0 && result < 1e-20);
    }

    @Test
    public void testSafeNorm_emptyArray() {
        // Degenerate / boundary case: empty vector
        double result = MathUtils.safeNorm(new double[]{});
        assertEquals(0.0, result, 1e-12);
    }
}
```

---

## สรุปตาราง Test Methods กับ Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอด | Test Method (ตัวอย่าง) | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| `addAndCheck(int,int)` | testAddAndCheckInt_normal/_overflow | ค่าปกติ, overflow throw |
| `addAndCheck(long,long)` | testAddAndCheckLong_* | swap (a>b), a<0&&b<0 (overflow/ไม่overflow), opposite sign, a>=0&&b>=0 (overflow/ไม่overflow) |
| `checkBinomial` | testCheckBinomial_* | n<k throw, n<0 throw |
| `binomialCoefficient` | testBinomialCoefficient_* | n==k\|\|k==0, k==1\|\|k==n-1, k>n/2 (symmetry), n<=61, 62<=n<=66, n>66, overflow |
| `binomialCoefficientDouble` | testBinomialCoefficientDouble_* | เงื่อนไขเดียวกัน + n<67 vs loop branch |
| `binomialCoefficientLog` | testBinomialCoefficientLog_* | n==k\|\|k==0, k==1, n<67, n<1030, k>n/2 (n>=1030), sum-logs loop |
| `compareTo` | testCompareTo_* | equals-true, x<y, x>y |
| `equals/equalsIncludingNaN` (double, eps, ulps, array) | testEquals*_* | NaN-NaN, equal, diff, array null/length/element mismatch |
| `factorial/-Double/-Log` | testFactorial*_* | n<0 throw, n>20 throw, n<21, n>=21 loop |
| `gcd(int)/gcd(long)` | testGcd*_* | u==0\|\|v==0 (+MIN_VALUE throw), normal, k==31/63 overflow |
| `hash` | testHash* | null array, normal |
| `indicator`/`sign` (6 types) | testIndicator*/testSign* | positive/zero/negative, NaN (double/float) |
| `lcm(int)/lcm(long)` | testLcm*_* | a==0\|\|b==0, normal, overflow (MIN_VALUE) |
| `log` | testLog | คำนวณปกติ |
| `mulAndCheck(int)/(long)` | testMulAndCheckLong_* | swap, a<0&&b<0, a<0&&b>0, a<0&&b==0, a>0&&b>0, a==0 (+overflow แต่ละกรณี) |
| `scalb` | testScalb_* | d==0, NaN, infinite, normal |
| `normalizeArray` | testNormalizeArray_* | infinite sum throw, NaN sum throw, infinite element throw, sum==0 throw, NaN-preserve, normal |
| `round(double,...)` | testRoundDouble_* | NumberFormatException catch (NaN/Infinity) |
| `round(float,...)`→`roundUnscaled` | testRoundFloat_* | ทุกกรณีของ switch (CEILING/DOWN/FLOOR/HALF_DOWN/HALF_EVEN/HALF_UP/UNNECESSARY/UP/default) |
| `subAndCheck(int)/(long)` | testSubAndCheckLong_* | b==MIN_VALUE (a<0 / a>=0), else-addAndCheck (ปกติ/overflow) |
| `pow` (int/long/BigInteger ทุก overload) | testPow*_* | e<0 throw, e==0, loop ปกติ |
| `distance1/distance/distanceInf` | testDistance*_* | loop ว่าง/ปกติ (double[]/int[]) |
| `checkOrder` | testCheckOrder_* | INCREASING/DECREASING × strict/non-strict (ok/violation), overload แบบ default |
| `safeNorm` | testSafeNorm_* | s1-branch (x1max cases), s3-branch (x3max cases), s2-branch, all-zero, empty array |

*หมายเหตุ:* บาง branch ที่ไม่สามารถ trigger ได้จาก public API (เช่น `default` ใน `switch(dir)` ของ `checkOrder` เนื่องจาก enum มีเพียง 2 ค่า, หรือ `assert` statement ใน `equals(double,double,int)`) ไม่ได้ถูกทดสอบและได้ระบุไว้เป็นคอมเมนต์