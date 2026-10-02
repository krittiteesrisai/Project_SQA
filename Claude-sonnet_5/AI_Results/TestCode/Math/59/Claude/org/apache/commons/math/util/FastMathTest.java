package org.apache.commons.math.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class FastMathTest {

    private static final double DELTA = 1e-9;

    // =====================================================================
    // sqrt
    // =====================================================================
    @Test
    public void testSqrtPositive() {
        assertEquals(3.0, FastMath.sqrt(9.0), DELTA);
    }

    @Test
    public void testSqrtZero() {
        assertEquals(0.0, FastMath.sqrt(0.0), DELTA);
    }

    @Test
    public void testSqrtNegative() {
        assertTrue(Double.isNaN(FastMath.sqrt(-1.0)));
    }

    // =====================================================================
    // cosh : x!=x ; x>20 ; x<-20 ; normal (x<0 flips sign internally)
    // =====================================================================
    @Test
    public void testCoshNaN() {
        assertTrue(Double.isNaN(FastMath.cosh(Double.NaN)));
    }

    @Test
    public void testCoshLargePositive() {
        double x = 25.0;
        double expected = Math.cosh(x);
        assertEquals(expected, FastMath.cosh(x), expected * 1e-9);
    }

    @Test
    public void testCoshLargeNegative() {
        double x = -25.0;
        double expected = Math.cosh(x);
        assertEquals(expected, FastMath.cosh(x), expected * 1e-9);
    }

    @Test
    public void testCoshNormalPositive() {
        double x = 1.0;
        assertEquals(Math.cosh(x), FastMath.cosh(x), 1e-9);
    }

    @Test
    public void testCoshNormalNegative() {
        double x = -1.0;
        assertEquals(Math.cosh(x), FastMath.cosh(x), 1e-9);
    }

    // =====================================================================
    // sinh : x!=x ; x>20 ; x<-20 ; x==0 ; x<0(negate) ; x>0.25(exp) ; x<=0.25(expm1)
    // =====================================================================
    @Test
    public void testSinhNaN() {
        assertTrue(Double.isNaN(FastMath.sinh(Double.NaN)));
    }

    @Test
    public void testSinhLargePositive() {
        double x = 25.0;
        double expected = Math.sinh(x);
        assertEquals(expected, FastMath.sinh(x), Math.abs(expected) * 1e-9);
    }

    @Test
    public void testSinhLargeNegative() {
        double x = -25.0;
        double expected = Math.sinh(x);
        assertEquals(expected, FastMath.sinh(x), Math.abs(expected) * 1e-9);
    }

    @Test
    public void testSinhZero() {
        assertEquals(0.0, FastMath.sinh(0.0), 0.0);
    }

    @Test
    public void testSinhSmallPositive_expm1Branch() {
        double x = 0.1; // x <= 0.25
        assertEquals(Math.sinh(x), FastMath.sinh(x), 1e-9);
    }

    @Test
    public void testSinhSmallNegative_negateAndExpm1() {
        double x = -0.1;
        assertEquals(Math.sinh(x), FastMath.sinh(x), 1e-9);
    }

    @Test
    public void testSinhLarger_expBranch() {
        double x = 1.0; // x > 0.25
        assertEquals(Math.sinh(x), FastMath.sinh(x), 1e-9);
    }

    // =====================================================================
    // tanh : x!=x ; x>20 ; x<-20 ; x==0 ; x<0(negate) ; x>=0.5(exp) ; x<0.5(expm1)
    // =====================================================================
    @Test
    public void testTanhNaN() {
        assertTrue(Double.isNaN(FastMath.tanh(Double.NaN)));
    }

    @Test
    public void testTanhLargePositive() {
        assertEquals(1.0, FastMath.tanh(25.0), DELTA);
    }

    @Test
    public void testTanhLargeNegative() {
        assertEquals(-1.0, FastMath.tanh(-25.0), DELTA);
    }

    @Test
    public void testTanhZero() {
        assertEquals(0.0, FastMath.tanh(0.0), 0.0);
    }

    @Test
    public void testTanhSmall_expm1Branch() {
        double x = 0.3; // < 0.5
        assertEquals(Math.tanh(x), FastMath.tanh(x), 1e-9);
    }

    @Test
    public void testTanhLarge_expBranch() {
        double x = 0.7; // >= 0.5
        assertEquals(Math.tanh(x), FastMath.tanh(x), 1e-9);
    }

    @Test
    public void testTanhNegativeSmall_negateAndExpm1() {
        double x = -0.3;
        assertEquals(Math.tanh(x), FastMath.tanh(x), 1e-9);
    }

    // =====================================================================
    // acosh
    // =====================================================================
    @Test
    public void testAcosh() {
        double x = 2.0;
        double expected = Math.log(x + Math.sqrt(x * x - 1));
        assertEquals(expected, FastMath.acosh(x), 1e-9);
    }

    // =====================================================================
    // asinh : negative branch; a>0.167 ; 0.097<a<=0.167 ; 0.036<a<=0.097 ;
    //         0.0036<a<=0.036 ; a<=0.0036
    // =====================================================================
    @Test
    public void testAsinhNegative() {
        assertEquals(-FastMath.asinh(0.5), FastMath.asinh(-0.5), 1e-9);
    }

    @Test
    public void testAsinhBranchLog() { // a > 0.167
        double a = 0.5;
        double expected = Math.log(Math.sqrt(a * a + 1) + a);
        assertEquals(expected, FastMath.asinh(a), 1e-9);
    }

    @Test
    public void testAsinhBranchPoly1() { // 0.097 < a <= 0.167
        double a = 0.12;
        double expected = Math.log(Math.sqrt(a * a + 1) + a);
        assertEquals(expected, FastMath.asinh(a), 1e-6);
    }

    @Test
    public void testAsinhBranchPoly2() { // 0.036 < a <= 0.097
        double a = 0.05;
        double expected = Math.log(Math.sqrt(a * a + 1) + a);
        assertEquals(expected, FastMath.asinh(a), 1e-6);
    }

    @Test
    public void testAsinhBranchPoly3() { // 0.0036 < a <= 0.036
        double a = 0.01;
        double expected = Math.log(Math.sqrt(a * a + 1) + a);
        assertEquals(expected, FastMath.asinh(a), 1e-9);
    }

    @Test
    public void testAsinhBranchPoly4() { // a <= 0.0036
        double a = 0.001;
        double expected = Math.log(Math.sqrt(a * a + 1) + a);
        assertEquals(expected, FastMath.asinh(a), 1e-9);
    }

    // =====================================================================
    // atanh : negative branch; a>0.15 ; 0.087<a<=0.15 ; 0.031<a<=0.087 ;
    //         0.003<a<=0.031 ; a<=0.003
    // =====================================================================
    @Test
    public void testAtanhNegative() {
        assertEquals(-FastMath.atanh(0.5), FastMath.atanh(-0.5), 1e-9);
    }

    @Test
    public void testAtanhBranchLog() { // a > 0.15
        double a = 0.5;
        double expected = 0.5 * Math.log((1 + a) / (1 - a));
        assertEquals(expected, FastMath.atanh(a), 1e-9);
    }

    @Test
    public void testAtanhBranchPoly1() { // 0.087 < a <= 0.15
        double a = 0.1;
        double expected = 0.5 * Math.log((1 + a) / (1 - a));
        assertEquals(expected, FastMath.atanh(a), 1e-6);
    }

    @Test
    public void testAtanhBranchPoly2() { // 0.031 < a <= 0.087
        double a = 0.05;
        double expected = 0.5 * Math.log((1 + a) / (1 - a));
        assertEquals(expected, FastMath.atanh(a), 1e-8);
    }

    @Test
    public void testAtanhBranchPoly3() { // 0.003 < a <= 0.031
        double a = 0.01;
        double expected = 0.5 * Math.log((1 + a) / (1 - a));
        assertEquals(expected, FastMath.atanh(a), 1e-9);
    }

    @Test
    public void testAtanhBranchPoly4() { // a <= 0.003
        double a = 0.001;
        double expected = 0.5 * Math.log((1 + a) / (1 - a));
        assertEquals(expected, FastMath.atanh(a), 1e-9);
    }

    // =====================================================================
    // signum
    // =====================================================================
    @Test
    public void testSignumNegative() {
        assertEquals(-1.0, FastMath.signum(-5.0), 0.0);
    }

    @Test
    public void testSignumPositive() {
        assertEquals(1.0, FastMath.signum(5.0), 0.0);
    }

    @Test
    public void testSignumZero() {
        assertEquals(0.0, FastMath.signum(0.0), 0.0);
    }

    @Test
    public void testSignumNaN() {
        assertTrue(Double.isNaN(FastMath.signum(Double.NaN)));
    }

    // =====================================================================
    // nextUp
    // =====================================================================
    @Test
    public void testNextUp() {
        double x = 1.0;
        assertEquals(FastMath.nextAfter(x, Double.POSITIVE_INFINITY),
                     FastMath.nextUp(x), 0.0);
        assertTrue(FastMath.nextUp(x) > x);
    }

    // =====================================================================
    // random
    // =====================================================================
    @Test
    public void testRandomRange() {
        for (int i = 0; i < 100; i++) {
            double r = FastMath.random();
            assertTrue(r >= 0.0 && r < 1.0);
        }
    }

    // =====================================================================
    // exp : x<0 branches (intVal>746 ; intVal>709 ; intVal==709 ; normal)
    //       x>=0 branches (intVal>709 ; normal)
    // =====================================================================
    @Test
    public void testExpZero() {
        assertEquals(1.0, FastMath.exp(0.0), DELTA);
    }

    @Test
    public void testExpOne() {
        assertEquals(Math.E, FastMath.exp(1.0), 1e-9);
    }

    @Test
    public void testExpNegativeNormal() {
        double x = -2.0;
        assertEquals(Math.exp(x), FastMath.exp(x), 1e-9);
    }

    @Test
    public void testExpOverflow_intValGt709Positive() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.exp(800.0), 0.0);
    }

    @Test
    public void testExpVeryNegative_intValGt746() {
        assertEquals(0.0, FastMath.exp(-750.0), 0.0); // exact-zero branch
    }

    @Test
    public void testExpIntVal709Branch() {
        double x = -709.5; // (int)-x == 709
        double expected = Math.exp(x);
        double actual = FastMath.exp(x);
        if (expected == 0.0) {
            assertEquals(0.0, actual, 0.0);
        } else {
            assertEquals(expected, actual, Math.abs(expected) * 1e-6);
        }
    }

    @Test
    public void testExpSubnormalBranch_intValGt709Negative() {
        double x = -720.0;
        double expected = Math.exp(x);
        double actual = FastMath.exp(x);
        if (expected == 0.0) {
            assertEquals(0.0, actual, 0.0);
        } else {
            assertEquals(expected, actual, Math.abs(expected) * 1e-6);
        }
    }

    // =====================================================================
    // expm1 : NaN/zero ; x>=1 ; x<=-1 ; -1<x<1
    // =====================================================================
    @Test
    public void testExpm1Zero() {
        assertEquals(0.0, FastMath.expm1(0.0), 0.0);
    }

    @Test
    public void testExpm1NaN() {
        assertTrue(Double.isNaN(FastMath.expm1(Double.NaN)));
    }

    @Test
    public void testExpm1LargePositive() {
        double x = 2.0;
        assertEquals(Math.expm1(x), FastMath.expm1(x), 1e-9);
    }

    @Test
    public void testExpm1LargeNegative() {
        double x = -2.0;
        assertEquals(Math.expm1(x), FastMath.expm1(x), 1e-9);
    }

    @Test
    public void testExpm1Small() {
        double x = 0.5;
        assertEquals(Math.expm1(x), FastMath.expm1(x), 1e-9);
    }

    @Test
    public void testExpm1SmallNegative() {
        double x = -0.5;
        assertEquals(Math.expm1(x), FastMath.expm1(x), 1e-9);
    }

    // =====================================================================
    // log : negative(NaN) ; zero(-Inf) ; +Inf ; near 1 (0.99-1.01) ; normal ; NaN
    // =====================================================================
    @Test
    public void testLogNegative() {
        assertTrue(Double.isNaN(FastMath.log(-1.0)));
    }

    @Test
    public void testLogZero() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log(0.0), 0.0);
    }

    @Test
    public void testLogPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testLogOne() {
        assertEquals(0.0, FastMath.log(1.0), 1e-9);
    }

    @Test
    public void testLogNearOneBranch() { // 0.99<x<1.01
        double x = 1.005;
        assertEquals(Math.log(x), FastMath.log(x), 1e-9);
    }

    @Test
    public void testLogNormal() {
        double x = 10.0;
        assertEquals(Math.log(x), FastMath.log(x), 1e-9);
    }

    @Test
    public void testLogNaN() {
        assertTrue(Double.isNaN(FastMath.log(Double.NaN)));
    }

    // =====================================================================
    // log1p : x==-1 ; x==+Inf ; x>1e-6 ; x<-1e-6 ; |x|<=1e-6
    // =====================================================================
    @Test
    public void testLog1pMinusOne() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.log1p(-1.0), 0.0);
    }

    @Test
    public void testLog1pPositiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.log1p(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testLog1pLargePositive() {
        double x = 1.0;
        assertEquals(Math.log1p(x), FastMath.log1p(x), 1e-9);
    }

    @Test
    public void testLog1pLargeNegative() {
        double x = -0.5;
        assertEquals(Math.log1p(x), FastMath.log1p(x), 1e-9);
    }

    @Test
    public void testLog1pSmall_TaylorBranch() {
        double x = 1e-8;
        assertEquals(Math.log1p(x), FastMath.log1p(x), 1e-12);
    }

    // =====================================================================
    // log10
    // =====================================================================
    @Test
    public void testLog10() {
        assertEquals(3.0, FastMath.log10(1000.0), 1e-9);
    }

    // =====================================================================
    // pow : y==0 ; x NaN ; x==0 (+/-zero, various exponent parity/sign) ;
    //       x=+Inf ; y=+Inf ; x=-Inf ; y=-Inf ; x<0 (large/odd/even/non-int) ; normal
    // =====================================================================
    @Test
    public void testPowYZero() {
        assertEquals(1.0, FastMath.pow(5.0, 0.0), 0.0);
    }

    @Test
    public void testPowYZeroXNaN() {
        assertEquals(1.0, FastMath.pow(Double.NaN, 0.0), 0.0); // y==0 checked before x!=x
    }

    @Test
    public void testPowXNaN() {
        assertTrue(Double.isNaN(FastMath.pow(Double.NaN, 2.0)));
    }

    @Test
    public void testPowZeroBaseNegativeExp() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.0, -3.0), 0.0);
    }

    @Test
    public void testPowZeroBasePositiveExp() {
        assertEquals(0.0, FastMath.pow(0.0, 3.0), 0.0);
    }

    @Test
    public void testPowNegZeroBaseOddNegExp() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(-0.0, -3.0), 0.0);
    }

    @Test
    public void testPowNegZeroBaseEvenNegExp() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(-0.0, -4.0), 0.0);
    }

    @Test
    public void testPowNegZeroBaseOddPosExp() {
        double r = FastMath.pow(-0.0, 3.0);
        assertEquals(0.0, r, 0.0);
        assertTrue(1.0 / r < 0); // confirm negative zero
    }

    @Test
    public void testPowNegZeroBaseEvenPosExp() {
        assertEquals(0.0, FastMath.pow(-0.0, 4.0), 0.0);
    }

    @Test
    public void testPowPosInfinityBaseYNaN() {
        assertTrue(Double.isNaN(FastMath.pow(Double.POSITIVE_INFINITY, Double.NaN)));
    }

    @Test
    public void testPowPosInfinityBaseNegExp() {
        assertEquals(0.0, FastMath.pow(Double.POSITIVE_INFINITY, -2.0), 0.0);
    }

    @Test
    public void testPowPosInfinityBasePosExp() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.POSITIVE_INFINITY, 2.0), 0.0);
    }

    @Test
    public void testPowExpPosInfinityBaseUnit() {
        assertTrue(Double.isNaN(FastMath.pow(1.0, Double.POSITIVE_INFINITY)));
        assertTrue(Double.isNaN(FastMath.pow(-1.0, Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testPowExpPosInfinityBaseGreater() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(2.0, Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testPowExpPosInfinityBaseLess() {
        assertEquals(0.0, FastMath.pow(0.5, Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testPowNegInfinityBaseYNaN() {
        assertTrue(Double.isNaN(FastMath.pow(Double.NEGATIVE_INFINITY, Double.NaN)));
    }

    @Test
    public void testPowNegInfinityBaseNegOddExp() {
        double r = FastMath.pow(Double.NEGATIVE_INFINITY, -3.0);
        assertEquals(0.0, r, 0.0);
        assertTrue(1.0 / r < 0);
    }

    @Test
    public void testPowNegInfinityBaseNegEvenExp() {
        assertEquals(0.0, FastMath.pow(Double.NEGATIVE_INFINITY, -4.0), 0.0);
    }

    @Test
    public void testPowNegInfinityBasePosOddExp() {
        assertEquals(Double.NEGATIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 3.0), 0.0);
    }

    @Test
    public void testPowNegInfinityBasePosEvenExp() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(Double.NEGATIVE_INFINITY, 4.0), 0.0);
    }

    @Test
    public void testPowExpNegInfinityBaseUnit() {
        assertTrue(Double.isNaN(FastMath.pow(1.0, Double.NEGATIVE_INFINITY)));
    }

    @Test
    public void testPowExpNegInfinityBaseLess() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.pow(0.5, Double.NEGATIVE_INFINITY), 0.0);
    }

    @Test
    public void testPowExpNegInfinityBaseGreater() {
        assertEquals(0.0, FastMath.pow(2.0, Double.NEGATIVE_INFINITY), 0.0);
    }

    @Test
    public void testPowNegativeBaseLargeExponent() { // y>=4503599627370496.0
        double y = 4503599627370496.0;
        assertEquals(FastMath.pow(2.0, y), FastMath.pow(-2.0, y), 0.0);
    }

    @Test
    public void testPowNegativeBaseOddIntegerExp() {
        assertEquals(-8.0, FastMath.pow(-2.0, 3.0), 1e-9);
    }

    @Test
    public void testPowNegativeBaseEvenIntegerExp() {
        assertEquals(16.0, FastMath.pow(-2.0, 4.0), 1e-9);
    }

    @Test
    public void testPowNegativeBaseNonIntegerExp() {
        assertTrue(Double.isNaN(FastMath.pow(-2.0, 2.5)));
    }

    @Test
    public void testPowNormal() {
        assertEquals(1024.0, FastMath.pow(2.0, 10.0), 1e-9);
        assertEquals(Math.sqrt(2.0), FastMath.pow(2.0, 0.5), 1e-9);
    }

    // =====================================================================
    // sin : NaN ; +Inf ; +0/-0 ; normal ; CodyWaite quadrant 0..3 ; PayneHanek
    // =====================================================================
    @Test
    public void testSinNaN() {
        assertTrue(Double.isNaN(FastMath.sin(Double.NaN)));
    }

    @Test
    public void testSinInfinity() {
        assertTrue(Double.isNaN(FastMath.sin(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testSinPositiveZero() {
        assertEquals(0.0, FastMath.sin(0.0), 0.0);
    }

    @Test
    public void testSinNegativeZero() {
        double r = FastMath.sin(-0.0);
        assertEquals(0.0, r, 0.0);
        assertTrue(1.0 / r < 0);
    }

    @Test
    public void testSinSmallPositive() {
        double x = 0.5;
        assertEquals(Math.sin(x), FastMath.sin(x), 1e-9);
    }

    @Test
    public void testSinNegativeValue() {
        double x = -0.5;
        assertEquals(Math.sin(x), FastMath.sin(x), 1e-9);
    }

    @Test
    public void testSinQuadrants() {
        assertEquals(Math.sin(2.0), FastMath.sin(2.0), 1e-9); // quadrant1
        assertEquals(Math.sin(4.0), FastMath.sin(4.0), 1e-9); // quadrant2
        assertEquals(Math.sin(5.0), FastMath.sin(5.0), 1e-9); // quadrant3
    }

    @Test
    public void testSinLargeArg_PayneHanek() {
        double x = 1e8; // xa > 3294198.0
        assertEquals(Math.sin(x), FastMath.sin(x), 1e-6);
    }

    // =====================================================================
    // cos : NaN ; +Inf ; normal ; quadrants ; PayneHanek
    // =====================================================================
    @Test
    public void testCosNaN() {
        assertTrue(Double.isNaN(FastMath.cos(Double.NaN)));
    }

    @Test
    public void testCosInfinity() {
        assertTrue(Double.isNaN(FastMath.cos(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testCosNormal() {
        assertEquals(Math.cos(1.0), FastMath.cos(1.0), 1e-9);
    }

    @Test
    public void testCosNegative() {
        assertEquals(Math.cos(-1.0), FastMath.cos(-1.0), 1e-9);
    }

    @Test
    public void testCosQuadrants() {
        assertEquals(Math.cos(2.0), FastMath.cos(2.0), 1e-9);
        assertEquals(Math.cos(4.0), FastMath.cos(4.0), 1e-9);
        assertEquals(Math.cos(5.0), FastMath.cos(5.0), 1e-9);
    }

    @Test
    public void testCosLargeArg_PayneHanek() {
        double x = 1e8;
        assertEquals(Math.cos(x), FastMath.cos(x), 1e-6);
    }

    // =====================================================================
    // tan : NaN ; +Inf ; +0/-0 ; normal ; near pi/2 ; large arg
    // =====================================================================
    @Test
    public void testTanNaN() {
        assertTrue(Double.isNaN(FastMath.tan(Double.NaN)));
    }

    @Test
    public void testTanInfinity() {
        assertTrue(Double.isNaN(FastMath.tan(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testTanPositiveZero() {
        assertEquals(0.0, FastMath.tan(0.0), 0.0);
    }

    @Test
    public void testTanNegativeZero() {
        double r = FastMath.tan(-0.0);
        assertTrue(1.0 / r < 0);
    }

    @Test
    public void testTanNormal() {
        assertEquals(Math.tan(0.5), FastMath.tan(0.5), 1e-9);
    }

    @Test
    public void testTanNegative() {
        assertEquals(Math.tan(-0.5), FastMath.tan(-0.5), 1e-9);
    }

    @Test
    public void testTanNearPiOver2() { // xa > 1.5 branch
        double x = 1.57;
        assertEquals(Math.tan(x), FastMath.tan(x), 1e-6);
    }

    @Test
    public void testTanLargeArg() {
        double x = 1e8;
        assertEquals(Math.tan(x), FastMath.tan(x), 1e-3); // tan is sensitive, loose delta
    }

    // =====================================================================
    // atan / atan2
    // =====================================================================
    @Test
    public void testAtanZero() {
        assertEquals(0.0, FastMath.atan(0.0), 0.0);
    }

    @Test
    public void testAtanPositive() {
        assertEquals(Math.atan(1.0), FastMath.atan(1.0), 1e-9);
    }

    @Test
    public void testAtanNegative() {
        assertEquals(Math.atan(-1.0), FastMath.atan(-1.0), 1e-9);
    }

    @Test
    public void testAtanVeryLarge() {
        assertEquals(Math.PI / 2.0, FastMath.atan(1e20), 1e-9);
    }

    @Test
    public void testAtanVeryLargeNegative() {
        assertEquals(-Math.PI / 2.0, FastMath.atan(-1e20), 1e-9);
    }

    @Test
    public void testAtan2NaN() {
        assertTrue(Double.isNaN(FastMath.atan2(Double.NaN, 1.0)));
        assertTrue(Double.isNaN(FastMath.atan2(1.0, Double.NaN)));
    }

    @Test
    public void testAtan2YZeroXPositive() {
        assertEquals(0.0, FastMath.atan2(0.0, 5.0), 0.0);
    }

    @Test
    public void testAtan2YZeroXNegative() {
        assertEquals(Math.PI, FastMath.atan2(0.0, -5.0), 0.0);
    }

    @Test
    public void testAtan2YNegZeroXNegative() {
        assertEquals(-Math.PI, FastMath.atan2(-0.0, -5.0), 0.0);
    }

    @Test
    public void testAtan2YZeroXZero() {
        assertEquals(0.0, FastMath.atan2(0.0, 0.0), 0.0);
    }

    @Test
    public void testAtan2XInfiniteYZero() {
        assertEquals(0.0, FastMath.atan2(0.0, Double.POSITIVE_INFINITY), 0.0);
        assertEquals(Math.PI, FastMath.atan2(0.0, Double.NEGATIVE_INFINITY), 0.0);
    }

    @Test
    public void testAtan2YPosInfXPosInf() {
        assertEquals(Math.PI / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY), 1e-9);
    }

    @Test
    public void testAtan2YPosInfXNegInf() {
        assertEquals(Math.PI * 3.0 / 4.0, FastMath.atan2(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY), 1e-9);
    }

    @Test
    public void testAtan2YPosInfXFinite() {
        assertEquals(Math.PI / 2.0, FastMath.atan2(Double.POSITIVE_INFINITY, 5.0), 1e-9);
    }

    @Test
    public void testAtan2YNegInfXFinite() {
        assertEquals(-Math.PI / 2.0, FastMath.atan2(Double.NEGATIVE_INFINITY, 5.0), 1e-9);
    }

    @Test
    public void testAtan2XPosInfYPositive() {
        assertEquals(0.0, FastMath.atan2(5.0, Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testAtan2XNegInfYPositive() {
        assertEquals(Math.PI, FastMath.atan2(5.0, Double.NEGATIVE_INFINITY), 1e-9);
    }

    @Test
    public void testAtan2XZeroYPositive() {
        assertEquals(Math.PI / 2.0, FastMath.atan2(5.0, 0.0), 1e-9);
    }

    @Test
    public void testAtan2XZeroYNegative() {
        assertEquals(-Math.PI / 2.0, FastMath.atan2(-5.0, 0.0), 1e-9);
    }

    @Test
    public void testAtan2Normal() {
        assertEquals(Math.atan2(1.0, 1.0), FastMath.atan2(1.0, 1.0), 1e-9);
        assertEquals(Math.atan2(1.0, -1.0), FastMath.atan2(1.0, -1.0), 1e-9);
        assertEquals(Math.atan2(-1.0, -1.0), FastMath.atan2(-1.0, -1.0), 1e-9);
    }

    @Test
    public void testAtan2LargeX_RescaleBranch() {
        double x = 9e298, y = 9e298; // x > 8e298
        assertEquals(Math.atan2(y, x), FastMath.atan2(y, x), 1e-9);
    }

    // =====================================================================
    // asin / acos
    // =====================================================================
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
    public void testAsinOne() {
        assertEquals(Math.PI / 2.0, FastMath.asin(1.0), 1e-9);
    }

    @Test
    public void testAsinMinusOne() {
        assertEquals(-Math.PI / 2.0, FastMath.asin(-1.0), 1e-9);
    }

    @Test
    public void testAsinNormal() {
        assertEquals(Math.asin(0.5), FastMath.asin(0.5), 1e-9);
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
    public void testAcosMinusOne() {
        assertEquals(Math.PI, FastMath.acos(-1.0), 1e-9);
    }

    @Test
    public void testAcosOne() {
        assertEquals(0.0, FastMath.acos(1.0), 1e-9);
    }

    @Test
    public void testAcosZero() {
        assertEquals(Math.PI / 2.0, FastMath.acos(0.0), 1e-9);
    }

    @Test
    public void testAcosNormal() {
        assertEquals(Math.acos(0.5), FastMath.acos(0.5), 1e-9);
    }

    // =====================================================================
    // cbrt : zero ; NaN ; Infinity ; normal +/- ; subnormal
    // =====================================================================
    @Test
    public void testCbrtZero() {
        assertEquals(0.0, FastMath.cbrt(0.0), 0.0);
    }

    @Test
    public void testCbrtNaN() {
        assertTrue(Double.isNaN(FastMath.cbrt(Double.NaN)));
    }

    @Test
    public void testCbrtInfinity() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.cbrt(Double.POSITIVE_INFINITY), 0.0);
    }

    @Test
    public void testCbrtNormalPositive() {
        assertEquals(2.0, FastMath.cbrt(8.0), 1e-9);
    }

    @Test
    public void testCbrtNormalNegative() {
        assertEquals(-2.0, FastMath.cbrt(-8.0), 1e-9);
    }

    @Test
    public void testCbrtSubnormalBranch() {
        double x = Double.MIN_VALUE; // exponent == -1023 branch
        double result = FastMath.cbrt(x);
        assertTrue(result > 0);
        double cubed = result * result * result;
        assertEquals(1.0, cubed / x, 1e-6);
    }

    // =====================================================================
    // toRadians / toDegrees
    // =====================================================================
    @Test
    public void testToRadians() {
        assertEquals(Math.PI, FastMath.toRadians(180.0), 1e-9);
    }

    @Test
    public void testToDegrees() {
        assertEquals(180.0, FastMath.toDegrees(Math.PI), 1e-7);
    }

    // =====================================================================
    // abs (int, long, float, double)
    // =====================================================================
    @Test
    public void testAbsIntPositive() {
        assertEquals(5, FastMath.abs(5));
    }

    @Test
    public void testAbsIntNegative() {
        assertEquals(5, FastMath.abs(-5));
    }

    @Test
    public void testAbsLongPositive() {
        assertEquals(5L, FastMath.abs(5L));
    }

    @Test
    public void testAbsLongNegative() {
        assertEquals(5L, FastMath.abs(-5L));
    }

    @Test
    public void testAbsFloatPositive() {
        assertEquals(5.0f, FastMath.abs(5.0f), 0.0f);
    }

    @Test
    public void testAbsFloatNegative() {
        assertEquals(5.0f, FastMath.abs(-5.0f), 0.0f);
    }

    @Test
    public void testAbsDoublePositive() {
        assertEquals(5.0, FastMath.abs(5.0), 0.0);
    }

    @Test
    public void testAbsDoubleNegative() {
        assertEquals(5.0, FastMath.abs(-5.0), 0.0);
    }

    // =====================================================================
    // ulp
    // =====================================================================
    @Test
    public void testUlp() {
        double x = 1.0;
        assertEquals(Math.ulp(x), FastMath.ulp(x), 1e-30);
    }

    // =====================================================================
    // nextAfter : NaN ; Infinite ; zero ; increase (incl mantissa overflow) ;
    //             decrease (incl mantissa underflow)
    // =====================================================================
    @Test
    public void testNextAfterNaN() {
        assertTrue(Double.isNaN(FastMath.nextAfter(Double.NaN, 1.0)));
    }

    @Test
    public void testNextAfterInfinite() {
        assertEquals(Double.POSITIVE_INFINITY, FastMath.nextAfter(Double.POSITIVE_INFINITY, 0.0), 0.0);
    }

    @Test
    public void testNextAfterZeroTowardsPositive() {
        assertEquals(Double.MIN_VALUE, FastMath.nextAfter(0.0, 1.0), 0.0);
    }

    @Test
    public void testNextAfterZeroTowardsNegative() {
        assertEquals(-Double.MIN_VALUE, FastMath.nextAfter(0.0, -1.0), 0.0);
    }

    @Test
    public void testNextAfterIncrease() {
        double d = 1.0;
        assertTrue(FastMath.nextAfter(d, 2.0) > d);
    }

    @Test
    public void testNextAfterDecrease() {
        double d = 1.0;
        assertTrue(FastMath.nextAfter(d, 0.0) < d);
    }

    @Test
    public void testNextAfterMantissaOverflowIncrease() {
        // mantissa == 0x000fffffffffffffL -> exponent increment branch
        double d = Double.longBitsToDouble(0x3ff0000000000000L | 0x000fffffffffffffL);
        double result = FastMath.nextAfter(d, Double.POSITIVE_INFINITY);
        assertTrue(result > d);
    }

    @Test
    public void testNextAfterMantissaUnderflowDecrease() {
        // mantissa == 0 -> exponent decrement branch
        double d = Double.longBitsToDouble(0x3ff0000000000000L);
        double result = FastMath.nextAfter(d, Double.NEGATIVE_INFINITY);
        assertTrue(result < d);
    }

    // =====================================================================
    // floor : NaN ; huge(+/-) ; normal ; y==0 ; negative fraction
    // =====================================================================
    @Test
    public void testFloorNaN() {
        assertTrue(Double.isNaN(FastMath.floor(Double.NaN)));
    }

    @Test
    public void testFloorHugeValue() {
        double x = 4503599627370496.0;
        assertEquals(x, FastMath.floor(x), 0.0);
    }

    @Test
    public void testFloorHugeNegativeValue() {
        double x = -4503599627370496.0;
        assertEquals(x, FastMath.floor(x), 0.0);
    }

    @Test
    public void testFloorPositive() {
        assertEquals(2.0, FastMath.floor(2.7), 0.0);
    }

    @Test
    public void testFloorNegative() {
        assertEquals(-3.0, FastMath.floor(-2.5), 0.0);
    }

    @Test
    public void testFloorYEqualsZeroBranch() {
        assertEquals(0.0, FastMath.floor(0.3), 0.0);
    }

    @Test
    public void testFloorNegativeFraction() {
        assertEquals(-1.0, FastMath.floor(-0.5), 0.0);
    }

    // =====================================================================
    // ceil : NaN ; y==x ; normal ; y+1==0 branch
    // =====================================================================
    @Test
    public void testCeilNaN() {
        assertTrue(Double.isNaN(FastMath.ceil(Double.NaN)));
    }

    @Test
    public void testCeilInteger_YEqualsXBranch() {
        assertEquals(3.0, FastMath.ceil(3.0), 0.0);
    }

    @Test
    public void testCeilPositiveFraction() {
        assertEquals(3.0, FastMath.ceil(2.5), 0.0);
    }

    @Test
    public void testCeilNegativeFraction_YPlusOneEqualsZero() {
        assertEquals(0.0, FastMath.ceil(-0.5), 0.0);
    }

    // =====================================================================
    // rint : d<0.5 ; d>0.5 ; d==0.5 round-to-even (both parities)
    // =====================================================================
    @Test
    public void testRintRoundDownFraction() {
        assertEquals(2.0, FastMath.rint(2.2), 0.0);
    }

    @Test
    public void testRintRoundUpFraction() {
        assertEquals(3.0, FastMath.rint(2.7), 0.0);
    }

    @Test
    public void testRintHalfToEvenLower() {
        assertEquals(2.0, FastMath.rint(2.5), 0.0);
    }

    @Test
    public void testRintHalfToEvenUpper() {
        assertEquals(4.0, FastMath.rint(3.5), 0.0);
    }

    // =====================================================================
    // round (double -> long) / round (float -> int)
    // =====================================================================
    @Test
    public void testRoundDouble() {
        assertEquals(3L, FastMath.round(2.5));
        assertEquals(2L, FastMath.round(2.4));
    }

    @Test
    public void testRoundFloat() {
        assertEquals(3, FastMath.round(2.5f));
    }

    // =====================================================================
    // min / max : int, long, float, double (incl. NaN)
    // =====================================================================
    @Test
    public void testMinInt() {
        assertEquals(1, FastMath.min(1, 2));
        assertEquals(1, FastMath.min(2, 1));
    }

    @Test
    public void testMaxInt() {
        assertEquals(2, FastMath.max(1, 2));
        assertEquals(2, FastMath.max(2, 1));
    }

    @Test
    public void testMinLong() {
        assertEquals(1L, FastMath.min(1L, 2L));
        assertEquals(1L, FastMath.min(2L, 1L));
    }

    @Test
    public void testMaxLong() {
        assertEquals(2L, FastMath.max(1L, 2L));
        assertEquals(2L, FastMath.max(2L, 1L));
    }

    @Test
    public void testMinFloat() {
        assertEquals(1.0f, FastMath.min(1.0f, 2.0f), 0.0f);
    }

    @Test
    public void testMinFloatNaN() {
        assertTrue(Float.isNaN(FastMath.min(Float.NaN, 1.0f)));
    }

    @Test
    public void testMaxFloat() {
        assertEquals(2.0f, FastMath.max(1.0f, 2.0f), 0.0f);
    }

    @Test
    public void testMaxFloatNaN() {
        assertTrue(Float.isNaN(FastMath.max(Float.NaN, 1.0f)));
    }

    @Test
    public void testMinDouble() {
        assertEquals(1.0, FastMath.min(1.0, 2.0), 0.0);
    }

    @Test
    public void testMinDoubleNaN() {
        assertTrue(Double.isNaN(FastMath.min(Double.NaN, 1.0)));
    }

    @Test
    public void testMaxDouble() {
        assertEquals(2.0, FastMath.max(1.0, 2.0), 0.0);
    }

    @Test
    public void testMaxDoubleNaN() {
        assertTrue(Double.isNaN(FastMath.max(Double.NaN, 1.0)));
    }
}
