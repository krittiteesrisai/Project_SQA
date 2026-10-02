package org.apache.commons.math.complex;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NotPositiveException;
import org.junit.Test;

/**
 * JUnit4 test suite for org.apache.commons.math.complex.Complex
 * เป้าหมาย: ครอบคลุม branch/condition ให้ได้มากที่สุดเท่าที่วิเคราะห์ได้จากซอร์สโค้ด
 */
public class ComplexTest {

    private static final double EPS = 1e-9;

    // ---------- Constructor / isNaN / isInfinite ----------

    @Test
    public void testConstructor_NormalValues() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals(1.0, c.getReal(), EPS);
        assertEquals(2.0, c.getImaginary(), EPS);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
    }

    @Test
    public void testConstructor_NaNRealOrImaginary() {
        Complex c1 = new Complex(Double.NaN, 1.0);
        assertTrue(c1.isNaN());
        assertFalse(c1.isInfinite()); // isInfinite = !isNaN && ... -> false because isNaN true

        Complex c2 = new Complex(1.0, Double.NaN);
        assertTrue(c2.isNaN());
    }

    @Test
    public void testConstructor_Infinite() {
        Complex c = new Complex(Double.POSITIVE_INFINITY, 1.0);
        assertFalse(c.isNaN());
        assertTrue(c.isInfinite());

        Complex c2 = new Complex(1.0, Double.NEGATIVE_INFINITY);
        assertTrue(c2.isInfinite());
    }

    @Test
    public void testSingleArgConstructor() {
        Complex c = new Complex(5.0);
        assertEquals(5.0, c.getReal(), EPS);
        assertEquals(0.0, c.getImaginary(), EPS);
    }

    // ---------- abs() ----------

    @Test
    public void testAbs_NaN() {
        assertTrue(Double.isNaN(Complex.NaN.abs()));
    }

    @Test
    public void testAbs_Infinite() {
        assertEquals(Double.POSITIVE_INFINITY, Complex.INF.abs(), 0.0);
    }

    @Test
    public void testAbs_RealZero_ImaginaryGreater() {
        // |real| < |imaginary|, imaginary != 0 -> general formula branch
        Complex c = new Complex(0.0, 5.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_ImaginaryZero_BranchRealLessImag_False_RealZero() {
        // real==0 branch inside else (|real|>=|imaginary|)
        Complex c = new Complex(0.0, 0.0);
        assertEquals(0.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_GeneralBothNonZero_RealGreater() {
        Complex c = new Complex(3.0, 4.0);
        assertEquals(5.0, c.abs(), EPS);
    }

    @Test
    public void testAbs_ImaginaryZero_RealNonZero() {
        // |real|<|imaginary| false, goes to else branch, real!=0
        Complex c = new Complex(3.0, 0.0);
        assertEquals(3.0, c.abs(), EPS);
    }

    // ---------- add(Complex) ----------

    @Test(expected = NullArgumentException.class)
    public void testAddComplex_NullThrows() {
        new Complex(1, 1).add((Complex) null);
    }

    @Test
    public void testAddComplex_ThisNaN() {
        Complex r = Complex.NaN.add(new Complex(1, 1));
        assertTrue(r.isNaN());
    }

    @Test
    public void testAddComplex_AddendNaN() {
        Complex r = new Complex(1, 1).add(Complex.NaN);
        assertTrue(r.isNaN());
    }

    @Test
    public void testAddComplex_Normal() {
        Complex r = new Complex(1, 2).add(new Complex(3, 4));
        assertEquals(4.0, r.getReal(), EPS);
        assertEquals(6.0, r.getImaginary(), EPS);
    }

    // ---------- add(double) ----------

    @Test
    public void testAddDouble_ThisNaN() {
        assertTrue(Complex.NaN.add(1.0).isNaN());
    }

    @Test
    public void testAddDouble_ArgNaN() {
        assertTrue(new Complex(1, 1).add(Double.NaN).isNaN());
    }

    @Test
    public void testAddDouble_Normal() {
        Complex r = new Complex(1, 2).add(3.0);
        assertEquals(4.0, r.getReal(), EPS);
        assertEquals(2.0, r.getImaginary(), EPS);
    }

    // ---------- conjugate() ----------

    @Test
    public void testConjugate_NaN() {
        assertTrue(Complex.NaN.conjugate().isNaN());
    }

    @Test
    public void testConjugate_Normal() {
        Complex r = new Complex(1, 2).conjugate();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(-2.0, r.getImaginary(), EPS);
    }

    // ---------- divide(Complex) ----------

    @Test(expected = NullArgumentException.class)
    public void testDivideComplex_NullThrows() {
        new Complex(1, 1).divide((Complex) null);
    }

    @Test
    public void testDivideComplex_ThisOrDivisorNaN() {
        assertTrue(Complex.NaN.divide(new Complex(1, 1)).isNaN());
        assertTrue(new Complex(1, 1).divide(Complex.NaN).isNaN());
    }

    @Test
    public void testDivideComplex_DivisorZero() {
        Complex r = new Complex(1, 1).divide(Complex.ZERO);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideComplex_DivisorInfiniteThisFinite() {
        Complex r = new Complex(1, 1).divide(Complex.INF);
        assertEquals(Complex.ZERO, r);
    }

    @Test
    public void testDivideComplex_BothInfinite() {
        Complex r = Complex.INF.divide(Complex.INF);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideComplex_AbsCLessThanAbsD() {
        // divisor (1,2): |c|=1 < |d|=2
        Complex r = new Complex(1, 1).divide(new Complex(1, 2));
        assertFalse(r.isNaN());
        assertFalse(r.isInfinite());
    }

    @Test
    public void testDivideComplex_AbsCGreaterEqualAbsD() {
        // divisor (2,1): |c|=2 >= |d|=1
        Complex r = new Complex(1, 1).divide(new Complex(2, 1));
        assertFalse(r.isNaN());
        assertFalse(r.isInfinite());
    }

    // ---------- divide(double) ----------

    @Test
    public void testDivideDouble_NaN() {
        assertTrue(Complex.NaN.divide(2.0).isNaN());
        assertTrue(new Complex(1, 1).divide(Double.NaN).isNaN());
    }

    @Test
    public void testDivideDouble_ZeroDivisor() {
        assertTrue(new Complex(1, 1).divide(0.0).isNaN());
    }

    @Test
    public void testDivideDouble_InfiniteDivisor_ThisFinite() {
        Complex r = new Complex(1, 1).divide(Double.POSITIVE_INFINITY);
        assertEquals(Complex.ZERO, r);
    }

    @Test
    public void testDivideDouble_InfiniteDivisor_ThisInfinite() {
        Complex r = Complex.INF.divide(Double.POSITIVE_INFINITY);
        assertTrue(r.isNaN());
    }

    @Test
    public void testDivideDouble_Normal() {
        Complex r = new Complex(4, 2).divide(2.0);
        assertEquals(2.0, r.getReal(), EPS);
        assertEquals(1.0, r.getImaginary(), EPS);
    }

    // ---------- reciprocal() ----------

    @Test
    public void testReciprocal_NaN() {
        assertTrue(Complex.NaN.reciprocal().isNaN());
    }

    @Test
    public void testReciprocal_ZeroZero() {
        assertTrue(Complex.ZERO.reciprocal().isNaN());
    }

    @Test
    public void testReciprocal_Infinite() {
        assertEquals(Complex.ZERO, Complex.INF.reciprocal());
    }

    @Test
    public void testReciprocal_AbsRealLessThanImaginary() {
        Complex r = new Complex(1, 2).reciprocal();
        assertFalse(r.isNaN());
    }

    @Test
    public void testReciprocal_AbsRealGreaterEqualImaginary() {
        Complex r = new Complex(2, 1).reciprocal();
        assertFalse(r.isNaN());
    }

    // ---------- equals() ----------

    @Test
    public void testEquals_SameReference() {
        Complex c = new Complex(1, 1);
        assertTrue(c.equals(c));
    }

    @Test
    public void testEquals_OtherIsNaN_ThisNot() {
        Complex c = new Complex(1, 2);
        assertFalse(c.equals(Complex.NaN));
    }

    @Test
    public void testEquals_BothNaN() {
        assertTrue(Complex.NaN.equals(new Complex(Double.NaN, 5.0)));
    }

    @Test
    public void testEquals_NotInstance() {
        Complex c = new Complex(1, 1);
        assertFalse(c.equals("not a complex"));
    }

    @Test
    public void testEquals_NullObject() {
        Complex c = new Complex(1, 1);
        assertFalse(c.equals(null));
    }

    @Test
    public void testEquals_EqualParts() {
        assertTrue(new Complex(1, 2).equals(new Complex(1, 2)));
    }

    @Test
    public void testEquals_DifferentParts() {
        assertFalse(new Complex(1, 2).equals(new Complex(1, 3)));
    }

    // ---------- hashCode() ----------

    @Test
    public void testHashCode_NaN() {
        assertEquals(7, Complex.NaN.hashCode());
    }

    @Test
    public void testHashCode_Normal() {
        Complex c = new Complex(1, 2);
        assertNotNull(c.hashCode()); // just ensure no crash, deterministic value
    }

    // ---------- getters / isNaN / isInfinite ----------

    @Test
    public void testGettersAndFlags() {
        Complex c = new Complex(3.5, -2.5);
        assertEquals(3.5, c.getReal(), EPS);
        assertEquals(-2.5, c.getImaginary(), EPS);
        assertFalse(c.isNaN());
        assertFalse(c.isInfinite());
    }

    // ---------- multiply(Complex) ----------

    @Test(expected = NullArgumentException.class)
    public void testMultiplyComplex_NullThrows() {
        new Complex(1, 1).multiply((Complex) null);
    }

    @Test
    public void testMultiplyComplex_NaN() {
        assertTrue(Complex.NaN.multiply(new Complex(1, 1)).isNaN());
        assertTrue(new Complex(1, 1).multiply(Complex.NaN).isNaN());
    }

    @Test
    public void testMultiplyComplex_InfiniteThis() {
        Complex r = Complex.INF.multiply(new Complex(1, 1));
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyComplex_InfiniteFactor() {
        Complex r = new Complex(1, 1).multiply(Complex.INF);
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyComplex_Normal() {
        Complex r = new Complex(1, 2).multiply(new Complex(3, 4));
        // (1+2i)(3+4i) = (3-8) + (4+6)i = -5+10i
        assertEquals(-5.0, r.getReal(), EPS);
        assertEquals(10.0, r.getImaginary(), EPS);
    }

    // ---------- multiply(int) ----------

    @Test
    public void testMultiplyInt_NaN() {
        assertTrue(Complex.NaN.multiply(3).isNaN());
    }

    @Test
    public void testMultiplyInt_Infinite() {
        assertEquals(Complex.INF, Complex.INF.multiply(2));
    }

    @Test
    public void testMultiplyInt_Normal() {
        Complex r = new Complex(2, 3).multiply(2);
        assertEquals(4.0, r.getReal(), EPS);
        assertEquals(6.0, r.getImaginary(), EPS);
    }

    // ---------- multiply(double) ----------

    @Test
    public void testMultiplyDouble_NaN() {
        assertTrue(Complex.NaN.multiply(2.0).isNaN());
        assertTrue(new Complex(1, 1).multiply(Double.NaN).isNaN());
    }

    @Test
    public void testMultiplyDouble_InfiniteThis() {
        assertEquals(Complex.INF, Complex.INF.multiply(2.0));
    }

    @Test
    public void testMultiplyDouble_InfiniteFactor() {
        Complex r = new Complex(1, 1).multiply(Double.POSITIVE_INFINITY);
        assertEquals(Complex.INF, r);
    }

    @Test
    public void testMultiplyDouble_Normal() {
        Complex r = new Complex(2, 3).multiply(2.0);
        assertEquals(4.0, r.getReal(), EPS);
        assertEquals(6.0, r.getImaginary(), EPS);
    }

    // ---------- negate() ----------

    @Test
    public void testNegate_NaN() {
        assertTrue(Complex.NaN.negate().isNaN());
    }

    @Test
    public void testNegate_Normal() {
        Complex r = new Complex(1, -2).negate();
        assertEquals(-1.0, r.getReal(), EPS);
        assertEquals(2.0, r.getImaginary(), EPS);
    }

    // ---------- subtract(Complex) ----------

    @Test(expected = NullArgumentException.class)
    public void testSubtractComplex_NullThrows() {
        new Complex(1, 1).subtract((Complex) null);
    }

    @Test
    public void testSubtractComplex_NaN() {
        assertTrue(Complex.NaN.subtract(new Complex(1, 1)).isNaN());
        assertTrue(new Complex(1, 1).subtract(Complex.NaN).isNaN());
    }

    @Test
    public void testSubtractComplex_Normal() {
        Complex r = new Complex(5, 6).subtract(new Complex(1, 2));
        assertEquals(4.0, r.getReal(), EPS);
        assertEquals(4.0, r.getImaginary(), EPS);
    }

    // ---------- subtract(double) ----------

    @Test
    public void testSubtractDouble_NaN() {
        assertTrue(Complex.NaN.subtract(1.0).isNaN());
        assertTrue(new Complex(1, 1).subtract(Double.NaN).isNaN());
    }

    @Test
    public void testSubtractDouble_Normal() {
        Complex r = new Complex(5, 6).subtract(2.0);
        assertEquals(3.0, r.getReal(), EPS);
        assertEquals(6.0, r.getImaginary(), EPS);
    }

    // ---------- trig / exp / log / pow (isNaN branch + sanity of normal path) ----------

    @Test
    public void testAcos_NaN() {
        assertTrue(Complex.NaN.acos().isNaN());
    }

    @Test
    public void testAcos_Normal_DoesNotThrow() {
        Complex r = new Complex(0.5, 0.0).acos();
        assertFalse(Double.isNaN(r.getReal()));
    }

    @Test
    public void testAsin_NaN() {
        assertTrue(Complex.NaN.asin().isNaN());
    }

    @Test
    public void testAtan_NaN() {
        assertTrue(Complex.NaN.atan().isNaN());
    }

    @Test
    public void testCos_NaN() {
        assertTrue(Complex.NaN.cos().isNaN());
    }

    @Test
    public void testCos_Normal() {
        Complex r = new Complex(0.0, 0.0).cos();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testCosh_NaN() {
        assertTrue(Complex.NaN.cosh().isNaN());
    }

    @Test
    public void testCosh_Normal() {
        Complex r = new Complex(0.0, 0.0).cosh();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testExp_NaN() {
        assertTrue(Complex.NaN.exp().isNaN());
    }

    @Test
    public void testExp_Normal() {
        Complex r = new Complex(0.0, 0.0).exp();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testLog_NaN() {
        assertTrue(Complex.NaN.log().isNaN());
    }

    @Test
    public void testLog_Normal() {
        Complex r = new Complex(1.0, 0.0).log();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test(expected = NullArgumentException.class)
    public void testPowComplex_NullThrows() {
        new Complex(1, 1).pow((Complex) null);
    }

    @Test
    public void testPowComplex_Normal() {
        Complex r = new Complex(2.0, 0.0).pow(new Complex(2.0, 0.0));
        assertEquals(4.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    @Test
    public void testPowDouble_Normal() {
        Complex r = new Complex(2.0, 0.0).pow(2.0);
        assertEquals(4.0, r.getReal(), 1e-6);
        assertEquals(0.0, r.getImaginary(), 1e-6);
    }

    @Test
    public void testSin_NaN() {
        assertTrue(Complex.NaN.sin().isNaN());
    }

    @Test
    public void testSin_Normal() {
        Complex r = new Complex(0.0, 0.0).sin();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSinh_NaN() {
        assertTrue(Complex.NaN.sinh().isNaN());
    }

    @Test
    public void testSinh_Normal() {
        Complex r = new Complex(0.0, 0.0).sinh();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------- sqrt() ----------

    @Test
    public void testSqrt_NaN() {
        assertTrue(Complex.NaN.sqrt().isNaN());
    }

    @Test
    public void testSqrt_ZeroZero() {
        Complex r = Complex.ZERO.sqrt();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_RealPositive() {
        // real >= 0 branch
        Complex r = new Complex(4.0, 0.0).sqrt();
        assertEquals(2.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testSqrt_RealNegative() {
        // real < 0 branch
        Complex r = new Complex(-4.0, 0.0).sqrt();
        assertEquals(0.0, r.getReal(), 1e-6);
        assertEquals(2.0, r.getImaginary(), 1e-6);
    }

    @Test
    public void testSqrt1z_Normal() {
        Complex r = new Complex(0.0, 0.0).sqrt1z();
        assertEquals(1.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------- tan() / tanh() ----------

    @Test
    public void testTan_NaN() {
        assertTrue(Complex.NaN.tan().isNaN());
    }

    @Test
    public void testTan_Normal() {
        Complex r = new Complex(0.0, 0.0).tan();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    @Test
    public void testTanh_NaN() {
        assertTrue(Complex.NaN.tanh().isNaN());
    }

    @Test
    public void testTanh_Normal() {
        Complex r = new Complex(0.0, 0.0).tanh();
        assertEquals(0.0, r.getReal(), EPS);
        assertEquals(0.0, r.getImaginary(), EPS);
    }

    // ---------- getArgument() ----------

    @Test
    public void testGetArgument_Normal() {
        Complex c = new Complex(1.0, 1.0);
        assertEquals(Math.PI / 4.0, c.getArgument(), EPS);
    }

    @Test
    public void testGetArgument_NaN() {
        assertTrue(Double.isNaN(Complex.NaN.getArgument()));
    }

    // ---------- nthRoot(int) ----------

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_ZeroThrows() {
        new Complex(1, 1).nthRoot(0);
    }

    @Test(expected = NotPositiveException.class)
    public void testNthRoot_NegativeThrows() {
        new Complex(1, 1).nthRoot(-3);
    }

    @Test
    public void testNthRoot_NaNInput() {
        List<Complex> roots = Complex.NaN.nthRoot(3);
        assertEquals(1, roots.size());
        assertTrue(roots.get(0).isNaN());
    }

    @Test
    public void testNthRoot_InfiniteInput() {
        List<Complex> roots = Complex.INF.nthRoot(3);
        assertEquals(1, roots.size());
        assertEquals(Complex.INF, roots.get(0));
    }

    @Test
    public void testNthRoot_NormalLoopMultipleIterations() {
        // n=3 -> loop body executes 3 times, covers for-loop fully
        List<Complex> roots = new Complex(1.0, 0.0).nthRoot(3);
        assertEquals(3, roots.size());
        for (Complex c : roots) {
            assertFalse(c.isNaN());
            assertFalse(c.isInfinite());
        }
    }

    @Test
    public void testNthRoot_SquareRootOfOne() {
        List<Complex> roots = new Complex(1.0, 0.0).nthRoot(2);
        assertEquals(2, roots.size());
        assertEquals(1.0, roots.get(0).getReal(), EPS);
        assertEquals(0.0, roots.get(0).getImaginary(), EPS);
        assertEquals(-1.0, roots.get(1).getReal(), EPS);
        assertEquals(0.0, roots.get(1).getImaginary(), 1e-9);
    }

    // ---------- valueOf(double,double) / valueOf(double) ----------

    @Test
    public void testValueOf_DoubleDouble_RealNaN() {
        Complex c = Complex.valueOf(Double.NaN, 1.0);
        assertSame(Complex.NaN, c);
    }

    @Test
    public void testValueOf_DoubleDouble_ImaginaryNaN() {
        Complex c = Complex.valueOf(1.0, Double.NaN);
        assertSame(Complex.NaN, c);
    }

    @Test
    public void testValueOf_DoubleDouble_Normal() {
        Complex c = Complex.valueOf(2.0, 3.0);
        assertEquals(2.0, c.getReal(), EPS);
        assertEquals(3.0, c.getImaginary(), EPS);
    }

    @Test
    public void testValueOf_Double_NaN() {
        Complex c = Complex.valueOf(Double.NaN);
        assertSame(Complex.NaN, c);
    }

    @Test
    public void testValueOf_Double_Normal() {
        Complex c = Complex.valueOf(5.0);
        assertEquals(5.0, c.getReal(), EPS);
        assertEquals(0.0, c.getImaginary(), EPS);
    }

    // ---------- toString() / getField() ----------

    @Test
    public void testToString_Format() {
        Complex c = new Complex(1.0, 2.0);
        assertEquals("(1.0, 2.0)", c.toString());
    }

    @Test
    public void testGetField_NotNull() {
        Complex c = new Complex(1.0, 2.0);
        assertNotNull(c.getField());
    }
}
