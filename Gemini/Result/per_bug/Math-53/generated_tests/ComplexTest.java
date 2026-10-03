package org.apache.commons.math.complex;

import org.apache.commons.math.TestUtils;
import org.apache.commons.math.exception.NullArgumentException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ComplexTest {

    private static final double EPSILON = 1e-12;

    // =========================================================================
    // 1. CONSTRUCTOR, CONSTANTS & STATE CHECKS
    // =========================================================================

    @Test
    public void testConstants() {
        assertEquals(0.0, Complex.I.getReal(), EPSILON);
        assertEquals(1.0, Complex.I.getImaginary(), EPSILON);

        assertEquals(1.0, Complex.ONE.getReal(), EPSILON);
        assertEquals(0.0, Complex.ONE.getImaginary(), EPSILON);

        assertEquals(0.0, Complex.ZERO.getReal(), EPSILON);
        assertEquals(0.0, Complex.ZERO.getImaginary(), EPSILON);

        assertTrue(Complex.NaN.isNaN());
        assertFalse(Complex.NaN.isInfinite());

        assertTrue(Complex.INF.isInfinite());
        assertFalse(Complex.INF.isNaN());
    }

    @Test
    public void testIsNaN() {
        Complex normal = new Complex(3.0, 4.0);
        assertFalse(normal.isNaN());

        Complex nanReal = new Complex(Double.NaN, 4.0);
        assertTrue(nanReal.isNaN());

        Complex nanImag = new Complex(3.0, Double.NaN);
        assertTrue(nanImag.isNaN());

        Complex nanBoth = new Complex(Double.NaN, Double.NaN);
        assertTrue(nanBoth.isNaN());
    }

    @Test
    public void testIsInfinite() {
        Complex normal = new Complex(3.0, 4.0);
        assertFalse(normal.isInfinite());

        Complex infReal = new Complex(Double.POSITIVE_INFINITY, 4.0);
        assertTrue(infReal.isInfinite());

        Complex infImag = new Complex(3.0, Double.NEGATIVE_INFINITY);
        assertTrue(infImag.isInfinite());

        Complex infBoth = new Complex(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
        assertTrue(infBoth.isInfinite());

        // NaN takes precedence over Infinite
        Complex infAndNaN = new Complex(Double.POSITIVE_INFINITY, Double.NaN);
        assertTrue(infAndNaN.isNaN());
        assertFalse(infAndNaN.isInfinite());
    }

    // =========================================================================
    // 2. BASIC ARITHMETIC & DEFECTS4J TARGET (Math-53)
    // =========================================================================

    @Test(expected = NullArgumentException.class)
    public void testAddNull() {
        Complex.ONE.add(null);
    }

    @Test
    public void testAdd() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(5.0, 6.0);
        Complex z = x.add(y);
        assertEquals(8.0, z.getReal(), EPSILON);
        assertEquals(10.0, z.getImaginary(), EPSILON);
    }

    @Test
    public void testAddNaN_Defects4J_Math53() {
        // Target defect: Adding NaN operands must yield Complex.NaN
        Complex x = new Complex(1.0, 1.0);
        Complex result = x.add(Complex.NaN);
        assertTrue(result.isNaN());

        Complex result2 = Complex.NaN.add(x);
        assertTrue(result2.isNaN());

        Complex partialNaN = new Complex(1.0, Double.NaN);
        Complex result3 = x.add(partialNaN);
        assertTrue(result3.isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testSubtractNull() {
        Complex.ONE.subtract(null);
    }

    @Test
    public void testSubtract() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(5.0, 6.0);
        Complex z = x.subtract(y);
        assertEquals(-2.0, z.getReal(), EPSILON);
        assertEquals(-2.0, z.getImaginary(), EPSILON);

        assertTrue(x.subtract(Complex.NaN).isNaN());
        assertTrue(Complex.NaN.subtract(x).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testMultiplyNull() {
        Complex.ONE.multiply((Complex) null);
    }

    @Test
    public void testMultiplyComplex() {
        Complex x = new Complex(3.0, 4.0);
        Complex y = new Complex(5.0, 6.0);
        Complex z = x.multiply(y);
        assertEquals(-9.0, z.getReal(), EPSILON);
        assertEquals(38.0, z.getImaginary(), EPSILON);

        // NaN cases
        assertTrue(x.multiply(Complex.NaN).isNaN());
        assertTrue(Complex.NaN.multiply(x).isNaN());

        // Infinite branches (4 individual terms)
        Complex infReal = new Complex(Double.POSITIVE_INFINITY, 1.0);
        Complex infImag = new Complex(1.0, Double.POSITIVE_INFINITY);
        assertEquals(Complex.INF, x.multiply(infReal));
        assertEquals(Complex.INF, x.multiply(infImag));
        assertEquals(Complex.INF, infReal.multiply(x));
        assertEquals(Complex.INF, infImag.multiply(x));
    }

    @Test
    public void testMultiplyScalar() {
        Complex x = new Complex(3.0, 4.0);
        Complex z = x.multiply(2.0);
        assertEquals(6.0, z.getReal(), EPSILON);
        assertEquals(8.0, z.getImaginary(), EPSILON);

        assertTrue(x.multiply(Double.NaN).isNaN());
        assertTrue(Complex.NaN.multiply(2.0).isNaN());

        assertEquals(Complex.INF, x.multiply(Double.POSITIVE_INFINITY));
        assertEquals(Complex.INF, new Complex(Double.POSITIVE_INFINITY, 1.0).multiply(2.0));
        assertEquals(Complex.INF, new Complex(1.0, Double.POSITIVE_INFINITY).multiply(2.0));
    }

    @Test(expected = NullArgumentException.class)
    public void testDivideNull() {
        Complex.ONE.divide(null);
    }

    @Test
    public void testDivide() {
        Complex x = new Complex(3.0, 2.0);
        Complex y = new Complex(4.0, -3.0);

        // |c| >= |d| branch (4.0 >= 3.0)
        Complex z1 = x.divide(y);
        assertEquals(6.0 / 25.0, z1.getReal(), EPSILON);
        assertEquals(17.0 / 25.0, z1.getImaginary(), EPSILON);

        // |c| < |d| branch (3.0 < 4.0)
        Complex y2 = new Complex(3.0, 4.0);
        Complex z2 = x.divide(y2);
        assertEquals(17.0 / 25.0, z2.getReal(), EPSILON);
        assertEquals(-6.0 / 25.0, z2.getImaginary(), EPSILON);

        // NaN cases
        assertTrue(x.divide(Complex.NaN).isNaN());
        assertTrue(Complex.NaN.divide(x).isNaN());

        // Division by ZERO
        assertTrue(x.divide(Complex.ZERO).isNaN());
        assertTrue(x.divide(new Complex(0.0, 0.0)).isNaN());

        // Division by Infinite (Finite / Inf = ZERO)
        assertEquals(Complex.ZERO, x.divide(Complex.INF));
        // Infinite / Infinite = NaN
        assertTrue(Complex.INF.divide(Complex.INF).isNaN());
    }

    @Test
    public void testNegateAndConjugate() {
        Complex x = new Complex(3.0, -4.0);

        Complex neg = x.negate();
        assertEquals(-3.0, neg.getReal(), EPSILON);
        assertEquals(4.0, neg.getImaginary(), EPSILON);
        assertTrue(Complex.NaN.negate().isNaN());

        Complex conj = x.conjugate();
        assertEquals(3.0, conj.getReal(), EPSILON);
        assertEquals(4.0, conj.getImaginary(), EPSILON);
        assertTrue(Complex.NaN.conjugate().isNaN());
    }

    @Test
    public void testAbs() {
        assertTrue(Double.isNaN(Complex.NaN.abs()));
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), EPSILON);
        assertEquals(Double.POSITIVE_INFINITY, new Complex(Double.NEGATIVE_INFINITY, 1.0).abs(), EPSILON);

        // |real| < |imaginary| branch
        Complex c1 = new Complex(3.0, 4.0);
        assertEquals(5.0, c1.abs(), EPSILON);

        // |real| < |imaginary| with imaginary == 0.0
        Complex c2 = new Complex(-0.0, 0.0);
        assertEquals(0.0, c2.abs(), EPSILON);

        // |real| >= |imaginary| branch
        Complex c3 = new Complex(4.0, 3.0);
        assertEquals(5.0, c3.abs(), EPSILON);

        // |real| >= |imaginary| with real == 0.0
        Complex c4 = new Complex(0.0, 5.0);
        assertEquals(5.0, c4.abs(), EPSILON);
    }

    // =========================================================================
    // 3. ADVANCED MATH, TRIG & HYPERBOLIC FUNCTIONS
    // =========================================================================

    @Test
    public void testAcosAsinAtan() {
        assertTrue(Complex.NaN.acos().isNaN());
        assertTrue(Complex.NaN.asin().isNaN());
        assertTrue(Complex.NaN.atan().isNaN());

        Complex z = new Complex(0.5, 0.5);
        assertFalse(z.acos().isNaN());
        assertFalse(z.asin().isNaN());
        assertFalse(z.atan().isNaN());
    }

    @Test
    public void testCosSinTan() {
        assertTrue(Complex.NaN.cos().isNaN());
        assertTrue(Complex.NaN.sin().isNaN());
        assertTrue(Complex.NaN.tan().isNaN());

        Complex z = new Complex(1.0, 2.0);
        assertFalse(z.cos().isNaN());
        assertFalse(z.sin().isNaN());
        assertFalse(z.tan().isNaN());
    }

    @Test
    public void testCoshSinhTanh() {
        assertTrue(Complex.NaN.cosh().isNaN());
        assertTrue(Complex.NaN.sinh().isNaN());
        assertTrue(Complex.NaN.tanh().isNaN());

        Complex z = new Complex(1.0, 2.0);
        assertFalse(z.cosh().isNaN());
        assertFalse(z.sinh().isNaN());
        assertFalse(z.tanh().isNaN());
    }

    @Test
    public void testExpLogPow() {
        assertTrue(Complex.NaN.exp().isNaN());
        assertTrue(Complex.NaN.log().isNaN());

        Complex z = new Complex(1.0, 1.0);
        assertFalse(z.exp().isNaN());
        assertFalse(z.log().isNaN());

        assertTrue(z.pow(Complex.NaN).isNaN());
        assertFalse(z.pow(new Complex(2.0, 0.0)).isNaN());
    }

    @Test(expected = NullArgumentException.class)
    public void testPowNull() {
        Complex.ONE.pow(null);
    }

    @Test
    public void testSqrt() {
        assertTrue(Complex.NaN.sqrt().isNaN());

        // 0 + 0i branch
        Complex zeroSqrt = Complex.ZERO.sqrt();
        assertEquals(0.0, zeroSqrt.getReal(), EPSILON);
        assertEquals(0.0, zeroSqrt.getImaginary(), EPSILON);

        // real >= 0 branch
        Complex z1 = new Complex(3.0, 4.0).sqrt();
        assertEquals(2.0, z1.getReal(), EPSILON);
        assertEquals(1.0, z1.getImaginary(), EPSILON);

        // real < 0 branch with imaginary >= 0
        Complex z2 = new Complex(-3.0, 4.0).sqrt();
        assertEquals(1.0, z2.getReal(), EPSILON);
        assertEquals(2.0, z2.getImaginary(), EPSILON);

        // real < 0 branch with imaginary < 0
        Complex z3 = new Complex(-3.0, -4.0).sqrt();
        assertEquals(1.0, z3.getReal(), EPSILON);
        assertEquals(-2.0, z3.getImaginary(), EPSILON);
    }

    @Test
    public void testSqrt1z() {
        Complex z = new Complex(0.6, 0.8);
        assertNotNull(z.sqrt1z());
        assertTrue(Complex.NaN.sqrt1z().isNaN());
    }

    @Test
    public void testGetArgument() {
        assertEquals(0.0, new Complex(1.0, 0.0).getArgument(), EPSILON);
        assertEquals(Math.PI / 2.0, new Complex(0.0, 1.0).getArgument(), EPSILON);
        assertEquals(Math.PI, new Complex(-1.0, 0.0).getArgument(), EPSILON);
        assertEquals(-Math.PI / 2.0, new Complex(0.0, -1.0).getArgument(), EPSILON);
        assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    // =========================================================================
    // 4. NTH ROOT, EQUALS, HASHCODE, SERIALIZATION
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testNthRootNegativeN() {
        Complex.ONE.nthRoot(0);
    }

    @Test
    public void testNthRootSpecialCases() {
        List<Complex> nanRoots = Complex.NaN.nthRoot(3);
        assertEquals(1, nanRoots.size());
        assertTrue(nanRoots.get(0).isNaN());

        List<Complex> infRoots = Complex.INF.nthRoot(3);
        assertEquals(1, infRoots.size());
        assertTrue(infRoots.get(0).isInfinite());
    }

    @Test
    public void testNthRootNormal() {
        List<Complex> roots = Complex.ONE.nthRoot(4);
        assertEquals(4, roots.size());
        for (Complex root : roots) {
            assertEquals(1.0, root.abs(), EPSILON);
        }
    }

    @Test
    public void testEqualsAndHashCode() {
        Complex z1 = new Complex(1.0, 2.0);
        Complex z2 = new Complex(1.0, 2.0);
        Complex zDiffReal = new Complex(2.0, 2.0);
        Complex zDiffImag = new Complex(1.0, 3.0);

        // Reflexive, Symmetric
        assertTrue(z1.equals(z1));
        assertTrue(z1.equals(z2));
        assertTrue(z2.equals(z1));
        assertEquals(z1.hashCode(), z2.hashCode());

        // False cases
        assertFalse(z1.equals(null));
        assertFalse(z1.equals("A String"));
        assertFalse(z1.equals(zDiffReal));
        assertFalse(z1.equals(zDiffImag));

        // NaN equality contract
        Complex nan1 = new Complex(Double.NaN, 2.0);
        Complex nan2 = new Complex(1.0, Double.NaN);
        assertTrue(nan1.equals(nan2));
        assertTrue(nan1.equals(Complex.NaN));
        assertFalse(z1.equals(nan1));
        assertFalse(nan1.equals(z1));
        assertEquals(nan1.hashCode(), Complex.NaN.hashCode());
        assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testFieldAndToString() {
        Complex z = new Complex(1.5, -2.5);
        assertEquals("(1.5, -2.5)", z.toString());
        assertNotNull(z.getField());
        assertEquals(ComplexField.getInstance(), z.getField());
    }

    @Test
    public void testSerialization() {
        Complex z = new Complex(3.0, 4.0);
        assertEquals(z, TestUtils.serializeAndRecover(z));

        Complex nan = Complex.NaN;
        assertEquals(nan, TestUtils.serializeAndRecover(nan));

        Complex inf = Complex.INF;
        assertEquals(inf, TestUtils.serializeAndRecover(inf));
    }
}