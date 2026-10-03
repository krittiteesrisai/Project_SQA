package org.apache.commons.math.util;

import org.junit.Assert;
import org.junit.Test;

public class FastMathTest {

    private static final double EPSILON = 1e-14;
    private static final float FLOAT_EPSILON = 1e-6f;

    // ==========================================
    // 1. Min / Max Tests (Including Math-59 fault detection)
    // ==========================================

    @Test
    public void testMaxFloat() {
        // Critical test for Defects4J Math-59 bug: max(a, b) where a > b
        Assert.assertEquals(50.0f, FastMath.max(50.0f, 10.0f), FLOAT_EPSILON);
        Assert.assertEquals(50.0f, FastMath.max(10.0f, 50.0f), FLOAT_EPSILON);
        Assert.assertEquals(-10.0f, FastMath.max(-10.0f, -50.0f), FLOAT_EPSILON);
        Assert.assertEquals(-10.0f, FastMath.max(-50.0f, -10.0f), FLOAT_EPSILON);
        Assert.assertEquals(0.0f, FastMath.max(0.0f, -0.0f), FLOAT_EPSILON);
        Assert.assertEquals(Float.MAX_VALUE, FastMath.max(Float.MAX_VALUE, Float.MIN_VALUE), FLOAT_EPSILON);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.max(Float.POSITIVE_INFINITY, Float.MAX_VALUE), FLOAT_EPSILON);
        Assert.assertTrue(Float.isNaN(FastMath.max(Float.NaN, 1.0f)));
        Assert.assertTrue(Float.isNaN(FastMath.max(1.0f, Float.NaN)));
    }

    @Test
    public void testMinFloat() {
        Assert.assertEquals(10.0f, FastMath.min(50.0f, 10.0f), FLOAT_EPSILON);
        Assert.assertEquals(10.0f, FastMath.min(10.0f, 50.0f), FLOAT_EPSILON);
        Assert.assertEquals(-50.0f, FastMath.min(-10.0f, -50.0f), FLOAT_EPSILON);
        Assert.assertEquals(Float.NEGATIVE_INFINITY, FastMath.min(Float.NEGATIVE_INFINITY, 0.0f), FLOAT_EPSILON);
        Assert.assertTrue(Float.isNaN(FastMath.min(Float.NaN, 1.0f)));
        Assert.assertTrue(Float.isNaN(FastMath.min(1.0f, Float.NaN)));
    }

    @Test
    public void testMaxDouble() {
        Assert.assertEquals(50.0, FastMath.max(50.0, 10.0), EPSILON);
        Assert.assertEquals(50.0, FastMath.max(10.0, 50.0), EPSILON);
        Assert.assertEquals(-10.0, FastMath.max(-10.0, -50.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.max(Double.POSITIVE_INFINITY, Double.MAX_VALUE), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.max(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.max(1.0, Double.NaN)));
    }

    @Test
    public void testMinDouble() {
        Assert.assertEquals(10.0, FastMath.min(50.0, 10.0), EPSILON);
        Assert.assertEquals(10.0, FastMath.min(10.0, 50.0), EPSILON);
        Assert.assertEquals(-50.0, FastMath.min(-10.0, -50.0), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.min(Double.NEGATIVE_INFINITY, 0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.min(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.min(1.0, Double.NaN)));
    }

    @Test
    public void testMinMaxIntLong() {
        Assert.assertEquals(10, FastMath.min(10, 20));
        Assert.assertEquals(10, FastMath.min(20, 10));
        Assert.assertEquals(20, FastMath.max(10, 20));
        Assert.assertEquals(20, FastMath.max(20, 10));

        Assert.assertEquals(10L, FastMath.min(10L, 20L));
        Assert.assertEquals(10L, FastMath.min(20L, 10L));
        Assert.assertEquals(20L, FastMath.max(10L, 20L));
        Assert.assertEquals(20L, FastMath.max(20L, 10L));

        Assert.assertEquals(Integer.MIN_VALUE, FastMath.min(Integer.MIN_VALUE, Integer.MAX_VALUE));
        Assert.assertEquals(Integer.MAX_VALUE, FastMath.max(Integer.MIN_VALUE, Integer.MAX_VALUE));
        Assert.assertEquals(Long.MIN_VALUE, FastMath.min(Long.MIN_VALUE, Long.MAX_VALUE));
        Assert.assertEquals(Long.MAX_VALUE, FastMath.max(Long.MIN_VALUE, Long.MAX_VALUE));
    }

    // ==========================================
    // 2. Absolute & Signum & ULP Tests
    // ==========================================

    @Test
    public void testAbs() {
        Assert.assertEquals(10, FastMath.abs(-10));
        Assert.assertEquals(10, FastMath.abs(10));
        Assert.assertEquals(10L, FastMath.abs(-10L));
        Assert.assertEquals(10L, FastMath.abs(10L));
        Assert.assertEquals(10.5f, FastMath.abs(-10.5f), FLOAT_EPSILON);
        Assert.assertEquals(10.5f, FastMath.abs(10.5f), FLOAT_EPSILON);
        Assert.assertEquals(10.5, FastMath.abs(-10.5), EPSILON);
        Assert.assertEquals(10.5, FastMath.abs(10.5), EPSILON);
    }

    @Test
    public void testSignum() {
        Assert.assertEquals(1.0, FastMath.signum(50.0), EPSILON);
        Assert.assertEquals(-1.0, FastMath.signum(-50.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.signum(0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    @Test
    public void testUlpAndNextUpNextAfter() {
        Assert.assertTrue(FastMath.ulp(1.0) > 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0), EPSILON);
        Assert.assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), 0.0);
        Assert.assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), 0.0);

        double next = FastMath.nextUp(1.0);
        Assert.assertTrue(next > 1.0);

        double maxMantissa = Double.longBitsToDouble(0x000fffffffffffffL);
        Assert.assertTrue(FastMath.nextAfter(maxMantissa, Double.POSITIVE_INFINITY) > maxMantissa);

        double dZeroMantissa = Double.longBitsToDouble(0x3ff0000000000000L); // 1.0
        Assert.assertTrue(FastMath.nextAfter(dZeroMantissa, 0.0) < dZeroMantissa);
    }

    // ==========================================
    // 3. Rounding & Floor & Ceil Tests
    // ==========================================

    @Test
    public void testFloorCeilRintRound() {
        Assert.assertTrue(Double.isNaN(FastMath.floor(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.ceil(Double.NaN)));

        double huge = 5e15;
        Assert.assertEquals(huge, FastMath.floor(huge), EPSILON);
        Assert.assertEquals(-huge, FastMath.floor(-huge), EPSILON);
        Assert.assertEquals(huge, FastMath.ceil(huge), EPSILON);

        Assert.assertEquals(3.0, FastMath.floor(3.7), EPSILON);
        Assert.assertEquals(-4.0, FastMath.floor(-3.7), EPSILON);
        Assert.assertEquals(0.0, FastMath.floor(0.0), EPSILON);

        Assert.assertEquals(4.0, FastMath.ceil(3.2), EPSILON);
        Assert.assertEquals(-3.0, FastMath.ceil(-3.7), EPSILON);
        Assert.assertEquals(0.0, FastMath.ceil(-0.5), EPSILON);

        // rint: round-half-to-even
        Assert.assertEquals(2.0, FastMath.rint(2.5), EPSILON);
        Assert.assertEquals(4.0, FastMath.rint(3.5), EPSILON);
        Assert.assertEquals(3.0, FastMath.rint(3.2), EPSILON);
        Assert.assertEquals(4.0, FastMath.rint(3.8), EPSILON);

        // round
        Assert.assertEquals(4L, FastMath.round(3.5));
        Assert.assertEquals(-3L, FastMath.round(-3.5));
        Assert.assertEquals(4, FastMath.round(3.5f));
    }

    // ==========================================
    // 4. Exponential & Logarithmic Tests
    // ==========================================

    @Test
    public void testExpSpecialCases() {
        Assert.assertEquals(1.0, FastMath.exp(0.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(800.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.exp(-800.0), EPSILON);
        Assert.assertTrue(FastMath.exp(-720.0) > 0.0); // Subnormal output
        Assert.assertTrue(FastMath.exp(-709.0) > 0.0);
        Assert.assertEquals(Math.E, FastMath.exp(1.0), 1e-12);
    }

    @Test
    public void testExpm1() {
        Assert.assertEquals(0.0, FastMath.expm1(0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
        Assert.assertEquals(Math.exp(2.0) - 1.0, FastMath.expm1(2.0), 1e-10);
        Assert.assertEquals(Math.exp(-2.0) - 1.0, FastMath.expm1(-2.0), 1e-10);
        Assert.assertEquals(Math.exp(0.5) - 1.0, FastMath.expm1(0.5), 1e-12);
        Assert.assertEquals(Math.exp(-0.5) - 1.0, FastMath.expm1(-0.5), 1e-12);
    }

    @Test
    public void testLog() {
        Assert.assertTrue(Double.isNaN(FastMath.log(-1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.log(1.0), EPSILON);
        Assert.assertEquals(FastMath.log(1.005), Math.log(1.005), 1e-12); // Range (0.99, 1.01)
        Assert.assertEquals(FastMath.log(2.718281828459045), 1.0, 1e-12);
        Assert.assertEquals(FastMath.log10(100.0), 2.0, 1e-12);
        Assert.assertEquals(FastMath.log1p(0.0), 0.0, EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.log1p(1e-8), FastMath.log1p(1e-8), 1e-14);
    }

    @Test
    public void testPow() {
        Assert.assertEquals(1.0, FastMath.pow(5.0, 0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.pow(Double.NaN, 2.0)));
        Assert.assertEquals(0.0, FastMath.pow(0.0, 2.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -2.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-0.0, -3.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.pow(-0.0, 3.0), 0.0);

        Assert.assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -2.0), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 2.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN)));

        Assert.assertTrue(Double.isNaN(FastMath.pow(1.0, Double.POSITIVE_INFINITY)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(0.5, Double.POSITIVE_INFINITY), EPSILON);

        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.5, Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), EPSILON);

        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 3.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 2.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -3.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -2.0), EPSILON);

        // Base < 0
        Assert.assertEquals(8.0, FastMath.pow(-2.0, 3.0), 1e-12);
        Assert.assertEquals(4.0, FastMath.pow(-2.0, 2.0), 1e-12);
        Assert.assertTrue(Double.isNaN(FastMath.pow(-2.0, 2.5)));
        Assert.assertEquals(Math.pow(-2.0, 5e15), FastMath.pow(-2.0, 5e15), 1e-12);
    }

    // ==========================================
    // 5. Trigonometric & Inverse Trig Tests
    // ==========================================

    @Test
    public void testSinCosTanSpecialCases() {
        Assert.assertEquals(0.0, FastMath.sin(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.sin(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));

        Assert.assertEquals(1.0, FastMath.cos(0.0), EPSILON);
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));

        Assert.assertEquals(0.0, FastMath.tan(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.tan(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.POSITIVE_INFINITY)));

        // Argument reductions: Cody/Waite and Payne/Hanek
        Assert.assertEquals(Math.sin(10.0), FastMath.sin(10.0), 1e-12);
        Assert.assertEquals(Math.cos(10.0), FastMath.cos(10.0), 1e-12);
        Assert.assertEquals(Math.tan(10.0), FastMath.tan(10.0), 1e-12);

        double largeX = 5000000.0; // > 3294198.0 triggers Payne/Hanek
        Assert.assertEquals(Math.sin(largeX), FastMath.sin(largeX), 1e-9);
        Assert.assertEquals(Math.cos(largeX), FastMath.cos(largeX), 1e-9);
        Assert.assertEquals(Math.tan(largeX), FastMath.tan(largeX), 1e-9);
    }

    @Test
    public void testAtanAtan2() {
        Assert.assertEquals(0.0, FastMath.atan(0.0), EPSILON);
        Assert.assertEquals(Math.PI / 4.0, FastMath.atan(1.0), 1e-12);
        Assert.assertEquals(-Math.PI / 4.0, FastMath.atan(-1.0), 1e-12);
        Assert.assertEquals(Math.PI / 2.0, FastMath.atan(2e16), 1e-12);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.atan(-2e16), 1e-12);

        Assert.assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.atan2(1.0, Double.NaN)));
        Assert.assertEquals(0.0, FastMath.atan2(0.0, 1.0), EPSILON);
        Assert.assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), 1e-12);
        Assert.assertEquals(-Math.PI, FastMath.atan2(-0.0, -1.0), 1e-12);

        Assert.assertEquals(Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-12);
        Assert.assertEquals(3.0 * Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-12);
        Assert.assertEquals(-Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-12);
        Assert.assertEquals(-3.0 * Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-12);

        Assert.assertEquals(Math.PI / 2.0, FastMath.atan2(Double.POSITIVE_INFINITY, 5.0), 1e-12);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.atan2(Double.NEGATIVE_INFINITY, 5.0), 1e-12);
        Assert.assertEquals(0.0, FastMath.atan2(5.0, Double.POSITIVE_INFINITY), 1e-12);
        Assert.assertEquals(Math.PI, FastMath.atan2(5.0, Double.NEGATIVE_INFINITY), 1e-12);
    }

    @Test
    public void testAsinAcos() {
        Assert.assertTrue(Double.isNaN(FastMath.asin(2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.asin(-2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.asin(Double.NaN)));
        Assert.assertEquals(Math.PI / 2.0, FastMath.asin(1.0), 1e-12);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.asin(-1.0), 1e-12);
        Assert.assertEquals(0.0, FastMath.asin(0.0), 1e-12);

        Assert.assertTrue(Double.isNaN(FastMath.acos(2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.acos(-2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.acos(Double.NaN)));
        Assert.assertEquals(0.0, FastMath.acos(1.0), 1e-12);
        Assert.assertEquals(Math.PI, FastMath.acos(-1.0), 1e-12);
        Assert.assertEquals(Math.PI / 2.0, FastMath.acos(0.0), 1e-12);
    }

    // ==========================================
    // 6. Hyperbolic & Utility Tests
    // ==========================================

    @Test
    public void testHyperbolicFunctions() {
        Assert.assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
        Assert.assertEquals(1.0, FastMath.cosh(0.0), EPSILON);
        Assert.assertTrue(FastMath.cosh(25.0) > 1e10);
        Assert.assertTrue(FastMath.cosh(-25.0) > 1e10);
        Assert.assertEquals(Math.cosh(2.0), FastMath.cosh(2.0), 1e-12);
        Assert.assertEquals(Math.cosh(-2.0), FastMath.cosh(-2.0), 1e-12);

        Assert.assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
        Assert.assertEquals(0.0, FastMath.sinh(0.0), EPSILON);
        Assert.assertTrue(FastMath.sinh(25.0) > 1e10);
        Assert.assertTrue(FastMath.sinh(-25.0) < -1e10);
        Assert.assertEquals(Math.sinh(0.1), FastMath.sinh(0.1), 1e-12);
        Assert.assertEquals(Math.sinh(2.0), FastMath.sinh(2.0), 1e-12);

        Assert.assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
        Assert.assertEquals(0.0, FastMath.tanh(0.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.tanh(25.0), EPSILON);
        Assert.assertEquals(-1.0, FastMath.tanh(-25.0), EPSILON);
        Assert.assertEquals(Math.tanh(0.3), FastMath.tanh(0.3), 1e-12);
        Assert.assertEquals(Math.tanh(1.5), FastMath.tanh(1.5), 1e-12);
    }

    @Test
    public void testInverseHyperbolicAndCbrt() {
        Assert.assertEquals(0.0, FastMath.acosh(1.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.asinh(0.0), EPSILON);
        Assert.assertEquals(FastMath.asinh(2.0), -FastMath.asinh(-2.0), 1e-12);
        Assert.assertEquals(FastMath.asinh(0.1), -FastMath.asinh(-0.1), 1e-12);
        Assert.assertEquals(FastMath.asinh(0.05), -FastMath.asinh(-0.05), 1e-12);
        Assert.assertEquals(FastMath.asinh(0.005), -FastMath.asinh(-0.005), 1e-12);
        Assert.assertEquals(FastMath.asinh(0.0001), -FastMath.asinh(-0.0001), 1e-12);

        Assert.assertEquals(0.0, FastMath.atanh(0.0), EPSILON);
        Assert.assertEquals(FastMath.atanh(0.5), -FastMath.atanh(-0.5), 1e-12);
        Assert.assertEquals(FastMath.atanh(0.1), -FastMath.atanh(-0.1), 1e-12);
        Assert.assertEquals(FastMath.atanh(0.05), -FastMath.atanh(-0.05), 1e-12);
        Assert.assertEquals(FastMath.atanh(0.005), -FastMath.atanh(-0.005), 1e-12);
        Assert.assertEquals(FastMath.atanh(0.0001), -FastMath.atanh(-0.0001), 1e-12);

        Assert.assertEquals(2.0, FastMath.cbrt(8.0), 1e-12);
        Assert.assertEquals(-2.0, FastMath.cbrt(-8.0), 1e-12);
        Assert.assertEquals(0.0, FastMath.cbrt(0.0), EPSILON);
        Assert.assertTrue(FastMath.cbrt(Double.MIN_VALUE) > 0.0); // Subnormal cbrt
        Assert.assertTrue(Double.isNaN(FastMath.cbrt(Double.NaN)));
    }

    @Test
    public void testAngleConversionsAndRandomSqrt() {
        Assert.assertEquals(Math.PI, FastMath.toRadians(180.0), 1e-12);
        Assert.assertEquals(180.0, FastMath.toDegrees(Math.PI), 1e-12);
        Assert.assertEquals(2.0, FastMath.sqrt(4.0), EPSILON);
        double rnd = FastMath.random();
        Assert.assertTrue(rnd >= 0.0 && rnd < 1.0);
    }
}