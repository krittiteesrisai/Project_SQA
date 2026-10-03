package org.apache.commons.math3.util;

import org.junit.Assert;
import org.junit.Test;

public class FastMathTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testCoshEdgeCases() {
        Assert.assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(1000.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cosh(-1000.0), 0.0);
        Assert.assertEquals(1.0, FastMath.cosh(0.0), EPSILON);
        Assert.assertEquals(1.0, FastMath.cosh(-0.0), EPSILON);
        Assert.assertEquals(Math.cosh(1.5), FastMath.cosh(1.5), EPSILON);
        Assert.assertEquals(Math.cosh(-1.5), FastMath.cosh(-1.5), EPSILON);
        Assert.assertEquals(Math.cosh(25.0), FastMath.cosh(25.0), EPSILON);
        Assert.assertEquals(Math.cosh(-25.0), FastMath.cosh(-25.0), EPSILON);
    }

    @Test
    public void testSinhEdgeCases() {
        Assert.assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.sinh(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.sinh(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.sinh(1000.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.sinh(-1000.0), 0.0);
        Assert.assertEquals(0.0, FastMath.sinh(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.sinh(-0.0), 0.0);
        Assert.assertEquals(Math.sinh(25.0), FastMath.sinh(25.0), EPSILON);
        Assert.assertEquals(Math.sinh(-25.0), FastMath.sinh(-25.0), EPSILON);
        Assert.assertEquals(Math.sinh(1.5), FastMath.sinh(1.5), EPSILON);
        Assert.assertEquals(Math.sinh(-1.5), FastMath.sinh(-1.5), EPSILON);
        Assert.assertEquals(Math.sinh(0.1), FastMath.sinh(0.1), EPSILON);
        Assert.assertEquals(Math.sinh(-0.1), FastMath.sinh(-0.1), EPSILON);
    }

    @Test
    public void testTanhEdgeCases() {
        Assert.assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
        Assert.assertEquals(1.0, FastMath.tanh(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(-1.0, FastMath.tanh(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(1.0, FastMath.tanh(25.0), 0.0);
        Assert.assertEquals(-1.0, FastMath.tanh(-25.0), 0.0);
        Assert.assertEquals(0.0, FastMath.tanh(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.tanh(-0.0), 0.0);
        Assert.assertEquals(Math.tanh(1.5), FastMath.tanh(1.5), EPSILON);
        Assert.assertEquals(Math.tanh(-1.5), FastMath.tanh(-1.5), EPSILON);
        Assert.assertEquals(Math.tanh(0.2), FastMath.tanh(0.2), EPSILON);
        Assert.assertEquals(Math.tanh(-0.2), FastMath.tanh(-0.2), EPSILON);
    }

    @Test
    public void testInverseHyperbolic() {
        // acosh
        Assert.assertTrue(Double.isNaN(FastMath.acosh(0.5)));
        Assert.assertEquals(0.0, FastMath.acosh(1.0), EPSILON);
        Assert.assertEquals(1.3169578969248166, FastMath.acosh(2.0), EPSILON);

        // asinh
        Assert.assertEquals(0.0, FastMath.asinh(0.0), 0.0);
        Assert.assertEquals(0.881373587019543, FastMath.asinh(1.0), EPSILON);
        Assert.assertEquals(-0.881373587019543, FastMath.asinh(-1.0), EPSILON);
        Assert.assertEquals(0.149448096238122, FastMath.asinh(0.15), EPSILON);
        Assert.assertEquals(0.059964048479904, FastMath.asinh(0.06), EPSILON);
        Assert.assertEquals(0.019998666844415, FastMath.asinh(0.02), EPSILON);
        Assert.assertEquals(0.001999998666667, FastMath.asinh(0.002), EPSILON);

        // atanh
        Assert.assertTrue(Double.isNaN(FastMath.atanh(1.5)));
        Assert.assertTrue(Double.isNaN(FastMath.atanh(-1.5)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.atanh(1.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.atanh(-1.0), 0.0);
        Assert.assertEquals(0.0, FastMath.atanh(0.0), 0.0);
        Assert.assertEquals(0.5493061443340549, FastMath.atanh(0.5), EPSILON);
        Assert.assertEquals(-0.5493061443340549, FastMath.atanh(-0.5), EPSILON);
        Assert.assertEquals(0.1003353477310756, FastMath.atanh(0.1), EPSILON);
        Assert.assertEquals(0.0500417292784912, FastMath.atanh(0.05), EPSILON);
        Assert.assertEquals(0.0100003333533347, FastMath.atanh(0.01), EPSILON);
        Assert.assertEquals(0.0010000003333335, FastMath.atanh(0.001), EPSILON);
    }

    @Test
    public void testExpAndExpm1() {
        Assert.assertTrue(Double.isNaN(FastMath.exp(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.exp(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(750.0), 0.0);
        Assert.assertEquals(0.0, FastMath.exp(-750.0), 0.0);
        Assert.assertTrue(FastMath.exp(-715.0) > 0.0);
        Assert.assertTrue(FastMath.exp(-709.0) > 0.0);
        Assert.assertEquals(1.0, FastMath.exp(0.0), EPSILON);

        Assert.assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.expm1(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(-1.0, FastMath.expm1(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.expm1(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.expm1(-0.0), 0.0);
        Assert.assertEquals(Math.expm1(2.0), FastMath.expm1(2.0), EPSILON);
        Assert.assertEquals(Math.expm1(-2.0), FastMath.expm1(-2.0), EPSILON);
        Assert.assertEquals(Math.expm1(0.5), FastMath.expm1(0.5), EPSILON);
        Assert.assertEquals(Math.expm1(-0.5), FastMath.expm1(-0.5), EPSILON);
    }

    @Test
    public void testLogVariants() {
        Assert.assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.log(-1.0)));
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(-0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.log(1.0), EPSILON);
        Assert.assertEquals(Math.log(1.005), FastMath.log(1.005), EPSILON);
        Assert.assertEquals(Math.log(0.995), FastMath.log(0.995), EPSILON);
        Assert.assertEquals(Math.log(100.0), FastMath.log(100.0), EPSILON);
        Assert.assertEquals(Math.log(Double.MIN_VALUE), FastMath.log(Double.MIN_VALUE), EPSILON);

        // log10
        Assert.assertEquals(1.0, FastMath.log10(10.0), EPSILON);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log10(0.0), 0.0);

        // log1p
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.log1p(0.0), 0.0);
        Assert.assertEquals(Math.log1p(1e-7), FastMath.log1p(1e-7), EPSILON);
        Assert.assertEquals(Math.log1p(0.5), FastMath.log1p(0.5), EPSILON);

        // log(base, x)
        Assert.assertTrue(Double.isNaN(FastMath.log(-2.0, 4.0)));
        Assert.assertEquals(2.0, FastMath.log(2.0, 4.0), EPSILON);
    }

    @Test
    public void testPowDoubleDouble() {
        Assert.assertEquals(1.0, FastMath.pow(5.0, 0.0), 0.0);
        Assert.assertEquals(1.0, FastMath.pow(Double.NaN, 0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.pow(Double.NaN, 2.0)));
        Assert.assertTrue(Double.isNaN(FastMath.pow(2.0, Double.NaN)));

        // Base 0
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -2.0), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(0.0, 2.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-0.0, -3.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(-0.0, -2.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.pow(-0.0, 3.0), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(-0.0, 2.0), 0.0);

        // Inf
        Assert.assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -1.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 1.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(0.5, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.pow(1.0, Double.POSITIVE_INFINITY)));

        Assert.assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.5, Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.pow(1.0, Double.NEGATIVE_INFINITY)));

        Assert.assertEquals(-0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -3.0), 0.0);
        Assert.assertEquals(0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -2.0), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 3.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 2.0), 0.0);

        // Negative x
        Assert.assertEquals(8.0, FastMath.pow(-2.0, 3.0), EPSILON * 10);
        Assert.assertEquals(-8.0, FastMath.pow(-2.0, 3.0), EPSILON * 10);
        Assert.assertEquals(16.0, FastMath.pow(-2.0, 4.0), EPSILON * 10);
        Assert.assertTrue(Double.isNaN(FastMath.pow(-2.0, 2.5)));
        Assert.assertEquals(FastMath.pow(2.0, 1e16), FastMath.pow(-2.0, 1e16), EPSILON);

        // Large y
        Assert.assertEquals(Math.pow(1.0000001, 1e300), FastMath.pow(1.0000001, 1e300), EPSILON);
    }

    @Test
    public void testPowDoubleInt() {
        Assert.assertEquals(1.0, FastMath.pow(5.0, 0), 0.0);
        Assert.assertEquals(8.0, FastMath.pow(2.0, 3), EPSILON);
        Assert.assertEquals(0.125, FastMath.pow(2.0, -3), EPSILON);
        Assert.assertEquals(1024.0, FastMath.pow(2.0, 10), EPSILON);
    }

    @Test
    public void testTrigonometricFunctions() {
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
        Assert.assertEquals(0.0, FastMath.sin(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.sin(-0.0), 0.0);
        Assert.assertEquals(Math.sin(1.0), FastMath.sin(1.0), EPSILON);
        Assert.assertEquals(Math.sin(-1.0), FastMath.sin(-1.0), EPSILON);
        Assert.assertEquals(Math.sin(2.5), FastMath.sin(2.5), EPSILON);
        Assert.assertEquals(Math.sin(4.0), FastMath.sin(4.0), EPSILON);
        Assert.assertEquals(Math.sin(6.0), FastMath.sin(6.0), EPSILON);
        Assert.assertEquals(Math.sin(4000000.0), FastMath.sin(4000000.0), EPSILON);

        // cos
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));
        Assert.assertEquals(1.0, FastMath.cos(0.0), EPSILON);
        Assert.assertEquals(Math.cos(1.0), FastMath.cos(1.0), EPSILON);
        Assert.assertEquals(Math.cos(2.5), FastMath.cos(2.5), EPSILON);
        Assert.assertEquals(Math.cos(4.0), FastMath.cos(4.0), EPSILON);
        Assert.assertEquals(Math.cos(6.0), FastMath.cos(6.0), EPSILON);
        Assert.assertEquals(Math.cos(4000000.0), FastMath.cos(4000000.0), EPSILON);

        // tan
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.tan(Double.POSITIVE_INFINITY)));
        Assert.assertEquals(0.0, FastMath.tan(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.tan(-0.0), 0.0);
        Assert.assertEquals(Math.tan(1.0), FastMath.tan(1.0), EPSILON);
        Assert.assertEquals(Math.tan(1.55), FastMath.tan(1.55), EPSILON);
        Assert.assertEquals(Math.tan(2.5), FastMath.tan(2.5), EPSILON);
        Assert.assertEquals(Math.tan(4000000.0), FastMath.tan(4000000.0), EPSILON);
    }

    @Test
    public void testInverseTrigonometricFunctions() {
        // asin
        Assert.assertTrue(Double.isNaN(FastMath.asin(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.asin(1.5)));
        Assert.assertTrue(Double.isNaN(FastMath.asin(-1.5)));
        Assert.assertEquals(Math.PI / 2.0, FastMath.asin(1.0), EPSILON);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.asin(-1.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.asin(0.0), 0.0);
        Assert.assertEquals(Math.asin(0.5), FastMath.asin(0.5), EPSILON);

        // acos
        Assert.assertTrue(Double.isNaN(FastMath.acos(Double.NaN)));
        Assert.assertTrue(Double.isNaN(FastMath.acos(1.5)));
        Assert.assertTrue(Double.isNaN(FastMath.acos(-1.5)));
        Assert.assertEquals(0.0, FastMath.acos(1.0), EPSILON);
        Assert.assertEquals(Math.PI, FastMath.acos(-1.0), EPSILON);
        Assert.assertEquals(Math.PI / 2.0, FastMath.acos(0.0), EPSILON);
        Assert.assertEquals(Math.acos(0.5), FastMath.acos(0.5), EPSILON);

        // atan
        Assert.assertEquals(0.0, FastMath.atan(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.atan(-0.0), 0.0);
        Assert.assertEquals(Math.PI / 2.0, FastMath.atan(2e16), EPSILON);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.atan(-2e16), EPSILON);
        Assert.assertEquals(Math.atan(0.5), FastMath.atan(0.5), EPSILON);
        Assert.assertEquals(Math.atan(2.0), FastMath.atan(2.0), EPSILON);

        // atan2
        Assert.assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.atan2(1.0, Double.NaN)));
        Assert.assertEquals(0.0, FastMath.atan2(0.0, 1.0), 0.0);
        Assert.assertEquals(Math.PI, FastMath.atan2(0.0, -1.0), EPSILON);
        Assert.assertEquals(-Math.PI, FastMath.atan2(-0.0, -1.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.atan2(0.0, Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.PI, FastMath.atan2(0.0, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(3.0 * Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(-Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY), EPSILON);
        Assert.assertEquals(-3.0 * Math.PI / 4.0, FastMath.atan2(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY), EPSILON);
        Assert.assertEquals(Math.PI / 2.0, FastMath.atan2(1.0, 0.0), EPSILON);
        Assert.assertEquals(-Math.PI / 2.0, FastMath.atan2(-1.0, 0.0), EPSILON);
        Assert.assertEquals(Math.atan2(2.0, 3.0), FastMath.atan2(2.0, 3.0), EPSILON);
        Assert.assertEquals(Math.atan2(-2.0, 3.0), FastMath.atan2(-2.0, 3.0), EPSILON);
    }

    @Test
    public void testUlpAndSignum() {
        // ulp double
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.ulp(Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.ulp(Double.NaN)));
        Assert.assertEquals(Double.MIN_VALUE, FastMath.ulp(0.0), 0.0);
        Assert.assertEquals(Math.ulp(1.0), FastMath.ulp(1.0), 0.0);
        Assert.assertEquals(Math.ulp(-1.0), FastMath.ulp(-1.0), 0.0);

        // ulp float
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.ulp(Float.POSITIVE_INFINITY), 0.0f);
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.ulp(Float.NEGATIVE_INFINITY), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.ulp(Float.NaN)));
        Assert.assertEquals(Float.MIN_VALUE, FastMath.ulp(0.0f), 0.0f);
        Assert.assertEquals(Math.ulp(1.0f), FastMath.ulp(1.0f), 0.0f);

        // signum
        Assert.assertEquals(1.0, FastMath.signum(5.0), 0.0);
        Assert.assertEquals(-1.0, FastMath.signum(-5.0), 0.0);
        Assert.assertEquals(0.0, FastMath.signum(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.signum(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));

        Assert.assertEquals(1.0f, FastMath.signum(5.0f), 0.0f);
        Assert.assertEquals(-1.0f, FastMath.signum(-5.0f), 0.0f);
        Assert.assertEquals(0.0f, FastMath.signum(0.0f), 0.0f);
        Assert.assertEquals(-0.0f, FastMath.signum(-0.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.signum(Float.NaN)));
    }

    @Test
    public void testNextAfterAndNextUp() {
        Assert.assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.nextAfter(1.0, Double.NaN)));
        Assert.assertEquals(1.0, FastMath.nextAfter(1.0, 1.0), 0.0);
        Assert.assertEquals(Double.MAX_VALUE, FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
        Assert.assertEquals(-Double.MAX_VALUE, FastMath.nextAfter(Double.NEGATIVE_INFINITY, 0.0), 0.0);
        Assert.assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), 0.0);
        Assert.assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), 0.0);
        Assert.assertEquals(Math.nextAfter(1.0, 2.0), FastMath.nextAfter(1.0, 2.0), 0.0);
        Assert.assertEquals(Math.nextAfter(1.0, 0.0), FastMath.nextAfter(1.0, 0.0), 0.0);
        Assert.assertEquals(Math.nextAfter(-1.0, -2.0), FastMath.nextAfter(-1.0, -2.0), 0.0);

        Assert.assertEquals(Math.nextUp(1.0), FastMath.nextUp(1.0), 0.0);
        Assert.assertEquals(Math.nextUp(1.0f), FastMath.nextUp(1.0f), 0.0f);

        // float nextAfter
        Assert.assertTrue(Float.isNaN(FastMath.nextAfter(Float.NaN, 1.0)));
        Assert.assertEquals(1.0f, FastMath.nextAfter(1.0f, 1.0), 0.0f);
        Assert.assertEquals(Float.MIN_VALUE, FastMath.nextAfter(0.0f, 1.0), 0.0f);
        Assert.assertEquals(-Float.MIN_VALUE, FastMath.nextAfter(0.0f, -1.0), 0.0f);
    }

    @Test
    public void testScalb() {
        // double
        Assert.assertEquals(0.0, FastMath.scalb(0.0, 5), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.scalb(Double.NaN, 5)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(Double.POSITIVE_INFINITY, 5), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.scalb(1.0, 2100), 0.0);
        Assert.assertEquals(Double.NEGATIVE_INFINITY, FastMath.scalb(-1.0, 2100), 0.0);
        Assert.assertEquals(0.0, FastMath.scalb(1.0, -2100), 0.0);
        Assert.assertEquals(-0.0, FastMath.scalb(-1.0, -2100), 0.0);
        Assert.assertEquals(8.0, FastMath.scalb(1.0, 3), EPSILON);
        Assert.assertEquals(0.125, FastMath.scalb(1.0, -3), EPSILON);
        Assert.assertEquals(Math.scalb(1.0, -1050), FastMath.scalb(1.0, -1050), 0.0);
        Assert.assertEquals(Math.scalb(Double.MIN_VALUE, 1050), FastMath.scalb(Double.MIN_VALUE, 1050), 0.0);

        // float
        Assert.assertEquals(0.0f, FastMath.scalb(0.0f, 5), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.scalb(Float.NaN, 5)));
        Assert.assertEquals(Float.POSITIVE_INFINITY, FastMath.scalb(1.0f, 300), 0.0f);
        Assert.assertEquals(0.0f, FastMath.scalb(1.0f, -300), 0.0f);
        Assert.assertEquals(8.0f, FastMath.scalb(1.0f, 3), 0.0f);
        Assert.assertEquals(Math.scalb(1.0f, -140), FastMath.scalb(1.0f, -140), 0.0f);
        Assert.assertEquals(Math.scalb(Float.MIN_VALUE, 140), FastMath.scalb(Float.MIN_VALUE, 140), 0.0f);
    }

    @Test
    public void testHypotFloorCeilRintRound() {
        // hypot
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(Double.POSITIVE_INFINITY, 1.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.hypot(1.0, Double.NEGATIVE_INFINITY), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.hypot(Double.NaN, 1.0)));
        Assert.assertEquals(5.0, FastMath.hypot(3.0, 4.0), EPSILON);
        Assert.assertEquals(1e300, FastMath.hypot(1e300, 1.0), EPSILON);
        Assert.assertEquals(1e300, FastMath.hypot(1.0, 1e300), EPSILON);

        // floor / ceil / rint / round
        Assert.assertTrue(Double.isNaN(FastMath.floor(Double.NaN)));
        Assert.assertEquals(FastMath.pow(2.0, 53), FastMath.floor(FastMath.pow(2.0, 53)), 0.0);
        Assert.assertEquals(-2.0, FastMath.floor(-1.5), 0.0);
        Assert.assertEquals(0.0, FastMath.floor(0.5), 0.0);

        Assert.assertTrue(Double.isNaN(FastMath.ceil(Double.NaN)));
        Assert.assertEquals(-1.0, FastMath.ceil(-1.5), 0.0);
        Assert.assertEquals(1.0, FastMath.ceil(0.5), 0.0);
        Assert.assertEquals(-0.0, FastMath.ceil(-0.5), 0.0);

        Assert.assertEquals(2.0, FastMath.rint(1.5), 0.0);
        Assert.assertEquals(2.0, FastMath.rint(2.5), 0.0);
        Assert.assertEquals(-2.0, FastMath.rint(-1.5), 0.0);
        Assert.assertEquals(-0.0, FastMath.rint(-0.2), 0.0);

        Assert.assertEquals(2L, FastMath.round(1.5));
        Assert.assertEquals(-1L, FastMath.round(-1.5));
        Assert.assertEquals(2, FastMath.round(1.5f));
        Assert.assertEquals(-1, FastMath.round(-1.5f));
    }

    @Test
    public void testMinMaxAbsCopySignAndExponent() {
        // min / max double
        Assert.assertTrue(Double.isNaN(FastMath.min(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(FastMath.max(Double.NaN, 1.0)));
        Assert.assertEquals(-0.0, FastMath.min(+0.0, -0.0), 0.0);
        Assert.assertEquals(+0.0, FastMath.max(+0.0, -0.0), 0.0);
        Assert.assertEquals(-0.0, Double.longBitsToDouble(Double.doubleToRawLongBits(FastMath.min(+0.0, -0.0))), 0.0);
        Assert.assertEquals(1.0, FastMath.min(1.0, 2.0), 0.0);
        Assert.assertEquals(2.0, FastMath.max(1.0, 2.0), 0.0);

        // min / max float, int, long
        Assert.assertEquals(-0.0f, FastMath.min(+0.0f, -0.0f), 0.0f);
        Assert.assertEquals(+0.0f, FastMath.max(+0.0f, -0.0f), 0.0f);
        Assert.assertTrue(Float.isNaN(FastMath.min(Float.NaN, 1.0f)));
        Assert.assertTrue(Float.isNaN(FastMath.max(Float.NaN, 1.0f)));
        Assert.assertEquals(1, FastMath.min(1, 2));
        Assert.assertEquals(2, FastMath.max(1, 2));
        Assert.assertEquals(1L, FastMath.min(1L, 2L));
        Assert.assertEquals(2L, FastMath.max(1L, 2L));

        // abs
        Assert.assertEquals(5, FastMath.abs(-5));
        Assert.assertEquals(5L, FastMath.abs(-5L));
        Assert.assertEquals(5.0f, FastMath.abs(-5.0f), 0.0f);
        Assert.assertEquals(0.0f, FastMath.abs(-0.0f), 0.0f);
        Assert.assertEquals(5.0, FastMath.abs(-5.0), 0.0);
        Assert.assertEquals(0.0, FastMath.abs(-0.0), 0.0);

        // copySign
        Assert.assertEquals(2.0, FastMath.copySign(2.0, 1.0), 0.0);
        Assert.assertEquals(-2.0, FastMath.copySign(2.0, -1.0), 0.0);
        Assert.assertEquals(2.0f, FastMath.copySign(2.0f, 1.0f), 0.0f);
        Assert.assertEquals(-2.0f, FastMath.copySign(2.0f, -1.0f), 0.0f);

        // getExponent
        Assert.assertEquals(0, FastMath.getExponent(1.0));
        Assert.assertEquals(3, FastMath.getExponent(8.0));
        Assert.assertEquals(0, FastMath.getExponent(1.0f));
        Assert.assertEquals(3, FastMath.getExponent(8.0f));
    }

    @Test
    public void testCbrtAndConversions() {
        Assert.assertEquals(0.0, FastMath.cbrt(0.0), 0.0);
        Assert.assertEquals(-0.0, FastMath.cbrt(-0.0), 0.0);
        Assert.assertTrue(Double.isNaN(FastMath.cbrt(Double.NaN)));
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(2.0, FastMath.cbrt(8.0), EPSILON);
        Assert.assertEquals(-2.0, FastMath.cbrt(-8.0), EPSILON);
        Assert.assertEquals(Math.cbrt(Double.MIN_VALUE), FastMath.cbrt(Double.MIN_VALUE), EPSILON);

        // toRadians & toDegrees
        Assert.assertEquals(0.0, FastMath.toRadians(0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.toRadians(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(Math.PI, FastMath.toRadians(180.0), EPSILON);
        Assert.assertEquals(0.0, FastMath.toDegrees(0.0), 0.0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, FastMath.toDegrees(Double.POSITIVE_INFINITY), 0.0);
        Assert.assertEquals(180.0, FastMath.toDegrees(Math.PI), EPSILON);

        // sqrt & random
        Assert.assertEquals(3.0, FastMath.sqrt(9.0), EPSILON);
        double r = FastMath.random();
        Assert.assertTrue(r >= 0.0 && r < 1.0);
    }
}