package org.apache.commons.math3.complex;

import org.apache.commons.math3.TestUtils;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ComplexTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testConstantsAndConstructors() {
        Assert.assertEquals(0.0, Complex.I.getReal(), EPSILON);
        Assert.assertEquals(1.0, Complex.I.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.isNaN());
        Assert.assertFalse(Complex.NaN.isInfinite());

        Assert.assertTrue(Complex.INF.isInfinite());
        Assert.assertFalse(Complex.INF.isNaN());

        Assert.assertEquals(1.0, Complex.ONE.getReal(), EPSILON);
        Assert.assertEquals(0.0, Complex.ONE.getImaginary(), EPSILON);

        Assert.assertEquals(0.0, Complex.ZERO.getReal(), EPSILON);
        Assert.assertEquals(0.0, Complex.ZERO.getImaginary(), EPSILON);

        Complex singleArg = new Complex(5.0);
        Assert.assertEquals(5.0, singleArg.getReal(), EPSILON);
        Assert.assertEquals(0.0, singleArg.getImaginary(), EPSILON);

        Complex infReal = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Assert.assertTrue(infReal.isInfinite());
        Assert.assertFalse(infReal.isNaN());

        Complex infImag = new Complex(1.0, Double.NEGATIVE_INFINITY);
        Assert.assertTrue(infImag.isInfinite());

        Complex nanAndInf = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
        Assert.assertTrue(nanAndInf.isNaN());
        Assert.assertFalse(nanAndInf.isInfinite());
    }

    @Test
    public void testValueOf() {
        Complex c1 = Complex.valueOf(3.0, 4.0);
        Assert.assertEquals(3.0, c1.getReal(), EPSILON);
        Assert.assertEquals(4.0, c1.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.valueOf(Double.NaN, 1.0).isNaN());
        Assert.assertTrue(Complex.valueOf(1.0, Double.NaN).isNaN());
        Assert.assertTrue(Complex.valueOf(Double.NaN).isNaN());

        Complex c2 = Complex.valueOf(7.0);
        Assert.assertEquals(7.0, c2.getReal(), EPSILON);
        Assert.assertEquals(0.0, c2.getImaginary(), EPSILON);
    }

    @Test
    public void testAbs() {
        Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        Assert.assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.NEGATIVE_INFINITY, 0).abs(), EPSILON);

        // |real| < |imaginary|
        Complex c1 = new Complex(3.0, 4.0);
        Assert.assertEquals(5.0, c1.abs(), EPSILON);

        // |real| >= |imaginary|
        Complex c2 = new Complex(4.0, 3.0);
        Assert.assertEquals(5.0, c2.abs(), EPSILON);

        // Zero case: real == 0.0 and imaginary == 0.0
        Assert.assertEquals(0.0, Complex.ZERO.abs(), EPSILON);
    }

    @Test
    public void testAdd() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(5.0, 6.0);
        Complex res = x.add(y);
        Assert.assertEquals(8.0, res.getReal(), EPSILON);
        Assert.assertEquals(10.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(x.add(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(x).isNaN());

        Complex resDbl = x.add(2.0);
        Assert.assertEquals(5.0, resDbl.getReal(), EPSILON);
        Assert.assertEquals(4.0, resDbl.getImaginary(), EPSILON);
        Assert.assertTrue(x.add(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(2.0).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        Complex.ONE.add((Complex) null);
    }

    @Test
    public void testSubtract() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(5.0, 6.0);
        Complex res = x.subtract(y);
        Assert.assertEquals(-2.0, res.getReal(), EPSILON);
        Assert.assertEquals(-2.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(x.subtract(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(x).isNaN());

        Complex resDbl = x.subtract(2.0);
        Assert.assertEquals(1.0, resDbl.getReal(), EPSILON);
        Assert.assertEquals(4.0, resDbl.getImaginary(), EPSILON);
        Assert.assertTrue(x.subtract(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(2.0).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        Complex.ONE.subtract((Complex) null);
    }

    @Test
    public void testConjugateAndNegate() {
        Complex x = new Complex(3.0, -4.0);
        Complex conj = x.conjugate();
        Assert.assertEquals(3.0, conj.getReal(), EPSILON);
        Assert.assertEquals(4.0, conj.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.conjugate().isNaN());

        Complex neg = x.negate();
        Assert.assertEquals(-3.0, neg.getReal(), EPSILON);
        Assert.assertEquals(4.0, neg.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testMultiply() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(2.0, -5.0);
        Complex res = x.multiply(y);
        Assert.assertEquals(26.0, res.getReal(), EPSILON);
        Assert.assertEquals(-7.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(x.multiply(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(x).isNaN());

        Assert.assertTrue(x.multiply(Complex.INF).isInfinite());
        Assert.assertTrue(Complex.INF.multiply(x).isInfinite());

        Complex resInt = x.multiply(3);
        Assert.assertEquals(9.0, resInt.getReal(), EPSILON);
        Assert.assertEquals(12.0, resInt.getImaginary(), EPSILON);
        Assert.assertTrue(Complex.NaN.multiply(3).isNaN());
        Assert.assertTrue(Complex.INF.multiply(3).isInfinite());

        Complex resDbl = x.multiply(2.5);
        Assert.assertEquals(7.5, resDbl.getReal(), EPSILON);
        Assert.assertEquals(10.0, resDbl.getImaginary(), EPSILON);
        Assert.assertTrue(x.multiply(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(2.5).isNaN());
        Assert.assertTrue(x.multiply(Double.POSITIVE_INFINITY).isInfinite());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        Complex.ONE.multiply((Complex) null);
    }

    @Test
    public void testDivideComplex() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(1.0, 2.0); // |c| < |d|

        Complex res1 = x.divide(y);
        Assert.assertEquals(2.2, res1.getReal(), EPSILON);
        Assert.assertEquals(-0.4, res1.getImaginary(), EPSILON);

        Complex z = new Complex(2.0, 1.0); // |c| >= |d|
        Complex res2 = x.divide(z);
        Assert.assertEquals(2.0, res2.getReal(), EPSILON);
        Assert.assertEquals(1.0, res2.getImaginary(), EPSILON);

        Assert.assertTrue(x.divide(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(x).isNaN());
        Assert.assertTrue(x.divide(Complex.ZERO).isNaN());

        // Divisor infinite, this finite -> ZERO
        Assert.assertEquals(Complex.ZERO, x.divide(Complex.INF));
        // Both infinite -> NaN
        Assert.assertTrue(Complex.INF.divide(Complex.INF).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        Complex.ONE.divide((Complex) null);
    }

    @Test
    public void testDivideDouble() {
        Complex x = new Complex(4.0, 6.0);
        Complex res = x.divide(2.0);
        Assert.assertEquals(2.0, res.getReal(), EPSILON);
        Assert.assertEquals(3.0, res.getImaginary(), EPSILON);

        Assert.assertTrue(x.divide(0.0).isNaN());
        Assert.assertTrue(x.divide(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(2.0).isNaN());

        Assert.assertEquals(Complex.ZERO, x.divide(Double.POSITIVE_INFINITY));
        Assert.assertTrue(Complex.INF.divide(Double.POSITIVE_INFINITY).isNaN());
    }

    @Test
    public void testReciprocal() {
        // Defects4J Math-5 check: reciprocal of ZERO
        Assert.assertTrue(Complex.ZERO.reciprocal().isNaN() || Complex.ZERO.reciprocal().isInfinite());

        Assert.assertTrue(Complex.NaN.reciprocal().isNaN());
        Assert.assertEquals(Complex.ZERO, Complex.INF.reciprocal());

        // |real| < |imaginary|
        Complex c1 = new Complex(3.0, 4.0).reciprocal();
        Assert.assertEquals(3.0 / 25.0, c1.getReal(), EPSILON);
        Assert.assertEquals(-4.0 / 25.0, c1.getImaginary(), EPSILON);

        // |real| >= |imaginary|
        Complex c2 = new Complex(4.0, 3.0).reciprocal();
        Assert.assertEquals(4.0 / 25.0, c2.getReal(), EPSILON);
        Assert.assertEquals(-3.0 / 25.0, c2.getImaginary(), EPSILON);
    }

    @Test
    public void testSqrt() {
        Assert.assertTrue(Complex.NaN.sqrt().isNaN());
        Assert.assertEquals(Complex.ZERO, Complex.ZERO.sqrt());

        // real >= 0
        Complex c1 = new Complex(3.0, 4.0).sqrt();
        Assert.assertEquals(2.0, c1.getReal(), EPSILON);
        Assert.assertEquals(1.0, c1.getImaginary(), EPSILON);

        // real < 0
        Complex c2 = new Complex(-3.0, 4.0).sqrt();
        Assert.assertEquals(1.0, c2.getReal(), EPSILON);
        Assert.assertEquals(2.0, c2.getImaginary(), EPSILON);

        Complex c3 = new Complex(-3.0, -4.0).sqrt();
        Assert.assertEquals(1.0, c3.getReal(), EPSILON);
        Assert.assertEquals(-2.0, c3.getImaginary(), EPSILON);
    }

    @Test
    public void testSqrt1z() {
        Complex z = new Complex(0.5, 0.5);
        Complex res = z.sqrt1z();
        Assert.assertNotNull(res);
        Assert.assertFalse(res.isNaN());
    }

    @Test
    public void testExpAndLog() {
        Assert.assertTrue(Complex.NaN.exp().isNaN());
        Complex expZero = Complex.ZERO.exp();
        Assert.assertEquals(1.0, expZero.getReal(), EPSILON);
        Assert.assertEquals(0.0, expZero.getImaginary(), EPSILON);

        Assert.assertTrue(Complex.NaN.log().isNaN());
        Complex logOne = Complex.ONE.log();
        Assert.assertEquals(0.0, logOne.getReal(), EPSILON);
        Assert.assertEquals(0.0, logOne.getImaginary(), EPSILON);
    }

    @Test
    public void testPow() {
        Complex base = new Complex(2.0, 0.0);
        Complex exponent = new Complex(3.0, 0.0);
        Complex res = base.pow(exponent);
        Assert.assertEquals(8.0, res.getReal(), 1e-10);
        Assert.assertEquals(0.0, res.getImaginary(), 1e-10);

        Complex resDbl = base.pow(3.0);
        Assert.assertEquals(8.0, resDbl.getReal(), 1e-10);
        Assert.assertEquals(0.0, resDbl.getImaginary(), 1e-10);
    }

    @Test(expected = NullArgumentException.class)
    public void testPowNull() {
        Complex.ONE.pow((Complex) null);
    }

    @Test
    public void testTrigonometric() {
        Assert.assertTrue(Complex.NaN.sin().isNaN());
        Assert.assertTrue(Complex.NaN.cos().isNaN());
        Assert.assertTrue(Complex.NaN.tan().isNaN());

        // Tan infinite real boundary
        Assert.assertTrue(new Complex(Double.POSITIVE_INFINITY, 1.0).tan().isNaN());

        // Tan imaginary boundaries (> 20.0 and < -20.0)
        Complex tanHigh = new Complex(1.0, 25.0).tan();
        Assert.assertEquals(0.0, tanHigh.getReal(), EPSILON);
        Assert.assertEquals(1.0, tanHigh.getImaginary(), EPSILON);

        Complex tanLow = new Complex(1.0, -25.0).tan();
        Assert.assertEquals(0.0, tanLow.getReal(), EPSILON);
        Assert.assertEquals(-1.0, tanLow.getImaginary(), EPSILON);

        // Tan normal
        Complex tanNormal = new Complex(0.5, 0.5).tan();
        Assert.assertFalse(tanNormal.isNaN());

        // Inverse Trigonometric
        Assert.assertTrue(Complex.NaN.asin().isNaN());
        Assert.assertTrue(Complex.NaN.acos().isNaN());
        Assert.assertTrue(Complex.NaN.atan().isNaN());

        Assert.assertNotNull(new Complex(0.5, 0.5).asin());
        Assert.assertNotNull(new Complex(0.5, 0.5).acos());
        Assert.assertNotNull(new Complex(0.5, 0.5).atan());
    }

    @Test
    public void testHyperbolic() {
        Assert.assertTrue(Complex.NaN.sinh().isNaN());
        Assert.assertTrue(Complex.NaN.cosh().isNaN());
        Assert.assertTrue(Complex.NaN.tanh().isNaN());

        // Tanh infinite imaginary boundary
        Assert.assertTrue(new Complex(1.0, Double.POSITIVE_INFINITY).tanh().isNaN());

        // Tanh real boundaries (> 20.0 and < -20.0)
        Complex tanhHigh = new Complex(25.0, 1.0).tanh();
        Assert.assertEquals(1.0, tanhHigh.getReal(), EPSILON);
        Assert.assertEquals(0.0, tanhHigh.getImaginary(), EPSILON);

        Complex tanhLow = new Complex(-25.0, 1.0).tanh();
        Assert.assertEquals(-1.0, tanhLow.getReal(), EPSILON);
        Assert.assertEquals(0.0, tanhLow.getImaginary(), EPSILON);

        // Tanh normal
        Complex tanhNormal = new Complex(0.5, 0.5).tanh();
        Assert.assertFalse(tanhNormal.isNaN());
    }

    @Test
    public void testGetArgument() {
        Assert.assertEquals(0.0, Complex.ONE.getArgument(), EPSILON);
        Assert.assertEquals(Math.PI / 2.0, Complex.I.getArgument(), EPSILON);
        Assert.assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    @Test
    public void testNthRoot() {
        // Branch: NaN
        List<Complex> nanRoots = Complex.NaN.nthRoot(2);
        Assert.assertEquals(1, nanRoots.size());
        Assert.assertTrue(nanRoots.get(0).isNaN());

        // Branch: Infinite
        List<Complex> infRoots = Complex.INF.nthRoot(2);
        Assert.assertEquals(1, infRoots.size());
        Assert.assertTrue(infRoots.get(0).isInfinite());

        // Branch: Normal (n = 3)
        List<Complex> roots = Complex.ONE.nthRoot(3);
        Assert.assertEquals(3, roots.size());
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRootInvalidN() {
        Complex.ONE.nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRootNegativeN() {
        Complex.ONE.nthRoot(-2);
    }

    @Test
    public void testEqualsAndHashCode() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(3.0, 4.0);
        Complex z = new Complex(3.0, 5.0);

        // Identity
        Assert.assertTrue(x.equals(x));

        // Symmetric & Equal
        Assert.assertTrue(x.equals(y));
        Assert.assertTrue(y.equals(x));
        Assert.assertEquals(x.hashCode(), y.hashCode());

        // Different values / Types / Null
        Assert.assertFalse(x.equals(z));
        Assert.assertFalse(x.equals(null));
        Assert.assertFalse(x.equals("Not a Complex"));

        // NaN equality rules in Complex class
        Complex nan1 = new Complex(Double.NaN, 0.0);
        Complex nan2 = new Complex(0.0, Double.NaN);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Complex.NaN));
        Assert.assertEquals(nan1.hashCode(), Complex.NaN.hashCode());
        Assert.assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testSerializationAndMisc() throws Exception {
        Complex original = new Complex(3.0, 4.0);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Complex deserialized = (Complex) ois.readResolve(); // direct check or deserialization

        Assert.assertNotNull(original.getField());
        Assert.assertEquals("(3.0, 4.0)", original.toString());
    }
}