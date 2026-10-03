package org.apache.commons.math.complex;

import java.util.List;
import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

/**
 * High branch/condition coverage and edge cases test suite for Complex class.
 */
public class ComplexTest {

    private static final double EPSILON = 1e-10;

    @Test
    public void testConstructorsAndGetters() {
        Complex c1 = new Complex(3.0);
        Assert.assertEquals(3.0, c1.getReal(), EPSILON);
        Assert.assertEquals(0.0, c1.getImaginary(), EPSILON);
        Assert.assertFalse(c1.isNaN());
        Assert.assertFalse(c1.isInfinite());

        Complex c2 = new Complex(Double.NaN, 1.0);
        Assert.assertTrue(c2.isNaN());
        Assert.assertFalse(c2.isInfinite());

        Complex c3 = new Complex(1.0, Double.NaN);
        Assert.assertTrue(c3.isNaN());

        Complex c4 = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Assert.assertFalse(c4.isNaN());
        Assert.assertTrue(c4.isInfinite());

        Complex c5 = new Complex(1.0, Double.NEGATIVE_INFINITY);
        Assert.assertFalse(c5.isNaN());
        Assert.assertTrue(c5.isInfinite());

        Complex c6 = new Complex(Double.POSITIVE_INFINITY, Double.NaN);
        Assert.assertTrue(c6.isNaN());
        Assert.assertFalse(c6.isInfinite());
    }

    @Test
    public void testFactoryMethods() {
        Complex c1 = Complex.valueOf(2.0, 3.0);
        Assert.assertEquals(2.0, c1.getReal(), EPSILON);
        Assert.assertEquals(3.0, c1.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN, 1.0).isNaN());
        Assert.assertTrue(Complex.valueOf(1.0, Double.NaN).isNaN());
        Assert.assertTrue(Complex.valueOf(Double.NaN).isNaN());

        Complex c2 = Complex.valueOf(4.0);
        Assert.assertEquals(4.0, c2.getReal(), EPSILON);
        Assert.assertEquals(0.0, c2.getImaginary(), EPSILON);
    }

    @Test
    public void testAbsBranches() {
        Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        Assert.assertTrue(Double.isNaN(new Complex(Double.NaN, 0.0).abs()));

        Assert.assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(1.0, Double.NEGATIVE_INFINITY).abs(), EPSILON);

        // |real| < |imaginary|
        Complex c1 = new Complex(3.0, 4.0);
        Assert.assertEquals(5.0, c1.abs(), EPSILON);

        // |real| < |imaginary| with imaginary == 0.0 (using -0.0 vs +0.0 edge check)
        Complex c1Zero = new Complex(0.0, 0.0);
        Assert.assertEquals(0.0, c1Zero.abs(), EPSILON);

        // |real| >= |imaginary|
        Complex c2 = new Complex(4.0, 3.0);
        Assert.assertEquals(5.0, c2.abs(), EPSILON);

        // real == 0.0 branch in |real| >= |imaginary|
        Complex c3 = new Complex(0.0, 0.0);
        Assert.assertEquals(0.0, c3.abs(), EPSILON);
    }

    @Test
    public void testAdd() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex sum = a.add(b);
        Assert.assertEquals(4.0, sum.getReal(), EPSILON);
        Assert.assertEquals(6.0, sum.getImaginary(), EPSILON);

        Assert.assertTrue(a.add(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(a).isNaN());

        Complex sumDouble = a.add(5.0);
        Assert.assertEquals(6.0, sumDouble.getReal(), EPSILON);
        Assert.assertEquals(2.0, sumDouble.getImaginary(), EPSILON);
        Assert.assertTrue(a.add(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(5.0).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        Complex.ONE.add((Complex) null);
    }

    @Test
    public void testConjugate() {
        Assert.assertTrue(Complex.NaN.conjugate().isNaN());

        Complex c = new Complex(2.0, 3.0);
        Complex conj = c.conjugate();
        Assert.assertEquals(2.0, conj.getReal(), EPSILON);
        Assert.assertEquals(-3.0, conj.getImaginary(), EPSILON);

        Complex infConj = new Complex(1.0, Double.POSITIVE_INFINITY).conjugate();
        Assert.assertEquals(Double.NEGATIVE_INFINITY, infConj.getImaginary(), EPSILON);
    }

    @Test
    public void testDivideComplexBranches() {
        Complex a = new Complex(1.0, 2.0);

        // NaN cases
        Assert.assertTrue(a.divide(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(a).isNaN());

        // Zero divisor
        Assert.assertTrue(a.divide(Complex.ZERO).isNaN());
        Assert.assertTrue(a.divide(new Complex(0.0, 0.0)).isNaN());

        // Divisor infinite, this finite
        Complex divInf = a.divide(Complex.INF);
        Assert.assertEquals(0.0, divInf.getReal(), EPSILON);
        Assert.assertEquals(0.0, divInf.getImaginary(), EPSILON);

        // |c| < |d| branch (divisor real < divisor imaginary)
        Complex num = new Complex(2.0, 4.0);
        Complex den1 = new Complex(1.0, 2.0);
        Complex res1 = num.divide(den1);
        Assert.assertEquals(2.0, res1.getReal(), EPSILON);
        Assert.assertEquals(0.0, res1.getImaginary(), EPSILON);

        // |c| >= |d| branch (divisor real >= divisor imaginary)
        Complex den2 = new Complex(2.0, 1.0);
        Complex res2 = num.divide(den2);
        Assert.assertEquals(1.6, res2.getReal(), EPSILON);
        Assert.assertEquals(1.2, res2.getImaginary(), EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        Complex.ONE.divide((Complex) null);
    }

    @Test
    public void testDivideDoubleBranches() {
        Complex a = new Complex(4.0, 6.0);

        Assert.assertTrue(a.divide(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(2.0).isNaN());
        Assert.assertTrue(a.divide(0.0).isNaN());

        Complex infRes = a.divide(Double.POSITIVE_INFINITY);
        Assert.assertEquals(0.0, infRes.getReal(), EPSILON);
        Assert.assertEquals(0.0, infRes.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.INF.divide(Double.POSITIVE_INFINITY).isNaN());

        Complex normalRes = a.divide(2.0);
        Assert.assertEquals(2.0, normalRes.getReal(), EPSILON);
        Assert.assertEquals(3.0, normalRes.getImaginary(), EPSILON);
    }

    @Test
    public void testReciprocalBranches() {
        Assert.assertTrue(Complex.NaN.reciprocal().isNaN());
        Assert.assertTrue(Complex.ZERO.reciprocal().isNaN());

        Complex infRecip = Complex.INF.reciprocal();
        Assert.assertEquals(0.0, infRecip.getReal(), EPSILON);
        Assert.assertEquals(0.0, infRecip.getImaginary(), EPSILON);

        // |real| < |imaginary|
        Complex c1 = new Complex(3.0, 4.0);
        Complex r1 = c1.reciprocal();
        Assert.assertEquals(3.0 / 25.0, r1.getReal(), EPSILON);
        Assert.assertEquals(-4.0 / 25.0, r1.getImaginary(), EPSILON);

        // |real| >= |imaginary|
        Complex c2 = new Complex(4.0, 3.0);
        Complex r2 = c2.reciprocal();
        Assert.assertEquals(4.0 / 25.0, r2.getReal(), EPSILON);
        Assert.assertEquals(-3.0 / 25.0, r2.getImaginary(), EPSILON);
    }

    @Test
    public void testMultiplyBranches() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(4.0, 5.0);

        Assert.assertTrue(a.multiply(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(a).isNaN());

        // Infinite branches
        Assert.assertEquals(Complex.INF, a.multiply(Complex.INF));
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(a));
        Assert.assertEquals(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 1.0).multiply(a));
        Assert.assertEquals(Complex.INF, new Complex(1.0, Double.POSITIVE_INFINITY).multiply(a));

        // Normal multiply
        Complex res = a.multiply(b);
        Assert.assertEquals(-7.0, res.getReal(), EPSILON);
        Assert.assertEquals(22.0, res.getImaginary(), EPSILON);

        // multiply(int)
        Assert.assertTrue(Complex.NaN.multiply(2).isNaN());
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(2));
        Complex resInt = a.multiply(3);
        Assert.assertEquals(6.0, resInt.getReal(), EPSILON);
        Assert.assertEquals(9.0, resInt.getImaginary(), EPSILON);

        // multiply(double)
        Assert.assertTrue(a.multiply(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(2.0).isNaN());
        Assert.assertEquals(Complex.INF, a.multiply(Double.POSITIVE_INFINITY));
        Assert.assertEquals(Complex.INF, Complex.INF.multiply(2.0));
        Complex resDbl = a.multiply(2.5);
        Assert.assertEquals(5.0, resDbl.getReal(), EPSILON);
        Assert.assertEquals(7.5, resDbl.getImaginary(), EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        Complex.ONE.multiply((Complex) null);
    }

    @Test
    public void testSubtractAndNegate() {
        Complex a = new Complex(5.0, 7.0);
        Complex b = new Complex(2.0, 3.0);

        Assert.assertTrue(a.subtract(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(a).isNaN());
        Complex diff = a.subtract(b);
        Assert.assertEquals(3.0, diff.getReal(), EPSILON);
        Assert.assertEquals(4.0, diff.getImaginary(), EPSILON);

        Assert.assertTrue(a.subtract(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(2.0).isNaN());
        Complex diffDbl = a.subtract(2.0);
        Assert.assertEquals(3.0, diffDbl.getReal(), EPSILON);
        Assert.assertEquals(7.0, diffDbl.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.negate().isNaN());
        Complex neg = a.negate();
        Assert.assertEquals(-5.0, neg.getReal(), EPSILON);
        Assert.assertEquals(-7.0, neg.getImaginary(), EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        Complex.ONE.subtract((Complex) null);
    }

    @Test
    public void testEqualsAndHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c1Same = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 3.0);
        Complex c3 = new Complex(2.0, 2.0);

        Assert.assertTrue(c1.equals(c1));
        Assert.assertTrue(c1.equals(c1Same));
        Assert.assertFalse(c1.equals(c2));
        Assert.assertFalse(c1.equals(c3));
        Assert.assertFalse(c1.equals(null));
        Assert.assertFalse(c1.equals("Not a complex"));

        // NaN equality
        Complex nan1 = new Complex(Double.NaN, 0.0);
        Complex nan2 = new Complex(0.0, Double.NaN);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Complex.NaN));
        Assert.assertFalse(c1.equals(Complex.NaN));
        Assert.assertFalse(Complex.NaN.equals(c1));

        // HashCode
        Assert.assertEquals(c1.hashCode(), c1Same.hashCode());
        Assert.assertEquals(7, Complex.NaN.hashCode());
        Assert.assertEquals(7, nan1.hashCode());
    }

    @Test
    public void testSqrtBranches() {
        Assert.assertTrue(Complex.NaN.sqrt().isNaN());

        Complex zeroSqrt = Complex.ZERO.sqrt();
        Assert.assertEquals(0.0, zeroSqrt.getReal(), EPSILON);
        Assert.assertEquals(0.0, zeroSqrt.getImaginary(), EPSILON);

        // real >= 0
        Complex cPos = new Complex(3.0, 4.0);
        Complex sqrtPos = cPos.sqrt();
        Assert.assertEquals(2.0, sqrtPos.getReal(), EPSILON);
        Assert.assertEquals(1.0, sqrtPos.getImaginary(), EPSILON);

        // real < 0, imaginary >= 0
        Complex cNeg = new Complex(-3.0, 4.0);
        Complex sqrtNeg = cNeg.sqrt();
        Assert.assertEquals(1.0, sqrtNeg.getReal(), EPSILON);
        Assert.assertEquals(2.0, sqrtNeg.getImaginary(), EPSILON);

        // real < 0, imaginary < 0
        Complex cNegNeg = new Complex(-3.0, -4.0);
        Complex sqrtNegNeg = cNegNeg.sqrt();
        Assert.assertEquals(1.0, sqrtNegNeg.getReal(), EPSILON);
        Assert.assertEquals(-2.0, sqrtNegNeg.getImaginary(), EPSILON);
    }

    @Test
    public void testTrigonometricFunctions() {
        Assert.assertTrue(Complex.NaN.acos().isNaN());
        Assert.assertTrue(Complex.NaN.asin().isNaN());
        Assert.assertTrue(Complex.NaN.atan().isNaN());
        Assert.assertTrue(Complex.NaN.cos().isNaN());
        Assert.assertTrue(Complex.NaN.cosh().isNaN());
        Assert.assertTrue(Complex.NaN.sin().isNaN());
        Assert.assertTrue(Complex.NaN.sinh().isNaN());
        Assert.assertTrue(Complex.NaN.tan().isNaN());
        Assert.assertTrue(Complex.NaN.tanh().isNaN());
        Assert.assertTrue(Complex.NaN.exp().isNaN());
        Assert.assertTrue(Complex.NaN.log().isNaN());

        Complex c = new Complex(1.0, 1.0);
        Assert.assertNotNull(c.acos());
        Assert.assertNotNull(c.asin());
        Assert.assertNotNull(c.atan());
        Assert.assertNotNull(c.cos());
        Assert.assertNotNull(c.cosh());
        Assert.assertNotNull(c.sin());
        Assert.assertNotNull(c.sinh());
        Assert.assertNotNull(c.tan());
        Assert.assertNotNull(c.tanh());
        Assert.assertNotNull(c.exp());
        Assert.assertNotNull(c.log());
        Assert.assertNotNull(c.sqrt1z());

        // Extreme values & Tan/Tanh specific edge behaviors
        Complex largeImag = new Complex(1.0, 20.0);
        Assert.assertFalse(largeImag.tan().isNaN());
        Assert.assertFalse(largeImag.tanh().isNaN());
    }

    @Test
    public void testPow() {
        Complex base = new Complex(2.0, 1.0);
        Complex exp = new Complex(3.0, 0.0);

        Assert.assertNotNull(base.pow(exp));
        Assert.assertNotNull(base.pow(3.0));
    }

    @Test(expected = NullArgumentException.class)
    public void testPowNull() {
        Complex.ONE.pow((Complex) null);
    }

    @Test
    public void testNthRootBranches() {
        // Degree <= 0
        try {
            Complex.ONE.nthRoot(0);
            Assert.fail("Expected NotPositiveException");
        } catch (NotPositiveException expected) {}

        try {
            Complex.ONE.nthRoot(-2);
            Assert.fail("Expected NotPositiveException");
        } catch (NotPositiveException expected) {}

        // NaN branch
        List<Complex> nanRoots = Complex.NaN.nthRoot(3);
        Assert.assertEquals(1, nanRoots.size());
        Assert.assertTrue(nanRoots.get(0).isNaN());

        // Infinite branch
        List<Complex> infRoots = Complex.INF.nthRoot(3);
        Assert.assertEquals(1, infRoots.size());
        Assert.assertEquals(Complex.INF, infRoots.get(0));

        // Normal computation
        List<Complex> roots = new Complex(0.0, 8.0).nthRoot(3);
        Assert.assertEquals(3, roots.size());
        for (Complex root : roots) {
            Complex cube = root.multiply(root).multiply(root);
            Assert.assertEquals(0.0, cube.getReal(), 1e-5);
            Assert.assertEquals(8.0, cube.getImaginary(), 1e-5);
        }
    }

    @Test
    public void testMiscMethods() {
        Complex c = new Complex(1.5, -2.5);
        Assert.assertEquals("org.apache.commons.math.complex.ComplexField", c.getField().getClass().getName());
        Assert.assertEquals("(1.5, -2.5)", c.toString());

        double arg = new Complex(1.0, 1.0).getArgument();
        Assert.assertEquals(FastMath.PI / 4.0, arg, EPSILON);

        // readResolve simulation
        Complex cResolved = (Complex) c.readResolve();
        Assert.assertEquals(c, cResolved);
    }
}