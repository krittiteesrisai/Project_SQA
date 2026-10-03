package org.apache.commons.math.complex;

import java.util.List;
import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    private static final double EPSILON = 1e-12;

    // ==========================================
    // 1. Constructor, State, and Accessor Tests
    // ==========================================

    @Test
    public void testConstructorAndAccessors() {
        Complex c1 = new Complex(3.0, -4.0);
        Assert.assertEquals(3.0, c1.getReal(), EPSILON);
        Assert.assertEquals(-4.0, c1.getImaginary(), EPSILON);
        Assert.assertFalse(c1.isNaN());
        Assert.assertFalse(c1.isInfinite());

        Complex c2 = new Complex(5.0);
        Assert.assertEquals(5.0, c2.getReal(), EPSILON);
        Assert.assertEquals(0.0, c2.getImaginary(), EPSILON);
    }

    @Test
    public void testIsNaNAndIsInfiniteConditions() {
        Complex nanReal = new Complex(Double.NaN, 1.0);
        Complex nanImag = new Complex(1.0, Double.NaN);
        Complex bothNaN = new Complex(Double.NaN, Double.NaN);
        Assert.assertTrue(nanReal.isNaN());
        Assert.assertTrue(nanImag.isNaN());
        Assert.assertTrue(bothNaN.isNaN());
        Assert.assertFalse(nanReal.isInfinite());

        Complex infReal = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex infImag = new Complex(1.0, Double.NEGATIVE_INFINITY);
        Complex bothInf = new Complex(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        Assert.assertTrue(infReal.isInfinite());
        Assert.assertTrue(infImag.isInfinite());
        Assert.assertTrue(bothInf.isInfinite());
        Assert.assertFalse(infReal.isNaN());

        // NaN takes precedence over Infinite
        Complex nanAndInf = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
        Assert.assertTrue(nanAndInf.isNaN());
        Assert.assertFalse(nanAndInf.isInfinite());
    }

    // ==========================================
    // 2. abs() Branch Coverage
    // ==========================================

    @Test
    public void testAbsBranches() {
        // isNaN branch
        Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        Assert.assertTrue(Double.isNaN(new Complex(Double.NaN, 0.0).abs()));

        // isInfinite branch
        Assert.assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(1.0, Double.NEGATIVE_INFINITY).abs(), EPSILON);

        // |real| < |imaginary| branch
        Complex c1 = new Complex(3.0, 4.0);
        Assert.assertEquals(5.0, c1.abs(), EPSILON);

        // |real| >= |imaginary| branch
        Complex c2 = new Complex(4.0, 3.0);
        Assert.assertEquals(5.0, c2.abs(), EPSILON);

        // real == 0.0 within |real| >= |imaginary| (i.e., (0,0))
        Complex zero = new Complex(0.0, 0.0);
        Assert.assertEquals(0.0, zero.abs(), EPSILON);
    }

    // ==========================================
    // 3. Arithmetic Operations (Add, Subtract, Multiply, Divide)
    // ==========================================

    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        Complex.ONE.add(null);
    }

    @Test
    public void testAddBranches() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(3.0, 4.0);
        Complex result = c1.add(c2);
        Assert.assertEquals(4.0, result.getReal(), EPSILON);
        Assert.assertEquals(6.0, result.getImaginary(), EPSILON);

        // NaN propagation
        Assert.assertTrue(c1.add(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(c1).isNaN());

        // add(double)
        Complex addDouble = c1.add(5.0);
        Assert.assertEquals(6.0, addDouble.getReal(), EPSILON);
        Assert.assertEquals(2.0, addDouble.getImaginary(), EPSILON);
        Assert.assertTrue(c1.add(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(5.0).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        Complex.ONE.subtract(null);
    }

    @Test
    public void testSubtractBranches() {
        Complex c1 = new Complex(5.0, 7.0);
        Complex c2 = new Complex(2.0, 3.0);
        Complex result = c1.subtract(c2);
        Assert.assertEquals(3.0, result.getReal(), EPSILON);
        Assert.assertEquals(4.0, result.getImaginary(), EPSILON);

        Assert.assertTrue(c1.subtract(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(c1).isNaN());

        // subtract(double)
        Complex subDouble = c1.subtract(2.0);
        Assert.assertEquals(3.0, subDouble.getReal(), EPSILON);
        Assert.assertEquals(7.0, subDouble.getImaginary(), EPSILON);
        Assert.assertTrue(c1.subtract(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(2.0).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        Complex.ONE.multiply(null);
    }

    @Test
    public void testMultiplyBranches() {
        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(4.0, 5.0);
        // (2*4 - 3*5) + (2*5 + 3*4)i = -7 + 22i
        Complex result = c1.multiply(c2);
        Assert.assertEquals(-7.0, result.getReal(), EPSILON);
        Assert.assertEquals(22.0, result.getImaginary(), EPSILON);

        // NaN branch
        Assert.assertTrue(c1.multiply(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(c1).isNaN());

        // Infinite branches (real/imaginary infinite for this or factor)
        Assert.assertTrue(c1.multiply(Complex.INF).isInfinite());
        Assert.assertTrue(Complex.INF.multiply(c1).isInfinite());
        Assert.assertTrue(new Complex(Double.POSITIVE_INFINITY, 0).multiply(c1).isInfinite());
        Assert.assertTrue(new Complex(0, Double.NEGATIVE_INFINITY).multiply(c1).isInfinite());
        Assert.assertTrue(c1.multiply(new Complex(Double.POSITIVE_INFINITY, 0)).isInfinite());
        Assert.assertTrue(c1.multiply(new Complex(0, Double.NEGATIVE_INFINITY)).isInfinite());

        // multiply(double)
        Complex mulDouble = c1.multiply(2.0);
        Assert.assertEquals(4.0, mulDouble.getReal(), EPSILON);
        Assert.assertEquals(6.0, mulDouble.getImaginary(), EPSILON);
        Assert.assertTrue(c1.multiply(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(2.0).isNaN());
        Assert.assertTrue(c1.multiply(Double.POSITIVE_INFINITY).isInfinite());
        Assert.assertTrue(Complex.INF.multiply(2.0).isInfinite());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        Complex.ONE.divide(null);
    }

    @Test
    public void testDivideBranches() {
        Complex c1 = new Complex(2.0, 3.0);

        // NaN branches
        Assert.assertTrue(c1.divide(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(c1).isNaN());

        // Divisor is zero
        Assert.assertTrue(c1.divide(Complex.ZERO).isNaN());

        // Divisor is infinite and dividend is finite
        Assert.assertEquals(Complex.ZERO, c1.divide(Complex.INF));
        Assert.assertEquals(Complex.ZERO, c1.divide(new Complex(Double.POSITIVE_INFINITY, 0)));

        // Prescaling |c| < |d| branch (e.g., c=3, d=4)
        Complex num = new Complex(5.0, 10.0);
        Complex den1 = new Complex(3.0, 4.0);
        Complex res1 = num.divide(den1);
        // (5+10i)/(3+4i) = (5+10i)(3-4i)/25 = (15 + 40 + (-20 + 30)i)/25 = (55 + 10i)/25 = 2.2 + 0.4i
        Assert.assertEquals(2.2, res1.getReal(), EPSILON);
        Assert.assertEquals(0.4, res1.getImaginary(), EPSILON);

        // Prescaling |c| >= |d| branch (e.g., c=4, d=3)
        Complex den2 = new Complex(4.0, 3.0);
        Complex res2 = num.divide(den2);
        // (5+10i)/(4+3i) = (5+10i)(4-3i)/25 = (20 + 30 + (-15 + 40)i)/25 = (50 + 25i)/25 = 2.0 + 1.0i
        Assert.assertEquals(2.0, res2.getReal(), EPSILON);
        Assert.assertEquals(1.0, res2.getImaginary(), EPSILON);
    }

    @Test
    public void testDivideDoubleBranches() {
        Complex c = new Complex(4.0, 6.0);

        // NaN branch
        Assert.assertTrue(c.divide(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(2.0).isNaN());

        // Divisor is zero
        Assert.assertTrue(c.divide(0.0).isNaN());

        // Divisor is infinite
        Assert.assertEquals(Complex.ZERO, c.divide(Double.POSITIVE_INFINITY));
        Assert.assertEquals(Complex.ZERO, c.divide(Double.NEGATIVE_INFINITY));
        Assert.assertTrue(Complex.INF.divide(Double.POSITIVE_INFINITY).isNaN());

        // Normal division
        Complex res = c.divide(2.0);
        Assert.assertEquals(2.0, res.getReal(), EPSILON);
        Assert.assertEquals(3.0, res.getImaginary(), EPSILON);
    }

    // ==========================================
    // 4. Conjugate, Negate, Equals, and HashCode
    // ==========================================

    @Test
    public void testConjugateAndNegate() {
        Complex c = new Complex(3.0, -4.0);
        Complex conj = c.conjugate();
        Assert.assertEquals(3.0, conj.getReal(), EPSILON);
        Assert.assertEquals(4.0, conj.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.conjugate().isNaN());

        Complex neg = c.negate();
        Assert.assertEquals(-3.0, neg.getReal(), EPSILON);
        Assert.assertEquals(4.0, neg.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testEqualsAndHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex cDiffReal = new Complex(2.0, 2.0);
        Complex cDiffImag = new Complex(1.0, 3.0);

        // Reflexive
        Assert.assertTrue(c1.equals(c1));

        // Symmetric and Equal
        Assert.assertTrue(c1.equals(c2));
        Assert.assertTrue(c2.equals(c1));
        Assert.assertEquals(c1.hashCode(), c2.hashCode());

        // Null and different object type
        Assert.assertFalse(c1.equals(null));
        Assert.assertFalse(c1.equals("Not a complex"));

        // Different components
        Assert.assertFalse(c1.equals(cDiffReal));
        Assert.assertFalse(c1.equals(cDiffImag));

        // NaN equivalence contract
        Complex nan1 = new Complex(Double.NaN, 0.0);
        Complex nan2 = new Complex(0.0, Double.NaN);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Complex.NaN));
        Assert.assertFalse(c1.equals(nan1));
        Assert.assertFalse(nan1.equals(c1));
        Assert.assertEquals(7, Complex.NaN.hashCode());
        Assert.assertEquals(7, nan1.hashCode());
    }

    // ==========================================
    // 5. Advanced Mathematical Functions (Roots, Exponentials, Trig)
    // ==========================================

    @Test(expected = NotPositiveException.class)
    public void testNthRootNonPositive() {
        Complex.ONE.nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRootNegative() {
        Complex.ONE.nthRoot(-2);
    }

    @Test
    public void testNthRootBranches() {
        // NaN branch
        List<Complex> nanRoots = Complex.NaN.nthRoot(3);
        Assert.assertEquals(1, nanRoots.size());
        Assert.assertTrue(nanRoots.get(0).isNaN());

        // Infinite branch
        List<Complex> infRoots = Complex.INF.nthRoot(3);
        Assert.assertEquals(1, infRoots.size());
        Assert.assertTrue(infRoots.get(0).isInfinite());

        // Normal branch (e.g. roots of unity for n=4)
        List<Complex> roots = Complex.ONE.nthRoot(4);
        Assert.assertEquals(4, roots.size());
        for (Complex root : roots) {
            Complex pow4 = root.multiply(root).multiply(root).multiply(root);
            Assert.assertEquals(1.0, pow4.getReal(), 1e-6);
            Assert.assertEquals(0.0, pow4.getImaginary(), 1e-6);
        }
    }

    @Test
    public void testSqrtBranches() {
        Assert.assertTrue(Complex.NaN.sqrt().isNaN());

        // (0, 0) branch
        Complex zeroSqrt = Complex.ZERO.sqrt();
        Assert.assertEquals(0.0, zeroSqrt.getReal(), EPSILON);
        Assert.assertEquals(0.0, zeroSqrt.getImaginary(), EPSILON);

        // real >= 0 branch
        Complex posReal = new Complex(3.0, 4.0).sqrt();
        Assert.assertEquals(2.0, posReal.getReal(), EPSILON);
        Assert.assertEquals(1.0, posReal.getImaginary(), EPSILON);

        // real < 0 branch
        Complex negReal = new Complex(-3.0, 4.0).sqrt();
        Assert.assertEquals(1.0, negReal.getReal(), EPSILON);
        Assert.assertEquals(2.0, negReal.getImaginary(), EPSILON);
    }

    @Test(expected = NullArgumentException.class)
    public void testPowNull() {
        Complex.ONE.pow((Complex) null);
    }

    @Test
    public void testElementaryFunctions() {
        Complex z = new Complex(1.0, 1.0);

        // NaN cases
        Assert.assertTrue(Complex.NaN.exp().isNaN());
        Assert.assertTrue(Complex.NaN.log().isNaN());
        Assert.assertTrue(Complex.NaN.sin().isNaN());
        Assert.assertTrue(Complex.NaN.cos().isNaN());
        Assert.assertTrue(Complex.NaN.tan().isNaN());
        Assert.assertTrue(Complex.NaN.sinh().isNaN());
        Assert.assertTrue(Complex.NaN.cosh().isNaN());
        Assert.assertTrue(Complex.NaN.tanh().isNaN());
        Assert.assertTrue(Complex.NaN.asin().isNaN());
        Assert.assertTrue(Complex.NaN.acos().isNaN());
        Assert.assertTrue(Complex.NaN.atan().isNaN());
        Assert.assertTrue(Complex.NaN.sqrt1z().isNaN());

        // Valid execution checks (checking non-NaN results)
        Assert.assertFalse(z.exp().isNaN());
        Assert.assertFalse(z.log().isNaN());
        Assert.assertFalse(z.sin().isNaN());
        Assert.assertFalse(z.cos().isNaN());
        Assert.assertFalse(z.tan().isNaN());
        Assert.assertFalse(z.sinh().isNaN());
        Assert.assertFalse(z.cosh().isNaN());
        Assert.assertFalse(z.tanh().isNaN());
        Assert.assertFalse(z.asin().isNaN());
        Assert.assertFalse(z.acos().isNaN());
        Assert.assertFalse(z.atan().isNaN());
        Assert.assertFalse(z.sqrt1z().isNaN());

        // pow
        Complex powRes = z.pow(new Complex(2.0, 0.0));
        Complex powDoubleRes = z.pow(2.0);
        Assert.assertEquals(powRes.getReal(), powDoubleRes.getReal(), EPSILON);
        Assert.assertEquals(powRes.getImaginary(), powDoubleRes.getImaginary(), EPSILON);

        // argument
        Assert.assertEquals(FastMath.PI / 4.0, z.getArgument(), EPSILON);
    }

    // ==========================================
    // 6. ValueOf, Factories, and Serialization helpers
    // ==========================================

    @Test
    public void testValueOfFactories() {
        Assert.assertTrue(Complex.valueOf(Double.NaN, 1.0).isNaN());
        Assert.assertTrue(Complex.valueOf(1.0, Double.NaN).isNaN());
        Complex c = Complex.valueOf(3.0, 4.0);
        Assert.assertEquals(3.0, c.getReal(), EPSILON);
        Assert.assertEquals(4.0, c.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN).isNaN());
        Complex cReal = Complex.valueOf(5.0);
        Assert.assertEquals(5.0, cReal.getReal(), EPSILON);
        Assert.assertEquals(0.0, cReal.getImaginary(), EPSILON);
    }

    @Test
    public void testFieldAndToString() {
        Complex c = new Complex(1.5, -2.5);
        Assert.assertNotNull(c.getField());
        Assert.assertEquals(ComplexField.getInstance(), c.getField());
        Assert.assertEquals("(1.5, -2.5)", c.toString());
    }
}