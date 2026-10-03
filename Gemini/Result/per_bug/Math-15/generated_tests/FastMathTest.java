package org.apache.commons.math3.util;

import org.junit.Test;
import static org.junit.Assert.*;

public class FastMathTest {

    private static final double EPSILON = 1e-12;

    // ------------------------------------------------------------------------
    // 1. Power functions & Defects4J Math-15 Specific Edge Cases
    // ------------------------------------------------------------------------

    @Test
    public void testPowMath15DefectOddIntegerAbove2Power52() {
        // 2^52 is 4503599627370496.0. 
        // 2^52 + 1.0 is an odd integer. (-1)^(odd integer) MUST BE -1.0.
        double oddPower = 4503599627370497.0; // 2^52 + 1
        assertEquals(-1.0, FastMath.pow(-1.0, oddPower), EPSILON);

        double evenPower = 4503599627370498.0; // 2^52 + 2
        assertEquals(1.0, FastMath.pow(-1.0, evenPower), EPSILON);

        // Negative odd/even powers in range [-2^53, -2^52]
        assertEquals(-1.0, FastMath.pow(-1.0, -oddPower), EPSILON);
        assertEquals(1.0, FastMath.pow(-1.0, -evenPower), EPSILON);
    }

    @Test
    public void testPowSpecialCases() {
        // y == 0 -> 1.0
        assertEquals(1.0, FastMath.pow(Double.NaN, 0.0), 0.0);
        assertEquals(1.0, FastMath.pow(0.0, 0.0), 0.0);
        assertEquals(1.0, FastMath.pow(-0.0, -0.0), 0.0);

        // x is NaN
        assertTrue(Double.isNaN(FastMath.pow(Double.NaN, 2.0)));

        // x == 0.0 and x == -0.0
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-0.0, -3.0), 0.0); // y < 0, odd int
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(-0.0, -2.0), 0.0); // y < 0, even int
        assertEquals(-0.0, FastMath.pow(-0.0, 3.0), 0.0); // y > 0, odd int
        assertEquals(0.0, FastMath.pow(-0.0, 2.0), 0.0); // y > 0, even int
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -2.5), 0.0);
        assertEquals(0.0, FastMath.pow(0.0, 2.5), 0.0);

        // x == +Infinity
        assertTrue(Double.isNaN(FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN)));
        assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -1.5), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 1.5), 0.0);

        // y == +Infinity
        assertTrue(Double.isNaN(FastMath.pow(1.0, Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.pow(-1.0, Double.POSITIVE_INFINITY)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Double.POSITIVE_INFINITY), 0.0);
        assertEquals(0.0, FastMath.pow(0.5, Double.POSITIVE_INFINITY), 0.0);

        // x == -Infinity
        assertEquals(-0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -3.0), 0.0); // y < 0, odd int
        assertEquals(0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -2.0), 0.0);  // y < 0, even int
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 3.0), 0.0); // y > 0, odd int
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 2.0), 0.0); // y > 0, even int

        // y == -Infinity
        assertTrue(Double.isNaN(FastMath.pow(1.0, Double.NEGATIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.pow(-1.0, Double.NEGATIVE_INFINITY)));
        assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.5, Double.NEGATIVE_INFINITY), 0.0);

        // x < 0 with non-integer y -> NaN
        assertTrue(Double.isNaN(FastMath.pow(-2.0, 2.5)));
        assertTrue(Double.isNaN(FastMath.pow(-2.0, -2.5)));

        // Large y (trigger split branch y > 8e298)
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, 9e298), 0.0);
        assertEquals(0.0, FastMath.pow(0.5, 9e298), 0.0);
    }

    @Test
    public void testPowDoubleInt() {
        assertEquals(1.0, FastMath.pow(5.5, 0), 0.0);
        assertEquals(8.0, FastMath.pow(2.0, 3), EPSILON);
        assertEquals(0.125, FastMath.pow(2.0, -3), EPSILON);
        assertEquals(1.0, FastMath.pow(-1.0, 4), EPSILON);
        assertEquals(-1.0, FastMath.pow(-1.0, 5), EPSILON);
        assertEquals(0.0, FastMath.pow(2.0, -1000), 0.0);
    }

    // ------------------------------------------------------------------------
    // 2. Hyperbolic Functions
    // ------------------------------------------------------------------------

    @Test
    public void testHyperbolicCoshSinhTanh() {
        // Special values
        assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
        assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));

        assertEquals(1.0, FastMath.cosh(0.0), EPSILON);
        assertEquals(0.0, FastMath.sinh(0.0), 0.0);
        assertEquals(-0.0, FastMath.sinh(-0.0), 0.0);
        assertEquals(0.0, FastMath.tanh(0.0), 0.0);
        assertEquals(-0.0, FastMath.tanh(-0.0), 0.0);

        // Extreme bounds (|x| > 20 and x >= LOG_MAX_VALUE)
        assertEquals(1.0, FastMath.tanh(25.0), EPSILON);
        assertEquals(-1.0, FastMath.tanh(-25.0), EPSILON);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(800.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(-800.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.sinh(800.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.sinh(-800.0), 0.0);

        // General branches
        assertEquals(StrictMath.cosh(1.5), FastMath.cosh(1.5), EPSILON);
        assertEquals(StrictMath.cosh(-1.5), FastMath.cosh(-1.5), EPSILON);
        assertEquals(StrictMath.sinh(1.5), FastMath.sinh(1.5), EPSILON);
        assertEquals(StrictMath.sinh(-1.5), FastMath.sinh(-1.5), EPSILON);
        assertEquals(StrictMath.sinh(0.1), FastMath.sinh(0.1), EPSILON); // x <= 0.25 branch
        assertEquals(StrictMath.tanh(0.2), FastMath.tanh(0.2), EPSILON); // x < 0.5 branch
        assertEquals(StrictMath.tanh(1.2), FastMath.tanh(1.2), EPSILON); // x >= 0.5 branch
    }

    @Test
    public void testInverseHyperbolicFunctions() {
        // acosh
        assertEquals(0.0, FastMath.acosh(1.0), EPSILON);
        assertEquals(StrictMath.log(2.0 + Math.sqrt(3.0)), FastMath.acosh(2.0), EPSILON);
        assertTrue(Double.isNaN(FastMath.acosh(0.5)));

        // asinh polynomial threshold branches
        assertEquals(0.0, FastMath.asinh(0.0), 0.0);
        assertEquals(StrictMath.log(1.0 + Math.sqrt(2.0)), FastMath.asinh(1.0), EPSILON);
        assertEquals(-FastMath.asinh(1.0), FastMath.asinh(-1.0), EPSILON);
        assertEquals(0.15, FastMath.asinh(0.15), 0.01);   // 0.097 < a <= 0.167
        assertEquals(0.05, FastMath.asinh(0.05), 0.01);   // 0.036 < a <= 0.097
        assertEquals(0.01, FastMath.asinh(0.01), 0.001);  // 0.0036 < a <= 0.036
        assertEquals(0.001, FastMath.asinh(0.001), 1e-5); // a <= 0.0036

        // atanh polynomial threshold branches
        assertEquals(0.0, FastMath.atanh(0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.atanh(1.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.atanh(-1.0), 0.0);
        assertEquals(0.5 * Math.log(3.0), FastMath.atanh(0.5), EPSILON); // a > 0.15
        assertEquals(0.1, FastMath.atanh(0.1), 0.01);     // 0.087 < a <= 0.15
        assertEquals(0.05, FastMath.atanh(0.05), 0.01);   // 0.031 < a <= 0.087
        assertEquals(0.01, FastMath.atanh(0.01), 0.001);  // 0.003 < a <= 0.031
        assertEquals(0.001, FastMath.atanh(0.001), 1e-5); // a <= 0.003
        assertTrue(Double.isNaN(FastMath.atanh(1.5)));
    }

    // ------------------------------------------------------------------------
    // 3. Exponential & Logarithmic Functions
    // ------------------------------------------------------------------------

    @Test
    public void testExpAndExpm1() {
        assertEquals(1.0, FastMath.exp(0.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(750.0), 0.0);
        assertEquals(0.0, FastMath.exp(-750.0), 0.0);
        assertTrue(FastMath.exp(-710.0) > 0.0); // Subnormal branch (intVal > 709)
        assertTrue(FastMath.exp(-709.0) > 0.0); // intVal == 709 branch

        // expm1
        assertEquals(0.0, FastMath.expm1(0.0), 0.0);
        assertEquals(-0.0, FastMath.expm1(-0.0), 0.0);
        assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
        assertEquals(StrictMath.expm1(2.0), FastMath.expm1(2.0), EPSILON);
        assertEquals(StrictMath.expm1(-2.0), FastMath.expm1(-2.0), EPSILON);
        assertEquals(StrictMath.expm1(0.5), FastMath.expm1(0.5), EPSILON);
        assertEquals(StrictMath.expm1(-0.5), FastMath.expm1(-0.5), EPSILON);
    }

    @Test
    public void testLogarithms() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(-0.0), 0.0);
        assertTrue(Double.isNaN(FastMath.log(-1.0)));
        assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), 0.0);

        // Near 1.0 (trigger LN_QUICK_COEF branch: 0.99 < x < 1.01)
        assertEquals(StrictMath.log(1.005), FastMath.log(1.005), EPSILON);
        assertEquals(StrictMath.log(0.995), FastMath.log(0.995), EPSILON);

        // Subnormal number in log
        double subnormal = Double.longBitsToDouble(0x0000000000000001L);
        assertEquals(StrictMath.log(subnormal), FastMath.log(subnormal), 1e-9);

        // log1p
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), 0.0);
        assertEquals(StrictMath.log1p(1e-8), FastMath.log1p(1e-8), 1e-15);
        assertEquals(StrictMath.log1p(0.5), FastMath.log1p(0.5), EPSILON);

        // log10 & log(base, x)
        assertEquals(1.0, FastMath.log10(10.0), EPSILON);
        assertEquals(2.0, FastMath.log(2.0, 4.0), EPSILON);
        assertTrue(Double.isNaN(FastMath.log(0.0, 0.0)));
        assertEquals(0.0, FastMath.log(0.0, 5.0), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(5.0, 0.0), 0.0);
    }

    // ------------------------------------------------------------------------
    // 4. Trigonometric Functions & Argument Reduction
    // ------------------------------------------------------------------------

    @Test
    public void testTrigonometryAndReduction() {
        // Zero and Infinity
        assertEquals(0.0, FastMath.sin(0.0), 0.0);
        assertEquals(-0.0, FastMath.sin(-0.0), 0.0);
        assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.tan(Double.POSITIVE_INFINITY)));

        // Small angles
        assertEquals(StrictMath.sin(0.5), FastMath.sin(0.5), EPSILON);
        assertEquals(StrictMath.cos(0.5), FastMath.cos(0.5), EPSILON);
        assertEquals(StrictMath.tan(0.5), FastMath.tan(0.5), EPSILON);

        // Cody-Waite reduction range (1.57 < x <= 3294198.0)
        assertEquals(StrictMath.sin(100.0), FastMath.sin(100.0), EPSILON);
        assertEquals(StrictMath.cos(100.0), FastMath.cos(100.0), EPSILON);
        assertEquals(StrictMath.tan(100.0), FastMath.tan(100.0), EPSILON);

        // Payne-Hanek reduction range (x > 3294198.0)
        double largeAngle = 10000000.0;
        assertEquals(StrictMath.sin(largeAngle), FastMath.sin(largeAngle), 1e-9);
        assertEquals(StrictMath.cos(largeAngle), FastMath.cos(largeAngle), 1e-9);
        assertEquals(StrictMath.tan(largeAngle), FastMath.tan(largeAngle), 1e-9);

        // Tan boundary near PI/2 (x > 1.5)
        assertEquals(StrictMath.tan(1.55), FastMath.tan(1.55), 1e-9);
    }

    @Test
    public void testInverseTrigAndAtan2() {
        // asin & acos
        assertTrue(Double.isNaN(FastMath.asin(1.5)));
        assertTrue(Double.isNaN(FastMath.acos(1.5)));
        assertEquals(FastMath.PI / 2.0, FastMath.asin(1.0), EPSILON);
        assertEquals(-FastMath.PI / 2.0, FastMath.asin(-1.0), EPSILON);
        assertEquals(0.0, FastMath.acos(1.0), EPSILON);
        assertEquals(FastMath.PI, FastMath.acos(-1.0), EPSILON);
        assertEquals(FastMath.PI / 2.0, FastMath.acos(0.0), EPSILON);

        // atan
        assertEquals(0.0, FastMath.atan(0.0), 0.0);
        assertEquals(-0.0, FastMath.atan(-0.0), 0.0);
        assertEquals(FastMath.PI / 4.0, FastMath.atan(1.0), EPSILON);
        assertEquals(FastMath.PI / 2.0, FastMath.atan(2e16), EPSILON); // Very large branch

        // atan2 branches
        assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
        assertTrue(Double.isNaN(FastMath.atan2(1.0, Double.NaN)));
        assertEquals(0.0, FastMath.atan2(0.0, 1.0), 0.0);
        assertEquals(FastMath.PI, FastMath.atan2(0.0, -1.0), EPSILON);
        assertEquals(FastMath.PI / 2.0, FastMath.atan2(1.0, 0.0), EPSILON);
        assertEquals(-FastMath.PI / 2.0, FastMath.atan2(-1.0, 0.0), EPSILON);

        assertEquals(FastMath.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), EPSILON);
        assertEquals(3.0 * FastMath.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), EPSILON);
        assertEquals(-FastMath.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), EPSILON);
        assertEquals(-3.0 * FastMath.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), EPSILON);
    }

    // ------------------------------------------------------------------------
    // 5. Manipulation, Rounding and Extremes
    // ------------------------------------------------------------------------

    @Test
    public void testScalbAndNextAfter() {
        // scalb double
        assertEquals(8.0, FastMath.scalb(1.0, 3), EPSILON);
        assertEquals(0.0, FastMath.scalb(1.0, -2100), 0.0);
        assertEquals(-0.0, FastMath.scalb(-1.0, -2100), 0.0);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 2100), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-1.0, 2100), 0.0);

        // scalb float
        assertEquals(8.0f, FastMath.scalb(1.0f, 3), 1e-6f);
        assertEquals(0.0f, FastMath.scalb(1.0f, -300), 0.0f);
        assertEquals(-0.0f, FastMath.scalb(-1.0f, -300), 0.0f);
        assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(1.0f, 300), 0.0f);
        assertEquals(Float.NEGATIVE_INFINITY, FastMath.scalb(-1.0f, 300), 0.0f);

        // nextAfter
        assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
        assertEquals(1.5, FastMath.nextAfter(1.5, 1.5), 0.0);
        assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), 0.0);
        assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), 0.0);
        assertEquals(Double.MAX_VALUE, FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);

        // nextUp
        assertEquals(Double.MIN_VALUE, FastMath.nextUp(0.0), 0.0);
        assertEquals(Float.MIN_VALUE, FastMath.nextUp(0.0f), 0.0f);
    }

    @Test
    public void testRoundingFunctions() {
        // floor / ceil / rint / round
        assertEquals(2.0, FastMath.floor(2.9), 0.0);
        assertEquals(-3.0, FastMath.floor(-2.1), 0.0);
        assertEquals(3.0, FastMath.ceil(2.1), 0.0);
        assertEquals(-2.0, FastMath.ceil(-2.9), 0.0);

        assertEquals(2.0, FastMath.rint(2.5), 0.0); // round to even
        assertEquals(4.0, FastMath.rint(3.5), 0.0); // round to even
        assertEquals(-0.0, FastMath.rint(-0.2), 0.0);
        assertEquals(3L, FastMath.round(2.6));
        assertEquals(2, FastMath.round(2.4f));

        // cbrt
        assertEquals(0.0, FastMath.cbrt(0.0), 0.0);
        assertEquals(2.0, FastMath.cbrt(8.0), EPSILON);
        assertEquals(-2.0, FastMath.cbrt(-8.0), EPSILON);
        assertTrue(Double.isNaN(FastMath.cbrt(Double.NaN)));
    }

    @Test
    public void testMinMaxHypotAndCopySign() {
        // min / max double (distinguishing +0.0 and -0.0)
        assertEquals(-0.0, FastMath.min(0.0, -0.0), 0.0);
        assertEquals(-0.0, FastMath.min(-0.0, 0.0), 0.0);
        assertEquals(0.0, FastMath.max(0.0, -0.0), 0.0);
        assertEquals(0.0, FastMath.max(-0.0, 0.0), 0.0);

        assertTrue(Double.isNaN(FastMath.min(Double.NaN, 1.0)));
        assertTrue(Double.isNaN(FastMath.max(Double.NaN, 1.0)));

        // min / max float
        assertEquals(-0.0f, FastMath.min(0.0f, -0.0f), 0.0f);
        assertEquals(0.0f, FastMath.max(0.0f, -0.0f), 0.0f);
        assertTrue(Float.isNaN(FastMath.min(Float.NaN, 1.0f)));
        assertTrue(Float.isNaN(FastMath.max(Float.NaN, 1.0f)));

        // hypot
        assertEquals(5.0, FastMath.hypot(3.0, 4.0), EPSILON);
        assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, 1.0), 0.0);
        assertTrue(Double.isNaN(FastMath.hypot(Double.NaN, 1.0)));
        assertEquals(10.0, FastMath.hypot(10.0, 1e-20), EPSILON); // Negligible Y (expX > expY + 27)

        // copySign
        assertEquals(-3.0, FastMath.copySign(3.0, -2.0), 0.0);
        assertEquals(3.0, FastMath.copySign(-3.0, 2.0), 0.0);
        assertEquals(-3.0f, FastMath.copySign(3.0f, -2.0f), 0.0f);
        assertEquals(3.0f, FastMath.copySign(-3.0f, 2.0f), 0.0f);

        // IEEEremainder & degrees/radians
        assertEquals(StrictMath.IEEEremainder(5.0, 3.0), FastMath.IEEEremainder(5.0, 3.0), EPSILON);
        assertEquals(FastMath.PI, FastMath.toRadians(180.0), EPSILON);
        assertEquals(180.0, FastMath.toDegrees(FastMath.PI), EPSILON);
    }
}