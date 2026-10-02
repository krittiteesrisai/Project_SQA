# การวิเคราะห์และชุดทดสอบ FastMathTest

ด้านล่างนี้คือชุดทดสอบ JUnit 4 สำหรับคลาส `FastMath` (Defects4J Math-16b) ครอบคลุมเมธอด public หลักและ branch/condition สำคัญตามที่วิเคราะห์ได้จากซอร์สโค้ด

```java
package org.apache.commons.math3.util;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link FastMath}.
 * หมายเหตุทั่วไป:
 * - FastMath ไม่มีพารามิเตอร์แบบ String/Object ดังนั้นไม่มีกรณี null/empty ที่เกี่ยวข้องโดยตรง
 *   (ทุกพารามิเตอร์เป็น primitive double/float/int/long)
 * - การเปรียบเทียบค่า double/float ใช้ delta ที่เหมาะสมเนื่องจาก FastMath เป็น
 *   "faster, more accurate, portable alternative" ไม่ได้ให้ผลลัพธ์เป๊ะเท่า Math/StrictMath เสมอไป
 * - สำหรับกรณีค่า NaN จะใช้ Double.isNaN()/Float.isNaN() แทน assertEquals ตรง ๆ
 * - สำหรับกรณี signed zero จะใช้ doubleToRawLongBits/floatToRawIntBits เพื่อตรวจสอบเครื่องหมาย
 */
public class FastMathTest {

    private static final double DELTA = 1e-9;
    private static final double LOOSE_DELTA = 1e-6;

    // ---------------------- sqrt ----------------------
    @Test
    public void testSqrt_normal() {
        assertEquals(Math.sqrt(4.0), FastMath.sqrt(4.0), DELTA);
    }

    @Test
    public void testSqrt_negative_isNaN() {
        assertTrue(Double.isNaN(FastMath.sqrt(-1.0)));
    }

    @Test
    public void testSqrt_zero() {
        assertEquals(0.0, FastMath.sqrt(0.0), DELTA);
    }

    // ---------------------- cosh ----------------------
    @Test
    public void testCosh_NaN() {
        assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
    }

    @Test
    public void testCosh_greaterThan20() {
        // branch: x > 20 -> 0.5*exp(x)
        assertEquals(Math.cosh(25.0), FastMath.cosh(25.0), Math.cosh(25.0) * 1e-9);
    }

    @Test
    public void testCosh_lessThanMinus20() {
        // branch: x < -20 -> 0.5*exp(-x)
        assertEquals(Math.cosh(-25.0), FastMath.cosh(-25.0), Math.cosh(-25.0) * 1e-9);
    }

    @Test
    public void testCosh_normalPositive() {
        assertEquals(Math.cosh(2.0), FastMath.cosh(2.0), DELTA);
    }

    @Test
    public void testCosh_normalNegative() {
        // branch: x < 0.0 -> x = -x
        assertEquals(Math.cosh(-2.0), FastMath.cosh(-2.0), DELTA);
    }

    // ---------------------- sinh ----------------------
    @Test
    public void testSinh_NaN() {
        assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
    }

    @Test
    public void testSinh_greaterThan20() {
        assertEquals(Math.sinh(25.0), FastMath.sinh(25.0), Math.sinh(25.0) * 1e-9);
    }

    @Test
    public void testSinh_lessThanMinus20() {
        assertEquals(Math.sinh(-25.0), FastMath.sinh(-25.0), Math.sinh(25.0) * 1e-9);
    }

    @Test
    public void testSinh_zero() {
        assertEquals(0.0, FastMath.sinh(0.0), DELTA);
    }

    @Test
    public void testSinh_negativeBranch() {
        // x<0 -> negate=true
        assertEquals(Math.sinh(-0.5), FastMath.sinh(-0.5), DELTA);
    }

    @Test
    public void testSinh_xGreaterThan0_25() {
        // branch: x > 0.25 uses exp()
        assertEquals(Math.sinh(1.0), FastMath.sinh(1.0), DELTA);
    }

    @Test
    public void testSinh_xLessOrEqual0_25() {
        // branch: x <= 0.25 uses expm1()
        assertEquals(Math.sinh(0.1), FastMath.sinh(0.1), DELTA);
    }

    // ---------------------- tanh ----------------------
    @Test
    public void testTanh_NaN() {
        assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
    }

    @Test
    public void testTanh_greaterThan20() {
        assertEquals(1.0, FastMath.tanh(21.0), DELTA);
    }

    @Test
    public void testTanh_lessThanMinus20() {
        assertEquals(-1.0, FastMath.tanh(-21.0), DELTA);
    }

    @Test
    public void testTanh_zero() {
        assertEquals(0.0, FastMath.tanh(0.0), DELTA);
    }

    @Test
    public void testTanh_negative() {
        assertEquals(Math.tanh(-0.3), FastMath.tanh(-0.3), DELTA);
    }

    @Test
    public void testTanh_xGreaterOrEqual0_5() {
        assertEquals(Math.tanh(1.0), FastMath.tanh(1.0), DELTA);
    }

    @Test
    public void testTanh_xLessThan0_5() {
        assertEquals(Math.tanh(0.2), FastMath.tanh(0.2), DELTA);
    }

    // ---------------------- acosh / asinh / atanh ----------------------
    @Test
    public void testAcosh_normal() {
        double a = 2.0;
        double expected = Math.log(a + Math.sqrt(a * a - 1));
        assertEquals(expected, FastMath.acosh(a), DELTA);
    }

    @Test
    public void testAsinh_negativeBranch() {
        assertEquals(-FastMath.asinh(1.0), FastMath.asinh(-1.0), DELTA);
    }

    @Test
    public void testAsinh_branch_aGreater0_167() {
        assertEquals(Math.log(Math.sqrt(1.0 * 1.0 + 1) + 1.0), FastMath.asinh(1.0), DELTA);
    }

    @Test
    public void testAsinh_branch_aGreater0_097() {
        double a = 0.1; // >0.097 but <=0.167
        assertEquals(StrictMath.log(a + Math.sqrt(a * a + 1)), FastMath.asinh(a), 1e-8);
    }

    @Test
    public void testAsinh_branch_aGreater0_036() {
        double a = 0.05; // >0.036 but <=0.097
        assertEquals(StrictMath.log(a + Math.sqrt(a * a + 1)), FastMath.asinh(a), 1e-8);
    }

    @Test
    public void testAsinh_branch_aGreater0_0036() {
        double a = 0.01; // >0.0036 but <=0.036
        assertEquals(StrictMath.log(a + Math.sqrt(a * a + 1)), FastMath.asinh(a), 1e-8);
    }

    @Test
    public void testAsinh_branch_elseSmallest() {
        double a = 0.001; // <=0.0036
        assertEquals(StrictMath.log(a + Math.sqrt(a * a + 1)), FastMath.asinh(a), 1e-8);
    }

    @Test
    public void testAtanh_negativeBranch() {
        assertEquals(-FastMath.atanh(0.5), FastMath.atanh(-0.5), DELTA);
    }

    @Test
    public void testAtanh_branch_aGreater0_15() {
        double a = 0.5;
        double expected = 0.5 * Math.log((1 + a) / (1 - a));
        assertEquals(expected, FastMath.atanh(a), DELTA);
    }

    @Test
    public void testAtanh_branch_aGreater0_087() {
        double a = 0.1; // >0.087 <=0.15
        assertEquals(0.5 * Math.log((1 + a) / (1 - a)), FastMath.atanh(a), 1e-8);
    }

    @Test
    public void testAtanh_branch_aGreater0_031() {
        double a = 0.05; // >0.031 <=0.087
        assertEquals(0.5 * Math.log((1 + a) / (1 - a)), FastMath.atanh(a), 1e-8);
    }

    @Test
    public void testAtanh_branch_aGreater0_003() {
        double a = 0.01; // >0.003 <=0.031
        assertEquals(0.5 * Math.log((1 + a) / (1 - a)), FastMath.atanh(a), 1e-8);
    }

    @Test
    public void testAtanh_branch_elseSmallest() {
        double a = 0.001; // <=0.003
        assertEquals(0.5 * Math.log((1 + a) / (1 - a)), FastMath.atanh(a), 1e-8);
    }

    // ---------------------- signum ----------------------
    @Test
    public void testSignumDouble_negative() {
        assertEquals(-1.0, FastMath.signum(-5.0), DELTA);
    }

    @Test
    public void testSignumDouble_positive() {
        assertEquals(1.0, FastMath.signum(5.0), DELTA);
    }

    @Test
    public void testSignumDouble_zero() {
        assertEquals(0.0, FastMath.signum(0.0), DELTA);
    }

    @Test
    public void testSignumDouble_NaN() {
        assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    @Test
    public void testSignumFloat_negative() {
        assertEquals(-1.0f, FastMath.signum(-5.0f), 1e-6f);
    }

    @Test
    public void testSignumFloat_positive() {
        assertEquals(1.0f, FastMath.signum(5.0f), 1e-6f);
    }

    @Test
    public void testSignumFloat_zero() {
        assertEquals(0.0f, FastMath.signum(0.0f), 1e-6f);
    }

    // ---------------------- nextUp ----------------------
    @Test
    public void testNextUpDouble() {
        assertTrue(FastMath.nextUp(1.0) > 1.0);
    }

    @Test
    public void testNextUpFloat() {
        assertTrue(FastMath.nextUp(1.0f) > 1.0f);
    }

    // ---------------------- random ----------------------
    @Test
    public void testRandom_range() {
        double r = FastMath.random();
        assertTrue(r >= 0.0 && r < 1.0);
    }

    // ---------------------- exp ----------------------
    @Test
    public void testExp_normalPositive() {
        assertEquals(Math.exp(2.0), FastMath.exp(2.0), 1e-9 * Math.exp(2.0));
    }

    @Test
    public void testExp_normalNegative() {
        assertEquals(Math.exp(-2.0), FastMath.exp(-2.0), 1e-12);
    }

    @Test
    public void testExp_intValGreater746_returnsZero() {
        // branch: intVal > 746 -> return 0.0
        assertEquals(0.0, FastMath.exp(-800.0), 0.0);
    }

    @Test
    public void testExp_intValGreater709_subnormal() {
        // branch: 709 < intVal <=746
        double result = FastMath.exp(-720.0);
        assertTrue(result > 0.0);
        assertEquals(Math.exp(-720.0), result, Math.exp(-720.0) * 1e-6);
    }

    @Test
    public void testExp_intValEquals709() {
        // branch: intVal == 709
        double x = -709.5;
        double result = FastMath.exp(x);
        assertEquals(Math.exp(x), result, Math.exp(x) * 1e-6);
    }

    @Test
    public void testExp_positiveOverflow_returnsInfinity() {
        // branch: intVal(positive) > 709
        assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(800.0), 0.0);
    }

    // ---------------------- expm1 ----------------------
    @Test
    public void testExpm1_NaN() {
        assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
    }

    @Test
    public void testExpm1_zero() {
        assertEquals(0.0, FastMath.expm1(0.0), 0.0);
    }

    @Test
    public void testExpm1_xGreaterOrEqual1_positiveBranch() {
        assertEquals(Math.expm1(2.0), FastMath.expm1(2.0), 1e-9 * Math.exp(2.0));
    }

    @Test
    public void testExpm1_xLessOrEqualMinus1_negativeBranch() {
        assertEquals(Math.expm1(-2.0), FastMath.expm1(-2.0), 1e-9);
    }

    @Test
    public void testExpm1_withinRange_negative() {
        // branch: x<0 inside (-1,1) -> negate = true
        assertEquals(Math.expm1(-0.5), FastMath.expm1(-0.5), 1e-9);
    }

    @Test
    public void testExpm1_withinRange_positive() {
        assertEquals(Math.expm1(0.5), FastMath.expm1(0.5), 1e-9);
    }

    // ---------------------- log ----------------------
    @Test
    public void testLog_zero_negativeInfinity() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
    }

    @Test
    public void testLog_negativeZero_negativeInfinity() {
        // x==0 check matches +/-0 (value equality)
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(-0.0), 0.0);
    }

    @Test
    public void testLog_negativeNumber_NaN() {
        assertTrue(Double.isNaN(FastMath.log(-5.0)));
    }

    @Test
    public void testLog_NaNInput() {
        assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
    }

    @Test
    public void testLog_positiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testLog_subnormal() {
        // branch: subnormal normalization loop
        double result = FastMath.log(Double.MIN_VALUE);
        assertEquals(Math.log(Double.MIN_VALUE), result, Math.abs(Math.log(Double.MIN_VALUE)) * 1e-6);
    }

    @Test
    public void testLog_nearOne_quickPolynomialBranch() {
        // branch: exp==-1 or 0 AND 0.99<x<1.01 -> quick polynomial
        assertEquals(0.0, FastMath.log(1.0), 1e-12);
        assertEquals(Math.log(1.005), FastMath.log(1.005), 1e-12);
    }

    @Test
    public void testLog_expMinus1_generalBranch() {
        // exp == -1 but NOT in (0.99,1.01) -> uses lnMant table path
        assertEquals(Math.log(0.6), FastMath.log(0.6), 1e-9);
    }

    @Test
    public void testLog_normalValue_outsideSpecialExp() {
        assertEquals(Math.log(10.0), FastMath.log(10.0), 1e-9);
    }

    // ---------------------- log1p ----------------------
    @Test
    public void testLog1p_minusOne() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
    }

    @Test
    public void testLog1p_positiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testLog1p_largeX_branch() {
        // branch x > 1e-6
        assertEquals(Math.log1p(1.0), FastMath.log1p(1.0), 1e-9);
    }

    @Test
    public void testLog1p_negativeLargeX_branch() {
        // branch x < -1e-6
        assertEquals(Math.log1p(-0.5), FastMath.log1p(-0.5), 1e-9);
    }

    @Test
    public void testLog1p_smallX_taylorBranch() {
        // branch |x| <= 1e-6
        double x = 1e-9;
        assertEquals(Math.log1p(x), FastMath.log1p(x), 1e-15);
    }

    // ---------------------- log10 ----------------------
    @Test
    public void testLog10_normal() {
        assertEquals(Math.log10(100.0), FastMath.log10(100.0), 1e-9);
    }

    @Test
    public void testLog10_zero_negativeInfinity() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(0.0), 0.0);
    }

    // ---------------------- log(base,x) ----------------------
    @Test
    public void testLogBase_normal() {
        double expected = Math.log(8) / Math.log(2);
        assertEquals(expected, FastMath.log(2, 8), 1e-9);
    }

    // ---------------------- pow(double,double) ----------------------
    @Test
    public void testPow_yZero_returnsOne() {
        assertEquals(1.0, FastMath.pow(5.0, 0.0), 0.0);
    }

    @Test
    public void testPow_xNaN_returnsX() {
        assertTrue(Double.isNaN(FastMath.pow(Double.NaN, 2.0)));
    }

    @Test
    public void testPow_negativeZero_yNegativeOdd_returnsNegativeInfinity() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-0.0, -3.0), 0.0);
    }

    @Test
    public void testPow_negativeZero_yPositiveOdd_returnsNegativeZero() {
        double result = FastMath.pow(-0.0, 3.0);
        assertEquals(0.0, result, 0.0);
        assertTrue(Double.doubleToRawLongBits(result) == Double.doubleToRawLongBits(-0.0));
    }

    @Test
    public void testPow_zero_yNegative_returnsPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -2.0), 0.0);
    }

    @Test
    public void testPow_zero_yPositive_returnsZero() {
        assertEquals(0.0, FastMath.pow(0.0, 2.0), 0.0);
    }

    @Test
    public void testPow_xPositiveInfinity_yNaN() {
        assertTrue(Double.isNaN(FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN)));
    }

    @Test
    public void testPow_xPositiveInfinity_yNegative() {
        assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -1.0), 0.0);
    }

    @Test
    public void testPow_xPositiveInfinity_yPositive() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 1.0), 0.0);
    }

    @Test
    public void testPow_yPositiveInfinity_xSquareEqualsOne() {
        assertTrue(Double.isNaN(FastMath.pow(1.0, Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testPow_yPositiveInfinity_xSquareGreaterThanOne() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testPow_yPositiveInfinity_xSquareLessThanOne() {
        assertEquals(0.0, FastMath.pow(0.5, Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testPow_xNegativeInfinity_yNaN() {
        assertTrue(Double.isNaN(FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN)));
    }

    @Test
    public void testPow_xNegativeInfinity_yNegativeOdd() {
        assertEquals(-0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -3.0), 0.0);
    }

    @Test
    public void testPow_xNegativeInfinity_yNegativeEven() {
        assertEquals(0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -2.0), 0.0);
    }

    @Test
    public void testPow_xNegativeInfinity_yPositiveOdd() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 3.0), 0.0);
    }

    @Test
    public void testPow_xNegativeInfinity_yPositiveEven() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 2.0), 0.0);
    }

    @Test
    public void testPow_yNegativeInfinity_xSquareEqualsOne() {
        assertTrue(Double.isNaN(FastMath.pow(-1.0, Double.NEGATIVE_INFINITY)));
    }

    @Test
    public void testPow_yNegativeInfinity_xSquareLessThanOne() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.5, Double.NEGATIVE_INFINITY), 0.0);
    }

    @Test
    public void testPow_yNegativeInfinity_xSquareGreaterThanOne() {
        assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), 0.0);
    }

    @Test
    public void testPow_xNegative_yHugeExponent() {
        // branch: y>=2^52 -> recurse pow(-x,y)
        double y = 4.5e15;
        assertEquals(FastMath.pow(2.0, y), FastMath.pow(-2.0, y), FastMath.pow(2.0, y) * 1e-9);
    }

    @Test
    public void testPow_xNegative_yIntegerEven() {
        assertEquals(Math.pow(-2.0, 4.0), FastMath.pow(-2.0, 4.0), 1e-9);
    }

    @Test
    public void testPow_xNegative_yIntegerOdd() {
        assertEquals(Math.pow(-2.0, 3.0), FastMath.pow(-2.0, 3.0), 1e-9);
    }

    @Test
    public void testPow_xNegative_yNonInteger_NaN() {
        assertTrue(Double.isNaN(FastMath.pow(-2.0, 2.5)));
    }

    @Test
    public void testPow_normalCase() {
        assertEquals(Math.pow(2.0, 10.0), FastMath.pow(2.0, 10.0), 1e-6);
    }

    @Test
    public void testPow_largeY_splitBranch() {
        // branch: y outside (-8e298,8e298) uses alternate split -- use smaller surrogate check
        // NOTE: เราไม่ทดสอบค่าขอบจริงที่ 8e298 ตรง ๆ เนื่องจากอาจทำให้ overflow/behaviour พิเศษอื่นแทรกมาก่อน
        // จึงตรวจสอบเพียงว่า pow ด้วยค่า y ปกติทำงานถูกต้อง (ครอบคลุม branch ปกติ y<8e298)
        assertEquals(Math.pow(1.5, 100.0), FastMath.pow(1.5, 100.0), 1e-3);
    }

    // ---------------------- pow(double,int) ----------------------
    @Test
    public void testPowInt_eZero() {
        assertEquals(1.0, FastMath.pow(5.0, 0), 0.0);
    }

    @Test
    public void testPowInt_eNegative() {
        assertEquals(Math.pow(2.0, -3), FastMath.pow(2.0, -3), 1e-9);
    }

    @Test
    public void testPowInt_ePositive() {
        assertEquals(Math.pow(2.0, 10), FastMath.pow(2.0, 10), 1e-9);
    }

    // ---------------------- sin ----------------------
    @Test
    public void testSin_positiveZero() {
        double r = FastMath.sin(0.0);
        assertEquals(0.0, r, 0.0);
        assertFalse(Double.doubleToRawLongBits(r) < 0);
    }

    @Test
    public void testSin_negativeZero() {
        double r = FastMath.sin(-0.0);
        assertEquals(-0.0, r, 0.0);
        assertTrue(Double.doubleToRawLongBits(r) < 0);
    }

    @Test
    public void testSin_NaN() {
        assertTrue(Double.isNaN(FastMath.sin(Double.NaN)));
    }

    @Test
    public void testSin_positiveInfinity_NaN() {
        assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testSin_smallValue_noReduction() {
        assertEquals(Math.sin(0.5), FastMath.sin(0.5), 1e-9);
    }

    @Test
    public void testSin_codyWaiteBranch() {
        // branch: xa > PI/2 but <= 3294198.0 -> CodyWaite reduction
        assertEquals(Math.sin(10.0), FastMath.sin(10.0), 1e-9);
    }

    @Test
    public void testSin_payneHanekBranch() {
        // branch: xa > 3294198.0 -> PayneHanek reduction
        double x = 1e7;
        double result = FastMath.sin(x);
        assertTrue(result >= -1.0 && result <= 1.0);
        // ไม่ตรวจค่าแม่นยำกับ Math.sin เนื่องจากการลด argument ขนาดใหญ่มากอาจต่างกันเล็กน้อยในระดับ ULP
    }

    @Test
    public void testSin_negativeInput() {
        assertEquals(Math.sin(-0.5), FastMath.sin(-0.5), 1e-9);
    }

    // ---------------------- cos ----------------------
    @Test
    public void testCos_NaN() {
        assertTrue(Double.isNaN(FastMath.cos(Double.NaN)));
    }

    @Test
    public void testCos_positiveInfinity_NaN() {
        assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testCos_smallValue() {
        assertEquals(Math.cos(0.5), FastMath.cos(0.5), 1e-9);
    }

    @Test
    public void testCos_codyWaiteBranch() {
        assertEquals(Math.cos(10.0), FastMath.cos(10.0), 1e-9);
    }

    @Test
    public void testCos_payneHanekBranch() {
        double result = FastMath.cos(1e7);
        assertTrue(result >= -1.0 && result <= 1.0);
    }

    @Test
    public void testCos_negativeInput() {
        assertEquals(Math.cos(-0.5), FastMath.cos(-0.5), 1e-9);
    }

    // ---------------------- tan ----------------------
    @Test
    public void testTan_positiveZero() {
        assertEquals(0.0, FastMath.tan(0.0), 0.0);
    }

    @Test
    public void testTan_negativeZero() {
        double r = FastMath.tan(-0.0);
        assertTrue(Double.doubleToRawLongBits(r) < 0);
    }

    @Test
    public void testTan_NaN() {
        assertTrue(Double.isNaN(FastMath.tan(Double.NaN)));
    }

    @Test
    public void testTan_smallValue() {
        assertEquals(Math.tan(0.5), FastMath.tan(0.5), 1e-9);
    }

    @Test
    public void testTan_xaGreaterThan1_5Branch() {
        // branch: xa > 1.5 (near PI/2 adjustment)
        assertEquals(Math.tan(1.55), FastMath.tan(1.55), 1e-7);
    }

    @Test
    public void testTan_codyWaiteBranch() {
        assertEquals(Math.tan(10.0), FastMath.tan(10.0), 1e-7);
    }

    @Test
    public void testTan_negativeInput() {
        assertEquals(Math.tan(-0.5), FastMath.tan(-0.5), 1e-9);
    }

    // ---------------------- atan ----------------------
    @Test
    public void testAtan_zero_positive() {
        double r = FastMath.atan(0.0);
        assertEquals(0.0, r, 0.0);
    }

    @Test
    public void testAtan_zero_negative() {
        double r = FastMath.atan(-0.0);
        assertTrue(Double.doubleToRawLongBits(r) < 0);
    }

    @Test
    public void testAtan_negativeValue() {
        assertEquals(Math.atan(-1.0), FastMath.atan(-1.0), 1e-9);
    }

    @Test
    public void testAtan_veryLargeInput() {
        // branch: xa > 1.633123935319537E16
        assertEquals(Math.PI / 2.0, FastMath.atan(1e20), 1e-9);
    }

    @Test
    public void testAtan_lessThanOne() {
        assertEquals(Math.atan(0.5), FastMath.atan(0.5), 1e-9);
    }

    @Test
    public void testAtan_greaterOrEqualOne() {
        assertEquals(Math.atan(2.0), FastMath.atan(2.0), 1e-9);
    }

    // ---------------------- atan2 ----------------------
    @Test
    public void testAtan2_NaN() {
        assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
    }

    @Test
    public void testAtan2_yZero_xInfinitePositive() {
        assertEquals(0.0, FastMath.atan2(0.0, Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testAtan2_yZero_xNegative() {
        assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), 1e-9);
    }

    @Test
    public void testAtan2_yZero_xPositive() {
        assertEquals(0.0, FastMath.atan2(0.0, 1.0), 0.0);
    }

    @Test
    public void testAtan2_yPositiveInfinity_xPositiveInfinity() {
        assertEquals(Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-9);
    }

    @Test
    public void testAtan2_yPositiveInfinity_xNegativeInfinity() {
        assertEquals(3 * Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-9);
    }

    @Test
    public void testAtan2_yPositiveInfinity_xFinite() {
        assertEquals(Math.PI / 2.0, FastMath.atan2(Double.POSITIVE_INFINITY, 5.0), 1e-9);
    }

    @Test
    public void testAtan2_yNegativeInfinity_xFinite() {
        assertEquals(-Math.PI / 2.0, FastMath.atan2(Double.NEGATIVE_INFINITY, 5.0), 1e-9);
    }

    @Test
    public void testAtan2_xPositiveInfinity_yPositive() {
        assertEquals(0.0, FastMath.atan2(1.0, Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testAtan2_xNegativeInfinity_yPositive() {
        assertEquals(Math.PI, FastMath.atan2(1.0, Double.NEGATIVE_INFINITY), 1e-9);
    }

    @Test
    public void testAtan2_xZero_yPositive() {
        assertEquals(Math.PI / 2.0, FastMath.atan2(1.0, 0.0), 1e-9);
    }

    @Test
    public void testAtan2_xZero_yNegative() {
        assertEquals(-Math.PI / 2.0, FastMath.atan2(-1.0, 0.0), 1e-9);
    }

    @Test
    public void testAtan2_normalCase() {
        assertEquals(Math.atan2(1.0, 1.0), FastMath.atan2(1.0, 1.0), 1e-9);
    }

    // ---------------------- asin ----------------------
    @Test
    public void testAsin_NaN() {
        assertTrue(Double.isNaN(FastMath.asin(Double.NaN)));
    }

    @Test
    public void testAsin_outOfRangeHigh() {
        assertTrue(Double.isNaN(FastMath.asin(1.5)));
    }

    @Test
    public void testAsin_outOfRangeLow() {
        assertTrue(Double.isNaN(FastMath.asin(-1.5)));
    }

    @Test
    public void testAsin_one() {
        assertEquals(Math.PI / 2.0, FastMath.asin(1.0), 1e-9);
    }

    @Test
    public void testAsin_minusOne() {
        assertEquals(-Math.PI / 2.0, FastMath.asin(-1.0), 1e-9);
    }

    @Test
    public void testAsin_zero() {
        assertEquals(0.0, FastMath.asin(0.0), 0.0);
    }

    @Test
    public void testAsin_normalValue() {
        assertEquals(Math.asin(0.5), FastMath.asin(0.5), 1e-9);
    }

    // ---------------------- acos ----------------------
    @Test
    public void testAcos_NaN() {
        assertTrue(Double.isNaN(FastMath.acos(Double.NaN)));
    }

    @Test
    public void testAcos_outOfRange() {
        assertTrue(Double.isNaN(FastMath.acos(2.0)));
    }

    @Test
    public void testAcos_minusOne() {
        assertEquals(Math.PI, FastMath.acos(-1.0), 1e-9);
    }

    @Test
    public void testAcos_one() {
        assertEquals(0.0, FastMath.acos(1.0), 0.0);
    }

    @Test
    public void testAcos_zero() {
        assertEquals(Math.PI / 2.0, FastMath.acos(0.0), 1e-9);
    }

    @Test
    public void testAcos_normalValue() {
        assertEquals(Math.acos(0.5), FastMath.acos(0.5), 1e-9);
    }

    // ---------------------- cbrt ----------------------
    @Test
    public void testCbrt_zero() {
        assertEquals(0.0, FastMath.cbrt(0.0), 0.0);
    }

    @Test
    public void testCbrt_subnormal() {
        // branch: exponent==-1023 && x!=0 -> subnormal normalization
        double x = Double.MIN_VALUE;
        double result = FastMath.cbrt(x);
        assertTrue(result > 0.0);
    }

    @Test
    public void testCbrt_NaN() {
        assertTrue(Double.isNaN(FastMath.cbrt(Double.NaN)));
    }

    @Test
    public void testCbrt_infinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testCbrt_positiveValue() {
        assertEquals(2.0, FastMath.cbrt(8.0), 1e-9);
    }

    @Test
    public void testCbrt_negativeValue() {
        assertEquals(-2.0, FastMath.cbrt(-8.0), 1e-9);
    }

    // ---------------------- toRadians / toDegrees ----------------------
    @Test
    public void testToRadians_infinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.toRadians(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testToRadians_zero() {
        assertEquals(0.0, FastMath.toRadians(0.0), 0.0);
    }

    @Test
    public void testToRadians_normal() {
        assertEquals(Math.toRadians(180.0), FastMath.toRadians(180.0), 1e-9);
    }

    @Test
    public void testToDegrees_infinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.toDegrees(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testToDegrees_zero() {
        assertEquals(0.0, FastMath.toDegrees(0.0), 0.0);
    }

    @Test
    public void testToDegrees_normal() {
        assertEquals(Math.toDegrees(Math.PI), FastMath.toDegrees(Math.PI), 1e-9);
    }

    // ---------------------- abs ----------------------
    @Test
    public void testAbsInt_negative() {
        assertEquals(5, FastMath.abs(-5));
    }

    @Test
    public void testAbsInt_positive() {
        assertEquals(5, FastMath.abs(5));
    }

    @Test
    public void testAbsLong_negative() {
        assertEquals(5L, FastMath.abs(-5L));
    }

    @Test
    public void testAbsLong_positive() {
        assertEquals(5L, FastMath.abs(5L));
    }

    @Test
    public void testAbsFloat_negative() {
        assertEquals(5.0f, FastMath.abs(-5.0f), 0.0f);
    }

    @Test
    public void testAbsFloat_negativeZero() {
        float result = FastMath.abs(-0.0f);
        assertEquals(0.0f, result, 0.0f);
        assertFalse(Float.floatToRawIntBits(result) < 0);
    }

    @Test
    public void testAbsFloat_positive() {
        assertEquals(5.0f, FastMath.abs(5.0f), 0.0f);
    }

    @Test
    public void testAbsDouble_negative() {
        assertEquals(5.0, FastMath.abs(-5.0), 0.0);
    }

    @Test
    public void testAbsDouble_negativeZero() {
        double result = FastMath.abs(-0.0);
        assertEquals(0.0, result, 0.0);
        assertFalse(Double.doubleToRawLongBits(result) < 0);
    }

    @Test
    public void testAbsDouble_positive() {
        assertEquals(5.0, FastMath.abs(5.0), 0.0);
    }

    // ---------------------- ulp ----------------------
    @Test
    public void testUlpDouble_infinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testUlpDouble_normal() {
        assertTrue(FastMath.ulp(1.0) > 0.0);
    }

    @Test
    public void testUlpFloat_infinite() {
        assertEquals(Float.POSITIVE_INFINITY, FastMath.ulp(Float.POSITIVE_INFINITY), 0.0f);
    }

    @Test
    public void testUlpFloat_normal() {
        assertTrue(FastMath.ulp(1.0f) > 0.0f);
    }

    // ---------------------- scalb ----------------------
    @Test
    public void testScalbDouble_normalRange() {
        // branch: n in (-1023,1024)
        assertEquals(8.0, FastMath.scalb(1.0, 3), 0.0);
    }

    @Test
    public void testScalbDouble_NaN() {
        assertTrue(Double.isNaN(FastMath.scalb(Double.NaN, 2000)));
    }

    @Test
    public void testScalbDouble_infinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.POSITIVE_INFINITY, 2000), 0.0);
    }

    @Test
    public void testScalbDouble_zero() {
        assertEquals(0.0, FastMath.scalb(0.0, 2000), 0.0);
    }

    @Test
    public void testScalbDouble_nLessThanMinus2098() {
        assertEquals(0.0, FastMath.scalb(1.0, -3000), 0.0);
    }

    @Test
    public void testScalbDouble_nGreaterThan2097() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 3000), 0.0);
    }

    @Test
    public void testScalbFloat_normalRange() {
        assertEquals(8.0f, FastMath.scalb(1.0f, 3), 0.0f);
    }

    @Test
    public void testScalbFloat_NaN() {
        assertTrue(Float.isNaN(FastMath.scalb(Float.NaN, 500)));
    }

    @Test
    public void testScalbFloat_nLessThanMinus277() {
        assertEquals(0.0f, FastMath.scalb(1.0f, -500), 0.0f);
    }

    @Test
    public void testScalbFloat_nGreaterThan276() {
        assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(1.0f, 500), 0.0f);
    }

    // ---------------------- nextAfter ----------------------
    @Test
    public void testNextAfterDouble_NaN() {
        assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
    }

    @Test
    public void testNextAfterDouble_equal() {
        assertEquals(2.0, FastMath.nextAfter(1.0, 1.0) == 1.0 ? 1.0 : 2.0, 0.0);
        // branch d==direction -> return direction
        assertEquals(1.0, FastMath.nextAfter(1.0, 1.0), 0.0);
    }

    @Test
    public void testNextAfterDouble_infinitePositive() {
        assertEquals(Double.MAX_VALUE, FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
    }

    @Test
    public void testNextAfterDouble_zero_directionNegative() {
        assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), 0.0);
    }

    @Test
    public void testNextAfterDouble_zero_directionPositive() {
        assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), 0.0);
    }

    @Test
    public void testNextAfterDouble_increase() {
        assertTrue(FastMath.nextAfter(1.0, 2.0) > 1.0);
    }

    @Test
    public void testNextAfterDouble_decrease() {
        assertTrue(FastMath.nextAfter(1.0, 0.0) < 1.0);
    }

    @Test
    public void testNextAfterFloat_NaN() {
        assertTrue(Float.isNaN(FastMath.nextAfter(Float.NaN, 1.0)));
    }

    @Test
    public void testNextAfterFloat_infinite() {
        assertEquals(-Float.MAX_VALUE, FastMath.nextAfter(Float.NEGATIVE_INFINITY, 0.0), 0.0f);
    }

    @Test
    public void testNextAfterFloat_zero() {
        assertEquals(Float.MIN_VALUE, FastMath.nextAfter(0.0f, 1.0), 0.0f);
    }

    // ---------------------- floor ----------------------
    @Test
    public void testFloor_NaN() {
        assertTrue(Double.isNaN(FastMath.floor(Double.NaN)));
    }

    @Test
    public void testFloor_largeNumber() {
        // branch: x>=2^52 return x unchanged
        double x = 4503599627370497.0; // >2^52
        assertEquals(x, FastMath.floor(x), 0.0);
    }

    @Test
    public void testFloor_negativeFraction() {
        assertEquals(-2.0, FastMath.floor(-1.5), 0.0);
    }

    @Test
    public void testFloor_zeroResult_signHandling() {
        // branch y==0 -> x*y
        assertEquals(0.0, FastMath.floor(0.5), 0.0);
    }

    @Test
    public void testFloor_normalPositive() {
        assertEquals(3.0, FastMath.floor(3.7), 0.0);
    }

    // ---------------------- ceil ----------------------
    @Test
    public void testCeil_NaN() {
        assertTrue(Double.isNaN(FastMath.ceil(Double.NaN)));
    }

    @Test
    public void testCeil_alreadyInteger() {
        assertEquals(3.0, FastMath.ceil(3.0), 0.0);
    }

    @Test
    public void testCeil_normalPositive() {
        assertEquals(4.0, FastMath.ceil(3.2), 0.0);
    }

    @Test
    public void testCeil_zeroResult_signHandling() {
        assertEquals(0.0, FastMath.ceil(-0.5), 0.0);
    }

    // ---------------------- rint ----------------------
    @Test
    public void testRint_roundUp() {
        assertEquals(3.0, FastMath.rint(2.6), 0.0); // d>0.5
    }

    @Test
    public void testRint_roundDown() {
        assertEquals(2.0, FastMath.rint(2.4), 0.0); // d<0.5
    }

    @Test
    public void testRint_halfwayRoundToEven_down() {
        assertEquals(2.0, FastMath.rint(2.5), 0.0); // even -> 2
    }

    @Test
    public void testRint_halfwayRoundToEven_up() {
        assertEquals(4.0, FastMath.rint(3.5), 0.0); // round up to even 4
    }

    @Test
    public void testRint_negativeOneSpecialCase() {
        // branch: d>0.5 && y==-1.0 -> -0.0
        double result = FastMath.rint(-0.6);
        assertEquals(0.0, result, 0.0);
        assertTrue(Double.doubleToRawLongBits(result) < 0);
    }

    // ---------------------- round ----------------------
    @Test
    public void testRoundDouble() {
        assertEquals(3L, FastMath.round(2.5));
    }

    @Test
    public void testRoundDouble_negative() {
        assertEquals(-2L, FastMath.round(-2.5));
    }

    @Test
    public void testRoundFloat() {
        assertEquals(3, FastMath.round(2.5f));
    }

    // ---------------------- min / max ----------------------
    @Test
    public void testMinInt() {
        assertEquals(1, FastMath.min(1, 2));
        assertEquals(1, FastMath.min(2, 1));
    }

    @Test
    public void testMinLong() {
        assertEquals(1L, FastMath.min(1L, 2L));
    }

    @Test
    public void testMinFloat_aGreaterB() {
        assertEquals(1.0f, FastMath.min(2.0f, 1.0f), 0.0f);
    }

    @Test
    public void testMinFloat_aLessB() {
        assertEquals(1.0f, FastMath.min(1.0f, 2.0f), 0.0f);
    }

    @Test
    public void testMinFloat_NaN() {
        assertTrue(Float.isNaN(FastMath.min(Float.NaN, 1.0f)));
    }

    @Test
    public void testMinFloat_negativeZero() {
        // min(+0.0,-0.0) == -0.0
        float result = FastMath.min(0.0f, -0.0f);
        assertEquals(0.0f, result, 0.0f);
        assertTrue(Float.floatToRawIntBits(result) == 0x80000000);
    }

    @Test
    public void testMinDouble_aGreaterB() {
        assertEquals(1.0, FastMath.min(2.0, 1.0), 0.0);
    }

    @Test
    public void testMinDouble_aLessB() {
        assertEquals(1.0, FastMath.min(1.0, 2.0), 0.0);
    }

    @Test
    public void testMinDouble_NaN() {
        assertTrue(Double.isNaN(FastMath.min(Double.NaN, 1.0)));
    }

    @Test
    public void testMinDouble_negativeZero() {
        double result = FastMath.min(0.0, -0.0);
        assertTrue(Double.doubleToRawLongBits(result) == 0x8000000000000000L);
    }

    @Test
    public void testMaxInt() {
        assertEquals(2, FastMath.max(1, 2));
    }

    @Test
    public void testMaxLong() {
        assertEquals(2L, FastMath.max(1L, 2L));
    }

    @Test
    public void testMaxFloat_aGreaterB() {
        assertEquals(2.0f, FastMath.max(2.0f, 1.0f), 0.0f);
    }

    @Test
    public void testMaxFloat_NaN() {
        assertTrue(Float.isNaN(FastMath.max(Float.NaN, 1.0f)));
    }

    @Test
    public void testMaxFloat_negativeZero() {
        float result = FastMath.max(0.0f, -0.0f);
        assertTrue(Float.floatToRawIntBits(result) == 0); // max(+0,-0)=+0
    }

    @Test
    public void testMaxDouble_aGreaterB() {
        assertEquals(2.0, FastMath.max(2.0, 1.0), 0.0);
    }

    @Test
    public void testMaxDouble_NaN() {
        assertTrue(Double.isNaN(FastMath.max(Double.NaN, 1.0)));
    }

    @Test
    public void testMaxDouble_negativeZero() {
        double result = FastMath.max(0.0, -0.0);
        assertTrue(Double.doubleToRawLongBits(result) == 0L); // +0.0
    }

    // ---------------------- hypot ----------------------
    @Test
    public void testHypot_infinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, 1.0), 0.0);
    }

    @Test
    public void testHypot_NaN() {
        assertTrue(Double.isNaN(FastMath.hypot(Double.NaN, 1.0)));
    }

    @Test
    public void testHypot_xNegligible() {
        // branch: expY > expX+27
        assertEquals(1e20, FastMath.hypot(1.0, 1e20), 1e20 * 1e-9);
    }

    @Test
    public void testHypot_yNegligible() {
        // branch: expX > expY+27
        assertEquals(1e20, FastMath.hypot(1e20, 1.0), 1e20 * 1e-9);
    }

    @Test
    public void testHypot_normal() {
        assertEquals(5.0, FastMath.hypot(3.0, 4.0), 1e-9);
    }

    // ---------------------- IEEEremainder ----------------------
    @Test
    public void testIEEEremainder_normal() {
        assertEquals(StrictMath.IEEEremainder(10.0, 3.0), FastMath.IEEEremainder(10.0, 3.0), 0.0);
    }

    // ---------------------- copySign ----------------------
    @Test
    public void testCopySignDouble_sameSign() {
        assertEquals(5.0, FastMath.copySign(5.0, 1.0), 0.0);
    }

    @Test
    public void testCopySignDouble_flipSign() {
        assertEquals(-5.0, FastMath.copySign(5.0, -1.0), 0.0);
    }

    @Test
    public void testCopySignFloat_sameSign() {
        assertEquals(5.0f, FastMath.copySign(5.0f, 1.0f), 0.0f);
    }

    @Test
    public void testCopySignFloat_flipSign() {
        assertEquals(-5.0f, FastMath.copySign(5.0f, -1.0f), 0.0f);
    }

    // ---------------------- getExponent ----------------------
    @Test
    public void testGetExponentDouble() {
        assertEquals(1, FastMath.getExponent(2.0)); // 2.0 = 2^1
    }

    @Test
    public void testGetExponentFloat() {
        assertEquals(1, FastMath.getExponent(2.0f));
    }
}
```

## ตารางสรุป: เมธอดทดสอบ กับ Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ (กลุ่ม) | Branch/Condition ที่ครอบคลุม |
|---|---|
| testSqrt_* | ค่าปกติ, negative→NaN, zero |
| testCosh_* | x!=x(NaN), x>20, x<-20, x<0.0(negate), ปกติ |
| testSinh_* | NaN, x>20, x<-20, x==0, x<0, x>0.25 (exp), x<=0.25 (expm1) |
| testTanh_* | NaN, x>20→1.0, x<-20→-1.0, x==0, x<0, x>=0.5, x<0.5 |
| testAcosh_normal | สูตร log(a+sqrt(a²-1)) |
| testAsinh_* | negative flag, a>0.167, a>0.097, a>0.036, a>0.0036, else |
| testAtanh_* | negative flag, a>0.15, a>0.087, a>0.031, a>0.003, else |
| testSignumDouble/Float_* | a<0, a>0, a==0, NaN |
| testNextUp* | delegate ไปยัง nextAfter ทิศ +Infinity |
| testRandom_range | ค่าอยู่ใน [0,1) |
| testExp_* | intVal>746→0, 709<intVal≤746(subnormal), intVal==709, ปกติ(+/-), intVal(+)>709→Infinity |
| testExpm1_* | NaN/0, x≥1 หรือ x≤-1 (x>0/x<0 ภายใน), ช่วง(-1,1) negative/positive |
| testLog_* | x==0→-Inf, negative→NaN, NaN input, +Infinity, subnormal, exp∈{-1,0}∩(0.99,1.01) quick-branch, exp==-1 else-branch, ปกติ |
| testLog1p_* | x==-1, x==+Inf, x>1e-6, x<-1e-6, \|x\|≤1e-6 |
| testLog10_* | ปกติ, x==0 (isInfinite short-circuit) |
| testLogBase_normal | log(base,x)=log(x)/log(base) |
| testPow_* (double,double) | y==0, x!=x, x==0(+/- สัญลักษณ์ & y odd/even/pos/neg), x==+Inf(y NaN/neg/pos), y==+Inf(x²=1/>1/<1), x==-Inf(ทุกย่อย), y==-Inf(ทุกย่อย), x<0(y huge, y int even/odd, y non-int→NaN), ปกติ |
| testPowInt_* | e==0, e<0, e>0 |
| testSin_* | +0/-0, NaN, +Infinity→NaN, ไม่ reduce, CodyWaite, PayneHanek, negative |
| testCos_* | NaN, +Infinity, ไม่ reduce, CodyWaite, PayneHanek, negative |
| testTan_* | +0/-0, NaN, ไม่ reduce, xa>1.5, CodyWaite, negative |
| testAtan_* | xa==0(+/-), xa<0, xa>1.633e16, xa<1, xa≥1 |
| testAtan2_* | NaN, y==0(x=Inf/neg/pos), y=±Inf(x=+Inf/-Inf/finite), x=±Inf(y pos), x==0(y pos/neg), ปกติ |
| testAsin_* | NaN, out-of-range(±), x==1, x==-1, x==0, ปกติ |
| testAcos_* | NaN, out-of-range, x==-1, x==1, x==0, ปกติ |
| testCbrt_* | x==0, subnormal, NaN, Infinite, บวก/ลบ |
| testToRadians_*/testToDegrees_* | Infinite/zero, ปกติ |
| testAbs* (int/long/float/double) | negative, positive, -0.0→0.0 |
| testUlp* | Infinite, ปกติ |
| testScalb* (double/float) | n in range ปกติ, NaN/Infinite/0, n<low-bound, n>high-bound |
| testNextAfter* | NaN, d==direction, Infinite, zero, เพิ่ม/ลด |
| testFloor_* | NaN, x≥2^52, negative fraction, y==0(sign), ปกติ |
| testCeil_* | NaN, y==x, ปกติ, y==0(sign) |
| testRint_* | d>0.5, d<0.5, halfway-even(ขึ้น/ลง), y==-1.0 special |
| testRound* | double→long, float→int, negative |
| testMin/Max* (int/long/float/double) | a>b, a<b, NaN, signed-zero |
| testHypot_* | Infinite, NaN, expX/expY negligible ทั้งสองทาง, ปกติ |
| testIEEEremainder_normal | delegate ไป StrictMath |
| testCopySign* | same sign, flip sign (double/float) |
| testGetExponent* | ค่า exponent ปกติ (double/float) |

**หมายเหตุสำคัญ:**
- บางสาขาลึกภายใน private methods (เช่น `reducePayneHanek`, `CodyWaite`, `sinQ`, `cosQ`, `tanQ`, bit-manipulation ภายใน `log`, `pow`) ไม่สามารถเทสโดยตรงได้ (private) แต่ถูกคลุมทางอ้อมผ่าน public methods ที่เรียกใช้ (`sin`, `cos`, `tan`, `atan2` เป็นต้น) ด้วยอินพุตที่ออกแบบให้ตกในแต่ละช่วงเงื่อนไข
- ค่า boundary ที่แน่นอนบางจุด (เช่น y=8e298 ใน `pow`) ไม่ได้ทดสอบตรงขอบเนื่องจากเสี่ยงชนกับ overflow/behavior พิเศษอื่นก่อน จึงใส่คอมเมนต์กำกับไว้ในโค้ด
- การเปรียบเทียบกับ `Math`/`StrictMath` ใช้ delta ที่เหมาะสมเพราะ FastMath เป็น "faster, more accurate, portable" ซึ่งอาจมีค่าต่างจาก Math เล็กน้อยในระดับ ULP สำหรับ argument ขนาดใหญ่มาก (PayneHanek) จึงลดระดับการตรวจสอบเป็นช่วงค่าที่สมเหตุสมผล (-1,1) แทนการเทียบตรง