package org.apache.commons.math.complex;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NotPositiveException;
import org.junit.Test;

/**
 * JUnit 4 tests for org.apache.commons.math.complex.Complex (Defects4J Math-46b).
 * Test class อยู่ใน package เดียวกันเพื่อเรียก protected methods (createComplex, readResolve)
 * ได้โดยตรงโดยไม่ต้องใช้ reflection.
 */
public class ComplexTest {

    private static final double DELTA = 1e-9;

    // ---------------------------------------------------------------
    // Constructor flags: isNaN / isInfinite / isZero
    // ---------------------------------------------------------------

    @Test
    public void testConstructorNaNFlags() {
        assertTrue(new Complex(Double.NaN, 1.0).isNaN());
        assertTrue(new Complex(1.0, Double.NaN).isNaN());
        assertTrue(new Complex(Double.NaN, Double.NaN).isNaN());
        assertFalse(new Complex(1.0, 2.0).isNaN());
    }

    @Test
    public void testConstructorInfiniteFlags() {
        // isInfinite ต้องเป็น false ถ้า isNaN เป็น true แม้มีค่า Infinite ปนอยู่
        assertFalse(new Complex(Double.NaN, Double.POSITIVE_INFINITY).isInfinite());
        assertTrue(new Complex(Double.POSITIVE_INFINITY, 1.0).isInfinite());
        assertTrue(new Complex(1.0, Double.NEGATIVE_INFINITY).isInfinite());
        assertFalse(new Complex(1.0, 2.0).isInfinite());
    }

    @Test
    public void testSingleArgConstructor() {
        Complex c = new Complex(5.0);
        assertEquals(5.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // abs()
    // ---------------------------------------------------------------

    @Test
    public void testAbsNaN() {
        assertTrue(Double.isNaN(Complex.NaN.abs()));
    }

    @Test
    public void testAbsInfinite() {
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), 0.0);
        assertEquals(Double.POSITIVE_INFINITY,
            new Complex(Double.POSITIVE_INFINITY, 1.0).abs(), 0.0);
    }

    @Test
    public void testAbsRealLessThanImaginary() {
        // |real| < |imaginary| branch, imaginary != 0
        Complex c = new Complex(1.0, 2.0);
        assertEquals(Math.sqrt(5.0), c.abs(), DELTA);
    }

    @Test
    public void testAbsRealGreaterEqualImaginary() {
        // |real| >= |imaginary| branch, real != 0
        Complex c = new Complex(3.0, 1.0);
        assertEquals(Math.sqrt(10.0), c.abs(), DELTA);
    }

    @Test
    public void testAbsZeroZero() {
        // else branch, real == 0.0 sub-branch
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.abs(), 0.0);
    }

    // ---------------------------------------------------------------
    // add(Complex) / add(double)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testAddComplexNullThrows() {
        new Complex(1.0, 2.0).add((Complex) null);
    }

    @Test
    public void testAddComplexNaN() {
        assertTrue(Complex.NaN.equals(new Complex(1.0, 1.0).add(Complex.NaN)));
        assertTrue(Complex.NaN.equals(Complex.NaN.add(new Complex(1.0, 1.0))));
    }

    @Test
    public void testAddComplexNormal() {
        Complex result = new Complex(1.0, 2.0).add(new Complex(3.0, 4.0));
        assertEquals(4.0, result.getReal(), DELTA);
        assertEquals(6.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testAddDoubleNaN() {
        assertTrue(Complex.NaN.equals(new Complex(1.0, 1.0).add(Double.NaN)));
        assertTrue(Complex.NaN.equals(Complex.NaN.add(2.0)));
    }

    @Test
    public void testAddDoubleNormal() {
        Complex result = new Complex(1.0, 2.0).add(3.0);
        assertEquals(4.0, result.getReal(), DELTA);
        assertEquals(2.0, result.getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // conjugate()
    // ---------------------------------------------------------------

    @Test
    public void testConjugateNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.conjugate()));
    }

    @Test
    public void testConjugateNormal() {
        Complex c = new Complex(3.0, 4.0).conjugate();
        assertEquals(3.0, c.getReal(), DELTA);
        assertEquals(-4.0, c.getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // divide(Complex)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testDivideComplexNullThrows() {
        new Complex(1.0, 1.0).divide((Complex) null);
    }

    @Test
    public void testDivideComplexNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.divide(new Complex(1.0, 1.0))));
        assertTrue(Complex.NaN.equals(new Complex(1.0, 1.0).divide(Complex.NaN)));
    }

    @Test
    public void testDivideComplexZeroByZero() {
        // this.isZero && divisor.isZero -> NaN
        assertTrue(Complex.NaN.equals(Complex.ZERO.divide(Complex.ZERO)));
    }

    @Test
    public void testDivideComplexNonZeroByZero() {
        // divisor.isZero, this not zero -> INF
        assertTrue(Complex.INF.equals(new Complex(1.0, 1.0).divide(Complex.ZERO)));
    }

    @Test
    public void testDivideComplexFiniteByInfinite() {
        // divisor infinite, this finite -> ZERO
        Complex result = new Complex(1.0, 1.0).divide(Complex.INF);
        assertTrue(Complex.ZERO.equals(result));
    }

    @Test
    public void testDivideComplexInfiniteByFinite() {
        // this infinite, divisor finite -> falls through to formula; derived expectation: NaN result
        Complex result = Complex.INF.divide(Complex.ONE);
        assertTrue(result.isNaN());
    }

    @Test
    public void testDivideComplexAbsCLessThanD() {
        // |c| < |d| branch
        Complex result = new Complex(1.0, 2.0).divide(new Complex(1.0, 2.0));
        assertEquals(1.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testDivideComplexAbsCGreaterEqualD() {
        // |c| >= |d| branch
        Complex result = new Complex(1.0, 2.0).divide(new Complex(2.0, 1.0));
        // (1+2i)/(2+i) = ((1*2+2*1) + (2*2-1*1)i)/(4+1) = (4+3i)/5
        assertEquals(0.8, result.getReal(), DELTA);
        assertEquals(0.6, result.getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // divide(double)
    // ---------------------------------------------------------------

    @Test
    public void testDivideDoubleNaN() {
        assertTrue(Complex.NaN.equals(new Complex(1.0, 1.0).divide(Double.NaN)));
    }

    @Test
    public void testDivideDoubleByZeroThisZero() {
        assertTrue(Complex.NaN.equals(Complex.ZERO.divide(0.0)));
    }

    @Test
    public void testDivideDoubleByZeroThisNonZero() {
        assertTrue(Complex.INF.equals(new Complex(1.0, 1.0).divide(0.0)));
    }

    @Test
    public void testDivideDoubleByInfiniteThisFinite() {
        Complex result = new Complex(1.0, 1.0).divide(Double.POSITIVE_INFINITY);
        assertTrue(Complex.ZERO.equals(result));
    }

    @Test
    public void testDivideDoubleByInfiniteThisInfinite() {
        Complex result = Complex.INF.divide(Double.POSITIVE_INFINITY);
        assertTrue(Complex.NaN.equals(result));
    }

    @Test
    public void testDivideDoubleNormal() {
        Complex result = new Complex(4.0, 2.0).divide(2.0);
        assertEquals(2.0, result.getReal(), DELTA);
        assertEquals(1.0, result.getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // equals() / hashCode()
    // ---------------------------------------------------------------

    @Test
    public void testEqualsSameInstance() {
        Complex c = new Complex(1.0, 2.0);
        assertTrue(c.equals(c));
    }

    @Test
    public void testEqualsOtherIsNaN() {
        Complex c1 = new Complex(Double.NaN, 1.0);
        Complex c2 = new Complex(1.0, Double.NaN);
        assertTrue(c1.equals(c2));
    }

    @Test
    public void testEqualsNormalTrue() {
        assertTrue(new Complex(1.0, 2.0).equals(new Complex(1.0, 2.0)));
    }

    @Test
    public void testEqualsNormalFalse() {
        assertFalse(new Complex(1.0, 2.0).equals(new Complex(1.0, 3.0)));
    }

    @Test
    public void testEqualsNotComplexInstance() {
        assertFalse(new Complex(1.0, 2.0).equals("not a complex"));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(new Complex(1.0, 2.0).equals(null));
    }

    @Test
    public void testHashCodeNaN() {
        assertEquals(7, Complex.NaN.hashCode());
        assertEquals(7, new Complex(Double.NaN, 1.0).hashCode());
    }

    @Test
    public void testHashCodeConsistentForEqualObjects() {
        Complex c1 = new Complex(1.0, 2.0);
        Complex c2 = new Complex(1.0, 2.0);
        assertEquals(c1.hashCode(), c2.hashCode());
    }

    // ---------------------------------------------------------------
    // isNaN() / isInfinite() getters
    // ---------------------------------------------------------------

    @Test
    public void testIsNaNGetter() {
        assertTrue(Complex.NaN.isNaN());
        assertFalse(Complex.ONE.isNaN());
    }

    @Test
    public void testIsInfiniteGetter() {
        assertTrue(Complex.INF.isInfinite());
        assertFalse(Complex.ONE.isInfinite());
    }

    // ---------------------------------------------------------------
    // multiply(Complex) / multiply(double)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplexNullThrows() {
        new Complex(1.0, 1.0).multiply((Complex) null);
    }

    @Test
    public void testMultiplyComplexNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.multiply(new Complex(1.0, 1.0))));
        assertTrue(Complex.NaN.equals(new Complex(1.0, 1.0).multiply(Complex.NaN)));
    }

    @Test
    public void testMultiplyComplexInfinite() {
        assertTrue(Complex.INF.equals(new Complex(1.0, 1.0).multiply(Complex.INF)));
        assertTrue(Complex.INF.equals(Complex.INF.multiply(new Complex(1.0, 1.0))));
    }

    @Test
    public void testMultiplyComplexNormal() {
        Complex result = new Complex(1.0, 2.0).multiply(new Complex(3.0, 4.0));
        // (1+2i)(3+4i) = (3-8) + (4+6)i = -5 + 10i
        assertEquals(-5.0, result.getReal(), DELTA);
        assertEquals(10.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testMultiplyDoubleNaN() {
        assertTrue(Complex.NaN.equals(new Complex(1.0, 1.0).multiply(Double.NaN)));
    }

    @Test
    public void testMultiplyDoubleInfinite() {
        assertTrue(Complex.INF.equals(new Complex(1.0, 1.0).multiply(Double.POSITIVE_INFINITY)));
    }

    @Test
    public void testMultiplyDoubleNormal() {
        Complex result = new Complex(2.0, 3.0).multiply(2.0);
        assertEquals(4.0, result.getReal(), DELTA);
        assertEquals(6.0, result.getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // negate()
    // ---------------------------------------------------------------

    @Test
    public void testNegateNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.negate()));
    }

    @Test
    public void testNegateNormal() {
        Complex c = new Complex(1.0, -2.0).negate();
        assertEquals(-1.0, c.getReal(), DELTA);
        assertEquals(2.0, c.getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // subtract(Complex) / subtract(double)
    // ---------------------------------------------------------------

    @Test(expected = NullArgumentException.class)
    public void testSubtractComplexNullThrows() {
        new Complex(1.0, 1.0).subtract((Complex) null);
    }

    @Test
    public void testSubtractComplexNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.subtract(new Complex(1.0, 1.0))));
        assertTrue(Complex.NaN.equals(new Complex(1.0, 1.0).subtract(Complex.NaN)));
    }

    @Test
    public void testSubtractComplexNormal() {
        Complex result = new Complex(5.0, 6.0).subtract(new Complex(2.0, 1.0));
        assertEquals(3.0, result.getReal(), DELTA);
        assertEquals(5.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testSubtractDoubleNaN() {
        assertTrue(Complex.NaN.equals(new Complex(1.0, 1.0).subtract(Double.NaN)));
    }

    @Test
    public void testSubtractDoubleNormal() {
        Complex result = new Complex(5.0, 6.0).subtract(2.0);
        assertEquals(3.0, result.getReal(), DELTA);
        assertEquals(6.0, result.getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // Trigonometric / exponential / logarithmic methods (NaN + normal path)
    // ---------------------------------------------------------------

    @Test
    public void testAcosNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.acos()));
    }

    @Test
    public void testAsinNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.asin()));
    }

    @Test
    public void testAtanNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.atan()));
    }

    @Test
    public void testCosNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.cos()));
    }

    @Test
    public void testCosNormal() {
        Complex result = new Complex(0.0, 0.0).cos();
        assertEquals(1.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testCoshNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.cosh()));
    }

    @Test
    public void testCoshNormal() {
        Complex result = new Complex(0.0, 0.0).cosh();
        assertEquals(1.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testExpNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.exp()));
    }

    @Test
    public void testExpNormal() {
        Complex result = new Complex(0.0, 0.0).exp();
        assertEquals(1.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testLogNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.log()));
    }

    @Test
    public void testLogNormal() {
        Complex result = new Complex(1.0, 0.0).log();
        assertEquals(0.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test(expected = NullArgumentException.class)
    public void testPowComplexNullThrows() {
        new Complex(1.0, 1.0).pow((Complex) null);
    }

    @Test
    public void testPowComplexNormal() {
        Complex result = Complex.ONE.pow(Complex.ONE);
        assertEquals(1.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testPowDoubleNormal() {
        Complex result = new Complex(2.0, 0.0).pow(2.0);
        assertEquals(4.0, result.getReal(), 1e-6);
        assertEquals(0.0, result.getImaginary(), 1e-6);
    }

    @Test
    public void testSinNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.sin()));
    }

    @Test
    public void testSinNormal() {
        Complex result = new Complex(0.0, 0.0).sin();
        assertEquals(0.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testSinhNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.sinh()));
    }

    @Test
    public void testSinhNormal() {
        Complex result = new Complex(0.0, 0.0).sinh();
        assertEquals(0.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testTanNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.tan()));
    }

    @Test
    public void testTanhNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.tanh()));
    }

    // ---------------------------------------------------------------
    // sqrt() / sqrt1z()
    // ---------------------------------------------------------------

    @Test
    public void testSqrtNaN() {
        assertTrue(Complex.NaN.equals(Complex.NaN.sqrt()));
    }

    @Test
    public void testSqrtZeroZero() {
        Complex result = new Complex(0.0, 0.0).sqrt();
        assertEquals(0.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testSqrtRealNonNegative() {
        Complex result = new Complex(4.0, 0.0).sqrt();
        assertEquals(2.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testSqrtRealNegative() {
        // real < 0.0 branch
        Complex result = new Complex(-4.0, 0.0).sqrt();
        // sqrt(-4) = 2i
        assertEquals(0.0, result.getReal(), DELTA);
        assertEquals(2.0, result.getImaginary(), DELTA);
    }

    @Test
    public void testSqrt1z() {
        // sqrt1z(0) = sqrt(1 - 0) = 1
        Complex result = new Complex(0.0, 0.0).sqrt1z();
        assertEquals(1.0, result.getReal(), DELTA);
        assertEquals(0.0, result.getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // getArgument()
    // ---------------------------------------------------------------

    @Test
    public void testGetArgumentPositiveQuadrant() {
        assertEquals(Math.PI / 4, new Complex(1.0, 1.0).getArgument(), DELTA);
    }

    @Test
    public void testGetArgumentNaN() {
        assertTrue(Double.isNaN(new Complex(Double.NaN, 1.0).getArgument()));
    }

    @Test
    public void testGetArgumentZero() {
        assertEquals(0.0, new Complex(0.0, 0.0).getArgument(), DELTA);
    }

    // ---------------------------------------------------------------
    // nthRoot()
    // ---------------------------------------------------------------

    @Test(expected = NotPositiveException.class)
    public void testNthRootZeroThrows() {
        new Complex(1.0, 1.0).nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRootNegativeThrows() {
        new Complex(1.0, 1.0).nthRoot(-1);
    }

    @Test
    public void testNthRootNaN() {
        List<Complex> roots = Complex.NaN.nthRoot(2);
        assertEquals(1, roots.size());
        assertTrue(Complex.NaN.equals(roots.get(0)));
    }

    @Test
    public void testNthRootInfinite() {
        List<Complex> roots = Complex.INF.nthRoot(3);
        assertEquals(1, roots.size());
        assertTrue(Complex.INF.equals(roots.get(0)));
    }

    @Test
    public void testNthRootNormalUnity() {
        // 4th roots of 1+0i -> {1, i, -1, -i}
        List<Complex> roots = new Complex(1.0, 0.0).nthRoot(4);
        assertEquals(4, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), DELTA);
        assertEquals(0.0, roots.get(0).getImaginary(), DELTA);
        assertEquals(0.0, roots.get(1).getReal(), DELTA);
        assertEquals(1.0, roots.get(1).getImaginary(), DELTA);
        assertEquals(-1.0, roots.get(2).getReal(), DELTA);
        assertEquals(0.0, roots.get(2).getImaginary(), DELTA);
        assertEquals(0.0, roots.get(3).getReal(), DELTA);
        assertEquals(-1.0, roots.get(3).getImaginary(), DELTA);
    }

    @Test
    public void testNthRootSingleRoot() {
        // n = 1 -> loop runs exactly once
        List<Complex> roots = new Complex(2.0, 0.0).nthRoot(1);
        assertEquals(1, roots.size());
        assertEquals(2.0, roots.get(0).getReal(), DELTA);
        assertEquals(0.0, roots.get(0).getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // valueOf()
    // ---------------------------------------------------------------

    @Test
    public void testValueOfTwoArgsRealNaN() {
        assertTrue(Complex.NaN.equals(Complex.valueOf(Double.NaN, 1.0)));
    }

    @Test
    public void testValueOfTwoArgsImaginaryNaN() {
        assertTrue(Complex.NaN.equals(Complex.valueOf(1.0, Double.NaN)));
    }

    @Test
    public void testValueOfTwoArgsNormal() {
        Complex c = Complex.valueOf(1.0, 2.0);
        assertEquals(1.0, c.getReal(), DELTA);
        assertEquals(2.0, c.getImaginary(), DELTA);
    }

    @Test
    public void testValueOfOneArgNaN() {
        assertTrue(Complex.NaN.equals(Complex.valueOf(Double.NaN)));
    }

    @Test
    public void testValueOfOneArgNormal() {
        Complex c = Complex.valueOf(5.0);
        assertEquals(5.0, c.getReal(), DELTA);
        assertEquals(0.0, c.getImaginary(), DELTA);
    }

    // ---------------------------------------------------------------
    // readResolve() / getField() / toString() / createComplex()
    // ---------------------------------------------------------------

    @Test
    public void testReadResolve() {
        Complex c = new Complex(1.0, 2.0);
        Object resolved = c.readResolve();
        assertTrue(resolved instanceof Complex);
        Complex rc = (Complex) resolved;
        assertEquals(1.0, rc.getReal(), DELTA);
        assertEquals(2.0, rc.getImaginary(), DELTA);
    }

    @Test
    public void testGetField() {
        assertNotNull(new Complex(1.0, 1.0).getField());
    }

    @Test
    public void testToString() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals("(1.0, 2.0)", c.toString());
    }

    @Test
    public void testCreateComplex() {
        Complex c = new Complex(0.0, 0.0).createComplex(3.0, 4.0);
        assertEquals(3.0, c.getReal(), DELTA);
        assertEquals(4.0, c.getImaginary(), DELTA);
    }
}
