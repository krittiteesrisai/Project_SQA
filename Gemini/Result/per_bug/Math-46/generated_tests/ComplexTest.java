package org.apache.commons.math.complex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class ComplexTest {

    private static final double EPS = 1e-12;

    @Test
    public void testConstantsAndConstructor() {
        Assert.assertTrue(Complex.NaN.isNaN());
        Assert.assertTrue(Complex.INF.isInfinite());
        Assert.assertEquals(1.0, Complex.ONE.getReal(), EPS);
        Assert.assertEquals(0.0, Complex.ONE.getImaginary(), EPS);
        Assert.assertEquals(0.0, Complex.ZERO.getReal(), EPS);
        Assert.assertEquals(0.0, Complex.ZERO.getImaginary(), EPS);
        Assert.assertEquals(0.0, Complex.I.getReal(), EPS);
        Assert.assertEquals(1.0, Complex.I.getImaginary(), EPS);

        Complex singleArg = new Complex(5.5);
        Assert.assertEquals(5.5, singleArg.getReal(), EPS);
        Assert.assertEquals(0.0, singleArg.getImaginary(), EPS);

        Complex nanReal = new Complex(Double.NaN, 1.0);
        Assert.assertTrue(nanReal.isNaN());
        Assert.assertFalse(nanReal.isInfinite());

        Complex nanImag = new Complex(1.0, Double.NaN);
        Assert.assertTrue(nanImag.isNaN());

        Complex infReal = new Complex(Double.POSITIVE_INFINITY, 2.0);
        Assert.assertTrue(infReal.isInfinite());
        Assert.assertFalse(infReal.isNaN());

        Complex infImag = new Complex(2.0, Double.NEGATIVE_INFINITY);
        Assert.assertTrue(infImag.isInfinite());

        Complex nanAndInf = new Complex(Double.NaN, Double.POSITIVE_INFINITY);
        Assert.assertTrue(nanAndInf.isNaN());
        Assert.assertFalse(nanAndInf.isInfinite());
    }

    @Test
    public void testAbs() {
        Assert.assertTrue(Double.isNaN(Complex.NaN.abs()));
        Assert.assertTrue(Double.isNaN(new Complex(Double.NaN, 0.0).abs()));
        Assert.assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPS);
        Assert.assertEquals(Double.POSITIVE_INFINITY, new Complex(1.0, Double.NEGATIVE_INFINITY).abs(), EPS);

        // |real| < |imaginary|
        Complex c1 = new Complex(3.0, 4.0);
        Assert.assertEquals(5.0, c1.abs(), EPS);

        // |real| >= |imaginary|
        Complex c2 = new Complex(4.0, 3.0);
        Assert.assertEquals(5.0, c2.abs(), EPS);

        // real == 0, imaginary == 0
        Assert.assertEquals(0.0, Complex.ZERO.abs(), EPS);

        // |real| >= |imaginary| with real == 0.0 (0, 0)
        Complex zero = new Complex(0.0, 0.0);
        Assert.assertEquals(0.0, zero.abs(), EPS);
    }

    @Test
    public void testAdd() {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(3.0, 4.0);
        Complex result = a.add(b);
        Assert.assertEquals(4.0, result.getReal(), EPS);
        Assert.assertEquals(6.0, result.getImaginary(), EPS);

        Assert.assertTrue(a.add(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(a).isNaN());

        Complex resultD = a.add(3.0);
        Assert.assertEquals(4.0, resultD.getReal(), EPS);
        Assert.assertEquals(2.0, resultD.getImaginary(), EPS);
        Assert.assertTrue(a.add(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.add(3.0).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        Complex.ONE.add((Complex) null);
    }

    @Test
    public void testSubtract() {
        Complex a = new Complex(5.0, 7.0);
        Complex b = new Complex(2.0, 3.0);
        Complex result = a.subtract(b);
        Assert.assertEquals(3.0, result.getReal(), EPS);
        Assert.assertEquals(4.0, result.getImaginary(), EPS);

        Assert.assertTrue(a.subtract(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(a).isNaN());

        Complex resultD = a.subtract(2.0);
        Assert.assertEquals(3.0, resultD.getReal(), EPS);
        Assert.assertEquals(7.0, resultD.getImaginary(), EPS);
        Assert.assertTrue(a.subtract(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.subtract(2.0).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        Complex.ONE.subtract((Complex) null);
    }

    @Test
    public void testMultiply() {
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(4.0, 5.0);
        Complex result = a.multiply(b);
        Assert.assertEquals(-7.0, result.getReal(), EPS);
        Assert.assertEquals(22.0, result.getImaginary(), EPS);

        Assert.assertTrue(a.multiply(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(a).isNaN());

        // Multiplications with infinite components
        Complex infReal = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex infImag = new Complex(1.0, Double.NEGATIVE_INFINITY);
        Assert.assertTrue(a.multiply(infReal).isInfinite());
        Assert.assertTrue(a.multiply(infImag).isInfinite());
        Assert.assertTrue(infReal.multiply(a).isInfinite());
        Assert.assertTrue(infImag.multiply(a).isInfinite());

        Complex resultD = a.multiply(2.0);
        Assert.assertEquals(4.0, resultD.getReal(), EPS);
        Assert.assertEquals(6.0, resultD.getImaginary(), EPS);

        Assert.assertTrue(a.multiply(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.multiply(2.0).isNaN());
        Assert.assertTrue(a.multiply(Double.POSITIVE_INFINITY).isInfinite());
        Assert.assertTrue(infReal.multiply(2.0).isInfinite());
        Assert.assertTrue(infImag.multiply(2.0).isInfinite());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        Complex.ONE.multiply((Complex) null);
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(2.0, 4.0);
        Complex b = new Complex(2.0, 0.0);
        Complex result = a.divide(b);
        Assert.assertEquals(1.0, result.getReal(), EPS);
        Assert.assertEquals(2.0, result.getImaginary(), EPS);

        // |c| < |d|
        Complex c = new Complex(1.0, 2.0);
        Complex d = new Complex(3.0, 4.0);
        Complex div1 = c.divide(d);
        Assert.assertEquals(0.44, div1.getReal(), EPS);
        Assert.assertEquals(0.08, div1.getImaginary(), EPS);

        // |c| >= |d|
        Complex div2 = d.divide(c);
        Assert.assertEquals(2.2, div2.getReal(), EPS);
        Assert.assertEquals(-0.4, div2.getImaginary(), EPS);

        // NaN cases
        Assert.assertTrue(a.divide(Complex.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(a).isNaN());

        // Divisor is zero
        Assert.assertTrue(Complex.ZERO.divide(Complex.ZERO).isNaN());
        Assert.assertTrue(a.divide(Complex.ZERO).isInfinite());

        // Divisor is infinite
        Assert.assertEquals(Complex.ZERO, a.divide(Complex.INF));

        // Divide double
        Complex resD = a.divide(2.0);
        Assert.assertEquals(1.0, resD.getReal(), EPS);
        Assert.assertEquals(2.0, resD.getImaginary(), EPS);
        Assert.assertTrue(a.divide(Double.NaN).isNaN());
        Assert.assertTrue(Complex.NaN.divide(2.0).isNaN());
        Assert.assertTrue(Complex.ZERO.divide(0.0).isNaN());
        Assert.assertTrue(a.divide(0.0).isInfinite());
        Assert.assertEquals(Complex.ZERO, a.divide(Double.POSITIVE_INFINITY));
        Assert.assertTrue(Complex.INF.divide(Double.POSITIVE_INFINITY).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        Complex.ONE.divide((Complex) null);
    }

    @Test
    public void testConjugateAndNegate() {
        Complex c = new Complex(3.0, -4.0);
        Complex conj = c.conjugate();
        Assert.assertEquals(3.0, conj.getReal(), EPS);
        Assert.assertEquals(4.0, conj.getImaginary(), EPS);
        Assert.assertTrue(Complex.NaN.conjugate().isNaN());

        Complex neg = c.negate();
        Assert.assertEquals(-3.0, neg.getReal(), EPS);
        Assert.assertEquals(4.0, neg.getImaginary(), EPS);
        Assert.assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testEqualsAndHashCode() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(1.5, 2.0);
        Complex c4 = new Complex(1.0, 2.5);

        Assert.assertTrue(c1.equals(c1));
        Assert.assertTrue(c1.equals(c2));
        Assert.assertEquals(c1.hashCode(), c2.hashCode());

        Assert.assertFalse(c1.equals(null));
        Assert.assertFalse(c1.equals("Some String"));
        Assert.assertFalse(c1.equals(c3));
        Assert.assertFalse(c1.equals(c4));

        Complex nan1 = new Complex(Double.NaN, 0.0);
        Complex nan2 = new Complex(0.0, Double.NaN);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Complex.NaN));
        Assert.assertFalse(c1.equals(nan1));
        Assert.assertFalse(nan1.equals(c1));
        Assert.assertEquals(7, nan1.hashCode());
        Assert.assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testSqrt() {
        Assert.assertTrue(Complex.NaN.sqrt().isNaN());
        Complex zeroSqrt = Complex.ZERO.sqrt();
        Assert.assertEquals(0.0, zeroSqrt.getReal(), EPS);
        Assert.assertEquals(0.0, zeroSqrt.getImaginary(), EPS);

        // real >= 0
        Complex cPos = new Complex(3.0, 4.0).sqrt();
        Assert.assertEquals(2.0, cPos.getReal(), EPS);
        Assert.assertEquals(1.0, cPos.getImaginary(), EPS);

        // real < 0, imag >= 0
        Complex cNegPos = new Complex(-3.0, 4.0).sqrt();
        Assert.assertEquals(1.0, cNegPos.getReal(), EPS);
        Assert.assertEquals(2.0, cNegPos.getImaginary(), EPS);

        // real < 0, imag < 0
        Complex cNegNeg = new Complex(-3.0, -4.0).sqrt();
        Assert.assertEquals(1.0, cNegNeg.getReal(), EPS);
        Assert.assertEquals(-2.0, cNegNeg.getImaginary(), EPS);

        Complex sqrt1z = new Complex(0.5, 0.0).sqrt1z();
        Assert.assertEquals(FastMath.sqrt(0.75), sqrt1z.getReal(), EPS);
    }

    @Test
    public void testExponentialAndLogarithm() {
        Assert.assertTrue(Complex.NaN.exp().isNaN());
        Complex expZero = Complex.ZERO.exp();
        Assert.assertEquals(1.0, expZero.getReal(), EPS);
        Assert.assertEquals(0.0, expZero.getImaginary(), EPS);

        Complex expVal = new Complex(1.0, FastMath.PI).exp();
        Assert.assertEquals(-FastMath.E, expVal.getReal(), EPS);
        Assert.assertEquals(0.0, expVal.getImaginary(), 1e-10);

        Assert.assertTrue(Complex.NaN.log().isNaN());
        Complex logOne = Complex.ONE.log();
        Assert.assertEquals(0.0, logOne.getReal(), EPS);
        Assert.assertEquals(0.0, logOne.getImaginary(), EPS);
    }

    @Test
    public void testPow() {
        Complex base = new Complex(2.0, 0.0);
        Complex exp = new Complex(3.0, 0.0);
        Complex powResult = base.pow(exp);
        Assert.assertEquals(8.0, powResult.getReal(), EPS);
        Assert.assertEquals(0.0, powResult.getImaginary(), EPS);

        Complex powDoubleResult = base.pow(3.0);
        Assert.assertEquals(8.0, powDoubleResult.getReal(), EPS);
        Assert.assertEquals(0.0, powDoubleResult.getImaginary(), EPS);
    }

    @Test(expected = NullArgumentException.class)
    public void testPowNull() {
        Complex.ONE.pow((Complex) null);
    }

    @Test
    public void testTrigonometricFunctions() {
        Assert.assertTrue(Complex.NaN.sin().isNaN());
        Assert.assertTrue(Complex.NaN.cos().isNaN());
        Assert.assertTrue(Complex.NaN.tan().isNaN());
        Assert.assertTrue(Complex.NaN.asin().isNaN());
        Assert.assertTrue(Complex.NaN.acos().isNaN());
        Assert.assertTrue(Complex.NaN.atan().isNaN());

        Complex c = new Complex(1.0, 1.0);
        Assert.assertFalse(c.sin().isNaN());
        Assert.assertFalse(c.cos().isNaN());
        Assert.assertFalse(c.tan().isNaN());
        Assert.assertFalse(c.asin().isNaN());
        Assert.assertFalse(c.acos().isNaN());
        Assert.assertFalse(c.atan().isNaN());

        Assert.assertTrue(Complex.NaN.sinh().isNaN());
        Assert.assertTrue(Complex.NaN.cosh().isNaN());
        Assert.assertTrue(Complex.NaN.tanh().isNaN());

        Assert.assertFalse(c.sinh().isNaN());
        Assert.assertFalse(c.cosh().isNaN());
        Assert.assertFalse(c.tanh().isNaN());
    }

    @Test
    public void testGetArgument() {
        Assert.assertEquals(0.0, Complex.ONE.getArgument(), EPS);
        Assert.assertEquals(FastMath.PI / 2.0, Complex.I.getArgument(), EPS);
        Assert.assertEquals(FastMath.PI, new Complex(-1.0, 0.0).getArgument(), EPS);
        Assert.assertEquals(-FastMath.PI / 2.0, new Complex(0.0, -1.0).getArgument(), EPS);
        Assert.assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    @Test
    public void testNthRoot() {
        Complex c = new Complex(1.0, 0.0);
        List<Complex> roots = c.nthRoot(2);
        Assert.assertEquals(2, roots.size());
        Assert.assertEquals(1.0, roots.get(0).getReal(), EPS);
        Assert.assertEquals(0.0, roots.get(0).getImaginary(), EPS);
        Assert.assertEquals(-1.0, roots.get(1).getReal(), EPS);
        Assert.assertEquals(0.0, roots.get(1).getImaginary(), 1e-10);

        List<Complex> nanRoots = Complex.NaN.nthRoot(3);
        Assert.assertEquals(1, nanRoots.size());
        Assert.assertTrue(nanRoots.get(0).isNaN());

        List<Complex> infRoots = Complex.INF.nthRoot(3);
        Assert.assertEquals(1, infRoots.size());
        Assert.assertTrue(infRoots.get(0).isInfinite());
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRootNegativeN() {
        Complex.ONE.nthRoot(0);
    }

    @Test
    public void testValueOfAndFactory() {
        Assert.assertTrue(Complex.valueOf(Double.NaN).isNaN());
        Assert.assertTrue(Complex.valueOf(Double.NaN, 1.0).isNaN());
        Assert.assertTrue(Complex.valueOf(1.0, Double.NaN).isNaN());

        Complex val1 = Complex.valueOf(3.0);
        Assert.assertEquals(3.0, val1.getReal(), EPS);
        Assert.assertEquals(0.0, val1.getImaginary(), EPS);

        Complex val2 = Complex.valueOf(3.0, 4.0);
        Assert.assertEquals(3.0, val2.getReal(), EPS);
        Assert.assertEquals(4.0, val2.getImaginary(), EPS);

        Complex created = val2.createComplex(1.0, 2.0);
        Assert.assertEquals(1.0, created.getReal(), EPS);
        Assert.assertEquals(2.0, created.getImaginary(), EPS);
    }

    @Test
    public void testToStringFieldAndSerialization() throws Exception {
        Complex c = new Complex(3.0, 4.0);
        Assert.assertEquals("(3.0, 4.0)", c.toString());
        Assert.assertNotNull(c.getField());

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(c);
        oos.flush();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Complex deserialized = (Complex) ois.readObject();

        Assert.assertEquals(c, deserialized);
        Assert.assertFalse(deserialized.isNaN());
        Assert.assertFalse(deserialized.isInfinite());
    }
}