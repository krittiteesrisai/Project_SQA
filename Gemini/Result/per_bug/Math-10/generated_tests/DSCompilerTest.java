package org.apache.commons.math3.analysis.differentiation;

import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * High-coverage unit tests for DSCompiler focusing on branch coverage and edge cases.
 */
public class DSCompilerTest {

    private static final double EPSILON = 1.0e-12;

    @Test
    public void testCacheAndCompilerCreation() {
        DSCompiler c00 = DSCompiler.getCompiler(0, 0);
        Assert.assertEquals(0, c00.getFreeParameters());
        Assert.assertEquals(0, c00.getOrder());
        Assert.assertEquals(1, c00.getSize());

        DSCompiler c00Again = DSCompiler.getCompiler(0, 0);
        Assert.assertSame(c00, c00Again);

        // Expand cache with larger dimensions
        DSCompiler c33 = DSCompiler.getCompiler(3, 3);
        Assert.assertEquals(3, c33.getFreeParameters());
        Assert.assertEquals(3, c33.getOrder());
        Assert.assertEquals(20, c33.getSize());

        // Cache hit from expanded cache
        DSCompiler c12 = DSCompiler.getCompiler(1, 2);
        Assert.assertEquals(1, c12.getFreeParameters());
        Assert.assertEquals(2, c12.getOrder());
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetPartialDerivativeIndexDimensionMismatch() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        compiler.getPartialDerivativeIndex(1); // expects 2 arguments
    }

    @Test(expected = NumberIsTooLargeException.class)
    public void testGetPartialDerivativeIndexOrderTooLarge() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        compiler.getPartialDerivativeIndex(2, 1); // 2 + 1 = 3 > order 2
    }

    @Test
    public void testGetPartialDerivativeIndexValid() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        Assert.assertEquals(0, compiler.getPartialDerivativeIndex(0, 0));
        Assert.assertEquals(1, compiler.getPartialDerivativeIndex(1, 0));
        Assert.assertEquals(2, compiler.getPartialDerivativeIndex(2, 0));
        Assert.assertEquals(3, compiler.getPartialDerivativeIndex(0, 1));
        Assert.assertEquals(4, compiler.getPartialDerivativeIndex(1, 1));
        Assert.assertEquals(5, compiler.getPartialDerivativeIndex(0, 2));

        int[] orders = compiler.getPartialDerivativeOrders(4);
        Assert.assertArrayEquals(new int[]{1, 1}, orders);
    }

    @Test
    public void testCheckCompatibility() {
        DSCompiler c1 = DSCompiler.getCompiler(2, 3);
        DSCompiler c2 = DSCompiler.getCompiler(2, 3);
        c1.checkCompatibility(c2);

        try {
            DSCompiler cMismatchParam = DSCompiler.getCompiler(1, 3);
            c1.checkCompatibility(cMismatchParam);
            Assert.fail("Expected DimensionMismatchException for parameters mismatch");
        } catch (DimensionMismatchException e) {
            // Success
        }

        try {
            DSCompiler cMismatchOrder = DSCompiler.getCompiler(2, 2);
            c1.checkCompatibility(cMismatchOrder);
            Assert.fail("Expected DimensionMismatchException for order mismatch");
        } catch (DimensionMismatchException e) {
            // Success
        }
    }

    @Test
    public void testLinearCombinationVariants() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        int size = compiler.getSize();

        double[] a = new double[]{2.0, 1.0};
        double[] b = new double[]{3.0, 2.0};
        double[] c = new double[]{4.0, 3.0};
        double[] d = new double[]{5.0, 4.0};
        double[] res = new double[size];

        // 2 terms: 2*a + 3*b
        compiler.linearCombination(2.0, a, 0, 3.0, b, 0, res, 0);
        Assert.assertEquals(13.0, res[0], EPSILON);
        Assert.assertEquals(8.0, res[1], EPSILON);

        // 3 terms: 2*a + 3*b - 1*c
        compiler.linearCombination(2.0, a, 0, 3.0, b, 0, -1.0, c, 0, res, 0);
        Assert.assertEquals(9.0, res[0], EPSILON);
        Assert.assertEquals(5.0, res[1], EPSILON);

        // 4 terms: 1*a + 2*b + 3*c + 4*d
        compiler.linearCombination(1.0, a, 0, 2.0, b, 0, 3.0, c, 0, 4.0, d, 0, res, 0);
        Assert.assertEquals(1.0*2 + 2*3 + 3*4 + 4*5, res[0], EPSILON);
        Assert.assertEquals(1.0*1 + 2*2 + 3*3 + 4*4, res[1], EPSILON);
    }

    @Test
    public void testBasicArithmetic() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 1);
        int size = compiler.getSize();
        double[] lhs = new double[]{10.0, 2.0};
        double[] rhs = new double[]{3.0, 1.0};
        double[] res = new double[size];

        compiler.add(lhs, 0, rhs, 0, res, 0);
        Assert.assertEquals(13.0, res[0], EPSILON);
        Assert.assertEquals(3.0, res[1], EPSILON);

        compiler.subtract(lhs, 0, rhs, 0, res, 0);
        Assert.assertEquals(7.0, res[0], EPSILON);
        Assert.assertEquals(1.0, res[1], EPSILON);

        compiler.multiply(lhs, 0, rhs, 0, res, 0);
        Assert.assertEquals(30.0, res[0], EPSILON);
        Assert.assertEquals(16.0, res[1], EPSILON); // 10*1 + 2*3

        compiler.divide(lhs, 0, rhs, 0, res, 0);
        Assert.assertEquals(10.0 / 3.0, res[0], EPSILON);
        Assert.assertEquals((2.0 * 3.0 - 10.0 * 1.0) / 9.0, res[1], EPSILON);

        compiler.remainder(lhs, 0, rhs, 0, res, 0);
        Assert.assertEquals(1.0, res[0], EPSILON);
        Assert.assertEquals(-1.0, res[1], EPSILON); // 2 - 3 * 1
    }

    @Test
    public void testPowBranches() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        int size = compiler.getSize();
        double[] x = new double[]{2.0, 1.0, 0.0};
        double[] res = new double[size];

        // Integer power n = 0
        compiler.pow(x, 0, 0, res, 0);
        Assert.assertEquals(1.0, res[0], EPSILON);
        Assert.assertEquals(0.0, res[1], EPSILON);
        Assert.assertEquals(0.0, res[2], EPSILON);

        // Integer power n > 0
        compiler.pow(x, 0, 3, res, 0);
        Assert.assertEquals(8.0, res[0], EPSILON);
        Assert.assertEquals(12.0, res[1], EPSILON);
        Assert.assertEquals(12.0, res[2], EPSILON);

        // Integer power n < 0
        compiler.pow(x, 0, -2, res, 0);
        Assert.assertEquals(0.25, res[0], EPSILON);
        Assert.assertEquals(-0.25, res[1], EPSILON);

        // Double power
        compiler.pow(x, 0, 2.5, res, 0);
        Assert.assertEquals(FastMath.pow(2.0, 2.5), res[0], EPSILON);

        // DerivativeStructure power (x^y)
        double[] y = new double[]{3.0, 0.0, 0.0};
        compiler.pow(x, 0, y, 0, res, 0);
        Assert.assertEquals(8.0, res[0], EPSILON);
    }

    @Test
    public void testRoots() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        int size = compiler.getSize();
        double[] x = new double[]{4.0, 1.0, 0.0};
        double[] res = new double[size];

        // rootN n = 2
        compiler.rootN(x, 0, 2, res, 0);
        Assert.assertEquals(2.0, res[0], EPSILON);
        Assert.assertEquals(0.25, res[1], EPSILON);

        // rootN n = 3
        x[0] = 8.0;
        compiler.rootN(x, 0, 3, res, 0);
        Assert.assertEquals(2.0, res[0], EPSILON);

        // rootN n = 4
        x[0] = 16.0;
        compiler.rootN(x, 0, 4, res, 0);
        Assert.assertEquals(2.0, res[0], EPSILON);
    }

    @Test
    public void testExponentialsAndLogarithms() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        int size = compiler.getSize();
        double[] x = new double[]{1.0, 1.0, 0.0};
        double[] res = new double[size];

        compiler.exp(x, 0, res, 0);
        Assert.assertEquals(FastMath.E, res[0], EPSILON);

        compiler.expm1(x, 0, res, 0);
        Assert.assertEquals(FastMath.expm1(1.0), res[0], EPSILON);

        compiler.log(x, 0, res, 0);
        Assert.assertEquals(0.0, res[0], EPSILON);
        Assert.assertEquals(1.0, res[1], EPSILON);

        compiler.log1p(x, 0, res, 0);
        Assert.assertEquals(FastMath.log(2.0), res[0], EPSILON);

        compiler.log10(x, 0, res, 0);
        Assert.assertEquals(0.0, res[0], EPSILON);
        Assert.assertEquals(1.0 / FastMath.log(10.0), res[1], EPSILON);
    }

    @Test
    public void testTrigonometricAndInverseHigherOrders() {
        // High order (4) to exercise recurrence polynomial loops and parity branches
        DSCompiler compiler = DSCompiler.getCompiler(1, 4);
        int size = compiler.getSize();
        double[] x = new double[]{0.5, 1.0, 0.0, 0.0, 0.0};
        double[] res = new double[size];

        compiler.sin(x, 0, res, 0);
        Assert.assertEquals(FastMath.sin(0.5), res[0], EPSILON);

        compiler.cos(x, 0, res, 0);
        Assert.assertEquals(FastMath.cos(0.5), res[0], EPSILON);

        compiler.tan(x, 0, res, 0);
        Assert.assertEquals(FastMath.tan(0.5), res[0], EPSILON);

        compiler.asin(x, 0, res, 0);
        Assert.assertEquals(FastMath.asin(0.5), res[0], EPSILON);

        compiler.acos(x, 0, res, 0);
        Assert.assertEquals(FastMath.acos(0.5), res[0], EPSILON);

        compiler.atan(x, 0, res, 0);
        Assert.assertEquals(FastMath.atan(0.5), res[0], EPSILON);
    }

    @Test
    public void testHyperbolicAndInverseHigherOrders() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 4);
        int size = compiler.getSize();
        double[] x = new double[]{0.5, 1.0, 0.0, 0.0, 0.0};
        double[] res = new double[size];

        compiler.sinh(x, 0, res, 0);
        Assert.assertEquals(FastMath.sinh(0.5), res[0], EPSILON);

        compiler.cosh(x, 0, res, 0);
        Assert.assertEquals(FastMath.cosh(0.5), res[0], EPSILON);

        compiler.tanh(x, 0, res, 0);
        Assert.assertEquals(FastMath.tanh(0.5), res[0], EPSILON);

        compiler.asinh(x, 0, res, 0);
        Assert.assertEquals(FastMath.asinh(0.5), res[0], EPSILON);

        compiler.atanh(x, 0, res, 0);
        Assert.assertEquals(FastMath.atanh(0.5), res[0], EPSILON);

        // acosh requires x >= 1.0
        double[] xAcosh = new double[]{1.5, 1.0, 0.0, 0.0, 0.0};
        compiler.acosh(xAcosh, 0, res, 0);
        Assert.assertEquals(FastMath.acosh(1.5), res[0], EPSILON);
    }

    @Test
    public void testAtan2PositiveAndNegativeX() {
        DSCompiler compiler = DSCompiler.getCompiler(1, 2);
        int size = compiler.getSize();
        double[] y = new double[]{1.0, 0.0, 0.0};
        double[] res = new double[size];

        // x >= 0 branch
        double[] xPos = new double[]{1.0, 1.0, 0.0};
        compiler.atan2(y, 0, xPos, 0, res, 0);
        Assert.assertEquals(FastMath.PI / 4.0, res[0], EPSILON);

        // x < 0 branch
        double[] xNeg = new double[]{-1.0, 1.0, 0.0};
        compiler.atan2(y, 0, xNeg, 0, res, 0);
        Assert.assertEquals(3.0 * FastMath.PI / 4.0, res[0], EPSILON);

        // x < 0 with y < 0 branch
        double[] yNeg = new double[]{-1.0, 0.0, 0.0};
        compiler.atan2(yNeg, 0, xNeg, 0, res, 0);
        Assert.assertEquals(-3.0 * FastMath.PI / 4.0, res[0], EPSILON);
    }

    @Test
    public void testTaylorEvaluation() {
        DSCompiler compiler = DSCompiler.getCompiler(2, 2);
        // Function f(x, y) = x^2 + 2*x*y + y^2 at (1, 2) => value = 9
        // df/dx = 2x + 2y = 6
        // df/dy = 2x + 2y = 6
        // d2f/dx2 = 2, d2f/dxdy = 2, d2f/dy2 = 2
        double[] ds = new double[compiler.getSize()];
        ds[compiler.getPartialDerivativeIndex(0, 0)] = 9.0;
        ds[compiler.getPartialDerivativeIndex(1, 0)] = 6.0;
        ds[compiler.getPartialDerivativeIndex(2, 0)] = 2.0;
        ds[compiler.getPartialDerivativeIndex(0, 1)] = 6.0;
        ds[compiler.getPartialDerivativeIndex(1, 1)] = 2.0;
        ds[compiler.getPartialDerivativeIndex(0, 2)] = 2.0;

        // Evaluate at dx = 0.5, dy = -0.5 -> f(1.5, 1.5) = (3)^2 = 9.0
        double val = compiler.taylor(ds, 0, 0.5, -0.5);
        Assert.assertEquals(9.0, val, EPSILON);
    }
}