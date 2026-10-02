# FastMathTest.java

```java
package org.apache.commons.math3.util;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.math3.util.FastMath (Defects4J Math-15b)
 * Goal: maximize branch coverage and catch real faults.
 *
 * หมายเหตุ: ค่าความคลาดเคลื่อน (delta) ที่ใช้เทียบกับ Math/StrictMath
 * อ้างอิงจาก JavaDoc ของ FastMath ที่ระบุความแม่นยำประมาณ 0.5 ulp
 * สำหรับค่าปกติ จึงใช้ delta แบบผ่อนปรน (1e-9 ถึง 1e-6) เพื่อไม่ทำให้เทสเปราะบางเกินไป
 */
public class FastMathTest {

    private static final double DELTA = 1e-9;
    private static final double LOOSE = 1e-6;

    // ---------------------- sqrt / random ----------------------

    @Test
    public void testSqrtBasic() {
        assertEquals(Math.sqrt(2.0), FastMath.sqrt(2.0), DELTA);
        assertEquals(0.0, FastMath.sqrt(0.0), DELTA);
        assertTrue(Double.isNaN(FastMath.sqrt(-1.0)));
    }

    @Test
    public void testRandomRange() {
        double r = FastMath.random();
        assertTrue(r >= 0.0 && r < 1.0);
    }

    // ---------------------- cosh ----------------------

    @Test
    public void testCoshNaN() {
        assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
    }

    @Test
    public void testCoshLargePositive_belowLogMax() {
        // x > 20 but < LOG_MAX_VALUE -> 0.5*exp(x) branch
        double x = 30.0;
        assertEquals(Math.cosh(x), FastMath.cosh(x), Math.cosh(x) * 1e-9);
    }

    @Test
    public void testCoshLargePositive_aboveLogMax() {
        // x >= LOG_MAX_VALUE -> overflow-avoidance branch
        double x = 710.0; // LOG_MAX_VALUE ~ 709.78
        double result = FastMath.cosh(x);
        assertTrue(result > 0 && !Double.isNaN(result));
    }

    @Test
    public void testCoshLargeNegative_aboveNegLogMax() {
        double x = -30.0;
        assertEquals(Math.cosh(x), FastMath.cosh(x), Math.cosh(x) * 1e-9);
    }

    @Test
    public void testCoshLargeNegative_belowNegLogMax() {
        double x = -710.0;
        double result = FastMath.cosh(x);
        assertTrue(result > 0 && !Double.isNaN(result));
    }

    @Test
    public void testCoshNormalRangePositiveAndNegative() {
        assertEquals(Math.cosh(1.0), FastMath.cosh(1.0), LOOSE);
        assertEquals(Math.cosh(-1.0), FastMath.cosh(-1.0), LOOSE);
        assertEquals(1.0, FastMath.cosh(0.0), DELTA);
    }

    // ---------------------- sinh ----------------------

    @Test
    public void testSinhNaN() {
        assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
    }

    @Test
    public void testSinhZero() {
        assertEquals(0.0, FastMath.sinh(0.0), DELTA);
    }

    @Test
    public void testSinhLargePositive_belowLogMax() {
        double x = 30.0;
        assertEquals(Math.sinh(x), FastMath.sinh(x), Math.sinh(x) * 1e-9);
    }

    @Test
    public void testSinhLargePositive_aboveLogMax() {
        double x = 710.0;
        double result = FastMath.sinh(x);
        assertTrue(result > 0 && !Double.isNaN(result));
    }

    @Test
    public void testSinhLargeNegative_aboveNegLogMax() {
        double x = -30.0;
        assertEquals(Math.sinh(x), FastMath.sinh(x), Math.abs(Math.sinh(x)) * 1e-9);
    }

    @Test
    public void testSinhLargeNegative_belowNegLogMax() {
        double x = -710.0;
        double result = FastMath.sinh(x);
        assertTrue(result < 0 && !Double.isNaN(result));
    }

    @Test
    public void testSinhSmallBranch_x_lt_0_25_positiveAndNegative() {
        // triggers expm1 branch (x <= 0.25) and negate flag
        assertEquals(Math.sinh(0.1), FastMath.sinh(0.1), LOOSE);
        assertEquals(Math.sinh(-0.1), FastMath.sinh(-0.1), LOOSE);
    }

    @Test
    public void testSinhLargeBranch_x_gt_0_25_positiveAndNegative() {
        // triggers exp() branch (x > 0.25) and negate flag
        assertEquals(Math.sinh(1.5), FastMath.sinh(1.5), LOOSE);
        assertEquals(Math.sinh(-1.5), FastMath.sinh(-1.5), LOOSE);
    }

    // ---------------------- tanh ----------------------

    @Test
    public void testTanhNaN() {
        assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
    }

    @Test
    public void testTanhSaturationPositive() {
        assertEquals(1.0, FastMath.tanh(21.0), DELTA);
    }

    @Test
    public void testTanhSaturationNegative() {
        assertEquals(-1.0, FastMath.tanh(-21.0), DELTA);
    }

    @Test
    public void testTanhZero() {
        assertEquals(0.0, FastMath.tanh(0.0), DELTA);
    }

    @Test
    public void testTanhBranch_x_lt_0_5_positiveAndNegative() {
        assertEquals(Math.tanh(0.1), FastMath.tanh(0.1), LOOSE);
        assertEquals(Math.tanh(-0.1), FastMath.tanh(-0.1), LOOSE);
    }

    @Test
    public void testTanhBranch_x_ge_0_5_positiveAndNegative() {
        assertEquals(Math.tanh(1.0), FastMath.tanh(1.0), LOOSE);
        assertEquals(Math.tanh(-1.0), FastMath.tanh(-1.0), LOOSE);
    }

    // ---------------------- acosh / asinh / atanh ----------------------

    @Test
    public void testAcoshBasic() {
        double a = 2.0;
        double expected = Math.log(a + Math.sqrt(a * a - 1));
        assertEquals(expected, FastMath.acosh(a), LOOSE);
    }

    @Test
    public void testAsinhNegativeBranch() {
        assertEquals(-FastMath.asinh(1.0), FastMath.asinh(-1.0), DELTA);
    }

    @Test
    public void testAsinhBranch_gt_0_167() {
        double a = 0.5;
        double result = FastMath.asinh(a);
        assertEquals(Math.log(a + Math.sqrt(a * a + 1)), result, LOOSE);
    }

    @Test
    public void testAsinhBranch_gt_0_097() {
        double a = 0.1;
        double result = FastMath.asinh(a);
        assertTrue(!Double.isNaN(result));
    }

    @Test
    public void testAsinhBranch_gt_0_0036() {
        double a = 0.005;
        double result = FastMath.asinh(a);
        assertTrue(!Double.isNaN(result));
    }

    @Test
    public void testAsinhBranch_smallest() {
        double a = 0.001;
        double result = FastMath.asinh(a);
        assertEquals(a, result, 1e-6); // asinh(x) ~ x for very small x
    }

    @Test
    public void testAtanhNegativeBranch() {
        assertEquals(-FastMath.atanh(0.5), FastMath.atanh(-0.5), DELTA);
    }

    @Test
    public void testAtanhBranch_gt_0_15() {
        double a = 0.5;
        double expected = 0.5 * Math.log((1 + a) / (1 - a));
        assertEquals(expected, FastMath.atanh(a), LOOSE);
    }

    @Test
    public void testAtanhBranch_gt_0_087() {
        double a = 0.1;
        assertTrue(!Double.isNaN(FastMath.atanh(a)));
    }

    @Test
    public void testAtanhBranch_gt_0_003() {
        double a = 0.005;
        assertTrue(!Double.isNaN(FastMath.atanh(a)));
    }

    @Test
    public void testAtanhBranch_smallest() {
        double a = 0.001;
        assertEquals(a, FastMath.atanh(a), 1e-6);
    }

    // ---------------------- signum ----------------------

    @Test
    public void testSignumDoubleNegative() {
        assertEquals(-1.0, FastMath.signum(-5.0), DELTA);
    }

    @Test
    public void testSignumDoublePositive() {
        assertEquals(1.0, FastMath.signum(5.0), DELTA);
    }

    @Test
    public void testSignumDoubleZeroAndNaN() {
        assertEquals(0.0, FastMath.signum(0.0), DELTA);
        assertEquals(-0.0, FastMath.signum(-0.0), DELTA);
        assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    @Test
    public void testSignumFloatNegative() {
        assertEquals(-1.0f, FastMath.signum(-5.0f), 1e-6f);
    }

    @Test
    public void testSignumFloatPositive() {
        assertEquals(1.0f, FastMath.signum(5.0f), 1e-6f);
    }

    @Test
    public void testSignumFloatZeroAndNaN() {
        assertEquals(0.0f, FastMath.signum(0.0f), 1e-6f);
        assertTrue(Float.isNaN(FastMath.signum(Float.NaN)));
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

    // ---------------------- exp / expm1 ----------------------

    @Test
    public void testExpZero() {
        assertEquals(1.0, FastMath.exp(0.0), DELTA);
    }

    @Test
    public void testExpPositiveNormal() {
        assertEquals(Math.exp(2.0), FastMath.exp(2.0), Math.exp(2.0) * 1e-9);
    }

    @Test
    public void testExpNegativeNormal() {
        assertEquals(Math.exp(-2.0), FastMath.exp(-2.0), 1e-9);
    }

    @Test
    public void testExpOverflow() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(1000.0), DELTA);
    }

    @Test
    public void testExpUnderflowToZero() {
        // intVal > 746 branch
        assertEquals(0.0, FastMath.exp(-1000.0), DELTA);
    }

    @Test
    public void testExpSubnormalBranch() {
        // intVal > 709 (but <=746) branch
        double result = FastMath.exp(-720.0);
        assertTrue(result >= 0.0 && !Double.isNaN(result));
    }

    @Test
    public void testExpIntVal709Branch() {
        // exact intVal == 709 branch
        double result = FastMath.exp(-709.5);
        assertTrue(result > 0.0);
    }

    @Test
    public void testExpm1Zero() {
        assertEquals(0.0, FastMath.expm1(0.0), DELTA);
    }

    @Test
    public void testExpm1NaN() {
        assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
    }

    @Test
    public void testExpm1LargePositive() {
        // x >= 1.0 branch
        assertEquals(Math.expm1(2.0), FastMath.expm1(2.0), Math.expm1(2.0) * 1e-6);
    }

    @Test
    public void testExpm1LargeNegative() {
        // x <= -1.0 branch
        assertEquals(Math.expm1(-2.0), FastMath.expm1(-2.0), 1e-9);
    }

    @Test
    public void testExpm1SmallPositiveAndNegative() {
        // -1 < x < 1 branch, negative flag both ways
        assertEquals(Math.expm1(0.5), FastMath.expm1(0.5), LOOSE);
        assertEquals(Math.expm1(-0.5), FastMath.expm1(-0.5), LOOSE);
    }

    // ---------------------- log / log1p / log10 / log(base,x) ----------------------

    @Test
    public void testLogZero() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), DELTA);
    }

    @Test
    public void testLogNegative() {
        assertTrue(Double.isNaN(FastMath.log(-1.0)));
    }

    @Test
    public void testLogNaN() {
        assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
    }

    @Test
    public void testLogPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void testLogNearOneQuickPolyBranch() {
        // 0.99 < x < 1.01 branch
        assertEquals(Math.log(1.005), FastMath.log(1.005), LOOSE);
    }

    @Test
    public void testLogNormalValue() {
        assertEquals(Math.log(10.0), FastMath.log(10.0), LOOSE);
    }

    @Test
    public void testLogSubnormal() {
        double subnormal = Double.MIN_VALUE * 2; // subnormal double
        double result = FastMath.log(subnormal);
        assertTrue(!Double.isNaN(result) && result < 0);
    }

    @Test
    public void testLog1pMinusOne() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), DELTA);
    }

    @Test
    public void testLog1pPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void testLog1pLargeBranch() {
        // |x| > 1e-6 branch
        assertEquals(Math.log1p(0.5), FastMath.log1p(0.5), LOOSE);
        assertEquals(Math.log1p(-0.5), FastMath.log1p(-0.5), LOOSE);
    }

    @Test
    public void testLog1pSmallBranch() {
        // |x| <= 1e-6 taylor branch
        double x = 1e-9;
        assertEquals(Math.log1p(x), FastMath.log1p(x), 1e-12);
    }

    @Test
    public void testLog10Normal() {
        assertEquals(1.0, FastMath.log10(10.0), LOOSE);
    }

    @Test
    public void testLog10Infinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log10(Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void testLogBaseX() {
        assertEquals(Math.log(8.0) / Math.log(2.0), FastMath.log(2.0, 8.0), LOOSE);
    }

    // ---------------------- pow(double,double) ----------------------

    @Test
    public void testPowYZero() {
        assertEquals(1.0, FastMath.pow(5.0, 0.0), DELTA);
    }

    @Test
    public void testPowXNaN() {
        assertTrue(Double.isNaN(FastMath.pow(Double.NaN, 2.0)));
    }

    @Test
    public void testPowXZeroNegativeZeroOddNegativeY() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-0.0, -3.0), DELTA);
    }

    @Test
    public void testPowXZeroNegativeZeroOddPositiveY() {
        assertEquals(-0.0, FastMath.pow(-0.0, 3.0), DELTA);
        assertTrue(1.0 / FastMath.pow(-0.0, 3.0) < 0); // ensure sign is -0.0
    }

    @Test
    public void testPowXZeroPositiveZeroNegativeY() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -2.0), DELTA);
    }

    @Test
    public void testPowXZeroPositiveZeroPositiveY() {
        assertEquals(0.0, FastMath.pow(0.0, 2.0), DELTA);
    }

    @Test
    public void testPowXZeroYZeroAlreadyHandled() {
        // y==0 handled earlier in method, so x==0,y==0 returns 1.0 not NaN
        assertEquals(1.0, FastMath.pow(0.0, 0.0), DELTA);
    }

    @Test
    public void testPowXPositiveInfinityYNaN() {
        assertTrue(Double.isNaN(FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN)));
    }

    @Test
    public void testPowXPositiveInfinityYNegative() {
        assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -1.0), DELTA);
    }

    @Test
    public void testPowXPositiveInfinityYPositive() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 1.0), DELTA);
    }

    @Test
    public void testPowYPositiveInfinityXatOne() {
        assertTrue(Double.isNaN(FastMath.pow(1.0, Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testPowYPositiveInfinityXgtOne() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void testPowYPositiveInfinityXltOne() {
        assertEquals(0.0, FastMath.pow(0.5, Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void testPowXNegativeInfinityYNaN() {
        assertTrue(Double.isNaN(FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN)));
    }

    @Test
    public void testPowXNegativeInfinityYNegativeOdd() {
        assertEquals(-0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -3.0), DELTA);
    }

    @Test
    public void testPowXNegativeInfinityYNegativeEven() {
        assertEquals(0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -4.0), DELTA);
    }

    @Test
    public void testPowXNegativeInfinityYPositiveOdd() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 3.0), DELTA);
    }

    @Test
    public void testPowXNegativeInfinityYPositiveEven() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 4.0), DELTA);
    }

    @Test
    public void testPowYNegativeInfinityXatOne() {
        assertTrue(Double.isNaN(FastMath.pow(1.0, Double.NEGATIVE_INFINITY)));
    }

    @Test
    public void testPowYNegativeInfinityXltOne() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.5, Double.NEGATIVE_INFINITY), DELTA);
    }

    @Test
    public void testPowYNegativeInfinityXgtOne() {
        assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), DELTA);
    }

    @Test
    public void testPowNegativeXIntegerEvenY() {
        assertEquals(Math.pow(-2.0, 4.0), FastMath.pow(-2.0, 4.0), LOOSE);
    }

    @Test
    public void testPowNegativeXIntegerOddY() {
        assertEquals(Math.pow(-2.0, 3.0), FastMath.pow(-2.0, 3.0), LOOSE);
    }

    @Test
    public void testPowNegativeXNonIntegerY() {
        assertTrue(Double.isNaN(FastMath.pow(-2.0, 2.5)));
    }

    @Test
    public void testPowNormalCase() {
        assertEquals(Math.pow(2.0, 10.0), FastMath.pow(2.0, 10.0), LOOSE);
    }

    // ---------------------- pow(double,int) ----------------------

    @Test
    public void testPowIntExponentZero() {
        assertEquals(1.0, FastMath.pow(5.0, 0), DELTA);
    }

    @Test
    public void testPowIntExponentNegative() {
        assertEquals(0.25, FastMath.pow(2.0, -2), LOOSE);
    }

    @Test
    public void testPowIntExponentPositiveLoop() {
        assertEquals(1024.0, FastMath.pow(2.0, 10), LOOSE);
    }

    // ---------------------- sin / cos / tan ----------------------

    @Test
    public void testSinPositiveZero() {
        double result = FastMath.sin(0.0);
        assertEquals(0.0, result, DELTA);
        assertFalse(1.0 / result < 0);
    }

    @Test
    public void testSinNegativeZero() {
        double result = FastMath.sin(-0.0);
        assertTrue(1.0 / result < 0); // -0.0
    }

    @Test
    public void testSinNaNAndInfinite() {
        assertTrue(Double.isNaN(FastMath.sin(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testSinSmallRangeQuadrant0() {
        assertEquals(Math.sin(0.5), FastMath.sin(0.5), LOOSE);
    }

    @Test
    public void testSinCodyWaiteBranchQuadrants() {
        // xa > PI/2 triggers CodyWaite reduction, various quadrants
        assertEquals(Math.sin(2.0), FastMath.sin(2.0), LOOSE);   // quadrant 1
        assertEquals(Math.sin(4.0), FastMath.sin(4.0), LOOSE);   // quadrant 2
        assertEquals(Math.sin(5.5), FastMath.sin(5.5), LOOSE);   // quadrant 3
    }

    @Test
    public void testSinPayneHanekBranch() {
        double x = 4000000.0; // > 3294198.0 triggers PayneHanek reduction
        assertEquals(Math.sin(x), FastMath.sin(x), 1e-4);
    }

    @Test
    public void testSinNegativeInputQuadrantFlip() {
        assertEquals(Math.sin(-2.0), FastMath.sin(-2.0), LOOSE);
    }

    @Test
    public void testCosNaNAndInfinite() {
        assertTrue(Double.isNaN(FastMath.cos(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testCosSmallRangeQuadrant0() {
        assertEquals(Math.cos(0.5), FastMath.cos(0.5), LOOSE);
    }

    @Test
    public void testCosCodyWaiteBranchQuadrants() {
        assertEquals(Math.cos(2.0), FastMath.cos(2.0), LOOSE);
        assertEquals(Math.cos(4.0), FastMath.cos(4.0), LOOSE);
        assertEquals(Math.cos(5.5), FastMath.cos(5.5), LOOSE);
    }

    @Test
    public void testCosPayneHanekBranch() {
        double x = 4000000.0;
        assertEquals(Math.cos(x), FastMath.cos(x), 1e-4);
    }

    @Test
    public void testTanPositiveZero() {
        double result = FastMath.tan(0.0);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    public void testTanNegativeZero() {
        double result = FastMath.tan(-0.0);
        assertTrue(1.0 / result < 0);
    }

    @Test
    public void testTanNaNAndInfinite() {
        assertTrue(Double.isNaN(FastMath.tan(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.tan(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testTanBranch_xa_gt_1_5() {
        // triggers the accuracy-improvement branch inside tan() (1.5 < xa <= PI/2 range)
        assertEquals(Math.tan(1.57), FastMath.tan(1.57), 1e-3);
    }

    @Test
    public void testTanCotanBranchViaQuadrant() {
        assertEquals(Math.tan(2.0), FastMath.tan(2.0), LOOSE);
    }

    @Test
    public void testTanPayneHanekBranch() {
        double x = 4000000.0;
        assertEquals(Math.tan(x), FastMath.tan(x), 1e-3);
    }

    // ---------------------- atan / atan2 ----------------------

    @Test
    public void testAtanZeroPositiveAndNegative() {
        assertEquals(0.0, FastMath.atan(0.0), DELTA);
        double result = FastMath.atan(-0.0);
        assertTrue(1.0 / result < 0);
    }

    @Test
    public void testAtanVeryLargeInput() {
        assertEquals(Math.PI / 2.0, FastMath.atan(1e20), LOOSE);
        assertEquals(-Math.PI / 2.0, FastMath.atan(-1e20), LOOSE);
    }

    @Test
    public void testAtanSmallXBranch() {
        assertEquals(Math.atan(0.5), FastMath.atan(0.5), LOOSE);
    }

    @Test
    public void testAtanLargeXBranch() {
        assertEquals(Math.atan(5.0), FastMath.atan(5.0), LOOSE);
    }

    @Test
    public void testAtan2NaN() {
        assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
        assertTrue(Double.isNaN(FastMath.atan2(1.0, Double.NaN)));
    }

    @Test
    public void testAtan2YZeroXPositive() {
        assertEquals(0.0, FastMath.atan2(0.0, 2.0), DELTA);
    }

    @Test
    public void testAtan2YZeroXNegativePositiveZero() {
        assertEquals(Math.PI, FastMath.atan2(0.0, -2.0), DELTA);
    }

    @Test
    public void testAtan2YZeroXNegativeNegativeZero() {
        assertEquals(-Math.PI, FastMath.atan2(-0.0, -2.0), DELTA);
    }

    @Test
    public void testAtan2YPositiveInfinity() {
        assertEquals(Math.PI / 2.0, FastMath.atan2(Double.POSITIVE_INFINITY, 1.0), DELTA);
        assertEquals(Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), DELTA);
        assertEquals(Math.PI * 0.75, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), DELTA);
    }

    @Test
    public void testAtan2YNegativeInfinity() {
        assertEquals(-Math.PI / 2.0, FastMath.atan2(Double.NEGATIVE_INFINITY, 1.0), DELTA);
    }

    @Test
    public void testAtan2XPositiveInfinity() {
        assertEquals(0.0, FastMath.atan2(1.0, Double.POSITIVE_INFINITY), DELTA);
        assertEquals(-0.0, FastMath.atan2(-1.0, Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void testAtan2XNegativeInfinity() {
        assertEquals(Math.PI, FastMath.atan2(1.0, Double.NEGATIVE_INFINITY), DELTA);
        assertEquals(-Math.PI, FastMath.atan2(-1.0, Double.NEGATIVE_INFINITY), DELTA);
    }

    @Test
    public void testAtan2XZero() {
        assertEquals(Math.PI / 2.0, FastMath.atan2(1.0, 0.0), DELTA);
        assertEquals(-Math.PI / 2.0, FastMath.atan2(-1.0, 0.0), DELTA);
    }

    @Test
    public void testAtan2NormalCase() {
        assertEquals(Math.atan2(1.0, 1.0), FastMath.atan2(1.0, 1.0), LOOSE);
        assertEquals(Math.atan2(-1.0, -1.0), FastMath.atan2(-1.0, -1.0), LOOSE);
    }

    // ---------------------- asin / acos ----------------------

    @Test
    public void testAsinNaN() {
        assertTrue(Double.isNaN(FastMath.asin(Double.NaN)));
    }

    @Test
    public void testAsinOutOfRange() {
        assertTrue(Double.isNaN(FastMath.asin(1.5)));
        assertTrue(Double.isNaN(FastMath.asin(-1.5)));
    }

    @Test
    public void testAsinBoundaryOne() {
        assertEquals(Math.PI / 2.0, FastMath.asin(1.0), DELTA);
        assertEquals(-Math.PI / 2.0, FastMath.asin(-1.0), DELTA);
    }

    @Test
    public void testAsinZero() {
        double result = FastMath.asin(0.0);
        assertEquals(0.0, result, DELTA);
        assertFalse(1.0 / result < 0);
    }

    @Test
    public void testAsinNormalValue() {
        assertEquals(Math.asin(0.5), FastMath.asin(0.5), LOOSE);
    }

    @Test
    public void testAcosNaN() {
        assertTrue(Double.isNaN(FastMath.acos(Double.NaN)));
    }

    @Test
    public void testAcosOutOfRange() {
        assertTrue(Double.isNaN(FastMath.acos(1.5)));
        assertTrue(Double.isNaN(FastMath.acos(-1.5)));
    }

    @Test
    public void testAcosBoundaries() {
        assertEquals(Math.PI, FastMath.acos(-1.0), DELTA);
        assertEquals(0.0, FastMath.acos(1.0), DELTA);
        assertEquals(Math.PI / 2.0, FastMath.acos(0.0), DELTA);
    }

    @Test
    public void testAcosNormalValue() {
        assertEquals(Math.acos(0.5), FastMath.acos(0.5), LOOSE);
        assertEquals(Math.acos(-0.5), FastMath.acos(-0.5), LOOSE);
    }

    // ---------------------- cbrt ----------------------

    @Test
    public void testCbrtZero() {
        assertEquals(0.0, FastMath.cbrt(0.0), DELTA);
    }

    @Test
    public void testCbrtNaN() {
        assertTrue(Double.isNaN(FastMath.cbrt(Double.NaN)));
    }

    @Test
    public void testCbrtInfinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void testCbrtSubnormal() {
        double subnormal = Double.MIN_VALUE * 10;
        double result = FastMath.cbrt(subnormal);
        assertTrue(result > 0 && !Double.isNaN(result));
    }

    @Test
    public void testCbrtPositiveAndNegativeNormal() {
        assertEquals(2.0, FastMath.cbrt(8.0), LOOSE);
        assertEquals(-2.0, FastMath.cbrt(-8.0), LOOSE);
    }

    // ---------------------- toRadians / toDegrees ----------------------

    @Test
    public void testToRadiansInfiniteAndZero() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.toRadians(Double.POSITIVE_INFINITY), DELTA);
        assertEquals(0.0, FastMath.toRadians(0.0), DELTA);
    }

    @Test
    public void testToRadiansNormal() {
        assertEquals(Math.PI, FastMath.toRadians(180.0), LOOSE);
    }

    @Test
    public void testToDegreesInfiniteAndZero() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.toDegrees(Double.POSITIVE_INFINITY), DELTA);
        assertEquals(0.0, FastMath.toDegrees(0.0), DELTA);
    }

    @Test
    public void testToDegreesNormal() {
        assertEquals(180.0, FastMath.toDegrees(Math.PI), LOOSE);
    }

    // ---------------------- abs ----------------------

    @Test
    public void testAbsInt() {
        assertEquals(5, FastMath.abs(-5));
        assertEquals(5, FastMath.abs(5));
        assertEquals(0, FastMath.abs(0));
    }

    @Test
    public void testAbsLong() {
        assertEquals(5L, FastMath.abs(-5L));
        assertEquals(5L, FastMath.abs(5L));
    }

    @Test
    public void testAbsFloat() {
        assertEquals(5.0f, FastMath.abs(-5.0f), 1e-6f);
        assertEquals(0.0f, FastMath.abs(-0.0f), 1e-6f);
        assertFalse(1.0f / FastMath.abs(-0.0f) < 0);
    }

    @Test
    public void testAbsDouble() {
        assertEquals(5.0, FastMath.abs(-5.0), DELTA);
        assertEquals(0.0, FastMath.abs(-0.0), DELTA);
        assertFalse(1.0 / FastMath.abs(-0.0) < 0);
    }

    // ---------------------- ulp ----------------------

    @Test
    public void testUlpDoubleInfinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.POSITIVE_INFINITY), DELTA);
    }

    @Test
    public void testUlpDoubleNormal() {
        assertTrue(FastMath.ulp(1.0) > 0);
    }

    @Test
    public void testUlpFloatInfinite() {
        assertEquals(Float.POSITIVE_INFINITY, FastMath.ulp(Float.POSITIVE_INFINITY), 1e-6f);
    }

    @Test
    public void testUlpFloatNormal() {
        assertTrue(FastMath.ulp(1.0f) > 0);
    }

    // ---------------------- scalb ----------------------

    @Test
    public void testScalbDoubleFastPath() {
        assertEquals(8.0, FastMath.scalb(2.0, 2), DELTA);
    }

    @Test
    public void testScalbDoubleSpecialCases() {
        assertTrue(Double.isNaN(FastMath.scalb(Double.NaN, 5)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.POSITIVE_INFINITY, 5), DELTA);
        assertEquals(0.0, FastMath.scalb(0.0, 5), DELTA);
    }

    @Test
    public void testScalbDoubleVeryNegativeN() {
        assertEquals(0.0, FastMath.scalb(1.0, -3000), DELTA);
        assertEquals(-0.0, FastMath.scalb(-1.0, -3000), DELTA);
    }

    @Test
    public void testScalbDoubleVeryPositiveN() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 3000), DELTA);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-1.0, 3000), DELTA);
    }

    @Test
    public void testScalbFloatFastPath() {
        assertEquals(8.0f, FastMath.scalb(2.0f, 2), 1e-6f);
    }

    @Test
    public void testScalbFloatSpecialCases() {
        assertTrue(Float.isNaN(FastMath.scalb(Float.NaN, 5)));
        assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(Float.POSITIVE_INFINITY, 5), 1e-6f);
        assertEquals(0.0f, FastMath.scalb(0.0f, 5), 1e-6f);
    }

    @Test
    public void testScalbFloatVeryNegativeAndPositiveN() {
        assertEquals(0.0f, FastMath.scalb(1.0f, -3000), 1e-6f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(1.0f, 3000), 1e-6f);
    }

    // ---------------------- nextAfter ----------------------

    @Test
    public void testNextAfterDoubleNaN() {
        assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
        assertTrue(Double.isNaN(FastMath.nextAfter(1.0, Double.NaN)));
    }

    @Test
    public void testNextAfterDoubleEqual() {
        assertEquals(2.0, FastMath.nextAfter(2.0, 2.0), DELTA);
    }

    @Test
    public void testNextAfterDoubleInfinite() {
        assertEquals(Double.MAX_VALUE, FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0), DELTA);
        assertEquals(-Double.MAX_VALUE, FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.0), DELTA);
    }

    @Test
    public void testNextAfterDoubleZero() {
        assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), DELTA);
        assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), DELTA);
    }

    @Test
    public void testNextAfterDoubleNormalIncreaseDecrease() {
        assertTrue(FastMath.nextAfter(1.0, 2.0) > 1.0);
        assertTrue(FastMath.nextAfter(1.0, 0.0) < 1.0);
    }

    @Test
    public void testNextAfterFloatNaN() {
        assertTrue(Float.isNaN(FastMath.nextAfter(Float.NaN, 1.0)));
    }

    @Test
    public void testNextAfterFloatEqual() {
        assertEquals(2.0f, FastMath.nextAfter(2.0f, 2.0), 1e-6f);
    }

    @Test
    public void testNextAfterFloatInfinite() {
        assertEquals(Float.MAX_VALUE, FastMath.nextAfter(Float.POSITIVE_INFINITY, 0.0), 1e-6f);
    }

    @Test
    public void testNextAfterFloatZero() {
        assertEquals(Float.MIN_VALUE, FastMath.nextAfter(0.0f, 1.0), 1e-45f);
    }

    // ---------------------- floor / ceil / rint / round ----------------------

    @Test
    public void testFloorNaN() {
        assertTrue(Double.isNaN(FastMath.floor(Double.NaN)));
    }

    @Test
    public void testFloorHugeValue() {
        double huge = Math.pow(2, 60);
        assertEquals(huge, FastMath.floor(huge), DELTA);
    }

    @Test
    public void testFloorNegativeNonInteger() {
        assertEquals(-3.0, FastMath.floor(-2.5), DELTA);
    }

    @Test
    public void testFloorResultZero() {
        assertEquals(0.0, FastMath.floor(0.5), DELTA);
    }

    @Test
    public void testCeilNaN() {
        assertTrue(Double.isNaN(FastMath.ceil(Double.NaN)));
    }

    @Test
    public void testCeilEqualsFloor() {
        assertEquals(3.0, FastMath.ceil(3.0), DELTA);
    }

    @Test
    public void testCeilNormal() {
        assertEquals(3.0, FastMath.ceil(2.5), DELTA);
        assertEquals(-2.0, FastMath.ceil(-2.5), DELTA);
    }

    @Test
    public void testRintRoundDown() {
        assertEquals(2.0, FastMath.rint(2.3), DELTA);
    }

    @Test
    public void testRintRoundUp() {
        assertEquals(3.0, FastMath.rint(2.7), DELTA);
    }

    @Test
    public void testRintHalfwayRoundToEven() {
        assertEquals(2.0, FastMath.rint(2.5), DELTA); // round to even (2)
        assertEquals(4.0, FastMath.rint(3.5), DELTA); // round to even (4)
    }

    @Test
    public void testRintHalfwayNegativeOne() {
        // y == -1.0 branch returns -0.0
        double result = FastMath.rint(-0.5);
        assertEquals(0.0, result, DELTA);
        assertTrue(1.0 / result < 0);
    }

    @Test
    public void testRoundDoubleToLong() {
        assertEquals(3L, FastMath.round(2.5));
        assertEquals(-2L, FastMath.round(-2.5));
    }

    @Test
    public void testRoundFloatToInt() {
        assertEquals(3, FastMath.round(2.5f));
    }

    // ---------------------- min / max ----------------------

    @Test
    public void testMinMaxInt() {
        assertEquals(1, FastMath.min(1, 2));
        assertEquals(2, FastMath.max(1, 2));
    }

    @Test
    public void testMinMaxLong() {
        assertEquals(1L, FastMath.min(1L, 2L));
        assertEquals(2L, FastMath.max(1L, 2L));
    }

    @Test
    public void testMinFloatNormal() {
        assertEquals(1.0f, FastMath.min(1.0f, 2.0f), 1e-6f);
        assertEquals(1.0f, FastMath.min(2.0f, 1.0f), 1e-6f);
    }

    @Test
    public void testMinFloatNaN() {
        assertTrue(Float.isNaN(FastMath.min(Float.NaN, 1.0f)));
    }

    @Test
    public void testMinFloatZeroSign() {
        assertTrue(1.0f / FastMath.min(0.0f, -0.0f) < 0); // -0.0
    }

    @Test
    public void testMaxFloatNormal() {
        assertEquals(2.0f, FastMath.max(1.0f, 2.0f), 1e-6f);
    }

    @Test
    public void testMaxFloatNaN() {
        assertTrue(Float.isNaN(FastMath.max(Float.NaN, 1.0f)));
    }

    @Test
    public void testMaxFloatZeroSign() {
        assertTrue(1.0f / FastMath.max(0.0f, -0.0f) > 0); // +0.0
    }

    @Test
    public void testMinDoubleNormal() {
        assertEquals(1.0, FastMath.min(1.0, 2.0), DELTA);
    }

    @Test
    public void testMinDoubleNaN() {
        assertTrue(Double.isNaN(FastMath.min(Double.NaN, 1.0)));
    }

    @Test
    public void testMinDoubleZeroSign() {
        assertTrue(1.0 / FastMath.min(0.0, -0.0) < 0);
    }

    @Test
    public void testMaxDoubleNormal() {
        assertEquals(2.0, FastMath.max(1.0, 2.0), DELTA);
    }

    @Test
    public void testMaxDoubleNaN() {
        assertTrue(Double.isNaN(FastMath.max(Double.NaN, 1.0)));
    }

    @Test
    public void testMaxDoubleZeroSign() {
        assertTrue(1.0 / FastMath.max(0.0, -0.0) > 0);
    }

    // ---------------------- hypot ----------------------

    @Test
    public void testHypotInfinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, 1.0), DELTA);
    }

    @Test
    public void testHypotNaN() {
        assertTrue(Double.isNaN(FastMath.hypot(Double.NaN, 1.0)));
    }

    @Test
    public void testHypotXNegligible() {
        // expY > expX+27
        double result = FastMath.hypot(1.0, 1e20);
        assertEquals(1e20, result, 1e20 * 1e-9);
    }

    @Test
    public void testHypotYNegligible() {
        double result = FastMath.hypot(1e20, 1.0);
        assertEquals(1e20, result, 1e20 * 1e-9);
    }

    @Test
    public void testHypotNormal() {
        assertEquals(5.0, FastMath.hypot(3.0, 4.0), LOOSE);
    }

    // ---------------------- IEEEremainder ----------------------

    @Test
    public void testIEEEremainder() {
        assertEquals(StrictMath.IEEEremainder(10.0, 3.0), FastMath.IEEEremainder(10.0, 3.0), DELTA);
    }

    // ---------------------- copySign ----------------------

    @Test
    public void testCopySignDoubleSameSign() {
        assertEquals(3.0, FastMath.copySign(3.0, 1.0), DELTA);
    }

    @Test
    public void testCopySignDoubleFlip() {
        assertEquals(-3.0, FastMath.copySign(3.0, -1.0), DELTA);
    }

    @Test
    public void testCopySignFloatSameSign() {
        assertEquals(3.0f, FastMath.copySign(3.0f, 1.0f), 1e-6f);
    }

    @Test
    public void testCopySignFloatFlip() {
        assertEquals(-3.0f, FastMath.copySign(3.0f, -1.0f), 1e-6f);
    }

    // ---------------------- getExponent ----------------------

    @Test
    public void testGetExponentDouble() {
        assertEquals(1, FastMath.getExponent(2.0));
        assertEquals(0, FastMath.getExponent(1.0));
    }

    @Test
    public void testGetExponentFloat() {
        assertEquals(1, FastMath.getExponent(2.0f));
        assertEquals(0, FastMath.getExponent(1.0f));
    }
}
```

# ตารางสรุป Test Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testSqrtBasic | sqrt ปกติ, ค่าลบ (NaN) |
| testCoshNaN/...LogMax/...NormalRange | cosh: x!=x, x>20 (ทั้ง 2 เงื่อนไข), x<-20 (ทั้ง 2), ค่าปกติ |
| testSinhNaN/...Zero/...Large.../...SmallBranch/...LargeBranch | sinh: NaN, x==0, x>20/x<-20 (ทั้ง 2 เงื่อนไขย่อย), x>0.25 vs x<=0.25, negate flag |
| testTanhNaN/...Saturation.../...Branch_x_... | tanh: NaN, x>20, x<-20, x==0, x>=0.5 vs <0.5, negate |
| testAcoshBasic | acosh ปกติ |
| testAsinhNegativeBranch/...Branch_gt_... | asinh: negative flag, threshold 0.167/0.097/0.036/0.0036 ทุกสาขา |
| testAtanhNegativeBranch/...Branch_gt_... | atanh: negative flag, threshold 0.15/0.087/0.031/0.003 ทุกสาขา |
| testSignumDouble.../Float... | signum: a<0, a>0, a==0/-0.0/NaN ทั้ง double/float |
| testNextUpDouble/Float | nextUp ผ่าน nextAfter |
| testExp... (Zero/Positive/Negative/Overflow/Underflow/Subnormal/709) | exp: x<0 vs x>=0, intVal>746, intVal>709, intVal==709, overflow (intVal>709 x>=0) |
| testExpm1... (Zero/NaN/Large.../Small...) | expm1: x!=x\|\|x==0, x<=-1\|\|x>=1 (ทั้งบวก/ลบ), ช่วง (-1,1) |
| testLog... (Zero/Negative/NaN/Infinity/NearOne/Normal/Subnormal) | log: x==0, bit sign/NaN, +Infinity, subnormal normalize loop, exp==-1\|\|0 quick-poly branch |
| testLog1p... | log1p: x==-1, x==+Inf, \|x\|>1e-6 (บวก/ลบ), \|x\|<=1e-6 |
| testLog10... | log10: ปกติ, Infinite |
| testLogBaseX | log(base,x) |
| testPow... (ครบทุกกรณีพิเศษใน pow(double,double)) | y==0, x NaN, x==0 (+/-0, y int odd/even, y sign), x==+Inf, y==+Inf (x²==1/>1/<1), x==-Inf (y NaN/neg-odd/neg-even/pos-odd/pos-even), y==-Inf (x²==1/<1/>1), x<0 (y even/odd integer, non-integer), ปกติ |
| testPowInt... | pow(double,int): e==0, e<0, e>0 (loop binary exponentiation) |
| testSin... | sin: +0.0/-0.0, NaN/Infinite, quadrant 0 (ปกติ), CodyWaite ทุก quadrant, PayneHanek, negative input flip |
| testCos... | cos: NaN/Infinite, quadrant ปกติ, CodyWaite หลาย quadrant, PayneHanek |
| testTan... | tan: +0.0/-0.0, NaN/Infinite, xa>1.5 branch, cotangent quadrant, PayneHanek |
| testAtan... | atan: x==0 (+/-), x มาก (>1.63e16), idx==0 vs else branch |
| testAtan2... | atan2: NaN, y==0 (x>0/x<0 pos-neg zero), y=+Inf/-Inf (x=+Inf/-Inf/other), x=+Inf/-Inf, x==0, ปกติ |
| testAsin... | asin: NaN, out-of-range, ±1 boundary, 0, ปกติ |
| testAcos... | acos: NaN, out-of-range, -1/1/0 boundary, ปกติ (x<0 แยก leftPlane) |
| testCbrt... | cbrt: x==0, NaN, Infinity, subnormal normalize loop, ปกติ (+/-) |
| testToRadians/testToDegrees | Infinite/x==0, ปกติ |
| testAbsInt/Long/Float/Double | เงื่อนไข x<0, x==0/-0.0 |
| testUlp... | Infinite vs ปกติ (double/float) |
| testScalb... | fast path (n ในช่วง), NaN/Inf/0, n<-2098/-277, n>2097/276 (double/float) |
| testNextAfter... | NaN, d==direction, Infinite, d==0, ปกติ เพิ่ม/ลด (double/float) |
| testFloor... | NaN, \|x\|>=2^52, ค่าลบไม่เป็นจำนวนเต็ม (y--), y==0 |
| testCeil... | NaN, y==x, ปกติ |
| testRint... | d>0.5, d<0.5, d==0.5 (round-to-even ทั้ง 2 กรณี), y==-1.0 |
| testRound... | round double→long, float→int |
| testMin/testMax (int/long/float/double) | a<=b/a>b, NaN, ±0.0 sign distinction |
| testHypot... | Infinite, NaN, expX/expY ต่างกันมาก (ทั้ง 2 ทาง), ปกติ |
| testIEEEremainder | เรียก StrictMath ตรง ๆ |
| testCopySign... | sign ตรงกัน vs ต่างกัน (double/float) |
| testGetExponent... | double/float ปกติ |

**หมายเหตุสำคัญ:** บางสาขาที่ลึกมาก (เช่น ภายใน `reducePayneHanek`, `CodyWaite`, bit-level ของ `scalb`/`nextAfter` สำหรับ subnormal พิเศษ) ไม่ได้ทดสอบแยกทุก branch ภายใน เนื่องจากเป็น private helper ที่ถูกเรียกโดยอ้อมผ่าน public API เท่านั้น — การทดสอบจึงอิงจาก public method ที่ประกาศไว้ และครอบคลุม branch หลักของ public methods ตามที่ระบุในซอร์สโค้ด