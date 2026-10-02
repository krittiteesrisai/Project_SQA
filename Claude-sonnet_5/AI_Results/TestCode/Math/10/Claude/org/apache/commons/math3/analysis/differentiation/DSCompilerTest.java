package org.apache.commons.math3.analysis.differentiation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.junit.Test;

/**
 * JUnit 4 test suite for {@link DSCompiler} (Defects4J Math-10b).
 *
 * หมายเหตุทั่วไป:
 * - DSCompiler.compilers เป็น static cache ที่ใช้ร่วมกันข้าม test method ใน JVM เดียวกัน
 *   ดังนั้นบาง branch ของ getCompiler (เช่น cache == null ครั้งแรกสุด) อาจถูกจับได้
 *   จากเทสใดก็ได้ที่รันก่อน ไม่สามารถบังคับลำดับได้ใน JUnit4 มาตรฐาน
 * - ค่าที่ใช้ตรวจสอบ derivative ลำดับสูง (order >= 2) อิงจากสูตรแคลคูลัสมาตรฐาน
 *   (เช่น d/dx cos(x) = -sin(x)) ซึ่งไม่ใช่การเดา behavior แต่เป็น oracle ทางคณิตศาสตร์อิสระ
 * - สำหรับ order = 3 ของฟังก์ชันพีชคณิตซับซ้อน (tan, acos, ...) ตรวจเฉพาะค่า (index 0)
 *   และอนุพันธ์อันดับ 1 (index 1) ด้วยสูตรปิดที่รู้จัก ส่วนอันดับสูงกว่านั้นตรวจแค่ว่าไม่เป็น NaN
 *   (เพื่อให้ branch ของ loop ภายในถูกทดสอบ โดยไม่เดา exact value)
 */
public class DSCompilerTest {

    private static final double EPS = 1.0e-9;

    /** Independent oracle: size(p,o) = C(p+o, o). */
    private static long binomial(final int n, final int k) {
        long result = 1;
        for (int i = 0; i < k; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }

    // ---------------------------------------------------------------
    // getCompiler / getSize / getFreeParameters / getOrder
    // ---------------------------------------------------------------

    @Test
    public void testGetSizeBoundaryAndFormula() {
        int[][] cases = {
            {0, 0}, {1, 0}, {0, 3}, {3, 0},
            {1, 3}, {3, 1}, {2, 2}, {3, 3}, {4, 2}
        };
        for (int[] c : cases) {
            DSCompiler compiler = DSCompiler.getCompiler(c[0], c[1]);
            long expected = binomial(c[0] + c[1], c[1]);
            assertEquals("p=" + c[0] + " o=" + c[1],
                         expected, compiler.getSize());
        }
    }

    @Test
    public void testGetFreeParametersAndOrder() {
        DSCompiler compiler = DSCompiler.getCompiler(3, 2);
        assertEquals(3, compiler.getFreeParameters());
        assertEquals(2, compiler.getOrder());
    }

    @Test
    public void testGetCompilerCaching() {
        DSCompiler c1 = DSCompiler.getCompiler(2, 2);
        DSCompiler c2 = DSCompiler.getCompiler(2, 2);
        // cache hit branch: must return same cached instance
        assertSame(c1, c2);
    }

    @Test
    public void testGetCompilerCacheExtension() {
        DSCompiler small = DSCompiler.getCompiler(1, 1);
        // force cache growth (branch: cache != null, need resize)
        DSCompiler big = DSCompiler.getCompiler(6, 6);
        assertNotNull(big);
        assertEquals(binomial(12, 6), big.getSize());
        // previously cached compiler must be preserved after resize
        DSCompiler smallAgain = DSCompiler.getCompiler(1, 1);
        assertSame(small, smallAgain);
    }

    // ---------------------------------------------------------------
    // getPartialDerivativeIndex / getPartialDerivativeOrders
    // ---------------------------------------------------------------

    @Test
    public void testPartialDerivativeIndex_TwoParams_Order1() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 1);
        assertEquals(0, compiler.getPartialDerivativeIndex(0, 0));
        assertEquals(1, compiler.getPartialDerivativeIndex(1, 0));
        assertEquals(2, compiler.getPartialDerivativeIndex(0, 1));

        assertArrayEquals(new int[]{0, 0}, compiler.getPartialDerivativeOrders(0));
        assertArrayEquals(new int[]{1, 0}, compiler.getPartialDerivativeOrders(1));
        assertArrayEquals(new int[]{0, 1}, compiler.getPartialDerivativeOrders(2));
    }

    @Test
    public void testPartialDerivativeIndex_TwoParams_Order2() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        // ordering per javadoc: f, df/dx, d2f/dx2, df/dy, d2f/dxdy, d2f/dy2
        assertEquals(0, compiler.getPartialDerivativeIndex(0, 0));
        assertEquals(1, compiler.getPartialDerivativeIndex(1, 0));
        assertEquals(2, compiler.getPartialDerivativeIndex(2, 0));
        assertEquals(3, compiler.getPartialDerivativeIndex(0, 1));
        assertEquals(4, compiler.getPartialDerivativeIndex(1, 1));
        assertEquals(5, compiler.getPartialDerivativeIndex(0, 2));

        for (int idx = 0; idx < 6; idx++) {
            int[] orders = compiler.getPartialDerivativeOrders(idx);
            assertEquals(idx, compiler.getPartialDerivativeIndex(orders));
        }
    }

    @Test
    public void testPartialDerivativeIndex_SingleParameterOrdering() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 3);
        // single parameter: index == derivation order
        assertEquals(0, compiler.getPartialDerivativeIndex(0));
        assertEquals(1, compiler.getPartialDerivativeIndex(1));
        assertEquals(2, compiler.getPartialDerivativeIndex(2));
        assertEquals(3, compiler.getPartialDerivativeIndex(3));
    }

    @Test(expected = DimensionMismatchException.class)
    public void testPartialDerivativeIndex_DimensionMismatch() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        compiler.getPartialDerivativeIndex(1); // only one order, expects 2
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testPartialDerivativeIndex_TooLarge_General() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        compiler.getPartialDerivativeIndex(3, 0); // sum=3 > order=2
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testPartialDerivativeIndex_TooLarge_OrderZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 0);
        compiler.getPartialDerivativeIndex(1); // any nonzero order on order-0 compiler
    }

    @Test
    public void testPartialDerivativeIndex_ZeroParametersEmptyArray() {
        DSCompiler compiler = DSCompiler.getCompiler(0, 0);
        assertEquals(0, compiler.getPartialDerivativeIndex());
    }

    // ---------------------------------------------------------------
    // linearCombination
    // ---------------------------------------------------------------

    @Test
    public void testLinearCombination2Args() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1); // size 2
        double[] c1 = {1.0, 2.0};
        double[] c2 = {4.0, 5.0};
        double[] result = new double[2];
        compiler.linearCombination(2.0, c1, 0, 3.0, c2, 0, result, 0);
        assertArrayEquals(new double[]{14.0, 19.0}, result, EPS);
    }

    @Test
    public void testLinearCombination3Args() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] c1 = {1.0, 1.0};
        double[] c2 = {2.0, 1.0};
        double[] c3 = {3.0, 1.0};
        double[] result = new double[2];
        compiler.linearCombination(1.0, c1, 0, 2.0, c2, 0, 3.0, c3, 0, result, 0);
        // value: 1*1+2*2+3*3 = 14 ; derivative: 1+2+3=6
        assertArrayEquals(new double[]{14.0, 6.0}, result, EPS);
    }

    @Test
    public void testLinearCombination4Args() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] c1 = {1.0, 1.0};
        double[] c2 = {2.0, 1.0};
        double[] c3 = {3.0, 1.0};
        double[] c4 = {4.0, 1.0};
        double[] result = new double[2];
        compiler.linearCombination(1.0, c1, 0, 1.0, c2, 0, 1.0, c3, 0, 1.0, c4, 0, result, 0);
        assertArrayEquals(new double[]{1 + 2 + 3 + 4, 4.0}, result, EPS);
    }

    // ---------------------------------------------------------------
    // add / subtract / multiply / divide / remainder
    // ---------------------------------------------------------------

    @Test
    public void testAddSubtract() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2); // size 6
        double[] a = {6, 3, 0, 2, 1, 0};
        double[] b = {5, 1, 0, 1, 0, 0};
        double[] sum = new double[6];
        double[] diff = new double[6];
        compiler.add(a, 0, b, 0, sum, 0);
        compiler.subtract(a, 0, b, 0, diff, 0);
        assertArrayEquals(new double[]{11, 4, 0, 3, 1, 0}, sum, EPS);
        assertArrayEquals(new double[]{1, 2, 0, 1, 1, 0}, diff, EPS);
    }

    @Test
    public void testMultiplyTwoParamsOrderTwo_LeibnizRule() {
        // f(x,y) = x*y ; g(x,y) = x+y  at (x=2, y=3)
        DSCompiler compiler = DSCompiler.getCompiler(2, 2); // size 6
        double[] f = {6, 3, 0, 2, 1, 0};   // f, fx, fxx, fy, fxy, fyy
        double[] g = {5, 1, 0, 1, 0, 0};   // g, gx, gxx, gy, gxy, gyy
        double[] result = new double[6];
        compiler.multiply(f, 0, g, 0, result, 0);
        // h = x^2 y + x y^2 ; computed independently by hand (Leibniz rule)
        assertArrayEquals(new double[]{30, 21, 6, 16, 10, 4}, result, EPS);
    }

    @Test
    public void testDivide() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1); // size 2
        double[] lhs = {6.0, 1.0};
        double[] rhs = {3.0, 0.5};
        double[] result = new double[2];
        compiler.divide(lhs, 0, rhs, 0, result, 0);
        // quotient rule oracle: (f'g - f g')/g^2 = (1*3-6*0.5)/9 = 0 ; value = 2
        assertArrayEquals(new double[]{2.0, 0.0}, result, 1e-6);
    }

    @Test
    public void testRemainder() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1); // size 2
        double[] lhs = {5.0, 1.0};
        double[] rhs = {2.0, 0.5};
        double[] result = new double[2];
        compiler.remainder(lhs, 0, rhs, 0, result, 0);
        // rem = 5 % 2 = 1 ; k = rint((5-1)/2) = 2 ; deriv = 1 - 2*0.5 = 0
        assertArrayEquals(new double[]{1.0, 0.0}, result, EPS);
    }

    // ---------------------------------------------------------------
    // pow (double exponent / integer exponent / DS exponent)
    // ---------------------------------------------------------------

    @Test
    public void testPowDoubleExponent() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1); // size 2
        double[] operand = {4.0, 1.0};
        double[] result = new double[2];
        compiler.pow(operand, 0, 0.5, result, 0);
        assertArrayEquals(new double[]{2.0, 0.25}, result, 1e-6);
    }

    @Test
    public void testPowIntZeroSpecialCase() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2); // size 3
        double[] operand = {7.0, 1.0, 0.0};
        double[] result = new double[3];
        compiler.pow(operand, 0, 0, result, 0);
        assertArrayEquals(new double[]{1.0, 0.0, 0.0}, result, EPS);
    }

    @Test
    public void testPowIntPositive() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1); // size 2
        double[] operand = {2.0, 1.0};
        double[] result = new double[2];
        compiler.pow(operand, 0, 3, result, 0);
        assertArrayEquals(new double[]{8.0, 12.0}, result, 1e-6);
    }

    @Test
    public void testPowIntNegative() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1); // size 2
        double[] operand = {2.0, 1.0};
        double[] result = new double[2];
        compiler.pow(operand, 0, -1, result, 0);
        assertArrayEquals(new double[]{0.5, -0.25}, result, 1e-6);
    }

    @Test
    public void testPowIntOnePositiveHigherOrder() {
        // n=1, order=2 => maxOrder < order branch, result should equal identity
        DSCompiler compiler = DSCompiler.getCompiler(1, 2); // size 3
        double[] operand = {5.0, 1.0, 0.0};
        double[] result = new double[3];
        compiler.pow(operand, 0, 1, result, 0);
        assertArrayEquals(new double[]{5.0, 1.0, 0.0}, result, 1e-6);
    }

    @Test
    public void testPowDS_BaseAndExponent() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1); // size 2
        double[] x = {2.0, 1.0};
        double[] y = {3.0, 0.0};
        double[] result = new double[2];
        compiler.pow(x, 0, y, 0, result, 0);
        assertArrayEquals(new double[]{8.0, 12.0}, result, 1e-6);
    }

    // ---------------------------------------------------------------
    // rootN
    // ---------------------------------------------------------------

    @Test
    public void testRootN_n2() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {4.0, 1.0};
        double[] result = new double[2];
        compiler.rootN(operand, 0, 2, result, 0);
        assertArrayEquals(new double[]{2.0, 0.25}, result, 1e-6);
    }

    @Test
    public void testRootN_n3() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {8.0, 1.0};
        double[] result = new double[2];
        compiler.rootN(operand, 0, 3, result, 0);
        assertArrayEquals(new double[]{2.0, 1.0 / 12.0}, result, 1e-6);
    }

    @Test
    public void testRootN_else() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {16.0, 1.0};
        double[] result = new double[2];
        compiler.rootN(operand, 0, 4, result, 0);
        assertArrayEquals(new double[]{2.0, 0.03125}, result, 1e-6);
    }

    // ---------------------------------------------------------------
    // exp / expm1 / log / log1p / log10
    // ---------------------------------------------------------------

    @Test
    public void testExp() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {0.0, 1.0};
        double[] result = new double[2];
        compiler.exp(operand, 0, result, 0);
        assertArrayEquals(new double[]{1.0, 1.0}, result, 1e-9);
    }

    @Test
    public void testExpm1() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {0.0, 1.0};
        double[] result = new double[2];
        compiler.expm1(operand, 0, result, 0);
        assertArrayEquals(new double[]{0.0, 1.0}, result, 1e-9);
    }

    @Test
    public void testLog() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {Math.E, 1.0};
        double[] result = new double[2];
        compiler.log(operand, 0, result, 0);
        assertArrayEquals(new double[]{1.0, 1.0 / Math.E}, result, 1e-9);
    }

    @Test
    public void testLog1p() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {0.0, 1.0};
        double[] result = new double[2];
        compiler.log1p(operand, 0, result, 0);
        assertArrayEquals(new double[]{0.0, 1.0}, result, 1e-9);
    }

    @Test
    public void testLog10() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {10.0, 1.0};
        double[] result = new double[2];
        compiler.log10(operand, 0, result, 0);
        assertArrayEquals(new double[]{1.0, 1.0 / (10.0 * Math.log(10.0))}, result, 1e-9);
    }

    // ---------------------------------------------------------------
    // trig / inverse trig (order>0 branch and recurrence loop)
    // ---------------------------------------------------------------

    @Test
    public void testCosOrder2AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] operand = {0.0, 1.0, 0.0};
        double[] result = new double[3];
        compiler.cos(operand, 0, result, 0);
        assertArrayEquals(new double[]{1.0, 0.0, -1.0}, result, 1e-9);
    }

    @Test
    public void testSinOrder2AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] operand = {0.0, 1.0, 0.0};
        double[] result = new double[3];
        compiler.sin(operand, 0, result, 0);
        assertArrayEquals(new double[]{0.0, 1.0, 0.0}, result, 1e-9);
    }

    @Test
    public void testTanOrder1AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {0.0, 1.0};
        double[] result = new double[2];
        compiler.tan(operand, 0, result, 0);
        assertArrayEquals(new double[]{0.0, 1.0}, result, 1e-9);
    }

    @Test
    public void testTanOrder3Branches() {
        // order=3 -> exercises inner loop branches (k>2, k==2, odd/even parity)
        DSCompiler compiler = DSCompiler.getCompiler(1, 3);
        double x = 0.5;
        double[] operand = {x, 1.0, 0.0, 0.0};
        double[] result = new double[4];
        compiler.tan(operand, 0, result, 0);
        double t = Math.tan(x);
        assertEquals(t, result[0], 1e-9);
        assertEquals(1 + t * t, result[1], 1e-9);
        // higher order terms: only structural check (no NaN) - not independently verified
        assertTrue(!Double.isNaN(result[2]));
        assertTrue(!Double.isNaN(result[3]));
    }

    @Test
    public void testAcosOrder1AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {0.0, 1.0};
        double[] result = new double[2];
        compiler.acos(operand, 0, result, 0);
        assertArrayEquals(new double[]{Math.PI / 2.0, -1.0}, result, 1e-9);
    }

    @Test
    public void testAcosOrder3Branches() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 3);
        double x = 0.5;
        double[] operand = {x, 1.0, 0.0, 0.0};
        double[] result = new double[4];
        compiler.acos(operand, 0, result, 0);
        assertEquals(Math.acos(x), result[0], 1e-9);
        assertEquals(-1.0 / Math.sqrt(1 - x * x), result[1], 1e-9);
        assertTrue(!Double.isNaN(result[2]));
        assertTrue(!Double.isNaN(result[3]));
    }

    @Test
    public void testAsinOrder1AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {0.0, 1.0};
        double[] result = new double[2];
        compiler.asin(operand, 0, result, 0);
        assertArrayEquals(new double[]{0.0, 1.0}, result, 1e-9);
    }

    @Test
    public void testAsinOrder3Branches() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 3);
        double x = 0.5;
        double[] operand = {x, 1.0, 0.0, 0.0};
        double[] result = new double[4];
        compiler.asin(operand, 0, result, 0);
        assertEquals(Math.asin(x), result[0], 1e-9);
        assertEquals(1.0 / Math.sqrt(1 - x * x), result[1], 1e-9);
        assertTrue(!Double.isNaN(result[2]));
        assertTrue(!Double.isNaN(result[3]));
    }

    @Test
    public void testAtanOrder1AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {0.0, 1.0};
        double[] result = new double[2];
        compiler.atan(operand, 0, result, 0);
        assertArrayEquals(new double[]{0.0, 1.0}, result, 1e-9);
    }

    @Test
    public void testAtanOrder3Branches() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 3);
        double x = 0.5;
        double[] operand = {x, 1.0, 0.0, 0.0};
        double[] result = new double[4];
        compiler.atan(operand, 0, result, 0);
        assertEquals(Math.atan(x), result[0], 1e-9);
        assertEquals(1.0 / (1 + x * x), result[1], 1e-9);
        assertTrue(!Double.isNaN(result[2]));
        assertTrue(!Double.isNaN(result[3]));
    }

    // ---------------------------------------------------------------
    // atan2 (branch x>=0 vs x<0, and inner y<=0 vs y>0)
    // ---------------------------------------------------------------

    @Test
    public void testAtan2_XPositiveBranch() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 0); // only values, size 1
        double[] y = {1.0};
        double[] x = {1.0};
        double[] result = new double[1];
        compiler.atan2(y, 0, x, 0, result, 0);
        assertEquals(Math.atan2(1.0, 1.0), result[0], 1e-9);
    }

    @Test
    public void testAtan2_XNegative_YPositiveBranch() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 0);
        double[] y = {1.0};
        double[] x = {-1.0};
        double[] result = new double[1];
        compiler.atan2(y, 0, x, 0, result, 0);
        assertEquals(Math.atan2(1.0, -1.0), result[0], 1e-9);
    }

    @Test
    public void testAtan2_XNegative_YNonPositiveBranch() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 0);
        double[] y = {-1.0};
        double[] x = {-1.0};
        double[] result = new double[1];
        compiler.atan2(y, 0, x, 0, result, 0);
        assertEquals(Math.atan2(-1.0, -1.0), result[0], 1e-9);
    }

    // ---------------------------------------------------------------
    // hyperbolic / inverse hyperbolic
    // ---------------------------------------------------------------

    @Test
    public void testCoshOrder2AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] operand = {0.0, 1.0, 0.0};
        double[] result = new double[3];
        compiler.cosh(operand, 0, result, 0);
        assertArrayEquals(new double[]{1.0, 0.0, 1.0}, result, 1e-9);
    }

    @Test
    public void testSinhOrder2AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        double[] operand = {0.0, 1.0, 0.0};
        double[] result = new double[3];
        compiler.sinh(operand, 0, result, 0);
        assertArrayEquals(new double[]{0.0, 1.0, 0.0}, result, 1e-9);
    }

    @Test
    public void testTanhOrder1AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {0.0, 1.0};
        double[] result = new double[2];
        compiler.tanh(operand, 0, result, 0);
        assertArrayEquals(new double[]{0.0, 1.0}, result, 1e-9);
    }

    @Test
    public void testTanhOrder3Branches() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 3);
        double x = 0.5;
        double[] operand = {x, 1.0, 0.0, 0.0};
        double[] result = new double[4];
        compiler.tanh(operand, 0, result, 0);
        double t = Math.tanh(x);
        assertEquals(t, result[0], 1e-9);
        assertEquals(1 - t * t, result[1], 1e-9);
        assertTrue(!Double.isNaN(result[2]));
        assertTrue(!Double.isNaN(result[3]));
    }

    @Test
    public void testAcoshOrder1() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {2.0, 1.0};
        double[] result = new double[2];
        compiler.acosh(operand, 0, result, 0);
        assertEquals(Math.log(2.0 + Math.sqrt(3.0)), result[0], 1e-9);
        assertEquals(1.0 / Math.sqrt(3.0), result[1], 1e-9);
    }

    @Test
    public void testAcoshOrder3Branches() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 3);
        double x = 2.0;
        double[] operand = {x, 1.0, 0.0, 0.0};
        double[] result = new double[4];
        compiler.acosh(operand, 0, result, 0);
        assertEquals(1.0 / Math.sqrt(x * x - 1), result[1], 1e-9);
        assertTrue(!Double.isNaN(result[2]));
        assertTrue(!Double.isNaN(result[3]));
    }

    @Test
    public void testAsinhOrder1AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {0.0, 1.0};
        double[] result = new double[2];
        compiler.asinh(operand, 0, result, 0);
        assertArrayEquals(new double[]{0.0, 1.0}, result, 1e-9);
    }

    @Test
    public void testAsinhOrder3Branches() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 3);
        double x = 0.5;
        double[] operand = {x, 1.0, 0.0, 0.0};
        double[] result = new double[4];
        compiler.asinh(operand, 0, result, 0);
        assertEquals(1.0 / Math.sqrt(1 + x * x), result[1], 1e-9);
        assertTrue(!Double.isNaN(result[2]));
        assertTrue(!Double.isNaN(result[3]));
    }

    @Test
    public void testAtanhOrder1AtZero() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        double[] operand = {0.0, 1.0};
        double[] result = new double[2];
        compiler.atanh(operand, 0, result, 0);
        assertArrayEquals(new double[]{0.0, 1.0}, result, 1e-9);
    }

    @Test
    public void testAtanhOrder3Branches() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 3);
        double x = 0.3;
        double[] operand = {x, 1.0, 0.0, 0.0};
        double[] result = new double[4];
        compiler.atanh(operand, 0, result, 0);
        assertEquals(1.0 / (1 - x * x), result[1], 1e-9);
        assertTrue(!Double.isNaN(result[2]));
        assertTrue(!Double.isNaN(result[3]));
    }

    // ---------------------------------------------------------------
    // compose (direct chain-rule verification)
    // ---------------------------------------------------------------

    @Test
    public void testComposeDirectChainRule() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2); // size 3
        double[] operand = {2.0, 1.0, 0.0}; // identity x
        double[] f = {10.0, 3.0, 4.0};      // F(x), F'(x), F''(x)
        double[] result = new double[3];
        compiler.compose(operand, 0, f, result, 0);
        assertArrayEquals(new double[]{10.0, 3.0, 4.0}, result, 1e-9);
    }

    // ---------------------------------------------------------------
    // taylor
    // ---------------------------------------------------------------

    @Test
    public void testTaylorSingleParam() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2); // size 3
        double[] ds = {1.0, 2.0, 6.0};
        double value = compiler.taylor(ds, 0, 0.1);
        assertEquals(1.23, value, 1e-9);
    }

    @Test
    public void testTaylorTwoParams() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 1); // size 3
        double[] ds = {1.0, 2.0, 3.0};
        double value = compiler.taylor(ds, 0, 0.1, 0.2);
        assertEquals(1.8, value, 1e-9);
    }

    @Test
    public void testTaylorZeroOrders() {
        // orders[k] == 0 branch (term unchanged)
        DSCompiler compiler = DSCompiler.getCompiler(2, 1);
        double[] ds = {5.0, 0.0, 0.0};
        double value = compiler.taylor(ds, 0, 100.0, 100.0);
        assertEquals(5.0, value, 1e-9);
    }

    // ---------------------------------------------------------------
    // checkCompatibility
    // ---------------------------------------------------------------

    @Test
    public void testCheckCompatibilityOk() {
        DSCompiler a = DSCompiler.getCompiler(2, 2);
        DSCompiler b = DSCompiler.getCompiler(2, 2);
        a.checkCompatibility(b); // should not throw
    }

    @Test
    public void testCheckCompatibilityParametersMismatch() {
        DSCompiler a = DSCompiler.getCompiler(2, 2);
        DSCompiler b = DSCompiler.getCompiler(3, 2);
        try {
            a.checkCompatibility(b);
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            // ok
        }
    }

    @Test
    public void testCheckCompatibilityOrderMismatch() {
        DSCompiler a = DSCompiler.getCompiler(2, 2);
        DSCompiler b = DSCompiler.getCompiler(2, 3);
        try {
            a.checkCompatibility(b);
            fail("expected DimensionMismatchException");
        } catch (DimensionMismatchException expected) {
            // ok
        }
    }
}
